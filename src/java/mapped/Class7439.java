// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import com.google.gson.JsonParser;
import org.apache.logging.log4j.Logger;

public class Class7439 extends Class7422
{
    private static final Logger field28695;
    public String field28696;
    
    public static Class7439 method22888(final String s) {
        final Class7439 class7439 = new Class7439();
        try {
            class7439.field28696 = Class7610.method23907("newsLink", new JsonParser().parse(s).getAsJsonObject(), null);
        }
        catch (final Exception ex) {
            Class7439.field28695.error("Could not parse RealmsNews: " + ex.getMessage());
        }
        return class7439;
    }
    
    static {
        field28695 = LogManager.getLogger();
    }
}
