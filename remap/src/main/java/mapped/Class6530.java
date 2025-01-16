// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;

public abstract class Class6530<T extends Class6369> extends Class6529<T>
{
    public Class6530(final ResourceLocation class1932, final Class<T> clazz) {
        super(class1932, clazz);
    }
    
    public void method19756(final JsonObject jsonObject, final T t, final JsonSerializationContext jsonSerializationContext) {
        jsonObject.add("children", jsonSerializationContext.serialize((Object)t.field25475));
    }
    
    public final T method19757(final JsonObject jsonObject, final JsonDeserializationContext jsonDeserializationContext, final Class122[] array) {
        return this.method19758(jsonObject, jsonDeserializationContext, Class9583.method35920(jsonObject, "children", jsonDeserializationContext, (Class<? extends Class6368[]>)Class6368[].class), array);
    }
    
    public abstract T method19758(final JsonObject p0, final JsonDeserializationContext p1, final Class6368[] p2, final Class122[] p3);
}
