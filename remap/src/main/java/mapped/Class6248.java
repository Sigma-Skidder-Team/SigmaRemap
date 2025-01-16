// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import java.util.Locale;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;

public class Class6248 extends Class6227<Class129>
{
    public Class6248() {
        super(new ResourceLocation("exploration_map"), Class129.class);
    }
    
    public void method18584(final JsonObject jsonObject, final Class129 class129, final JsonSerializationContext jsonSerializationContext) {
        super.method18536(jsonObject, class129, jsonSerializationContext);
        if (!Class129.method644(class129).equals("Buried_Treasure")) {
            jsonObject.add("destination", jsonSerializationContext.serialize((Object)Class129.method644(class129)));
        }
        if (Class129.method645(class129) != Class129.field389) {
            jsonObject.add("decoration", jsonSerializationContext.serialize((Object)Class129.method645(class129).toString().toLowerCase(Locale.ROOT)));
        }
        if (Class129.method646(class129) != 2) {
            jsonObject.addProperty("zoom", (Number)Class129.method646(class129));
        }
        if (Class129.method647(class129) != 50) {
            jsonObject.addProperty("search_radius", (Number)Class129.method647(class129));
        }
        if (!Class129.method648(class129)) {
            jsonObject.addProperty("skip_existing_chunks", Boolean.valueOf(Class129.method648(class129)));
        }
    }
    
    public Class129 method18585(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext, final Class122[] array) {
        final String s = jsonObject.has("destination") ? Class9583.method35895(jsonObject, "destination") : "Buried_Treasure";
        final String s2 = Class4535.field20023.containsKey((Object)s.toLowerCase(Locale.ROOT)) ? s : "Buried_Treasure";
        final String s3 = jsonObject.has("decoration") ? Class9583.method35895(jsonObject, "decoration") : "mansion";
        Class2095 class2095 = Class129.field389;
        try {
            class2095 = Class2095.valueOf(s3.toUpperCase(Locale.ROOT));
        }
        catch (final IllegalArgumentException ex) {
            Class129.method649().error("Error while parsing loot table decoration entry. Found {}. Defaulting to " + Class129.field389, (Object)s3);
        }
        return new Class129(array, s2, class2095, Class9583.method35912(jsonObject, "zoom", (byte)2), Class9583.method35910(jsonObject, "search_radius", 50), Class9583.method35901(jsonObject, "skip_existing_chunks", true), null);
    }
}
