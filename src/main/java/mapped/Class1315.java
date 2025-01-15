// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1315 implements Runnable
{
    private static String[] field7209;
    public final /* synthetic */ int field7210;
    public final /* synthetic */ int field7211;
    public final /* synthetic */ int field7212;
    public final /* synthetic */ int field7213;
    public final /* synthetic */ double[] field7214;
    public final /* synthetic */ boolean field7215;
    public final /* synthetic */ Class8788 field7216;
    
    public Class1315(final Class8788 field7216, final int field7217, final int field7218, final int field7219, final int field7220, final double[] field7221, final boolean field7222) {
        this.field7216 = field7216;
        this.field7210 = field7217;
        this.field7211 = field7218;
        this.field7212 = field7219;
        this.field7213 = field7220;
        this.field7214 = field7221;
        this.field7215 = field7222;
    }
    
    @Override
    public void run() {
        final double[] array = new double[this.field7210];
        if (Class8788.method30610(this.field7216) <= 2) {
            if (Class8788.method30610(this.field7216) == 2) {
                for (int i = 0; i < Class8788.method30612(this.field7216); ++i) {
                    final int n = i * Class8788.method30610(this.field7216) + 2 * this.field7212;
                    final int n2 = i;
                    array[n2] = this.field7214[n];
                    array[n2 + Class8788.method30612(this.field7216)] = this.field7214[n + 1];
                }
                if (this.field7211 != -1) {
                    Class8788.method30613(this.field7216).method21392(array, 0, this.field7215);
                    Class8788.method30613(this.field7216).method21392(array, Class8788.method30612(this.field7216), this.field7215);
                }
                else {
                    Class8788.method30613(this.field7216).method21388(array, 0);
                    Class8788.method30613(this.field7216).method21388(array, Class8788.method30612(this.field7216));
                }
                for (int j = 0; j < Class8788.method30612(this.field7216); ++j) {
                    final int n3 = j * Class8788.method30610(this.field7216) + 2 * this.field7212;
                    final int n4 = j;
                    this.field7214[n3] = array[n4];
                    this.field7214[n3 + 1] = array[n4 + Class8788.method30612(this.field7216)];
                }
            }
        }
        else if (this.field7211 != -1) {
            for (int k = 4 * this.field7212; k < Class8788.method30610(this.field7216); k += 4 * this.field7213) {
                for (int l = 0; l < Class8788.method30612(this.field7216); ++l) {
                    final int n5 = l * Class8788.method30610(this.field7216) + k;
                    final int n6 = Class8788.method30612(this.field7216) + l;
                    array[l] = this.field7214[n5];
                    array[n6] = this.field7214[n5 + 1];
                    array[n6 + Class8788.method30612(this.field7216)] = this.field7214[n5 + 2];
                    array[n6 + 2 * Class8788.method30612(this.field7216)] = this.field7214[n5 + 3];
                }
                Class8788.method30613(this.field7216).method21392(array, 0, this.field7215);
                Class8788.method30613(this.field7216).method21392(array, Class8788.method30612(this.field7216), this.field7215);
                Class8788.method30613(this.field7216).method21392(array, 2 * Class8788.method30612(this.field7216), this.field7215);
                Class8788.method30613(this.field7216).method21392(array, 3 * Class8788.method30612(this.field7216), this.field7215);
                for (int n7 = 0; n7 < Class8788.method30612(this.field7216); ++n7) {
                    final int n8 = n7 * Class8788.method30610(this.field7216) + k;
                    final int n9 = Class8788.method30612(this.field7216) + n7;
                    this.field7214[n8] = array[n7];
                    this.field7214[n8 + 1] = array[n9];
                    this.field7214[n8 + 2] = array[n9 + Class8788.method30612(this.field7216)];
                    this.field7214[n8 + 3] = array[n9 + 2 * Class8788.method30612(this.field7216)];
                }
            }
        }
        else {
            for (int n10 = 4 * this.field7212; n10 < Class8788.method30610(this.field7216); n10 += 4 * this.field7213) {
                for (int n11 = 0; n11 < Class8788.method30612(this.field7216); ++n11) {
                    final int n12 = n11 * Class8788.method30610(this.field7216) + n10;
                    final int n13 = Class8788.method30612(this.field7216) + n11;
                    array[n11] = this.field7214[n12];
                    array[n13] = this.field7214[n12 + 1];
                    array[n13 + Class8788.method30612(this.field7216)] = this.field7214[n12 + 2];
                    array[n13 + 2 * Class8788.method30612(this.field7216)] = this.field7214[n12 + 3];
                }
                Class8788.method30613(this.field7216).method21388(array, 0);
                Class8788.method30613(this.field7216).method21388(array, Class8788.method30612(this.field7216));
                Class8788.method30613(this.field7216).method21388(array, 2 * Class8788.method30612(this.field7216));
                Class8788.method30613(this.field7216).method21388(array, 3 * Class8788.method30612(this.field7216));
                for (int n14 = 0; n14 < Class8788.method30612(this.field7216); ++n14) {
                    final int n15 = n14 * Class8788.method30610(this.field7216) + n10;
                    final int n16 = Class8788.method30612(this.field7216) + n14;
                    this.field7214[n15] = array[n14];
                    this.field7214[n15 + 1] = array[n16];
                    this.field7214[n15 + 2] = array[n16 + Class8788.method30612(this.field7216)];
                    this.field7214[n15 + 3] = array[n16 + 2 * Class8788.method30612(this.field7216)];
                }
            }
        }
    }
}
