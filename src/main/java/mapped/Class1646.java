// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1646 implements Runnable
{
    private static String[] field9204;
    public final /* synthetic */ int field9205;
    public final /* synthetic */ int field9206;
    public final /* synthetic */ float[] field9207;
    public final /* synthetic */ boolean field9208;
    public final /* synthetic */ Class6362 field9209;
    
    public Class1646(final Class6362 field9209, final int field9210, final int field9211, final float[] field9212, final boolean field9213) {
        this.field9209 = field9209;
        this.field9205 = field9210;
        this.field9206 = field9211;
        this.field9207 = field9212;
        this.field9208 = field9213;
    }
    
    @Override
    public void run() {
        final float[] array = new float[2 * Class6362.method19003(this.field9209)];
        for (int i = this.field9205; i < this.field9206; ++i) {
            final int n = i * Class6362.method18999(this.field9209);
            for (int j = 0; j < Class6362.method19001(this.field9209); ++j) {
                final int n2 = 2 * j;
                for (int k = 0; k < Class6362.method19003(this.field9209); ++k) {
                    final int n3 = k * Class6362.method18997(this.field9209) + n + n2;
                    final int n4 = 2 * k;
                    array[n4] = this.field9207[n3];
                    array[n4 + 1] = this.field9207[n3 + 1];
                }
                Class6362.method19004(this.field9209).method25929(array, this.field9208);
                for (int l = 0; l < Class6362.method19003(this.field9209); ++l) {
                    final int n5 = l * Class6362.method18997(this.field9209) + n + n2;
                    final int n6 = 2 * l;
                    this.field9207[n5] = array[n6];
                    this.field9207[n5 + 1] = array[n6 + 1];
                }
            }
        }
    }
}
