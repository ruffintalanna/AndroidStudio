package LocationService;

import android.app.Service;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.IBinder;
import android.util.Log;

/**
 * Created by talannaruffin on 2/1/17.
 */

public class LocationService extends Service {
    private static final String TAG = LocationService.class.getSimpleName();
    private LocationManager mLocationManager = null;
    private static final int INTERVAL = 1000;
    // minimum time interval location updates (miliseconds)
    private static final float DISTANCE = 10f;
    //minimum distance between location updates (meters)

    private class LocationListener implements android.location.LocationListener {
        Location mLastLocation;

        public LocationListener(String provider) {
            Log.e(TAG, "locationListener " + provider);
            mLastLocation = new Location(provider);
        }

        @Override
        public void onLocationChanged(Location location) {
            mLastLocation.set(location);
            SApplication.LOCATION = location;
        }

        @Override
        publiv

        void onProviderDisabled(String provider) {
        }

        @Override
        public void onProviderEnabled(String provider) {
        }

        @Override
        public void onStatusChanged(String provider, int status, Bundle extras) {
        }

    }

    LocationListener[] mLocationListeners = new android.location.LocationListener[]{
            new LocationListener(LocationManager.GPS_PROVIDER),
            new LocationListener(LocationManager.NETWORK_PROVIDER)
    };

    @Override
    public IBinder onBind(Intent arg0) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId)

    super.

    onStartCommand(intent, flags, startId);

    return START_STICKY;

    @Override
    public void onCreate(){
        if (mLocationManager ==null){
            mLocationManager = (LocationManager) getApplicationContext().getSystemService(Context_LOCATION_SERVICE);
        }try {
            mLocationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, INTERVAL, DISTANCE, mLocationListeners[1]);
        } catch (java.long.SecurityException ex) {
            Log.i(TAG, "fail to request location update, ignore", ex.getMessage());
        } catch (IllegalArgumentException ex){
            Log.d(TAG, "gps provider does not exist " + ex.getMessage());
        }
    }

    @Override
    public void onDestroy(){
    super.onDestroy();
    if (mLocationManager !=null){
    for (int i = 0; i < mLocationListeners.length; i++){
    try {
    mLocationManager.removeUpdates(mLocationListeners[i]);
    } catch (Exception ex) {
        Log.i(TAG, "fail to remove location listeners, ignore", ex);
    }
    }
    }
    }
}
