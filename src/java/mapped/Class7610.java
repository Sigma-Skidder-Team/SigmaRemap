// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Date;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Class7610
{
    private static String[] field30162;
    
    public static String method23907(final String s, final JsonObject jsonObject, final String s2) {
        final JsonElement value = jsonObject.get(s);
        if (value == null) {
            return s2;
        }
        return value.isJsonNull() ? s2 : value.getAsString();
    }
    
    public static int method23908(final String s, final JsonObject jsonObject, final int n) {
        final JsonElement value = jsonObject.get(s);
        if (value == null) {
            return n;
        }
        return value.isJsonNull() ? n : value.getAsInt();
    }
    
    public static long method23909(final String s, final JsonObject jsonObject, final long n) {
        final JsonElement value = jsonObject.get(s);
        if (value == null) {
            return n;
        }
        return value.isJsonNull() ? n : value.getAsLong();
    }
    
    public static boolean method23910(final String s, final JsonObject jsonObject, final boolean b) {
        final JsonElement value = jsonObject.get(s);
        if (value == null) {
            return b;
        }
        return value.isJsonNull() ? b : value.getAsBoolean();
    }
    
    public static Date method23911(final String s, final JsonObject jsonObject) {
        final JsonElement value = jsonObject.get(s);
        return (value == null) ? new Date() : new Date(Long.parseLong(value.getAsString()));
    }
}
