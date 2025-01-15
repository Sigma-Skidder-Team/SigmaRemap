// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1252 implements Runnable
{
    private static String[] field6813;
    public final /* synthetic */ int field6814;
    public final /* synthetic */ int field6815;
    public final /* synthetic */ double[][] field6816;
    public final /* synthetic */ double[][] field6817;
    public final /* synthetic */ Class8983 field6818;
    
    public Class1252(final Class8983 field6818, final int field6819, final int field6820, final double[][] field6821, final double[][] field6822) {
        this.field6818 = field6818;
        this.field6814 = field6819;
        this.field6815 = field6820;
        this.field6816 = field6821;
        this.field6817 = field6822;
    }
    
    @Override
    public void run() {
        for (int i = this.field6814; i < this.field6815; ++i) {
            final int n = 2 * i;
            for (int j = 0; j < Class8983.method31976(this.field6818); ++j) {
                final int n2 = 2 * j;
                this.field6816[i][n2] = this.field6817[j][n];
                this.field6816[i][n2 + 1] = this.field6817[j][n + 1];
            }
            Class8983.method31977(this.field6818).method26072(this.field6816[i]);
        }
    }
}
