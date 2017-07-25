package in.androidmate.dagger2.di.Component;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import in.androidmate.dagger2.DemoApplication;
import in.androidmate.dagger2.data.DbHelper;
import in.androidmate.dagger2.data.SharedPrefsHelper;
import in.androidmate.dagger2.data.model.DataManager;
import in.androidmate.dagger2.di.ApplicationContext;
import in.androidmate.dagger2.di.Module.ApplicationModule;

/**
 * Created by anujgupta on 24/07/17.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(DemoApplication demoApplication);

    @ApplicationContext
    Context getContext();

    Application getApplication();

    DataManager getDataManager();

    SharedPrefsHelper getPreferenceHelper();

    DbHelper getDbHelper();

}