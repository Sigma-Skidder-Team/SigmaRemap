// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1163 implements Runnable
{
    private static String[] field6307;
    public final /* synthetic */ int field6308;
    public final /* synthetic */ int field6309;
    public final /* synthetic */ int field6310;
    public final /* synthetic */ int field6311;
    public final /* synthetic */ int field6312;
    public final /* synthetic */ float[] field6313;
    public final /* synthetic */ boolean field6314;
    public final /* synthetic */ Class6362 field6315;
    
    public Class1163(final Class6362 field6315, final int field6316, final int field6317, final int field6318, final int field6319, final int field6320, final float[] field6321, final boolean field6322) {
        this.field6315 = field6315;
        this.field6308 = field6316;
        this.field6309 = field6317;
        this.field6310 = field6318;
        this.field6311 = field6319;
        this.field6312 = field6320;
        this.field6313 = field6321;
        this.field6314 = field6322;
    }
    
    @Override
    public void run() {
        final float[] array = new float[this.field6308];
        if (this.field6309 != -1) {
            for (int i = this.field6310; i < Class6362.method19003(this.field6315); i += this.field6311) {
                final int n = i * Class6362.method18997(this.field6315);
                if (this.field6312 != 0) {
                    for (int j = 0; j < Class6362.method18998(this.field6315); ++j) {
                        Class6362.method19000(this.field6315).method25949(this.field6313, n + j * Class6362.method18999(this.field6315), this.field6314);
                    }
                }
                else {
                    for (int k = 0; k < Class6362.method18998(this.field6315); ++k) {
                        Class6362.method19000(this.field6315).method25931(this.field6313, n + k * Class6362.method18999(this.field6315), this.field6314);
                    }
                }
                if (Class6362.method19001(this.field6315) <= 4) {
                    if (Class6362.method19001(this.field6315) != 4) {
                        if (Class6362.method19001(this.field6315) == 2) {
                            for (int l = 0; l < Class6362.method18998(this.field6315); ++l) {
                                final int n2 = n + l * Class6362.method18999(this.field6315);
                                final int n3 = 2 * l;
                                array[n3] = this.field6313[n2];
                                array[n3 + 1] = this.field6313[n2 + 1];
                            }
                            Class6362.method19002(this.field6315).method25931(array, 0, this.field6314);
                            for (int n4 = 0; n4 < Class6362.method18998(this.field6315); ++n4) {
                                final int n5 = n + n4 * Class6362.method18999(this.field6315);
                                final int n6 = 2 * n4;
                                this.field6313[n5] = array[n6];
                                this.field6313[n5 + 1] = array[n6 + 1];
                            }
                        }
                    }
                    else {
                        for (int n7 = 0; n7 < Class6362.method18998(this.field6315); ++n7) {
                            final int n8 = n + n7 * Class6362.method18999(this.field6315);
                            final int n9 = 2 * n7;
                            final int n10 = 2 * Class6362.method18998(this.field6315) + 2 * n7;
                            array[n9] = this.field6313[n8];
                            array[n9 + 1] = this.field6313[n8 + 1];
                            array[n10] = this.field6313[n8 + 2];
                            array[n10 + 1] = this.field6313[n8 + 3];
                        }
                        Class6362.method19002(this.field6315).method25931(array, 0, this.field6314);
                        Class6362.method19002(this.field6315).method25931(array, 2 * Class6362.method18998(this.field6315), this.field6314);
                        for (int n11 = 0; n11 < Class6362.method18998(this.field6315); ++n11) {
                            final int n12 = n + n11 * Class6362.method18999(this.field6315);
                            final int n13 = 2 * n11;
                            final int n14 = 2 * Class6362.method18998(this.field6315) + 2 * n11;
                            this.field6313[n12] = array[n13];
                            this.field6313[n12 + 1] = array[n13 + 1];
                            this.field6313[n12 + 2] = array[n14];
                            this.field6313[n12 + 3] = array[n14 + 1];
                        }
                    }
                }
                else {
                    for (int n15 = 0; n15 < Class6362.method19001(this.field6315); n15 += 8) {
                        for (int n16 = 0; n16 < Class6362.method18998(this.field6315); ++n16) {
                            final int n17 = n + n16 * Class6362.method18999(this.field6315) + n15;
                            final int n18 = 2 * n16;
                            final int n19 = 2 * Class6362.method18998(this.field6315) + 2 * n16;
                            final int n20 = n19 + 2 * Class6362.method18998(this.field6315);
                            final int n21 = n20 + 2 * Class6362.method18998(this.field6315);
                            array[n18] = this.field6313[n17];
                            array[n18 + 1] = this.field6313[n17 + 1];
                            array[n19] = this.field6313[n17 + 2];
                            array[n19 + 1] = this.field6313[n17 + 3];
                            array[n20] = this.field6313[n17 + 4];
                            array[n20 + 1] = this.field6313[n17 + 5];
                            array[n21] = this.field6313[n17 + 6];
                            array[n21 + 1] = this.field6313[n17 + 7];
                        }
                        Class6362.method19002(this.field6315).method25931(array, 0, this.field6314);
                        Class6362.method19002(this.field6315).method25931(array, 2 * Class6362.method18998(this.field6315), this.field6314);
                        Class6362.method19002(this.field6315).method25931(array, 4 * Class6362.method18998(this.field6315), this.field6314);
                        Class6362.method19002(this.field6315).method25931(array, 6 * Class6362.method18998(this.field6315), this.field6314);
                        for (int n22 = 0; n22 < Class6362.method18998(this.field6315); ++n22) {
                            final int n23 = n + n22 * Class6362.method18999(this.field6315) + n15;
                            final int n24 = 2 * n22;
                            final int n25 = 2 * Class6362.method18998(this.field6315) + 2 * n22;
                            final int n26 = n25 + 2 * Class6362.method18998(this.field6315);
                            final int n27 = n26 + 2 * Class6362.method18998(this.field6315);
                            this.field6313[n23] = array[n24];
                            this.field6313[n23 + 1] = array[n24 + 1];
                            this.field6313[n23 + 2] = array[n25];
                            this.field6313[n23 + 3] = array[n25 + 1];
                            this.field6313[n23 + 4] = array[n26];
                            this.field6313[n23 + 5] = array[n26 + 1];
                            this.field6313[n23 + 6] = array[n27];
                            this.field6313[n23 + 7] = array[n27 + 1];
                        }
                    }
                }
            }
        }
        else {
            for (int field6310 = this.field6310; field6310 < Class6362.method19003(this.field6315); field6310 += this.field6311) {
                final int n28 = field6310 * Class6362.method18997(this.field6315);
                if (this.field6312 != 0) {
                    for (int n29 = 0; n29 < Class6362.method18998(this.field6315); ++n29) {
                        Class6362.method19000(this.field6315).method25935(this.field6313, n28 + n29 * Class6362.method18999(this.field6315));
                    }
                }
                else {
                    for (int n30 = 0; n30 < Class6362.method18998(this.field6315); ++n30) {
                        Class6362.method19000(this.field6315).method25927(this.field6313, n28 + n30 * Class6362.method18999(this.field6315));
                    }
                }
                if (Class6362.method19001(this.field6315) <= 4) {
                    if (Class6362.method19001(this.field6315) != 4) {
                        if (Class6362.method19001(this.field6315) == 2) {
                            for (int n31 = 0; n31 < Class6362.method18998(this.field6315); ++n31) {
                                final int n32 = n28 + n31 * Class6362.method18999(this.field6315);
                                final int n33 = 2 * n31;
                                array[n33] = this.field6313[n32];
                                array[n33 + 1] = this.field6313[n32 + 1];
                            }
                            Class6362.method19002(this.field6315).method25927(array, 0);
                            for (int n34 = 0; n34 < Class6362.method18998(this.field6315); ++n34) {
                                final int n35 = n28 + n34 * Class6362.method18999(this.field6315);
                                final int n36 = 2 * n34;
                                this.field6313[n35] = array[n36];
                                this.field6313[n35 + 1] = array[n36 + 1];
                            }
                        }
                    }
                    else {
                        for (int n37 = 0; n37 < Class6362.method18998(this.field6315); ++n37) {
                            final int n38 = n28 + n37 * Class6362.method18999(this.field6315);
                            final int n39 = 2 * n37;
                            final int n40 = 2 * Class6362.method18998(this.field6315) + 2 * n37;
                            array[n39] = this.field6313[n38];
                            array[n39 + 1] = this.field6313[n38 + 1];
                            array[n40] = this.field6313[n38 + 2];
                            array[n40 + 1] = this.field6313[n38 + 3];
                        }
                        Class6362.method19002(this.field6315).method25927(array, 0);
                        Class6362.method19002(this.field6315).method25927(array, 2 * Class6362.method18998(this.field6315));
                        for (int n41 = 0; n41 < Class6362.method18998(this.field6315); ++n41) {
                            final int n42 = n28 + n41 * Class6362.method18999(this.field6315);
                            final int n43 = 2 * n41;
                            final int n44 = 2 * Class6362.method18998(this.field6315) + 2 * n41;
                            this.field6313[n42] = array[n43];
                            this.field6313[n42 + 1] = array[n43 + 1];
                            this.field6313[n42 + 2] = array[n44];
                            this.field6313[n42 + 3] = array[n44 + 1];
                        }
                    }
                }
                else {
                    for (int n45 = 0; n45 < Class6362.method19001(this.field6315); n45 += 8) {
                        for (int n46 = 0; n46 < Class6362.method18998(this.field6315); ++n46) {
                            final int n47 = n28 + n46 * Class6362.method18999(this.field6315) + n45;
                            final int n48 = 2 * n46;
                            final int n49 = 2 * Class6362.method18998(this.field6315) + 2 * n46;
                            final int n50 = n49 + 2 * Class6362.method18998(this.field6315);
                            final int n51 = n50 + 2 * Class6362.method18998(this.field6315);
                            array[n48] = this.field6313[n47];
                            array[n48 + 1] = this.field6313[n47 + 1];
                            array[n49] = this.field6313[n47 + 2];
                            array[n49 + 1] = this.field6313[n47 + 3];
                            array[n50] = this.field6313[n47 + 4];
                            array[n50 + 1] = this.field6313[n47 + 5];
                            array[n51] = this.field6313[n47 + 6];
                            array[n51 + 1] = this.field6313[n47 + 7];
                        }
                        Class6362.method19002(this.field6315).method25927(array, 0);
                        Class6362.method19002(this.field6315).method25927(array, 2 * Class6362.method18998(this.field6315));
                        Class6362.method19002(this.field6315).method25927(array, 4 * Class6362.method18998(this.field6315));
                        Class6362.method19002(this.field6315).method25927(array, 6 * Class6362.method18998(this.field6315));
                        for (int n52 = 0; n52 < Class6362.method18998(this.field6315); ++n52) {
                            final int n53 = n28 + n52 * Class6362.method18999(this.field6315) + n45;
                            final int n54 = 2 * n52;
                            final int n55 = 2 * Class6362.method18998(this.field6315) + 2 * n52;
                            final int n56 = n55 + 2 * Class6362.method18998(this.field6315);
                            final int n57 = n56 + 2 * Class6362.method18998(this.field6315);
                            this.field6313[n53] = array[n54];
                            this.field6313[n53 + 1] = array[n54 + 1];
                            this.field6313[n53 + 2] = array[n55];
                            this.field6313[n53 + 3] = array[n55 + 1];
                            this.field6313[n53 + 4] = array[n56];
                            this.field6313[n53 + 5] = array[n56 + 1];
                            this.field6313[n53 + 6] = array[n57];
                            this.field6313[n53 + 7] = array[n57 + 1];
                        }
                    }
                }
            }
        }
    }
}
