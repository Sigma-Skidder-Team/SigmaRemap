// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1171 implements Runnable
{
    private static String[] field6346;
    public final /* synthetic */ int field6347;
    public final /* synthetic */ int field6348;
    public final /* synthetic */ float[] field6349;
    public final /* synthetic */ boolean field6350;
    public final /* synthetic */ Class5934 field6351;
    
    public Class1171(final Class5934 field6351, final int field6352, final int field6353, final float[] field6354, final boolean field6355) {
        this.field6351 = field6351;
        this.field6347 = field6352;
        this.field6348 = field6353;
        this.field6349 = field6354;
        this.field6350 = field6355;
    }
    
    @Override
    public void run() {
        final float[] array = new float[Class5934.method17843(this.field6351)];
        for (int i = this.field6347; i < this.field6348; ++i) {
            final int n = i * Class5934.method17839(this.field6351);
            for (int j = 0; j < Class5934.method17841(this.field6351); ++j) {
                for (int k = 0; k < Class5934.method17843(this.field6351); ++k) {
                    array[k] = this.field6349[k * Class5934.method17837(this.field6351) + n + j];
                }
                Class5934.method17844(this.field6351).method30449(array, this.field6350);
                for (int l = 0; l < Class5934.method17843(this.field6351); ++l) {
                    this.field6349[l * Class5934.method17837(this.field6351) + n + j] = array[l];
                }
            }
        }
    }
}
