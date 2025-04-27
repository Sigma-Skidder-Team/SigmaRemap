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
import net.minecraft.util.text.ITextComponent;

public class Class5978 implements JsonDeserializer<Class7787>, JsonSerializer<Class7787>
{
    public Class7787 deserialize(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        final JsonObject method35913 = Class9583.method35913(jsonElement, "status");
        final Class7787 class7787 = new Class7787();
        if (method35913.has("description")) {
            class7787.method24991(jsonDeserializationContext.deserialize(method35913.get("description"), ITextComponent.class));
        }
        if (method35913.has("players")) {
            class7787.method24993(jsonDeserializationContext.deserialize(method35913.get("players"), Class8499.class));
        }
        if (method35913.has("version")) {
            class7787.method24995(jsonDeserializationContext.deserialize(method35913.get("version"), Class9315.class));
        }
        if (method35913.has("favicon")) {
            class7787.method24996(Class9583.method35895(method35913, "favicon"));
        }
        return class7787;
    }
    
    public JsonElement serialize(final Class7787 class7787, final Type type, final JsonSerializationContext jsonSerializationContext) {
        final JsonObject jsonObject = new JsonObject();
        if (class7787.method24990() != null) {
            jsonObject.add("description", jsonSerializationContext.serialize(class7787.method24990()));
        }
        if (class7787.method24992() != null) {
            jsonObject.add("players", jsonSerializationContext.serialize(class7787.method24992()));
        }
        if (class7787.method24994() != null) {
            jsonObject.add("version", jsonSerializationContext.serialize(class7787.method24994()));
        }
        if (class7787.method24997() != null) {
            jsonObject.addProperty("favicon", class7787.method24997());
        }
        return jsonObject;
    }
}
