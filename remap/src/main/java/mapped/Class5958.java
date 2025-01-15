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

public class Class5958 implements JsonDeserializer<Class1932>, JsonSerializer<Class1932>
{
    public Class1932 deserialize(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return new Class1932(Class9583.method35894(jsonElement, "location"));
    }
    
    public JsonElement serialize(final Class1932 class1932, final Type type, final JsonSerializationContext jsonSerializationContext) {
        return (JsonElement)new JsonPrimitive(class1932.toString());
    }
}
