// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1488 implements Runnable
{
    private static String[] field8273;
    public final /* synthetic */ int field8274;
    public final /* synthetic */ int field8275;
    public final /* synthetic */ double[] field8276;
    public final /* synthetic */ boolean field8277;
    public final /* synthetic */ Class7568 field8278;
    
    public Class1488(final Class7568 field8278, final int field8279, final int field8280, final double[] field8281, final boolean field8282) {
        this.field8278 = field8278;
        this.field8274 = field8279;
        this.field8275 = field8280;
        this.field8276 = field8281;
        this.field8277 = field8282;
    }
    
    @Override
    public void run() {
        final double[] array = new double[Class7568.method23782(this.field8278)];
        for (int i = this.field8274; i < this.field8275; ++i) {
            final int n = i * Class7568.method23778(this.field8278);
            for (int j = 0; j < Class7568.method23780(this.field8278); ++j) {
                for (int k = 0; k < Class7568.method23782(this.field8278); ++k) {
                    array[k] = this.field8276[k * Class7568.method23776(this.field8278) + n + j];
                }
                Class7568.method23783(this.field8278).method30725(array, this.field8277);
                for (int l = 0; l < Class7568.method23782(this.field8278); ++l) {
                    this.field8276[l * Class7568.method23776(this.field8278) + n + j] = array[l];
                }
            }
        }
    }
}
