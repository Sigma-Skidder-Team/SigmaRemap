// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1253 implements Runnable
{
    private static String[] field6819;
    public final /* synthetic */ int field6820;
    public final /* synthetic */ int field6821;
    public final /* synthetic */ float[] field6822;
    public final /* synthetic */ Class5934 field6823;
    
    public Class1253(final Class5934 field6823, final int field6824, final int field6825, final float[] field6826) {
        this.field6823 = field6823;
        this.field6820 = field6824;
        this.field6821 = field6825;
        this.field6822 = field6826;
    }
    
    @Override
    public void run() {
        final float[] array = new float[Class5934.method17843(this.field6823)];
        for (int i = this.field6820; i < this.field6821; ++i) {
            final int n = i * Class5934.method17839(this.field6823);
            for (int j = 0; j < Class5934.method17841(this.field6823); ++j) {
                for (int k = 0; k < Class5934.method17843(this.field6823); ++k) {
                    array[k] = this.field6822[k * Class5934.method17837(this.field6823) + n + j];
                }
                Class5934.method17844(this.field6823).method30445(array);
                for (int l = 0; l < Class5934.method17843(this.field6823); ++l) {
                    this.field6822[l * Class5934.method17837(this.field6823) + n + j] = array[l];
                }
            }
        }
    }
}
