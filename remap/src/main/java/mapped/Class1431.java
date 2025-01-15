// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1431 implements Runnable
{
    private static String[] field7914;
    public final /* synthetic */ int field7915;
    public final /* synthetic */ int field7916;
    public final /* synthetic */ int field7917;
    public final /* synthetic */ int field7918;
    public final /* synthetic */ float[][] field7919;
    public final /* synthetic */ boolean field7920;
    public final /* synthetic */ Class6874 field7921;
    
    public Class1431(final Class6874 field7921, final int field7922, final int field7923, final int field7924, final int field7925, final float[][] field7926, final boolean field7927) {
        this.field7921 = field7921;
        this.field7915 = field7922;
        this.field7916 = field7923;
        this.field7917 = field7924;
        this.field7918 = field7925;
        this.field7919 = field7926;
        this.field7920 = field7927;
    }
    
    @Override
    public void run() {
        final float[] array = new float[this.field7915];
        if (Class6874.method21033(this.field7921) <= 2) {
            if (Class6874.method21033(this.field7921) == 2) {
                for (int i = 0; i < Class6874.method21035(this.field7921); ++i) {
                    final int n = i;
                    array[n] = this.field7919[i][2 * this.field7917];
                    array[n + Class6874.method21035(this.field7921)] = this.field7919[i][2 * this.field7917 + 1];
                }
                if (this.field7916 != -1) {
                    Class6874.method21036(this.field7921).method30451(array, 0, this.field7920);
                    Class6874.method21036(this.field7921).method30451(array, Class6874.method21035(this.field7921), this.field7920);
                }
                else {
                    Class6874.method21036(this.field7921).method30447(array, 0);
                    Class6874.method21036(this.field7921).method30447(array, Class6874.method21035(this.field7921));
                }
                for (int j = 0; j < Class6874.method21035(this.field7921); ++j) {
                    final int n2 = j;
                    this.field7919[j][2 * this.field7917] = array[n2];
                    this.field7919[j][2 * this.field7917 + 1] = array[n2 + Class6874.method21035(this.field7921)];
                }
            }
        }
        else if (this.field7916 != -1) {
            for (int k = 4 * this.field7917; k < Class6874.method21033(this.field7921); k += 4 * this.field7918) {
                for (int l = 0; l < Class6874.method21035(this.field7921); ++l) {
                    final int n3 = Class6874.method21035(this.field7921) + l;
                    array[l] = this.field7919[l][k];
                    array[n3] = this.field7919[l][k + 1];
                    array[n3 + Class6874.method21035(this.field7921)] = this.field7919[l][k + 2];
                    array[n3 + 2 * Class6874.method21035(this.field7921)] = this.field7919[l][k + 3];
                }
                Class6874.method21036(this.field7921).method30451(array, 0, this.field7920);
                Class6874.method21036(this.field7921).method30451(array, Class6874.method21035(this.field7921), this.field7920);
                Class6874.method21036(this.field7921).method30451(array, 2 * Class6874.method21035(this.field7921), this.field7920);
                Class6874.method21036(this.field7921).method30451(array, 3 * Class6874.method21035(this.field7921), this.field7920);
                for (int n4 = 0; n4 < Class6874.method21035(this.field7921); ++n4) {
                    final int n5 = Class6874.method21035(this.field7921) + n4;
                    this.field7919[n4][k] = array[n4];
                    this.field7919[n4][k + 1] = array[n5];
                    this.field7919[n4][k + 2] = array[n5 + Class6874.method21035(this.field7921)];
                    this.field7919[n4][k + 3] = array[n5 + 2 * Class6874.method21035(this.field7921)];
                }
            }
        }
        else {
            for (int n6 = 4 * this.field7917; n6 < Class6874.method21033(this.field7921); n6 += 4 * this.field7918) {
                for (int n7 = 0; n7 < Class6874.method21035(this.field7921); ++n7) {
                    final int n8 = Class6874.method21035(this.field7921) + n7;
                    array[n7] = this.field7919[n7][n6];
                    array[n8] = this.field7919[n7][n6 + 1];
                    array[n8 + Class6874.method21035(this.field7921)] = this.field7919[n7][n6 + 2];
                    array[n8 + 2 * Class6874.method21035(this.field7921)] = this.field7919[n7][n6 + 3];
                }
                Class6874.method21036(this.field7921).method30447(array, 0);
                Class6874.method21036(this.field7921).method30447(array, Class6874.method21035(this.field7921));
                Class6874.method21036(this.field7921).method30447(array, 2 * Class6874.method21035(this.field7921));
                Class6874.method21036(this.field7921).method30447(array, 3 * Class6874.method21035(this.field7921));
                for (int n9 = 0; n9 < Class6874.method21035(this.field7921); ++n9) {
                    final int n10 = Class6874.method21035(this.field7921) + n9;
                    this.field7919[n9][n6] = array[n9];
                    this.field7919[n9][n6 + 1] = array[n10];
                    this.field7919[n9][n6 + 2] = array[n10 + Class6874.method21035(this.field7921)];
                    this.field7919[n9][n6 + 3] = array[n10 + 2 * Class6874.method21035(this.field7921)];
                }
            }
        }
    }
}
