// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1042 implements Runnable
{
    private static String[] field5582;
    public final /* synthetic */ int field5583;
    public final /* synthetic */ int field5584;
    public final /* synthetic */ int field5585;
    public final /* synthetic */ int field5586;
    public final /* synthetic */ float[][][] field5587;
    public final /* synthetic */ boolean field5588;
    public final /* synthetic */ Class6498 field5589;
    
    public Class1042(final Class6498 field5589, final int field5590, final int field5591, final int field5592, final int field5593, final float[][][] field5594, final boolean field5595) {
        this.field5589 = field5589;
        this.field5583 = field5590;
        this.field5584 = field5591;
        this.field5585 = field5592;
        this.field5586 = field5593;
        this.field5587 = field5594;
        this.field5588 = field5595;
    }
    
    @Override
    public void run() {
        final float[] array = new float[this.field5583];
        if (this.field5584 != -1) {
            if (Class6498.method19568(this.field5589) <= 2) {
                if (Class6498.method19568(this.field5589) == 2) {
                    for (int i = this.field5585; i < Class6498.method19565(this.field5589); i += this.field5586) {
                        for (int j = 0; j < Class6498.method19570(this.field5589); ++j) {
                            array[j] = this.field5587[j][i][0];
                            array[Class6498.method19570(this.field5589) + j] = this.field5587[j][i][1];
                        }
                        Class6498.method19571(this.field5589).method34187(array, 0, this.field5588);
                        Class6498.method19571(this.field5589).method34187(array, Class6498.method19570(this.field5589), this.field5588);
                        for (int k = 0; k < Class6498.method19570(this.field5589); ++k) {
                            this.field5587[k][i][0] = array[k];
                            this.field5587[k][i][1] = array[Class6498.method19570(this.field5589) + k];
                        }
                    }
                }
            }
            else {
                for (int l = this.field5585; l < Class6498.method19565(this.field5589); l += this.field5586) {
                    for (int n = 0; n < Class6498.method19568(this.field5589); n += 4) {
                        for (int n2 = 0; n2 < Class6498.method19570(this.field5589); ++n2) {
                            final int n3 = Class6498.method19570(this.field5589) + n2;
                            array[n2] = this.field5587[n2][l][n];
                            array[n3] = this.field5587[n2][l][n + 1];
                            array[n3 + Class6498.method19570(this.field5589)] = this.field5587[n2][l][n + 2];
                            array[n3 + 2 * Class6498.method19570(this.field5589)] = this.field5587[n2][l][n + 3];
                        }
                        Class6498.method19571(this.field5589).method34187(array, 0, this.field5588);
                        Class6498.method19571(this.field5589).method34187(array, Class6498.method19570(this.field5589), this.field5588);
                        Class6498.method19571(this.field5589).method34187(array, 2 * Class6498.method19570(this.field5589), this.field5588);
                        Class6498.method19571(this.field5589).method34187(array, 3 * Class6498.method19570(this.field5589), this.field5588);
                        for (int n4 = 0; n4 < Class6498.method19570(this.field5589); ++n4) {
                            final int n5 = Class6498.method19570(this.field5589) + n4;
                            this.field5587[n4][l][n] = array[n4];
                            this.field5587[n4][l][n + 1] = array[n5];
                            this.field5587[n4][l][n + 2] = array[n5 + Class6498.method19570(this.field5589)];
                            this.field5587[n4][l][n + 3] = array[n5 + 2 * Class6498.method19570(this.field5589)];
                        }
                    }
                }
            }
        }
        else if (Class6498.method19568(this.field5589) <= 2) {
            if (Class6498.method19568(this.field5589) == 2) {
                for (int field5585 = this.field5585; field5585 < Class6498.method19565(this.field5589); field5585 += this.field5586) {
                    for (int n6 = 0; n6 < Class6498.method19570(this.field5589); ++n6) {
                        array[n6] = this.field5587[n6][field5585][0];
                        array[Class6498.method19570(this.field5589) + n6] = this.field5587[n6][field5585][1];
                    }
                    Class6498.method19571(this.field5589).method34183(array, 0, this.field5588);
                    Class6498.method19571(this.field5589).method34183(array, Class6498.method19570(this.field5589), this.field5588);
                    for (int n7 = 0; n7 < Class6498.method19570(this.field5589); ++n7) {
                        this.field5587[n7][field5585][0] = array[n7];
                        this.field5587[n7][field5585][1] = array[Class6498.method19570(this.field5589) + n7];
                    }
                }
            }
        }
        else {
            for (int field5586 = this.field5585; field5586 < Class6498.method19565(this.field5589); field5586 += this.field5586) {
                for (int n8 = 0; n8 < Class6498.method19568(this.field5589); n8 += 4) {
                    for (int n9 = 0; n9 < Class6498.method19570(this.field5589); ++n9) {
                        final int n10 = Class6498.method19570(this.field5589) + n9;
                        array[n9] = this.field5587[n9][field5586][n8];
                        array[n10] = this.field5587[n9][field5586][n8 + 1];
                        array[n10 + Class6498.method19570(this.field5589)] = this.field5587[n9][field5586][n8 + 2];
                        array[n10 + 2 * Class6498.method19570(this.field5589)] = this.field5587[n9][field5586][n8 + 3];
                    }
                    Class6498.method19571(this.field5589).method34183(array, 0, this.field5588);
                    Class6498.method19571(this.field5589).method34183(array, Class6498.method19570(this.field5589), this.field5588);
                    Class6498.method19571(this.field5589).method34183(array, 2 * Class6498.method19570(this.field5589), this.field5588);
                    Class6498.method19571(this.field5589).method34183(array, 3 * Class6498.method19570(this.field5589), this.field5588);
                    for (int n11 = 0; n11 < Class6498.method19570(this.field5589); ++n11) {
                        final int n12 = Class6498.method19570(this.field5589) + n11;
                        this.field5587[n11][field5586][n8] = array[n11];
                        this.field5587[n11][field5586][n8 + 1] = array[n12];
                        this.field5587[n11][field5586][n8 + 2] = array[n12 + Class6498.method19570(this.field5589)];
                        this.field5587[n11][field5586][n8 + 3] = array[n12 + 2 * Class6498.method19570(this.field5589)];
                    }
                }
            }
        }
    }
}
