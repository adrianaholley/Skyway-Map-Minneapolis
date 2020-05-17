package com.adriapolis.skywaymappgoogle

import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.libraries.places.api.Places
import java.util.*


class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    var MY_LOCATION_REQUEST_CODE: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)

        // Initialize the SDK
        Places.initialize(applicationContext, R.string.api_key_release.toString())


        // Create a new Places client instance
        val placesClient = Places.createClient(this)


        // Status bar
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            val w = window
            w.setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
            )
        }

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        actuallyDrawAreas()
        setPoiClick(mMap)
        setMapLongClick(mMap)
        setMapClick(mMap)

        // Move the camera to Minneapolis
        val minneapolis = LatLng(44.9778576, -93.2714283)
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(minneapolis, 15f))

        if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION)
            == PackageManager.PERMISSION_GRANTED) {
            mMap.isMyLocationEnabled = true

        } else {
            // Show rationale and request permission.
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION), MY_LOCATION_REQUEST_CODE)
        }
        mMap.setPadding(0,42,0,0)

    }

    // Receive the permissions request result
    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        if (requestCode == MY_LOCATION_REQUEST_CODE) {
            if (permissions.size == 1 &&
                permissions[0] == android.Manifest.permission.ACCESS_FINE_LOCATION &&
                grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                mMap.isMyLocationEnabled = true
            } else {
                // Permission was denied. Display an error message.
            }
        }
    }

    private fun setPoiClick(map: GoogleMap) {
        map.setOnPoiClickListener { poi ->
            mMap.clear()
            actuallyDrawAreas()
            val poiMarker = map.addMarker(
                MarkerOptions()
                    .position(poi.latLng)
                    .title(poi.name)
//                    .icon(Bitic_launmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
            )
            poiMarker.showInfoWindow()
//          poiMarker.setTag(getString(R.string.poi))
        }
    }

    private fun setMapLongClick(map: GoogleMap) {

        map.setOnMapLongClickListener { latLng ->
            var snippet = String.format(Locale.getDefault(),
                getString(R.string.lat_long_snipppet),
                latLng.latitude,
                latLng.longitude)
            mMap.clear()
            actuallyDrawAreas()
            map.addMarker(MarkerOptions()
                .position(latLng)
                .title(getString(R.string.dropped_pin))
                .snippet(snippet)
//                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
            )
        }
    }

    private fun setMapClick(map: GoogleMap) {
        map.setOnMapClickListener {
            mMap.clear()
            actuallyDrawAreas()
        }
    }

    private fun actuallyDrawAreas() {
        mMap.addPolyline(drawArea00())
        mMap.addPolyline(drawArea0911())
        mMap.addPolyline(drawArea0811())
        mMap.addPolyline(drawArea0806())
        mMap.addPolyline(drawArea0808())
        mMap.addPolyline(drawArea1206())
        mMap.addPolyline(drawArea1012())
        mMap.addPolyline(drawArea1404())
        mMap.addPolyline(drawArea1403())
        mMap.addPolyline(drawArea1303())
        mMap.addPolyline(drawArea1301())
        mMap.addPolyline(drawArea1105())
        mMap.addPolyline(drawArea1201())
        mMap.addPolyline(drawArea0800())
        mMap.addPolyline(drawArea1106())
        mMap.addPolyline(drawArea1100())
        mMap.addPolyline(drawArea0901())
        mMap.addPolyline(drawArea0714())
        mMap.addPolyline(drawArea0603())
        mMap.addPolyline(drawArea0810())
        mMap.addPolyline(drawArea0812())
        mMap.addPolyline(drawArea0801())
        mMap.addPolyline(drawArea0804())
        mMap.addPolyline(drawArea0906())
        mMap.addPolyline(drawArea0902())
        mMap.addPolyline(drawArea0702())
        mMap.addPolyline(drawArea0707())
        mMap.addPolyline(drawArea0701())
        mMap.addPolyline(drawArea0705())
        mMap.addPolyline(drawArea0711())
        mMap.addPolyline(drawArea0704())
        mMap.addPolyline(drawArea0604())
        mMap.addPolyline(drawArea0602())
        mMap.addPolyline(drawArea0606())
        mMap.addPolyline(drawArea0400())
        mMap.addPolyline(drawArea0403())
        mMap.addPolyline(drawArea0507())
        mMap.addPolyline(drawArea0506())
        mMap.addPolyline(drawArea0809())
        mMap.addPolyline(drawArea0909())
        mMap.addPolyline(drawArea0905())
        mMap.addPolyline(drawArea0910())
        mMap.addPolyline(drawArea1006())
        mMap.addPolyline(drawArea1108())
        mMap.addPolyline(drawArea1204())
        mMap.addPolyline(drawArea1010())
        mMap.addPolyline(drawArea1104())
        mMap.addPolyline(drawArea1103())
        mMap.addPolyline(drawArea1009())
        mMap.addPolyline(drawArea0903())
        mMap.addPolyline(drawArea0904())
        mMap.addPolyline(drawArea0912())
        mMap.addPolyline(drawArea1004())
        mMap.addPolyline(drawArea1002())
        mMap.addPolyline(drawArea1200())
        mMap.addPolyline(drawArea1101())
        mMap.addPolyline(drawArea1102())
        mMap.addPolyline(drawArea0500())
        mMap.addPolyline(drawArea0803())
        mMap.addPolyline(drawArea0709())
        mMap.addPolyline(drawArea0813())
        mMap.addPolyline(drawArea1005())
        mMap.addPolyline(drawArea1007())
        mMap.addPolyline(drawArea1008())
        mMap.addPolyline(drawArea1300())
        mMap.addPolyline(drawArea1304())
        mMap.addPolyline(drawArea0708())
        mMap.addPolyline(drawArea0502())
        mMap.addPolyline(drawArea0713())
        mMap.addPolyline(drawArea0504())
        mMap.addPolyline(drawArea1302())
        mMap.addPolyline(drawArea1401())
        mMap.addPolyline(drawArea1402())
        mMap.addPolyline(drawArea0710())
        mMap.addPolyline(drawArea0807())
        mMap.addPolyline(drawArea0716())
        mMap.addPolyline(drawArea0700())
        mMap.addPolyline(drawArea0703())
        mMap.addPolyline(drawArea0914())
        mMap.addPolyline(drawArea0900())
        mMap.addPolyline(drawArea0805())
        mMap.addPolyline(drawArea0802())
        mMap.addPolyline(drawArea1205())
        mMap.addPolyline(drawArea0715())
        mMap.addPolyline(drawArea0508())
        mMap.addPolyline(drawArea0712())
        mMap.addPolyline(drawArea0814())
        mMap.addPolyline(drawArea0601())
    }

}
