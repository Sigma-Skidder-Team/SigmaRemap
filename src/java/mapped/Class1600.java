// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1600 implements Runnable
{
    private static String[] field8935;
    public final /* synthetic */ int field8936;
    public final /* synthetic */ int field8937;
    public final /* synthetic */ float[] field8938;
    public final /* synthetic */ Class6362 field8939;
    
    public Class1600(final Class6362 field8939, final int field8940, final int field8941, final float[] field8942) {
        this.field8939 = field8939;
        this.field8936 = field8940;
        this.field8937 = field8941;
        this.field8938 = field8942;
    }
    
    @Override
    public void run() {
        final float[] array = new float[2 * Class6362.method19003(this.field8939)];
        for (int i = this.field8936; i < this.field8937; ++i) {
            final int n = i * Class6362.method18999(this.field8939);
            for (int j = 0; j < Class6362.method19001(this.field8939); ++j) {
                final int n2 = 2 * j;
                for (int k = 0; k < Class6362.method19003(this.field8939); ++k) {
                    final int n3 = k * Class6362.method18997(this.field8939) + n + n2;
                    final int n4 = 2 * k;
                    array[n4] = this.field8938[n3];
                    array[n4 + 1] = this.field8938[n3 + 1];
                }
                Class6362.method19004(this.field8939).method25925(array);
                for (int l = 0; l < Class6362.method19003(this.field8939); ++l) {
                    final int n5 = l * Class6362.method18997(this.field8939) + n + n2;
                    final int n6 = 2 * l;
                    this.field8938[n5] = array[n6];
                    this.field8938[n5 + 1] = array[n6 + 1];
                }
            }
        }
    }
}
