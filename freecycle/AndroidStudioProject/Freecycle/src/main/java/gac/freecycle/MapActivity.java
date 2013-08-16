package gac.freecycle;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.SurfaceHolder;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;

import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;


public class MapActivity extends Activity implements GoogleMap.OnMapClickListener, LocationListener{

    public static GoogleMap map;
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_map);

           map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map))
                   .getMap();

        if (map != null) {

            map.setMyLocationEnabled(true);
            map.setMapType(GoogleMap.MAP_TYPE_HYBRID);
            LatLng currentCoord = new LatLng(51.49636,-0.14308);
            map.addMarker((new MarkerOptions().position(currentCoord))
                                  .snippet("Population: 4,137,400")
                            );
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(currentCoord, 10));
            map.animateCamera(CameraUpdateFactory.newLatLngZoom(currentCoord,
                    10));




            map.setMyLocationEnabled(true);
            String [] Points ={"51.98,0.5", "50, 1"};
            for (String item : Points)
            {
                String [] coord = item.split(",");
                MarkerOptions marker = new MarkerOptions().position(new LatLng(Double.parseDouble(coord[0]), Double.parseDouble(coord[1])));
                map.addMarker(marker);
                Toast.makeText(getApplicationContext(), coord[0], Toast.LENGTH_LONG);

                }
            }
        }
    @Override
    public void onProviderDisabled(String provider) {
        Log.d("GPS", "disable");
    }

    @Override
    public void onProviderEnabled(String provider) {
        Log.d("GPS", "enable");
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {
        Log.d("GPS", "status");
    }

        private void buildAlertMessageNoGps() {

            final AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Your GPS is disabled, do you want to enable it?")
                    .setCancelable(false)
                    .setPositiveButton("Yes",new DialogInterface.OnClickListener() {
                        public void onClick(final DialogInterface dialog, final int id) {
                            startActivity(new Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS));
                        }
                    })
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        public void onClick(final DialogInterface dialog, final int id) {
                            dialog.cancel();
                        }
                    });

            final AlertDialog alert = builder.create();
            alert.show();
        }
    @Override
    public void onMapClick(LatLng coord){




    }


    @Override
    protected void onPause(){
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();

    }


    @Override
    public void onLocationChanged(Location location) {


    }






}