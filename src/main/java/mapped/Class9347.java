// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.net.URLDecoder;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class Class9347
{
    private Class9347() {
    }
    
    public static String method34653(final String s) {
        try {
            return URLEncoder.encode(s, "UTF-8").replace("+", "%20").replace("%21", "!").replace("%27", "'").replace("%28", "(").replace("%29", ")").replace("%7E", "~");
        }
        catch (final UnsupportedEncodingException cause) {
            throw new RuntimeException(cause);
        }
    }
    
    public static String method34654(final String s) {
        try {
            return URLDecoder.decode(s, "UTF-8");
        }
        catch (final UnsupportedEncodingException cause) {
            throw new RuntimeException(cause);
        }
    }
}
