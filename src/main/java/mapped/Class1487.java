// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1487 implements Runnable
{
    private static String[] field8267;
    public final /* synthetic */ long field8268;
    public final /* synthetic */ long field8269;
    public final /* synthetic */ long field8270;
    public final /* synthetic */ Class22 field8271;
    public final /* synthetic */ Class9267 field8272;
    
    public Class1487(final Class9267 field8272, final long field8273, final long field8274, final long field8275, final Class22 field8276) {
        this.field8272 = field8272;
        this.field8268 = field8273;
        this.field8269 = field8274;
        this.field8270 = field8275;
        this.field8271 = field8276;
    }
    
    @Override
    public void run() {
        final long n = this.field8268 + Class9267.method34190(this.field8272) - 1L;
        for (long field8269 = this.field8269; field8269 < this.field8270; ++field8269) {
            final long n2 = this.field8268 + field8269;
            final float method135 = this.field8271.method135(n2);
            final long n3 = n - field8269;
            this.field8271.method169(n2, this.field8271.method135(n3));
            this.field8271.method169(n3, method135);
        }
    }
}
