// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1187 implements Runnable
{
    private static String[] field6431;
    public final /* synthetic */ int field6432;
    public final /* synthetic */ int field6433;
    public final /* synthetic */ double[] field6434;
    public final /* synthetic */ Class5815 field6435;
    
    public Class1187(final Class5815 field6435, final int field6436, final int field6437, final double[] field6438) {
        this.field6435 = field6435;
        this.field6432 = field6436;
        this.field6433 = field6437;
        this.field6434 = field6438;
    }
    
    @Override
    public void run() {
        final double[] array = new double[Class5815.method17503(this.field6435)];
        for (int i = this.field6432; i < this.field6433; ++i) {
            final int n = i * Class5815.method17499(this.field6435);
            for (int j = 0; j < Class5815.method17501(this.field6435); ++j) {
                for (int k = 0; k < Class5815.method17503(this.field6435); ++k) {
                    array[k] = this.field6434[k * Class5815.method17497(this.field6435) + n + j];
                }
                Class5815.method17504(this.field6435).method21386(array);
                for (int l = 0; l < Class5815.method17503(this.field6435); ++l) {
                    this.field6434[l * Class5815.method17497(this.field6435) + n + j] = array[l];
                }
            }
        }
    }
}
