// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.util.regex.Pattern;

public class Class8451
{
    private static Pattern field34714;
    
    public static void method28197(final JsonElement jsonElement, final Class6108 class6108) {
        if (!(jsonElement instanceof JsonObject)) {
            if (jsonElement instanceof JsonArray) {
                final Iterator iterator = ((JsonArray)jsonElement).iterator();
                while (iterator.hasNext()) {
                    method28197((JsonElement)iterator.next(), class6108);
                }
            }
        }
        else {
            final JsonObject jsonObject = (JsonObject)jsonElement;
            if (!jsonObject.has("hoverEvent")) {
                if (jsonObject.has("extra")) {
                    method28197(jsonObject.get("extra"), class6108);
                }
            }
            else if (jsonObject.get("hoverEvent") instanceof JsonObject) {
                final JsonObject jsonObject2 = (JsonObject)jsonObject.get("hoverEvent");
                if (jsonObject2.has("action")) {
                    if (jsonObject2.has("value")) {
                        final String asString = jsonObject2.get("action").getAsString();
                        if (asString.equals("show_item") || asString.equals("show_entity")) {
                            final JsonElement value = jsonObject2.get("value");
                            if (value.isJsonPrimitive() && value.getAsJsonPrimitive().isString()) {
                                jsonObject2.addProperty("value", Class8451.field34714.matcher(value.getAsString()).replaceAll(""));
                            }
                            else if (value.isJsonArray()) {
                                final JsonArray jsonArray = new JsonArray();
                                for (final JsonElement jsonElement2 : value.getAsJsonArray()) {
                                    if (!jsonElement2.isJsonPrimitive()) {
                                        continue;
                                    }
                                    if (!jsonElement2.getAsJsonPrimitive().isString()) {
                                        continue;
                                    }
                                    jsonArray.add(new JsonPrimitive(Class8451.field34714.matcher(jsonElement2.getAsString()).replaceAll("")));
                                }
                                jsonObject2.add("value", jsonArray);
                            }
                        }
                    }
                }
            }
        }
    }
    
    static {
        Class8451.field34714 = Pattern.compile("\\d+:(?=([^\"\\\\]*(\\\\.|\"([^\"\\\\]*\\\\.)*[^\"\\\\]*\"))*[^\"]*$)");
    }
}
