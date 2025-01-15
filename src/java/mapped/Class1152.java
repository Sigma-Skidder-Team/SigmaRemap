// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1152 implements Runnable
{
    private static String[] field6235;
    public final /* synthetic */ int field6236;
    public final /* synthetic */ int field6237;
    public final /* synthetic */ float[] field6238;
    public final /* synthetic */ boolean field6239;
    public final /* synthetic */ Class9117 field6240;
    
    public Class1152(final Class9117 field6240, final int field6241, final int field6242, final float[] field6243, final boolean field6244) {
        this.field6240 = field6240;
        this.field6236 = field6241;
        this.field6237 = field6242;
        this.field6238 = field6243;
        this.field6239 = field6244;
    }
    
    @Override
    public void run() {
        final float[] array = new float[Class9117.method33008(this.field6240)];
        for (int i = this.field6236; i < this.field6237; ++i) {
            final int n = i * Class9117.method33004(this.field6240);
            for (int j = 0; j < Class9117.method33006(this.field6240); ++j) {
                for (int k = 0; k < Class9117.method33008(this.field6240); ++k) {
                    array[k] = this.field6238[k * Class9117.method33002(this.field6240) + n + j];
                }
                Class9117.method33009(this.field6240).method29689(array, this.field6239);
                for (int l = 0; l < Class9117.method33008(this.field6240); ++l) {
                    this.field6238[l * Class9117.method33002(this.field6240) + n + j] = array[l];
                }
            }
        }
    }
}
