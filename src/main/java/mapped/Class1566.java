// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1566 implements Runnable
{
    private static String[] field8763;
    public final /* synthetic */ int field8764;
    public final /* synthetic */ int field8765;
    public final /* synthetic */ int field8766;
    public final /* synthetic */ int field8767;
    public final /* synthetic */ float[] field8768;
    public final /* synthetic */ Class6362 field8769;
    
    public Class1566(final Class6362 field8769, final int field8770, final int field8771, final int field8772, final int field8773, final float[] field8774) {
        this.field8769 = field8769;
        this.field8764 = field8770;
        this.field8765 = field8771;
        this.field8766 = field8772;
        this.field8767 = field8773;
        this.field8768 = field8774;
    }
    
    @Override
    public void run() {
        final float[] array = new float[2 * Class6362.method19003(this.field8769)];
        for (int i = this.field8764; i < this.field8765; ++i) {
            final int n = i * this.field8766;
            for (int j = 0; j < Class6362.method19001(this.field8769); ++j) {
                final int n2 = 2 * j;
                for (int k = 0; k < Class6362.method19003(this.field8769); ++k) {
                    final int n3 = 2 * k;
                    final int n4 = k * this.field8767 + n + n2;
                    array[n3] = this.field8768[n4];
                    array[n3 + 1] = this.field8768[n4 + 1];
                }
                Class6362.method19004(this.field8769).method25925(array);
                for (int l = 0; l < Class6362.method19003(this.field8769); ++l) {
                    final int n5 = 2 * l;
                    final int n6 = l * this.field8767 + n + n2;
                    this.field8768[n6] = array[n5];
                    this.field8768[n6 + 1] = array[n5 + 1];
                }
            }
        }
    }
}
