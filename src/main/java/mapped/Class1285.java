// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1285 implements Runnable
{
    private static String[] field7018;
    public final /* synthetic */ int field7019;
    public final /* synthetic */ int field7020;
    public final /* synthetic */ double[][][] field7021;
    public final /* synthetic */ boolean field7022;
    public final /* synthetic */ Class7796 field7023;
    
    public Class1285(final Class7796 field7023, final int field7024, final int field7025, final double[][][] field7026, final boolean field7027) {
        this.field7023 = field7023;
        this.field7019 = field7024;
        this.field7020 = field7025;
        this.field7021 = field7026;
        this.field7022 = field7027;
    }
    
    @Override
    public void run() {
        final double[] array = new double[Class7796.method25149(this.field7023)];
        for (int i = this.field7019; i < this.field7020; ++i) {
            for (int j = 0; j < Class7796.method25147(this.field7023); ++j) {
                for (int k = 0; k < Class7796.method25149(this.field7023); ++k) {
                    array[k] = this.field7021[k][i][j];
                }
                Class7796.method25150(this.field7023).method18040(array, this.field7022);
                for (int l = 0; l < Class7796.method25149(this.field7023); ++l) {
                    this.field7021[l][i][j] = array[l];
                }
            }
        }
    }
}
