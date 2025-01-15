// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1296 implements Runnable
{
    private static String[] field7086;
    public final /* synthetic */ int field7087;
    public final /* synthetic */ int field7088;
    public final /* synthetic */ int field7089;
    public final /* synthetic */ int field7090;
    public final /* synthetic */ float[] field7091;
    public final /* synthetic */ boolean field7092;
    public final /* synthetic */ Class8328 field7093;
    
    public Class1296(final Class8328 field7093, final int field7094, final int field7095, final int field7096, final int field7097, final float[] field7098, final boolean field7099) {
        this.field7093 = field7093;
        this.field7087 = field7094;
        this.field7088 = field7095;
        this.field7089 = field7096;
        this.field7090 = field7097;
        this.field7091 = field7098;
        this.field7092 = field7099;
    }
    
    @Override
    public void run() {
        final float[] array = new float[this.field7087];
        if (this.field7088 != -1) {
            if (Class8328.method27763(this.field7093) <= 4 * this.field7089) {
                if (Class8328.method27763(this.field7093) != 4 * this.field7089) {
                    if (Class8328.method27763(this.field7093) == 2 * this.field7089) {
                        for (int i = 0; i < Class8328.method27760(this.field7093); ++i) {
                            final int n = i * Class8328.method27763(this.field7093) + 2 * this.field7090;
                            final int n2 = 2 * i;
                            array[n2] = this.field7091[n];
                            array[n2 + 1] = this.field7091[n + 1];
                        }
                        Class8328.method27761(this.field7093).method25931(array, 0, this.field7092);
                        for (int j = 0; j < Class8328.method27760(this.field7093); ++j) {
                            final int n3 = j * Class8328.method27763(this.field7093) + 2 * this.field7090;
                            final int n4 = 2 * j;
                            this.field7091[n3] = array[n4];
                            this.field7091[n3 + 1] = array[n4 + 1];
                        }
                    }
                }
                else {
                    for (int k = 0; k < Class8328.method27760(this.field7093); ++k) {
                        final int n5 = k * Class8328.method27763(this.field7093) + 4 * this.field7090;
                        final int n6 = 2 * k;
                        final int n7 = 2 * Class8328.method27760(this.field7093) + 2 * k;
                        array[n6] = this.field7091[n5];
                        array[n6 + 1] = this.field7091[n5 + 1];
                        array[n7] = this.field7091[n5 + 2];
                        array[n7 + 1] = this.field7091[n5 + 3];
                    }
                    Class8328.method27761(this.field7093).method25931(array, 0, this.field7092);
                    Class8328.method27761(this.field7093).method25931(array, 2 * Class8328.method27760(this.field7093), this.field7092);
                    for (int l = 0; l < Class8328.method27760(this.field7093); ++l) {
                        final int n8 = l * Class8328.method27763(this.field7093) + 4 * this.field7090;
                        final int n9 = 2 * l;
                        final int n10 = 2 * Class8328.method27760(this.field7093) + 2 * l;
                        this.field7091[n8] = array[n9];
                        this.field7091[n8 + 1] = array[n9 + 1];
                        this.field7091[n8 + 2] = array[n10];
                        this.field7091[n8 + 3] = array[n10 + 1];
                    }
                }
            }
            else {
                for (int n11 = 8 * this.field7090; n11 < Class8328.method27763(this.field7093); n11 += 8 * this.field7089) {
                    for (int n12 = 0; n12 < Class8328.method27760(this.field7093); ++n12) {
                        final int n13 = n12 * Class8328.method27763(this.field7093) + n11;
                        final int n14 = 2 * n12;
                        final int n15 = 2 * Class8328.method27760(this.field7093) + 2 * n12;
                        final int n16 = n15 + 2 * Class8328.method27760(this.field7093);
                        final int n17 = n16 + 2 * Class8328.method27760(this.field7093);
                        array[n14] = this.field7091[n13];
                        array[n14 + 1] = this.field7091[n13 + 1];
                        array[n15] = this.field7091[n13 + 2];
                        array[n15 + 1] = this.field7091[n13 + 3];
                        array[n16] = this.field7091[n13 + 4];
                        array[n16 + 1] = this.field7091[n13 + 5];
                        array[n17] = this.field7091[n13 + 6];
                        array[n17 + 1] = this.field7091[n13 + 7];
                    }
                    Class8328.method27761(this.field7093).method25931(array, 0, this.field7092);
                    Class8328.method27761(this.field7093).method25931(array, 2 * Class8328.method27760(this.field7093), this.field7092);
                    Class8328.method27761(this.field7093).method25931(array, 4 * Class8328.method27760(this.field7093), this.field7092);
                    Class8328.method27761(this.field7093).method25931(array, 6 * Class8328.method27760(this.field7093), this.field7092);
                    for (int n18 = 0; n18 < Class8328.method27760(this.field7093); ++n18) {
                        final int n19 = n18 * Class8328.method27763(this.field7093) + n11;
                        final int n20 = 2 * n18;
                        final int n21 = 2 * Class8328.method27760(this.field7093) + 2 * n18;
                        final int n22 = n21 + 2 * Class8328.method27760(this.field7093);
                        final int n23 = n22 + 2 * Class8328.method27760(this.field7093);
                        this.field7091[n19] = array[n20];
                        this.field7091[n19 + 1] = array[n20 + 1];
                        this.field7091[n19 + 2] = array[n21];
                        this.field7091[n19 + 3] = array[n21 + 1];
                        this.field7091[n19 + 4] = array[n22];
                        this.field7091[n19 + 5] = array[n22 + 1];
                        this.field7091[n19 + 6] = array[n23];
                        this.field7091[n19 + 7] = array[n23 + 1];
                    }
                }
            }
        }
        else if (Class8328.method27763(this.field7093) <= 4 * this.field7089) {
            if (Class8328.method27763(this.field7093) != 4 * this.field7089) {
                if (Class8328.method27763(this.field7093) == 2 * this.field7089) {
                    for (int n24 = 0; n24 < Class8328.method27760(this.field7093); ++n24) {
                        final int n25 = n24 * Class8328.method27763(this.field7093) + 2 * this.field7090;
                        final int n26 = 2 * n24;
                        array[n26] = this.field7091[n25];
                        array[n26 + 1] = this.field7091[n25 + 1];
                    }
                    Class8328.method27761(this.field7093).method25927(array, 0);
                    for (int n27 = 0; n27 < Class8328.method27760(this.field7093); ++n27) {
                        final int n28 = n27 * Class8328.method27763(this.field7093) + 2 * this.field7090;
                        final int n29 = 2 * n27;
                        this.field7091[n28] = array[n29];
                        this.field7091[n28 + 1] = array[n29 + 1];
                    }
                }
            }
            else {
                for (int n30 = 0; n30 < Class8328.method27760(this.field7093); ++n30) {
                    final int n31 = n30 * Class8328.method27763(this.field7093) + 4 * this.field7090;
                    final int n32 = 2 * n30;
                    final int n33 = 2 * Class8328.method27760(this.field7093) + 2 * n30;
                    array[n32] = this.field7091[n31];
                    array[n32 + 1] = this.field7091[n31 + 1];
                    array[n33] = this.field7091[n31 + 2];
                    array[n33 + 1] = this.field7091[n31 + 3];
                }
                Class8328.method27761(this.field7093).method25927(array, 0);
                Class8328.method27761(this.field7093).method25927(array, 2 * Class8328.method27760(this.field7093));
                for (int n34 = 0; n34 < Class8328.method27760(this.field7093); ++n34) {
                    final int n35 = n34 * Class8328.method27763(this.field7093) + 4 * this.field7090;
                    final int n36 = 2 * n34;
                    final int n37 = 2 * Class8328.method27760(this.field7093) + 2 * n34;
                    this.field7091[n35] = array[n36];
                    this.field7091[n35 + 1] = array[n36 + 1];
                    this.field7091[n35 + 2] = array[n37];
                    this.field7091[n35 + 3] = array[n37 + 1];
                }
            }
        }
        else {
            for (int n38 = 8 * this.field7090; n38 < Class8328.method27763(this.field7093); n38 += 8 * this.field7089) {
                for (int n39 = 0; n39 < Class8328.method27760(this.field7093); ++n39) {
                    final int n40 = n39 * Class8328.method27763(this.field7093) + n38;
                    final int n41 = 2 * n39;
                    final int n42 = 2 * Class8328.method27760(this.field7093) + 2 * n39;
                    final int n43 = n42 + 2 * Class8328.method27760(this.field7093);
                    final int n44 = n43 + 2 * Class8328.method27760(this.field7093);
                    array[n41] = this.field7091[n40];
                    array[n41 + 1] = this.field7091[n40 + 1];
                    array[n42] = this.field7091[n40 + 2];
                    array[n42 + 1] = this.field7091[n40 + 3];
                    array[n43] = this.field7091[n40 + 4];
                    array[n43 + 1] = this.field7091[n40 + 5];
                    array[n44] = this.field7091[n40 + 6];
                    array[n44 + 1] = this.field7091[n40 + 7];
                }
                Class8328.method27761(this.field7093).method25927(array, 0);
                Class8328.method27761(this.field7093).method25927(array, 2 * Class8328.method27760(this.field7093));
                Class8328.method27761(this.field7093).method25927(array, 4 * Class8328.method27760(this.field7093));
                Class8328.method27761(this.field7093).method25927(array, 6 * Class8328.method27760(this.field7093));
                for (int n45 = 0; n45 < Class8328.method27760(this.field7093); ++n45) {
                    final int n46 = n45 * Class8328.method27763(this.field7093) + n38;
                    final int n47 = 2 * n45;
                    final int n48 = 2 * Class8328.method27760(this.field7093) + 2 * n45;
                    final int n49 = n48 + 2 * Class8328.method27760(this.field7093);
                    final int n50 = n49 + 2 * Class8328.method27760(this.field7093);
                    this.field7091[n46] = array[n47];
                    this.field7091[n46 + 1] = array[n47 + 1];
                    this.field7091[n46 + 2] = array[n48];
                    this.field7091[n46 + 3] = array[n48 + 1];
                    this.field7091[n46 + 4] = array[n49];
                    this.field7091[n46 + 5] = array[n49 + 1];
                    this.field7091[n46 + 6] = array[n50];
                    this.field7091[n46 + 7] = array[n50 + 1];
                }
            }
        }
    }
}
