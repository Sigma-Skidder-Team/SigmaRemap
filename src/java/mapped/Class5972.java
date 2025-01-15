// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;
import com.google.gson.JsonObject;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonDeserializer;

public class Class5972 implements JsonDeserializer<Class8435>
{
    public Class8435 deserialize(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        final JsonObject asJsonObject = jsonElement.getAsJsonObject();
        return new Class8435(this.method17892(asJsonObject), this.method17891(asJsonObject));
    }
    
    public int method17891(final JsonObject jsonObject) {
        final int method35910 = Class9583.method35910(jsonObject, "rotation", 0);
        if (method35910 >= 0) {
            if (method35910 % 90 == 0) {
                if (method35910 / 90 <= 3) {
                    return method35910;
                }
            }
        }
        throw new JsonParseException("Invalid rotation " + method35910 + " found, only 0/90/180/270 allowed");
    }
    
    @Nullable
    private float[] method17892(final JsonObject jsonObject) {
        if (!jsonObject.has("uv")) {
            return null;
        }
        final JsonArray method35917 = Class9583.method35917(jsonObject, "uv");
        if (method35917.size() == 4) {
            final float[] array = new float[4];
            for (int i = 0; i < array.length; ++i) {
                array[i] = Class9583.method35902(method35917.get(i), "uv[" + i + "]");
            }
            return array;
        }
        throw new JsonParseException("Expected 4 uv values, found: " + method35917.size());
    }
}
