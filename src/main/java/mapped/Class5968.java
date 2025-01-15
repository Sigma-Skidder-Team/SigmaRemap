// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.LinkedHashMap;
import com.google.common.collect.Maps;
import java.util.Map;
import com.google.gson.JsonParseException;
import com.google.gson.JsonObject;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonDeserializer;

public class Class5968 implements JsonDeserializer<Class6559>
{
    public Class6559 deserialize(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        final JsonObject asJsonObject = jsonElement.getAsJsonObject();
        return new Class6559(new Class1932(Class9583.method35895(asJsonObject, "model")), this.method17881(asJsonObject));
    }
    
    public Map<Class1932, Float> method17881(final JsonObject jsonObject) {
        final LinkedHashMap linkedHashMap = Maps.newLinkedHashMap();
        for (final Map.Entry<String, V> entry : Class9583.method35914(jsonObject, "predicate").entrySet()) {
            linkedHashMap.put(new Class1932(entry.getKey()), Class9583.method35902((JsonElement)entry.getValue(), entry.getKey()));
        }
        return linkedHashMap;
    }
}
