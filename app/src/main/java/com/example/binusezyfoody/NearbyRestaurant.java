package com.example.binusezyfoody;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NearbyRestaurant extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    ArrayList<LatLng>arrayList = new ArrayList<LatLng>();
    LatLng sydney = new LatLng(-34, 151);
    LatLng storeAlsut = new LatLng(-6.230888, 106.658445);
    LatLng storeJakbar = new LatLng(-6.191707, 106.782424);
    LatLng storeJaksel = new LatLng(-6.283210, 106.796179);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nearby_restaurant);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        arrayList.add(storeAlsut);
        arrayList.add(storeJakbar);
        arrayList.add(storeJaksel);
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
        Map<String, LatLng > storeName = new HashMap<>();
       ArrayList<String> storeLoc = new ArrayList<>();

       storeLoc.add("Alam Sutera");
        storeLoc.add("Jakarta Barat");
        storeLoc.add("Jakarta Selatan");



           // storeName.put("Alsut", storeJakbar);
           // storeName.put("Jakarta Barat", storeJakbar);
           // storeName.put("Jakarta Selatan", storeJaksel);




       for (int i=0;i<arrayList.size();i++){
           mMap.addMarker(new MarkerOptions().position(arrayList.get(i)).title("Store "+storeLoc.get(i)));
           mMap.animateCamera(CameraUpdateFactory.zoomTo(25));
           mMap.moveCamera(CameraUpdateFactory.newLatLng(arrayList.get(i)));
       }
    }
}