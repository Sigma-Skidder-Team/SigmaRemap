// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;

public class Class8397
{
    public static boolean method28000(final JsonElement jsonElement, final Class6108 class6108) {
        if (jsonElement instanceof JsonObject) {
            final JsonObject jsonObject = (JsonObject)jsonElement;
            if (jsonObject.has("translate")) {
                return !jsonObject.get("translate").getAsString().equals("chat.type.achievement");
            }
        }
        return true;
    }
}
