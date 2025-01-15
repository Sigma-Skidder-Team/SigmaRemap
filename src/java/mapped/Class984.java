// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class984 implements Runnable
{
    private static String[] field5247;
    public final /* synthetic */ int field5248;
    public final /* synthetic */ int field5249;
    public final /* synthetic */ int field5250;
    public final /* synthetic */ float[] field5251;
    public final /* synthetic */ Class7978 field5252;
    
    public Class984(final Class7978 field5252, final int field5253, final int field5254, final int field5255, final float[] field5256) {
        this.field5252 = field5252;
        this.field5248 = field5253;
        this.field5249 = field5254;
        this.field5250 = field5255;
        this.field5251 = field5256;
    }
    
    @Override
    public void run() {
        if (this.field5248 <= 0) {
            for (int i = this.field5249; i < this.field5250; ++i) {
                final int n = 2 * i;
                final int n2 = n + 1;
                final float n3 = this.field5251[n] * Class7978.method26005(this.field5252)[n2] + this.field5251[n2] * Class7978.method26005(this.field5252)[n];
                this.field5251[n] = this.field5251[n] * Class7978.method26005(this.field5252)[n] - this.field5251[n2] * Class7978.method26005(this.field5252)[n2];
                this.field5251[n2] = n3;
            }
        }
        else {
            for (int j = this.field5249; j < this.field5250; ++j) {
                final int n4 = 2 * j;
                final int n5 = n4 + 1;
                final float n6 = -this.field5251[n4] * Class7978.method26005(this.field5252)[n5] + this.field5251[n5] * Class7978.method26005(this.field5252)[n4];
                this.field5251[n4] = this.field5251[n4] * Class7978.method26005(this.field5252)[n4] + this.field5251[n5] * Class7978.method26005(this.field5252)[n5];
                this.field5251[n5] = n6;
            }
        }
    }
}
