// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1424 implements Runnable
{
    private static String[] field7873;
    public final /* synthetic */ int field7874;
    public final /* synthetic */ int field7875;
    public final /* synthetic */ int field7876;
    public final /* synthetic */ float[][][] field7877;
    public final /* synthetic */ Class6362 field7878;
    
    public Class1424(final Class6362 field7878, final int field7879, final int field7880, final int field7881, final float[][][] field7882) {
        this.field7878 = field7878;
        this.field7874 = field7879;
        this.field7875 = field7880;
        this.field7876 = field7881;
        this.field7877 = field7882;
    }
    
    @Override
    public void run() {
        for (int i = this.field7874; i < this.field7875; ++i) {
            final int n = (Class6362.method19003(this.field7878) - i) % Class6362.method19003(this.field7878);
            for (int j = 1; j < this.field7876; ++j) {
                final int n2 = Class6362.method18998(this.field7878) - j;
                this.field7877[n][n2][0] = this.field7877[i][j][0];
                this.field7877[n][n2][1] = -this.field7877[i][j][1];
            }
        }
    }
}
