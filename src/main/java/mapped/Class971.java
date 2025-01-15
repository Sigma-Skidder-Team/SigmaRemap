// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class971 implements Runnable
{
    private static String[] field5169;
    public final /* synthetic */ int field5170;
    public final /* synthetic */ int field5171;
    public final /* synthetic */ int field5172;
    public final /* synthetic */ int field5173;
    public final /* synthetic */ double[][] field5174;
    public final /* synthetic */ boolean field5175;
    public final /* synthetic */ Class4406 field5176;
    
    public Class971(final Class4406 field5176, final int field5177, final int field5178, final int field5179, final int field5180, final double[][] field5181, final boolean field5182) {
        this.field5176 = field5176;
        this.field5170 = field5177;
        this.field5171 = field5178;
        this.field5172 = field5179;
        this.field5173 = field5180;
        this.field5174 = field5181;
        this.field5175 = field5182;
    }
    
    @Override
    public void run() {
        final double[] array = new double[this.field5170];
        if (Class4406.method13332(this.field5176) <= 2) {
            if (Class4406.method13332(this.field5176) == 2) {
                for (int i = 0; i < Class4406.method13334(this.field5176); ++i) {
                    final int n = i;
                    array[n] = this.field5174[i][2 * this.field5172];
                    array[n + Class4406.method13334(this.field5176)] = this.field5174[i][2 * this.field5172 + 1];
                }
                if (this.field5171 != -1) {
                    Class4406.method13335(this.field5176).method30727(array, 0, this.field5175);
                    Class4406.method13335(this.field5176).method30727(array, Class4406.method13334(this.field5176), this.field5175);
                }
                else {
                    Class4406.method13335(this.field5176).method30723(array, 0, this.field5175);
                    Class4406.method13335(this.field5176).method30723(array, Class4406.method13334(this.field5176), this.field5175);
                }
                for (int j = 0; j < Class4406.method13334(this.field5176); ++j) {
                    final int n2 = j;
                    this.field5174[j][2 * this.field5172] = array[n2];
                    this.field5174[j][2 * this.field5172 + 1] = array[n2 + Class4406.method13334(this.field5176)];
                }
            }
        }
        else if (this.field5171 != -1) {
            for (int k = 4 * this.field5172; k < Class4406.method13332(this.field5176); k += 4 * this.field5173) {
                for (int l = 0; l < Class4406.method13334(this.field5176); ++l) {
                    final int n3 = Class4406.method13334(this.field5176) + l;
                    array[l] = this.field5174[l][k];
                    array[n3] = this.field5174[l][k + 1];
                    array[n3 + Class4406.method13334(this.field5176)] = this.field5174[l][k + 2];
                    array[n3 + 2 * Class4406.method13334(this.field5176)] = this.field5174[l][k + 3];
                }
                Class4406.method13335(this.field5176).method30727(array, 0, this.field5175);
                Class4406.method13335(this.field5176).method30727(array, Class4406.method13334(this.field5176), this.field5175);
                Class4406.method13335(this.field5176).method30727(array, 2 * Class4406.method13334(this.field5176), this.field5175);
                Class4406.method13335(this.field5176).method30727(array, 3 * Class4406.method13334(this.field5176), this.field5175);
                for (int n4 = 0; n4 < Class4406.method13334(this.field5176); ++n4) {
                    final int n5 = Class4406.method13334(this.field5176) + n4;
                    this.field5174[n4][k] = array[n4];
                    this.field5174[n4][k + 1] = array[n5];
                    this.field5174[n4][k + 2] = array[n5 + Class4406.method13334(this.field5176)];
                    this.field5174[n4][k + 3] = array[n5 + 2 * Class4406.method13334(this.field5176)];
                }
            }
        }
        else {
            for (int n6 = 4 * this.field5172; n6 < Class4406.method13332(this.field5176); n6 += 4 * this.field5173) {
                for (int n7 = 0; n7 < Class4406.method13334(this.field5176); ++n7) {
                    final int n8 = Class4406.method13334(this.field5176) + n7;
                    array[n7] = this.field5174[n7][n6];
                    array[n8] = this.field5174[n7][n6 + 1];
                    array[n8 + Class4406.method13334(this.field5176)] = this.field5174[n7][n6 + 2];
                    array[n8 + 2 * Class4406.method13334(this.field5176)] = this.field5174[n7][n6 + 3];
                }
                Class4406.method13335(this.field5176).method30723(array, 0, this.field5175);
                Class4406.method13335(this.field5176).method30723(array, Class4406.method13334(this.field5176), this.field5175);
                Class4406.method13335(this.field5176).method30723(array, 2 * Class4406.method13334(this.field5176), this.field5175);
                Class4406.method13335(this.field5176).method30723(array, 3 * Class4406.method13334(this.field5176), this.field5175);
                for (int n9 = 0; n9 < Class4406.method13334(this.field5176); ++n9) {
                    final int n10 = Class4406.method13334(this.field5176) + n9;
                    this.field5174[n9][n6] = array[n9];
                    this.field5174[n9][n6 + 1] = array[n10];
                    this.field5174[n9][n6 + 2] = array[n10 + Class4406.method13334(this.field5176)];
                    this.field5174[n9][n6 + 3] = array[n10 + 2 * Class4406.method13334(this.field5176)];
                }
            }
        }
    }
}
