// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonParseException;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.UUID;
import com.mojang.authlib.GameProfile;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonDeserializer;

public class Class5956 implements JsonDeserializer<Class8499>, JsonSerializer<Class8499>
{
    public Class8499 deserialize(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        final JsonObject method35913 = Class9583.method35913(jsonElement, "players");
        final Class8499 class8499 = new Class8499(Class9583.method35909(method35913, "max"), Class9583.method35909(method35913, "online"));
        if (Class9583.method35891(method35913, "sample")) {
            final JsonArray method35914 = Class9583.method35917(method35913, "sample");
            if (method35914.size() > 0) {
                final GameProfile[] array = new GameProfile[method35914.size()];
                for (int i = 0; i < array.length; ++i) {
                    final JsonObject method35915 = Class9583.method35913(method35914.get(i), "player[" + i + "]");
                    array[i] = new GameProfile(UUID.fromString(Class9583.method35895(method35915, "id")), Class9583.method35895(method35915, "name"));
                }
                class8499.method28400(array);
            }
        }
        return class8499;
    }
    
    public JsonElement serialize(final Class8499 class8499, final Type type, final JsonSerializationContext jsonSerializationContext) {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("max", class8499.method28397());
        jsonObject.addProperty("online", class8499.method28398());
        if (class8499.method28399() != null) {
            if (class8499.method28399().length > 0) {
                final JsonArray jsonArray = new JsonArray();
                for (int i = 0; i < class8499.method28399().length; ++i) {
                    final JsonObject jsonObject2 = new JsonObject();
                    final UUID id = class8499.method28399()[i].getId();
                    jsonObject2.addProperty("id", (id != null) ? id.toString() : "");
                    jsonObject2.addProperty("name", class8499.method28399()[i].getName());
                    jsonArray.add(jsonObject2);
                }
                jsonObject.add("sample", jsonArray);
            }
        }
        return jsonObject;
    }
}
