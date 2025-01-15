// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1266 implements Runnable
{
    private static String[] field6903;
    public final /* synthetic */ int field6904;
    public final /* synthetic */ int field6905;
    public final /* synthetic */ int field6906;
    public final /* synthetic */ int field6907;
    public final /* synthetic */ int field6908;
    public final /* synthetic */ double[] field6909;
    public final /* synthetic */ Class6733 field6910;
    
    public Class1266(final Class6733 field6910, final int field6911, final int field6912, final int field6913, final int field6914, final int field6915, final double[] field6916) {
        this.field6910 = field6910;
        this.field6904 = field6911;
        this.field6905 = field6912;
        this.field6906 = field6913;
        this.field6907 = field6914;
        this.field6908 = field6915;
        this.field6909 = field6916;
    }
    
    @Override
    public void run() {
        for (int i = this.field6904; i < this.field6905; ++i) {
            final int n = (Class6733.method20479(this.field6910) - i) % Class6733.method20479(this.field6910) * this.field6906;
            final int n2 = i * this.field6906;
            for (int j = 1; j < this.field6907; ++j) {
                final int n3 = n + (Class6733.method20474(this.field6910) - j) * this.field6908;
                final int n4 = n2 + j * this.field6908;
                this.field6909[n3] = this.field6909[n4];
                this.field6909[n3 + 1] = -this.field6909[n4 + 1];
            }
        }
    }
}
