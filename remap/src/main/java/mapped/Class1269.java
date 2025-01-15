// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1269 implements Runnable
{
    private static String[] field6926;
    public final /* synthetic */ int field6927;
    public final /* synthetic */ int field6928;
    public final /* synthetic */ int field6929;
    public final /* synthetic */ double[] field6930;
    public final /* synthetic */ Class7992 field6931;
    
    public Class1269(final Class7992 field6931, final int field6932, final int field6933, final int field6934, final double[] field6935) {
        this.field6931 = field6931;
        this.field6927 = field6932;
        this.field6928 = field6933;
        this.field6929 = field6934;
        this.field6930 = field6935;
    }
    
    @Override
    public void run() {
        if (this.field6927 <= 0) {
            for (int i = this.field6928; i < this.field6929; ++i) {
                final int n = 2 * i;
                final int n2 = n + 1;
                final double n3 = this.field6930[n] * Class7992.method26152(this.field6931)[n2] + this.field6930[n2] * Class7992.method26152(this.field6931)[n];
                this.field6930[n] = this.field6930[n] * Class7992.method26152(this.field6931)[n] - this.field6930[n2] * Class7992.method26152(this.field6931)[n2];
                this.field6930[n2] = n3;
            }
        }
        else {
            for (int j = this.field6928; j < this.field6929; ++j) {
                final int n4 = 2 * j;
                final int n5 = n4 + 1;
                final double n6 = -this.field6930[n4] * Class7992.method26152(this.field6931)[n5] + this.field6930[n5] * Class7992.method26152(this.field6931)[n4];
                this.field6930[n4] = this.field6930[n4] * Class7992.method26152(this.field6931)[n4] + this.field6930[n5] * Class7992.method26152(this.field6931)[n5];
                this.field6930[n5] = n6;
            }
        }
    }
}
