// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class Class8529
{
    public static void method28609(final JsonObject jsonObject, final Class6108 class6108) {
        if (jsonObject.get("translate") != null) {
            if (jsonObject.get("translate").getAsString().equals("gameMode.changed")) {
                final String method8207 = class6108.method18207(Class6634.class).method20113().method8207();
                final JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty("text", method8207);
                jsonObject2.addProperty("color", "gray");
                jsonObject2.addProperty("italic", Boolean.valueOf(true));
                final JsonArray jsonArray = new JsonArray();
                jsonArray.add(jsonObject2);
                jsonObject.add("with", jsonArray);
            }
        }
    }
}
