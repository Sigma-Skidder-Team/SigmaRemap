// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1007 implements Runnable
{
    private static String[] field5374;
    public final /* synthetic */ int field5375;
    public final /* synthetic */ int field5376;
    public final /* synthetic */ double[][] field5377;
    public final /* synthetic */ Class8788 field5378;
    
    public Class1007(final Class8788 field5378, final int field5379, final int field5380, final double[][] field5381) {
        this.field5378 = field5378;
        this.field5375 = field5379;
        this.field5376 = field5380;
        this.field5377 = field5381;
    }
    
    @Override
    public void run() {
        final double[] array = new double[Class8788.method30612(this.field5378)];
        for (int i = this.field5375; i < this.field5376; ++i) {
            for (int j = 0; j < Class8788.method30612(this.field5378); ++j) {
                array[j] = this.field5377[j][i];
            }
            Class8788.method30613(this.field5378).method21386(array);
            for (int k = 0; k < Class8788.method30612(this.field5378); ++k) {
                this.field5377[k][i] = array[k];
            }
        }
    }
}
