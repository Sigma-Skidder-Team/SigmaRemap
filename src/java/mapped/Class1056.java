// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1056 implements Runnable
{
    private static String[] field5671;
    public final /* synthetic */ int field5672;
    public final /* synthetic */ int field5673;
    public final /* synthetic */ int field5674;
    public final /* synthetic */ double[] field5675;
    public final /* synthetic */ Class8983 field5676;
    
    public Class1056(final Class8983 field5676, final int field5677, final int field5678, final int field5679, final double[] field5680) {
        this.field5676 = field5676;
        this.field5672 = field5677;
        this.field5673 = field5678;
        this.field5674 = field5679;
        this.field5675 = field5680;
    }
    
    @Override
    public void run() {
        final double[] array = new double[2 * Class8983.method31976(this.field5676)];
        for (int i = this.field5672; i < this.field5673; ++i) {
            final int n = 2 * i;
            for (int j = 0; j < Class8983.method31976(this.field5676); ++j) {
                final int n2 = 2 * j;
                final int n3 = j * this.field5674 + n;
                array[n2] = this.field5675[n3];
                array[n2 + 1] = this.field5675[n3 + 1];
            }
            Class8983.method31977(this.field5676).method26072(array);
            for (int k = 0; k < Class8983.method31976(this.field5676); ++k) {
                final int n4 = 2 * k;
                final int n5 = k * this.field5674 + n;
                this.field5675[n5] = array[n4];
                this.field5675[n5 + 1] = array[n4 + 1];
            }
        }
    }
}
