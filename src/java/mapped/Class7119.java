// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.TimeUnit;

public class Class7119 implements Class7118
{
    private static String[] field27753;
    private final Object field27754;
    private final Runnable field27755;
    private long field27756;
    private long field27757;
    public final /* synthetic */ Class6558 field27758;
    
    private Class7119(final Class6558 field27758, final Object field27759, final Runnable field27760) {
        this.field27758 = field27758;
        this.field27754 = field27759;
        this.field27755 = field27760;
    }
    
    @Override
    public Class7118 method21851(final long duration, final TimeUnit timeUnit) {
        this.field27756 = timeUnit.toMillis(duration);
        return this;
    }
    
    @Override
    public Class7118 method21852(final long duration, final TimeUnit timeUnit) {
        this.field27757 = timeUnit.toMillis(duration);
        return this;
    }
    
    @Override
    public Class7118 method21853() {
        this.field27756 = 0L;
        return this;
    }
    
    @Override
    public Class7118 method21854() {
        this.field27757 = 0L;
        return this;
    }
    
    @Override
    public Class988 method21855() {
        final Class987 class987 = new Class987(this.field27758, this.field27754, this.field27755, this.field27756, this.field27757, null);
        Class6558.method19879(this.field27758).put(this.field27754, (Object)class987);
        class987.method5599();
        return class987;
    }
}
