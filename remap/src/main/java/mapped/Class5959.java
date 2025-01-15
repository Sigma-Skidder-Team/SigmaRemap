// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonParseException;
import com.google.gson.JsonObject;
import java.util.Arrays;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializer;

public class Class5959 extends Class5960 implements JsonSerializer<Class7265>, JsonDeserializer<Class7265>
{
    public Class7265 deserialize(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        final Class7265 class7265 = new Class7265();
        final JsonObject asJsonObject = jsonElement.getAsJsonObject();
        this.deserialize(asJsonObject, class7265, jsonDeserializationContext);
        class7265.method22222(asJsonObject.get("translate").getAsString());
        if (asJsonObject.has("with")) {
            class7265.method22213(Arrays.asList((Class7266[])jsonDeserializationContext.deserialize(asJsonObject.get("with"), (Type)Class7266[].class)));
        }
        return class7265;
    }
    
    public JsonElement serialize(final Class7265 class7265, final Type type, final JsonSerializationContext jsonSerializationContext) {
        final JsonObject jsonObject = new JsonObject();
        this.serialize(jsonObject, class7265, jsonSerializationContext);
        jsonObject.addProperty("translate", class7265.method22220());
        if (class7265.method22221() != null) {
            jsonObject.add("with", jsonSerializationContext.serialize((Object)class7265.method22221()));
        }
        return (JsonElement)jsonObject;
    }
}
