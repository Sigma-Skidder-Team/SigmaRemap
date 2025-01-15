// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class892 implements Runnable
{
    private static String[] field4824;
    public final /* synthetic */ int field4825;
    public final /* synthetic */ int field4826;
    public final /* synthetic */ int field4827;
    public final /* synthetic */ int field4828;
    public final /* synthetic */ float[] field4829;
    public final /* synthetic */ float[] field4830;
    public final /* synthetic */ Class7978 field4831;
    
    public Class892(final Class7978 field4831, final int field4832, final int field4833, final int field4834, final int field4835, final float[] field4836, final float[] field4837) {
        this.field4831 = field4831;
        this.field4825 = field4832;
        this.field4826 = field4833;
        this.field4827 = field4834;
        this.field4828 = field4835;
        this.field4829 = field4836;
        this.field4830 = field4837;
    }
    
    @Override
    public void run() {
        if (this.field4825 <= 0) {
            for (int i = this.field4826; i < this.field4827; ++i) {
                final int n = 2 * i;
                final int n2 = n + 1;
                final int n3 = this.field4828 + i;
                this.field4829[n] = this.field4830[n3] * Class7978.method26004(this.field4831)[n];
                this.field4829[n2] = -this.field4830[n3] * Class7978.method26004(this.field4831)[n2];
            }
        }
        else {
            for (int j = this.field4826; j < this.field4827; ++j) {
                final int n4 = 2 * j;
                final int n5 = n4 + 1;
                final int n6 = this.field4828 + j;
                this.field4829[n4] = this.field4830[n6] * Class7978.method26004(this.field4831)[n4];
                this.field4829[n5] = this.field4830[n6] * Class7978.method26004(this.field4831)[n5];
            }
        }
    }
}
