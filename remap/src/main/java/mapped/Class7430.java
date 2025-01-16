// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import com.google.gson.JsonObject;
import org.apache.logging.log4j.Logger;

public class Class7430 extends ValueObject
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
            class7430.field28649 = JsonUtils.func_225171_a("id", jsonObject, "");
            class7430.field28650 = JsonUtils.func_225171_a("name", jsonObject, "");
            class7430.field28651 = JsonUtils.func_225171_a("version", jsonObject, "");
            class7430.field28652 = JsonUtils.func_225171_a("author", jsonObject, "");
            class7430.field28653 = JsonUtils.func_225171_a("link", jsonObject, "");
            class7430.field28654 = JsonUtils.func_225171_a("image", jsonObject, null);
            class7430.field28655 = JsonUtils.func_225171_a("trailer", jsonObject, "");
            class7430.field28656 = JsonUtils.func_225171_a("recommendedPlayers", jsonObject, "");
            class7430.field28657 = Class2197.valueOf(JsonUtils.func_225171_a("type", jsonObject, Class2197.field13369.name()));
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
