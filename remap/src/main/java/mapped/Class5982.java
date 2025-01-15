// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonSerializationContext;
import javax.annotation.Nullable;
import com.google.gson.JsonParseException;
import com.google.gson.JsonObject;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonDeserializer;

public class Class5982 implements JsonDeserializer<Class8768>, JsonSerializer<Class8768>
{
    @Nullable
    public Class8768 deserialize(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if (!jsonElement.isJsonObject()) {
            return null;
        }
        final Class8768 class8768 = new Class8768();
        final JsonObject asJsonObject = jsonElement.getAsJsonObject();
        if (asJsonObject != null) {
            if (asJsonObject.has("bold")) {
                Class8768.method30427(class8768, asJsonObject.get("bold").getAsBoolean());
            }
            if (asJsonObject.has("italic")) {
                Class8768.method30428(class8768, asJsonObject.get("italic").getAsBoolean());
            }
            if (asJsonObject.has("underlined")) {
                Class8768.method30429(class8768, asJsonObject.get("underlined").getAsBoolean());
            }
            if (asJsonObject.has("strikethrough")) {
                Class8768.method30430(class8768, asJsonObject.get("strikethrough").getAsBoolean());
            }
            if (asJsonObject.has("obfuscated")) {
                Class8768.method30431(class8768, asJsonObject.get("obfuscated").getAsBoolean());
            }
            if (asJsonObject.has("color")) {
                Class8768.method30432(class8768, (Class2116)jsonDeserializationContext.deserialize(asJsonObject.get("color"), (Type)Class2116.class));
            }
            if (asJsonObject.has("insertion")) {
                Class8768.method30433(class8768, asJsonObject.get("insertion").getAsString());
            }
            if (asJsonObject.has("clickEvent")) {
                final JsonObject method35914 = Class9583.method35914(asJsonObject, "clickEvent");
                final String method35915 = Class9583.method35896(method35914, "action", null);
                final Class2075 class8769 = (method35915 != null) ? Class2075.method8178(method35915) : null;
                final String method35916 = Class9583.method35896(method35914, "value", null);
                if (class8769 != null) {
                    if (method35916 != null) {
                        if (class8769.method8176()) {
                            Class8768.method30434(class8768, new Class9485(class8769, method35916));
                        }
                    }
                }
            }
            if (asJsonObject.has("hoverEvent")) {
                final JsonObject method35917 = Class9583.method35914(asJsonObject, "hoverEvent");
                final String method35918 = Class9583.method35896(method35917, "action", null);
                final Class1961 class8770 = (method35918 != null) ? Class1961.method7949(method35918) : null;
                final Class2250 class8771 = (Class2250)jsonDeserializationContext.deserialize(method35917.get("value"), (Type)Class2250.class);
                if (class8770 != null) {
                    if (class8771 != null) {
                        if (class8770.method7947()) {
                            Class8768.method30435(class8768, new Class9390(class8770, class8771));
                        }
                    }
                }
            }
            return class8768;
        }
        return null;
    }
    
    @Nullable
    public JsonElement serialize(final Class8768 class8768, final Type type, final JsonSerializationContext jsonSerializationContext) {
        if (!class8768.method30409()) {
            final JsonObject jsonObject = new JsonObject();
            if (Class8768.method30436(class8768) != null) {
                jsonObject.addProperty("bold", Class8768.method30436(class8768));
            }
            if (Class8768.method30437(class8768) != null) {
                jsonObject.addProperty("italic", Class8768.method30437(class8768));
            }
            if (Class8768.method30438(class8768) != null) {
                jsonObject.addProperty("underlined", Class8768.method30438(class8768));
            }
            if (Class8768.method30439(class8768) != null) {
                jsonObject.addProperty("strikethrough", Class8768.method30439(class8768));
            }
            if (Class8768.method30440(class8768) != null) {
                jsonObject.addProperty("obfuscated", Class8768.method30440(class8768));
            }
            if (Class8768.method30441(class8768) != null) {
                jsonObject.add("color", jsonSerializationContext.serialize((Object)Class8768.method30441(class8768)));
            }
            if (Class8768.method30442(class8768) != null) {
                jsonObject.add("insertion", jsonSerializationContext.serialize((Object)Class8768.method30442(class8768)));
            }
            if (Class8768.method30443(class8768) != null) {
                final JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty("action", Class8768.method30443(class8768).method35309().method8177());
                jsonObject2.addProperty("value", Class8768.method30443(class8768).method35310());
                jsonObject.add("clickEvent", (JsonElement)jsonObject2);
            }
            if (Class8768.method30444(class8768) != null) {
                final JsonObject jsonObject3 = new JsonObject();
                jsonObject3.addProperty("action", Class8768.method30444(class8768).method34911().method7948());
                jsonObject3.add("value", jsonSerializationContext.serialize((Object)Class8768.method30444(class8768).method34912()));
                jsonObject.add("hoverEvent", (JsonElement)jsonObject3);
            }
            return (JsonElement)jsonObject;
        }
        return null;
    }
}
