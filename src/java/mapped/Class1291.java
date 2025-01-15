// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1291 implements Runnable
{
    private static String[] field7049;
    public final /* synthetic */ int field7050;
    public final /* synthetic */ int field7051;
    public final /* synthetic */ int field7052;
    public final /* synthetic */ int field7053;
    public final /* synthetic */ float[][] field7054;
    public final /* synthetic */ boolean field7055;
    public final /* synthetic */ Class6710 field7056;
    
    public Class1291(final Class6710 field7056, final int field7057, final int field7058, final int field7059, final int field7060, final float[][] field7061, final boolean field7062) {
        this.field7056 = field7056;
        this.field7050 = field7057;
        this.field7051 = field7058;
        this.field7052 = field7059;
        this.field7053 = field7060;
        this.field7054 = field7061;
        this.field7055 = field7062;
    }
    
    @Override
    public void run() {
        final float[] array = new float[this.field7050];
        if (Class6710.method20380(this.field7056) <= 2) {
            if (Class6710.method20380(this.field7056) == 2) {
                for (int i = 0; i < Class6710.method20382(this.field7056); ++i) {
                    final int n = i;
                    array[n] = this.field7054[i][2 * this.field7052];
                    array[n + Class6710.method20382(this.field7056)] = this.field7054[i][2 * this.field7052 + 1];
                }
                if (this.field7051 != -1) {
                    Class6710.method20383(this.field7056).method34187(array, 0, this.field7055);
                    Class6710.method20383(this.field7056).method34187(array, Class6710.method20382(this.field7056), this.field7055);
                }
                else {
                    Class6710.method20383(this.field7056).method34183(array, 0, this.field7055);
                    Class6710.method20383(this.field7056).method34183(array, Class6710.method20382(this.field7056), this.field7055);
                }
                for (int j = 0; j < Class6710.method20382(this.field7056); ++j) {
                    final int n2 = j;
                    this.field7054[j][2 * this.field7052] = array[n2];
                    this.field7054[j][2 * this.field7052 + 1] = array[n2 + Class6710.method20382(this.field7056)];
                }
            }
        }
        else if (this.field7051 != -1) {
            for (int k = 4 * this.field7052; k < Class6710.method20380(this.field7056); k += 4 * this.field7053) {
                for (int l = 0; l < Class6710.method20382(this.field7056); ++l) {
                    final int n3 = Class6710.method20382(this.field7056) + l;
                    array[l] = this.field7054[l][k];
                    array[n3] = this.field7054[l][k + 1];
                    array[n3 + Class6710.method20382(this.field7056)] = this.field7054[l][k + 2];
                    array[n3 + 2 * Class6710.method20382(this.field7056)] = this.field7054[l][k + 3];
                }
                Class6710.method20383(this.field7056).method34187(array, 0, this.field7055);
                Class6710.method20383(this.field7056).method34187(array, Class6710.method20382(this.field7056), this.field7055);
                Class6710.method20383(this.field7056).method34187(array, 2 * Class6710.method20382(this.field7056), this.field7055);
                Class6710.method20383(this.field7056).method34187(array, 3 * Class6710.method20382(this.field7056), this.field7055);
                for (int n4 = 0; n4 < Class6710.method20382(this.field7056); ++n4) {
                    final int n5 = Class6710.method20382(this.field7056) + n4;
                    this.field7054[n4][k] = array[n4];
                    this.field7054[n4][k + 1] = array[n5];
                    this.field7054[n4][k + 2] = array[n5 + Class6710.method20382(this.field7056)];
                    this.field7054[n4][k + 3] = array[n5 + 2 * Class6710.method20382(this.field7056)];
                }
            }
        }
        else {
            for (int n6 = 4 * this.field7052; n6 < Class6710.method20380(this.field7056); n6 += 4 * this.field7053) {
                for (int n7 = 0; n7 < Class6710.method20382(this.field7056); ++n7) {
                    final int n8 = Class6710.method20382(this.field7056) + n7;
                    array[n7] = this.field7054[n7][n6];
                    array[n8] = this.field7054[n7][n6 + 1];
                    array[n8 + Class6710.method20382(this.field7056)] = this.field7054[n7][n6 + 2];
                    array[n8 + 2 * Class6710.method20382(this.field7056)] = this.field7054[n7][n6 + 3];
                }
                Class6710.method20383(this.field7056).method34183(array, 0, this.field7055);
                Class6710.method20383(this.field7056).method34183(array, Class6710.method20382(this.field7056), this.field7055);
                Class6710.method20383(this.field7056).method34183(array, 2 * Class6710.method20382(this.field7056), this.field7055);
                Class6710.method20383(this.field7056).method34183(array, 3 * Class6710.method20382(this.field7056), this.field7055);
                for (int n9 = 0; n9 < Class6710.method20382(this.field7056); ++n9) {
                    final int n10 = Class6710.method20382(this.field7056) + n9;
                    this.field7054[n9][n6] = array[n9];
                    this.field7054[n9][n6 + 1] = array[n10];
                    this.field7054[n9][n6 + 2] = array[n10 + Class6710.method20382(this.field7056)];
                    this.field7054[n9][n6 + 3] = array[n10 + 2 * Class6710.method20382(this.field7056)];
                }
            }
        }
    }
}
