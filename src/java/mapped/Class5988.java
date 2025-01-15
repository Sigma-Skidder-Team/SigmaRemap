// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonParseException;
import com.google.gson.JsonDeserializationContext;
import java.util.Iterator;
import java.util.Map;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonDeserializer;

public class Class5988 implements JsonDeserializer<Class348>, JsonSerializer<Class348>
{
    public JsonElement serialize(final Class348 class348, final Type type, final JsonSerializationContext jsonSerializationContext) {
        final JsonObject jsonObject = new JsonObject();
        final JsonObject jsonObject2 = new JsonObject();
        for (final Map.Entry<String, V> entry : Class348.method1045(class348).entrySet()) {
            final Class8000 class349 = (Class8000)entry.getValue();
            if (!class349.method26167()) {
                continue;
            }
            jsonObject2.add((String)entry.getKey(), class349.method26172());
        }
        if (!jsonObject2.entrySet().isEmpty()) {
            jsonObject.add("criteria", (JsonElement)jsonObject2);
        }
        jsonObject.addProperty("done", Boolean.valueOf(class348.method1031()));
        return (JsonElement)jsonObject;
    }
    
    public Class348 deserialize(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        final JsonObject method35915 = Class9583.method35915(Class9583.method35913(jsonElement, "advancement"), "criteria", new JsonObject());
        final Class348 class348 = new Class348();
        for (final Map.Entry<String, V> entry : method35915.entrySet()) {
            final String s = entry.getKey();
            Class348.method1045(class348).put(s, Class8000.method26174(Class9583.method35894((JsonElement)entry.getValue(), s)));
        }
        return class348;
    }
}
