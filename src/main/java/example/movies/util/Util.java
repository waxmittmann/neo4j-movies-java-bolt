package example.movies.util;

/**
 * @author Michael Hunger @since 22.10.13
 */
public class Util {
    public static final String DEFAULT_URL = "bolt://neo4j:test@localhost";
    public static final String WEBAPP_LOCATION = "src/main/webapp/";

    public static int getWebPort() {
        String webPort = System.getenv("PORT");
        if(webPort == null || webPort.isEmpty()) {
            return 8080;
        }
        return Integer.parseInt(webPort);
    }

    public static String getNeo4jUrl() {
        String urlVar = System.getenv("NEO4J_URL_VAR");
        if (urlVar==null) urlVar = "NEO4J_URL";
        String url =  System.getenv(urlVar);
        if(url == null || url.isEmpty()) {
            return DEFAULT_URL;
        }
        return url;
    }
}
