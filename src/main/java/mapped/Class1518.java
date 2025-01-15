// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1518 implements Runnable
{
    private static String[] field8459;
    public final /* synthetic */ int field8460;
    public final /* synthetic */ int field8461;
    public final /* synthetic */ int field8462;
    public final /* synthetic */ int field8463;
    public final /* synthetic */ float[][] field8464;
    public final /* synthetic */ boolean field8465;
    public final /* synthetic */ Class8328 field8466;
    
    public Class1518(final Class8328 field8466, final int field8467, final int field8468, final int field8469, final int field8470, final float[][] field8471, final boolean field8472) {
        this.field8466 = field8466;
        this.field8460 = field8467;
        this.field8461 = field8468;
        this.field8462 = field8469;
        this.field8463 = field8470;
        this.field8464 = field8471;
        this.field8465 = field8472;
    }
    
    @Override
    public void run() {
        final float[] array = new float[this.field8460];
        if (this.field8461 != -1) {
            if (Class8328.method27763(this.field8466) <= 4 * this.field8462) {
                if (Class8328.method27763(this.field8466) != 4 * this.field8462) {
                    if (Class8328.method27763(this.field8466) == 2 * this.field8462) {
                        for (int i = 0; i < Class8328.method27760(this.field8466); ++i) {
                            final int n = 2 * i;
                            array[n] = this.field8464[i][2 * this.field8463];
                            array[n + 1] = this.field8464[i][2 * this.field8463 + 1];
                        }
                        Class8328.method27761(this.field8466).method25931(array, 0, this.field8465);
                        for (int j = 0; j < Class8328.method27760(this.field8466); ++j) {
                            final int n2 = 2 * j;
                            this.field8464[j][2 * this.field8463] = array[n2];
                            this.field8464[j][2 * this.field8463 + 1] = array[n2 + 1];
                        }
                    }
                }
                else {
                    for (int k = 0; k < Class8328.method27760(this.field8466); ++k) {
                        final int n3 = 2 * k;
                        final int n4 = 2 * Class8328.method27760(this.field8466) + 2 * k;
                        array[n3] = this.field8464[k][4 * this.field8463];
                        array[n3 + 1] = this.field8464[k][4 * this.field8463 + 1];
                        array[n4] = this.field8464[k][4 * this.field8463 + 2];
                        array[n4 + 1] = this.field8464[k][4 * this.field8463 + 3];
                    }
                    Class8328.method27761(this.field8466).method25931(array, 0, this.field8465);
                    Class8328.method27761(this.field8466).method25931(array, 2 * Class8328.method27760(this.field8466), this.field8465);
                    for (int l = 0; l < Class8328.method27760(this.field8466); ++l) {
                        final int n5 = 2 * l;
                        final int n6 = 2 * Class8328.method27760(this.field8466) + 2 * l;
                        this.field8464[l][4 * this.field8463] = array[n5];
                        this.field8464[l][4 * this.field8463 + 1] = array[n5 + 1];
                        this.field8464[l][4 * this.field8463 + 2] = array[n6];
                        this.field8464[l][4 * this.field8463 + 3] = array[n6 + 1];
                    }
                }
            }
            else {
                for (int n7 = 8 * this.field8463; n7 < Class8328.method27763(this.field8466); n7 += 8 * this.field8462) {
                    for (int n8 = 0; n8 < Class8328.method27760(this.field8466); ++n8) {
                        final int n9 = 2 * n8;
                        final int n10 = 2 * Class8328.method27760(this.field8466) + 2 * n8;
                        final int n11 = n10 + 2 * Class8328.method27760(this.field8466);
                        final int n12 = n11 + 2 * Class8328.method27760(this.field8466);
                        array[n9] = this.field8464[n8][n7];
                        array[n9 + 1] = this.field8464[n8][n7 + 1];
                        array[n10] = this.field8464[n8][n7 + 2];
                        array[n10 + 1] = this.field8464[n8][n7 + 3];
                        array[n11] = this.field8464[n8][n7 + 4];
                        array[n11 + 1] = this.field8464[n8][n7 + 5];
                        array[n12] = this.field8464[n8][n7 + 6];
                        array[n12 + 1] = this.field8464[n8][n7 + 7];
                    }
                    Class8328.method27761(this.field8466).method25931(array, 0, this.field8465);
                    Class8328.method27761(this.field8466).method25931(array, 2 * Class8328.method27760(this.field8466), this.field8465);
                    Class8328.method27761(this.field8466).method25931(array, 4 * Class8328.method27760(this.field8466), this.field8465);
                    Class8328.method27761(this.field8466).method25931(array, 6 * Class8328.method27760(this.field8466), this.field8465);
                    for (int n13 = 0; n13 < Class8328.method27760(this.field8466); ++n13) {
                        final int n14 = 2 * n13;
                        final int n15 = 2 * Class8328.method27760(this.field8466) + 2 * n13;
                        final int n16 = n15 + 2 * Class8328.method27760(this.field8466);
                        final int n17 = n16 + 2 * Class8328.method27760(this.field8466);
                        this.field8464[n13][n7] = array[n14];
                        this.field8464[n13][n7 + 1] = array[n14 + 1];
                        this.field8464[n13][n7 + 2] = array[n15];
                        this.field8464[n13][n7 + 3] = array[n15 + 1];
                        this.field8464[n13][n7 + 4] = array[n16];
                        this.field8464[n13][n7 + 5] = array[n16 + 1];
                        this.field8464[n13][n7 + 6] = array[n17];
                        this.field8464[n13][n7 + 7] = array[n17 + 1];
                    }
                }
            }
        }
        else if (Class8328.method27763(this.field8466) <= 4 * this.field8462) {
            if (Class8328.method27763(this.field8466) != 4 * this.field8462) {
                if (Class8328.method27763(this.field8466) == 2 * this.field8462) {
                    for (int n18 = 0; n18 < Class8328.method27760(this.field8466); ++n18) {
                        final int n19 = 2 * n18;
                        array[n19] = this.field8464[n18][2 * this.field8463];
                        array[n19 + 1] = this.field8464[n18][2 * this.field8463 + 1];
                    }
                    Class8328.method27761(this.field8466).method25927(array, 0);
                    for (int n20 = 0; n20 < Class8328.method27760(this.field8466); ++n20) {
                        final int n21 = 2 * n20;
                        this.field8464[n20][2 * this.field8463] = array[n21];
                        this.field8464[n20][2 * this.field8463 + 1] = array[n21 + 1];
                    }
                }
            }
            else {
                for (int n22 = 0; n22 < Class8328.method27760(this.field8466); ++n22) {
                    final int n23 = 2 * n22;
                    final int n24 = 2 * Class8328.method27760(this.field8466) + 2 * n22;
                    array[n23] = this.field8464[n22][4 * this.field8463];
                    array[n23 + 1] = this.field8464[n22][4 * this.field8463 + 1];
                    array[n24] = this.field8464[n22][4 * this.field8463 + 2];
                    array[n24 + 1] = this.field8464[n22][4 * this.field8463 + 3];
                }
                Class8328.method27761(this.field8466).method25927(array, 0);
                Class8328.method27761(this.field8466).method25927(array, 2 * Class8328.method27760(this.field8466));
                for (int n25 = 0; n25 < Class8328.method27760(this.field8466); ++n25) {
                    final int n26 = 2 * n25;
                    final int n27 = 2 * Class8328.method27760(this.field8466) + 2 * n25;
                    this.field8464[n25][4 * this.field8463] = array[n26];
                    this.field8464[n25][4 * this.field8463 + 1] = array[n26 + 1];
                    this.field8464[n25][4 * this.field8463 + 2] = array[n27];
                    this.field8464[n25][4 * this.field8463 + 3] = array[n27 + 1];
                }
            }
        }
        else {
            for (int n28 = 8 * this.field8463; n28 < Class8328.method27763(this.field8466); n28 += 8 * this.field8462) {
                for (int n29 = 0; n29 < Class8328.method27760(this.field8466); ++n29) {
                    final int n30 = 2 * n29;
                    final int n31 = 2 * Class8328.method27760(this.field8466) + 2 * n29;
                    final int n32 = n31 + 2 * Class8328.method27760(this.field8466);
                    final int n33 = n32 + 2 * Class8328.method27760(this.field8466);
                    array[n30] = this.field8464[n29][n28];
                    array[n30 + 1] = this.field8464[n29][n28 + 1];
                    array[n31] = this.field8464[n29][n28 + 2];
                    array[n31 + 1] = this.field8464[n29][n28 + 3];
                    array[n32] = this.field8464[n29][n28 + 4];
                    array[n32 + 1] = this.field8464[n29][n28 + 5];
                    array[n33] = this.field8464[n29][n28 + 6];
                    array[n33 + 1] = this.field8464[n29][n28 + 7];
                }
                Class8328.method27761(this.field8466).method25927(array, 0);
                Class8328.method27761(this.field8466).method25927(array, 2 * Class8328.method27760(this.field8466));
                Class8328.method27761(this.field8466).method25927(array, 4 * Class8328.method27760(this.field8466));
                Class8328.method27761(this.field8466).method25927(array, 6 * Class8328.method27760(this.field8466));
                for (int n34 = 0; n34 < Class8328.method27760(this.field8466); ++n34) {
                    final int n35 = 2 * n34;
                    final int n36 = 2 * Class8328.method27760(this.field8466) + 2 * n34;
                    final int n37 = n36 + 2 * Class8328.method27760(this.field8466);
                    final int n38 = n37 + 2 * Class8328.method27760(this.field8466);
                    this.field8464[n34][n28] = array[n35];
                    this.field8464[n34][n28 + 1] = array[n35 + 1];
                    this.field8464[n34][n28 + 2] = array[n36];
                    this.field8464[n34][n28 + 3] = array[n36 + 1];
                    this.field8464[n34][n28 + 4] = array[n37];
                    this.field8464[n34][n28 + 5] = array[n37 + 1];
                    this.field8464[n34][n28 + 6] = array[n38];
                    this.field8464[n34][n28 + 7] = array[n38 + 1];
                }
            }
        }
    }
}
