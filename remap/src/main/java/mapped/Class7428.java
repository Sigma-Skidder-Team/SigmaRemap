// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.logging.log4j.Logger;

public class Class7428 extends Class7422
{
    private static final Logger field28640;
    public String field28641;
    public String field28642;
    public String field28643;
    
    public static Class7428 method22860(final String s) {
        final JsonParser jsonParser = new JsonParser();
        final Class7428 class7428 = new Class7428();
        try {
            final JsonObject asJsonObject = jsonParser.parse(s).getAsJsonObject();
            class7428.field28641 = Class7610.method23907("address", asJsonObject, null);
            class7428.field28642 = Class7610.method23907("resourcePackUrl", asJsonObject, null);
            class7428.field28643 = Class7610.method23907("resourcePackHash", asJsonObject, null);
        }
        catch (final Exception ex) {
            Class7428.field28640.error("Could not parse RealmsServerAddress: " + ex.getMessage());
        }
        return class7428;
    }
    
    static {
        field28640 = LogManager.getLogger();
    }
}