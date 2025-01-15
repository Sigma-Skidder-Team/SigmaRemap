// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.Collection;
import com.google.gson.JsonSyntaxException;
import com.google.common.collect.Lists;
import com.google.gson.JsonDeserializationContext;
import java.util.Iterator;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonArray;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;

public class Class6239 extends Class6227<Class141>
{
    public Class6239() {
        super(new Class1932("enchant_randomly"), Class141.class);
    }
    
    public void method18566(final JsonObject jsonObject, final Class141 class141, final JsonSerializationContext jsonSerializationContext) {
        super.method18536(jsonObject, class141, jsonSerializationContext);
        if (!Class141.method692(class141).isEmpty()) {
            final JsonArray jsonArray = new JsonArray();
            for (final Class6257 obj : Class141.method692(class141)) {
                final Class1932 method503 = Class90.field209.method503(obj);
                if (method503 == null) {
                    throw new IllegalArgumentException("Don't know how to serialize enchantment " + obj);
                }
                jsonArray.add((JsonElement)new JsonPrimitive(method503.toString()));
            }
            jsonObject.add("enchantments", (JsonElement)jsonArray);
        }
    }
    
    public Class141 method18567(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext, final Class122[] array) {
        final ArrayList arrayList = Lists.newArrayList();
        if (jsonObject.has("enchantments")) {
            final Iterator iterator = Class9583.method35917(jsonObject, "enchantments").iterator();
            while (iterator.hasNext()) {
                arrayList.add(Class90.field209.method506(new Class1932(Class9583.method35894((JsonElement)iterator.next(), "enchantment"))).orElseThrow(() -> {
                    new JsonSyntaxException("Unknown enchantment '" + str + "'");
                    return;
                }));
            }
        }
        return new Class141(array, arrayList, null);
    }
}
