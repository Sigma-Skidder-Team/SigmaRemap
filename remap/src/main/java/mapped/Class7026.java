// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.LinkedHashMap;
import java.util.Set;
import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import java.util.Map;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;

public class Class7026 extends Class7020<Class152>
{
    public Class7026() {
        super(new ResourceLocation("entity_scores"), Class152.class);
    }
    
    public void method21497(final JsonObject jsonObject, final Class152 class152, final JsonSerializationContext jsonSerializationContext) {
        final JsonObject jsonObject2 = new JsonObject();
        for (final Map.Entry<String, V> entry : Class152.method734(class152).entrySet()) {
            jsonObject2.add(entry.getKey(), jsonSerializationContext.serialize(entry.getValue()));
        }
        jsonObject.add("scores", jsonObject2);
        jsonObject.add("entity", jsonSerializationContext.serialize((Object)Class152.method735(class152)));
    }
    
    public Class152 method21498(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        final Set entrySet = Class9583.method35914(jsonObject, "scores").entrySet();
        final LinkedHashMap linkedHashMap = Maps.newLinkedHashMap();
        for (final Map.Entry<Object, V> entry : entrySet) {
            linkedHashMap.put(entry.getKey(), Class9583.method35919((JsonElement)entry.getValue(), "score", jsonDeserializationContext, (Class<?>)Class5772.class));
        }
        return new Class152(linkedHashMap, Class9583.method35920(jsonObject, "entity", jsonDeserializationContext, (Class<? extends Class2065>)Class2065.class), null);
    }
}
