// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonParseException;
import com.google.gson.JsonObject;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonDeserializer;

public class Class5984 implements JsonDeserializer<Class2124>
{
    public Class2124 deserialize(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        final JsonObject asJsonObject = jsonElement.getAsJsonObject();
        return new Class2124(this.method17908(asJsonObject), this.method17907(asJsonObject).method8274(), this.method17906(asJsonObject), this.method17909(asJsonObject));
    }
    
    private boolean method17906(final JsonObject jsonObject) {
        return Class9583.method35901(jsonObject, "uvlock", false);
    }
    
    public Class2122 method17907(final JsonObject jsonObject) {
        final int method35910 = Class9583.method35910(jsonObject, "x", 0);
        final int method35911 = Class9583.method35910(jsonObject, "y", 0);
        final Class2122 method35912 = Class2122.method8275(method35910, method35911);
        if (method35912 != null) {
            return method35912;
        }
        throw new JsonParseException("Invalid BlockModelRotation x: " + method35910 + ", y: " + method35911);
    }
    
    public ResourceLocation method17908(final JsonObject jsonObject) {
        return new ResourceLocation(Class9583.method35895(jsonObject, "model"));
    }
    
    public int method17909(final JsonObject jsonObject) {
        final int method35910 = Class9583.method35910(jsonObject, "weight", 1);
        if (method35910 >= 1) {
            return method35910;
        }
        throw new JsonParseException("Invalid weight " + method35910 + " found, expected integer >= 1");
    }
}
