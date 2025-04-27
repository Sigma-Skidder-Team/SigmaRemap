// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import java.util.Map;

public class Class9411
{
    private static final Map<ResourceLocation, Class<? extends Class5770>> field40386;
    
    public static Class5770 method35007(final JsonElement jsonElement, final JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if (jsonElement.isJsonPrimitive()) {
            return jsonDeserializationContext.deserialize(jsonElement, Class5771.class);
        }
        final JsonObject asJsonObject = jsonElement.getAsJsonObject();
        final String method35896 = Class9583.method35896(asJsonObject, "type", Class5770.field23604.toString());
        final Class clazz = Class9411.field40386.get(new ResourceLocation(method35896));
        if (clazz != null) {
            return jsonDeserializationContext.deserialize(asJsonObject, clazz);
        }
        throw new JsonParseException("Unknown generator: " + method35896);
    }
    
    public static JsonElement method35008(final Class5770 class5770, final JsonSerializationContext jsonSerializationContext) {
        final JsonElement serialize = jsonSerializationContext.serialize(class5770);
        if (serialize.isJsonObject()) {
            serialize.getAsJsonObject().addProperty("type", class5770.method17161().toString());
        }
        return serialize;
    }
    
    static {
        (field40386 = Maps.newHashMap()).put(Class5770.field23604, Class5772.class);
        Class9411.field40386.put(Class5770.field23605, Class5769.class);
        Class9411.field40386.put(Class5770.field23603, Class5771.class);
    }
}
