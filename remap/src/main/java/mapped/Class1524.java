// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1524 implements Runnable
{
    private static String[] field8498;
    public final /* synthetic */ int field8499;
    public final /* synthetic */ int field8500;
    public final /* synthetic */ int field8501;
    public final /* synthetic */ int field8502;
    public final /* synthetic */ int field8503;
    public final /* synthetic */ double[][][] field8504;
    public final /* synthetic */ boolean field8505;
    public final /* synthetic */ Class6733 field8506;
    
    public Class1524(final Class6733 field8506, final int field8507, final int field8508, final int field8509, final int field8510, final int field8511, final double[][][] field8512, final boolean field8513) {
        this.field8506 = field8506;
        this.field8499 = field8507;
        this.field8500 = field8508;
        this.field8501 = field8509;
        this.field8502 = field8510;
        this.field8503 = field8511;
        this.field8504 = field8512;
        this.field8505 = field8513;
    }
    
    @Override
    public void run() {
        final double[] array = new double[this.field8499];
        if (this.field8500 != -1) {
            for (int i = this.field8501; i < Class6733.method20479(this.field8506); i += this.field8502) {
                if (this.field8503 == 0) {
                    for (int j = 0; j < Class6733.method20474(this.field8506); ++j) {
                        Class6733.method20476(this.field8506).method26076(this.field8504[i][j], this.field8505);
                    }
                }
                if (Class6733.method20477(this.field8506) <= 4) {
                    if (Class6733.method20477(this.field8506) != 4) {
                        if (Class6733.method20477(this.field8506) == 2) {
                            for (int k = 0; k < Class6733.method20474(this.field8506); ++k) {
                                final int n = 2 * k;
                                array[n] = this.field8504[i][k][0];
                                array[n + 1] = this.field8504[i][k][1];
                            }
                            Class6733.method20478(this.field8506).method26078(array, 0, this.field8505);
                            for (int l = 0; l < Class6733.method20474(this.field8506); ++l) {
                                final int n2 = 2 * l;
                                this.field8504[i][l][0] = array[n2];
                                this.field8504[i][l][1] = array[n2 + 1];
                            }
                        }
                    }
                    else {
                        for (int n3 = 0; n3 < Class6733.method20474(this.field8506); ++n3) {
                            final int n4 = 2 * n3;
                            final int n5 = 2 * Class6733.method20474(this.field8506) + 2 * n3;
                            array[n4] = this.field8504[i][n3][0];
                            array[n4 + 1] = this.field8504[i][n3][1];
                            array[n5] = this.field8504[i][n3][2];
                            array[n5 + 1] = this.field8504[i][n3][3];
                        }
                        Class6733.method20478(this.field8506).method26078(array, 0, this.field8505);
                        Class6733.method20478(this.field8506).method26078(array, 2 * Class6733.method20474(this.field8506), this.field8505);
                        for (int n6 = 0; n6 < Class6733.method20474(this.field8506); ++n6) {
                            final int n7 = 2 * n6;
                            final int n8 = 2 * Class6733.method20474(this.field8506) + 2 * n6;
                            this.field8504[i][n6][0] = array[n7];
                            this.field8504[i][n6][1] = array[n7 + 1];
                            this.field8504[i][n6][2] = array[n8];
                            this.field8504[i][n6][3] = array[n8 + 1];
                        }
                    }
                }
                else {
                    for (int n9 = 0; n9 < Class6733.method20477(this.field8506); n9 += 8) {
                        for (int n10 = 0; n10 < Class6733.method20474(this.field8506); ++n10) {
                            final int n11 = 2 * n10;
                            final int n12 = 2 * Class6733.method20474(this.field8506) + 2 * n10;
                            final int n13 = n12 + 2 * Class6733.method20474(this.field8506);
                            final int n14 = n13 + 2 * Class6733.method20474(this.field8506);
                            array[n11] = this.field8504[i][n10][n9];
                            array[n11 + 1] = this.field8504[i][n10][n9 + 1];
                            array[n12] = this.field8504[i][n10][n9 + 2];
                            array[n12 + 1] = this.field8504[i][n10][n9 + 3];
                            array[n13] = this.field8504[i][n10][n9 + 4];
                            array[n13 + 1] = this.field8504[i][n10][n9 + 5];
                            array[n14] = this.field8504[i][n10][n9 + 6];
                            array[n14 + 1] = this.field8504[i][n10][n9 + 7];
                        }
                        Class6733.method20478(this.field8506).method26078(array, 0, this.field8505);
                        Class6733.method20478(this.field8506).method26078(array, 2 * Class6733.method20474(this.field8506), this.field8505);
                        Class6733.method20478(this.field8506).method26078(array, 4 * Class6733.method20474(this.field8506), this.field8505);
                        Class6733.method20478(this.field8506).method26078(array, 6 * Class6733.method20474(this.field8506), this.field8505);
                        for (int n15 = 0; n15 < Class6733.method20474(this.field8506); ++n15) {
                            final int n16 = 2 * n15;
                            final int n17 = 2 * Class6733.method20474(this.field8506) + 2 * n15;
                            final int n18 = n17 + 2 * Class6733.method20474(this.field8506);
                            final int n19 = n18 + 2 * Class6733.method20474(this.field8506);
                            this.field8504[i][n15][n9] = array[n16];
                            this.field8504[i][n15][n9 + 1] = array[n16 + 1];
                            this.field8504[i][n15][n9 + 2] = array[n17];
                            this.field8504[i][n15][n9 + 3] = array[n17 + 1];
                            this.field8504[i][n15][n9 + 4] = array[n18];
                            this.field8504[i][n15][n9 + 5] = array[n18 + 1];
                            this.field8504[i][n15][n9 + 6] = array[n19];
                            this.field8504[i][n15][n9 + 7] = array[n19 + 1];
                        }
                    }
                }
                if (this.field8503 != 0) {
                    for (int n20 = 0; n20 < Class6733.method20474(this.field8506); ++n20) {
                        Class6733.method20476(this.field8506).method26088(this.field8504[i][n20], this.field8505);
                    }
                }
            }
        }
        else {
            for (int field8501 = this.field8501; field8501 < Class6733.method20479(this.field8506); field8501 += this.field8502) {
                if (this.field8503 != 0) {
                    for (int n21 = 0; n21 < Class6733.method20474(this.field8506); ++n21) {
                        Class6733.method20476(this.field8506).method26082(this.field8504[field8501][n21], 0);
                    }
                }
                else {
                    for (int n22 = 0; n22 < Class6733.method20474(this.field8506); ++n22) {
                        Class6733.method20476(this.field8506).method26072(this.field8504[field8501][n22]);
                    }
                }
                if (Class6733.method20477(this.field8506) <= 4) {
                    if (Class6733.method20477(this.field8506) != 4) {
                        if (Class6733.method20477(this.field8506) == 2) {
                            for (int n23 = 0; n23 < Class6733.method20474(this.field8506); ++n23) {
                                final int n24 = 2 * n23;
                                array[n24] = this.field8504[field8501][n23][0];
                                array[n24 + 1] = this.field8504[field8501][n23][1];
                            }
                            Class6733.method20478(this.field8506).method26074(array, 0);
                            for (int n25 = 0; n25 < Class6733.method20474(this.field8506); ++n25) {
                                final int n26 = 2 * n25;
                                this.field8504[field8501][n25][0] = array[n26];
                                this.field8504[field8501][n25][1] = array[n26 + 1];
                            }
                        }
                    }
                    else {
                        for (int n27 = 0; n27 < Class6733.method20474(this.field8506); ++n27) {
                            final int n28 = 2 * n27;
                            final int n29 = 2 * Class6733.method20474(this.field8506) + 2 * n27;
                            array[n28] = this.field8504[field8501][n27][0];
                            array[n28 + 1] = this.field8504[field8501][n27][1];
                            array[n29] = this.field8504[field8501][n27][2];
                            array[n29 + 1] = this.field8504[field8501][n27][3];
                        }
                        Class6733.method20478(this.field8506).method26074(array, 0);
                        Class6733.method20478(this.field8506).method26074(array, 2 * Class6733.method20474(this.field8506));
                        for (int n30 = 0; n30 < Class6733.method20474(this.field8506); ++n30) {
                            final int n31 = 2 * n30;
                            final int n32 = 2 * Class6733.method20474(this.field8506) + 2 * n30;
                            this.field8504[field8501][n30][0] = array[n31];
                            this.field8504[field8501][n30][1] = array[n31 + 1];
                            this.field8504[field8501][n30][2] = array[n32];
                            this.field8504[field8501][n30][3] = array[n32 + 1];
                        }
                    }
                }
                else {
                    for (int n33 = 0; n33 < Class6733.method20477(this.field8506); n33 += 8) {
                        for (int n34 = 0; n34 < Class6733.method20474(this.field8506); ++n34) {
                            final int n35 = 2 * n34;
                            final int n36 = 2 * Class6733.method20474(this.field8506) + 2 * n34;
                            final int n37 = n36 + 2 * Class6733.method20474(this.field8506);
                            final int n38 = n37 + 2 * Class6733.method20474(this.field8506);
                            array[n35] = this.field8504[field8501][n34][n33];
                            array[n35 + 1] = this.field8504[field8501][n34][n33 + 1];
                            array[n36] = this.field8504[field8501][n34][n33 + 2];
                            array[n36 + 1] = this.field8504[field8501][n34][n33 + 3];
                            array[n37] = this.field8504[field8501][n34][n33 + 4];
                            array[n37 + 1] = this.field8504[field8501][n34][n33 + 5];
                            array[n38] = this.field8504[field8501][n34][n33 + 6];
                            array[n38 + 1] = this.field8504[field8501][n34][n33 + 7];
                        }
                        Class6733.method20478(this.field8506).method26074(array, 0);
                        Class6733.method20478(this.field8506).method26074(array, 2 * Class6733.method20474(this.field8506));
                        Class6733.method20478(this.field8506).method26074(array, 4 * Class6733.method20474(this.field8506));
                        Class6733.method20478(this.field8506).method26074(array, 6 * Class6733.method20474(this.field8506));
                        for (int n39 = 0; n39 < Class6733.method20474(this.field8506); ++n39) {
                            final int n40 = 2 * n39;
                            final int n41 = 2 * Class6733.method20474(this.field8506) + 2 * n39;
                            final int n42 = n41 + 2 * Class6733.method20474(this.field8506);
                            final int n43 = n42 + 2 * Class6733.method20474(this.field8506);
                            this.field8504[field8501][n39][n33] = array[n40];
                            this.field8504[field8501][n39][n33 + 1] = array[n40 + 1];
                            this.field8504[field8501][n39][n33 + 2] = array[n41];
                            this.field8504[field8501][n39][n33 + 3] = array[n41 + 1];
                            this.field8504[field8501][n39][n33 + 4] = array[n42];
                            this.field8504[field8501][n39][n33 + 5] = array[n42 + 1];
                            this.field8504[field8501][n39][n33 + 6] = array[n43];
                            this.field8504[field8501][n39][n33 + 7] = array[n43 + 1];
                        }
                    }
                }
            }
        }
    }
}
