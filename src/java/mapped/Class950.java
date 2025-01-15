// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class950 implements Runnable
{
    private static String[] field5023;
    public final /* synthetic */ int field5024;
    public final /* synthetic */ int field5025;
    public final /* synthetic */ int field5026;
    public final /* synthetic */ int field5027;
    public final /* synthetic */ double[][][] field5028;
    public final /* synthetic */ boolean field5029;
    public final /* synthetic */ Class5815 field5030;
    
    public Class950(final Class5815 field5030, final int field5031, final int field5032, final int field5033, final int field5034, final double[][][] field5035, final boolean field5036) {
        this.field5030 = field5030;
        this.field5024 = field5031;
        this.field5025 = field5032;
        this.field5026 = field5033;
        this.field5027 = field5034;
        this.field5028 = field5035;
        this.field5029 = field5036;
    }
    
    @Override
    public void run() {
        final double[] array = new double[this.field5024];
        if (this.field5025 != -1) {
            for (int i = this.field5026; i < Class5815.method17503(this.field5030); i += this.field5027) {
                for (int j = 0; j < Class5815.method17498(this.field5030); ++j) {
                    Class5815.method17500(this.field5030).method21390(this.field5028[i][j], this.field5029);
                }
                if (Class5815.method17501(this.field5030) <= 2) {
                    if (Class5815.method17501(this.field5030) == 2) {
                        for (int k = 0; k < Class5815.method17498(this.field5030); ++k) {
                            array[k] = this.field5028[i][k][0];
                            array[Class5815.method17498(this.field5030) + k] = this.field5028[i][k][1];
                        }
                        Class5815.method17502(this.field5030).method21392(array, 0, this.field5029);
                        Class5815.method17502(this.field5030).method21392(array, Class5815.method17498(this.field5030), this.field5029);
                        for (int l = 0; l < Class5815.method17498(this.field5030); ++l) {
                            this.field5028[i][l][0] = array[l];
                            this.field5028[i][l][1] = array[Class5815.method17498(this.field5030) + l];
                        }
                    }
                }
                else {
                    for (int n = 0; n < Class5815.method17501(this.field5030); n += 4) {
                        for (int n2 = 0; n2 < Class5815.method17498(this.field5030); ++n2) {
                            final int n3 = Class5815.method17498(this.field5030) + n2;
                            array[n2] = this.field5028[i][n2][n];
                            array[n3] = this.field5028[i][n2][n + 1];
                            array[n3 + Class5815.method17498(this.field5030)] = this.field5028[i][n2][n + 2];
                            array[n3 + 2 * Class5815.method17498(this.field5030)] = this.field5028[i][n2][n + 3];
                        }
                        Class5815.method17502(this.field5030).method21392(array, 0, this.field5029);
                        Class5815.method17502(this.field5030).method21392(array, Class5815.method17498(this.field5030), this.field5029);
                        Class5815.method17502(this.field5030).method21392(array, 2 * Class5815.method17498(this.field5030), this.field5029);
                        Class5815.method17502(this.field5030).method21392(array, 3 * Class5815.method17498(this.field5030), this.field5029);
                        for (int n4 = 0; n4 < Class5815.method17498(this.field5030); ++n4) {
                            final int n5 = Class5815.method17498(this.field5030) + n4;
                            this.field5028[i][n4][n] = array[n4];
                            this.field5028[i][n4][n + 1] = array[n5];
                            this.field5028[i][n4][n + 2] = array[n5 + Class5815.method17498(this.field5030)];
                            this.field5028[i][n4][n + 3] = array[n5 + 2 * Class5815.method17498(this.field5030)];
                        }
                    }
                }
            }
        }
        else {
            for (int field5026 = this.field5026; field5026 < Class5815.method17503(this.field5030); field5026 += this.field5027) {
                for (int n6 = 0; n6 < Class5815.method17498(this.field5030); ++n6) {
                    Class5815.method17500(this.field5030).method21386(this.field5028[field5026][n6]);
                }
                if (Class5815.method17501(this.field5030) <= 2) {
                    if (Class5815.method17501(this.field5030) == 2) {
                        for (int n7 = 0; n7 < Class5815.method17498(this.field5030); ++n7) {
                            array[n7] = this.field5028[field5026][n7][0];
                            array[Class5815.method17498(this.field5030) + n7] = this.field5028[field5026][n7][1];
                        }
                        Class5815.method17502(this.field5030).method21388(array, 0);
                        Class5815.method17502(this.field5030).method21388(array, Class5815.method17498(this.field5030));
                        for (int n8 = 0; n8 < Class5815.method17498(this.field5030); ++n8) {
                            this.field5028[field5026][n8][0] = array[n8];
                            this.field5028[field5026][n8][1] = array[Class5815.method17498(this.field5030) + n8];
                        }
                    }
                }
                else {
                    for (int n9 = 0; n9 < Class5815.method17501(this.field5030); n9 += 4) {
                        for (int n10 = 0; n10 < Class5815.method17498(this.field5030); ++n10) {
                            final int n11 = Class5815.method17498(this.field5030) + n10;
                            array[n10] = this.field5028[field5026][n10][n9];
                            array[n11] = this.field5028[field5026][n10][n9 + 1];
                            array[n11 + Class5815.method17498(this.field5030)] = this.field5028[field5026][n10][n9 + 2];
                            array[n11 + 2 * Class5815.method17498(this.field5030)] = this.field5028[field5026][n10][n9 + 3];
                        }
                        Class5815.method17502(this.field5030).method21388(array, 0);
                        Class5815.method17502(this.field5030).method21388(array, Class5815.method17498(this.field5030));
                        Class5815.method17502(this.field5030).method21388(array, 2 * Class5815.method17498(this.field5030));
                        Class5815.method17502(this.field5030).method21388(array, 3 * Class5815.method17498(this.field5030));
                        for (int n12 = 0; n12 < Class5815.method17498(this.field5030); ++n12) {
                            final int n13 = Class5815.method17498(this.field5030) + n12;
                            this.field5028[field5026][n12][n9] = array[n12];
                            this.field5028[field5026][n12][n9 + 1] = array[n13];
                            this.field5028[field5026][n12][n9 + 2] = array[n13 + Class5815.method17498(this.field5030)];
                            this.field5028[field5026][n12][n9 + 3] = array[n13 + 2 * Class5815.method17498(this.field5030)];
                        }
                    }
                }
            }
        }
    }
}
