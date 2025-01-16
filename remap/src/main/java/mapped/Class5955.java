// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.commons.lang3.ArrayUtils;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonDeserializer;

public class Class5955 implements JsonDeserializer<Class6368>, JsonSerializer<Class6368>
{
    public Class6368 deserialize(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) {
        final JsonObject method35913 = Class9583.method35913(jsonElement, "entry");
        final ResourceLocation obj = new ResourceLocation(Class9583.method35895(method35913, "type"));
        final Class6529 class6529 = Class8527.method28607().get(obj);
        if (class6529 != null) {
            return class6529.method19752(method35913, jsonDeserializationContext, Class9583.method35921(method35913, "conditions", new Class122[0], jsonDeserializationContext, Class122[].class));
        }
        throw new JsonParseException("Unknown item type: " + obj);
    }
    
    public JsonElement serialize(final Class6368 class6368, final Type type, final JsonSerializationContext jsonSerializationContext) {
        final JsonObject jsonObject = new JsonObject();
        final Class6529<Class6368> method17879 = method17879(class6368.getClass());
        jsonObject.addProperty("type", method17879.method19754().toString());
        if (!ArrayUtils.isEmpty((Object[])class6368.field25473)) {
            jsonObject.add("conditions", jsonSerializationContext.serialize((Object)class6368.field25473));
        }
        method17879.method19753(jsonObject, class6368, jsonSerializationContext);
        return (JsonElement)jsonObject;
    }
    
    private static Class6529<Class6368> method17879(final Class<?> obj) {
        final Class6529 class6529 = Class8527.method28608().get(obj);
        if (class6529 != null) {
            return class6529;
        }
        throw new JsonParseException("Unknown item type: " + obj);
    }
}
