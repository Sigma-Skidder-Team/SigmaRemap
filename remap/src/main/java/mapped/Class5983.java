// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;
import com.google.gson.JsonObject;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonDeserializer;
import net.minecraft.client.renderer.Vector3f;

public class Class5983 implements JsonDeserializer<Class6429>
{
    private static final Vector3f field24460;
    private static final Vector3f field24461;
    private static final Vector3f field24462;
    
    public Class6429 deserialize(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        final JsonObject asJsonObject = jsonElement.getAsJsonObject();
        final Vector3f method17905 = this.method17905(asJsonObject, "rotation", Class5983.field24460);
        final Vector3f method17906 = this.method17905(asJsonObject, "translation", Class5983.field24461);
        method17906.mul(0.0625f);
        method17906.clamp(-5.0f, 5.0f);
        final Vector3f method17907 = this.method17905(asJsonObject, "scale", Class5983.field24462);
        method17907.clamp(-4.0f, 4.0f);
        return new Class6429(method17905, method17906, method17907);
    }
    
    private Vector3f method17905(final JsonObject jsonObject, final String s, final Vector3f class9138) {
        if (!jsonObject.has(s)) {
            return class9138;
        }
        final JsonArray method35917 = Class9583.method35917(jsonObject, s);
        if (method35917.size() == 3) {
            final float[] array = new float[3];
            for (int i = 0; i < array.length; ++i) {
                array[i] = Class9583.method35902(method35917.get(i), s + "[" + i + "]");
            }
            return new Vector3f(array[0], array[1], array[2]);
        }
        throw new JsonParseException("Expected 3 " + s + " values, found: " + method35917.size());
    }
    
    static {
        field24460 = new Vector3f(0.0f, 0.0f, 0.0f);
        field24461 = new Vector3f(0.0f, 0.0f, 0.0f);
        field24462 = new Vector3f(1.0f, 1.0f, 1.0f);
    }
}
