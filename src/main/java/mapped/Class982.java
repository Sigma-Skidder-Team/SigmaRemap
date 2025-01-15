// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class982 implements Runnable
{
    private static String[] field5235;
    public final /* synthetic */ long field5236;
    public final /* synthetic */ long field5237;
    public final /* synthetic */ Class22 field5238;
    public final /* synthetic */ long field5239;
    public final /* synthetic */ Class22 field5240;
    public final /* synthetic */ Class8328 field5241;
    
    public Class982(final Class8328 field5241, final long field5242, final long field5243, final Class22 field5244, final long field5245, final Class22 field5246) {
        this.field5241 = field5241;
        this.field5236 = field5242;
        this.field5237 = field5243;
        this.field5238 = field5244;
        this.field5239 = field5245;
        this.field5240 = field5246;
    }
    
    @Override
    public void run() {
        for (long field5236 = this.field5236; field5236 < this.field5237; ++field5236) {
            final long n = 2L * field5236;
            for (long n2 = 0L; n2 < Class8328.method27762(this.field5241); ++n2) {
                final long n3 = 2L * n2;
                final long n4 = n2 * Class8328.method27764(this.field5241) + n;
                this.field5238.method171(field5236 * this.field5239 + n3, this.field5240.method135(n4));
                this.field5238.method171(field5236 * this.field5239 + n3 + 1L, this.field5240.method135(n4 + 1L));
            }
            Class8328.method27761(this.field5241).method25928(this.field5238, field5236 * this.field5239);
        }
    }
}
