// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.ArrayList;

import com.google.common.collect.Lists;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;

public class Class6247 extends Class6227<Class147>
{
    public Class6247() {
        super(new ResourceLocation("copy_nbt"), Class147.class);
    }
    
    public void method18582(final JsonObject jsonObject, final Class147 class147, final JsonSerializationContext jsonSerializationContext) {
        super.method18536(jsonObject, class147, jsonSerializationContext);
        jsonObject.addProperty("source", Class147.method716(class147).field11716);
        final JsonArray jsonArray = new JsonArray();
        Class147.method717(class147).stream().map(Class9254::method34145).forEach(jsonArray::add);
        jsonObject.add("ops", (JsonElement)jsonArray);
    }
    
    public Class147 method18583(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext, final Class122[] array) {
        final Class2053 method8146 = Class2053.method8146(Class9583.method35895(jsonObject, "source"));
        final ArrayList arrayList = Lists.newArrayList();
        final Iterator iterator = Class9583.method35917(jsonObject, "ops").iterator();
        while (iterator.hasNext()) {
            arrayList.add(Class9254.method34146(Class9583.method35913((JsonElement)iterator.next(), "op")));
        }
        return new Class147(array, method8146, arrayList, null);
    }
}
