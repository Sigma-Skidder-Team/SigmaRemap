// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;

public class Class6245 extends Class6227<Class132>
{
    public Class6245() {
        super(new ResourceLocation("set_count"), Class132.class);
    }
    
    public void method18579(final JsonObject jsonObject, final Class132 class132, final JsonSerializationContext jsonSerializationContext) {
        super.method18536(jsonObject, class132, jsonSerializationContext);
        jsonObject.add("count", Class9411.method35008(Class132.method665(class132), jsonSerializationContext));
    }
    
    public Class132 method18580(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext, final Class122[] array) {
        return new Class132(array, Class9411.method35007(jsonObject.get("count"), jsonDeserializationContext), null);
    }
}
