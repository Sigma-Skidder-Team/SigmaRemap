// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.json.JSONException;
import totalcross.json.JSONArray;
import totalcross.json.JSONObject;

import java.io.IOException;
import java.net.URL;

public class Class8718
{
    public static URL method29939(final String s, final String s2) {
        System.out.println("Name: " + Class5031.method15321(s));
        System.out.println("Artist: " + Class5031.method15322(s));
        return method29940(Class5031.method15321(s), Class5031.method15322(s), s2);
    }
    
    public static URL method29940(final String s, final String s2, final String spec) {
        try {
            final URL url = new URL(spec);
            final JSONObject method29941 = method29941(s, s2);
            if (!method29941.has("releases")) {
                return url;
            }
            final JSONArray method29942 = method29941.getJSONArray("releases");
            if (method29942.isNull(0)) {
                return url;
            }
            final JSONObject method29943 = method29942.getJSONObject(0).getJSONObject("release-group");
            if (!method29943.has("id")) {
                return url;
            }
            final JSONObject method29944 = Class5031.method15315(Class5031.method15316("http://coverartarchive.org/release-group/" + method29943.getString("id"), true));
            System.out.println(method29944);
            if (!method29944.has("images")) {
                return url;
            }
            return new URL(method29944.getJSONArray("images").getJSONObject(0).getJSONObject("thumbnails").getString("small"));
        }
        catch (final IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public static JSONObject method29941(final String s, final String s2) throws JSONException, IOException {
        final StringBuffer sb = new StringBuffer();
        sb.append("http://musicbrainz.org/ws/2/");
        sb.append("release/?query=");
        sb.append(method29942(Class5031.method15320(s)));
        sb.append("%20AND%20artist:%20");
        sb.append(method29942(Class5031.method15320(s2)));
        sb.append("&fmt=json");
        return Class5031.method15314(sb.toString());
    }
    
    public static String method29942(final String s) {
        try {
            return URLEncoder.encode(s.replace("\"", "'"), "UTF-8");
        }
        catch (final UnsupportedEncodingException ex) {
            ex.printStackTrace();
            return s;
        }
    }
}
