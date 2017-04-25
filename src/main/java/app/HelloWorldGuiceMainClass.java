package app;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Module;
import module.HelloGuiceModule;
import service.HelloGuiceService;

public class HelloWorldGuiceMainClass {

    @Inject
    public HelloGuiceService helloGuiceService;

    public static void main(String[] args) {

        HelloWorldGuiceMainClass helloWorldGuiceMainClass = new HelloWorldGuiceMainClass();
        Module module = new HelloGuiceModule();
        Injector injector = Guice.createInjector(module);
        injector.injectMembers(helloWorldGuiceMainClass);

        helloWorldGuiceMainClass.helloWorldGuice();
    }

    private void helloWorldGuice() {
        String testStr = helloGuiceService.serviceMethod("Hi from main");
        System.out.println(testStr);
    }
}