// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1090 implements Runnable
{
    private static String[] field5880;
    public final /* synthetic */ int field5881;
    public final /* synthetic */ int field5882;
    public final /* synthetic */ double[] field5883;
    public final /* synthetic */ Class8788 field5884;
    
    public Class1090(final Class8788 field5884, final int field5885, final int field5886, final double[] field5887) {
        this.field5884 = field5884;
        this.field5881 = field5885;
        this.field5882 = field5886;
        this.field5883 = field5887;
    }
    
    @Override
    public void run() {
        final double[] array = new double[Class8788.method30612(this.field5884)];
        for (int i = this.field5881; i < this.field5882; ++i) {
            for (int j = 0; j < Class8788.method30612(this.field5884); ++j) {
                array[j] = this.field5883[j * Class8788.method30610(this.field5884) + i];
            }
            Class8788.method30613(this.field5884).method21386(array);
            for (int k = 0; k < Class8788.method30612(this.field5884); ++k) {
                this.field5883[k * Class8788.method30610(this.field5884) + i] = array[k];
            }
        }
    }
}
