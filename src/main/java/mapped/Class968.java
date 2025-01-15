// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class968 implements Runnable
{
    private static String[] field5147;
    public final /* synthetic */ int field5148;
    public final /* synthetic */ int field5149;
    public final /* synthetic */ int field5150;
    public final /* synthetic */ int field5151;
    public final /* synthetic */ double[][][] field5152;
    public final /* synthetic */ boolean field5153;
    public final /* synthetic */ Class7568 field5154;
    
    public Class968(final Class7568 field5154, final int field5155, final int field5156, final int field5157, final int field5158, final double[][][] field5159, final boolean field5160) {
        this.field5154 = field5154;
        this.field5148 = field5155;
        this.field5149 = field5156;
        this.field5150 = field5157;
        this.field5151 = field5158;
        this.field5152 = field5159;
        this.field5153 = field5160;
    }
    
    @Override
    public void run() {
        final double[] array = new double[this.field5148];
        if (this.field5149 != -1) {
            for (int i = this.field5150; i < Class7568.method23782(this.field5154); i += this.field5151) {
                for (int j = 0; j < Class7568.method23777(this.field5154); ++j) {
                    Class7568.method23779(this.field5154).method30725(this.field5152[i][j], this.field5153);
                }
                if (Class7568.method23780(this.field5154) <= 2) {
                    if (Class7568.method23780(this.field5154) == 2) {
                        for (int k = 0; k < Class7568.method23777(this.field5154); ++k) {
                            array[k] = this.field5152[i][k][0];
                            array[Class7568.method23777(this.field5154) + k] = this.field5152[i][k][1];
                        }
                        Class7568.method23781(this.field5154).method30727(array, 0, this.field5153);
                        Class7568.method23781(this.field5154).method30727(array, Class7568.method23777(this.field5154), this.field5153);
                        for (int l = 0; l < Class7568.method23777(this.field5154); ++l) {
                            this.field5152[i][l][0] = array[l];
                            this.field5152[i][l][1] = array[Class7568.method23777(this.field5154) + l];
                        }
                    }
                }
                else {
                    for (int n = 0; n < Class7568.method23780(this.field5154); n += 4) {
                        for (int n2 = 0; n2 < Class7568.method23777(this.field5154); ++n2) {
                            final int n3 = Class7568.method23777(this.field5154) + n2;
                            array[n2] = this.field5152[i][n2][n];
                            array[n3] = this.field5152[i][n2][n + 1];
                            array[n3 + Class7568.method23777(this.field5154)] = this.field5152[i][n2][n + 2];
                            array[n3 + 2 * Class7568.method23777(this.field5154)] = this.field5152[i][n2][n + 3];
                        }
                        Class7568.method23781(this.field5154).method30727(array, 0, this.field5153);
                        Class7568.method23781(this.field5154).method30727(array, Class7568.method23777(this.field5154), this.field5153);
                        Class7568.method23781(this.field5154).method30727(array, 2 * Class7568.method23777(this.field5154), this.field5153);
                        Class7568.method23781(this.field5154).method30727(array, 3 * Class7568.method23777(this.field5154), this.field5153);
                        for (int n4 = 0; n4 < Class7568.method23777(this.field5154); ++n4) {
                            final int n5 = Class7568.method23777(this.field5154) + n4;
                            this.field5152[i][n4][n] = array[n4];
                            this.field5152[i][n4][n + 1] = array[n5];
                            this.field5152[i][n4][n + 2] = array[n5 + Class7568.method23777(this.field5154)];
                            this.field5152[i][n4][n + 3] = array[n5 + 2 * Class7568.method23777(this.field5154)];
                        }
                    }
                }
            }
        }
        else {
            for (int field5150 = this.field5150; field5150 < Class7568.method23782(this.field5154); field5150 += this.field5151) {
                for (int n6 = 0; n6 < Class7568.method23777(this.field5154); ++n6) {
                    Class7568.method23779(this.field5154).method30721(this.field5152[field5150][n6], this.field5153);
                }
                if (Class7568.method23780(this.field5154) <= 2) {
                    if (Class7568.method23780(this.field5154) == 2) {
                        for (int n7 = 0; n7 < Class7568.method23777(this.field5154); ++n7) {
                            array[n7] = this.field5152[field5150][n7][0];
                            array[Class7568.method23777(this.field5154) + n7] = this.field5152[field5150][n7][1];
                        }
                        Class7568.method23781(this.field5154).method30723(array, 0, this.field5153);
                        Class7568.method23781(this.field5154).method30723(array, Class7568.method23777(this.field5154), this.field5153);
                        for (int n8 = 0; n8 < Class7568.method23777(this.field5154); ++n8) {
                            this.field5152[field5150][n8][0] = array[n8];
                            this.field5152[field5150][n8][1] = array[Class7568.method23777(this.field5154) + n8];
                        }
                    }
                }
                else {
                    for (int n9 = 0; n9 < Class7568.method23780(this.field5154); n9 += 4) {
                        for (int n10 = 0; n10 < Class7568.method23777(this.field5154); ++n10) {
                            final int n11 = Class7568.method23777(this.field5154) + n10;
                            array[n10] = this.field5152[field5150][n10][n9];
                            array[n11] = this.field5152[field5150][n10][n9 + 1];
                            array[n11 + Class7568.method23777(this.field5154)] = this.field5152[field5150][n10][n9 + 2];
                            array[n11 + 2 * Class7568.method23777(this.field5154)] = this.field5152[field5150][n10][n9 + 3];
                        }
                        Class7568.method23781(this.field5154).method30723(array, 0, this.field5153);
                        Class7568.method23781(this.field5154).method30723(array, Class7568.method23777(this.field5154), this.field5153);
                        Class7568.method23781(this.field5154).method30723(array, 2 * Class7568.method23777(this.field5154), this.field5153);
                        Class7568.method23781(this.field5154).method30723(array, 3 * Class7568.method23777(this.field5154), this.field5153);
                        for (int n12 = 0; n12 < Class7568.method23777(this.field5154); ++n12) {
                            final int n13 = Class7568.method23777(this.field5154) + n12;
                            this.field5152[field5150][n12][n9] = array[n12];
                            this.field5152[field5150][n12][n9 + 1] = array[n13];
                            this.field5152[field5150][n12][n9 + 2] = array[n13 + Class7568.method23777(this.field5154)];
                            this.field5152[field5150][n12][n9 + 3] = array[n13 + 2 * Class7568.method23777(this.field5154)];
                        }
                    }
                }
            }
        }
    }
}
