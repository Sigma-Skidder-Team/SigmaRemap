// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;

public abstract class Class6230<T extends Class125>
{
    private final ResourceLocation field25095;
    private final Class<T> field25096;
    
    public Class6230(final ResourceLocation field25095, final Class<T> field25096) {
        this.field25095 = field25095;
        this.field25096 = field25096;
    }
    
    public ResourceLocation method18545() {
        return this.field25095;
    }
    
    public Class<T> method18546() {
        return this.field25096;
    }
    
    public abstract void method18537(final JsonObject p0, final T p1, final JsonSerializationContext p2);
    
    public abstract T method18540(final JsonObject p0, final JsonDeserializationContext p1);
}
