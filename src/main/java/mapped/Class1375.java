// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1375 implements Runnable
{
    private static String[] field7551;
    public final /* synthetic */ int field7552;
    public final /* synthetic */ int field7553;
    public final /* synthetic */ int field7554;
    public final /* synthetic */ int field7555;
    public final /* synthetic */ double[] field7556;
    public final /* synthetic */ boolean field7557;
    public final /* synthetic */ int field7558;
    public final /* synthetic */ Class6733 field7559;
    
    public Class1375(final Class6733 field7559, final int field7560, final int field7561, final int field7562, final int field7563, final double[] field7564, final boolean field7565, final int field7566) {
        this.field7559 = field7559;
        this.field7552 = field7560;
        this.field7553 = field7561;
        this.field7554 = field7562;
        this.field7555 = field7563;
        this.field7556 = field7564;
        this.field7557 = field7565;
        this.field7558 = field7566;
    }
    
    @Override
    public void run() {
        final double[] array = new double[this.field7552];
        for (int i = this.field7553; i >= this.field7554; --i) {
            final int n = i * Class6733.method20473(this.field7559);
            final int n2 = i * this.field7555;
            for (int j = Class6733.method20474(this.field7559) - 1; j >= 0; --j) {
                System.arraycopy(this.field7556, n + j * Class6733.method20475(this.field7559), array, 0, Class6733.method20477(this.field7559));
                Class6733.method20476(this.field7559).method26092(array, this.field7557);
                System.arraycopy(array, 0, this.field7556, n2 + j * this.field7558, this.field7552);
            }
        }
    }
}
