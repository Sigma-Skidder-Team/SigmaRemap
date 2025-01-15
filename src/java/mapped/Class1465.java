// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1465 implements Runnable
{
    private static String[] field8129;
    public final /* synthetic */ int field8130;
    public final /* synthetic */ int field8131;
    public final /* synthetic */ int field8132;
    public final /* synthetic */ int field8133;
    public final /* synthetic */ float[] field8134;
    public final /* synthetic */ boolean field8135;
    public final /* synthetic */ Class6362 field8136;
    
    public Class1465(final Class6362 field8136, final int field8137, final int field8138, final int field8139, final int field8140, final float[] field8141, final boolean field8142) {
        this.field8136 = field8136;
        this.field8130 = field8137;
        this.field8131 = field8138;
        this.field8132 = field8139;
        this.field8133 = field8140;
        this.field8134 = field8141;
        this.field8135 = field8142;
    }
    
    @Override
    public void run() {
        final float[] array = new float[2 * Class6362.method18998(this.field8136)];
        for (int i = this.field8130; i < this.field8131; ++i) {
            final int n = i * this.field8132;
            for (int j = 0; j < Class6362.method19001(this.field8136); ++j) {
                final int n2 = 2 * j;
                for (int k = 0; k < Class6362.method18998(this.field8136); ++k) {
                    final int n3 = n + k * this.field8133 + n2;
                    final int n4 = 2 * k;
                    array[n4] = this.field8134[n3];
                    array[n4 + 1] = this.field8134[n3 + 1];
                }
                Class6362.method19002(this.field8136).method25929(array, this.field8135);
                for (int l = 0; l < Class6362.method18998(this.field8136); ++l) {
                    final int n5 = n + l * this.field8133 + n2;
                    final int n6 = 2 * l;
                    this.field8134[n5] = array[n6];
                    this.field8134[n5 + 1] = array[n6 + 1];
                }
            }
        }
    }
}
