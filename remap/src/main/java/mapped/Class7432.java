// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.logging.log4j.Logger;

public class Class7432 extends ValueObject
{
    private static final Logger field28662;
    public long field28663;
    public int field28664;
    public Class2224 field28665;
    
    public Class7432() {
        this.field28665 = Class2224.field13691;
    }
    
    public static Class7432 method22865(final String s) {
        final Class7432 class7432 = new Class7432();
        try {
            final JsonObject asJsonObject = new JsonParser().parse(s).getAsJsonObject();
            class7432.field28663 = JsonUtils.func_225169_a("startDate", asJsonObject, 0L);
            class7432.field28664 = JsonUtils.method23908("daysLeft", asJsonObject, 0);
            class7432.field28665 = method22866(JsonUtils.func_225171_a("subscriptionType", asJsonObject, Class2224.field13691.name()));
        }
        catch (final Exception ex) {
            Class7432.field28662.error("Could not parse Subscription: " + ex.getMessage());
        }
        return class7432;
    }
    
    private static Class2224 method22866(final String s) {
        try {
            return Class2224.valueOf(s);
        }
        catch (final Exception ex) {
            return Class2224.field13691;
        }
    }
    
    static {
        field28662 = LogManager.getLogger();
    }
}
