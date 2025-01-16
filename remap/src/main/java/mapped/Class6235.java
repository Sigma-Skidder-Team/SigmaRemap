// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashSet;

import com.google.common.collect.Sets;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;

public class Class6235 extends Class6227<Class137>
{
    public Class6235() {
        super(new ResourceLocation("copy_state"), Class137.class);
    }
    
    public void method18556(final JsonObject jsonObject, final Class137 class137, final JsonSerializationContext jsonSerializationContext) {
        super.method18536(jsonObject, class137, jsonSerializationContext);
        jsonObject.addProperty("block", Registry.BLOCK.getKey(Class137.method678(class137)).toString());
        final JsonArray jsonArray = new JsonArray();
        Class137.method679(class137).forEach(class138 -> jsonArray2.add(class138.method21826()));
        jsonObject.add("properties", (JsonElement)jsonArray);
    }
    
    public Class137 method18557(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext, final Class122[] array) {
        final Block class3833 = Registry.BLOCK.method506(new ResourceLocation(Class9583.method35895(jsonObject, "block"))).orElseThrow(() -> {
            new IllegalArgumentException("Can't find block " + obj);
            return;
        });
        class3833.getStateContainer();
        final HashSet hashSet = Sets.newHashSet();
        final JsonArray method35918 = Class9583.method35918(jsonObject, "properties", null);
        if (method35918 != null) {
            method35918.forEach(jsonElement -> set.add(class3834.method32906(Class9583.method35894(jsonElement, "property"))));
        }
        return new Class137(array, class3833, hashSet, null);
    }
}
