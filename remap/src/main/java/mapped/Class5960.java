// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonElement;
import com.google.common.base.Preconditions;
import java.util.HashSet;
import com.google.gson.JsonSerializationContext;
import java.util.Arrays;
import java.lang.reflect.Type;
import java.util.Locale;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;

public class Class5960
{
    public void deserialize(final JsonObject jsonObject, final Class7266 class7266, final JsonDeserializationContext jsonDeserializationContext) {
        if (jsonObject.has("color")) {
            class7266.method22248(Class300.valueOf(jsonObject.get("color").getAsString().toUpperCase(Locale.ROOT)));
        }
        if (jsonObject.has("bold")) {
            class7266.method22249(jsonObject.get("bold").getAsBoolean());
        }
        if (jsonObject.has("italic")) {
            class7266.method22250(jsonObject.get("italic").getAsBoolean());
        }
        if (jsonObject.has("underlined")) {
            class7266.method22251(jsonObject.get("underlined").getAsBoolean());
        }
        if (jsonObject.has("strikethrough")) {
            class7266.method22252(jsonObject.get("strikethrough").getAsBoolean());
        }
        if (jsonObject.has("obfuscated")) {
            class7266.method22253(jsonObject.get("obfuscated").getAsBoolean());
        }
        if (jsonObject.has("insertion")) {
            class7266.method22254(jsonObject.get("insertion").getAsString());
        }
        if (jsonObject.has("extra")) {
            class7266.method22242(Arrays.asList(jsonDeserializationContext.deserialize(jsonObject.get("extra"), Class7266[].class)));
        }
        if (jsonObject.has("clickEvent")) {
            final JsonObject asJsonObject = jsonObject.getAsJsonObject("clickEvent");
            class7266.method22255(new Class8698(Class1995.valueOf(asJsonObject.get("action").getAsString().toUpperCase(Locale.ROOT)), asJsonObject.get("value").getAsString()));
        }
        if (jsonObject.has("hoverEvent")) {
            final JsonObject asJsonObject2 = jsonObject.getAsJsonObject("hoverEvent");
            Class7266[] array;
            if (!asJsonObject2.get("value").isJsonArray()) {
                array = new Class7266[] {jsonDeserializationContext.deserialize(asJsonObject2.get("value"), Class7266.class)};
            }
            else {
                array = jsonDeserializationContext.deserialize(asJsonObject2.get("value"), Class7266[].class);
            }
            class7266.method22256(new Class7566(Class2111.valueOf(asJsonObject2.get("action").getAsString().toUpperCase(Locale.ROOT)), array));
        }
    }
    
    public void serialize(final JsonObject jsonObject, final Class7266 o, final JsonSerializationContext jsonSerializationContext) {
        boolean b = false;
        if (Class5977.field24459.get() == null) {
            b = true;
            Class5977.field24459.set(new HashSet<Class7266>());
        }
        try {
            Preconditions.checkArgument(!Class5977.field24459.get().contains(o), "Component loop");
            Class5977.field24459.get().add(o);
            if (o.method22231() != null) {
                jsonObject.addProperty("color", o.method22231().method957());
            }
            if (o.method22233() != null) {
                jsonObject.addProperty("bold", o.method22233());
            }
            if (o.method22235() != null) {
                jsonObject.addProperty("italic", o.method22235());
            }
            if (o.method22237() != null) {
                jsonObject.addProperty("underlined", o.method22237());
            }
            if (o.method22239() != null) {
                jsonObject.addProperty("strikethrough", o.method22239());
            }
            if (o.method22241() != null) {
                jsonObject.addProperty("obfuscated", o.method22241());
            }
            if (o.method22257() != null) {
                jsonObject.addProperty("insertion", o.method22257());
            }
            if (o.method22258() != null) {
                jsonObject.add("extra", jsonSerializationContext.serialize(o.method22258()));
            }
            if (o.method22259() != null) {
                final JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty("action", o.method22259().method29816().toString().toLowerCase(Locale.ROOT));
                jsonObject2.addProperty("value", o.method22259().method29817());
                jsonObject.add("clickEvent", jsonObject2);
            }
            if (o.method22260() != null) {
                final JsonObject jsonObject3 = new JsonObject();
                jsonObject3.addProperty("action", o.method22260().method23752().toString().toLowerCase(Locale.ROOT));
                jsonObject3.add("value", jsonSerializationContext.serialize(o.method22260().method23753()));
                jsonObject.add("hoverEvent", jsonObject3);
            }
        }
        finally {
            Class5977.field24459.get().remove(o);
            if (b) {
                Class5977.field24459.set(null);
            }
        }
    }
}
