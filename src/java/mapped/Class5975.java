// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonParseException;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonDeserializer;

public class Class5975 implements JsonDeserializer<Class5771>, JsonSerializer<Class5771>
{
    public Class5771 deserialize(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return new Class5771(Class9583.method35908(jsonElement, "value"));
    }
    
    public JsonElement serialize(final Class5771 class5771, final Type type, final JsonSerializationContext jsonSerializationContext) {
        return (JsonElement)new JsonPrimitive((Number)Class5771.method17165(class5771));
    }
}
