// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1231 implements Runnable
{
    private static String[] field6690;
    public final /* synthetic */ int field6691;
    public final /* synthetic */ int field6692;
    public final /* synthetic */ float[] field6693;
    public final /* synthetic */ boolean field6694;
    public final /* synthetic */ Class6362 field6695;
    
    public Class1231(final Class6362 field6695, final int field6696, final int field6697, final float[] field6698, final boolean field6699) {
        this.field6695 = field6695;
        this.field6691 = field6696;
        this.field6692 = field6697;
        this.field6693 = field6698;
        this.field6694 = field6699;
    }
    
    @Override
    public void run() {
        final float[] array = new float[2 * Class6362.method18998(this.field6695)];
        for (int i = this.field6691; i < this.field6692; ++i) {
            final int n = i * Class6362.method18997(this.field6695);
            for (int j = 0; j < Class6362.method19001(this.field6695); ++j) {
                final int n2 = 2 * j;
                for (int k = 0; k < Class6362.method18998(this.field6695); ++k) {
                    final int n3 = n + n2 + k * Class6362.method18999(this.field6695);
                    final int n4 = 2 * k;
                    array[n4] = this.field6693[n3];
                    array[n4 + 1] = this.field6693[n3 + 1];
                }
                Class6362.method19002(this.field6695).method25929(array, this.field6694);
                for (int l = 0; l < Class6362.method18998(this.field6695); ++l) {
                    final int n5 = n + n2 + l * Class6362.method18999(this.field6695);
                    final int n6 = 2 * l;
                    this.field6693[n5] = array[n6];
                    this.field6693[n5 + 1] = array[n6 + 1];
                }
            }
        }
    }
}
