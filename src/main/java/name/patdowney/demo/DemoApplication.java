package name.patdowney.demo;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class DemoApplication extends Application<DemoConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DemoApplication().run(args);
    }

    @Override
    public String getName() {
        return "demo-dropwizard";
    }

    @Override
    public void run(final DemoConfiguration configuration, final Environment environment) throws Exception {
        environment.jersey().register(new DemoResource());

    }
}
