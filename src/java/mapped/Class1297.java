// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1297 implements Runnable
{
    private static String[] field7094;
    public final /* synthetic */ int field7095;
    public final /* synthetic */ int field7096;
    public final /* synthetic */ float[][][] field7097;
    public final /* synthetic */ Class6362 field7098;
    
    public Class1297(final Class6362 field7098, final int field7099, final int field7100, final float[][][] field7101) {
        this.field7098 = field7098;
        this.field7095 = field7099;
        this.field7096 = field7100;
        this.field7097 = field7101;
    }
    
    @Override
    public void run() {
        final float[] array = new float[2 * Class6362.method19003(this.field7098)];
        for (int i = this.field7095; i < this.field7096; ++i) {
            for (int j = 0; j < Class6362.method19001(this.field7098); ++j) {
                final int n = 2 * j;
                for (int k = 0; k < Class6362.method19003(this.field7098); ++k) {
                    final int n2 = 2 * k;
                    array[n2] = this.field7097[k][i][n];
                    array[n2 + 1] = this.field7097[k][i][n + 1];
                }
                Class6362.method19004(this.field7098).method25925(array);
                for (int l = 0; l < Class6362.method19003(this.field7098); ++l) {
                    final int n3 = 2 * l;
                    this.field7097[l][i][n] = array[n3];
                    this.field7097[l][i][n + 1] = array[n3 + 1];
                }
            }
        }
    }
}
