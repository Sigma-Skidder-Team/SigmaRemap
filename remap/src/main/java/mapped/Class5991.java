// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonParseException;
import java.util.Date;
import com.mojang.authlib.GameProfile;
import java.text.ParseException;
import com.google.gson.JsonDeserializationContext;
import java.util.UUID;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonDeserializer;

public class Class5991 implements JsonDeserializer<Class8426>, JsonSerializer<Class8426>
{
    public final /* synthetic */ Class8608 field24465;
    
    private Class5991(final Class8608 field24465) {
        this.field24465 = field24465;
    }
    
    public JsonElement serialize(final Class8426 class8426, final Type type, final JsonSerializationContext jsonSerializationContext) {
        final JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", class8426.method28143().getName());
        final UUID id = class8426.method28143().getId();
        jsonObject.addProperty("uuid", (id != null) ? id.toString() : "");
        jsonObject.addProperty("expiresOn", Class8608.field36124.format(class8426.method28144()));
        return (JsonElement)jsonObject;
    }
    
    public Class8426 deserialize(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if (!jsonElement.isJsonObject()) {
            return null;
        }
        final JsonObject asJsonObject = jsonElement.getAsJsonObject();
        final JsonElement value = asJsonObject.get("name");
        final JsonElement value2 = asJsonObject.get("uuid");
        final JsonElement value3 = asJsonObject.get("expiresOn");
        if (value == null || value2 == null) {
            return null;
        }
        final String asString = value2.getAsString();
        final String asString2 = value.getAsString();
        Date parse = null;
        if (value3 != null) {
            try {
                parse = Class8608.field36124.parse(value3.getAsString());
            }
            catch (final ParseException ex) {
                parse = null;
            }
        }
        if (asString2 != null && asString != null) {
            UUID fromString;
            try {
                fromString = UUID.fromString(asString);
            }
            catch (final Throwable t) {
                return null;
            }
            final Class8608 field24465 = this.field24465;
            field24465.getClass();
            return new Class8426(field24465, new GameProfile(fromString, asString2), parse, null);
        }
        return null;
    }
}
