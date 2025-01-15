// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1400 implements Runnable
{
    private static String[] field7727;
    public final /* synthetic */ int field7728;
    public final /* synthetic */ int field7729;
    public final /* synthetic */ int field7730;
    public final /* synthetic */ int field7731;
    public final /* synthetic */ double[] field7732;
    public final /* synthetic */ boolean field7733;
    public final /* synthetic */ Class7796 field7734;
    
    public Class1400(final Class7796 field7734, final int field7735, final int field7736, final int field7737, final int field7738, final double[] field7739, final boolean field7740) {
        this.field7734 = field7734;
        this.field7728 = field7735;
        this.field7729 = field7736;
        this.field7730 = field7737;
        this.field7731 = field7738;
        this.field7732 = field7739;
        this.field7733 = field7740;
    }
    
    @Override
    public void run() {
        final double[] array = new double[this.field7728];
        if (this.field7729 != -1) {
            if (Class7796.method25147(this.field7734) <= 2) {
                if (Class7796.method25147(this.field7734) == 2) {
                    for (int i = this.field7730; i < Class7796.method25144(this.field7734); i += this.field7731) {
                        final int n = i * Class7796.method25145(this.field7734);
                        for (int j = 0; j < Class7796.method25149(this.field7734); ++j) {
                            final int n2 = j * Class7796.method25143(this.field7734) + n;
                            array[j] = this.field7732[n2];
                            array[Class7796.method25149(this.field7734) + j] = this.field7732[n2 + 1];
                        }
                        Class7796.method25150(this.field7734).method18042(array, 0, this.field7733);
                        Class7796.method25150(this.field7734).method18042(array, Class7796.method25149(this.field7734), this.field7733);
                        for (int k = 0; k < Class7796.method25149(this.field7734); ++k) {
                            final int n3 = k * Class7796.method25143(this.field7734) + n;
                            this.field7732[n3] = array[k];
                            this.field7732[n3 + 1] = array[Class7796.method25149(this.field7734) + k];
                        }
                    }
                }
            }
            else {
                for (int l = this.field7730; l < Class7796.method25144(this.field7734); l += this.field7731) {
                    final int n4 = l * Class7796.method25145(this.field7734);
                    for (int n5 = 0; n5 < Class7796.method25147(this.field7734); n5 += 4) {
                        for (int n6 = 0; n6 < Class7796.method25149(this.field7734); ++n6) {
                            final int n7 = n6 * Class7796.method25143(this.field7734) + n4 + n5;
                            final int n8 = Class7796.method25149(this.field7734) + n6;
                            array[n6] = this.field7732[n7];
                            array[n8] = this.field7732[n7 + 1];
                            array[n8 + Class7796.method25149(this.field7734)] = this.field7732[n7 + 2];
                            array[n8 + 2 * Class7796.method25149(this.field7734)] = this.field7732[n7 + 3];
                        }
                        Class7796.method25150(this.field7734).method18042(array, 0, this.field7733);
                        Class7796.method25150(this.field7734).method18042(array, Class7796.method25149(this.field7734), this.field7733);
                        Class7796.method25150(this.field7734).method18042(array, 2 * Class7796.method25149(this.field7734), this.field7733);
                        Class7796.method25150(this.field7734).method18042(array, 3 * Class7796.method25149(this.field7734), this.field7733);
                        for (int n9 = 0; n9 < Class7796.method25149(this.field7734); ++n9) {
                            final int n10 = n9 * Class7796.method25143(this.field7734) + n4 + n5;
                            final int n11 = Class7796.method25149(this.field7734) + n9;
                            this.field7732[n10] = array[n9];
                            this.field7732[n10 + 1] = array[n11];
                            this.field7732[n10 + 2] = array[n11 + Class7796.method25149(this.field7734)];
                            this.field7732[n10 + 3] = array[n11 + 2 * Class7796.method25149(this.field7734)];
                        }
                    }
                }
            }
        }
        else if (Class7796.method25147(this.field7734) <= 2) {
            if (Class7796.method25147(this.field7734) == 2) {
                for (int field7730 = this.field7730; field7730 < Class7796.method25144(this.field7734); field7730 += this.field7731) {
                    final int n12 = field7730 * Class7796.method25145(this.field7734);
                    for (int n13 = 0; n13 < Class7796.method25149(this.field7734); ++n13) {
                        final int n14 = n13 * Class7796.method25143(this.field7734) + n12;
                        array[n13] = this.field7732[n14];
                        array[Class7796.method25149(this.field7734) + n13] = this.field7732[n14 + 1];
                    }
                    Class7796.method25150(this.field7734).method18038(array, 0, this.field7733);
                    Class7796.method25150(this.field7734).method18038(array, Class7796.method25149(this.field7734), this.field7733);
                    for (int n15 = 0; n15 < Class7796.method25149(this.field7734); ++n15) {
                        final int n16 = n15 * Class7796.method25143(this.field7734) + n12;
                        this.field7732[n16] = array[n15];
                        this.field7732[n16 + 1] = array[Class7796.method25149(this.field7734) + n15];
                    }
                }
            }
        }
        else {
            for (int field7731 = this.field7730; field7731 < Class7796.method25144(this.field7734); field7731 += this.field7731) {
                final int n17 = field7731 * Class7796.method25145(this.field7734);
                for (int n18 = 0; n18 < Class7796.method25147(this.field7734); n18 += 4) {
                    for (int n19 = 0; n19 < Class7796.method25149(this.field7734); ++n19) {
                        final int n20 = n19 * Class7796.method25143(this.field7734) + n17 + n18;
                        final int n21 = Class7796.method25149(this.field7734) + n19;
                        array[n19] = this.field7732[n20];
                        array[n21] = this.field7732[n20 + 1];
                        array[n21 + Class7796.method25149(this.field7734)] = this.field7732[n20 + 2];
                        array[n21 + 2 * Class7796.method25149(this.field7734)] = this.field7732[n20 + 3];
                    }
                    Class7796.method25150(this.field7734).method18038(array, 0, this.field7733);
                    Class7796.method25150(this.field7734).method18038(array, Class7796.method25149(this.field7734), this.field7733);
                    Class7796.method25150(this.field7734).method18038(array, 2 * Class7796.method25149(this.field7734), this.field7733);
                    Class7796.method25150(this.field7734).method18038(array, 3 * Class7796.method25149(this.field7734), this.field7733);
                    for (int n22 = 0; n22 < Class7796.method25149(this.field7734); ++n22) {
                        final int n23 = n22 * Class7796.method25143(this.field7734) + n17 + n18;
                        final int n24 = Class7796.method25149(this.field7734) + n22;
                        this.field7732[n23] = array[n22];
                        this.field7732[n23 + 1] = array[n24];
                        this.field7732[n23 + 2] = array[n24 + Class7796.method25149(this.field7734)];
                        this.field7732[n23 + 3] = array[n24 + 2 * Class7796.method25149(this.field7734)];
                    }
                }
            }
        }
    }
}
