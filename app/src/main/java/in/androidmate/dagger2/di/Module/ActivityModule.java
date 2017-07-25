package in.androidmate.dagger2.di.Module;

import android.app.Activity;
import android.content.Context;

import dagger.Module;
import dagger.Provides;
import in.androidmate.dagger2.di.ActivityContext;

/**
 * Created by anujgupta on 24/07/17.
 */

@Module
public class ActivityModule {

    private Activity mActivity;

    public ActivityModule(Activity activity) {
        mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    Activity provideActivity() {
        return mActivity;
    }
}