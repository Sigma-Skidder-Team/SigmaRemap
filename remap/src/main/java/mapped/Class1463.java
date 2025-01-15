// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1463 implements Runnable
{
    private static String[] field8115;
    public final /* synthetic */ int field8116;
    public final /* synthetic */ int field8117;
    public final /* synthetic */ int field8118;
    public final /* synthetic */ int field8119;
    public final /* synthetic */ double[][][] field8120;
    public final /* synthetic */ boolean field8121;
    public final /* synthetic */ Class5815 field8122;
    
    public Class1463(final Class5815 field8122, final int field8123, final int field8124, final int field8125, final int field8126, final double[][][] field8127, final boolean field8128) {
        this.field8122 = field8122;
        this.field8116 = field8123;
        this.field8117 = field8124;
        this.field8118 = field8125;
        this.field8119 = field8126;
        this.field8120 = field8127;
        this.field8121 = field8128;
    }
    
    @Override
    public void run() {
        final double[] array = new double[this.field8116];
        if (this.field8117 != -1) {
            if (Class5815.method17501(this.field8122) <= 2) {
                if (Class5815.method17501(this.field8122) == 2) {
                    for (int i = this.field8118; i < Class5815.method17498(this.field8122); i += this.field8119) {
                        for (int j = 0; j < Class5815.method17503(this.field8122); ++j) {
                            array[j] = this.field8120[j][i][0];
                            array[Class5815.method17503(this.field8122) + j] = this.field8120[j][i][1];
                        }
                        Class5815.method17504(this.field8122).method21392(array, 0, this.field8121);
                        Class5815.method17504(this.field8122).method21392(array, Class5815.method17503(this.field8122), this.field8121);
                        for (int k = 0; k < Class5815.method17503(this.field8122); ++k) {
                            this.field8120[k][i][0] = array[k];
                            this.field8120[k][i][1] = array[Class5815.method17503(this.field8122) + k];
                        }
                    }
                }
            }
            else {
                for (int l = this.field8118; l < Class5815.method17498(this.field8122); l += this.field8119) {
                    for (int n = 0; n < Class5815.method17501(this.field8122); n += 4) {
                        for (int n2 = 0; n2 < Class5815.method17503(this.field8122); ++n2) {
                            final int n3 = Class5815.method17503(this.field8122) + n2;
                            array[n2] = this.field8120[n2][l][n];
                            array[n3] = this.field8120[n2][l][n + 1];
                            array[n3 + Class5815.method17503(this.field8122)] = this.field8120[n2][l][n + 2];
                            array[n3 + 2 * Class5815.method17503(this.field8122)] = this.field8120[n2][l][n + 3];
                        }
                        Class5815.method17504(this.field8122).method21392(array, 0, this.field8121);
                        Class5815.method17504(this.field8122).method21392(array, Class5815.method17503(this.field8122), this.field8121);
                        Class5815.method17504(this.field8122).method21392(array, 2 * Class5815.method17503(this.field8122), this.field8121);
                        Class5815.method17504(this.field8122).method21392(array, 3 * Class5815.method17503(this.field8122), this.field8121);
                        for (int n4 = 0; n4 < Class5815.method17503(this.field8122); ++n4) {
                            final int n5 = Class5815.method17503(this.field8122) + n4;
                            this.field8120[n4][l][n] = array[n4];
                            this.field8120[n4][l][n + 1] = array[n5];
                            this.field8120[n4][l][n + 2] = array[n5 + Class5815.method17503(this.field8122)];
                            this.field8120[n4][l][n + 3] = array[n5 + 2 * Class5815.method17503(this.field8122)];
                        }
                    }
                }
            }
        }
        else if (Class5815.method17501(this.field8122) <= 2) {
            if (Class5815.method17501(this.field8122) == 2) {
                for (int field8118 = this.field8118; field8118 < Class5815.method17498(this.field8122); field8118 += this.field8119) {
                    for (int n6 = 0; n6 < Class5815.method17503(this.field8122); ++n6) {
                        array[n6] = this.field8120[n6][field8118][0];
                        array[Class5815.method17503(this.field8122) + n6] = this.field8120[n6][field8118][1];
                    }
                    Class5815.method17504(this.field8122).method21388(array, 0);
                    Class5815.method17504(this.field8122).method21388(array, Class5815.method17503(this.field8122));
                    for (int n7 = 0; n7 < Class5815.method17503(this.field8122); ++n7) {
                        this.field8120[n7][field8118][0] = array[n7];
                        this.field8120[n7][field8118][1] = array[Class5815.method17503(this.field8122) + n7];
                    }
                }
            }
        }
        else {
            for (int field8119 = this.field8118; field8119 < Class5815.method17498(this.field8122); field8119 += this.field8119) {
                for (int n8 = 0; n8 < Class5815.method17501(this.field8122); n8 += 4) {
                    for (int n9 = 0; n9 < Class5815.method17503(this.field8122); ++n9) {
                        final int n10 = Class5815.method17503(this.field8122) + n9;
                        array[n9] = this.field8120[n9][field8119][n8];
                        array[n10] = this.field8120[n9][field8119][n8 + 1];
                        array[n10 + Class5815.method17503(this.field8122)] = this.field8120[n9][field8119][n8 + 2];
                        array[n10 + 2 * Class5815.method17503(this.field8122)] = this.field8120[n9][field8119][n8 + 3];
                    }
                    Class5815.method17504(this.field8122).method21388(array, 0);
                    Class5815.method17504(this.field8122).method21388(array, Class5815.method17503(this.field8122));
                    Class5815.method17504(this.field8122).method21388(array, 2 * Class5815.method17503(this.field8122));
                    Class5815.method17504(this.field8122).method21388(array, 3 * Class5815.method17503(this.field8122));
                    for (int n11 = 0; n11 < Class5815.method17503(this.field8122); ++n11) {
                        final int n12 = Class5815.method17503(this.field8122) + n11;
                        this.field8120[n11][field8119][n8] = array[n11];
                        this.field8120[n11][field8119][n8 + 1] = array[n12];
                        this.field8120[n11][field8119][n8 + 2] = array[n12 + Class5815.method17503(this.field8122)];
                        this.field8120[n11][field8119][n8 + 3] = array[n12 + 2 * Class5815.method17503(this.field8122)];
                    }
                }
            }
        }
    }
}
