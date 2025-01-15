// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1350 implements Runnable
{
    private static String[] field7390;
    public final /* synthetic */ int field7391;
    public final /* synthetic */ int field7392;
    public final /* synthetic */ int field7393;
    public final /* synthetic */ int field7394;
    public final /* synthetic */ int field7395;
    public final /* synthetic */ double[] field7396;
    public final /* synthetic */ boolean field7397;
    public final /* synthetic */ Class6733 field7398;
    
    public Class1350(final Class6733 field7398, final int field7399, final int field7400, final int field7401, final int field7402, final int field7403, final double[] field7404, final boolean field7405) {
        this.field7398 = field7398;
        this.field7391 = field7399;
        this.field7392 = field7400;
        this.field7393 = field7401;
        this.field7394 = field7402;
        this.field7395 = field7403;
        this.field7396 = field7404;
        this.field7397 = field7405;
    }
    
    @Override
    public void run() {
        final double[] array = new double[this.field7391];
        if (this.field7392 != -1) {
            for (int i = this.field7393; i < Class6733.method20479(this.field7398); i += this.field7394) {
                final int n = i * Class6733.method20473(this.field7398);
                if (this.field7395 == 0) {
                    for (int j = 0; j < Class6733.method20474(this.field7398); ++j) {
                        Class6733.method20476(this.field7398).method26078(this.field7396, n + j * Class6733.method20475(this.field7398), this.field7397);
                    }
                }
                if (Class6733.method20477(this.field7398) <= 4) {
                    if (Class6733.method20477(this.field7398) != 4) {
                        if (Class6733.method20477(this.field7398) == 2) {
                            for (int k = 0; k < Class6733.method20474(this.field7398); ++k) {
                                final int n2 = n + k * Class6733.method20475(this.field7398);
                                final int n3 = 2 * k;
                                array[n3] = this.field7396[n2];
                                array[n3 + 1] = this.field7396[n2 + 1];
                            }
                            Class6733.method20478(this.field7398).method26078(array, 0, this.field7397);
                            for (int l = 0; l < Class6733.method20474(this.field7398); ++l) {
                                final int n4 = n + l * Class6733.method20475(this.field7398);
                                final int n5 = 2 * l;
                                this.field7396[n4] = array[n5];
                                this.field7396[n4 + 1] = array[n5 + 1];
                            }
                        }
                    }
                    else {
                        for (int n6 = 0; n6 < Class6733.method20474(this.field7398); ++n6) {
                            final int n7 = n + n6 * Class6733.method20475(this.field7398);
                            final int n8 = 2 * n6;
                            final int n9 = 2 * Class6733.method20474(this.field7398) + 2 * n6;
                            array[n8] = this.field7396[n7];
                            array[n8 + 1] = this.field7396[n7 + 1];
                            array[n9] = this.field7396[n7 + 2];
                            array[n9 + 1] = this.field7396[n7 + 3];
                        }
                        Class6733.method20478(this.field7398).method26078(array, 0, this.field7397);
                        Class6733.method20478(this.field7398).method26078(array, 2 * Class6733.method20474(this.field7398), this.field7397);
                        for (int n10 = 0; n10 < Class6733.method20474(this.field7398); ++n10) {
                            final int n11 = n + n10 * Class6733.method20475(this.field7398);
                            final int n12 = 2 * n10;
                            final int n13 = 2 * Class6733.method20474(this.field7398) + 2 * n10;
                            this.field7396[n11] = array[n12];
                            this.field7396[n11 + 1] = array[n12 + 1];
                            this.field7396[n11 + 2] = array[n13];
                            this.field7396[n11 + 3] = array[n13 + 1];
                        }
                    }
                }
                else {
                    for (int n14 = 0; n14 < Class6733.method20477(this.field7398); n14 += 8) {
                        for (int n15 = 0; n15 < Class6733.method20474(this.field7398); ++n15) {
                            final int n16 = n + n15 * Class6733.method20475(this.field7398) + n14;
                            final int n17 = 2 * n15;
                            final int n18 = 2 * Class6733.method20474(this.field7398) + 2 * n15;
                            final int n19 = n18 + 2 * Class6733.method20474(this.field7398);
                            final int n20 = n19 + 2 * Class6733.method20474(this.field7398);
                            array[n17] = this.field7396[n16];
                            array[n17 + 1] = this.field7396[n16 + 1];
                            array[n18] = this.field7396[n16 + 2];
                            array[n18 + 1] = this.field7396[n16 + 3];
                            array[n19] = this.field7396[n16 + 4];
                            array[n19 + 1] = this.field7396[n16 + 5];
                            array[n20] = this.field7396[n16 + 6];
                            array[n20 + 1] = this.field7396[n16 + 7];
                        }
                        Class6733.method20478(this.field7398).method26078(array, 0, this.field7397);
                        Class6733.method20478(this.field7398).method26078(array, 2 * Class6733.method20474(this.field7398), this.field7397);
                        Class6733.method20478(this.field7398).method26078(array, 4 * Class6733.method20474(this.field7398), this.field7397);
                        Class6733.method20478(this.field7398).method26078(array, 6 * Class6733.method20474(this.field7398), this.field7397);
                        for (int n21 = 0; n21 < Class6733.method20474(this.field7398); ++n21) {
                            final int n22 = n + n21 * Class6733.method20475(this.field7398) + n14;
                            final int n23 = 2 * n21;
                            final int n24 = 2 * Class6733.method20474(this.field7398) + 2 * n21;
                            final int n25 = n24 + 2 * Class6733.method20474(this.field7398);
                            final int n26 = n25 + 2 * Class6733.method20474(this.field7398);
                            this.field7396[n22] = array[n23];
                            this.field7396[n22 + 1] = array[n23 + 1];
                            this.field7396[n22 + 2] = array[n24];
                            this.field7396[n22 + 3] = array[n24 + 1];
                            this.field7396[n22 + 4] = array[n25];
                            this.field7396[n22 + 5] = array[n25 + 1];
                            this.field7396[n22 + 6] = array[n26];
                            this.field7396[n22 + 7] = array[n26 + 1];
                        }
                    }
                }
                if (this.field7395 != 0) {
                    for (int n27 = 0; n27 < Class6733.method20474(this.field7398); ++n27) {
                        Class6733.method20476(this.field7398).method26090(this.field7396, n + n27 * Class6733.method20475(this.field7398), this.field7397);
                    }
                }
            }
        }
        else {
            for (int field7393 = this.field7393; field7393 < Class6733.method20479(this.field7398); field7393 += this.field7394) {
                final int n28 = field7393 * Class6733.method20473(this.field7398);
                if (this.field7395 != 0) {
                    for (int n29 = 0; n29 < Class6733.method20474(this.field7398); ++n29) {
                        Class6733.method20476(this.field7398).method26082(this.field7396, n28 + n29 * Class6733.method20475(this.field7398));
                    }
                }
                else {
                    for (int n30 = 0; n30 < Class6733.method20474(this.field7398); ++n30) {
                        Class6733.method20476(this.field7398).method26074(this.field7396, n28 + n30 * Class6733.method20475(this.field7398));
                    }
                }
                if (Class6733.method20477(this.field7398) <= 4) {
                    if (Class6733.method20477(this.field7398) != 4) {
                        if (Class6733.method20477(this.field7398) == 2) {
                            for (int n31 = 0; n31 < Class6733.method20474(this.field7398); ++n31) {
                                final int n32 = n28 + n31 * Class6733.method20475(this.field7398);
                                final int n33 = 2 * n31;
                                array[n33] = this.field7396[n32];
                                array[n33 + 1] = this.field7396[n32 + 1];
                            }
                            Class6733.method20478(this.field7398).method26074(array, 0);
                            for (int n34 = 0; n34 < Class6733.method20474(this.field7398); ++n34) {
                                final int n35 = n28 + n34 * Class6733.method20475(this.field7398);
                                final int n36 = 2 * n34;
                                this.field7396[n35] = array[n36];
                                this.field7396[n35 + 1] = array[n36 + 1];
                            }
                        }
                    }
                    else {
                        for (int n37 = 0; n37 < Class6733.method20474(this.field7398); ++n37) {
                            final int n38 = n28 + n37 * Class6733.method20475(this.field7398);
                            final int n39 = 2 * n37;
                            final int n40 = 2 * Class6733.method20474(this.field7398) + 2 * n37;
                            array[n39] = this.field7396[n38];
                            array[n39 + 1] = this.field7396[n38 + 1];
                            array[n40] = this.field7396[n38 + 2];
                            array[n40 + 1] = this.field7396[n38 + 3];
                        }
                        Class6733.method20478(this.field7398).method26074(array, 0);
                        Class6733.method20478(this.field7398).method26074(array, 2 * Class6733.method20474(this.field7398));
                        for (int n41 = 0; n41 < Class6733.method20474(this.field7398); ++n41) {
                            final int n42 = n28 + n41 * Class6733.method20475(this.field7398);
                            final int n43 = 2 * n41;
                            final int n44 = 2 * Class6733.method20474(this.field7398) + 2 * n41;
                            this.field7396[n42] = array[n43];
                            this.field7396[n42 + 1] = array[n43 + 1];
                            this.field7396[n42 + 2] = array[n44];
                            this.field7396[n42 + 3] = array[n44 + 1];
                        }
                    }
                }
                else {
                    for (int n45 = 0; n45 < Class6733.method20477(this.field7398); n45 += 8) {
                        for (int n46 = 0; n46 < Class6733.method20474(this.field7398); ++n46) {
                            final int n47 = n28 + n46 * Class6733.method20475(this.field7398) + n45;
                            final int n48 = 2 * n46;
                            final int n49 = 2 * Class6733.method20474(this.field7398) + 2 * n46;
                            final int n50 = n49 + 2 * Class6733.method20474(this.field7398);
                            final int n51 = n50 + 2 * Class6733.method20474(this.field7398);
                            array[n48] = this.field7396[n47];
                            array[n48 + 1] = this.field7396[n47 + 1];
                            array[n49] = this.field7396[n47 + 2];
                            array[n49 + 1] = this.field7396[n47 + 3];
                            array[n50] = this.field7396[n47 + 4];
                            array[n50 + 1] = this.field7396[n47 + 5];
                            array[n51] = this.field7396[n47 + 6];
                            array[n51 + 1] = this.field7396[n47 + 7];
                        }
                        Class6733.method20478(this.field7398).method26074(array, 0);
                        Class6733.method20478(this.field7398).method26074(array, 2 * Class6733.method20474(this.field7398));
                        Class6733.method20478(this.field7398).method26074(array, 4 * Class6733.method20474(this.field7398));
                        Class6733.method20478(this.field7398).method26074(array, 6 * Class6733.method20474(this.field7398));
                        for (int n52 = 0; n52 < Class6733.method20474(this.field7398); ++n52) {
                            final int n53 = n28 + n52 * Class6733.method20475(this.field7398) + n45;
                            final int n54 = 2 * n52;
                            final int n55 = 2 * Class6733.method20474(this.field7398) + 2 * n52;
                            final int n56 = n55 + 2 * Class6733.method20474(this.field7398);
                            final int n57 = n56 + 2 * Class6733.method20474(this.field7398);
                            this.field7396[n53] = array[n54];
                            this.field7396[n53 + 1] = array[n54 + 1];
                            this.field7396[n53 + 2] = array[n55];
                            this.field7396[n53 + 3] = array[n55 + 1];
                            this.field7396[n53 + 4] = array[n56];
                            this.field7396[n53 + 5] = array[n56 + 1];
                            this.field7396[n53 + 6] = array[n57];
                            this.field7396[n53 + 7] = array[n57 + 1];
                        }
                    }
                }
            }
        }
    }
}
