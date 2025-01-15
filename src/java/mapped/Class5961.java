// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializer;

public class Class5961 extends Class5960 implements JsonSerializer<Class7269>, JsonDeserializer<Class7269>
{
    public Class7269 deserialize(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        final JsonObject asJsonObject = jsonElement.getAsJsonObject();
        if (asJsonObject.has("name") && asJsonObject.has("objective")) {
            final Class7269 class7269 = new Class7269(asJsonObject.get("name").getAsString(), asJsonObject.get("objective").getAsString());
            if (asJsonObject.has("value")) {
                if (!asJsonObject.get("value").getAsString().isEmpty()) {
                    class7269.method22272(asJsonObject.get("value").getAsString());
                }
            }
            this.deserialize(asJsonObject, class7269, jsonDeserializationContext);
            return class7269;
        }
        throw new JsonParseException("A score component needs at least a name and an objective");
    }
    
    public JsonElement serialize(final Class7269 class7269, final Type type, final JsonSerializationContext jsonSerializationContext) {
        final JsonObject jsonObject = new JsonObject();
        this.serialize(jsonObject, class7269, jsonSerializationContext);
        final JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("name", class7269.method22267());
        jsonObject2.addProperty("objective", class7269.method22268());
        jsonObject2.addProperty("value", class7269.method22269());
        jsonObject.add("score", (JsonElement)jsonObject2);
        return (JsonElement)jsonObject;
    }
}
