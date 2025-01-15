// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1076 implements Runnable
{
    private static String[] field5790;
    public final /* synthetic */ int field5791;
    public final /* synthetic */ int field5792;
    public final /* synthetic */ int field5793;
    public final /* synthetic */ int field5794;
    public final /* synthetic */ double[][] field5795;
    public final /* synthetic */ boolean field5796;
    public final /* synthetic */ Class8983 field5797;
    
    public Class1076(final Class8983 field5797, final int field5798, final int field5799, final int field5800, final int field5801, final double[][] field5802, final boolean field5803) {
        this.field5797 = field5797;
        this.field5791 = field5798;
        this.field5792 = field5799;
        this.field5793 = field5800;
        this.field5794 = field5801;
        this.field5795 = field5802;
        this.field5796 = field5803;
    }
    
    @Override
    public void run() {
        final double[] array = new double[this.field5791];
        if (this.field5792 != -1) {
            if (Class8983.method31979(this.field5797) <= 4 * this.field5793) {
                if (Class8983.method31979(this.field5797) != 4 * this.field5793) {
                    if (Class8983.method31979(this.field5797) == 2 * this.field5793) {
                        for (int i = 0; i < Class8983.method31976(this.field5797); ++i) {
                            final int n = 2 * i;
                            array[n] = this.field5795[i][2 * this.field5794];
                            array[n + 1] = this.field5795[i][2 * this.field5794 + 1];
                        }
                        Class8983.method31977(this.field5797).method26078(array, 0, this.field5796);
                        for (int j = 0; j < Class8983.method31976(this.field5797); ++j) {
                            final int n2 = 2 * j;
                            this.field5795[j][2 * this.field5794] = array[n2];
                            this.field5795[j][2 * this.field5794 + 1] = array[n2 + 1];
                        }
                    }
                }
                else {
                    for (int k = 0; k < Class8983.method31976(this.field5797); ++k) {
                        final int n3 = 2 * k;
                        final int n4 = 2 * Class8983.method31976(this.field5797) + 2 * k;
                        array[n3] = this.field5795[k][4 * this.field5794];
                        array[n3 + 1] = this.field5795[k][4 * this.field5794 + 1];
                        array[n4] = this.field5795[k][4 * this.field5794 + 2];
                        array[n4 + 1] = this.field5795[k][4 * this.field5794 + 3];
                    }
                    Class8983.method31977(this.field5797).method26078(array, 0, this.field5796);
                    Class8983.method31977(this.field5797).method26078(array, 2 * Class8983.method31976(this.field5797), this.field5796);
                    for (int l = 0; l < Class8983.method31976(this.field5797); ++l) {
                        final int n5 = 2 * l;
                        final int n6 = 2 * Class8983.method31976(this.field5797) + 2 * l;
                        this.field5795[l][4 * this.field5794] = array[n5];
                        this.field5795[l][4 * this.field5794 + 1] = array[n5 + 1];
                        this.field5795[l][4 * this.field5794 + 2] = array[n6];
                        this.field5795[l][4 * this.field5794 + 3] = array[n6 + 1];
                    }
                }
            }
            else {
                for (int n7 = 8 * this.field5794; n7 < Class8983.method31979(this.field5797); n7 += 8 * this.field5793) {
                    for (int n8 = 0; n8 < Class8983.method31976(this.field5797); ++n8) {
                        final int n9 = 2 * n8;
                        final int n10 = 2 * Class8983.method31976(this.field5797) + 2 * n8;
                        final int n11 = n10 + 2 * Class8983.method31976(this.field5797);
                        final int n12 = n11 + 2 * Class8983.method31976(this.field5797);
                        array[n9] = this.field5795[n8][n7];
                        array[n9 + 1] = this.field5795[n8][n7 + 1];
                        array[n10] = this.field5795[n8][n7 + 2];
                        array[n10 + 1] = this.field5795[n8][n7 + 3];
                        array[n11] = this.field5795[n8][n7 + 4];
                        array[n11 + 1] = this.field5795[n8][n7 + 5];
                        array[n12] = this.field5795[n8][n7 + 6];
                        array[n12 + 1] = this.field5795[n8][n7 + 7];
                    }
                    Class8983.method31977(this.field5797).method26078(array, 0, this.field5796);
                    Class8983.method31977(this.field5797).method26078(array, 2 * Class8983.method31976(this.field5797), this.field5796);
                    Class8983.method31977(this.field5797).method26078(array, 4 * Class8983.method31976(this.field5797), this.field5796);
                    Class8983.method31977(this.field5797).method26078(array, 6 * Class8983.method31976(this.field5797), this.field5796);
                    for (int n13 = 0; n13 < Class8983.method31976(this.field5797); ++n13) {
                        final int n14 = 2 * n13;
                        final int n15 = 2 * Class8983.method31976(this.field5797) + 2 * n13;
                        final int n16 = n15 + 2 * Class8983.method31976(this.field5797);
                        final int n17 = n16 + 2 * Class8983.method31976(this.field5797);
                        this.field5795[n13][n7] = array[n14];
                        this.field5795[n13][n7 + 1] = array[n14 + 1];
                        this.field5795[n13][n7 + 2] = array[n15];
                        this.field5795[n13][n7 + 3] = array[n15 + 1];
                        this.field5795[n13][n7 + 4] = array[n16];
                        this.field5795[n13][n7 + 5] = array[n16 + 1];
                        this.field5795[n13][n7 + 6] = array[n17];
                        this.field5795[n13][n7 + 7] = array[n17 + 1];
                    }
                }
            }
        }
        else if (Class8983.method31979(this.field5797) <= 4 * this.field5793) {
            if (Class8983.method31979(this.field5797) != 4 * this.field5793) {
                if (Class8983.method31979(this.field5797) == 2 * this.field5793) {
                    for (int n18 = 0; n18 < Class8983.method31976(this.field5797); ++n18) {
                        final int n19 = 2 * n18;
                        array[n19] = this.field5795[n18][2 * this.field5794];
                        array[n19 + 1] = this.field5795[n18][2 * this.field5794 + 1];
                    }
                    Class8983.method31977(this.field5797).method26074(array, 0);
                    for (int n20 = 0; n20 < Class8983.method31976(this.field5797); ++n20) {
                        final int n21 = 2 * n20;
                        this.field5795[n20][2 * this.field5794] = array[n21];
                        this.field5795[n20][2 * this.field5794 + 1] = array[n21 + 1];
                    }
                }
            }
            else {
                for (int n22 = 0; n22 < Class8983.method31976(this.field5797); ++n22) {
                    final int n23 = 2 * n22;
                    final int n24 = 2 * Class8983.method31976(this.field5797) + 2 * n22;
                    array[n23] = this.field5795[n22][4 * this.field5794];
                    array[n23 + 1] = this.field5795[n22][4 * this.field5794 + 1];
                    array[n24] = this.field5795[n22][4 * this.field5794 + 2];
                    array[n24 + 1] = this.field5795[n22][4 * this.field5794 + 3];
                }
                Class8983.method31977(this.field5797).method26074(array, 0);
                Class8983.method31977(this.field5797).method26074(array, 2 * Class8983.method31976(this.field5797));
                for (int n25 = 0; n25 < Class8983.method31976(this.field5797); ++n25) {
                    final int n26 = 2 * n25;
                    final int n27 = 2 * Class8983.method31976(this.field5797) + 2 * n25;
                    this.field5795[n25][4 * this.field5794] = array[n26];
                    this.field5795[n25][4 * this.field5794 + 1] = array[n26 + 1];
                    this.field5795[n25][4 * this.field5794 + 2] = array[n27];
                    this.field5795[n25][4 * this.field5794 + 3] = array[n27 + 1];
                }
            }
        }
        else {
            for (int n28 = 8 * this.field5794; n28 < Class8983.method31979(this.field5797); n28 += 8 * this.field5793) {
                for (int n29 = 0; n29 < Class8983.method31976(this.field5797); ++n29) {
                    final int n30 = 2 * n29;
                    final int n31 = 2 * Class8983.method31976(this.field5797) + 2 * n29;
                    final int n32 = n31 + 2 * Class8983.method31976(this.field5797);
                    final int n33 = n32 + 2 * Class8983.method31976(this.field5797);
                    array[n30] = this.field5795[n29][n28];
                    array[n30 + 1] = this.field5795[n29][n28 + 1];
                    array[n31] = this.field5795[n29][n28 + 2];
                    array[n31 + 1] = this.field5795[n29][n28 + 3];
                    array[n32] = this.field5795[n29][n28 + 4];
                    array[n32 + 1] = this.field5795[n29][n28 + 5];
                    array[n33] = this.field5795[n29][n28 + 6];
                    array[n33 + 1] = this.field5795[n29][n28 + 7];
                }
                Class8983.method31977(this.field5797).method26074(array, 0);
                Class8983.method31977(this.field5797).method26074(array, 2 * Class8983.method31976(this.field5797));
                Class8983.method31977(this.field5797).method26074(array, 4 * Class8983.method31976(this.field5797));
                Class8983.method31977(this.field5797).method26074(array, 6 * Class8983.method31976(this.field5797));
                for (int n34 = 0; n34 < Class8983.method31976(this.field5797); ++n34) {
                    final int n35 = 2 * n34;
                    final int n36 = 2 * Class8983.method31976(this.field5797) + 2 * n34;
                    final int n37 = n36 + 2 * Class8983.method31976(this.field5797);
                    final int n38 = n37 + 2 * Class8983.method31976(this.field5797);
                    this.field5795[n34][n28] = array[n35];
                    this.field5795[n34][n28 + 1] = array[n35 + 1];
                    this.field5795[n34][n28 + 2] = array[n36];
                    this.field5795[n34][n28 + 3] = array[n36 + 1];
                    this.field5795[n34][n28 + 4] = array[n37];
                    this.field5795[n34][n28 + 5] = array[n37 + 1];
                    this.field5795[n34][n28 + 6] = array[n38];
                    this.field5795[n34][n28 + 7] = array[n38 + 1];
                }
            }
        }
    }
}
