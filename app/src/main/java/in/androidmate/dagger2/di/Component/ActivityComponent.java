package in.androidmate.dagger2.di.Component;

import dagger.Component;
import in.androidmate.dagger2.MainActivity;
import in.androidmate.dagger2.di.Module.ActivityModule;
import in.androidmate.dagger2.di.PerActivity;

/**
 * Created by anujgupta on 24/07/17.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}