package gac.freecycle;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

/**
 * Created by demouser on 8/15/13.
 */
public class BrowsingFragment extends Fragment{



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Context c = getActivity().getApplicationContext();
        View v = inflater.inflate(R.layout.browsing_fragment, container, false);
        GridView cybar_list = (GridView) v.findViewById(R.id.cybar_list);

//        cybar_list.setAdapter(Functions.BASE_ADAPTOR);


        return v;
    }
}
