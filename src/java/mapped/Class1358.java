// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1358 implements Runnable
{
    private static String[] field7445;
    public final /* synthetic */ int field7446;
    public final /* synthetic */ int field7447;
    public final /* synthetic */ double[] field7448;
    public final /* synthetic */ boolean field7449;
    public final /* synthetic */ Class7568 field7450;
    
    public Class1358(final Class7568 field7450, final int field7451, final int field7452, final double[] field7453, final boolean field7454) {
        this.field7450 = field7450;
        this.field7446 = field7451;
        this.field7447 = field7452;
        this.field7448 = field7453;
        this.field7449 = field7454;
    }
    
    @Override
    public void run() {
        final double[] array = new double[Class7568.method23782(this.field7450)];
        for (int i = this.field7446; i < this.field7447; ++i) {
            final int n = i * Class7568.method23778(this.field7450);
            for (int j = 0; j < Class7568.method23780(this.field7450); ++j) {
                for (int k = 0; k < Class7568.method23782(this.field7450); ++k) {
                    array[k] = this.field7448[k * Class7568.method23776(this.field7450) + n + j];
                }
                Class7568.method23783(this.field7450).method30721(array, this.field7449);
                for (int l = 0; l < Class7568.method23782(this.field7450); ++l) {
                    this.field7448[l * Class7568.method23776(this.field7450) + n + j] = array[l];
                }
            }
        }
    }
}
