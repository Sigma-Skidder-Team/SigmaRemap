// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1523 implements Runnable
{
    private static String[] field8493;
    public final /* synthetic */ int field8494;
    public final /* synthetic */ int field8495;
    public final /* synthetic */ float[] field8496;
    public final /* synthetic */ Class7978 field8497;
    
    public Class1523(final Class7978 field8497, final int field8498, final int field8499, final float[] field8500) {
        this.field8497 = field8497;
        this.field8494 = field8498;
        this.field8495 = field8499;
        this.field8496 = field8500;
    }
    
    @Override
    public void run() {
        for (int i = this.field8494; i < this.field8495; ++i) {
            final int n = 2 * i;
            final int n2 = n + 1;
            final float n3 = this.field8496[n] * Class7978.method26005(this.field8497)[n2] + this.field8496[n2] * Class7978.method26005(this.field8497)[n];
            this.field8496[n] = this.field8496[n] * Class7978.method26005(this.field8497)[n] - this.field8496[n2] * Class7978.method26005(this.field8497)[n2];
            this.field8496[n2] = n3;
        }
    }
}
