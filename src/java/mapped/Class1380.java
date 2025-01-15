// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1380 implements Runnable
{
    private static String[] field7591;
    public final /* synthetic */ int field7592;
    public final /* synthetic */ int field7593;
    public final /* synthetic */ double[][][] field7594;
    public final /* synthetic */ boolean field7595;
    public final /* synthetic */ Class7796 field7596;
    
    public Class1380(final Class7796 field7596, final int field7597, final int field7598, final double[][][] field7599, final boolean field7600) {
        this.field7596 = field7596;
        this.field7592 = field7597;
        this.field7593 = field7598;
        this.field7594 = field7599;
        this.field7595 = field7600;
    }
    
    @Override
    public void run() {
        final double[] array = new double[Class7796.method25144(this.field7596)];
        for (int i = this.field7592; i < this.field7593; ++i) {
            for (int j = 0; j < Class7796.method25147(this.field7596); ++j) {
                for (int k = 0; k < Class7796.method25144(this.field7596); ++k) {
                    array[k] = this.field7594[i][k][j];
                }
                Class7796.method25148(this.field7596).method18040(array, this.field7595);
                for (int l = 0; l < Class7796.method25144(this.field7596); ++l) {
                    this.field7594[i][l][j] = array[l];
                }
            }
        }
    }
}
