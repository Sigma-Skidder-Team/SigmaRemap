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

public class Class5967 implements JsonDeserializer<Class122>, JsonSerializer<Class122>
{
    public Class122 deserialize(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        final JsonObject method35913 = Class9583.method35913(jsonElement, "condition");
        final Class1932 obj = new Class1932(Class9583.method35895(method35913, "condition"));
        Class7020<?> method35914;
        try {
            method35914 = Class7454.method22941(obj);
        }
        catch (final IllegalArgumentException ex) {
            throw new JsonSyntaxException("Unknown condition '" + obj + "'");
        }
        return (Class122)method35914.method21482(method35913, jsonDeserializationContext);
    }
    
    public JsonElement serialize(final Class122 class122, final Type type, final JsonSerializationContext jsonSerializationContext) {
        final Class7020<Class122> method22942 = Class7454.method22942(class122);
        final JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("condition", method22942.method21484().toString());
        method22942.method21483(jsonObject, class122, jsonSerializationContext);
        return (JsonElement)jsonObject;
    }
}
