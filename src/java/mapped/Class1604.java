// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1604 implements Runnable
{
    private static String[] field8960;
    public final /* synthetic */ int field8961;
    public final /* synthetic */ int field8962;
    public final /* synthetic */ int field8963;
    public final /* synthetic */ int field8964;
    public final /* synthetic */ double[][][] field8965;
    public final /* synthetic */ boolean field8966;
    public final /* synthetic */ Class6733 field8967;
    
    public Class1604(final Class6733 field8967, final int field8968, final int field8969, final int field8970, final int field8971, final double[][][] field8972, final boolean field8973) {
        this.field8967 = field8967;
        this.field8961 = field8968;
        this.field8962 = field8969;
        this.field8963 = field8970;
        this.field8964 = field8971;
        this.field8965 = field8972;
        this.field8966 = field8973;
    }
    
    @Override
    public void run() {
        final double[] array = new double[this.field8961];
        if (this.field8962 != -1) {
            if (Class6733.method20477(this.field8967) <= 4) {
                if (Class6733.method20477(this.field8967) != 4) {
                    if (Class6733.method20477(this.field8967) == 2) {
                        for (int i = this.field8963; i < Class6733.method20474(this.field8967); i += this.field8964) {
                            for (int j = 0; j < Class6733.method20479(this.field8967); ++j) {
                                final int n = 2 * j;
                                array[n] = this.field8965[j][i][0];
                                array[n + 1] = this.field8965[j][i][1];
                            }
                            Class6733.method20480(this.field8967).method26078(array, 0, this.field8966);
                            for (int k = 0; k < Class6733.method20479(this.field8967); ++k) {
                                final int n2 = 2 * k;
                                this.field8965[k][i][0] = array[n2];
                                this.field8965[k][i][1] = array[n2 + 1];
                            }
                        }
                    }
                }
                else {
                    for (int l = this.field8963; l < Class6733.method20474(this.field8967); l += this.field8964) {
                        for (int n3 = 0; n3 < Class6733.method20479(this.field8967); ++n3) {
                            final int n4 = 2 * n3;
                            final int n5 = 2 * Class6733.method20479(this.field8967) + 2 * n3;
                            array[n4] = this.field8965[n3][l][0];
                            array[n4 + 1] = this.field8965[n3][l][1];
                            array[n5] = this.field8965[n3][l][2];
                            array[n5 + 1] = this.field8965[n3][l][3];
                        }
                        Class6733.method20480(this.field8967).method26078(array, 0, this.field8966);
                        Class6733.method20480(this.field8967).method26078(array, 2 * Class6733.method20479(this.field8967), this.field8966);
                        for (int n6 = 0; n6 < Class6733.method20479(this.field8967); ++n6) {
                            final int n7 = 2 * n6;
                            final int n8 = 2 * Class6733.method20479(this.field8967) + 2 * n6;
                            this.field8965[n6][l][0] = array[n7];
                            this.field8965[n6][l][1] = array[n7 + 1];
                            this.field8965[n6][l][2] = array[n8];
                            this.field8965[n6][l][3] = array[n8 + 1];
                        }
                    }
                }
            }
            else {
                for (int field8963 = this.field8963; field8963 < Class6733.method20474(this.field8967); field8963 += this.field8964) {
                    for (int n9 = 0; n9 < Class6733.method20477(this.field8967); n9 += 8) {
                        for (int n10 = 0; n10 < Class6733.method20479(this.field8967); ++n10) {
                            final int n11 = 2 * n10;
                            final int n12 = 2 * Class6733.method20479(this.field8967) + 2 * n10;
                            final int n13 = n12 + 2 * Class6733.method20479(this.field8967);
                            final int n14 = n13 + 2 * Class6733.method20479(this.field8967);
                            array[n11] = this.field8965[n10][field8963][n9];
                            array[n11 + 1] = this.field8965[n10][field8963][n9 + 1];
                            array[n12] = this.field8965[n10][field8963][n9 + 2];
                            array[n12 + 1] = this.field8965[n10][field8963][n9 + 3];
                            array[n13] = this.field8965[n10][field8963][n9 + 4];
                            array[n13 + 1] = this.field8965[n10][field8963][n9 + 5];
                            array[n14] = this.field8965[n10][field8963][n9 + 6];
                            array[n14 + 1] = this.field8965[n10][field8963][n9 + 7];
                        }
                        Class6733.method20480(this.field8967).method26078(array, 0, this.field8966);
                        Class6733.method20480(this.field8967).method26078(array, 2 * Class6733.method20479(this.field8967), this.field8966);
                        Class6733.method20480(this.field8967).method26078(array, 4 * Class6733.method20479(this.field8967), this.field8966);
                        Class6733.method20480(this.field8967).method26078(array, 6 * Class6733.method20479(this.field8967), this.field8966);
                        for (int n15 = 0; n15 < Class6733.method20479(this.field8967); ++n15) {
                            final int n16 = 2 * n15;
                            final int n17 = 2 * Class6733.method20479(this.field8967) + 2 * n15;
                            final int n18 = n17 + 2 * Class6733.method20479(this.field8967);
                            final int n19 = n18 + 2 * Class6733.method20479(this.field8967);
                            this.field8965[n15][field8963][n9] = array[n16];
                            this.field8965[n15][field8963][n9 + 1] = array[n16 + 1];
                            this.field8965[n15][field8963][n9 + 2] = array[n17];
                            this.field8965[n15][field8963][n9 + 3] = array[n17 + 1];
                            this.field8965[n15][field8963][n9 + 4] = array[n18];
                            this.field8965[n15][field8963][n9 + 5] = array[n18 + 1];
                            this.field8965[n15][field8963][n9 + 6] = array[n19];
                            this.field8965[n15][field8963][n9 + 7] = array[n19 + 1];
                        }
                    }
                }
            }
        }
        else if (Class6733.method20477(this.field8967) <= 4) {
            if (Class6733.method20477(this.field8967) != 4) {
                if (Class6733.method20477(this.field8967) == 2) {
                    for (int field8964 = this.field8963; field8964 < Class6733.method20474(this.field8967); field8964 += this.field8964) {
                        for (int n20 = 0; n20 < Class6733.method20479(this.field8967); ++n20) {
                            final int n21 = 2 * n20;
                            array[n21] = this.field8965[n20][field8964][0];
                            array[n21 + 1] = this.field8965[n20][field8964][1];
                        }
                        Class6733.method20480(this.field8967).method26074(array, 0);
                        for (int n22 = 0; n22 < Class6733.method20479(this.field8967); ++n22) {
                            final int n23 = 2 * n22;
                            this.field8965[n22][field8964][0] = array[n23];
                            this.field8965[n22][field8964][1] = array[n23 + 1];
                        }
                    }
                }
            }
            else {
                for (int field8965 = this.field8963; field8965 < Class6733.method20474(this.field8967); field8965 += this.field8964) {
                    for (int n24 = 0; n24 < Class6733.method20479(this.field8967); ++n24) {
                        final int n25 = 2 * n24;
                        final int n26 = 2 * Class6733.method20479(this.field8967) + 2 * n24;
                        array[n25] = this.field8965[n24][field8965][0];
                        array[n25 + 1] = this.field8965[n24][field8965][1];
                        array[n26] = this.field8965[n24][field8965][2];
                        array[n26 + 1] = this.field8965[n24][field8965][3];
                    }
                    Class6733.method20480(this.field8967).method26074(array, 0);
                    Class6733.method20480(this.field8967).method26074(array, 2 * Class6733.method20479(this.field8967));
                    for (int n27 = 0; n27 < Class6733.method20479(this.field8967); ++n27) {
                        final int n28 = 2 * n27;
                        final int n29 = 2 * Class6733.method20479(this.field8967) + 2 * n27;
                        this.field8965[n27][field8965][0] = array[n28];
                        this.field8965[n27][field8965][1] = array[n28 + 1];
                        this.field8965[n27][field8965][2] = array[n29];
                        this.field8965[n27][field8965][3] = array[n29 + 1];
                    }
                }
            }
        }
        else {
            for (int field8966 = this.field8963; field8966 < Class6733.method20474(this.field8967); field8966 += this.field8964) {
                for (int n30 = 0; n30 < Class6733.method20477(this.field8967); n30 += 8) {
                    for (int n31 = 0; n31 < Class6733.method20479(this.field8967); ++n31) {
                        final int n32 = 2 * n31;
                        final int n33 = 2 * Class6733.method20479(this.field8967) + 2 * n31;
                        final int n34 = n33 + 2 * Class6733.method20479(this.field8967);
                        final int n35 = n34 + 2 * Class6733.method20479(this.field8967);
                        array[n32] = this.field8965[n31][field8966][n30];
                        array[n32 + 1] = this.field8965[n31][field8966][n30 + 1];
                        array[n33] = this.field8965[n31][field8966][n30 + 2];
                        array[n33 + 1] = this.field8965[n31][field8966][n30 + 3];
                        array[n34] = this.field8965[n31][field8966][n30 + 4];
                        array[n34 + 1] = this.field8965[n31][field8966][n30 + 5];
                        array[n35] = this.field8965[n31][field8966][n30 + 6];
                        array[n35 + 1] = this.field8965[n31][field8966][n30 + 7];
                    }
                    Class6733.method20480(this.field8967).method26074(array, 0);
                    Class6733.method20480(this.field8967).method26074(array, 2 * Class6733.method20479(this.field8967));
                    Class6733.method20480(this.field8967).method26074(array, 4 * Class6733.method20479(this.field8967));
                    Class6733.method20480(this.field8967).method26074(array, 6 * Class6733.method20479(this.field8967));
                    for (int n36 = 0; n36 < Class6733.method20479(this.field8967); ++n36) {
                        final int n37 = 2 * n36;
                        final int n38 = 2 * Class6733.method20479(this.field8967) + 2 * n36;
                        final int n39 = n38 + 2 * Class6733.method20479(this.field8967);
                        final int n40 = n39 + 2 * Class6733.method20479(this.field8967);
                        this.field8965[n36][field8966][n30] = array[n37];
                        this.field8965[n36][field8966][n30 + 1] = array[n37 + 1];
                        this.field8965[n36][field8966][n30 + 2] = array[n38];
                        this.field8965[n36][field8966][n30 + 3] = array[n38 + 1];
                        this.field8965[n36][field8966][n30 + 4] = array[n39];
                        this.field8965[n36][field8966][n30 + 5] = array[n39 + 1];
                        this.field8965[n36][field8966][n30 + 6] = array[n40];
                        this.field8965[n36][field8966][n30 + 7] = array[n40 + 1];
                    }
                }
            }
        }
    }
}
