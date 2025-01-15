// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class979 implements Runnable
{
    private static String[] field5221;
    public final /* synthetic */ int field5222;
    public final /* synthetic */ int field5223;
    public final /* synthetic */ double[] field5224;
    public final /* synthetic */ boolean field5225;
    public final /* synthetic */ Class5815 field5226;
    
    public Class979(final Class5815 field5226, final int field5227, final int field5228, final double[] field5229, final boolean field5230) {
        this.field5226 = field5226;
        this.field5222 = field5227;
        this.field5223 = field5228;
        this.field5224 = field5229;
        this.field5225 = field5230;
    }
    
    @Override
    public void run() {
        final double[] array = new double[Class5815.method17498(this.field5226)];
        for (int i = this.field5222; i < this.field5223; ++i) {
            final int n = i * Class5815.method17497(this.field5226);
            for (int j = 0; j < Class5815.method17501(this.field5226); ++j) {
                for (int k = 0; k < Class5815.method17498(this.field5226); ++k) {
                    array[k] = this.field5224[n + k * Class5815.method17499(this.field5226) + j];
                }
                Class5815.method17502(this.field5226).method21390(array, this.field5225);
                for (int l = 0; l < Class5815.method17498(this.field5226); ++l) {
                    this.field5224[n + l * Class5815.method17499(this.field5226) + j] = array[l];
                }
            }
        }
    }
}
