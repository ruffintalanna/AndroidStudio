import android.app.Application;
import android.content.Intent;
import android.location.Location;

import LocationService.LocationService;

/**
 * Created by talannaruffin on 2/1/17.
 */

public class SApplication extends Application {
    private final String TAG = SApplication.class.getSimpleName();
    public static Location LOCATION = null; </p>

    public void onCreate() {
        Intent location = new Intent(getApplicationContext(), LocationService.class);
        startService(location);
    }
    }
}
