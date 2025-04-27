// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.util.Iterator;
import java.util.HashMap;
import com.google.common.collect.Maps;
import java.util.Map;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonDeserializer;

public class Class5976 implements JsonDeserializer<Class5593>
{
    public Class5593 deserialize(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        final JsonObject asJsonObject = jsonElement.getAsJsonObject();
        final Map<String, Class7683> method17898 = this.method17898(jsonDeserializationContext, asJsonObject);
        final Class7686 method17899 = this.method17899(jsonDeserializationContext, asJsonObject);
        if (method17898.isEmpty() && (method17899 == null || method17899.method24405().isEmpty())) {
            throw new JsonParseException("Neither 'variants' nor 'multipart' found");
        }
        return new Class5593(method17898, method17899);
    }
    
    public Map<String, Class7683> method17898(final JsonDeserializationContext jsonDeserializationContext, final JsonObject jsonObject) {
        final HashMap hashMap = Maps.newHashMap();
        if (jsonObject.has("variants")) {
            for (final Map.Entry<Object, V> entry : Class9583.method35914(jsonObject, "variants").entrySet()) {
                hashMap.put(entry.getKey(), jsonDeserializationContext.deserialize((JsonElement)entry.getValue(), Class7683.class));
            }
        }
        return hashMap;
    }
    
    @Nullable
    public Class7686 method17899(final JsonDeserializationContext jsonDeserializationContext, final JsonObject jsonObject) {
        if (jsonObject.has("multipart")) {
            return jsonDeserializationContext.deserialize(Class9583.method35917(jsonObject, "multipart"), Class7686.class);
        }
        return null;
    }
}
