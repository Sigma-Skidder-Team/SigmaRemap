// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import org.apache.commons.lang3.ArrayUtils;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;

public abstract class Class6227<T extends Class126> extends Class6230<T>
{
    public Class6227(final ResourceLocation class1932, final Class<T> clazz) {
        super(class1932, clazz);
    }
    
    public void method18536(final JsonObject jsonObject, final T t, final JsonSerializationContext jsonSerializationContext) {
        if (!ArrayUtils.isEmpty((Object[])t.field383)) {
            jsonObject.add("conditions", jsonSerializationContext.serialize((Object)t.field383));
        }
    }
    
    public final T method18539(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext) {
        return this.method18535(jsonObject, jsonDeserializationContext, Class9583.method35921(jsonObject, "conditions", new Class122[0], jsonDeserializationContext, Class122[].class));
    }
    
    public abstract T method18535(final JsonObject p0, final JsonDeserializationContext p1, final Class122[] p2);
}
