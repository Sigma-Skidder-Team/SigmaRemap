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

public class Class5954 implements JsonDeserializer<Class9315>, JsonSerializer<Class9315>
{
    public Class9315 deserialize(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        final JsonObject method35913 = Class9583.method35913(jsonElement, "version");
        return new Class9315(Class9583.method35895(method35913, "name"), Class9583.method35909(method35913, "protocol"));
    }
    
    public JsonElement serialize(final Class9315 class9315, final Type type, final JsonSerializationContext jsonSerializationContext) {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", class9315.method34475());
        jsonObject.addProperty("protocol", class9315.method34476());
        return jsonObject;
    }
}
