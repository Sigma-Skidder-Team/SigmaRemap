// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1126 implements Runnable
{
    private static String[] field6075;
    public final /* synthetic */ int field6076;
    public final /* synthetic */ int field6077;
    public final /* synthetic */ int field6078;
    public final /* synthetic */ int field6079;
    public final /* synthetic */ double[] field6080;
    public final /* synthetic */ boolean field6081;
    public final /* synthetic */ Class7568 field6082;
    
    public Class1126(final Class7568 field6082, final int field6083, final int field6084, final int field6085, final int field6086, final double[] field6087, final boolean field6088) {
        this.field6082 = field6082;
        this.field6076 = field6083;
        this.field6077 = field6084;
        this.field6078 = field6085;
        this.field6079 = field6086;
        this.field6080 = field6087;
        this.field6081 = field6088;
    }
    
    @Override
    public void run() {
        final double[] array = new double[this.field6076];
        if (this.field6077 != -1) {
            if (Class7568.method23780(this.field6082) <= 2) {
                if (Class7568.method23780(this.field6082) == 2) {
                    for (int i = this.field6078; i < Class7568.method23777(this.field6082); i += this.field6079) {
                        final int n = i * Class7568.method23778(this.field6082);
                        for (int j = 0; j < Class7568.method23782(this.field6082); ++j) {
                            final int n2 = j * Class7568.method23776(this.field6082) + n;
                            array[j] = this.field6080[n2];
                            array[Class7568.method23782(this.field6082) + j] = this.field6080[n2 + 1];
                        }
                        Class7568.method23783(this.field6082).method30727(array, 0, this.field6081);
                        Class7568.method23783(this.field6082).method30727(array, Class7568.method23782(this.field6082), this.field6081);
                        for (int k = 0; k < Class7568.method23782(this.field6082); ++k) {
                            final int n3 = k * Class7568.method23776(this.field6082) + n;
                            this.field6080[n3] = array[k];
                            this.field6080[n3 + 1] = array[Class7568.method23782(this.field6082) + k];
                        }
                    }
                }
            }
            else {
                for (int l = this.field6078; l < Class7568.method23777(this.field6082); l += this.field6079) {
                    final int n4 = l * Class7568.method23778(this.field6082);
                    for (int n5 = 0; n5 < Class7568.method23780(this.field6082); n5 += 4) {
                        for (int n6 = 0; n6 < Class7568.method23782(this.field6082); ++n6) {
                            final int n7 = n6 * Class7568.method23776(this.field6082) + n4 + n5;
                            final int n8 = Class7568.method23782(this.field6082) + n6;
                            array[n6] = this.field6080[n7];
                            array[n8] = this.field6080[n7 + 1];
                            array[n8 + Class7568.method23782(this.field6082)] = this.field6080[n7 + 2];
                            array[n8 + 2 * Class7568.method23782(this.field6082)] = this.field6080[n7 + 3];
                        }
                        Class7568.method23783(this.field6082).method30727(array, 0, this.field6081);
                        Class7568.method23783(this.field6082).method30727(array, Class7568.method23782(this.field6082), this.field6081);
                        Class7568.method23783(this.field6082).method30727(array, 2 * Class7568.method23782(this.field6082), this.field6081);
                        Class7568.method23783(this.field6082).method30727(array, 3 * Class7568.method23782(this.field6082), this.field6081);
                        for (int n9 = 0; n9 < Class7568.method23782(this.field6082); ++n9) {
                            final int n10 = n9 * Class7568.method23776(this.field6082) + n4 + n5;
                            final int n11 = Class7568.method23782(this.field6082) + n9;
                            this.field6080[n10] = array[n9];
                            this.field6080[n10 + 1] = array[n11];
                            this.field6080[n10 + 2] = array[n11 + Class7568.method23782(this.field6082)];
                            this.field6080[n10 + 3] = array[n11 + 2 * Class7568.method23782(this.field6082)];
                        }
                    }
                }
            }
        }
        else if (Class7568.method23780(this.field6082) <= 2) {
            if (Class7568.method23780(this.field6082) == 2) {
                for (int field6078 = this.field6078; field6078 < Class7568.method23777(this.field6082); field6078 += this.field6079) {
                    final int n12 = field6078 * Class7568.method23778(this.field6082);
                    for (int n13 = 0; n13 < Class7568.method23782(this.field6082); ++n13) {
                        final int n14 = n13 * Class7568.method23776(this.field6082) + n12;
                        array[n13] = this.field6080[n14];
                        array[Class7568.method23782(this.field6082) + n13] = this.field6080[n14 + 1];
                    }
                    Class7568.method23783(this.field6082).method30723(array, 0, this.field6081);
                    Class7568.method23783(this.field6082).method30723(array, Class7568.method23782(this.field6082), this.field6081);
                    for (int n15 = 0; n15 < Class7568.method23782(this.field6082); ++n15) {
                        final int n16 = n15 * Class7568.method23776(this.field6082) + n12;
                        this.field6080[n16] = array[n15];
                        this.field6080[n16 + 1] = array[Class7568.method23782(this.field6082) + n15];
                    }
                }
            }
        }
        else {
            for (int field6079 = this.field6078; field6079 < Class7568.method23777(this.field6082); field6079 += this.field6079) {
                final int n17 = field6079 * Class7568.method23778(this.field6082);
                for (int n18 = 0; n18 < Class7568.method23780(this.field6082); n18 += 4) {
                    for (int n19 = 0; n19 < Class7568.method23782(this.field6082); ++n19) {
                        final int n20 = n19 * Class7568.method23776(this.field6082) + n17 + n18;
                        final int n21 = Class7568.method23782(this.field6082) + n19;
                        array[n19] = this.field6080[n20];
                        array[n21] = this.field6080[n20 + 1];
                        array[n21 + Class7568.method23782(this.field6082)] = this.field6080[n20 + 2];
                        array[n21 + 2 * Class7568.method23782(this.field6082)] = this.field6080[n20 + 3];
                    }
                    Class7568.method23783(this.field6082).method30723(array, 0, this.field6081);
                    Class7568.method23783(this.field6082).method30723(array, Class7568.method23782(this.field6082), this.field6081);
                    Class7568.method23783(this.field6082).method30723(array, 2 * Class7568.method23782(this.field6082), this.field6081);
                    Class7568.method23783(this.field6082).method30723(array, 3 * Class7568.method23782(this.field6082), this.field6081);
                    for (int n22 = 0; n22 < Class7568.method23782(this.field6082); ++n22) {
                        final int n23 = n22 * Class7568.method23776(this.field6082) + n17 + n18;
                        final int n24 = Class7568.method23782(this.field6082) + n22;
                        this.field6080[n23] = array[n22];
                        this.field6080[n23 + 1] = array[n24];
                        this.field6080[n23 + 2] = array[n24 + Class7568.method23782(this.field6082)];
                        this.field6080[n23 + 3] = array[n24 + 2 * Class7568.method23782(this.field6082)];
                    }
                }
            }
        }
    }
}
