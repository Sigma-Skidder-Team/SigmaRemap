// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.Callable;

public final class Class7076 implements Callable
{
    private static String[] field27556;
    public final /* synthetic */ long field27557;
    public final /* synthetic */ long field27558;
    public final /* synthetic */ Class23 field27559;
    
    public Class7076(final long field27557, final long field27558, final Class23 field27559) {
        this.field27557 = field27557;
        this.field27558 = field27558;
        this.field27559 = field27559;
    }
    
    @Override
    public Long call() {
        long l = 0L;
        for (long field27557 = this.field27557; field27557 < this.field27558; ++field27557) {
            if (this.field27559.method125(field27557) == 1) {
                ++l;
            }
        }
        return l;
    }
}
