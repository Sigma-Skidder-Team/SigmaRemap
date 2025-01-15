// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1084 implements Runnable
{
    private static String[] field5848;
    public final /* synthetic */ int field5849;
    public final /* synthetic */ int field5850;
    public final /* synthetic */ int field5851;
    public final /* synthetic */ int field5852;
    public final /* synthetic */ float[] field5853;
    public final /* synthetic */ boolean field5854;
    public final /* synthetic */ Class6710 field5855;
    
    public Class1084(final Class6710 field5855, final int field5856, final int field5857, final int field5858, final int field5859, final float[] field5860, final boolean field5861) {
        this.field5855 = field5855;
        this.field5849 = field5856;
        this.field5850 = field5857;
        this.field5851 = field5858;
        this.field5852 = field5859;
        this.field5853 = field5860;
        this.field5854 = field5861;
    }
    
    @Override
    public void run() {
        final float[] array = new float[this.field5849];
        if (Class6710.method20380(this.field5855) <= 2) {
            if (Class6710.method20380(this.field5855) == 2) {
                for (int i = 0; i < Class6710.method20382(this.field5855); ++i) {
                    final int n = i * Class6710.method20380(this.field5855) + 2 * this.field5851;
                    final int n2 = i;
                    array[n2] = this.field5853[n];
                    array[n2 + Class6710.method20382(this.field5855)] = this.field5853[n + 1];
                }
                if (this.field5850 != -1) {
                    Class6710.method20383(this.field5855).method34187(array, 0, this.field5854);
                    Class6710.method20383(this.field5855).method34187(array, Class6710.method20382(this.field5855), this.field5854);
                }
                else {
                    Class6710.method20383(this.field5855).method34183(array, 0, this.field5854);
                    Class6710.method20383(this.field5855).method34183(array, Class6710.method20382(this.field5855), this.field5854);
                }
                for (int j = 0; j < Class6710.method20382(this.field5855); ++j) {
                    final int n3 = j * Class6710.method20380(this.field5855) + 2 * this.field5851;
                    final int n4 = j;
                    this.field5853[n3] = array[n4];
                    this.field5853[n3 + 1] = array[n4 + Class6710.method20382(this.field5855)];
                }
            }
        }
        else if (this.field5850 != -1) {
            for (int k = 4 * this.field5851; k < Class6710.method20380(this.field5855); k += 4 * this.field5852) {
                for (int l = 0; l < Class6710.method20382(this.field5855); ++l) {
                    final int n5 = l * Class6710.method20380(this.field5855) + k;
                    final int n6 = Class6710.method20382(this.field5855) + l;
                    array[l] = this.field5853[n5];
                    array[n6] = this.field5853[n5 + 1];
                    array[n6 + Class6710.method20382(this.field5855)] = this.field5853[n5 + 2];
                    array[n6 + 2 * Class6710.method20382(this.field5855)] = this.field5853[n5 + 3];
                }
                Class6710.method20383(this.field5855).method34187(array, 0, this.field5854);
                Class6710.method20383(this.field5855).method34187(array, Class6710.method20382(this.field5855), this.field5854);
                Class6710.method20383(this.field5855).method34187(array, 2 * Class6710.method20382(this.field5855), this.field5854);
                Class6710.method20383(this.field5855).method34187(array, 3 * Class6710.method20382(this.field5855), this.field5854);
                for (int n7 = 0; n7 < Class6710.method20382(this.field5855); ++n7) {
                    final int n8 = n7 * Class6710.method20380(this.field5855) + k;
                    final int n9 = Class6710.method20382(this.field5855) + n7;
                    this.field5853[n8] = array[n7];
                    this.field5853[n8 + 1] = array[n9];
                    this.field5853[n8 + 2] = array[n9 + Class6710.method20382(this.field5855)];
                    this.field5853[n8 + 3] = array[n9 + 2 * Class6710.method20382(this.field5855)];
                }
            }
        }
        else {
            for (int n10 = 4 * this.field5851; n10 < Class6710.method20380(this.field5855); n10 += 4 * this.field5852) {
                for (int n11 = 0; n11 < Class6710.method20382(this.field5855); ++n11) {
                    final int n12 = n11 * Class6710.method20380(this.field5855) + n10;
                    final int n13 = Class6710.method20382(this.field5855) + n11;
                    array[n11] = this.field5853[n12];
                    array[n13] = this.field5853[n12 + 1];
                    array[n13 + Class6710.method20382(this.field5855)] = this.field5853[n12 + 2];
                    array[n13 + 2 * Class6710.method20382(this.field5855)] = this.field5853[n12 + 3];
                }
                Class6710.method20383(this.field5855).method34183(array, 0, this.field5854);
                Class6710.method20383(this.field5855).method34183(array, Class6710.method20382(this.field5855), this.field5854);
                Class6710.method20383(this.field5855).method34183(array, 2 * Class6710.method20382(this.field5855), this.field5854);
                Class6710.method20383(this.field5855).method34183(array, 3 * Class6710.method20382(this.field5855), this.field5854);
                for (int n14 = 0; n14 < Class6710.method20382(this.field5855); ++n14) {
                    final int n15 = n14 * Class6710.method20380(this.field5855) + n10;
                    final int n16 = Class6710.method20382(this.field5855) + n14;
                    this.field5853[n15] = array[n14];
                    this.field5853[n15 + 1] = array[n16];
                    this.field5853[n15 + 2] = array[n16 + Class6710.method20382(this.field5855)];
                    this.field5853[n15 + 3] = array[n16 + 2 * Class6710.method20382(this.field5855)];
                }
            }
        }
    }
}
