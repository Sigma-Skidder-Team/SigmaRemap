// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1436 implements Runnable
{
    private static String[] field7946;
    public final /* synthetic */ int field7947;
    public final /* synthetic */ int field7948;
    public final /* synthetic */ int field7949;
    public final /* synthetic */ int field7950;
    public final /* synthetic */ double[][][] field7951;
    public final /* synthetic */ Class6733 field7952;
    
    public Class1436(final Class6733 field7952, final int field7953, final int field7954, final int field7955, final int field7956, final double[][][] field7957) {
        this.field7952 = field7952;
        this.field7947 = field7953;
        this.field7948 = field7954;
        this.field7949 = field7955;
        this.field7950 = field7956;
        this.field7951 = field7957;
    }
    
    @Override
    public void run() {
        for (int i = this.field7947; i < this.field7948; ++i) {
            final int n = (Class6733.method20479(this.field7952) - i) % Class6733.method20479(this.field7952);
            for (int j = 1; j < this.field7949; ++j) {
                final int n2 = Class6733.method20474(this.field7952) - j;
                for (int k = 0; k < Class6733.method20477(this.field7952); ++k) {
                    final int n3 = 2 * k;
                    final int n4 = this.field7950 - n3;
                    this.field7951[n][n2][n4 % this.field7950] = this.field7951[i][j][n3];
                    this.field7951[n][n2][(n4 + 1) % this.field7950] = -this.field7951[i][j][n3 + 1];
                }
            }
        }
    }
}
