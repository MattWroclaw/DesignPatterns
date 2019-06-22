package pl.sdacademy.designpatterns.proxy;

public class DataBaseConfigLoader implements ConfigLoader{
    private String configuration;
    private String serverUrl;

    public DataBaseConfigLoader (final  String serverUrl){
        this.serverUrl = serverUrl;

        // dygresja final'e

    }

    @Override
    public String load() {
        System.out.println("Getting config from "+serverUrl);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        configuration = "Config load from" +serverUrl;
        return configuration ;
    }
}
