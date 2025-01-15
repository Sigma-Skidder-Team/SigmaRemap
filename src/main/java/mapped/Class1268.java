// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1268 implements Runnable
{
    private static String[] field6918;
    public final /* synthetic */ int field6919;
    public final /* synthetic */ int field6920;
    public final /* synthetic */ int field6921;
    public final /* synthetic */ int field6922;
    public final /* synthetic */ double[][][] field6923;
    public final /* synthetic */ boolean field6924;
    public final /* synthetic */ Class7568 field6925;
    
    public Class1268(final Class7568 field6925, final int field6926, final int field6927, final int field6928, final int field6929, final double[][][] field6930, final boolean field6931) {
        this.field6925 = field6925;
        this.field6919 = field6926;
        this.field6920 = field6927;
        this.field6921 = field6928;
        this.field6922 = field6929;
        this.field6923 = field6930;
        this.field6924 = field6931;
    }
    
    @Override
    public void run() {
        final double[] array = new double[this.field6919];
        if (this.field6920 != -1) {
            if (Class7568.method23780(this.field6925) <= 2) {
                if (Class7568.method23780(this.field6925) == 2) {
                    for (int i = this.field6921; i < Class7568.method23777(this.field6925); i += this.field6922) {
                        for (int j = 0; j < Class7568.method23782(this.field6925); ++j) {
                            array[j] = this.field6923[j][i][0];
                            array[Class7568.method23782(this.field6925) + j] = this.field6923[j][i][1];
                        }
                        Class7568.method23783(this.field6925).method30727(array, 0, this.field6924);
                        Class7568.method23783(this.field6925).method30727(array, Class7568.method23782(this.field6925), this.field6924);
                        for (int k = 0; k < Class7568.method23782(this.field6925); ++k) {
                            this.field6923[k][i][0] = array[k];
                            this.field6923[k][i][1] = array[Class7568.method23782(this.field6925) + k];
                        }
                    }
                }
            }
            else {
                for (int l = this.field6921; l < Class7568.method23777(this.field6925); l += this.field6922) {
                    for (int n = 0; n < Class7568.method23780(this.field6925); n += 4) {
                        for (int n2 = 0; n2 < Class7568.method23782(this.field6925); ++n2) {
                            final int n3 = Class7568.method23782(this.field6925) + n2;
                            array[n2] = this.field6923[n2][l][n];
                            array[n3] = this.field6923[n2][l][n + 1];
                            array[n3 + Class7568.method23782(this.field6925)] = this.field6923[n2][l][n + 2];
                            array[n3 + 2 * Class7568.method23782(this.field6925)] = this.field6923[n2][l][n + 3];
                        }
                        Class7568.method23783(this.field6925).method30727(array, 0, this.field6924);
                        Class7568.method23783(this.field6925).method30727(array, Class7568.method23782(this.field6925), this.field6924);
                        Class7568.method23783(this.field6925).method30727(array, 2 * Class7568.method23782(this.field6925), this.field6924);
                        Class7568.method23783(this.field6925).method30727(array, 3 * Class7568.method23782(this.field6925), this.field6924);
                        for (int n4 = 0; n4 < Class7568.method23782(this.field6925); ++n4) {
                            final int n5 = Class7568.method23782(this.field6925) + n4;
                            this.field6923[n4][l][n] = array[n4];
                            this.field6923[n4][l][n + 1] = array[n5];
                            this.field6923[n4][l][n + 2] = array[n5 + Class7568.method23782(this.field6925)];
                            this.field6923[n4][l][n + 3] = array[n5 + 2 * Class7568.method23782(this.field6925)];
                        }
                    }
                }
            }
        }
        else if (Class7568.method23780(this.field6925) <= 2) {
            if (Class7568.method23780(this.field6925) == 2) {
                for (int field6921 = this.field6921; field6921 < Class7568.method23777(this.field6925); field6921 += this.field6922) {
                    for (int n6 = 0; n6 < Class7568.method23782(this.field6925); ++n6) {
                        array[n6] = this.field6923[n6][field6921][0];
                        array[Class7568.method23782(this.field6925) + n6] = this.field6923[n6][field6921][1];
                    }
                    Class7568.method23783(this.field6925).method30723(array, 0, this.field6924);
                    Class7568.method23783(this.field6925).method30723(array, Class7568.method23782(this.field6925), this.field6924);
                    for (int n7 = 0; n7 < Class7568.method23782(this.field6925); ++n7) {
                        this.field6923[n7][field6921][0] = array[n7];
                        this.field6923[n7][field6921][1] = array[Class7568.method23782(this.field6925) + n7];
                    }
                }
            }
        }
        else {
            for (int field6922 = this.field6921; field6922 < Class7568.method23777(this.field6925); field6922 += this.field6922) {
                for (int n8 = 0; n8 < Class7568.method23780(this.field6925); n8 += 4) {
                    for (int n9 = 0; n9 < Class7568.method23782(this.field6925); ++n9) {
                        final int n10 = Class7568.method23782(this.field6925) + n9;
                        array[n9] = this.field6923[n9][field6922][n8];
                        array[n10] = this.field6923[n9][field6922][n8 + 1];
                        array[n10 + Class7568.method23782(this.field6925)] = this.field6923[n9][field6922][n8 + 2];
                        array[n10 + 2 * Class7568.method23782(this.field6925)] = this.field6923[n9][field6922][n8 + 3];
                    }
                    Class7568.method23783(this.field6925).method30723(array, 0, this.field6924);
                    Class7568.method23783(this.field6925).method30723(array, Class7568.method23782(this.field6925), this.field6924);
                    Class7568.method23783(this.field6925).method30723(array, 2 * Class7568.method23782(this.field6925), this.field6924);
                    Class7568.method23783(this.field6925).method30723(array, 3 * Class7568.method23782(this.field6925), this.field6924);
                    for (int n11 = 0; n11 < Class7568.method23782(this.field6925); ++n11) {
                        final int n12 = Class7568.method23782(this.field6925) + n11;
                        this.field6923[n11][field6922][n8] = array[n11];
                        this.field6923[n11][field6922][n8 + 1] = array[n12];
                        this.field6923[n11][field6922][n8 + 2] = array[n12 + Class7568.method23782(this.field6925)];
                        this.field6923[n11][field6922][n8 + 3] = array[n12 + 2 * Class7568.method23782(this.field6925)];
                    }
                }
            }
        }
    }
}
