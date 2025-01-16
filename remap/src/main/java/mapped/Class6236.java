// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;

public class Class6236 extends Class6227<Class128>
{
    public Class6236() {
        super(new ResourceLocation("fill_player_head"), Class128.class);
    }
    
    public void method18561(final JsonObject jsonObject, final Class128 class128, final JsonSerializationContext jsonSerializationContext) {
        super.method18536(jsonObject, class128, jsonSerializationContext);
        jsonObject.add("entity", jsonSerializationContext.serialize((Object)Class128.method642(class128)));
    }
    
    public Class128 method18562(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext, final Class122[] array) {
        return new Class128(array, Class9583.method35920(jsonObject, "entity", jsonDeserializationContext, (Class<? extends Class2065>)Class2065.class));
    }
}
