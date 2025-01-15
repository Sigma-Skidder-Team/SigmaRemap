// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.net.MalformedURLException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonObject;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.HttpURLConnection;
import java.util.Locale;
import java.util.UUID;

public class Class6743
{
    public static final String field26533;
    private static final String field26534 = "https://api.spiget.org/v2/resources/";
    private static final int field26535 = 19254;
    private static final String field26536 = "/versions/latest";
    
    public static void method20528(final UUID uuid) {
        Class8563.method28793().method34746(new Class1440(uuid));
    }
    
    public static void method20529() {
        Class8563.method28793().method34746(new Class1282());
    }
    
    private static String method20530(final boolean b) {
        if (Class8563.method28793().method34745().equals("${project.version}")) {
            return "You are using a debug/custom version, consider updating.";
        }
        final String method20531 = method20531();
        if (method20531 == null) {
            if (b) {
                return "Could not check for updates, check your connection.";
            }
            return null;
        }
        else {
            Class1931 class1931;
            try {
                class1931 = new Class1931(Class8563.method28793().method34745());
            }
            catch (final IllegalArgumentException ex) {
                return "You are using a custom version, consider updating.";
            }
            final Class1931 class1932 = new Class1931(method20531);
            if (class1931.compareTo(class1932) < 0) {
                return "There is a newer version available: " + class1932.toString() + ", you're on: " + class1931.toString();
            }
            if (!b || class1931.compareTo(class1932) == 0) {
                return null;
            }
            if (class1931.method7793().toLowerCase(Locale.ROOT).startsWith("dev") || class1931.method7793().toLowerCase(Locale.ROOT).startsWith("snapshot")) {
                return "You are running a development version, please report any bugs to GitHub.";
            }
            return "You are running a newer version than is released!";
        }
    }
    
    private static String method20531() {
        try {
            final HttpURLConnection httpURLConnection = (HttpURLConnection)new URL("https://api.spiget.org/v2/resources/19254/versions/latest?" + System.currentTimeMillis()).openConnection();
            httpURLConnection.setUseCaches(true);
            httpURLConnection.addRequestProperty("User-Agent", "ViaVersion " + Class8563.method28793().method34745() + " " + Class8563.method28793().method34743());
            httpURLConnection.setDoOutput(true);
            final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            String string = "";
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                string += line;
            }
            bufferedReader.close();
            JsonObject jsonObject;
            try {
                jsonObject = (JsonObject)Class8557.method28750().fromJson(string, (Class)JsonObject.class);
            }
            catch (final JsonParseException ex) {
                ex.printStackTrace();
                return null;
            }
            return jsonObject.get("name").getAsString();
        }
        catch (final MalformedURLException ex2) {
            return null;
        }
        catch (final IOException ex3) {
            return null;
        }
    }
    
    static {
        field26533 = Class300.field1728 + Class6743.\u902c\u6a3c\ub0ad\u430d\u7325\ub1b5[14] + Class300.field1735 + "[ViaVersion] " + Class300.field1728;
    }
}
