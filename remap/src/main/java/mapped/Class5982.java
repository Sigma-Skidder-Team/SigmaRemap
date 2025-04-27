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
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;

public class Class5982 implements JsonDeserializer<Style>, JsonSerializer<Style>
{
    @Nullable
    public Style deserialize(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if (!jsonElement.isJsonObject()) {
            return null;
        }
        final Style class8768 = new Style();
        final JsonObject asJsonObject = jsonElement.getAsJsonObject();
        if (asJsonObject != null) {
            if (asJsonObject.has("bold")) {
                Style.method30427(class8768, asJsonObject.get("bold").getAsBoolean());
            }
            if (asJsonObject.has("italic")) {
                Style.method30428(class8768, asJsonObject.get("italic").getAsBoolean());
            }
            if (asJsonObject.has("underlined")) {
                Style.method30429(class8768, asJsonObject.get("underlined").getAsBoolean());
            }
            if (asJsonObject.has("strikethrough")) {
                Style.method30430(class8768, asJsonObject.get("strikethrough").getAsBoolean());
            }
            if (asJsonObject.has("obfuscated")) {
                Style.method30431(class8768, asJsonObject.get("obfuscated").getAsBoolean());
            }
            if (asJsonObject.has("color")) {
                Style.method30432(class8768, (TextFormatting)jsonDeserializationContext.deserialize(asJsonObject.get("color"), TextFormatting.class));
            }
            if (asJsonObject.has("insertion")) {
                Style.method30433(class8768, asJsonObject.get("insertion").getAsString());
            }
            if (asJsonObject.has("clickEvent")) {
                final JsonObject method35914 = Class9583.method35914(asJsonObject, "clickEvent");
                final String method35915 = Class9583.method35896(method35914, "action", null);
                final Class2075 class8769 = (method35915 != null) ? Class2075.method8178(method35915) : null;
                final String method35916 = Class9583.method35896(method35914, "value", null);
                if (class8769 != null) {
                    if (method35916 != null) {
                        if (class8769.method8176()) {
                            Style.method30434(class8768, new Class9485(class8769, method35916));
                        }
                    }
                }
            }
            if (asJsonObject.has("hoverEvent")) {
                final JsonObject method35917 = Class9583.method35914(asJsonObject, "hoverEvent");
                final String method35918 = Class9583.method35896(method35917, "action", null);
                final HoverEvent.Action class8770 = (method35918 != null) ? HoverEvent.Action.method7949(method35918) : null;
                final ITextComponent class8771 = jsonDeserializationContext.deserialize(method35917.get("value"), ITextComponent.class);
                if (class8770 != null) {
                    if (class8771 != null) {
                        if (class8770.method7947()) {
                            Style.method30435(class8768, new HoverEvent(class8770, class8771));
                        }
                    }
                }
            }
            return class8768;
        }
        return null;
    }
    
    @Nullable
    public JsonElement serialize(final Style class8768, final Type type, final JsonSerializationContext jsonSerializationContext) {
        if (!class8768.method30409()) {
            final JsonObject jsonObject = new JsonObject();
            if (Style.method30436(class8768) != null) {
                jsonObject.addProperty("bold", Style.method30436(class8768));
            }
            if (Style.method30437(class8768) != null) {
                jsonObject.addProperty("italic", Style.method30437(class8768));
            }
            if (Style.method30438(class8768) != null) {
                jsonObject.addProperty("underlined", Style.method30438(class8768));
            }
            if (Style.method30439(class8768) != null) {
                jsonObject.addProperty("strikethrough", Style.method30439(class8768));
            }
            if (Style.method30440(class8768) != null) {
                jsonObject.addProperty("obfuscated", Style.method30440(class8768));
            }
            if (Style.method30441(class8768) != null) {
                jsonObject.add("color", jsonSerializationContext.serialize((Object) Style.method30441(class8768)));
            }
            if (Style.method30442(class8768) != null) {
                jsonObject.add("insertion", jsonSerializationContext.serialize((Object) Style.method30442(class8768)));
            }
            if (Style.method30443(class8768) != null) {
                final JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty("action", Style.method30443(class8768).method35309().method8177());
                jsonObject2.addProperty("value", Style.method30443(class8768).method35310());
                jsonObject.add("clickEvent", jsonObject2);
            }
            if (Style.method30444(class8768) != null) {
                final JsonObject jsonObject3 = new JsonObject();
                jsonObject3.addProperty("action", Style.method30444(class8768).method34911().method7948());
                jsonObject3.add("value", jsonSerializationContext.serialize((Object) Style.method30444(class8768).method34912()));
                jsonObject.add("hoverEvent", jsonObject3);
            }
            return jsonObject;
        }
        return null;
    }
}
