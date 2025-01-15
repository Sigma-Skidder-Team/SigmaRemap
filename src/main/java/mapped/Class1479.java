// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1479 implements Runnable
{
    private static String[] field8213;
    public final /* synthetic */ int field8214;
    public final /* synthetic */ int field8215;
    public final /* synthetic */ int field8216;
    public final /* synthetic */ int field8217;
    public final /* synthetic */ int field8218;
    public final /* synthetic */ float[] field8219;
    public final /* synthetic */ boolean field8220;
    public final /* synthetic */ Class6362 field8221;
    
    public Class1479(final Class6362 field8221, final int field8222, final int field8223, final int field8224, final int field8225, final int field8226, final float[] field8227, final boolean field8228) {
        this.field8221 = field8221;
        this.field8214 = field8222;
        this.field8215 = field8223;
        this.field8216 = field8224;
        this.field8217 = field8225;
        this.field8218 = field8226;
        this.field8219 = field8227;
        this.field8220 = field8228;
    }
    
    @Override
    public void run() {
        final float[] array = new float[this.field8214];
        if (this.field8215 != -1) {
            for (int i = this.field8216; i < Class6362.method19003(this.field8221); i += this.field8217) {
                final int n = i * Class6362.method18997(this.field8221);
                if (this.field8218 == 0) {
                    for (int j = 0; j < Class6362.method18998(this.field8221); ++j) {
                        Class6362.method19000(this.field8221).method25931(this.field8219, n + j * Class6362.method18999(this.field8221), this.field8220);
                    }
                }
                if (Class6362.method19001(this.field8221) <= 4) {
                    if (Class6362.method19001(this.field8221) != 4) {
                        if (Class6362.method19001(this.field8221) == 2) {
                            for (int k = 0; k < Class6362.method18998(this.field8221); ++k) {
                                final int n2 = n + k * Class6362.method18999(this.field8221);
                                final int n3 = 2 * k;
                                array[n3] = this.field8219[n2];
                                array[n3 + 1] = this.field8219[n2 + 1];
                            }
                            Class6362.method19002(this.field8221).method25931(array, 0, this.field8220);
                            for (int l = 0; l < Class6362.method18998(this.field8221); ++l) {
                                final int n4 = n + l * Class6362.method18999(this.field8221);
                                final int n5 = 2 * l;
                                this.field8219[n4] = array[n5];
                                this.field8219[n4 + 1] = array[n5 + 1];
                            }
                        }
                    }
                    else {
                        for (int n6 = 0; n6 < Class6362.method18998(this.field8221); ++n6) {
                            final int n7 = n + n6 * Class6362.method18999(this.field8221);
                            final int n8 = 2 * n6;
                            final int n9 = 2 * Class6362.method18998(this.field8221) + 2 * n6;
                            array[n8] = this.field8219[n7];
                            array[n8 + 1] = this.field8219[n7 + 1];
                            array[n9] = this.field8219[n7 + 2];
                            array[n9 + 1] = this.field8219[n7 + 3];
                        }
                        Class6362.method19002(this.field8221).method25931(array, 0, this.field8220);
                        Class6362.method19002(this.field8221).method25931(array, 2 * Class6362.method18998(this.field8221), this.field8220);
                        for (int n10 = 0; n10 < Class6362.method18998(this.field8221); ++n10) {
                            final int n11 = n + n10 * Class6362.method18999(this.field8221);
                            final int n12 = 2 * n10;
                            final int n13 = 2 * Class6362.method18998(this.field8221) + 2 * n10;
                            this.field8219[n11] = array[n12];
                            this.field8219[n11 + 1] = array[n12 + 1];
                            this.field8219[n11 + 2] = array[n13];
                            this.field8219[n11 + 3] = array[n13 + 1];
                        }
                    }
                }
                else {
                    for (int n14 = 0; n14 < Class6362.method19001(this.field8221); n14 += 8) {
                        for (int n15 = 0; n15 < Class6362.method18998(this.field8221); ++n15) {
                            final int n16 = n + n15 * Class6362.method18999(this.field8221) + n14;
                            final int n17 = 2 * n15;
                            final int n18 = 2 * Class6362.method18998(this.field8221) + 2 * n15;
                            final int n19 = n18 + 2 * Class6362.method18998(this.field8221);
                            final int n20 = n19 + 2 * Class6362.method18998(this.field8221);
                            array[n17] = this.field8219[n16];
                            array[n17 + 1] = this.field8219[n16 + 1];
                            array[n18] = this.field8219[n16 + 2];
                            array[n18 + 1] = this.field8219[n16 + 3];
                            array[n19] = this.field8219[n16 + 4];
                            array[n19 + 1] = this.field8219[n16 + 5];
                            array[n20] = this.field8219[n16 + 6];
                            array[n20 + 1] = this.field8219[n16 + 7];
                        }
                        Class6362.method19002(this.field8221).method25931(array, 0, this.field8220);
                        Class6362.method19002(this.field8221).method25931(array, 2 * Class6362.method18998(this.field8221), this.field8220);
                        Class6362.method19002(this.field8221).method25931(array, 4 * Class6362.method18998(this.field8221), this.field8220);
                        Class6362.method19002(this.field8221).method25931(array, 6 * Class6362.method18998(this.field8221), this.field8220);
                        for (int n21 = 0; n21 < Class6362.method18998(this.field8221); ++n21) {
                            final int n22 = n + n21 * Class6362.method18999(this.field8221) + n14;
                            final int n23 = 2 * n21;
                            final int n24 = 2 * Class6362.method18998(this.field8221) + 2 * n21;
                            final int n25 = n24 + 2 * Class6362.method18998(this.field8221);
                            final int n26 = n25 + 2 * Class6362.method18998(this.field8221);
                            this.field8219[n22] = array[n23];
                            this.field8219[n22 + 1] = array[n23 + 1];
                            this.field8219[n22 + 2] = array[n24];
                            this.field8219[n22 + 3] = array[n24 + 1];
                            this.field8219[n22 + 4] = array[n25];
                            this.field8219[n22 + 5] = array[n25 + 1];
                            this.field8219[n22 + 6] = array[n26];
                            this.field8219[n22 + 7] = array[n26 + 1];
                        }
                    }
                }
                if (this.field8218 != 0) {
                    for (int n27 = 0; n27 < Class6362.method18998(this.field8221); ++n27) {
                        Class6362.method19000(this.field8221).method25943(this.field8219, n + n27 * Class6362.method18999(this.field8221), this.field8220);
                    }
                }
            }
        }
        else {
            for (int field8216 = this.field8216; field8216 < Class6362.method19003(this.field8221); field8216 += this.field8217) {
                final int n28 = field8216 * Class6362.method18997(this.field8221);
                if (this.field8218 != 0) {
                    for (int n29 = 0; n29 < Class6362.method18998(this.field8221); ++n29) {
                        Class6362.method19000(this.field8221).method25935(this.field8219, n28 + n29 * Class6362.method18999(this.field8221));
                    }
                }
                else {
                    for (int n30 = 0; n30 < Class6362.method18998(this.field8221); ++n30) {
                        Class6362.method19000(this.field8221).method25927(this.field8219, n28 + n30 * Class6362.method18999(this.field8221));
                    }
                }
                if (Class6362.method19001(this.field8221) <= 4) {
                    if (Class6362.method19001(this.field8221) != 4) {
                        if (Class6362.method19001(this.field8221) == 2) {
                            for (int n31 = 0; n31 < Class6362.method18998(this.field8221); ++n31) {
                                final int n32 = n28 + n31 * Class6362.method18999(this.field8221);
                                final int n33 = 2 * n31;
                                array[n33] = this.field8219[n32];
                                array[n33 + 1] = this.field8219[n32 + 1];
                            }
                            Class6362.method19002(this.field8221).method25927(array, 0);
                            for (int n34 = 0; n34 < Class6362.method18998(this.field8221); ++n34) {
                                final int n35 = n28 + n34 * Class6362.method18999(this.field8221);
                                final int n36 = 2 * n34;
                                this.field8219[n35] = array[n36];
                                this.field8219[n35 + 1] = array[n36 + 1];
                            }
                        }
                    }
                    else {
                        for (int n37 = 0; n37 < Class6362.method18998(this.field8221); ++n37) {
                            final int n38 = n28 + n37 * Class6362.method18999(this.field8221);
                            final int n39 = 2 * n37;
                            final int n40 = 2 * Class6362.method18998(this.field8221) + 2 * n37;
                            array[n39] = this.field8219[n38];
                            array[n39 + 1] = this.field8219[n38 + 1];
                            array[n40] = this.field8219[n38 + 2];
                            array[n40 + 1] = this.field8219[n38 + 3];
                        }
                        Class6362.method19002(this.field8221).method25927(array, 0);
                        Class6362.method19002(this.field8221).method25927(array, 2 * Class6362.method18998(this.field8221));
                        for (int n41 = 0; n41 < Class6362.method18998(this.field8221); ++n41) {
                            final int n42 = n28 + n41 * Class6362.method18999(this.field8221);
                            final int n43 = 2 * n41;
                            final int n44 = 2 * Class6362.method18998(this.field8221) + 2 * n41;
                            this.field8219[n42] = array[n43];
                            this.field8219[n42 + 1] = array[n43 + 1];
                            this.field8219[n42 + 2] = array[n44];
                            this.field8219[n42 + 3] = array[n44 + 1];
                        }
                    }
                }
                else {
                    for (int n45 = 0; n45 < Class6362.method19001(this.field8221); n45 += 8) {
                        for (int n46 = 0; n46 < Class6362.method18998(this.field8221); ++n46) {
                            final int n47 = n28 + n46 * Class6362.method18999(this.field8221) + n45;
                            final int n48 = 2 * n46;
                            final int n49 = 2 * Class6362.method18998(this.field8221) + 2 * n46;
                            final int n50 = n49 + 2 * Class6362.method18998(this.field8221);
                            final int n51 = n50 + 2 * Class6362.method18998(this.field8221);
                            array[n48] = this.field8219[n47];
                            array[n48 + 1] = this.field8219[n47 + 1];
                            array[n49] = this.field8219[n47 + 2];
                            array[n49 + 1] = this.field8219[n47 + 3];
                            array[n50] = this.field8219[n47 + 4];
                            array[n50 + 1] = this.field8219[n47 + 5];
                            array[n51] = this.field8219[n47 + 6];
                            array[n51 + 1] = this.field8219[n47 + 7];
                        }
                        Class6362.method19002(this.field8221).method25927(array, 0);
                        Class6362.method19002(this.field8221).method25927(array, 2 * Class6362.method18998(this.field8221));
                        Class6362.method19002(this.field8221).method25927(array, 4 * Class6362.method18998(this.field8221));
                        Class6362.method19002(this.field8221).method25927(array, 6 * Class6362.method18998(this.field8221));
                        for (int n52 = 0; n52 < Class6362.method18998(this.field8221); ++n52) {
                            final int n53 = n28 + n52 * Class6362.method18999(this.field8221) + n45;
                            final int n54 = 2 * n52;
                            final int n55 = 2 * Class6362.method18998(this.field8221) + 2 * n52;
                            final int n56 = n55 + 2 * Class6362.method18998(this.field8221);
                            final int n57 = n56 + 2 * Class6362.method18998(this.field8221);
                            this.field8219[n53] = array[n54];
                            this.field8219[n53 + 1] = array[n54 + 1];
                            this.field8219[n53 + 2] = array[n55];
                            this.field8219[n53 + 3] = array[n55 + 1];
                            this.field8219[n53 + 4] = array[n56];
                            this.field8219[n53 + 5] = array[n56 + 1];
                            this.field8219[n53 + 6] = array[n57];
                            this.field8219[n53 + 7] = array[n57 + 1];
                        }
                    }
                }
            }
        }
    }
}
