package com.example.fiqhrimuliandaputr.petaipb;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng ipb = new LatLng(-6.5541, 106.7235);
        mMap.addMarker(new MarkerOptions().position(ipb).title("Marker in IPB"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ipb));

        LatLng fmipa = new LatLng(-6.557657, 106.731301);
        mMap.addMarker(new MarkerOptions().position(fmipa).title("Lokasi FMIPA"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(fmipa));

        LatLng fapet = new LatLng(-6.560530, 106.730406);
        mMap.addMarker(new MarkerOptions().position(fapet).title("Lokasi GWW"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(fapet));

        LatLng CCR = new LatLng( -6.556069, 106.731038);
        mMap.addMarker(new MarkerOptions().position(CCR).title("Lokasi CCR"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(CCR));

        LatLng gimipb = new LatLng(-6.557220, 106.732530);
        mMap.addMarker(new MarkerOptions().position(gimipb).title("Lokasi Gymnasium IPB"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(gimipb));

        LatLng rektorat = new LatLng(-6.560375, 106.725824);
        mMap.addMarker(new MarkerOptions().position(rektorat).title("Lokasi Rektorat"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rektorat));

        //mMap.animateCamera(CameraUpdateFactory.zoomBy(11));
    }
}
