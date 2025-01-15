// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1246 implements Runnable
{
    private static String[] field6778;
    public final /* synthetic */ int field6779;
    public final /* synthetic */ int field6780;
    public final /* synthetic */ double[] field6781;
    public final /* synthetic */ boolean field6782;
    public final /* synthetic */ Class7796 field6783;
    
    public Class1246(final Class7796 field6783, final int field6784, final int field6785, final double[] field6786, final boolean field6787) {
        this.field6783 = field6783;
        this.field6779 = field6784;
        this.field6780 = field6785;
        this.field6781 = field6786;
        this.field6782 = field6787;
    }
    
    @Override
    public void run() {
        final double[] array = new double[Class7796.method25149(this.field6783)];
        for (int i = this.field6779; i < this.field6780; ++i) {
            final int n = i * Class7796.method25145(this.field6783);
            for (int j = 0; j < Class7796.method25147(this.field6783); ++j) {
                for (int k = 0; k < Class7796.method25149(this.field6783); ++k) {
                    array[k] = this.field6781[k * Class7796.method25143(this.field6783) + n + j];
                }
                Class7796.method25150(this.field6783).method18040(array, this.field6782);
                for (int l = 0; l < Class7796.method25149(this.field6783); ++l) {
                    this.field6781[l * Class7796.method25143(this.field6783) + n + j] = array[l];
                }
            }
        }
    }
}
