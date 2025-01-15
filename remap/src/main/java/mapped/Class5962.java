// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonParseException;
import com.google.gson.JsonObject;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializer;

public class Class5962 extends Class5960 implements JsonSerializer<Class7270>, JsonDeserializer<Class7270>
{
    public Class7270 deserialize(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        final Class7270 class7270 = new Class7270();
        final JsonObject asJsonObject = jsonElement.getAsJsonObject();
        this.deserialize(asJsonObject, class7270, jsonDeserializationContext);
        class7270.method22276(asJsonObject.get("text").getAsString());
        return class7270;
    }
    
    public JsonElement serialize(final Class7270 class7270, final Type type, final JsonSerializationContext jsonSerializationContext) {
        final List<Class7266> method22258 = class7270.method22258();
        final JsonObject jsonObject = new JsonObject();
        Label_0039: {
            if (!class7270.method22245()) {
                if (method22258 == null) {
                    break Label_0039;
                }
                if (method22258.isEmpty()) {
                    break Label_0039;
                }
            }
            this.serialize(jsonObject, class7270, jsonSerializationContext);
        }
        jsonObject.addProperty("text", class7270.method22275());
        return (JsonElement)jsonObject;
    }
}
