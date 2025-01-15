// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonObject;

public abstract class Class6529<T extends Class6368>
{
    private final Class1932 field25977;
    private final Class<T> field25978;
    
    public Class6529(final Class1932 field25977, final Class<T> field25978) {
        this.field25977 = field25977;
        this.field25978 = field25978;
    }
    
    public Class1932 method19754() {
        return this.field25977;
    }
    
    public Class<T> method19755() {
        return this.field25978;
    }
    
    public abstract void method19753(final JsonObject p0, final T p1, final JsonSerializationContext p2);
    
    public abstract T method19752(final JsonObject p0, final JsonDeserializationContext p1, final Class122[] p2);
}
