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
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializer;

public class Class5964 extends Class5960 implements JsonSerializer<Class7268>, JsonDeserializer<Class7268>
{
    public Class7268 deserialize(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        final Class7268 class7268 = new Class7268();
        final JsonObject asJsonObject = jsonElement.getAsJsonObject();
        this.deserialize(asJsonObject, class7268, jsonDeserializationContext);
        class7268.method22265(asJsonObject.get("keybind").getAsString());
        return class7268;
    }
    
    public JsonElement serialize(final Class7268 class7268, final Type type, final JsonSerializationContext jsonSerializationContext) {
        final JsonObject jsonObject = new JsonObject();
        this.serialize(jsonObject, class7268, jsonSerializationContext);
        jsonObject.addProperty("keybind", class7268.method22264());
        return (JsonElement)jsonObject;
    }
}
