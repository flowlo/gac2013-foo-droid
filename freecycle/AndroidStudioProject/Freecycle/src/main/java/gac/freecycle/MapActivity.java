package gac.freecycle;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;


public class MapActivity extends Activity implements GoogleMap.OnMapClickListener {

    public static GoogleMap map;
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_map);

        map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map))
                .getMap();

        if (map != null) {
            LatLng zoomPosition = new LatLng(45, 26);
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(zoomPosition, 5));
            map.animateCamera(CameraUpdateFactory.newLatLngZoom(zoomPosition,
                    10));
            map.setMyLocationEnabled(true);
            map.setMapType(GoogleMap.MAP_TYPE_HYBRID);

        }
    }
    @Override
    public void onMapClick(LatLng coord){


    }
}