// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class881 implements Runnable
{
    private static String[] field4748;
    public final /* synthetic */ int field4749;
    public final /* synthetic */ int field4750;
    public final /* synthetic */ double[] field4751;
    public final /* synthetic */ boolean field4752;
    public final /* synthetic */ Class7796 field4753;
    
    public Class881(final Class7796 field4753, final int field4754, final int field4755, final double[] field4756, final boolean field4757) {
        this.field4753 = field4753;
        this.field4749 = field4754;
        this.field4750 = field4755;
        this.field4751 = field4756;
        this.field4752 = field4757;
    }
    
    @Override
    public void run() {
        final double[] array = new double[Class7796.method25144(this.field4753)];
        for (int i = this.field4749; i < this.field4750; ++i) {
            final int n = i * Class7796.method25143(this.field4753);
            for (int j = 0; j < Class7796.method25147(this.field4753); ++j) {
                for (int k = 0; k < Class7796.method25144(this.field4753); ++k) {
                    array[k] = this.field4751[n + k * Class7796.method25145(this.field4753) + j];
                }
                Class7796.method25148(this.field4753).method18040(array, this.field4752);
                for (int l = 0; l < Class7796.method25144(this.field4753); ++l) {
                    this.field4751[n + l * Class7796.method25145(this.field4753) + j] = array[l];
                }
            }
        }
    }
}
