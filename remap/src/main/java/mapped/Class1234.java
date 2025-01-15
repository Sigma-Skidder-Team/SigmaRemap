// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1234 implements Runnable
{
    private static String[] field6708;
    public final /* synthetic */ int field6709;
    public final /* synthetic */ int field6710;
    public final /* synthetic */ int field6711;
    public final /* synthetic */ int field6712;
    public final /* synthetic */ float[] field6713;
    public final /* synthetic */ boolean field6714;
    public final /* synthetic */ Class6874 field6715;
    
    public Class1234(final Class6874 field6715, final int field6716, final int field6717, final int field6718, final int field6719, final float[] field6720, final boolean field6721) {
        this.field6715 = field6715;
        this.field6709 = field6716;
        this.field6710 = field6717;
        this.field6711 = field6718;
        this.field6712 = field6719;
        this.field6713 = field6720;
        this.field6714 = field6721;
    }
    
    @Override
    public void run() {
        final float[] array = new float[this.field6709];
        if (Class6874.method21033(this.field6715) <= 2) {
            if (Class6874.method21033(this.field6715) == 2) {
                for (int i = 0; i < Class6874.method21035(this.field6715); ++i) {
                    final int n = i * Class6874.method21033(this.field6715) + 2 * this.field6711;
                    final int n2 = i;
                    array[n2] = this.field6713[n];
                    array[n2 + Class6874.method21035(this.field6715)] = this.field6713[n + 1];
                }
                if (this.field6710 != -1) {
                    Class6874.method21036(this.field6715).method30451(array, 0, this.field6714);
                    Class6874.method21036(this.field6715).method30451(array, Class6874.method21035(this.field6715), this.field6714);
                }
                else {
                    Class6874.method21036(this.field6715).method30447(array, 0);
                    Class6874.method21036(this.field6715).method30447(array, Class6874.method21035(this.field6715));
                }
                for (int j = 0; j < Class6874.method21035(this.field6715); ++j) {
                    final int n3 = j * Class6874.method21033(this.field6715) + 2 * this.field6711;
                    final int n4 = j;
                    this.field6713[n3] = array[n4];
                    this.field6713[n3 + 1] = array[n4 + Class6874.method21035(this.field6715)];
                }
            }
        }
        else if (this.field6710 != -1) {
            for (int k = 4 * this.field6711; k < Class6874.method21033(this.field6715); k += 4 * this.field6712) {
                for (int l = 0; l < Class6874.method21035(this.field6715); ++l) {
                    final int n5 = l * Class6874.method21033(this.field6715) + k;
                    final int n6 = Class6874.method21035(this.field6715) + l;
                    array[l] = this.field6713[n5];
                    array[n6] = this.field6713[n5 + 1];
                    array[n6 + Class6874.method21035(this.field6715)] = this.field6713[n5 + 2];
                    array[n6 + 2 * Class6874.method21035(this.field6715)] = this.field6713[n5 + 3];
                }
                Class6874.method21036(this.field6715).method30451(array, 0, this.field6714);
                Class6874.method21036(this.field6715).method30451(array, Class6874.method21035(this.field6715), this.field6714);
                Class6874.method21036(this.field6715).method30451(array, 2 * Class6874.method21035(this.field6715), this.field6714);
                Class6874.method21036(this.field6715).method30451(array, 3 * Class6874.method21035(this.field6715), this.field6714);
                for (int n7 = 0; n7 < Class6874.method21035(this.field6715); ++n7) {
                    final int n8 = n7 * Class6874.method21033(this.field6715) + k;
                    final int n9 = Class6874.method21035(this.field6715) + n7;
                    this.field6713[n8] = array[n7];
                    this.field6713[n8 + 1] = array[n9];
                    this.field6713[n8 + 2] = array[n9 + Class6874.method21035(this.field6715)];
                    this.field6713[n8 + 3] = array[n9 + 2 * Class6874.method21035(this.field6715)];
                }
            }
        }
        else {
            for (int n10 = 4 * this.field6711; n10 < Class6874.method21033(this.field6715); n10 += 4 * this.field6712) {
                for (int n11 = 0; n11 < Class6874.method21035(this.field6715); ++n11) {
                    final int n12 = n11 * Class6874.method21033(this.field6715) + n10;
                    final int n13 = Class6874.method21035(this.field6715) + n11;
                    array[n11] = this.field6713[n12];
                    array[n13] = this.field6713[n12 + 1];
                    array[n13 + Class6874.method21035(this.field6715)] = this.field6713[n12 + 2];
                    array[n13 + 2 * Class6874.method21035(this.field6715)] = this.field6713[n12 + 3];
                }
                Class6874.method21036(this.field6715).method30447(array, 0);
                Class6874.method21036(this.field6715).method30447(array, Class6874.method21035(this.field6715));
                Class6874.method21036(this.field6715).method30447(array, 2 * Class6874.method21035(this.field6715));
                Class6874.method21036(this.field6715).method30447(array, 3 * Class6874.method21035(this.field6715));
                for (int n14 = 0; n14 < Class6874.method21035(this.field6715); ++n14) {
                    final int n15 = n14 * Class6874.method21033(this.field6715) + n10;
                    final int n16 = Class6874.method21035(this.field6715) + n14;
                    this.field6713[n15] = array[n14];
                    this.field6713[n15 + 1] = array[n16];
                    this.field6713[n15 + 2] = array[n16 + Class6874.method21035(this.field6715)];
                    this.field6713[n15 + 3] = array[n16 + 2 * Class6874.method21035(this.field6715)];
                }
            }
        }
    }
}
