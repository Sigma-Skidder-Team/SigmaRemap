// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

public class Class7236 implements Iterator<Class5835<Object>>
{
    private static String[] field28049;
    public Class5835<Object> field28050;
    public final /* synthetic */ Class8081 field28051;
    
    public Class7236(final Class8081 field28051) {
        this.field28051 = field28051;
        this.field28050 = this.field28051.method26513();
    }
    
    @Override
    public boolean hasNext() {
        return this.field28050 != null;
    }
    
    @Override
    public Class5835<Object> next() {
        final Class5835<Object> field28050 = this.field28050;
        if (this.field28050 != null) {
            this.field28050 = Class5835.method17547(this.field28050);
        }
        return field28050;
    }
}
