// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1356 implements Runnable
{
    private static String[] field7432;
    public final /* synthetic */ int field7433;
    public final /* synthetic */ int field7434;
    public final /* synthetic */ double[] field7435;
    public final /* synthetic */ Class5815 field7436;
    
    public Class1356(final Class5815 field7436, final int field7437, final int field7438, final double[] field7439) {
        this.field7436 = field7436;
        this.field7433 = field7437;
        this.field7434 = field7438;
        this.field7435 = field7439;
    }
    
    @Override
    public void run() {
        final double[] array = new double[Class5815.method17498(this.field7436)];
        for (int i = this.field7433; i < this.field7434; ++i) {
            final int n = i * Class5815.method17497(this.field7436);
            for (int j = 0; j < Class5815.method17501(this.field7436); ++j) {
                for (int k = 0; k < Class5815.method17498(this.field7436); ++k) {
                    array[k] = this.field7435[n + k * Class5815.method17499(this.field7436) + j];
                }
                Class5815.method17502(this.field7436).method21386(array);
                for (int l = 0; l < Class5815.method17498(this.field7436); ++l) {
                    this.field7435[n + l * Class5815.method17499(this.field7436) + j] = array[l];
                }
            }
        }
    }
}
