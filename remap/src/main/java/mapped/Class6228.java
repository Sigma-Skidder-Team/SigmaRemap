// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;

public class Class6228 extends Class6227<Class134>
{
    public Class6228() {
        super(new ResourceLocation("set_damage"), Class134.class);
    }
    
    public void method18541(final JsonObject jsonObject, final Class134 class134, final JsonSerializationContext jsonSerializationContext) {
        super.method18536(jsonObject, class134, jsonSerializationContext);
        jsonObject.add("damage", jsonSerializationContext.serialize((Object)Class134.method671(class134)));
    }
    
    public Class134 method18542(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext, final Class122[] array) {
        return new Class134(array, Class9583.method35920(jsonObject, "damage", jsonDeserializationContext, (Class<? extends Class5772>)Class5772.class), null);
    }
}
