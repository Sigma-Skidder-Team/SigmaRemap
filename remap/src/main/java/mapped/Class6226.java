// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonParseException;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;

public class Class6226 extends Class6227<Class130>
{
    public Class6226() {
        super(new ResourceLocation("apply_bonus"), Class130.class);
    }
    
    public void method18533(final JsonObject jsonObject, final Class130 class130, final JsonSerializationContext jsonSerializationContext) {
        super.method18536(jsonObject, class130, jsonSerializationContext);
        jsonObject.addProperty("enchantment", Registry.field209.getKey(Class130.method658(class130)).toString());
        jsonObject.addProperty("formula", Class130.method659(class130).method15238().toString());
        final JsonObject jsonObject2 = new JsonObject();
        Class130.method659(class130).method15236(jsonObject2, jsonSerializationContext);
        if (jsonObject2.size() > 0) {
            jsonObject.add("parameters", jsonObject2);
        }
    }
    
    public Class130 method18534(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext, final Class122[] array) {
        final Class6257 class6257 = Registry.field209.method506(new ResourceLocation(Class9583.method35895(jsonObject, "enchantment"))).orElseThrow(() -> {
            new JsonParseException("Invalid enchantment id: " + obj2);
            return;
        });
        final ResourceLocation obj = new ResourceLocation(Class9583.method35895(jsonObject, "formula"));
        final Class9256 class6258 = Class130.method660().get(obj);
        if (class6258 != null) {
            Class5020 class6259;
            if (!jsonObject.has("parameters")) {
                class6259 = class6258.method34147(new JsonObject(), jsonDeserializationContext);
            }
            else {
                class6259 = class6258.method34147(Class9583.method35914(jsonObject, "parameters"), jsonDeserializationContext);
            }
            return new Class130(array, class6257, class6259, null);
        }
        throw new JsonParseException("Invalid formula id: " + obj);
    }
}
