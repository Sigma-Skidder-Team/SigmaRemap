// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1048 implements Runnable
{
    private static String[] field5618;
    public final /* synthetic */ int field5619;
    public final /* synthetic */ int field5620;
    public final /* synthetic */ int field5621;
    public final /* synthetic */ float[] field5622;
    public final /* synthetic */ Class7978 field5623;
    
    public Class1048(final Class7978 field5623, final int field5624, final int field5625, final int field5626, final float[] field5627) {
        this.field5623 = field5623;
        this.field5619 = field5624;
        this.field5620 = field5625;
        this.field5621 = field5626;
        this.field5622 = field5627;
    }
    
    @Override
    public void run() {
        if (this.field5619 <= 0) {
            for (int i = this.field5620; i < this.field5621; ++i) {
                final int n = 2 * i;
                final int n2 = n + 1;
                final float n3 = this.field5622[n] * Class7978.method26005(this.field5623)[n2] + this.field5622[n2] * Class7978.method26005(this.field5623)[n];
                this.field5622[n] = this.field5622[n] * Class7978.method26005(this.field5623)[n] - this.field5622[n2] * Class7978.method26005(this.field5623)[n2];
                this.field5622[n2] = n3;
            }
        }
        else {
            for (int j = this.field5620; j < this.field5621; ++j) {
                final int n4 = 2 * j;
                final int n5 = n4 + 1;
                final float n6 = -this.field5622[n4] * Class7978.method26005(this.field5623)[n5] + this.field5622[n5] * Class7978.method26005(this.field5623)[n4];
                this.field5622[n4] = this.field5622[n4] * Class7978.method26005(this.field5623)[n4] + this.field5622[n5] * Class7978.method26005(this.field5623)[n5];
                this.field5622[n5] = n6;
            }
        }
    }
}
