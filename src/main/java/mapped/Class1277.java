// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1277 implements Runnable
{
    private static String[] field6977;
    public final /* synthetic */ int field6978;
    public final /* synthetic */ int field6979;
    public final /* synthetic */ int field6980;
    public final /* synthetic */ double[][] field6981;
    public final /* synthetic */ double[][] field6982;
    public final /* synthetic */ Class8983 field6983;
    
    public Class1277(final Class8983 field6983, final int field6984, final int field6985, final int field6986, final double[][] field6987, final double[][] field6988) {
        this.field6983 = field6983;
        this.field6978 = field6984;
        this.field6979 = field6985;
        this.field6980 = field6986;
        this.field6981 = field6987;
        this.field6982 = field6988;
    }
    
    @Override
    public void run() {
        for (int i = this.field6978; i < this.field6979; ++i) {
            final int n = 2 * i;
            for (int j = 0; j < this.field6980; ++j) {
                final int n2 = 2 * j;
                this.field6981[i][n2] = this.field6982[j][n];
                this.field6981[i][n2 + 1] = this.field6982[j][n + 1];
            }
        }
    }
}
