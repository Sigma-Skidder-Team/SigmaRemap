// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import totalcross.json.JSONObject;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.DataOutputStream;
import java.net.URL;
import java.net.HttpURLConnection;

public class Class7900
{
    private static final int field32416 = 15000;
    private static final int field32417 = 80;
    public static final String field32418 = "8744d8c7bb5e811a40b6119d63811040";
    public static final String field32419 = "http://ws.audioscrobbler.com/2.0/";
    private static final int field32420 = 30;
    public static final String field32421 = "http://musicbrainz.org/ws/2/";
    private static final int field32422 = 15000;
    private static final String field32423;
    
    public static JSONObject method25569(final String spec, final String s) throws IOException {
        final HttpURLConnection httpURLConnection = (HttpURLConnection)new URL(spec).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_2) AppleWebKit/604.4.7 (KHTML, like Gecko) Version/11.0.2 Safari/604.4.7");
        httpURLConnection.setRequestProperty("Accept-Language", "en-us");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        httpURLConnection.setRequestProperty("Connexion", "keep-alive");
        httpURLConnection.setRequestProperty("DNT", "1");
        httpURLConnection.setRequestProperty("Upgrade-Insecure-Requests", "1");
        httpURLConnection.setDoOutput(true);
        final DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.writeBytes(s);
        dataOutputStream.flush();
        dataOutputStream.close();
        httpURLConnection.getResponseCode();
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
        final StringBuffer sb = new StringBuffer();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            sb.append(line);
        }
        bufferedReader.close();
        return YoutubeUtil.method15315(sb.toString());
    }
    
    static {
        field32423 = Class7900.class.getName();
    }
}
