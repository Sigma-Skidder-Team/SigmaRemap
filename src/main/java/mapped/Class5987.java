// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import com.google.gson.JsonArray;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.JsonParseException;
import com.google.common.collect.Lists;
import com.google.gson.JsonDeserializationContext;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import com.google.gson.JsonDeserializer;

public class Class5987 implements JsonDeserializer<Class7683>
{
    public Class7683 deserialize(final JsonElement jsonElement, final Type type, final JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        final ArrayList arrayList = Lists.newArrayList();
        if (!jsonElement.isJsonArray()) {
            arrayList.add(jsonDeserializationContext.deserialize(jsonElement, (Type)Class2124.class));
        }
        else {
            final JsonArray asJsonArray = jsonElement.getAsJsonArray();
            if (asJsonArray.size() == 0) {
                throw new JsonParseException("Empty variant array");
            }
            final Iterator iterator = asJsonArray.iterator();
            while (iterator.hasNext()) {
                arrayList.add(jsonDeserializationContext.deserialize((JsonElement)iterator.next(), (Type)Class2124.class));
            }
        }
        return new Class7683(arrayList);
    }
}
