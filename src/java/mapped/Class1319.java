// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1319 implements Runnable
{
    private static String[] field7239;
    public final /* synthetic */ int field7240;
    public final /* synthetic */ int field7241;
    public final /* synthetic */ float[] field7242;
    public final /* synthetic */ float[][][] field7243;
    public final /* synthetic */ Class6362 field7244;
    
    public Class1319(final Class6362 field7244, final int field7245, final int field7246, final float[] field7247, final float[][][] field7248) {
        this.field7244 = field7244;
        this.field7240 = field7245;
        this.field7241 = field7246;
        this.field7242 = field7247;
        this.field7243 = field7248;
    }
    
    @Override
    public void run() {
        for (int i = this.field7240; i < this.field7241; ++i) {
            final int n = i * Class6362.method18997(this.field7244);
            for (int j = 0; j < Class6362.method18998(this.field7244); ++j) {
                System.arraycopy(this.field7242, n + j * Class6362.method18999(this.field7244), this.field7243[i][j], 0, Class6362.method19001(this.field7244));
                Class6362.method19000(this.field7244).method25937(this.field7243[i][j]);
            }
        }
    }
}
