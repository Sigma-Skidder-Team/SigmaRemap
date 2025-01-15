// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonParseException;
import com.google.gson.JsonObject;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonDeserializer;

public class Class5971 implements JsonDeserializer<Class9299>, JsonSerializer<Class9299>
{
    public Class9299 deserialize(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        final JsonObject method35913 = Class9583.method35913(jsonElement, "value");
        return new Class9299(method35913.has("min") ? Integer.valueOf(Class9583.method35909(method35913, "min")) : null, method35913.has("max") ? Integer.valueOf(Class9583.method35909(method35913, "max")) : null, null);
    }
    
    public JsonElement serialize(final Class9299 class9299, final Type type, final JsonSerializationContext jsonSerializationContext) {
        final JsonObject jsonObject = new JsonObject();
        if (Class9299.method34381(class9299) != null) {
            jsonObject.addProperty("max", (Number)Class9299.method34381(class9299));
        }
        if (Class9299.method34382(class9299) != null) {
            jsonObject.addProperty("min", (Number)Class9299.method34382(class9299));
        }
        return (JsonElement)jsonObject;
    }
}
