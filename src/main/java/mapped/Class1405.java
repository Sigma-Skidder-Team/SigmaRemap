// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1405 implements Runnable
{
    private static String[] field7759;
    public final /* synthetic */ int field7760;
    public final /* synthetic */ int field7761;
    public final /* synthetic */ int field7762;
    public final /* synthetic */ float[][][] field7763;
    public final /* synthetic */ Class6362 field7764;
    
    public Class1405(final Class6362 field7764, final int field7765, final int field7766, final int field7767, final float[][][] field7768) {
        this.field7764 = field7764;
        this.field7760 = field7765;
        this.field7761 = field7766;
        this.field7762 = field7767;
        this.field7763 = field7768;
    }
    
    @Override
    public void run() {
        for (int i = this.field7760; i < this.field7761; ++i) {
            final int n = (Class6362.method19003(this.field7764) - i) % Class6362.method19003(this.field7764);
            for (int j = 1; j < this.field7762; ++j) {
                final int n2 = Class6362.method18998(this.field7764) - j;
                this.field7763[n][j][Class6362.method19001(this.field7764)] = this.field7763[i][n2][1];
                this.field7763[i][n2][Class6362.method19001(this.field7764)] = this.field7763[i][n2][1];
                this.field7763[n][j][Class6362.method19001(this.field7764) + 1] = -this.field7763[i][n2][0];
                this.field7763[i][n2][Class6362.method19001(this.field7764) + 1] = this.field7763[i][n2][0];
            }
        }
    }
}
