// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1138 implements Runnable
{
    private static String[] field6150;
    public final /* synthetic */ int field6151;
    public final /* synthetic */ int field6152;
    public final /* synthetic */ int field6153;
    public final /* synthetic */ int field6154;
    public final /* synthetic */ int field6155;
    public final /* synthetic */ float[][][] field6156;
    public final /* synthetic */ boolean field6157;
    public final /* synthetic */ Class6362 field6158;
    
    public Class1138(final Class6362 field6158, final int field6159, final int field6160, final int field6161, final int field6162, final int field6163, final float[][][] field6164, final boolean field6165) {
        this.field6158 = field6158;
        this.field6151 = field6159;
        this.field6152 = field6160;
        this.field6153 = field6161;
        this.field6154 = field6162;
        this.field6155 = field6163;
        this.field6156 = field6164;
        this.field6157 = field6165;
    }
    
    @Override
    public void run() {
        final float[] array = new float[this.field6151];
        if (this.field6152 != -1) {
            for (int i = this.field6153; i < Class6362.method19003(this.field6158); i += this.field6154) {
                if (this.field6155 != 0) {
                    for (int j = 0; j < Class6362.method18998(this.field6158); ++j) {
                        Class6362.method19000(this.field6158).method25949(this.field6156[i][j], 0, this.field6157);
                    }
                }
                else {
                    for (int k = 0; k < Class6362.method18998(this.field6158); ++k) {
                        Class6362.method19000(this.field6158).method25929(this.field6156[i][k], this.field6157);
                    }
                }
                if (Class6362.method19001(this.field6158) <= 4) {
                    if (Class6362.method19001(this.field6158) != 4) {
                        if (Class6362.method19001(this.field6158) == 2) {
                            for (int l = 0; l < Class6362.method18998(this.field6158); ++l) {
                                final int n = 2 * l;
                                array[n] = this.field6156[i][l][0];
                                array[n + 1] = this.field6156[i][l][1];
                            }
                            Class6362.method19002(this.field6158).method25931(array, 0, this.field6157);
                            for (int n2 = 0; n2 < Class6362.method18998(this.field6158); ++n2) {
                                final int n3 = 2 * n2;
                                this.field6156[i][n2][0] = array[n3];
                                this.field6156[i][n2][1] = array[n3 + 1];
                            }
                        }
                    }
                    else {
                        for (int n4 = 0; n4 < Class6362.method18998(this.field6158); ++n4) {
                            final int n5 = 2 * n4;
                            final int n6 = 2 * Class6362.method18998(this.field6158) + 2 * n4;
                            array[n5] = this.field6156[i][n4][0];
                            array[n5 + 1] = this.field6156[i][n4][1];
                            array[n6] = this.field6156[i][n4][2];
                            array[n6 + 1] = this.field6156[i][n4][3];
                        }
                        Class6362.method19002(this.field6158).method25931(array, 0, this.field6157);
                        Class6362.method19002(this.field6158).method25931(array, 2 * Class6362.method18998(this.field6158), this.field6157);
                        for (int n7 = 0; n7 < Class6362.method18998(this.field6158); ++n7) {
                            final int n8 = 2 * n7;
                            final int n9 = 2 * Class6362.method18998(this.field6158) + 2 * n7;
                            this.field6156[i][n7][0] = array[n8];
                            this.field6156[i][n7][1] = array[n8 + 1];
                            this.field6156[i][n7][2] = array[n9];
                            this.field6156[i][n7][3] = array[n9 + 1];
                        }
                    }
                }
                else {
                    for (int n10 = 0; n10 < Class6362.method19001(this.field6158); n10 += 8) {
                        for (int n11 = 0; n11 < Class6362.method18998(this.field6158); ++n11) {
                            final int n12 = 2 * n11;
                            final int n13 = 2 * Class6362.method18998(this.field6158) + 2 * n11;
                            final int n14 = n13 + 2 * Class6362.method18998(this.field6158);
                            final int n15 = n14 + 2 * Class6362.method18998(this.field6158);
                            array[n12] = this.field6156[i][n11][n10];
                            array[n12 + 1] = this.field6156[i][n11][n10 + 1];
                            array[n13] = this.field6156[i][n11][n10 + 2];
                            array[n13 + 1] = this.field6156[i][n11][n10 + 3];
                            array[n14] = this.field6156[i][n11][n10 + 4];
                            array[n14 + 1] = this.field6156[i][n11][n10 + 5];
                            array[n15] = this.field6156[i][n11][n10 + 6];
                            array[n15 + 1] = this.field6156[i][n11][n10 + 7];
                        }
                        Class6362.method19002(this.field6158).method25931(array, 0, this.field6157);
                        Class6362.method19002(this.field6158).method25931(array, 2 * Class6362.method18998(this.field6158), this.field6157);
                        Class6362.method19002(this.field6158).method25931(array, 4 * Class6362.method18998(this.field6158), this.field6157);
                        Class6362.method19002(this.field6158).method25931(array, 6 * Class6362.method18998(this.field6158), this.field6157);
                        for (int n16 = 0; n16 < Class6362.method18998(this.field6158); ++n16) {
                            final int n17 = 2 * n16;
                            final int n18 = 2 * Class6362.method18998(this.field6158) + 2 * n16;
                            final int n19 = n18 + 2 * Class6362.method18998(this.field6158);
                            final int n20 = n19 + 2 * Class6362.method18998(this.field6158);
                            this.field6156[i][n16][n10] = array[n17];
                            this.field6156[i][n16][n10 + 1] = array[n17 + 1];
                            this.field6156[i][n16][n10 + 2] = array[n18];
                            this.field6156[i][n16][n10 + 3] = array[n18 + 1];
                            this.field6156[i][n16][n10 + 4] = array[n19];
                            this.field6156[i][n16][n10 + 5] = array[n19 + 1];
                            this.field6156[i][n16][n10 + 6] = array[n20];
                            this.field6156[i][n16][n10 + 7] = array[n20 + 1];
                        }
                    }
                }
            }
        }
        else {
            for (int field6153 = this.field6153; field6153 < Class6362.method19003(this.field6158); field6153 += this.field6154) {
                if (this.field6155 != 0) {
                    for (int n21 = 0; n21 < Class6362.method18998(this.field6158); ++n21) {
                        Class6362.method19000(this.field6158).method25933(this.field6156[field6153][n21]);
                    }
                }
                else {
                    for (int n22 = 0; n22 < Class6362.method18998(this.field6158); ++n22) {
                        Class6362.method19000(this.field6158).method25925(this.field6156[field6153][n22]);
                    }
                }
                if (Class6362.method19001(this.field6158) <= 4) {
                    if (Class6362.method19001(this.field6158) != 4) {
                        if (Class6362.method19001(this.field6158) == 2) {
                            for (int n23 = 0; n23 < Class6362.method18998(this.field6158); ++n23) {
                                final int n24 = 2 * n23;
                                array[n24] = this.field6156[field6153][n23][0];
                                array[n24 + 1] = this.field6156[field6153][n23][1];
                            }
                            Class6362.method19002(this.field6158).method25927(array, 0);
                            for (int n25 = 0; n25 < Class6362.method18998(this.field6158); ++n25) {
                                final int n26 = 2 * n25;
                                this.field6156[field6153][n25][0] = array[n26];
                                this.field6156[field6153][n25][1] = array[n26 + 1];
                            }
                        }
                    }
                    else {
                        for (int n27 = 0; n27 < Class6362.method18998(this.field6158); ++n27) {
                            final int n28 = 2 * n27;
                            final int n29 = 2 * Class6362.method18998(this.field6158) + 2 * n27;
                            array[n28] = this.field6156[field6153][n27][0];
                            array[n28 + 1] = this.field6156[field6153][n27][1];
                            array[n29] = this.field6156[field6153][n27][2];
                            array[n29 + 1] = this.field6156[field6153][n27][3];
                        }
                        Class6362.method19002(this.field6158).method25927(array, 0);
                        Class6362.method19002(this.field6158).method25927(array, 2 * Class6362.method18998(this.field6158));
                        for (int n30 = 0; n30 < Class6362.method18998(this.field6158); ++n30) {
                            final int n31 = 2 * n30;
                            final int n32 = 2 * Class6362.method18998(this.field6158) + 2 * n30;
                            this.field6156[field6153][n30][0] = array[n31];
                            this.field6156[field6153][n30][1] = array[n31 + 1];
                            this.field6156[field6153][n30][2] = array[n32];
                            this.field6156[field6153][n30][3] = array[n32 + 1];
                        }
                    }
                }
                else {
                    for (int n33 = 0; n33 < Class6362.method19001(this.field6158); n33 += 8) {
                        for (int n34 = 0; n34 < Class6362.method18998(this.field6158); ++n34) {
                            final int n35 = 2 * n34;
                            final int n36 = 2 * Class6362.method18998(this.field6158) + 2 * n34;
                            final int n37 = n36 + 2 * Class6362.method18998(this.field6158);
                            final int n38 = n37 + 2 * Class6362.method18998(this.field6158);
                            array[n35] = this.field6156[field6153][n34][n33];
                            array[n35 + 1] = this.field6156[field6153][n34][n33 + 1];
                            array[n36] = this.field6156[field6153][n34][n33 + 2];
                            array[n36 + 1] = this.field6156[field6153][n34][n33 + 3];
                            array[n37] = this.field6156[field6153][n34][n33 + 4];
                            array[n37 + 1] = this.field6156[field6153][n34][n33 + 5];
                            array[n38] = this.field6156[field6153][n34][n33 + 6];
                            array[n38 + 1] = this.field6156[field6153][n34][n33 + 7];
                        }
                        Class6362.method19002(this.field6158).method25927(array, 0);
                        Class6362.method19002(this.field6158).method25927(array, 2 * Class6362.method18998(this.field6158));
                        Class6362.method19002(this.field6158).method25927(array, 4 * Class6362.method18998(this.field6158));
                        Class6362.method19002(this.field6158).method25927(array, 6 * Class6362.method18998(this.field6158));
                        for (int n39 = 0; n39 < Class6362.method18998(this.field6158); ++n39) {
                            final int n40 = 2 * n39;
                            final int n41 = 2 * Class6362.method18998(this.field6158) + 2 * n39;
                            final int n42 = n41 + 2 * Class6362.method18998(this.field6158);
                            final int n43 = n42 + 2 * Class6362.method18998(this.field6158);
                            this.field6156[field6153][n39][n33] = array[n40];
                            this.field6156[field6153][n39][n33 + 1] = array[n40 + 1];
                            this.field6156[field6153][n39][n33 + 2] = array[n41];
                            this.field6156[field6153][n39][n33 + 3] = array[n41 + 1];
                            this.field6156[field6153][n39][n33 + 4] = array[n42];
                            this.field6156[field6153][n39][n33 + 5] = array[n42 + 1];
                            this.field6156[field6153][n39][n33 + 6] = array[n43];
                            this.field6156[field6153][n39][n33 + 7] = array[n43 + 1];
                        }
                    }
                }
            }
        }
    }
}
