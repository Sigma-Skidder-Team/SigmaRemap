// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonParseException;
import com.google.gson.JsonObject;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonDeserializer;

public class Class5957 implements JsonDeserializer<Class5772>, JsonSerializer<Class5772>
{
    public Class5772 deserialize(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if (!Class9583.method35889(jsonElement)) {
            final JsonObject method35913 = Class9583.method35913(jsonElement, "value");
            return new Class5772(Class9583.method35903(method35913, "min"), Class9583.method35903(method35913, "max"));
        }
        return new Class5772(Class9583.method35902(jsonElement, "value"));
    }
    
    public JsonElement serialize(final Class5772 class5772, final Type type, final JsonSerializationContext jsonSerializationContext) {
        if (Class5772.method17171(class5772) != Class5772.method17172(class5772)) {
            final JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("min", (Number)Class5772.method17171(class5772));
            jsonObject.addProperty("max", (Number)Class5772.method17172(class5772));
            return (JsonElement)jsonObject;
        }
        return (JsonElement)new JsonPrimitive((Number)Class5772.method17171(class5772));
    }
}
