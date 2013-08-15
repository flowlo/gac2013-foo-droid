package gac.freecycle;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.app.SearchManager;
import android.content.Context;
import android.os.Bundle;
import android.app.Activity;
import android.app.Fragment;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

public class BrowsingActivity extends Activity {

    // TODO: change values to match categories
    static String[] values = new String[]{"Android", "iPhone", "Android", "iPhone", "WindowsMobile", "Android", "iPhone", "WindowsMobile", "Android", "iPhone", "WindowsMobile"};

    public static View.OnClickListener imgButtonHandler = new View.OnClickListener() {
        public void onClick(View v) {
            v.setBackgroundResource(R.drawable.ic_launcher);
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browsing);

        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionBar.setDisplayShowTitleEnabled(true);

        actionBar.addTab(actionBar.newTab().setText("Latest").setTabListener(new TabListener<Fragment>(this, "tag", Fragment.class)));
        actionBar.addTab(actionBar.newTab().setText("Nearest").setTabListener(new TabListener<Fragment>(this, "tag", Fragment.class)));
        actionBar.addTab(actionBar.newTab().setText("Recommended").setTabListener(new TabListener<Fragment>(this, "tag", Fragment.class)));

        // Cybar list view
        BaseAdapter base_adaptor = new BaseAdapter() {
            @Override
            public int getCount() {
                return values.length;
            }

            @Override
            public String getItem(int i) {
                return values[i];

            }

            @Override
            public long getItemId(int i) {
                return 0;
            }

            @Override
            public View getView(int i, View view, ViewGroup viewGroup) {

                View mView = getLayoutInflater().inflate(R.layout.cybar_item, viewGroup, false);
                ImageView img = (ImageView) mView.findViewById(R.id.cybar_image);
                TextView category_text = (TextView) mView.findViewById(R.id.cybar_description);
                img.setImageResource(R.drawable.ic_launcher);
                category_text.setText(values[i]);
                mView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getApplicationContext(), "Test_click", Toast.LENGTH_SHORT).show();

                    }
                });
                return mView;
            }
        };
        GridView cybar_list = (GridView) findViewById(R.id.cybar_list);
        cybar_list.setAdapter(base_adaptor);

        cybar_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Intent intent = new Intent(HomeActivity.this, BrowsingActivity.class);
//                startActivity(intent);
                Toast.makeText(getApplicationContext(), "test", Toast.LENGTH_SHORT).show();
            }
        });

        DrawerHelper.attachDrawer(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.browsing, menu);
        // Get the SearchView and set the searchable configuration
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView = (SearchView) menu.findItem(R.id.browse_search_button).getActionView();
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        searchView.setIconifiedByDefault(true); // Do not iconify the widget; expand it by default

        return true;
    }

    public static class TabListener<T extends Fragment> implements ActionBar.TabListener {
        private Fragment mFragment;
        private final Activity mActivity;
        private final String mTag;
        private final Class<T> mClass;

        /**
         * Constructor used each time a new tab is created.
         *
         * @param activity The host Activity, used to instantiate the fragment
         * @param tag      The identifier tag for the fragment
         * @param clz      The fragment's Class, used to instantiate the fragment
         */
        public TabListener(Activity activity, String tag, Class<T> clz) {
            mActivity = activity;
            mTag = tag;
            mClass = clz;
        }

        /* The following are each of the ActionBar.TabListener callbacks */

        public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
            // Check if the fragment is already initialized
            if (mFragment == null) {
                // If not, instantiate and add it to the activity
                mFragment = Fragment.instantiate(mActivity, mClass.getName());
                ft.add(android.R.id.content, mFragment, mTag);
            } else {
                // If it exists, simply attach it in order to show it
                ft.attach(mFragment);
            }
        }

        public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
            if (mFragment != null) {
                // Detach the fragment, because another one is being attached
                ft.detach(mFragment);
            }
        }

        public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {
            // User selected the already selected tab. Usually do nothing.
        }
    }
}
