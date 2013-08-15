package gac.freecycle;

import android.app.Activity;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class DrawerHelper {
    static final String[] categoryNames = { "Clothing", "Garden", "Pets", "Toys and Games", "Books", "Entertainment", "Vehicles", "Education", "Baby Accessories"};
    static final int[] categoryIcons = { R.drawable.clothing, R.drawable.garden, R.drawable.pets, R.drawable.toysandgames, R.drawable.books, R.drawable.entertainment, R.drawable.motors, R.drawable.education, R.drawable.baby};
    public static void attachDrawer(final Activity activity) {
        final ListView listView = (ListView)activity.findViewById(R.id.left_drawer);

        listView.setAdapter(new CategoryAdapter(activity));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Functions.CATEGORY_ID = position;
//                ((DrawerLayout)activity.findViewById(R.id.drawer_layout)).closeDrawer(listView);
            }
        });
    }

    private static class CategoryAdapter extends BaseAdapter {
        private Activity activity = null;

        public CategoryAdapter(Activity activity) {
            this.activity = activity;
        }

        @Override
        public int getCount() {
            return categoryNames.length;
        }

        @Override
        public Object getItem(int position) {
            return "getItem";
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View mView = activity.getLayoutInflater().inflate(R.layout.drawer_list_item, parent, false);
            ImageView img = (ImageView) mView.findViewById(R.id.category_image);
            TextView category_text = (TextView) mView.findViewById(R.id.category_name);
            img.setImageResource(categoryIcons[position]);
            category_text.setText(categoryNames[position]);

            return mView;
        }
    };
}
