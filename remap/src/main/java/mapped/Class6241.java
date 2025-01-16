// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;

public class Class6241 extends Class6227<Class145>
{
    public Class6241() {
        super(new ResourceLocation("set_contents"), Class145.class);
    }
    
    public void method18571(final JsonObject jsonObject, final Class145 class145, final JsonSerializationContext jsonSerializationContext) {
        super.method18536(jsonObject, class145, jsonSerializationContext);
        jsonObject.add("entries", jsonSerializationContext.serialize((Object)Class145.method705(class145)));
    }
    
    public Class145 method18572(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext, final Class122[] array) {
        return new Class145(array, Arrays.asList((Class6368[])Class9583.method35920(jsonObject, "entries", jsonDeserializationContext, (Class<? extends Class6368[]>)Class6368[].class)), null);
    }
}
