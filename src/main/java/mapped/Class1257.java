// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1257 implements Runnable
{
    private static String[] field6847;
    public final /* synthetic */ long field6848;
    public final /* synthetic */ long field6849;
    public final /* synthetic */ long field6850;
    public final /* synthetic */ long field6851;
    public final /* synthetic */ Class17 field6852;
    public final /* synthetic */ Class7992 field6853;
    
    public Class1257(final Class7992 field6853, final long field6854, final long field6855, final long field6856, final long field6857, final Class17 field6858) {
        this.field6853 = field6853;
        this.field6848 = field6854;
        this.field6849 = field6855;
        this.field6850 = field6856;
        this.field6851 = field6857;
        this.field6852 = field6858;
    }
    
    @Override
    public void run() {
        for (long field6848 = this.field6848; field6848 < this.field6849; ++field6848) {
            final long n = 2L * field6848;
            final long n2 = this.field6850 + (this.field6851 - n) % this.field6851;
            this.field6852.method171(n2, this.field6852.method137(this.field6850 + n));
            this.field6852.method171(n2 + 1L, -this.field6852.method137(this.field6850 + n + 1L));
        }
    }
}
