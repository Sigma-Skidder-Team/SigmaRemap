// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1306 implements Runnable
{
    private static String[] field7153;
    public final /* synthetic */ int field7154;
    public final /* synthetic */ int field7155;
    public final /* synthetic */ int field7156;
    public final /* synthetic */ int field7157;
    public final /* synthetic */ double[] field7158;
    public final /* synthetic */ boolean field7159;
    public final /* synthetic */ Class5815 field7160;
    
    public Class1306(final Class5815 field7160, final int field7161, final int field7162, final int field7163, final int field7164, final double[] field7165, final boolean field7166) {
        this.field7160 = field7160;
        this.field7154 = field7161;
        this.field7155 = field7162;
        this.field7156 = field7163;
        this.field7157 = field7164;
        this.field7158 = field7165;
        this.field7159 = field7166;
    }
    
    @Override
    public void run() {
        final double[] array = new double[this.field7154];
        if (this.field7155 != -1) {
            if (Class5815.method17501(this.field7160) <= 2) {
                if (Class5815.method17501(this.field7160) == 2) {
                    for (int i = this.field7156; i < Class5815.method17498(this.field7160); i += this.field7157) {
                        final int n = i * Class5815.method17499(this.field7160);
                        for (int j = 0; j < Class5815.method17503(this.field7160); ++j) {
                            final int n2 = j * Class5815.method17497(this.field7160) + n;
                            array[j] = this.field7158[n2];
                            array[Class5815.method17503(this.field7160) + j] = this.field7158[n2 + 1];
                        }
                        Class5815.method17504(this.field7160).method21392(array, 0, this.field7159);
                        Class5815.method17504(this.field7160).method21392(array, Class5815.method17503(this.field7160), this.field7159);
                        for (int k = 0; k < Class5815.method17503(this.field7160); ++k) {
                            final int n3 = k * Class5815.method17497(this.field7160) + n;
                            this.field7158[n3] = array[k];
                            this.field7158[n3 + 1] = array[Class5815.method17503(this.field7160) + k];
                        }
                    }
                }
            }
            else {
                for (int l = this.field7156; l < Class5815.method17498(this.field7160); l += this.field7157) {
                    final int n4 = l * Class5815.method17499(this.field7160);
                    for (int n5 = 0; n5 < Class5815.method17501(this.field7160); n5 += 4) {
                        for (int n6 = 0; n6 < Class5815.method17503(this.field7160); ++n6) {
                            final int n7 = n6 * Class5815.method17497(this.field7160) + n4 + n5;
                            final int n8 = Class5815.method17503(this.field7160) + n6;
                            array[n6] = this.field7158[n7];
                            array[n8] = this.field7158[n7 + 1];
                            array[n8 + Class5815.method17503(this.field7160)] = this.field7158[n7 + 2];
                            array[n8 + 2 * Class5815.method17503(this.field7160)] = this.field7158[n7 + 3];
                        }
                        Class5815.method17504(this.field7160).method21392(array, 0, this.field7159);
                        Class5815.method17504(this.field7160).method21392(array, Class5815.method17503(this.field7160), this.field7159);
                        Class5815.method17504(this.field7160).method21392(array, 2 * Class5815.method17503(this.field7160), this.field7159);
                        Class5815.method17504(this.field7160).method21392(array, 3 * Class5815.method17503(this.field7160), this.field7159);
                        for (int n9 = 0; n9 < Class5815.method17503(this.field7160); ++n9) {
                            final int n10 = n9 * Class5815.method17497(this.field7160) + n4 + n5;
                            final int n11 = Class5815.method17503(this.field7160) + n9;
                            this.field7158[n10] = array[n9];
                            this.field7158[n10 + 1] = array[n11];
                            this.field7158[n10 + 2] = array[n11 + Class5815.method17503(this.field7160)];
                            this.field7158[n10 + 3] = array[n11 + 2 * Class5815.method17503(this.field7160)];
                        }
                    }
                }
            }
        }
        else if (Class5815.method17501(this.field7160) <= 2) {
            if (Class5815.method17501(this.field7160) == 2) {
                for (int field7156 = this.field7156; field7156 < Class5815.method17498(this.field7160); field7156 += this.field7157) {
                    final int n12 = field7156 * Class5815.method17499(this.field7160);
                    for (int n13 = 0; n13 < Class5815.method17503(this.field7160); ++n13) {
                        final int n14 = n13 * Class5815.method17497(this.field7160) + n12;
                        array[n13] = this.field7158[n14];
                        array[Class5815.method17503(this.field7160) + n13] = this.field7158[n14 + 1];
                    }
                    Class5815.method17504(this.field7160).method21388(array, 0);
                    Class5815.method17504(this.field7160).method21388(array, Class5815.method17503(this.field7160));
                    for (int n15 = 0; n15 < Class5815.method17503(this.field7160); ++n15) {
                        final int n16 = n15 * Class5815.method17497(this.field7160) + n12;
                        this.field7158[n16] = array[n15];
                        this.field7158[n16 + 1] = array[Class5815.method17503(this.field7160) + n15];
                    }
                }
            }
        }
        else {
            for (int field7157 = this.field7156; field7157 < Class5815.method17498(this.field7160); field7157 += this.field7157) {
                final int n17 = field7157 * Class5815.method17499(this.field7160);
                for (int n18 = 0; n18 < Class5815.method17501(this.field7160); n18 += 4) {
                    for (int n19 = 0; n19 < Class5815.method17503(this.field7160); ++n19) {
                        final int n20 = n19 * Class5815.method17497(this.field7160) + n17 + n18;
                        final int n21 = Class5815.method17503(this.field7160) + n19;
                        array[n19] = this.field7158[n20];
                        array[n21] = this.field7158[n20 + 1];
                        array[n21 + Class5815.method17503(this.field7160)] = this.field7158[n20 + 2];
                        array[n21 + 2 * Class5815.method17503(this.field7160)] = this.field7158[n20 + 3];
                    }
                    Class5815.method17504(this.field7160).method21388(array, 0);
                    Class5815.method17504(this.field7160).method21388(array, Class5815.method17503(this.field7160));
                    Class5815.method17504(this.field7160).method21388(array, 2 * Class5815.method17503(this.field7160));
                    Class5815.method17504(this.field7160).method21388(array, 3 * Class5815.method17503(this.field7160));
                    for (int n22 = 0; n22 < Class5815.method17503(this.field7160); ++n22) {
                        final int n23 = n22 * Class5815.method17497(this.field7160) + n17 + n18;
                        final int n24 = Class5815.method17503(this.field7160) + n22;
                        this.field7158[n23] = array[n22];
                        this.field7158[n23 + 1] = array[n24];
                        this.field7158[n23 + 2] = array[n24 + Class5815.method17503(this.field7160)];
                        this.field7158[n23 + 3] = array[n24 + 2 * Class5815.method17503(this.field7160)];
                    }
                }
            }
        }
    }
}
