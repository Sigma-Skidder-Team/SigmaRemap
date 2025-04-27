// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import com.google.gson.JsonSyntaxException;
import com.google.common.collect.Lists;
import com.google.gson.JsonDeserializationContext;
import java.util.Iterator;
import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;

public class Class6240 extends Class6227<Class127>
{
    public Class6240() {
        super(new ResourceLocation("set_attributes"), Class127.class);
    }
    
    public void method18569(final JsonObject jsonObject, final Class127 class127, final JsonSerializationContext jsonSerializationContext) {
        super.method18536(jsonObject, class127, jsonSerializationContext);
        final JsonArray jsonArray = new JsonArray();
        final Iterator iterator = Class127.method641(class127).iterator();
        while (iterator.hasNext()) {
            jsonArray.add(((Class7376)iterator.next()).method22642(jsonSerializationContext));
        }
        jsonObject.add("modifiers", jsonArray);
    }
    
    public Class127 method18570(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext, final Class122[] array) {
        final JsonArray method35917 = Class9583.method35917(jsonObject, "modifiers");
        final ArrayList arrayListWithExpectedSize = Lists.newArrayListWithExpectedSize(method35917.size());
        final Iterator iterator = method35917.iterator();
        while (iterator.hasNext()) {
            arrayListWithExpectedSize.add(Class7376.method22643(Class9583.method35913((JsonElement)iterator.next(), "modifier"), jsonDeserializationContext));
        }
        if (!arrayListWithExpectedSize.isEmpty()) {
            return new Class127(array, arrayListWithExpectedSize, null);
        }
        throw new JsonSyntaxException("Invalid attribute modifiers array; cannot be empty");
    }
}
