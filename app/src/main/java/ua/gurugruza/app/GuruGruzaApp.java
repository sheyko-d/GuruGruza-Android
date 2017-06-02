package ua.gurugruza.app;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

import ua.gurugruza.R;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class GuruGruzaApp extends Application {

    @SuppressLint("StaticFieldLeak")
    private static Context sInstance;

    public static Context getContext() {
        return sInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
        initCalligraphy();
    }

    private void initCalligraphy() {
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Roboto-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}
