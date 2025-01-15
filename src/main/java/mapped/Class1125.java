// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1125 implements Runnable
{
    private static String[] field6067;
    public final /* synthetic */ int field6068;
    public final /* synthetic */ int field6069;
    public final /* synthetic */ int field6070;
    public final /* synthetic */ int field6071;
    public final /* synthetic */ double[] field6072;
    public final /* synthetic */ boolean field6073;
    public final /* synthetic */ Class7568 field6074;
    
    public Class1125(final Class7568 field6074, final int field6075, final int field6076, final int field6077, final int field6078, final double[] field6079, final boolean field6080) {
        this.field6074 = field6074;
        this.field6068 = field6075;
        this.field6069 = field6076;
        this.field6070 = field6077;
        this.field6071 = field6078;
        this.field6072 = field6079;
        this.field6073 = field6080;
    }
    
    @Override
    public void run() {
        final double[] array = new double[this.field6068];
        if (this.field6069 != -1) {
            for (int i = this.field6070; i < Class7568.method23782(this.field6074); i += this.field6071) {
                final int n = i * Class7568.method23776(this.field6074);
                for (int j = 0; j < Class7568.method23777(this.field6074); ++j) {
                    Class7568.method23779(this.field6074).method30727(this.field6072, n + j * Class7568.method23778(this.field6074), this.field6073);
                }
                if (Class7568.method23780(this.field6074) <= 2) {
                    if (Class7568.method23780(this.field6074) == 2) {
                        for (int k = 0; k < Class7568.method23777(this.field6074); ++k) {
                            final int n2 = n + k * Class7568.method23778(this.field6074);
                            array[k] = this.field6072[n2];
                            array[Class7568.method23777(this.field6074) + k] = this.field6072[n2 + 1];
                        }
                        Class7568.method23781(this.field6074).method30727(array, 0, this.field6073);
                        Class7568.method23781(this.field6074).method30727(array, Class7568.method23777(this.field6074), this.field6073);
                        for (int l = 0; l < Class7568.method23777(this.field6074); ++l) {
                            final int n3 = n + l * Class7568.method23778(this.field6074);
                            this.field6072[n3] = array[l];
                            this.field6072[n3 + 1] = array[Class7568.method23777(this.field6074) + l];
                        }
                    }
                }
                else {
                    for (int n4 = 0; n4 < Class7568.method23780(this.field6074); n4 += 4) {
                        for (int n5 = 0; n5 < Class7568.method23777(this.field6074); ++n5) {
                            final int n6 = n + n5 * Class7568.method23778(this.field6074) + n4;
                            final int n7 = Class7568.method23777(this.field6074) + n5;
                            array[n5] = this.field6072[n6];
                            array[n7] = this.field6072[n6 + 1];
                            array[n7 + Class7568.method23777(this.field6074)] = this.field6072[n6 + 2];
                            array[n7 + 2 * Class7568.method23777(this.field6074)] = this.field6072[n6 + 3];
                        }
                        Class7568.method23781(this.field6074).method30727(array, 0, this.field6073);
                        Class7568.method23781(this.field6074).method30727(array, Class7568.method23777(this.field6074), this.field6073);
                        Class7568.method23781(this.field6074).method30727(array, 2 * Class7568.method23777(this.field6074), this.field6073);
                        Class7568.method23781(this.field6074).method30727(array, 3 * Class7568.method23777(this.field6074), this.field6073);
                        for (int n8 = 0; n8 < Class7568.method23777(this.field6074); ++n8) {
                            final int n9 = n + n8 * Class7568.method23778(this.field6074) + n4;
                            final int n10 = Class7568.method23777(this.field6074) + n8;
                            this.field6072[n9] = array[n8];
                            this.field6072[n9 + 1] = array[n10];
                            this.field6072[n9 + 2] = array[n10 + Class7568.method23777(this.field6074)];
                            this.field6072[n9 + 3] = array[n10 + 2 * Class7568.method23777(this.field6074)];
                        }
                    }
                }
            }
        }
        else {
            for (int field6070 = this.field6070; field6070 < Class7568.method23782(this.field6074); field6070 += this.field6071) {
                final int n11 = field6070 * Class7568.method23776(this.field6074);
                for (int n12 = 0; n12 < Class7568.method23777(this.field6074); ++n12) {
                    Class7568.method23779(this.field6074).method30723(this.field6072, n11 + n12 * Class7568.method23778(this.field6074), this.field6073);
                }
                if (Class7568.method23780(this.field6074) <= 2) {
                    if (Class7568.method23780(this.field6074) == 2) {
                        for (int n13 = 0; n13 < Class7568.method23777(this.field6074); ++n13) {
                            final int n14 = n11 + n13 * Class7568.method23778(this.field6074);
                            array[n13] = this.field6072[n14];
                            array[Class7568.method23777(this.field6074) + n13] = this.field6072[n14 + 1];
                        }
                        Class7568.method23781(this.field6074).method30723(array, 0, this.field6073);
                        Class7568.method23781(this.field6074).method30723(array, Class7568.method23777(this.field6074), this.field6073);
                        for (int n15 = 0; n15 < Class7568.method23777(this.field6074); ++n15) {
                            final int n16 = n11 + n15 * Class7568.method23778(this.field6074);
                            this.field6072[n16] = array[n15];
                            this.field6072[n16 + 1] = array[Class7568.method23777(this.field6074) + n15];
                        }
                    }
                }
                else {
                    for (int n17 = 0; n17 < Class7568.method23780(this.field6074); n17 += 4) {
                        for (int n18 = 0; n18 < Class7568.method23777(this.field6074); ++n18) {
                            final int n19 = n11 + n18 * Class7568.method23778(this.field6074) + n17;
                            final int n20 = Class7568.method23777(this.field6074) + n18;
                            array[n18] = this.field6072[n19];
                            array[n20] = this.field6072[n19 + 1];
                            array[n20 + Class7568.method23777(this.field6074)] = this.field6072[n19 + 2];
                            array[n20 + 2 * Class7568.method23777(this.field6074)] = this.field6072[n19 + 3];
                        }
                        Class7568.method23781(this.field6074).method30723(array, 0, this.field6073);
                        Class7568.method23781(this.field6074).method30723(array, Class7568.method23777(this.field6074), this.field6073);
                        Class7568.method23781(this.field6074).method30723(array, 2 * Class7568.method23777(this.field6074), this.field6073);
                        Class7568.method23781(this.field6074).method30723(array, 3 * Class7568.method23777(this.field6074), this.field6073);
                        for (int n21 = 0; n21 < Class7568.method23777(this.field6074); ++n21) {
                            final int n22 = n11 + n21 * Class7568.method23778(this.field6074) + n17;
                            final int n23 = Class7568.method23777(this.field6074) + n21;
                            this.field6072[n22] = array[n21];
                            this.field6072[n22 + 1] = array[n23];
                            this.field6072[n22 + 2] = array[n23 + Class7568.method23777(this.field6074)];
                            this.field6072[n22 + 3] = array[n23 + 2 * Class7568.method23777(this.field6074)];
                        }
                    }
                }
            }
        }
    }
}
