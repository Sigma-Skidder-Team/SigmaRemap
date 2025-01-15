// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1013 implements Runnable
{
    private static String[] field5415;
    public final /* synthetic */ int field5416;
    public final /* synthetic */ int field5417;
    public final /* synthetic */ double[] field5418;
    public final /* synthetic */ boolean field5419;
    public final /* synthetic */ Class5815 field5420;
    
    public Class1013(final Class5815 field5420, final int field5421, final int field5422, final double[] field5423, final boolean field5424) {
        this.field5420 = field5420;
        this.field5416 = field5421;
        this.field5417 = field5422;
        this.field5418 = field5423;
        this.field5419 = field5424;
    }
    
    @Override
    public void run() {
        final double[] array = new double[Class5815.method17503(this.field5420)];
        for (int i = this.field5416; i < this.field5417; ++i) {
            final int n = i * Class5815.method17499(this.field5420);
            for (int j = 0; j < Class5815.method17501(this.field5420); ++j) {
                for (int k = 0; k < Class5815.method17503(this.field5420); ++k) {
                    array[k] = this.field5418[k * Class5815.method17497(this.field5420) + n + j];
                }
                Class5815.method17504(this.field5420).method21390(array, this.field5419);
                for (int l = 0; l < Class5815.method17503(this.field5420); ++l) {
                    this.field5418[l * Class5815.method17497(this.field5420) + n + j] = array[l];
                }
            }
        }
    }
}
