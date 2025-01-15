// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1023 implements Runnable
{
    private static String[] field5478;
    public final /* synthetic */ long field5479;
    public final /* synthetic */ long field5480;
    public final /* synthetic */ long field5481;
    public final /* synthetic */ Class22 field5482;
    public final /* synthetic */ Class9267 field5483;
    
    public Class1023(final Class9267 field5483, final long field5484, final long field5485, final long field5486, final Class22 field5487) {
        this.field5483 = field5483;
        this.field5479 = field5484;
        this.field5480 = field5485;
        this.field5481 = field5486;
        this.field5482 = field5487;
    }
    
    @Override
    public void run() {
        final long n = this.field5479 + Class9267.method34190(this.field5483) - 1L;
        for (long field5480 = this.field5480; field5480 < this.field5481; ++field5480) {
            final long n2 = this.field5479 + field5480;
            final float method135 = this.field5482.method135(n2);
            final long n3 = n - field5480;
            this.field5482.method169(n2, this.field5482.method135(n3));
            this.field5482.method169(n3, method135);
        }
    }
}
