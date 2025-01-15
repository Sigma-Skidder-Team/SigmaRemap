// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.annotations.VisibleForTesting;
import java.util.Set;
import java.util.Map;
import com.google.common.collect.Streams;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.function.Function;
import com.google.gson.JsonParseException;
import com.google.gson.JsonObject;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonDeserializer;

public class Class5973 implements JsonDeserializer<Class8997>
{
    public Class8997 deserialize(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        final JsonObject asJsonObject = jsonElement.getAsJsonObject();
        return new Class8997(this.method17893(asJsonObject), (Class7683)jsonDeserializationContext.deserialize(asJsonObject.get("apply"), (Type)Class7683.class));
    }
    
    private Class7410 method17893(final JsonObject jsonObject) {
        return jsonObject.has("when") ? method17894(Class9583.method35914(jsonObject, "when")) : Class7410.field28544;
    }
    
    @VisibleForTesting
    public static Class7410 method17894(final JsonObject jsonObject) {
        final Set entrySet = jsonObject.entrySet();
        if (entrySet.isEmpty()) {
            throw new JsonParseException("No elements found in selector");
        }
        if (entrySet.size() != 1) {
            return new Class7413((Iterable<? extends Class7410>)entrySet.stream().map(Class5973::method17895).collect(Collectors.toList()));
        }
        if (jsonObject.has("OR")) {
            return new Class7411((Iterable<? extends Class7410>)Streams.stream((Iterable)Class9583.method35917(jsonObject, "OR")).map(jsonElement -> method17894(jsonElement.getAsJsonObject())).collect((Collector<? super Object, ?, List<Object>>)Collectors.toList()));
        }
        if (!jsonObject.has("AND")) {
            return method17895(entrySet.iterator().next());
        }
        return new Class7413((Iterable<? extends Class7410>)Streams.stream((Iterable)Class9583.method35917(jsonObject, "AND")).map(jsonElement2 -> method17894(jsonElement2.getAsJsonObject())).collect((Collector<? super Object, ?, List<Object>>)Collectors.toList()));
    }
    
    private static Class7410 method17895(final Map.Entry<String, JsonElement> entry) {
        return new Class7412(entry.getKey(), entry.getValue().getAsString());
    }
}
