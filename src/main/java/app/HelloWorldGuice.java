package app;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Module;
import module.HelloGuiceModule;
import service.HelloGuiceService;

public class HelloWorldGuice {

    @Inject
    public HelloGuiceService helloGuiceService;

    // Avoiding NullPointer on JSP call
    public HelloWorldGuice() {
        Module module = new HelloGuiceModule();
        Injector injector = Guice.createInjector(module);
        injector.injectMembers(this);
    }

    public String test(String msg) {
        return helloGuiceService.serviceMethod(msg);
    }
}