// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1035 implements Runnable
{
    private static String[] field5546;
    public final /* synthetic */ int field5547;
    public final /* synthetic */ int field5548;
    public final /* synthetic */ int field5549;
    public final /* synthetic */ int field5550;
    public final /* synthetic */ float[] field5551;
    public final /* synthetic */ boolean field5552;
    public final /* synthetic */ Class6362 field5553;
    
    public Class1035(final Class6362 field5553, final int field5554, final int field5555, final int field5556, final int field5557, final float[] field5558, final boolean field5559) {
        this.field5553 = field5553;
        this.field5547 = field5554;
        this.field5548 = field5555;
        this.field5549 = field5556;
        this.field5550 = field5557;
        this.field5551 = field5558;
        this.field5552 = field5559;
    }
    
    @Override
    public void run() {
        final float[] array = new float[this.field5547];
        if (this.field5548 != -1) {
            if (Class6362.method19001(this.field5553) <= 4) {
                if (Class6362.method19001(this.field5553) != 4) {
                    if (Class6362.method19001(this.field5553) == 2) {
                        for (int i = this.field5549; i < Class6362.method18998(this.field5553); i += this.field5550) {
                            final int n = i * Class6362.method18999(this.field5553);
                            for (int j = 0; j < Class6362.method19003(this.field5553); ++j) {
                                final int n2 = j * Class6362.method18997(this.field5553) + n;
                                final int n3 = 2 * j;
                                array[n3] = this.field5551[n2];
                                array[n3 + 1] = this.field5551[n2 + 1];
                            }
                            Class6362.method19004(this.field5553).method25931(array, 0, this.field5552);
                            for (int k = 0; k < Class6362.method19003(this.field5553); ++k) {
                                final int n4 = k * Class6362.method18997(this.field5553) + n;
                                final int n5 = 2 * k;
                                this.field5551[n4] = array[n5];
                                this.field5551[n4 + 1] = array[n5 + 1];
                            }
                        }
                    }
                }
                else {
                    for (int l = this.field5549; l < Class6362.method18998(this.field5553); l += this.field5550) {
                        final int n6 = l * Class6362.method18999(this.field5553);
                        for (int n7 = 0; n7 < Class6362.method19003(this.field5553); ++n7) {
                            final int n8 = n7 * Class6362.method18997(this.field5553) + n6;
                            final int n9 = 2 * n7;
                            final int n10 = 2 * Class6362.method19003(this.field5553) + 2 * n7;
                            array[n9] = this.field5551[n8];
                            array[n9 + 1] = this.field5551[n8 + 1];
                            array[n10] = this.field5551[n8 + 2];
                            array[n10 + 1] = this.field5551[n8 + 3];
                        }
                        Class6362.method19004(this.field5553).method25931(array, 0, this.field5552);
                        Class6362.method19004(this.field5553).method25931(array, 2 * Class6362.method19003(this.field5553), this.field5552);
                        for (int n11 = 0; n11 < Class6362.method19003(this.field5553); ++n11) {
                            final int n12 = n11 * Class6362.method18997(this.field5553) + n6;
                            final int n13 = 2 * n11;
                            final int n14 = 2 * Class6362.method19003(this.field5553) + 2 * n11;
                            this.field5551[n12] = array[n13];
                            this.field5551[n12 + 1] = array[n13 + 1];
                            this.field5551[n12 + 2] = array[n14];
                            this.field5551[n12 + 3] = array[n14 + 1];
                        }
                    }
                }
            }
            else {
                for (int field5549 = this.field5549; field5549 < Class6362.method18998(this.field5553); field5549 += this.field5550) {
                    final int n15 = field5549 * Class6362.method18999(this.field5553);
                    for (int n16 = 0; n16 < Class6362.method19001(this.field5553); n16 += 8) {
                        for (int n17 = 0; n17 < Class6362.method19003(this.field5553); ++n17) {
                            final int n18 = n17 * Class6362.method18997(this.field5553) + n15 + n16;
                            final int n19 = 2 * n17;
                            final int n20 = 2 * Class6362.method19003(this.field5553) + 2 * n17;
                            final int n21 = n20 + 2 * Class6362.method19003(this.field5553);
                            final int n22 = n21 + 2 * Class6362.method19003(this.field5553);
                            array[n19] = this.field5551[n18];
                            array[n19 + 1] = this.field5551[n18 + 1];
                            array[n20] = this.field5551[n18 + 2];
                            array[n20 + 1] = this.field5551[n18 + 3];
                            array[n21] = this.field5551[n18 + 4];
                            array[n21 + 1] = this.field5551[n18 + 5];
                            array[n22] = this.field5551[n18 + 6];
                            array[n22 + 1] = this.field5551[n18 + 7];
                        }
                        Class6362.method19004(this.field5553).method25931(array, 0, this.field5552);
                        Class6362.method19004(this.field5553).method25931(array, 2 * Class6362.method19003(this.field5553), this.field5552);
                        Class6362.method19004(this.field5553).method25931(array, 4 * Class6362.method19003(this.field5553), this.field5552);
                        Class6362.method19004(this.field5553).method25931(array, 6 * Class6362.method19003(this.field5553), this.field5552);
                        for (int n23 = 0; n23 < Class6362.method19003(this.field5553); ++n23) {
                            final int n24 = n23 * Class6362.method18997(this.field5553) + n15 + n16;
                            final int n25 = 2 * n23;
                            final int n26 = 2 * Class6362.method19003(this.field5553) + 2 * n23;
                            final int n27 = n26 + 2 * Class6362.method19003(this.field5553);
                            final int n28 = n27 + 2 * Class6362.method19003(this.field5553);
                            this.field5551[n24] = array[n25];
                            this.field5551[n24 + 1] = array[n25 + 1];
                            this.field5551[n24 + 2] = array[n26];
                            this.field5551[n24 + 3] = array[n26 + 1];
                            this.field5551[n24 + 4] = array[n27];
                            this.field5551[n24 + 5] = array[n27 + 1];
                            this.field5551[n24 + 6] = array[n28];
                            this.field5551[n24 + 7] = array[n28 + 1];
                        }
                    }
                }
            }
        }
        else if (Class6362.method19001(this.field5553) <= 4) {
            if (Class6362.method19001(this.field5553) != 4) {
                if (Class6362.method19001(this.field5553) == 2) {
                    for (int field5550 = this.field5549; field5550 < Class6362.method18998(this.field5553); field5550 += this.field5550) {
                        final int n29 = field5550 * Class6362.method18999(this.field5553);
                        for (int n30 = 0; n30 < Class6362.method19003(this.field5553); ++n30) {
                            final int n31 = n30 * Class6362.method18997(this.field5553) + n29;
                            final int n32 = 2 * n30;
                            array[n32] = this.field5551[n31];
                            array[n32 + 1] = this.field5551[n31 + 1];
                        }
                        Class6362.method19004(this.field5553).method25927(array, 0);
                        for (int n33 = 0; n33 < Class6362.method19003(this.field5553); ++n33) {
                            final int n34 = n33 * Class6362.method18997(this.field5553) + n29;
                            final int n35 = 2 * n33;
                            this.field5551[n34] = array[n35];
                            this.field5551[n34 + 1] = array[n35 + 1];
                        }
                    }
                }
            }
            else {
                for (int field5551 = this.field5549; field5551 < Class6362.method18998(this.field5553); field5551 += this.field5550) {
                    final int n36 = field5551 * Class6362.method18999(this.field5553);
                    for (int n37 = 0; n37 < Class6362.method19003(this.field5553); ++n37) {
                        final int n38 = n37 * Class6362.method18997(this.field5553) + n36;
                        final int n39 = 2 * n37;
                        final int n40 = 2 * Class6362.method19003(this.field5553) + 2 * n37;
                        array[n39] = this.field5551[n38];
                        array[n39 + 1] = this.field5551[n38 + 1];
                        array[n40] = this.field5551[n38 + 2];
                        array[n40 + 1] = this.field5551[n38 + 3];
                    }
                    Class6362.method19004(this.field5553).method25927(array, 0);
                    Class6362.method19004(this.field5553).method25927(array, 2 * Class6362.method19003(this.field5553));
                    for (int n41 = 0; n41 < Class6362.method19003(this.field5553); ++n41) {
                        final int n42 = n41 * Class6362.method18997(this.field5553) + n36;
                        final int n43 = 2 * n41;
                        final int n44 = 2 * Class6362.method19003(this.field5553) + 2 * n41;
                        this.field5551[n42] = array[n43];
                        this.field5551[n42 + 1] = array[n43 + 1];
                        this.field5551[n42 + 2] = array[n44];
                        this.field5551[n42 + 3] = array[n44 + 1];
                    }
                }
            }
        }
        else {
            for (int field5552 = this.field5549; field5552 < Class6362.method18998(this.field5553); field5552 += this.field5550) {
                final int n45 = field5552 * Class6362.method18999(this.field5553);
                for (int n46 = 0; n46 < Class6362.method19001(this.field5553); n46 += 8) {
                    for (int n47 = 0; n47 < Class6362.method19003(this.field5553); ++n47) {
                        final int n48 = n47 * Class6362.method18997(this.field5553) + n45 + n46;
                        final int n49 = 2 * n47;
                        final int n50 = 2 * Class6362.method19003(this.field5553) + 2 * n47;
                        final int n51 = n50 + 2 * Class6362.method19003(this.field5553);
                        final int n52 = n51 + 2 * Class6362.method19003(this.field5553);
                        array[n49] = this.field5551[n48];
                        array[n49 + 1] = this.field5551[n48 + 1];
                        array[n50] = this.field5551[n48 + 2];
                        array[n50 + 1] = this.field5551[n48 + 3];
                        array[n51] = this.field5551[n48 + 4];
                        array[n51 + 1] = this.field5551[n48 + 5];
                        array[n52] = this.field5551[n48 + 6];
                        array[n52 + 1] = this.field5551[n48 + 7];
                    }
                    Class6362.method19004(this.field5553).method25927(array, 0);
                    Class6362.method19004(this.field5553).method25927(array, 2 * Class6362.method19003(this.field5553));
                    Class6362.method19004(this.field5553).method25927(array, 4 * Class6362.method19003(this.field5553));
                    Class6362.method19004(this.field5553).method25927(array, 6 * Class6362.method19003(this.field5553));
                    for (int n53 = 0; n53 < Class6362.method19003(this.field5553); ++n53) {
                        final int n54 = n53 * Class6362.method18997(this.field5553) + n45 + n46;
                        final int n55 = 2 * n53;
                        final int n56 = 2 * Class6362.method19003(this.field5553) + 2 * n53;
                        final int n57 = n56 + 2 * Class6362.method19003(this.field5553);
                        final int n58 = n57 + 2 * Class6362.method19003(this.field5553);
                        this.field5551[n54] = array[n55];
                        this.field5551[n54 + 1] = array[n55 + 1];
                        this.field5551[n54 + 2] = array[n56];
                        this.field5551[n54 + 3] = array[n56 + 1];
                        this.field5551[n54 + 4] = array[n57];
                        this.field5551[n54 + 5] = array[n57 + 1];
                        this.field5551[n54 + 6] = array[n58];
                        this.field5551[n54 + 7] = array[n58 + 1];
                    }
                }
            }
        }
    }
}
