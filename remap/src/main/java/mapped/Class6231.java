// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;

import com.google.gson.JsonSyntaxException;
import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonArray;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;

public class Class6231 extends Class6227<Class136>
{
    public Class6231() {
        super(new ResourceLocation("set_stew_effect"), Class136.class);
    }
    
    public void method18547(final JsonObject jsonObject, final Class136 class136, final JsonSerializationContext jsonSerializationContext) {
        super.method18536(jsonObject, class136, jsonSerializationContext);
        if (!Class136.method674(class136).isEmpty()) {
            final JsonArray jsonArray = new JsonArray();
            for (final Class5328 obj : Class136.method674(class136).keySet()) {
                final JsonObject jsonObject2 = new JsonObject();
                final ResourceLocation method503 = Registry.field207.getKey(obj);
                if (method503 == null) {
                    throw new IllegalArgumentException("Don't know how to serialize mob effect " + obj);
                }
                jsonObject2.add("type", (JsonElement)new JsonPrimitive(method503.toString()));
                jsonObject2.add("duration", jsonSerializationContext.serialize(Class136.method674(class136).get(obj)));
                jsonArray.add((JsonElement)jsonObject2);
            }
            jsonObject.add("effects", (JsonElement)jsonArray);
        }
    }
    
    public Class136 method18548(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext, final Class122[] array) {
        final HashMap hashMap = Maps.newHashMap();
        if (jsonObject.has("effects")) {
            for (final JsonElement jsonElement : Class9583.method35917(jsonObject, "effects")) {
                hashMap.put(Registry.field207.method506(new ResourceLocation(Class9583.method35895(jsonElement.getAsJsonObject(), "type"))).orElseThrow(() -> {
                    new JsonSyntaxException("Unknown mob effect '" + str + "'");
                    return;
                }), Class9583.method35920(jsonElement.getAsJsonObject(), "duration", jsonDeserializationContext, (Class<?>)Class5772.class));
            }
        }
        return new Class136(array, hashMap, null);
    }
}
