package module;

import com.google.inject.AbstractModule;
import service.HelloGuiceService;
import service.HelloGuiceServiceImpl;

public class HelloGuiceModule extends AbstractModule {

    protected void configure() {
        // add configuration logic here
        bind(HelloGuiceService.class).to(HelloGuiceServiceImpl.class);

    }
}