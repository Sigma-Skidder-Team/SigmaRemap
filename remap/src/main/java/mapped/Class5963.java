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

public class Class5963 extends Class5960 implements JsonSerializer<Class7267>, JsonDeserializer<Class7267>
{
    public Class7267 deserialize(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        final JsonObject asJsonObject = jsonElement.getAsJsonObject();
        final Class7267 class7267 = new Class7267(asJsonObject.get("selector").getAsString());
        this.deserialize(asJsonObject, class7267, jsonDeserializationContext);
        return class7267;
    }
    
    public JsonElement serialize(final Class7267 class7267, final Type type, final JsonSerializationContext jsonSerializationContext) {
        final JsonObject jsonObject = new JsonObject();
        this.serialize(jsonObject, class7267, jsonSerializationContext);
        jsonObject.addProperty("selector", class7267.method22262());
        return jsonObject;
    }
}
