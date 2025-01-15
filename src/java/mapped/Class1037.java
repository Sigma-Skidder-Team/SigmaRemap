// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1037 implements Runnable
{
    private static String[] field5558;
    public final /* synthetic */ int field5559;
    public final /* synthetic */ int field5560;
    public final /* synthetic */ float[] field5561;
    public final /* synthetic */ Class7978 field5562;
    
    public Class1037(final Class7978 field5562, final int field5563, final int field5564, final float[] field5565) {
        this.field5562 = field5562;
        this.field5559 = field5563;
        this.field5560 = field5564;
        this.field5561 = field5565;
    }
    
    @Override
    public void run() {
        for (int i = this.field5559; i < this.field5560; ++i) {
            final int n = 2 * i;
            final int n2 = n + 1;
            final float n3 = -this.field5561[n] * Class7978.method26005(this.field5562)[n2] + this.field5561[n2] * Class7978.method26005(this.field5562)[n];
            this.field5561[n] = this.field5561[n] * Class7978.method26005(this.field5562)[n] + this.field5561[n2] * Class7978.method26005(this.field5562)[n2];
            this.field5561[n2] = n3;
        }
    }
}
