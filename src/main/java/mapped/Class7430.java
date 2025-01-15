// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import com.google.gson.JsonObject;
import org.apache.logging.log4j.Logger;

public class Class7430 extends Class7422
{
    private static final Logger field28648;
    public String field28649;
    public String field28650;
    public String field28651;
    public String field28652;
    public String field28653;
    public String field28654;
    public String field28655;
    public String field28656;
    public Class2197 field28657;
    
    public static Class7430 method22863(final JsonObject jsonObject) {
        final Class7430 class7430 = new Class7430();
        try {
            class7430.field28649 = Class7610.method23907("id", jsonObject, "");
            class7430.field28650 = Class7610.method23907("name", jsonObject, "");
            class7430.field28651 = Class7610.method23907("version", jsonObject, "");
            class7430.field28652 = Class7610.method23907("author", jsonObject, "");
            class7430.field28653 = Class7610.method23907("link", jsonObject, "");
            class7430.field28654 = Class7610.method23907("image", jsonObject, null);
            class7430.field28655 = Class7610.method23907("trailer", jsonObject, "");
            class7430.field28656 = Class7610.method23907("recommendedPlayers", jsonObject, "");
            class7430.field28657 = Class2197.valueOf(Class7610.method23907("type", jsonObject, Class2197.field13369.name()));
        }
        catch (final Exception ex) {
            Class7430.field28648.error("Could not parse WorldTemplate: " + ex.getMessage());
        }
        return class7430;
    }
    
    static {
        field28648 = LogManager.getLogger();
    }
}
