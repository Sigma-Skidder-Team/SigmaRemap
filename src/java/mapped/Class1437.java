// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1437 implements Runnable
{
    private static String[] field7953;
    public final /* synthetic */ int field7954;
    public final /* synthetic */ int field7955;
    public final /* synthetic */ int field7956;
    public final /* synthetic */ int field7957;
    public final /* synthetic */ double[][][] field7958;
    public final /* synthetic */ boolean field7959;
    public final /* synthetic */ Class7796 field7960;
    
    public Class1437(final Class7796 field7960, final int field7961, final int field7962, final int field7963, final int field7964, final double[][][] field7965, final boolean field7966) {
        this.field7960 = field7960;
        this.field7954 = field7961;
        this.field7955 = field7962;
        this.field7956 = field7963;
        this.field7957 = field7964;
        this.field7958 = field7965;
        this.field7959 = field7966;
    }
    
    @Override
    public void run() {
        final double[] array = new double[this.field7954];
        if (this.field7955 != -1) {
            for (int i = this.field7956; i < Class7796.method25149(this.field7960); i += this.field7957) {
                for (int j = 0; j < Class7796.method25144(this.field7960); ++j) {
                    Class7796.method25146(this.field7960).method18040(this.field7958[i][j], this.field7959);
                }
                if (Class7796.method25147(this.field7960) <= 2) {
                    if (Class7796.method25147(this.field7960) == 2) {
                        for (int k = 0; k < Class7796.method25144(this.field7960); ++k) {
                            array[k] = this.field7958[i][k][0];
                            array[Class7796.method25144(this.field7960) + k] = this.field7958[i][k][1];
                        }
                        Class7796.method25148(this.field7960).method18042(array, 0, this.field7959);
                        Class7796.method25148(this.field7960).method18042(array, Class7796.method25144(this.field7960), this.field7959);
                        for (int l = 0; l < Class7796.method25144(this.field7960); ++l) {
                            this.field7958[i][l][0] = array[l];
                            this.field7958[i][l][1] = array[Class7796.method25144(this.field7960) + l];
                        }
                    }
                }
                else {
                    for (int n = 0; n < Class7796.method25147(this.field7960); n += 4) {
                        for (int n2 = 0; n2 < Class7796.method25144(this.field7960); ++n2) {
                            final int n3 = Class7796.method25144(this.field7960) + n2;
                            array[n2] = this.field7958[i][n2][n];
                            array[n3] = this.field7958[i][n2][n + 1];
                            array[n3 + Class7796.method25144(this.field7960)] = this.field7958[i][n2][n + 2];
                            array[n3 + 2 * Class7796.method25144(this.field7960)] = this.field7958[i][n2][n + 3];
                        }
                        Class7796.method25148(this.field7960).method18042(array, 0, this.field7959);
                        Class7796.method25148(this.field7960).method18042(array, Class7796.method25144(this.field7960), this.field7959);
                        Class7796.method25148(this.field7960).method18042(array, 2 * Class7796.method25144(this.field7960), this.field7959);
                        Class7796.method25148(this.field7960).method18042(array, 3 * Class7796.method25144(this.field7960), this.field7959);
                        for (int n4 = 0; n4 < Class7796.method25144(this.field7960); ++n4) {
                            final int n5 = Class7796.method25144(this.field7960) + n4;
                            this.field7958[i][n4][n] = array[n4];
                            this.field7958[i][n4][n + 1] = array[n5];
                            this.field7958[i][n4][n + 2] = array[n5 + Class7796.method25144(this.field7960)];
                            this.field7958[i][n4][n + 3] = array[n5 + 2 * Class7796.method25144(this.field7960)];
                        }
                    }
                }
            }
        }
        else {
            for (int field7956 = this.field7956; field7956 < Class7796.method25149(this.field7960); field7956 += this.field7957) {
                for (int n6 = 0; n6 < Class7796.method25144(this.field7960); ++n6) {
                    Class7796.method25146(this.field7960).method18036(this.field7958[field7956][n6], this.field7959);
                }
                if (Class7796.method25147(this.field7960) <= 2) {
                    if (Class7796.method25147(this.field7960) == 2) {
                        for (int n7 = 0; n7 < Class7796.method25144(this.field7960); ++n7) {
                            array[n7] = this.field7958[field7956][n7][0];
                            array[Class7796.method25144(this.field7960) + n7] = this.field7958[field7956][n7][1];
                        }
                        Class7796.method25148(this.field7960).method18038(array, 0, this.field7959);
                        Class7796.method25148(this.field7960).method18038(array, Class7796.method25144(this.field7960), this.field7959);
                        for (int n8 = 0; n8 < Class7796.method25144(this.field7960); ++n8) {
                            this.field7958[field7956][n8][0] = array[n8];
                            this.field7958[field7956][n8][1] = array[Class7796.method25144(this.field7960) + n8];
                        }
                    }
                }
                else {
                    for (int n9 = 0; n9 < Class7796.method25147(this.field7960); n9 += 4) {
                        for (int n10 = 0; n10 < Class7796.method25144(this.field7960); ++n10) {
                            final int n11 = Class7796.method25144(this.field7960) + n10;
                            array[n10] = this.field7958[field7956][n10][n9];
                            array[n11] = this.field7958[field7956][n10][n9 + 1];
                            array[n11 + Class7796.method25144(this.field7960)] = this.field7958[field7956][n10][n9 + 2];
                            array[n11 + 2 * Class7796.method25144(this.field7960)] = this.field7958[field7956][n10][n9 + 3];
                        }
                        Class7796.method25148(this.field7960).method18038(array, 0, this.field7959);
                        Class7796.method25148(this.field7960).method18038(array, Class7796.method25144(this.field7960), this.field7959);
                        Class7796.method25148(this.field7960).method18038(array, 2 * Class7796.method25144(this.field7960), this.field7959);
                        Class7796.method25148(this.field7960).method18038(array, 3 * Class7796.method25144(this.field7960), this.field7959);
                        for (int n12 = 0; n12 < Class7796.method25144(this.field7960); ++n12) {
                            final int n13 = Class7796.method25144(this.field7960) + n12;
                            this.field7958[field7956][n12][n9] = array[n12];
                            this.field7958[field7956][n12][n9 + 1] = array[n13];
                            this.field7958[field7956][n12][n9 + 2] = array[n13 + Class7796.method25144(this.field7960)];
                            this.field7958[field7956][n12][n9 + 3] = array[n13 + 2 * Class7796.method25144(this.field7960)];
                        }
                    }
                }
            }
        }
    }
}
