// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.commons.lang3.ArrayUtils;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonParseException;
import com.google.gson.JsonObject;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonDeserializer;

public class Class5969 implements JsonDeserializer<Class9317>, JsonSerializer<Class9317>
{
    public Class9317 deserialize(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        final JsonObject method35913 = Class9583.method35913(jsonElement, "loot table");
        final Class9320[] array = Class9583.method35921(method35913, "pools", new Class9320[0], jsonDeserializationContext, Class9320[].class);
        Class8212 method35914 = null;
        if (method35913.has("type")) {
            method35914 = Class7104.method21810(new ResourceLocation(Class9583.method35895(method35913, "type")));
        }
        return new Class9317((method35914 == null) ? Class7104.field27718 : method35914, array, Class9583.method35921(method35913, "functions", new Class125[0], jsonDeserializationContext, Class125[].class), null);
    }
    
    public JsonElement serialize(final Class9317 class9317, final Type type, final JsonSerializationContext jsonSerializationContext) {
        final JsonObject jsonObject = new JsonObject();
        if (Class9317.method34493(class9317) != Class9317.field40010) {
            final ResourceLocation method21811 = Class7104.method21811(Class9317.method34493(class9317));
            if (method21811 == null) {
                Class9317.method34494().warn("Failed to find id for param set " + Class9317.method34493(class9317));
            }
            else {
                jsonObject.addProperty("type", method21811.toString());
            }
        }
        if (Class9317.method34495(class9317).length > 0) {
            jsonObject.add("pools", jsonSerializationContext.serialize((Object)Class9317.method34495(class9317)));
        }
        if (!ArrayUtils.isEmpty((Object[])Class9317.method34496(class9317))) {
            jsonObject.add("functions", jsonSerializationContext.serialize((Object)Class9317.method34496(class9317)));
        }
        return jsonObject;
    }
}
