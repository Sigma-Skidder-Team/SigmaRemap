// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class980 implements Runnable
{
    private static String[] field5227;
    public final /* synthetic */ int field5228;
    public final /* synthetic */ int field5229;
    public final /* synthetic */ float[] field5230;
    public final /* synthetic */ boolean field5231;
    public final /* synthetic */ Class5934 field5232;
    
    public Class980(final Class5934 field5232, final int field5233, final int field5234, final float[] field5235, final boolean field5236) {
        this.field5232 = field5232;
        this.field5228 = field5233;
        this.field5229 = field5234;
        this.field5230 = field5235;
        this.field5231 = field5236;
    }
    
    @Override
    public void run() {
        final float[] array = new float[Class5934.method17838(this.field5232)];
        for (int i = this.field5228; i < this.field5229; ++i) {
            final int n = i * Class5934.method17837(this.field5232);
            for (int j = 0; j < Class5934.method17841(this.field5232); ++j) {
                for (int k = 0; k < Class5934.method17838(this.field5232); ++k) {
                    array[k] = this.field5230[n + k * Class5934.method17839(this.field5232) + j];
                }
                Class5934.method17842(this.field5232).method30449(array, this.field5231);
                for (int l = 0; l < Class5934.method17838(this.field5232); ++l) {
                    this.field5230[n + l * Class5934.method17839(this.field5232) + j] = array[l];
                }
            }
        }
    }
}
