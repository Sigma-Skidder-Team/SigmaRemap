// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1185 implements Runnable
{
    private static String[] field6422;
    public final /* synthetic */ int field6423;
    public final /* synthetic */ int field6424;
    public final /* synthetic */ int field6425;
    public final /* synthetic */ int field6426;
    public final /* synthetic */ double[][] field6427;
    public final /* synthetic */ boolean field6428;
    public final /* synthetic */ Class8788 field6429;
    
    public Class1185(final Class8788 field6429, final int field6430, final int field6431, final int field6432, final int field6433, final double[][] field6434, final boolean field6435) {
        this.field6429 = field6429;
        this.field6423 = field6430;
        this.field6424 = field6431;
        this.field6425 = field6432;
        this.field6426 = field6433;
        this.field6427 = field6434;
        this.field6428 = field6435;
    }
    
    @Override
    public void run() {
        final double[] array = new double[this.field6423];
        if (Class8788.method30610(this.field6429) <= 2) {
            if (Class8788.method30610(this.field6429) == 2) {
                for (int i = 0; i < Class8788.method30612(this.field6429); ++i) {
                    final int n = i;
                    array[n] = this.field6427[i][2 * this.field6425];
                    array[n + Class8788.method30612(this.field6429)] = this.field6427[i][2 * this.field6425 + 1];
                }
                if (this.field6424 != -1) {
                    Class8788.method30613(this.field6429).method21392(array, 0, this.field6428);
                    Class8788.method30613(this.field6429).method21392(array, Class8788.method30612(this.field6429), this.field6428);
                }
                else {
                    Class8788.method30613(this.field6429).method21388(array, 0);
                    Class8788.method30613(this.field6429).method21388(array, Class8788.method30612(this.field6429));
                }
                for (int j = 0; j < Class8788.method30612(this.field6429); ++j) {
                    final int n2 = j;
                    this.field6427[j][2 * this.field6425] = array[n2];
                    this.field6427[j][2 * this.field6425 + 1] = array[n2 + Class8788.method30612(this.field6429)];
                }
            }
        }
        else if (this.field6424 != -1) {
            for (int k = 4 * this.field6425; k < Class8788.method30610(this.field6429); k += 4 * this.field6426) {
                for (int l = 0; l < Class8788.method30612(this.field6429); ++l) {
                    final int n3 = Class8788.method30612(this.field6429) + l;
                    array[l] = this.field6427[l][k];
                    array[n3] = this.field6427[l][k + 1];
                    array[n3 + Class8788.method30612(this.field6429)] = this.field6427[l][k + 2];
                    array[n3 + 2 * Class8788.method30612(this.field6429)] = this.field6427[l][k + 3];
                }
                Class8788.method30613(this.field6429).method21392(array, 0, this.field6428);
                Class8788.method30613(this.field6429).method21392(array, Class8788.method30612(this.field6429), this.field6428);
                Class8788.method30613(this.field6429).method21392(array, 2 * Class8788.method30612(this.field6429), this.field6428);
                Class8788.method30613(this.field6429).method21392(array, 3 * Class8788.method30612(this.field6429), this.field6428);
                for (int n4 = 0; n4 < Class8788.method30612(this.field6429); ++n4) {
                    final int n5 = Class8788.method30612(this.field6429) + n4;
                    this.field6427[n4][k] = array[n4];
                    this.field6427[n4][k + 1] = array[n5];
                    this.field6427[n4][k + 2] = array[n5 + Class8788.method30612(this.field6429)];
                    this.field6427[n4][k + 3] = array[n5 + 2 * Class8788.method30612(this.field6429)];
                }
            }
        }
        else {
            for (int n6 = 4 * this.field6425; n6 < Class8788.method30610(this.field6429); n6 += 4 * this.field6426) {
                for (int n7 = 0; n7 < Class8788.method30612(this.field6429); ++n7) {
                    final int n8 = Class8788.method30612(this.field6429) + n7;
                    array[n7] = this.field6427[n7][n6];
                    array[n8] = this.field6427[n7][n6 + 1];
                    array[n8 + Class8788.method30612(this.field6429)] = this.field6427[n7][n6 + 2];
                    array[n8 + 2 * Class8788.method30612(this.field6429)] = this.field6427[n7][n6 + 3];
                }
                Class8788.method30613(this.field6429).method21388(array, 0);
                Class8788.method30613(this.field6429).method21388(array, Class8788.method30612(this.field6429));
                Class8788.method30613(this.field6429).method21388(array, 2 * Class8788.method30612(this.field6429));
                Class8788.method30613(this.field6429).method21388(array, 3 * Class8788.method30612(this.field6429));
                for (int n9 = 0; n9 < Class8788.method30612(this.field6429); ++n9) {
                    final int n10 = Class8788.method30612(this.field6429) + n9;
                    this.field6427[n9][n6] = array[n9];
                    this.field6427[n9][n6 + 1] = array[n10];
                    this.field6427[n9][n6 + 2] = array[n10 + Class8788.method30612(this.field6429)];
                    this.field6427[n9][n6 + 3] = array[n10 + 2 * Class8788.method30612(this.field6429)];
                }
            }
        }
    }
}
