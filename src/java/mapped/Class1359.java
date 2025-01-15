// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1359 implements Runnable
{
    private static String[] field7451;
    public final /* synthetic */ int field7452;
    public final /* synthetic */ int field7453;
    public final /* synthetic */ double[][][] field7454;
    public final /* synthetic */ Class5815 field7455;
    
    public Class1359(final Class5815 field7455, final int field7456, final int field7457, final double[][][] field7458) {
        this.field7455 = field7455;
        this.field7452 = field7456;
        this.field7453 = field7457;
        this.field7454 = field7458;
    }
    
    @Override
    public void run() {
        final double[] array = new double[Class5815.method17498(this.field7455)];
        for (int i = this.field7452; i < this.field7453; ++i) {
            for (int j = 0; j < Class5815.method17501(this.field7455); ++j) {
                for (int k = 0; k < Class5815.method17498(this.field7455); ++k) {
                    array[k] = this.field7454[i][k][j];
                }
                Class5815.method17502(this.field7455).method21386(array);
                for (int l = 0; l < Class5815.method17498(this.field7455); ++l) {
                    this.field7454[i][l][j] = array[l];
                }
            }
        }
    }
}
