// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1073 implements Runnable
{
    private static String[] field5770;
    public final /* synthetic */ int field5771;
    public final /* synthetic */ int field5772;
    public final /* synthetic */ int field5773;
    public final /* synthetic */ int field5774;
    public final /* synthetic */ double[][][] field5775;
    public final /* synthetic */ boolean field5776;
    public final /* synthetic */ Class7796 field5777;
    
    public Class1073(final Class7796 field5777, final int field5778, final int field5779, final int field5780, final int field5781, final double[][][] field5782, final boolean field5783) {
        this.field5777 = field5777;
        this.field5771 = field5778;
        this.field5772 = field5779;
        this.field5773 = field5780;
        this.field5774 = field5781;
        this.field5775 = field5782;
        this.field5776 = field5783;
    }
    
    @Override
    public void run() {
        final double[] array = new double[this.field5771];
        if (this.field5772 != -1) {
            if (Class7796.method25147(this.field5777) <= 2) {
                if (Class7796.method25147(this.field5777) == 2) {
                    for (int i = this.field5773; i < Class7796.method25144(this.field5777); i += this.field5774) {
                        for (int j = 0; j < Class7796.method25149(this.field5777); ++j) {
                            array[j] = this.field5775[j][i][0];
                            array[Class7796.method25149(this.field5777) + j] = this.field5775[j][i][1];
                        }
                        Class7796.method25150(this.field5777).method18042(array, 0, this.field5776);
                        Class7796.method25150(this.field5777).method18042(array, Class7796.method25149(this.field5777), this.field5776);
                        for (int k = 0; k < Class7796.method25149(this.field5777); ++k) {
                            this.field5775[k][i][0] = array[k];
                            this.field5775[k][i][1] = array[Class7796.method25149(this.field5777) + k];
                        }
                    }
                }
            }
            else {
                for (int l = this.field5773; l < Class7796.method25144(this.field5777); l += this.field5774) {
                    for (int n = 0; n < Class7796.method25147(this.field5777); n += 4) {
                        for (int n2 = 0; n2 < Class7796.method25149(this.field5777); ++n2) {
                            final int n3 = Class7796.method25149(this.field5777) + n2;
                            array[n2] = this.field5775[n2][l][n];
                            array[n3] = this.field5775[n2][l][n + 1];
                            array[n3 + Class7796.method25149(this.field5777)] = this.field5775[n2][l][n + 2];
                            array[n3 + 2 * Class7796.method25149(this.field5777)] = this.field5775[n2][l][n + 3];
                        }
                        Class7796.method25150(this.field5777).method18042(array, 0, this.field5776);
                        Class7796.method25150(this.field5777).method18042(array, Class7796.method25149(this.field5777), this.field5776);
                        Class7796.method25150(this.field5777).method18042(array, 2 * Class7796.method25149(this.field5777), this.field5776);
                        Class7796.method25150(this.field5777).method18042(array, 3 * Class7796.method25149(this.field5777), this.field5776);
                        for (int n4 = 0; n4 < Class7796.method25149(this.field5777); ++n4) {
                            final int n5 = Class7796.method25149(this.field5777) + n4;
                            this.field5775[n4][l][n] = array[n4];
                            this.field5775[n4][l][n + 1] = array[n5];
                            this.field5775[n4][l][n + 2] = array[n5 + Class7796.method25149(this.field5777)];
                            this.field5775[n4][l][n + 3] = array[n5 + 2 * Class7796.method25149(this.field5777)];
                        }
                    }
                }
            }
        }
        else if (Class7796.method25147(this.field5777) <= 2) {
            if (Class7796.method25147(this.field5777) == 2) {
                for (int field5773 = this.field5773; field5773 < Class7796.method25144(this.field5777); field5773 += this.field5774) {
                    for (int n6 = 0; n6 < Class7796.method25149(this.field5777); ++n6) {
                        array[n6] = this.field5775[n6][field5773][0];
                        array[Class7796.method25149(this.field5777) + n6] = this.field5775[n6][field5773][1];
                    }
                    Class7796.method25150(this.field5777).method18038(array, 0, this.field5776);
                    Class7796.method25150(this.field5777).method18038(array, Class7796.method25149(this.field5777), this.field5776);
                    for (int n7 = 0; n7 < Class7796.method25149(this.field5777); ++n7) {
                        this.field5775[n7][field5773][0] = array[n7];
                        this.field5775[n7][field5773][1] = array[Class7796.method25149(this.field5777) + n7];
                    }
                }
            }
        }
        else {
            for (int field5774 = this.field5773; field5774 < Class7796.method25144(this.field5777); field5774 += this.field5774) {
                for (int n8 = 0; n8 < Class7796.method25147(this.field5777); n8 += 4) {
                    for (int n9 = 0; n9 < Class7796.method25149(this.field5777); ++n9) {
                        final int n10 = Class7796.method25149(this.field5777) + n9;
                        array[n9] = this.field5775[n9][field5774][n8];
                        array[n10] = this.field5775[n9][field5774][n8 + 1];
                        array[n10 + Class7796.method25149(this.field5777)] = this.field5775[n9][field5774][n8 + 2];
                        array[n10 + 2 * Class7796.method25149(this.field5777)] = this.field5775[n9][field5774][n8 + 3];
                    }
                    Class7796.method25150(this.field5777).method18038(array, 0, this.field5776);
                    Class7796.method25150(this.field5777).method18038(array, Class7796.method25149(this.field5777), this.field5776);
                    Class7796.method25150(this.field5777).method18038(array, 2 * Class7796.method25149(this.field5777), this.field5776);
                    Class7796.method25150(this.field5777).method18038(array, 3 * Class7796.method25149(this.field5777), this.field5776);
                    for (int n11 = 0; n11 < Class7796.method25149(this.field5777); ++n11) {
                        final int n12 = Class7796.method25149(this.field5777) + n11;
                        this.field5775[n11][field5774][n8] = array[n11];
                        this.field5775[n11][field5774][n8 + 1] = array[n12];
                        this.field5775[n11][field5774][n8 + 2] = array[n12 + Class7796.method25149(this.field5777)];
                        this.field5775[n11][field5774][n8 + 3] = array[n12 + 2 * Class7796.method25149(this.field5777)];
                    }
                }
            }
        }
    }
}
