// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;

public class Class6234 extends Class6227<Class131>
{
    public Class6234() {
        super(new ResourceLocation("set_loot_table"), Class131.class);
    }
    
    public void method18554(final JsonObject jsonObject, final Class131 class131, final JsonSerializationContext jsonSerializationContext) {
        super.method18536(jsonObject, class131, jsonSerializationContext);
        jsonObject.addProperty("name", Class131.method661(class131).toString());
        if (Class131.method662(class131) != 0L) {
            jsonObject.addProperty("seed", (Number)Class131.method662(class131));
        }
    }
    
    public Class131 method18555(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext, final Class122[] array) {
        return new Class131(array, new ResourceLocation(Class9583.method35895(jsonObject, "name")), Class9583.method35907(jsonObject, "seed", 0L), null);
    }
}
