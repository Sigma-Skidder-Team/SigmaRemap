// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import totalcross.json.JSONObject;

import java.net.URL;
import java.io.IOException;

public class YoutubeUtil {
    public static String method15312(int n) {
        if (n < 0) {
            n = 0;
        }
        if (n <= 3600) {
            return n / 60 + ":" + ((n % 60 >= 10) ? "" : "0") + n % 60;
        }
        return n / 3600 + ":" + ((n / 60 % 60 >= 10) ? "" : "0") + n / 60 % 60 + ":" + ((n % 60 >= 10) ? "" : "0") + n % 60;
    }

    public static JSONObject method15315(final String s) {
        return new JSONObject(s);
    }

    public static URL getVideoStreamURL(final String str) {
        try {
            return new URL("https://www.youtube.com/watch?v=" + str);
        } catch (final IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
