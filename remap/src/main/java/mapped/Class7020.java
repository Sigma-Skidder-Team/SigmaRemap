// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;

public abstract class Class7020<T extends Class122>
{
    private final ResourceLocation field27404;
    private final Class<T> field27405;
    
    public Class7020(final ResourceLocation field27404, final Class<T> field27405) {
        this.field27404 = field27404;
        this.field27405 = field27405;
    }
    
    public ResourceLocation method21484() {
        return this.field27404;
    }
    
    public Class<T> method21485() {
        return this.field27405;
    }
    
    public abstract void method21483(final JsonObject p0, final T p1, final JsonSerializationContext p2);
    
    public abstract T method21482(final JsonObject p0, final JsonDeserializationContext p1);
}
