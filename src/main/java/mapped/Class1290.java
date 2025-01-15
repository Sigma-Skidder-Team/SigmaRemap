// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1290 implements Runnable
{
    private static String[] field7043;
    public final /* synthetic */ int field7044;
    public final /* synthetic */ int field7045;
    public final /* synthetic */ double[] field7046;
    public final /* synthetic */ boolean field7047;
    public final /* synthetic */ Class4406 field7048;
    
    public Class1290(final Class4406 field7048, final int field7049, final int field7050, final double[] field7051, final boolean field7052) {
        this.field7048 = field7048;
        this.field7044 = field7049;
        this.field7045 = field7050;
        this.field7046 = field7051;
        this.field7047 = field7052;
    }
    
    @Override
    public void run() {
        final double[] array = new double[Class4406.method13334(this.field7048)];
        for (int i = this.field7044; i < this.field7045; ++i) {
            for (int j = 0; j < Class4406.method13334(this.field7048); ++j) {
                array[j] = this.field7046[j * Class4406.method13332(this.field7048) + i];
            }
            Class4406.method13335(this.field7048).method30725(array, this.field7047);
            for (int k = 0; k < Class4406.method13334(this.field7048); ++k) {
                this.field7046[k * Class4406.method13332(this.field7048) + i] = array[k];
            }
        }
    }
}
