// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class965 implements Runnable
{
    private static String[] field5133;
    public final /* synthetic */ int field5134;
    public final /* synthetic */ int field5135;
    public final /* synthetic */ int field5136;
    public final /* synthetic */ int field5137;
    public final /* synthetic */ int field5138;
    public final /* synthetic */ double[] field5139;
    public final /* synthetic */ boolean field5140;
    public final /* synthetic */ Class6733 field5141;
    
    public Class965(final Class6733 field5141, final int field5142, final int field5143, final int field5144, final int field5145, final int field5146, final double[] field5147, final boolean field5148) {
        this.field5141 = field5141;
        this.field5134 = field5142;
        this.field5135 = field5143;
        this.field5136 = field5144;
        this.field5137 = field5145;
        this.field5138 = field5146;
        this.field5139 = field5147;
        this.field5140 = field5148;
    }
    
    @Override
    public void run() {
        final double[] array = new double[this.field5134];
        if (this.field5135 != -1) {
            for (int i = this.field5136; i < Class6733.method20479(this.field5141); i += this.field5137) {
                final int n = i * Class6733.method20473(this.field5141);
                if (this.field5138 != 0) {
                    for (int j = 0; j < Class6733.method20474(this.field5141); ++j) {
                        Class6733.method20476(this.field5141).method26096(this.field5139, n + j * Class6733.method20475(this.field5141), this.field5140);
                    }
                }
                else {
                    for (int k = 0; k < Class6733.method20474(this.field5141); ++k) {
                        Class6733.method20476(this.field5141).method26078(this.field5139, n + k * Class6733.method20475(this.field5141), this.field5140);
                    }
                }
                if (Class6733.method20477(this.field5141) <= 4) {
                    if (Class6733.method20477(this.field5141) != 4) {
                        if (Class6733.method20477(this.field5141) == 2) {
                            for (int l = 0; l < Class6733.method20474(this.field5141); ++l) {
                                final int n2 = n + l * Class6733.method20475(this.field5141);
                                final int n3 = 2 * l;
                                array[n3] = this.field5139[n2];
                                array[n3 + 1] = this.field5139[n2 + 1];
                            }
                            Class6733.method20478(this.field5141).method26078(array, 0, this.field5140);
                            for (int n4 = 0; n4 < Class6733.method20474(this.field5141); ++n4) {
                                final int n5 = n + n4 * Class6733.method20475(this.field5141);
                                final int n6 = 2 * n4;
                                this.field5139[n5] = array[n6];
                                this.field5139[n5 + 1] = array[n6 + 1];
                            }
                        }
                    }
                    else {
                        for (int n7 = 0; n7 < Class6733.method20474(this.field5141); ++n7) {
                            final int n8 = n + n7 * Class6733.method20475(this.field5141);
                            final int n9 = 2 * n7;
                            final int n10 = 2 * Class6733.method20474(this.field5141) + 2 * n7;
                            array[n9] = this.field5139[n8];
                            array[n9 + 1] = this.field5139[n8 + 1];
                            array[n10] = this.field5139[n8 + 2];
                            array[n10 + 1] = this.field5139[n8 + 3];
                        }
                        Class6733.method20478(this.field5141).method26078(array, 0, this.field5140);
                        Class6733.method20478(this.field5141).method26078(array, 2 * Class6733.method20474(this.field5141), this.field5140);
                        for (int n11 = 0; n11 < Class6733.method20474(this.field5141); ++n11) {
                            final int n12 = n + n11 * Class6733.method20475(this.field5141);
                            final int n13 = 2 * n11;
                            final int n14 = 2 * Class6733.method20474(this.field5141) + 2 * n11;
                            this.field5139[n12] = array[n13];
                            this.field5139[n12 + 1] = array[n13 + 1];
                            this.field5139[n12 + 2] = array[n14];
                            this.field5139[n12 + 3] = array[n14 + 1];
                        }
                    }
                }
                else {
                    for (int n15 = 0; n15 < Class6733.method20477(this.field5141); n15 += 8) {
                        for (int n16 = 0; n16 < Class6733.method20474(this.field5141); ++n16) {
                            final int n17 = n + n16 * Class6733.method20475(this.field5141) + n15;
                            final int n18 = 2 * n16;
                            final int n19 = 2 * Class6733.method20474(this.field5141) + 2 * n16;
                            final int n20 = n19 + 2 * Class6733.method20474(this.field5141);
                            final int n21 = n20 + 2 * Class6733.method20474(this.field5141);
                            array[n18] = this.field5139[n17];
                            array[n18 + 1] = this.field5139[n17 + 1];
                            array[n19] = this.field5139[n17 + 2];
                            array[n19 + 1] = this.field5139[n17 + 3];
                            array[n20] = this.field5139[n17 + 4];
                            array[n20 + 1] = this.field5139[n17 + 5];
                            array[n21] = this.field5139[n17 + 6];
                            array[n21 + 1] = this.field5139[n17 + 7];
                        }
                        Class6733.method20478(this.field5141).method26078(array, 0, this.field5140);
                        Class6733.method20478(this.field5141).method26078(array, 2 * Class6733.method20474(this.field5141), this.field5140);
                        Class6733.method20478(this.field5141).method26078(array, 4 * Class6733.method20474(this.field5141), this.field5140);
                        Class6733.method20478(this.field5141).method26078(array, 6 * Class6733.method20474(this.field5141), this.field5140);
                        for (int n22 = 0; n22 < Class6733.method20474(this.field5141); ++n22) {
                            final int n23 = n + n22 * Class6733.method20475(this.field5141) + n15;
                            final int n24 = 2 * n22;
                            final int n25 = 2 * Class6733.method20474(this.field5141) + 2 * n22;
                            final int n26 = n25 + 2 * Class6733.method20474(this.field5141);
                            final int n27 = n26 + 2 * Class6733.method20474(this.field5141);
                            this.field5139[n23] = array[n24];
                            this.field5139[n23 + 1] = array[n24 + 1];
                            this.field5139[n23 + 2] = array[n25];
                            this.field5139[n23 + 3] = array[n25 + 1];
                            this.field5139[n23 + 4] = array[n26];
                            this.field5139[n23 + 5] = array[n26 + 1];
                            this.field5139[n23 + 6] = array[n27];
                            this.field5139[n23 + 7] = array[n27 + 1];
                        }
                    }
                }
            }
        }
        else {
            for (int field5136 = this.field5136; field5136 < Class6733.method20479(this.field5141); field5136 += this.field5137) {
                final int n28 = field5136 * Class6733.method20473(this.field5141);
                if (this.field5138 != 0) {
                    for (int n29 = 0; n29 < Class6733.method20474(this.field5141); ++n29) {
                        Class6733.method20476(this.field5141).method26082(this.field5139, n28 + n29 * Class6733.method20475(this.field5141));
                    }
                }
                else {
                    for (int n30 = 0; n30 < Class6733.method20474(this.field5141); ++n30) {
                        Class6733.method20476(this.field5141).method26074(this.field5139, n28 + n30 * Class6733.method20475(this.field5141));
                    }
                }
                if (Class6733.method20477(this.field5141) <= 4) {
                    if (Class6733.method20477(this.field5141) != 4) {
                        if (Class6733.method20477(this.field5141) == 2) {
                            for (int n31 = 0; n31 < Class6733.method20474(this.field5141); ++n31) {
                                final int n32 = n28 + n31 * Class6733.method20475(this.field5141);
                                final int n33 = 2 * n31;
                                array[n33] = this.field5139[n32];
                                array[n33 + 1] = this.field5139[n32 + 1];
                            }
                            Class6733.method20478(this.field5141).method26074(array, 0);
                            for (int n34 = 0; n34 < Class6733.method20474(this.field5141); ++n34) {
                                final int n35 = n28 + n34 * Class6733.method20475(this.field5141);
                                final int n36 = 2 * n34;
                                this.field5139[n35] = array[n36];
                                this.field5139[n35 + 1] = array[n36 + 1];
                            }
                        }
                    }
                    else {
                        for (int n37 = 0; n37 < Class6733.method20474(this.field5141); ++n37) {
                            final int n38 = n28 + n37 * Class6733.method20475(this.field5141);
                            final int n39 = 2 * n37;
                            final int n40 = 2 * Class6733.method20474(this.field5141) + 2 * n37;
                            array[n39] = this.field5139[n38];
                            array[n39 + 1] = this.field5139[n38 + 1];
                            array[n40] = this.field5139[n38 + 2];
                            array[n40 + 1] = this.field5139[n38 + 3];
                        }
                        Class6733.method20478(this.field5141).method26074(array, 0);
                        Class6733.method20478(this.field5141).method26074(array, 2 * Class6733.method20474(this.field5141));
                        for (int n41 = 0; n41 < Class6733.method20474(this.field5141); ++n41) {
                            final int n42 = n28 + n41 * Class6733.method20475(this.field5141);
                            final int n43 = 2 * n41;
                            final int n44 = 2 * Class6733.method20474(this.field5141) + 2 * n41;
                            this.field5139[n42] = array[n43];
                            this.field5139[n42 + 1] = array[n43 + 1];
                            this.field5139[n42 + 2] = array[n44];
                            this.field5139[n42 + 3] = array[n44 + 1];
                        }
                    }
                }
                else {
                    for (int n45 = 0; n45 < Class6733.method20477(this.field5141); n45 += 8) {
                        for (int n46 = 0; n46 < Class6733.method20474(this.field5141); ++n46) {
                            final int n47 = n28 + n46 * Class6733.method20475(this.field5141) + n45;
                            final int n48 = 2 * n46;
                            final int n49 = 2 * Class6733.method20474(this.field5141) + 2 * n46;
                            final int n50 = n49 + 2 * Class6733.method20474(this.field5141);
                            final int n51 = n50 + 2 * Class6733.method20474(this.field5141);
                            array[n48] = this.field5139[n47];
                            array[n48 + 1] = this.field5139[n47 + 1];
                            array[n49] = this.field5139[n47 + 2];
                            array[n49 + 1] = this.field5139[n47 + 3];
                            array[n50] = this.field5139[n47 + 4];
                            array[n50 + 1] = this.field5139[n47 + 5];
                            array[n51] = this.field5139[n47 + 6];
                            array[n51 + 1] = this.field5139[n47 + 7];
                        }
                        Class6733.method20478(this.field5141).method26074(array, 0);
                        Class6733.method20478(this.field5141).method26074(array, 2 * Class6733.method20474(this.field5141));
                        Class6733.method20478(this.field5141).method26074(array, 4 * Class6733.method20474(this.field5141));
                        Class6733.method20478(this.field5141).method26074(array, 6 * Class6733.method20474(this.field5141));
                        for (int n52 = 0; n52 < Class6733.method20474(this.field5141); ++n52) {
                            final int n53 = n28 + n52 * Class6733.method20475(this.field5141) + n45;
                            final int n54 = 2 * n52;
                            final int n55 = 2 * Class6733.method20474(this.field5141) + 2 * n52;
                            final int n56 = n55 + 2 * Class6733.method20474(this.field5141);
                            final int n57 = n56 + 2 * Class6733.method20474(this.field5141);
                            this.field5139[n53] = array[n54];
                            this.field5139[n53 + 1] = array[n54 + 1];
                            this.field5139[n53 + 2] = array[n55];
                            this.field5139[n53 + 3] = array[n55 + 1];
                            this.field5139[n53 + 4] = array[n56];
                            this.field5139[n53 + 5] = array[n56 + 1];
                            this.field5139[n53 + 6] = array[n57];
                            this.field5139[n53 + 7] = array[n57 + 1];
                        }
                    }
                }
            }
        }
    }
}
