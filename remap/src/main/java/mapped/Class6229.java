// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;

public class Class6229 extends Class6227<Class138>
{
    public Class6229() {
        super(new Class1932("looting_enchant"), Class138.class);
    }
    
    public void method18543(final JsonObject jsonObject, final Class138 class138, final JsonSerializationContext jsonSerializationContext) {
        super.method18536(jsonObject, class138, jsonSerializationContext);
        jsonObject.add("count", jsonSerializationContext.serialize((Object)Class138.method682(class138)));
        if (Class138.method683(class138)) {
            jsonObject.add("limit", jsonSerializationContext.serialize((Object)Class138.method684(class138)));
        }
    }
    
    public Class138 method18544(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext, final Class122[] array) {
        return new Class138(array, Class9583.method35920(jsonObject, "count", jsonDeserializationContext, (Class<? extends Class5772>)Class5772.class), Class9583.method35910(jsonObject, "limit", 0), null);
    }
}
