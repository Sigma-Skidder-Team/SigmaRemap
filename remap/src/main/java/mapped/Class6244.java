// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;

public class Class6244 extends Class6227<Class143>
{
    public Class6244() {
        super(new ResourceLocation("limit_count"), Class143.class);
    }
    
    public void method18577(final JsonObject jsonObject, final Class143 class143, final JsonSerializationContext jsonSerializationContext) {
        super.method18536(jsonObject, class143, jsonSerializationContext);
        jsonObject.add("limit", jsonSerializationContext.serialize((Object)Class143.method698(class143)));
    }
    
    public Class143 method18578(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext, final Class122[] array) {
        return new Class143(array, Class9583.method35920(jsonObject, "limit", jsonDeserializationContext, (Class<? extends Class9299>)Class9299.class), null);
    }
}
