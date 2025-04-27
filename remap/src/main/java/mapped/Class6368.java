// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Predicate;

public abstract class Class6368 implements Class6373
{
    public final Class122[] field25473;
    private final Predicate<Class7529> field25474;
    
    public Class6368(final Class122[] field25473) {
        this.field25473 = field25473;
        this.field25474 = Class7454.method22943(field25473);
    }
    
    public void method19015(final Class7790 class7790) {
        for (int i = 0; i < this.field25473.length; ++i) {
            this.field25473[i].method636(class7790.method25015(".condition[" + i + "]"));
        }
    }
    
    public final boolean method19019(final Class7529 class7529) {
        return this.field25474.test(class7529);
    }
}
