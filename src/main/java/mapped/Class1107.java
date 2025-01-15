// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1107 implements Runnable
{
    private static String[] field5973;
    public final /* synthetic */ int field5974;
    public final /* synthetic */ int field5975;
    public final /* synthetic */ double[][][] field5976;
    public final /* synthetic */ boolean field5977;
    public final /* synthetic */ Class5815 field5978;
    
    public Class1107(final Class5815 field5978, final int field5979, final int field5980, final double[][][] field5981, final boolean field5982) {
        this.field5978 = field5978;
        this.field5974 = field5979;
        this.field5975 = field5980;
        this.field5976 = field5981;
        this.field5977 = field5982;
    }
    
    @Override
    public void run() {
        final double[] array = new double[Class5815.method17498(this.field5978)];
        for (int i = this.field5974; i < this.field5975; ++i) {
            for (int j = 0; j < Class5815.method17501(this.field5978); ++j) {
                for (int k = 0; k < Class5815.method17498(this.field5978); ++k) {
                    array[k] = this.field5976[i][k][j];
                }
                Class5815.method17502(this.field5978).method21390(array, this.field5977);
                for (int l = 0; l < Class5815.method17498(this.field5978); ++l) {
                    this.field5976[i][l][j] = array[l];
                }
            }
        }
    }
}
