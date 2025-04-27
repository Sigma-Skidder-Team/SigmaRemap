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

public class Class5986 implements JsonDeserializer<Class5769>, JsonSerializer<Class5769>
{
    public Class5769 deserialize(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        final JsonObject method35913 = Class9583.method35913(jsonElement, "value");
        return new Class5769(Class9583.method35909(method35913, "n"), Class9583.method35903(method35913, "p"));
    }
    
    public JsonElement serialize(final Class5769 class5769, final Type type, final JsonSerializationContext jsonSerializationContext) {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("n", (Number)Class5769.method17162(class5769));
        jsonObject.addProperty("p", (Number)Class5769.method17163(class5769));
        return jsonObject;
    }
}
