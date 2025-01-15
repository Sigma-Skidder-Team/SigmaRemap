// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1184 implements Runnable
{
    private static String[] field6414;
    public final /* synthetic */ int field6415;
    public final /* synthetic */ int field6416;
    public final /* synthetic */ int field6417;
    public final /* synthetic */ int field6418;
    public final /* synthetic */ float[] field6419;
    public final /* synthetic */ float[] field6420;
    public final /* synthetic */ Class7978 field6421;
    
    public Class1184(final Class7978 field6421, final int field6422, final int field6423, final int field6424, final int field6425, final float[] field6426, final float[] field6427) {
        this.field6421 = field6421;
        this.field6415 = field6422;
        this.field6416 = field6423;
        this.field6417 = field6424;
        this.field6418 = field6425;
        this.field6419 = field6426;
        this.field6420 = field6427;
    }
    
    @Override
    public void run() {
        if (this.field6415 <= 0) {
            for (int i = this.field6416; i < this.field6417; ++i) {
                final int n = 2 * i;
                final int n2 = n + 1;
                final int n3 = this.field6418 + n;
                final int n4 = this.field6418 + n2;
                this.field6419[n3] = Class7978.method26004(this.field6421)[n] * this.field6420[n] + Class7978.method26004(this.field6421)[n2] * this.field6420[n2];
                this.field6419[n4] = -Class7978.method26004(this.field6421)[n2] * this.field6420[n] + Class7978.method26004(this.field6421)[n] * this.field6420[n2];
            }
        }
        else {
            for (int j = this.field6416; j < this.field6417; ++j) {
                final int n5 = 2 * j;
                final int n6 = n5 + 1;
                final int n7 = this.field6418 + n5;
                final int n8 = this.field6418 + n6;
                this.field6419[n7] = Class7978.method26004(this.field6421)[n5] * this.field6420[n5] - Class7978.method26004(this.field6421)[n6] * this.field6420[n6];
                this.field6419[n8] = Class7978.method26004(this.field6421)[n6] * this.field6420[n5] + Class7978.method26004(this.field6421)[n5] * this.field6420[n6];
            }
        }
    }
}
