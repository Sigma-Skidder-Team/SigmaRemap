// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;

public class Class6533 extends Class6528<Class6375>
{
    public Class6533() {
        super(new ResourceLocation("loot_table"), Class6375.class);
    }
    
    public void method19761(final JsonObject jsonObject, final Class6375 class6375, final JsonSerializationContext jsonSerializationContext) {
        super.method19750(jsonObject, class6375, jsonSerializationContext);
        jsonObject.addProperty("name", Class6375.method19038(class6375).toString());
    }
    
    public Class6375 method19762(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext, final int n, final int n2, final Class122[] array, final Class125[] array2) {
        return new Class6375(new ResourceLocation(Class9583.method35895(jsonObject, "name")), n, n2, array, array2, null);
    }
}
