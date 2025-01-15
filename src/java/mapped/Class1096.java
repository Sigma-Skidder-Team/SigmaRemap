// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1096 implements Runnable
{
    private static String[] field5913;
    public final /* synthetic */ int field5914;
    public final /* synthetic */ int field5915;
    public final /* synthetic */ int field5916;
    public final /* synthetic */ int field5917;
    public final /* synthetic */ float[][][] field5918;
    public final /* synthetic */ boolean field5919;
    public final /* synthetic */ Class6362 field5920;
    
    public Class1096(final Class6362 field5920, final int field5921, final int field5922, final int field5923, final int field5924, final float[][][] field5925, final boolean field5926) {
        this.field5920 = field5920;
        this.field5914 = field5921;
        this.field5915 = field5922;
        this.field5916 = field5923;
        this.field5917 = field5924;
        this.field5918 = field5925;
        this.field5919 = field5926;
    }
    
    @Override
    public void run() {
        final float[] array = new float[this.field5914];
        if (this.field5915 != -1) {
            if (Class6362.method19001(this.field5920) <= 4) {
                if (Class6362.method19001(this.field5920) != 4) {
                    if (Class6362.method19001(this.field5920) == 2) {
                        for (int i = this.field5916; i < Class6362.method18998(this.field5920); i += this.field5917) {
                            for (int j = 0; j < Class6362.method19003(this.field5920); ++j) {
                                final int n = 2 * j;
                                array[n] = this.field5918[j][i][0];
                                array[n + 1] = this.field5918[j][i][1];
                            }
                            Class6362.method19004(this.field5920).method25931(array, 0, this.field5919);
                            for (int k = 0; k < Class6362.method19003(this.field5920); ++k) {
                                final int n2 = 2 * k;
                                this.field5918[k][i][0] = array[n2];
                                this.field5918[k][i][1] = array[n2 + 1];
                            }
                        }
                    }
                }
                else {
                    for (int l = this.field5916; l < Class6362.method18998(this.field5920); l += this.field5917) {
                        for (int n3 = 0; n3 < Class6362.method19003(this.field5920); ++n3) {
                            final int n4 = 2 * n3;
                            final int n5 = 2 * Class6362.method19003(this.field5920) + 2 * n3;
                            array[n4] = this.field5918[n3][l][0];
                            array[n4 + 1] = this.field5918[n3][l][1];
                            array[n5] = this.field5918[n3][l][2];
                            array[n5 + 1] = this.field5918[n3][l][3];
                        }
                        Class6362.method19004(this.field5920).method25931(array, 0, this.field5919);
                        Class6362.method19004(this.field5920).method25931(array, 2 * Class6362.method19003(this.field5920), this.field5919);
                        for (int n6 = 0; n6 < Class6362.method19003(this.field5920); ++n6) {
                            final int n7 = 2 * n6;
                            final int n8 = 2 * Class6362.method19003(this.field5920) + 2 * n6;
                            this.field5918[n6][l][0] = array[n7];
                            this.field5918[n6][l][1] = array[n7 + 1];
                            this.field5918[n6][l][2] = array[n8];
                            this.field5918[n6][l][3] = array[n8 + 1];
                        }
                    }
                }
            }
            else {
                for (int field5916 = this.field5916; field5916 < Class6362.method18998(this.field5920); field5916 += this.field5917) {
                    for (int n9 = 0; n9 < Class6362.method19001(this.field5920); n9 += 8) {
                        for (int n10 = 0; n10 < Class6362.method19003(this.field5920); ++n10) {
                            final int n11 = 2 * n10;
                            final int n12 = 2 * Class6362.method19003(this.field5920) + 2 * n10;
                            final int n13 = n12 + 2 * Class6362.method19003(this.field5920);
                            final int n14 = n13 + 2 * Class6362.method19003(this.field5920);
                            array[n11] = this.field5918[n10][field5916][n9];
                            array[n11 + 1] = this.field5918[n10][field5916][n9 + 1];
                            array[n12] = this.field5918[n10][field5916][n9 + 2];
                            array[n12 + 1] = this.field5918[n10][field5916][n9 + 3];
                            array[n13] = this.field5918[n10][field5916][n9 + 4];
                            array[n13 + 1] = this.field5918[n10][field5916][n9 + 5];
                            array[n14] = this.field5918[n10][field5916][n9 + 6];
                            array[n14 + 1] = this.field5918[n10][field5916][n9 + 7];
                        }
                        Class6362.method19004(this.field5920).method25931(array, 0, this.field5919);
                        Class6362.method19004(this.field5920).method25931(array, 2 * Class6362.method19003(this.field5920), this.field5919);
                        Class6362.method19004(this.field5920).method25931(array, 4 * Class6362.method19003(this.field5920), this.field5919);
                        Class6362.method19004(this.field5920).method25931(array, 6 * Class6362.method19003(this.field5920), this.field5919);
                        for (int n15 = 0; n15 < Class6362.method19003(this.field5920); ++n15) {
                            final int n16 = 2 * n15;
                            final int n17 = 2 * Class6362.method19003(this.field5920) + 2 * n15;
                            final int n18 = n17 + 2 * Class6362.method19003(this.field5920);
                            final int n19 = n18 + 2 * Class6362.method19003(this.field5920);
                            this.field5918[n15][field5916][n9] = array[n16];
                            this.field5918[n15][field5916][n9 + 1] = array[n16 + 1];
                            this.field5918[n15][field5916][n9 + 2] = array[n17];
                            this.field5918[n15][field5916][n9 + 3] = array[n17 + 1];
                            this.field5918[n15][field5916][n9 + 4] = array[n18];
                            this.field5918[n15][field5916][n9 + 5] = array[n18 + 1];
                            this.field5918[n15][field5916][n9 + 6] = array[n19];
                            this.field5918[n15][field5916][n9 + 7] = array[n19 + 1];
                        }
                    }
                }
            }
        }
        else if (Class6362.method19001(this.field5920) <= 4) {
            if (Class6362.method19001(this.field5920) != 4) {
                if (Class6362.method19001(this.field5920) == 2) {
                    for (int field5917 = this.field5916; field5917 < Class6362.method18998(this.field5920); field5917 += this.field5917) {
                        for (int n20 = 0; n20 < Class6362.method19003(this.field5920); ++n20) {
                            final int n21 = 2 * n20;
                            array[n21] = this.field5918[n20][field5917][0];
                            array[n21 + 1] = this.field5918[n20][field5917][1];
                        }
                        Class6362.method19004(this.field5920).method25927(array, 0);
                        for (int n22 = 0; n22 < Class6362.method19003(this.field5920); ++n22) {
                            final int n23 = 2 * n22;
                            this.field5918[n22][field5917][0] = array[n23];
                            this.field5918[n22][field5917][1] = array[n23 + 1];
                        }
                    }
                }
            }
            else {
                for (int field5918 = this.field5916; field5918 < Class6362.method18998(this.field5920); field5918 += this.field5917) {
                    for (int n24 = 0; n24 < Class6362.method19003(this.field5920); ++n24) {
                        final int n25 = 2 * n24;
                        final int n26 = 2 * Class6362.method19003(this.field5920) + 2 * n24;
                        array[n25] = this.field5918[n24][field5918][0];
                        array[n25 + 1] = this.field5918[n24][field5918][1];
                        array[n26] = this.field5918[n24][field5918][2];
                        array[n26 + 1] = this.field5918[n24][field5918][3];
                    }
                    Class6362.method19004(this.field5920).method25927(array, 0);
                    Class6362.method19004(this.field5920).method25927(array, 2 * Class6362.method19003(this.field5920));
                    for (int n27 = 0; n27 < Class6362.method19003(this.field5920); ++n27) {
                        final int n28 = 2 * n27;
                        final int n29 = 2 * Class6362.method19003(this.field5920) + 2 * n27;
                        this.field5918[n27][field5918][0] = array[n28];
                        this.field5918[n27][field5918][1] = array[n28 + 1];
                        this.field5918[n27][field5918][2] = array[n29];
                        this.field5918[n27][field5918][3] = array[n29 + 1];
                    }
                }
            }
        }
        else {
            for (int field5919 = this.field5916; field5919 < Class6362.method18998(this.field5920); field5919 += this.field5917) {
                for (int n30 = 0; n30 < Class6362.method19001(this.field5920); n30 += 8) {
                    for (int n31 = 0; n31 < Class6362.method19003(this.field5920); ++n31) {
                        final int n32 = 2 * n31;
                        final int n33 = 2 * Class6362.method19003(this.field5920) + 2 * n31;
                        final int n34 = n33 + 2 * Class6362.method19003(this.field5920);
                        final int n35 = n34 + 2 * Class6362.method19003(this.field5920);
                        array[n32] = this.field5918[n31][field5919][n30];
                        array[n32 + 1] = this.field5918[n31][field5919][n30 + 1];
                        array[n33] = this.field5918[n31][field5919][n30 + 2];
                        array[n33 + 1] = this.field5918[n31][field5919][n30 + 3];
                        array[n34] = this.field5918[n31][field5919][n30 + 4];
                        array[n34 + 1] = this.field5918[n31][field5919][n30 + 5];
                        array[n35] = this.field5918[n31][field5919][n30 + 6];
                        array[n35 + 1] = this.field5918[n31][field5919][n30 + 7];
                    }
                    Class6362.method19004(this.field5920).method25927(array, 0);
                    Class6362.method19004(this.field5920).method25927(array, 2 * Class6362.method19003(this.field5920));
                    Class6362.method19004(this.field5920).method25927(array, 4 * Class6362.method19003(this.field5920));
                    Class6362.method19004(this.field5920).method25927(array, 6 * Class6362.method19003(this.field5920));
                    for (int n36 = 0; n36 < Class6362.method19003(this.field5920); ++n36) {
                        final int n37 = 2 * n36;
                        final int n38 = 2 * Class6362.method19003(this.field5920) + 2 * n36;
                        final int n39 = n38 + 2 * Class6362.method19003(this.field5920);
                        final int n40 = n39 + 2 * Class6362.method19003(this.field5920);
                        this.field5918[n36][field5919][n30] = array[n37];
                        this.field5918[n36][field5919][n30 + 1] = array[n37 + 1];
                        this.field5918[n36][field5919][n30 + 2] = array[n38];
                        this.field5918[n36][field5919][n30 + 3] = array[n38 + 1];
                        this.field5918[n36][field5919][n30 + 4] = array[n39];
                        this.field5918[n36][field5919][n30 + 5] = array[n39 + 1];
                        this.field5918[n36][field5919][n30 + 6] = array[n40];
                        this.field5918[n36][field5919][n30 + 7] = array[n40 + 1];
                    }
                }
            }
        }
    }
}
