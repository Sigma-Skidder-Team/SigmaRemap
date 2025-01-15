// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1046 implements Runnable
{
    private static String[] field5607;
    public final /* synthetic */ int field5608;
    public final /* synthetic */ int field5609;
    public final /* synthetic */ float[] field5610;
    public final /* synthetic */ Class6362 field5611;
    
    public Class1046(final Class6362 field5611, final int field5612, final int field5613, final float[] field5614) {
        this.field5611 = field5611;
        this.field5608 = field5612;
        this.field5609 = field5613;
        this.field5610 = field5614;
    }
    
    @Override
    public void run() {
        final float[] array = new float[2 * Class6362.method18998(this.field5611)];
        for (int i = this.field5608; i < this.field5609; ++i) {
            final int n = i * Class6362.method18997(this.field5611);
            for (int j = 0; j < Class6362.method19001(this.field5611); ++j) {
                final int n2 = 2 * j;
                for (int k = 0; k < Class6362.method18998(this.field5611); ++k) {
                    final int n3 = n + n2 + k * Class6362.method18999(this.field5611);
                    final int n4 = 2 * k;
                    array[n4] = this.field5610[n3];
                    array[n4 + 1] = this.field5610[n3 + 1];
                }
                Class6362.method19002(this.field5611).method25925(array);
                for (int l = 0; l < Class6362.method18998(this.field5611); ++l) {
                    final int n5 = n + n2 + l * Class6362.method18999(this.field5611);
                    final int n6 = 2 * l;
                    this.field5610[n5] = array[n6];
                    this.field5610[n5 + 1] = array[n6 + 1];
                }
            }
        }
    }
}
