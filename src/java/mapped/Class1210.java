// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1210 implements Runnable
{
    private static String[] field6562;
    public final /* synthetic */ int field6563;
    public final /* synthetic */ int field6564;
    public final /* synthetic */ int field6565;
    public final /* synthetic */ int field6566;
    public final /* synthetic */ float[] field6567;
    public final /* synthetic */ float[] field6568;
    public final /* synthetic */ Class7978 field6569;
    
    public Class1210(final Class7978 field6569, final int field6570, final int field6571, final int field6572, final int field6573, final float[] field6574, final float[] field6575) {
        this.field6569 = field6569;
        this.field6563 = field6570;
        this.field6564 = field6571;
        this.field6565 = field6572;
        this.field6566 = field6573;
        this.field6567 = field6574;
        this.field6568 = field6575;
    }
    
    @Override
    public void run() {
        if (this.field6563 <= 0) {
            for (int i = this.field6564; i < this.field6565; ++i) {
                final int n = 2 * i;
                final int n2 = n + 1;
                final int n3 = this.field6566 + n;
                final int n4 = this.field6566 + n2;
                this.field6567[n] = this.field6568[n3] * Class7978.method26004(this.field6569)[n] + this.field6568[n4] * Class7978.method26004(this.field6569)[n2];
                this.field6567[n2] = -this.field6568[n3] * Class7978.method26004(this.field6569)[n2] + this.field6568[n4] * Class7978.method26004(this.field6569)[n];
            }
        }
        else {
            for (int j = this.field6564; j < this.field6565; ++j) {
                final int n5 = 2 * j;
                final int n6 = n5 + 1;
                final int n7 = this.field6566 + n5;
                final int n8 = this.field6566 + n6;
                this.field6567[n5] = this.field6568[n7] * Class7978.method26004(this.field6569)[n5] - this.field6568[n8] * Class7978.method26004(this.field6569)[n6];
                this.field6567[n6] = this.field6568[n7] * Class7978.method26004(this.field6569)[n6] + this.field6568[n8] * Class7978.method26004(this.field6569)[n5];
            }
        }
    }
}
