package in.androidmate.dagger2;

import android.app.Application;
import android.content.Context;

import javax.inject.Inject;

import in.androidmate.dagger2.data.model.DataManager;
import in.androidmate.dagger2.di.Component.ApplicationComponent;
import in.androidmate.dagger2.di.Component.DaggerApplicationComponent;
import in.androidmate.dagger2.di.Module.ApplicationModule;

/**
 * Created by anujgupta on 24/07/17.
 */

public class DemoApplication extends Application {

    protected ApplicationComponent applicationComponent;

    @Inject
    DataManager dataManager;

    public static DemoApplication get(Context context) {
        return (DemoApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        applicationComponent.inject(this);
    }

    public ApplicationComponent getComponent(){
        return applicationComponent;
    }
}