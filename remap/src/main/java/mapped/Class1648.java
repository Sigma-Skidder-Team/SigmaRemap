// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1648 implements Runnable
{
    private static String[] field9218;
    public final /* synthetic */ int field9219;
    public final /* synthetic */ int field9220;
    public final /* synthetic */ int field9221;
    public final /* synthetic */ int field9222;
    public final /* synthetic */ int field9223;
    public final /* synthetic */ double[][][] field9224;
    public final /* synthetic */ boolean field9225;
    public final /* synthetic */ Class6733 field9226;
    
    public Class1648(final Class6733 field9226, final int field9227, final int field9228, final int field9229, final int field9230, final int field9231, final double[][][] field9232, final boolean field9233) {
        this.field9226 = field9226;
        this.field9219 = field9227;
        this.field9220 = field9228;
        this.field9221 = field9229;
        this.field9222 = field9230;
        this.field9223 = field9231;
        this.field9224 = field9232;
        this.field9225 = field9233;
    }
    
    @Override
    public void run() {
        final double[] array = new double[this.field9219];
        if (this.field9220 != -1) {
            for (int i = this.field9221; i < Class6733.method20479(this.field9226); i += this.field9222) {
                if (this.field9223 != 0) {
                    for (int j = 0; j < Class6733.method20474(this.field9226); ++j) {
                        Class6733.method20476(this.field9226).method26096(this.field9224[i][j], 0, this.field9225);
                    }
                }
                else {
                    for (int k = 0; k < Class6733.method20474(this.field9226); ++k) {
                        Class6733.method20476(this.field9226).method26076(this.field9224[i][k], this.field9225);
                    }
                }
                if (Class6733.method20477(this.field9226) <= 4) {
                    if (Class6733.method20477(this.field9226) != 4) {
                        if (Class6733.method20477(this.field9226) == 2) {
                            for (int l = 0; l < Class6733.method20474(this.field9226); ++l) {
                                final int n = 2 * l;
                                array[n] = this.field9224[i][l][0];
                                array[n + 1] = this.field9224[i][l][1];
                            }
                            Class6733.method20478(this.field9226).method26078(array, 0, this.field9225);
                            for (int n2 = 0; n2 < Class6733.method20474(this.field9226); ++n2) {
                                final int n3 = 2 * n2;
                                this.field9224[i][n2][0] = array[n3];
                                this.field9224[i][n2][1] = array[n3 + 1];
                            }
                        }
                    }
                    else {
                        for (int n4 = 0; n4 < Class6733.method20474(this.field9226); ++n4) {
                            final int n5 = 2 * n4;
                            final int n6 = 2 * Class6733.method20474(this.field9226) + 2 * n4;
                            array[n5] = this.field9224[i][n4][0];
                            array[n5 + 1] = this.field9224[i][n4][1];
                            array[n6] = this.field9224[i][n4][2];
                            array[n6 + 1] = this.field9224[i][n4][3];
                        }
                        Class6733.method20478(this.field9226).method26078(array, 0, this.field9225);
                        Class6733.method20478(this.field9226).method26078(array, 2 * Class6733.method20474(this.field9226), this.field9225);
                        for (int n7 = 0; n7 < Class6733.method20474(this.field9226); ++n7) {
                            final int n8 = 2 * n7;
                            final int n9 = 2 * Class6733.method20474(this.field9226) + 2 * n7;
                            this.field9224[i][n7][0] = array[n8];
                            this.field9224[i][n7][1] = array[n8 + 1];
                            this.field9224[i][n7][2] = array[n9];
                            this.field9224[i][n7][3] = array[n9 + 1];
                        }
                    }
                }
                else {
                    for (int n10 = 0; n10 < Class6733.method20477(this.field9226); n10 += 8) {
                        for (int n11 = 0; n11 < Class6733.method20474(this.field9226); ++n11) {
                            final int n12 = 2 * n11;
                            final int n13 = 2 * Class6733.method20474(this.field9226) + 2 * n11;
                            final int n14 = n13 + 2 * Class6733.method20474(this.field9226);
                            final int n15 = n14 + 2 * Class6733.method20474(this.field9226);
                            array[n12] = this.field9224[i][n11][n10];
                            array[n12 + 1] = this.field9224[i][n11][n10 + 1];
                            array[n13] = this.field9224[i][n11][n10 + 2];
                            array[n13 + 1] = this.field9224[i][n11][n10 + 3];
                            array[n14] = this.field9224[i][n11][n10 + 4];
                            array[n14 + 1] = this.field9224[i][n11][n10 + 5];
                            array[n15] = this.field9224[i][n11][n10 + 6];
                            array[n15 + 1] = this.field9224[i][n11][n10 + 7];
                        }
                        Class6733.method20478(this.field9226).method26078(array, 0, this.field9225);
                        Class6733.method20478(this.field9226).method26078(array, 2 * Class6733.method20474(this.field9226), this.field9225);
                        Class6733.method20478(this.field9226).method26078(array, 4 * Class6733.method20474(this.field9226), this.field9225);
                        Class6733.method20478(this.field9226).method26078(array, 6 * Class6733.method20474(this.field9226), this.field9225);
                        for (int n16 = 0; n16 < Class6733.method20474(this.field9226); ++n16) {
                            final int n17 = 2 * n16;
                            final int n18 = 2 * Class6733.method20474(this.field9226) + 2 * n16;
                            final int n19 = n18 + 2 * Class6733.method20474(this.field9226);
                            final int n20 = n19 + 2 * Class6733.method20474(this.field9226);
                            this.field9224[i][n16][n10] = array[n17];
                            this.field9224[i][n16][n10 + 1] = array[n17 + 1];
                            this.field9224[i][n16][n10 + 2] = array[n18];
                            this.field9224[i][n16][n10 + 3] = array[n18 + 1];
                            this.field9224[i][n16][n10 + 4] = array[n19];
                            this.field9224[i][n16][n10 + 5] = array[n19 + 1];
                            this.field9224[i][n16][n10 + 6] = array[n20];
                            this.field9224[i][n16][n10 + 7] = array[n20 + 1];
                        }
                    }
                }
            }
        }
        else {
            for (int field9221 = this.field9221; field9221 < Class6733.method20479(this.field9226); field9221 += this.field9222) {
                if (this.field9223 != 0) {
                    for (int n21 = 0; n21 < Class6733.method20474(this.field9226); ++n21) {
                        Class6733.method20476(this.field9226).method26080(this.field9224[field9221][n21]);
                    }
                }
                else {
                    for (int n22 = 0; n22 < Class6733.method20474(this.field9226); ++n22) {
                        Class6733.method20476(this.field9226).method26072(this.field9224[field9221][n22]);
                    }
                }
                if (Class6733.method20477(this.field9226) <= 4) {
                    if (Class6733.method20477(this.field9226) != 4) {
                        if (Class6733.method20477(this.field9226) == 2) {
                            for (int n23 = 0; n23 < Class6733.method20474(this.field9226); ++n23) {
                                final int n24 = 2 * n23;
                                array[n24] = this.field9224[field9221][n23][0];
                                array[n24 + 1] = this.field9224[field9221][n23][1];
                            }
                            Class6733.method20478(this.field9226).method26074(array, 0);
                            for (int n25 = 0; n25 < Class6733.method20474(this.field9226); ++n25) {
                                final int n26 = 2 * n25;
                                this.field9224[field9221][n25][0] = array[n26];
                                this.field9224[field9221][n25][1] = array[n26 + 1];
                            }
                        }
                    }
                    else {
                        for (int n27 = 0; n27 < Class6733.method20474(this.field9226); ++n27) {
                            final int n28 = 2 * n27;
                            final int n29 = 2 * Class6733.method20474(this.field9226) + 2 * n27;
                            array[n28] = this.field9224[field9221][n27][0];
                            array[n28 + 1] = this.field9224[field9221][n27][1];
                            array[n29] = this.field9224[field9221][n27][2];
                            array[n29 + 1] = this.field9224[field9221][n27][3];
                        }
                        Class6733.method20478(this.field9226).method26074(array, 0);
                        Class6733.method20478(this.field9226).method26074(array, 2 * Class6733.method20474(this.field9226));
                        for (int n30 = 0; n30 < Class6733.method20474(this.field9226); ++n30) {
                            final int n31 = 2 * n30;
                            final int n32 = 2 * Class6733.method20474(this.field9226) + 2 * n30;
                            this.field9224[field9221][n30][0] = array[n31];
                            this.field9224[field9221][n30][1] = array[n31 + 1];
                            this.field9224[field9221][n30][2] = array[n32];
                            this.field9224[field9221][n30][3] = array[n32 + 1];
                        }
                    }
                }
                else {
                    for (int n33 = 0; n33 < Class6733.method20477(this.field9226); n33 += 8) {
                        for (int n34 = 0; n34 < Class6733.method20474(this.field9226); ++n34) {
                            final int n35 = 2 * n34;
                            final int n36 = 2 * Class6733.method20474(this.field9226) + 2 * n34;
                            final int n37 = n36 + 2 * Class6733.method20474(this.field9226);
                            final int n38 = n37 + 2 * Class6733.method20474(this.field9226);
                            array[n35] = this.field9224[field9221][n34][n33];
                            array[n35 + 1] = this.field9224[field9221][n34][n33 + 1];
                            array[n36] = this.field9224[field9221][n34][n33 + 2];
                            array[n36 + 1] = this.field9224[field9221][n34][n33 + 3];
                            array[n37] = this.field9224[field9221][n34][n33 + 4];
                            array[n37 + 1] = this.field9224[field9221][n34][n33 + 5];
                            array[n38] = this.field9224[field9221][n34][n33 + 6];
                            array[n38 + 1] = this.field9224[field9221][n34][n33 + 7];
                        }
                        Class6733.method20478(this.field9226).method26074(array, 0);
                        Class6733.method20478(this.field9226).method26074(array, 2 * Class6733.method20474(this.field9226));
                        Class6733.method20478(this.field9226).method26074(array, 4 * Class6733.method20474(this.field9226));
                        Class6733.method20478(this.field9226).method26074(array, 6 * Class6733.method20474(this.field9226));
                        for (int n39 = 0; n39 < Class6733.method20474(this.field9226); ++n39) {
                            final int n40 = 2 * n39;
                            final int n41 = 2 * Class6733.method20474(this.field9226) + 2 * n39;
                            final int n42 = n41 + 2 * Class6733.method20474(this.field9226);
                            final int n43 = n42 + 2 * Class6733.method20474(this.field9226);
                            this.field9224[field9221][n39][n33] = array[n40];
                            this.field9224[field9221][n39][n33 + 1] = array[n40 + 1];
                            this.field9224[field9221][n39][n33 + 2] = array[n41];
                            this.field9224[field9221][n39][n33 + 3] = array[n41 + 1];
                            this.field9224[field9221][n39][n33 + 4] = array[n42];
                            this.field9224[field9221][n39][n33 + 5] = array[n42 + 1];
                            this.field9224[field9221][n39][n33 + 6] = array[n43];
                            this.field9224[field9221][n39][n33 + 7] = array[n43 + 1];
                        }
                    }
                }
            }
        }
    }
}
