// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;

public class Class6233 extends Class6227<Class133>
{
    public Class6233() {
        super(new Class1932("enchant_with_levels"), Class133.class);
    }
    
    public void method18552(final JsonObject jsonObject, final Class133 class133, final JsonSerializationContext jsonSerializationContext) {
        super.method18536(jsonObject, class133, jsonSerializationContext);
        jsonObject.add("levels", Class9411.method35008(Class133.method667(class133), jsonSerializationContext));
        jsonObject.addProperty("treasure", Boolean.valueOf(Class133.method668(class133)));
    }
    
    public Class133 method18553(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext, final Class122[] array) {
        return new Class133(array, Class9411.method35007(jsonObject.get("levels"), jsonDeserializationContext), Class9583.method35901(jsonObject, "treasure", false), null);
    }
}
