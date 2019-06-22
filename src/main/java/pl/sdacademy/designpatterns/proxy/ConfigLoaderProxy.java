package pl.sdacademy.designpatterns.proxy;
import static java.util.Objects.isNull;

public class ConfigLoaderProxy implements ConfigLoader {

    private ConfigLoader configLoader;
    private String config;

    public ConfigLoaderProxy(ConfigLoader configLoader) {
        this.configLoader = configLoader;
    }

    @Override
    public String load() {

       if (isNull(config)){

        config = configLoader.load();
       }
       return config;
    }


}
