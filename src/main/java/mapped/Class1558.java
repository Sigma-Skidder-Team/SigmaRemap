// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1558 implements Runnable
{
    private static String[] field8715;
    public final /* synthetic */ int field8716;
    public final /* synthetic */ int field8717;
    public final /* synthetic */ int field8718;
    public final /* synthetic */ int field8719;
    public final /* synthetic */ float[] field8720;
    public final /* synthetic */ boolean field8721;
    public final /* synthetic */ Class6498 field8722;
    
    public Class1558(final Class6498 field8722, final int field8723, final int field8724, final int field8725, final int field8726, final float[] field8727, final boolean field8728) {
        this.field8722 = field8722;
        this.field8716 = field8723;
        this.field8717 = field8724;
        this.field8718 = field8725;
        this.field8719 = field8726;
        this.field8720 = field8727;
        this.field8721 = field8728;
    }
    
    @Override
    public void run() {
        final float[] array = new float[this.field8716];
        if (this.field8717 != -1) {
            if (Class6498.method19568(this.field8722) <= 2) {
                if (Class6498.method19568(this.field8722) == 2) {
                    for (int i = this.field8718; i < Class6498.method19565(this.field8722); i += this.field8719) {
                        final int n = i * Class6498.method19566(this.field8722);
                        for (int j = 0; j < Class6498.method19570(this.field8722); ++j) {
                            final int n2 = j * Class6498.method19564(this.field8722) + n;
                            array[j] = this.field8720[n2];
                            array[Class6498.method19570(this.field8722) + j] = this.field8720[n2 + 1];
                        }
                        Class6498.method19571(this.field8722).method34187(array, 0, this.field8721);
                        Class6498.method19571(this.field8722).method34187(array, Class6498.method19570(this.field8722), this.field8721);
                        for (int k = 0; k < Class6498.method19570(this.field8722); ++k) {
                            final int n3 = k * Class6498.method19564(this.field8722) + n;
                            this.field8720[n3] = array[k];
                            this.field8720[n3 + 1] = array[Class6498.method19570(this.field8722) + k];
                        }
                    }
                }
            }
            else {
                for (int l = this.field8718; l < Class6498.method19565(this.field8722); l += this.field8719) {
                    final int n4 = l * Class6498.method19566(this.field8722);
                    for (int n5 = 0; n5 < Class6498.method19568(this.field8722); n5 += 4) {
                        for (int n6 = 0; n6 < Class6498.method19570(this.field8722); ++n6) {
                            final int n7 = n6 * Class6498.method19564(this.field8722) + n4 + n5;
                            final int n8 = Class6498.method19570(this.field8722) + n6;
                            array[n6] = this.field8720[n7];
                            array[n8] = this.field8720[n7 + 1];
                            array[n8 + Class6498.method19570(this.field8722)] = this.field8720[n7 + 2];
                            array[n8 + 2 * Class6498.method19570(this.field8722)] = this.field8720[n7 + 3];
                        }
                        Class6498.method19571(this.field8722).method34187(array, 0, this.field8721);
                        Class6498.method19571(this.field8722).method34187(array, Class6498.method19570(this.field8722), this.field8721);
                        Class6498.method19571(this.field8722).method34187(array, 2 * Class6498.method19570(this.field8722), this.field8721);
                        Class6498.method19571(this.field8722).method34187(array, 3 * Class6498.method19570(this.field8722), this.field8721);
                        for (int n9 = 0; n9 < Class6498.method19570(this.field8722); ++n9) {
                            final int n10 = n9 * Class6498.method19564(this.field8722) + n4 + n5;
                            final int n11 = Class6498.method19570(this.field8722) + n9;
                            this.field8720[n10] = array[n9];
                            this.field8720[n10 + 1] = array[n11];
                            this.field8720[n10 + 2] = array[n11 + Class6498.method19570(this.field8722)];
                            this.field8720[n10 + 3] = array[n11 + 2 * Class6498.method19570(this.field8722)];
                        }
                    }
                }
            }
        }
        else if (Class6498.method19568(this.field8722) <= 2) {
            if (Class6498.method19568(this.field8722) == 2) {
                for (int field8718 = this.field8718; field8718 < Class6498.method19565(this.field8722); field8718 += this.field8719) {
                    final int n12 = field8718 * Class6498.method19566(this.field8722);
                    for (int n13 = 0; n13 < Class6498.method19570(this.field8722); ++n13) {
                        final int n14 = n13 * Class6498.method19564(this.field8722) + n12;
                        array[n13] = this.field8720[n14];
                        array[Class6498.method19570(this.field8722) + n13] = this.field8720[n14 + 1];
                    }
                    Class6498.method19571(this.field8722).method34183(array, 0, this.field8721);
                    Class6498.method19571(this.field8722).method34183(array, Class6498.method19570(this.field8722), this.field8721);
                    for (int n15 = 0; n15 < Class6498.method19570(this.field8722); ++n15) {
                        final int n16 = n15 * Class6498.method19564(this.field8722) + n12;
                        this.field8720[n16] = array[n15];
                        this.field8720[n16 + 1] = array[Class6498.method19570(this.field8722) + n15];
                    }
                }
            }
        }
        else {
            for (int field8719 = this.field8718; field8719 < Class6498.method19565(this.field8722); field8719 += this.field8719) {
                final int n17 = field8719 * Class6498.method19566(this.field8722);
                for (int n18 = 0; n18 < Class6498.method19568(this.field8722); n18 += 4) {
                    for (int n19 = 0; n19 < Class6498.method19570(this.field8722); ++n19) {
                        final int n20 = n19 * Class6498.method19564(this.field8722) + n17 + n18;
                        final int n21 = Class6498.method19570(this.field8722) + n19;
                        array[n19] = this.field8720[n20];
                        array[n21] = this.field8720[n20 + 1];
                        array[n21 + Class6498.method19570(this.field8722)] = this.field8720[n20 + 2];
                        array[n21 + 2 * Class6498.method19570(this.field8722)] = this.field8720[n20 + 3];
                    }
                    Class6498.method19571(this.field8722).method34183(array, 0, this.field8721);
                    Class6498.method19571(this.field8722).method34183(array, Class6498.method19570(this.field8722), this.field8721);
                    Class6498.method19571(this.field8722).method34183(array, 2 * Class6498.method19570(this.field8722), this.field8721);
                    Class6498.method19571(this.field8722).method34183(array, 3 * Class6498.method19570(this.field8722), this.field8721);
                    for (int n22 = 0; n22 < Class6498.method19570(this.field8722); ++n22) {
                        final int n23 = n22 * Class6498.method19564(this.field8722) + n17 + n18;
                        final int n24 = Class6498.method19570(this.field8722) + n22;
                        this.field8720[n23] = array[n22];
                        this.field8720[n23 + 1] = array[n24];
                        this.field8720[n23 + 2] = array[n24 + Class6498.method19570(this.field8722)];
                        this.field8720[n23 + 3] = array[n24 + 2 * Class6498.method19570(this.field8722)];
                    }
                }
            }
        }
    }
}
