// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1008 implements Runnable
{
    private static String[] field5379;
    public final /* synthetic */ int field5380;
    public final /* synthetic */ int field5381;
    public final /* synthetic */ int field5382;
    public final /* synthetic */ int field5383;
    public final /* synthetic */ int field5384;
    public final /* synthetic */ float[][][] field5385;
    public final /* synthetic */ boolean field5386;
    public final /* synthetic */ Class6362 field5387;
    
    public Class1008(final Class6362 field5387, final int field5388, final int field5389, final int field5390, final int field5391, final int field5392, final float[][][] field5393, final boolean field5394) {
        this.field5387 = field5387;
        this.field5380 = field5388;
        this.field5381 = field5389;
        this.field5382 = field5390;
        this.field5383 = field5391;
        this.field5384 = field5392;
        this.field5385 = field5393;
        this.field5386 = field5394;
    }
    
    @Override
    public void run() {
        final float[] array = new float[this.field5380];
        if (this.field5381 != -1) {
            for (int i = this.field5382; i < Class6362.method19003(this.field5387); i += this.field5383) {
                if (this.field5384 == 0) {
                    for (int j = 0; j < Class6362.method18998(this.field5387); ++j) {
                        Class6362.method19000(this.field5387).method25929(this.field5385[i][j], this.field5386);
                    }
                }
                if (Class6362.method19001(this.field5387) <= 4) {
                    if (Class6362.method19001(this.field5387) != 4) {
                        if (Class6362.method19001(this.field5387) == 2) {
                            for (int k = 0; k < Class6362.method18998(this.field5387); ++k) {
                                final int n = 2 * k;
                                array[n] = this.field5385[i][k][0];
                                array[n + 1] = this.field5385[i][k][1];
                            }
                            Class6362.method19002(this.field5387).method25931(array, 0, this.field5386);
                            for (int l = 0; l < Class6362.method18998(this.field5387); ++l) {
                                final int n2 = 2 * l;
                                this.field5385[i][l][0] = array[n2];
                                this.field5385[i][l][1] = array[n2 + 1];
                            }
                        }
                    }
                    else {
                        for (int n3 = 0; n3 < Class6362.method18998(this.field5387); ++n3) {
                            final int n4 = 2 * n3;
                            final int n5 = 2 * Class6362.method18998(this.field5387) + 2 * n3;
                            array[n4] = this.field5385[i][n3][0];
                            array[n4 + 1] = this.field5385[i][n3][1];
                            array[n5] = this.field5385[i][n3][2];
                            array[n5 + 1] = this.field5385[i][n3][3];
                        }
                        Class6362.method19002(this.field5387).method25931(array, 0, this.field5386);
                        Class6362.method19002(this.field5387).method25931(array, 2 * Class6362.method18998(this.field5387), this.field5386);
                        for (int n6 = 0; n6 < Class6362.method18998(this.field5387); ++n6) {
                            final int n7 = 2 * n6;
                            final int n8 = 2 * Class6362.method18998(this.field5387) + 2 * n6;
                            this.field5385[i][n6][0] = array[n7];
                            this.field5385[i][n6][1] = array[n7 + 1];
                            this.field5385[i][n6][2] = array[n8];
                            this.field5385[i][n6][3] = array[n8 + 1];
                        }
                    }
                }
                else {
                    for (int n9 = 0; n9 < Class6362.method19001(this.field5387); n9 += 8) {
                        for (int n10 = 0; n10 < Class6362.method18998(this.field5387); ++n10) {
                            final int n11 = 2 * n10;
                            final int n12 = 2 * Class6362.method18998(this.field5387) + 2 * n10;
                            final int n13 = n12 + 2 * Class6362.method18998(this.field5387);
                            final int n14 = n13 + 2 * Class6362.method18998(this.field5387);
                            array[n11] = this.field5385[i][n10][n9];
                            array[n11 + 1] = this.field5385[i][n10][n9 + 1];
                            array[n12] = this.field5385[i][n10][n9 + 2];
                            array[n12 + 1] = this.field5385[i][n10][n9 + 3];
                            array[n13] = this.field5385[i][n10][n9 + 4];
                            array[n13 + 1] = this.field5385[i][n10][n9 + 5];
                            array[n14] = this.field5385[i][n10][n9 + 6];
                            array[n14 + 1] = this.field5385[i][n10][n9 + 7];
                        }
                        Class6362.method19002(this.field5387).method25931(array, 0, this.field5386);
                        Class6362.method19002(this.field5387).method25931(array, 2 * Class6362.method18998(this.field5387), this.field5386);
                        Class6362.method19002(this.field5387).method25931(array, 4 * Class6362.method18998(this.field5387), this.field5386);
                        Class6362.method19002(this.field5387).method25931(array, 6 * Class6362.method18998(this.field5387), this.field5386);
                        for (int n15 = 0; n15 < Class6362.method18998(this.field5387); ++n15) {
                            final int n16 = 2 * n15;
                            final int n17 = 2 * Class6362.method18998(this.field5387) + 2 * n15;
                            final int n18 = n17 + 2 * Class6362.method18998(this.field5387);
                            final int n19 = n18 + 2 * Class6362.method18998(this.field5387);
                            this.field5385[i][n15][n9] = array[n16];
                            this.field5385[i][n15][n9 + 1] = array[n16 + 1];
                            this.field5385[i][n15][n9 + 2] = array[n17];
                            this.field5385[i][n15][n9 + 3] = array[n17 + 1];
                            this.field5385[i][n15][n9 + 4] = array[n18];
                            this.field5385[i][n15][n9 + 5] = array[n18 + 1];
                            this.field5385[i][n15][n9 + 6] = array[n19];
                            this.field5385[i][n15][n9 + 7] = array[n19 + 1];
                        }
                    }
                }
                if (this.field5384 != 0) {
                    for (int n20 = 0; n20 < Class6362.method18998(this.field5387); ++n20) {
                        Class6362.method19000(this.field5387).method25941(this.field5385[i][n20], this.field5386);
                    }
                }
            }
        }
        else {
            for (int field5382 = this.field5382; field5382 < Class6362.method19003(this.field5387); field5382 += this.field5383) {
                if (this.field5384 != 0) {
                    for (int n21 = 0; n21 < Class6362.method18998(this.field5387); ++n21) {
                        Class6362.method19000(this.field5387).method25935(this.field5385[field5382][n21], 0);
                    }
                }
                else {
                    for (int n22 = 0; n22 < Class6362.method18998(this.field5387); ++n22) {
                        Class6362.method19000(this.field5387).method25925(this.field5385[field5382][n22]);
                    }
                }
                if (Class6362.method19001(this.field5387) <= 4) {
                    if (Class6362.method19001(this.field5387) != 4) {
                        if (Class6362.method19001(this.field5387) == 2) {
                            for (int n23 = 0; n23 < Class6362.method18998(this.field5387); ++n23) {
                                final int n24 = 2 * n23;
                                array[n24] = this.field5385[field5382][n23][0];
                                array[n24 + 1] = this.field5385[field5382][n23][1];
                            }
                            Class6362.method19002(this.field5387).method25927(array, 0);
                            for (int n25 = 0; n25 < Class6362.method18998(this.field5387); ++n25) {
                                final int n26 = 2 * n25;
                                this.field5385[field5382][n25][0] = array[n26];
                                this.field5385[field5382][n25][1] = array[n26 + 1];
                            }
                        }
                    }
                    else {
                        for (int n27 = 0; n27 < Class6362.method18998(this.field5387); ++n27) {
                            final int n28 = 2 * n27;
                            final int n29 = 2 * Class6362.method18998(this.field5387) + 2 * n27;
                            array[n28] = this.field5385[field5382][n27][0];
                            array[n28 + 1] = this.field5385[field5382][n27][1];
                            array[n29] = this.field5385[field5382][n27][2];
                            array[n29 + 1] = this.field5385[field5382][n27][3];
                        }
                        Class6362.method19002(this.field5387).method25927(array, 0);
                        Class6362.method19002(this.field5387).method25927(array, 2 * Class6362.method18998(this.field5387));
                        for (int n30 = 0; n30 < Class6362.method18998(this.field5387); ++n30) {
                            final int n31 = 2 * n30;
                            final int n32 = 2 * Class6362.method18998(this.field5387) + 2 * n30;
                            this.field5385[field5382][n30][0] = array[n31];
                            this.field5385[field5382][n30][1] = array[n31 + 1];
                            this.field5385[field5382][n30][2] = array[n32];
                            this.field5385[field5382][n30][3] = array[n32 + 1];
                        }
                    }
                }
                else {
                    for (int n33 = 0; n33 < Class6362.method19001(this.field5387); n33 += 8) {
                        for (int n34 = 0; n34 < Class6362.method18998(this.field5387); ++n34) {
                            final int n35 = 2 * n34;
                            final int n36 = 2 * Class6362.method18998(this.field5387) + 2 * n34;
                            final int n37 = n36 + 2 * Class6362.method18998(this.field5387);
                            final int n38 = n37 + 2 * Class6362.method18998(this.field5387);
                            array[n35] = this.field5385[field5382][n34][n33];
                            array[n35 + 1] = this.field5385[field5382][n34][n33 + 1];
                            array[n36] = this.field5385[field5382][n34][n33 + 2];
                            array[n36 + 1] = this.field5385[field5382][n34][n33 + 3];
                            array[n37] = this.field5385[field5382][n34][n33 + 4];
                            array[n37 + 1] = this.field5385[field5382][n34][n33 + 5];
                            array[n38] = this.field5385[field5382][n34][n33 + 6];
                            array[n38 + 1] = this.field5385[field5382][n34][n33 + 7];
                        }
                        Class6362.method19002(this.field5387).method25927(array, 0);
                        Class6362.method19002(this.field5387).method25927(array, 2 * Class6362.method18998(this.field5387));
                        Class6362.method19002(this.field5387).method25927(array, 4 * Class6362.method18998(this.field5387));
                        Class6362.method19002(this.field5387).method25927(array, 6 * Class6362.method18998(this.field5387));
                        for (int n39 = 0; n39 < Class6362.method18998(this.field5387); ++n39) {
                            final int n40 = 2 * n39;
                            final int n41 = 2 * Class6362.method18998(this.field5387) + 2 * n39;
                            final int n42 = n41 + 2 * Class6362.method18998(this.field5387);
                            final int n43 = n42 + 2 * Class6362.method18998(this.field5387);
                            this.field5385[field5382][n39][n33] = array[n40];
                            this.field5385[field5382][n39][n33 + 1] = array[n40 + 1];
                            this.field5385[field5382][n39][n33 + 2] = array[n41];
                            this.field5385[field5382][n39][n33 + 3] = array[n41 + 1];
                            this.field5385[field5382][n39][n33 + 4] = array[n42];
                            this.field5385[field5382][n39][n33 + 5] = array[n42 + 1];
                            this.field5385[field5382][n39][n33 + 6] = array[n43];
                            this.field5385[field5382][n39][n33 + 7] = array[n43 + 1];
                        }
                    }
                }
            }
        }
    }
}
