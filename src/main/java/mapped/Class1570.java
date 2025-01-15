// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1570 implements Runnable
{
    private static String[] field8790;
    public final /* synthetic */ int field8791;
    public final /* synthetic */ int field8792;
    public final /* synthetic */ int field8793;
    public final /* synthetic */ int field8794;
    public final /* synthetic */ double[] field8795;
    public final /* synthetic */ Class6733 field8796;
    
    public Class1570(final Class6733 field8796, final int field8797, final int field8798, final int field8799, final int field8800, final double[] field8801) {
        this.field8796 = field8796;
        this.field8791 = field8797;
        this.field8792 = field8798;
        this.field8793 = field8799;
        this.field8794 = field8800;
        this.field8795 = field8801;
    }
    
    @Override
    public void run() {
        final double[] array = new double[2 * Class6733.method20474(this.field8796)];
        for (int i = this.field8791; i < this.field8792; ++i) {
            final int n = i * this.field8793;
            for (int j = 0; j < Class6733.method20477(this.field8796); ++j) {
                final int n2 = 2 * j;
                for (int k = 0; k < Class6733.method20474(this.field8796); ++k) {
                    final int n3 = n + k * this.field8794 + n2;
                    final int n4 = 2 * k;
                    array[n4] = this.field8795[n3];
                    array[n4 + 1] = this.field8795[n3 + 1];
                }
                Class6733.method20478(this.field8796).method26072(array);
                for (int l = 0; l < Class6733.method20474(this.field8796); ++l) {
                    final int n5 = n + l * this.field8794 + n2;
                    final int n6 = 2 * l;
                    this.field8795[n5] = array[n6];
                    this.field8795[n5 + 1] = array[n6 + 1];
                }
            }
        }
    }
}
