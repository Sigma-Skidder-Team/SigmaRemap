// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonParseException;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonDeserializer;

public class Class5974 implements JsonDeserializer<Class125>, JsonSerializer<Class125>
{
    public Class125 deserialize(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        final JsonObject method35913 = Class9583.method35913(jsonElement, "function");
        final ResourceLocation obj = new ResourceLocation(Class9583.method35895(method35913, "function"));
        Class6230<?> method35914;
        try {
            method35914 = Class7463.method22989(obj);
        }
        catch (final IllegalArgumentException ex) {
            throw new JsonSyntaxException("Unknown function '" + obj + "'");
        }
        return method35914.method18540(method35913, jsonDeserializationContext);
    }
    
    public JsonElement serialize(final Class125 class125, final Type type, final JsonSerializationContext jsonSerializationContext) {
        final Class6230<Class125> method22990 = Class7463.method22990(class125);
        final JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("function", method22990.method18545().toString());
        method22990.method18537(jsonObject, class125, jsonSerializationContext);
        return jsonObject;
    }
}
