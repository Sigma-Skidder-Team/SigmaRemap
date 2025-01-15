// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1647 implements Runnable
{
    private static String[] field9210;
    public final /* synthetic */ long field9211;
    public final /* synthetic */ int field9212;
    public final /* synthetic */ int field9213;
    public final /* synthetic */ long field9214;
    public final /* synthetic */ Class22 field9215;
    public final /* synthetic */ boolean field9216;
    public final /* synthetic */ Class8328 field9217;
    
    public Class1647(final Class8328 field9217, final long field9218, final int field9219, final int field9220, final long field9221, final Class22 field9222, final boolean field9223) {
        this.field9217 = field9217;
        this.field9211 = field9218;
        this.field9212 = field9219;
        this.field9213 = field9220;
        this.field9214 = field9221;
        this.field9215 = field9222;
        this.field9216 = field9223;
    }
    
    @Override
    public void run() {
        final Class22 class22 = new Class22(this.field9211);
        if (this.field9212 != -1) {
            if (Class8328.method27764(this.field9217) <= 4 * this.field9213) {
                if (Class8328.method27764(this.field9217) != 4 * this.field9213) {
                    if (Class8328.method27764(this.field9217) == 2 * this.field9213) {
                        for (long n = 0L; n < Class8328.method27762(this.field9217); ++n) {
                            final long n2 = n * Class8328.method27764(this.field9217) + 2L * this.field9214;
                            final long n3 = 2L * n;
                            class22.method171(n3, this.field9215.method135(n2));
                            class22.method171(n3 + 1L, this.field9215.method135(n2 + 1L));
                        }
                        Class8328.method27761(this.field9217).method25932(class22, 0L, this.field9216);
                        for (long n4 = 0L; n4 < Class8328.method27762(this.field9217); ++n4) {
                            final long n5 = n4 * Class8328.method27764(this.field9217) + 2L * this.field9214;
                            final long n6 = 2L * n4;
                            this.field9215.method171(n5, class22.method135(n6));
                            this.field9215.method171(n5 + 1L, class22.method135(n6 + 1L));
                        }
                    }
                }
                else {
                    for (long n7 = 0L; n7 < Class8328.method27762(this.field9217); ++n7) {
                        final long n8 = n7 * Class8328.method27764(this.field9217) + 4L * this.field9214;
                        final long n9 = 2L * n7;
                        final long n10 = 2L * Class8328.method27762(this.field9217) + 2L * n7;
                        class22.method171(n9, this.field9215.method135(n8));
                        class22.method171(n9 + 1L, this.field9215.method135(n8 + 1L));
                        class22.method171(n10, this.field9215.method135(n8 + 2L));
                        class22.method171(n10 + 1L, this.field9215.method135(n8 + 3L));
                    }
                    Class8328.method27761(this.field9217).method25932(class22, 0L, this.field9216);
                    Class8328.method27761(this.field9217).method25932(class22, 2L * Class8328.method27762(this.field9217), this.field9216);
                    for (long n11 = 0L; n11 < Class8328.method27762(this.field9217); ++n11) {
                        final long n12 = n11 * Class8328.method27764(this.field9217) + 4L * this.field9214;
                        final long n13 = 2L * n11;
                        final long n14 = 2L * Class8328.method27762(this.field9217) + 2L * n11;
                        this.field9215.method171(n12, class22.method135(n13));
                        this.field9215.method171(n12 + 1L, class22.method135(n13 + 1L));
                        this.field9215.method171(n12 + 2L, class22.method135(n14));
                        this.field9215.method171(n12 + 3L, class22.method135(n14 + 1L));
                    }
                }
            }
            else {
                for (long n15 = 8L * this.field9214; n15 < Class8328.method27764(this.field9217); n15 += 8 * this.field9213) {
                    for (long n16 = 0L; n16 < Class8328.method27762(this.field9217); ++n16) {
                        final long n17 = n16 * Class8328.method27764(this.field9217) + n15;
                        final long n18 = 2L * n16;
                        final long n19 = 2L * Class8328.method27762(this.field9217) + 2L * n16;
                        final long n20 = n19 + 2L * Class8328.method27762(this.field9217);
                        final long n21 = n20 + 2L * Class8328.method27762(this.field9217);
                        class22.method171(n18, this.field9215.method135(n17));
                        class22.method171(n18 + 1L, this.field9215.method135(n17 + 1L));
                        class22.method171(n19, this.field9215.method135(n17 + 2L));
                        class22.method171(n19 + 1L, this.field9215.method135(n17 + 3L));
                        class22.method171(n20, this.field9215.method135(n17 + 4L));
                        class22.method171(n20 + 1L, this.field9215.method135(n17 + 5L));
                        class22.method171(n21, this.field9215.method135(n17 + 6L));
                        class22.method171(n21 + 1L, this.field9215.method135(n17 + 7L));
                    }
                    Class8328.method27761(this.field9217).method25932(class22, 0L, this.field9216);
                    Class8328.method27761(this.field9217).method25932(class22, 2L * Class8328.method27762(this.field9217), this.field9216);
                    Class8328.method27761(this.field9217).method25932(class22, 4L * Class8328.method27762(this.field9217), this.field9216);
                    Class8328.method27761(this.field9217).method25932(class22, 6L * Class8328.method27762(this.field9217), this.field9216);
                    for (long n22 = 0L; n22 < Class8328.method27762(this.field9217); ++n22) {
                        final long n23 = n22 * Class8328.method27764(this.field9217) + n15;
                        final long n24 = 2L * n22;
                        final long n25 = 2L * Class8328.method27762(this.field9217) + 2L * n22;
                        final long n26 = n25 + 2L * Class8328.method27762(this.field9217);
                        final long n27 = n26 + 2L * Class8328.method27762(this.field9217);
                        this.field9215.method171(n23, class22.method135(n24));
                        this.field9215.method171(n23 + 1L, class22.method135(n24 + 1L));
                        this.field9215.method171(n23 + 2L, class22.method135(n25));
                        this.field9215.method171(n23 + 3L, class22.method135(n25 + 1L));
                        this.field9215.method171(n23 + 4L, class22.method135(n26));
                        this.field9215.method171(n23 + 5L, class22.method135(n26 + 1L));
                        this.field9215.method171(n23 + 6L, class22.method135(n27));
                        this.field9215.method171(n23 + 7L, class22.method135(n27 + 1L));
                    }
                }
            }
        }
        else if (Class8328.method27764(this.field9217) <= 4 * this.field9213) {
            if (Class8328.method27764(this.field9217) != 4 * this.field9213) {
                if (Class8328.method27764(this.field9217) == 2 * this.field9213) {
                    for (long n28 = 0L; n28 < Class8328.method27762(this.field9217); ++n28) {
                        final long n29 = n28 * Class8328.method27764(this.field9217) + 2L * this.field9214;
                        final long n30 = 2L * n28;
                        class22.method171(n30, this.field9215.method135(n29));
                        class22.method171(n30 + 1L, this.field9215.method135(n29 + 1L));
                    }
                    Class8328.method27761(this.field9217).method25928(class22, 0L);
                    for (long n31 = 0L; n31 < Class8328.method27762(this.field9217); ++n31) {
                        final long n32 = n31 * Class8328.method27764(this.field9217) + 2L * this.field9214;
                        final long n33 = 2L * n31;
                        this.field9215.method171(n32, class22.method135(n33));
                        this.field9215.method171(n32 + 1L, class22.method135(n33 + 1L));
                    }
                }
            }
            else {
                for (long n34 = 0L; n34 < Class8328.method27762(this.field9217); ++n34) {
                    final long n35 = n34 * Class8328.method27764(this.field9217) + 4L * this.field9214;
                    final long n36 = 2L * n34;
                    final long n37 = 2L * Class8328.method27762(this.field9217) + 2L * n34;
                    class22.method171(n36, this.field9215.method135(n35));
                    class22.method171(n36 + 1L, this.field9215.method135(n35 + 1L));
                    class22.method171(n37, this.field9215.method135(n35 + 2L));
                    class22.method171(n37 + 1L, this.field9215.method135(n35 + 3L));
                }
                Class8328.method27761(this.field9217).method25928(class22, 0L);
                Class8328.method27761(this.field9217).method25928(class22, 2L * Class8328.method27762(this.field9217));
                for (long n38 = 0L; n38 < Class8328.method27762(this.field9217); ++n38) {
                    final long n39 = n38 * Class8328.method27764(this.field9217) + 4L * this.field9214;
                    final long n40 = 2L * n38;
                    final long n41 = 2L * Class8328.method27762(this.field9217) + 2L * n38;
                    this.field9215.method171(n39, class22.method135(n40));
                    this.field9215.method171(n39 + 1L, class22.method135(n40 + 1L));
                    this.field9215.method171(n39 + 2L, class22.method135(n41));
                    this.field9215.method171(n39 + 3L, class22.method135(n41 + 1L));
                }
            }
        }
        else {
            for (long n42 = 8L * this.field9214; n42 < Class8328.method27764(this.field9217); n42 += 8 * this.field9213) {
                for (long n43 = 0L; n43 < Class8328.method27762(this.field9217); ++n43) {
                    final long n44 = n43 * Class8328.method27764(this.field9217) + n42;
                    final long n45 = 2L * n43;
                    final long n46 = 2L * Class8328.method27762(this.field9217) + 2L * n43;
                    final long n47 = n46 + 2L * Class8328.method27762(this.field9217);
                    final long n48 = n47 + 2L * Class8328.method27762(this.field9217);
                    class22.method171(n45, this.field9215.method135(n44));
                    class22.method171(n45 + 1L, this.field9215.method135(n44 + 1L));
                    class22.method171(n46, this.field9215.method135(n44 + 2L));
                    class22.method171(n46 + 1L, this.field9215.method135(n44 + 3L));
                    class22.method171(n47, this.field9215.method135(n44 + 4L));
                    class22.method171(n47 + 1L, this.field9215.method135(n44 + 5L));
                    class22.method171(n48, this.field9215.method135(n44 + 6L));
                    class22.method171(n48 + 1L, this.field9215.method135(n44 + 7L));
                }
                Class8328.method27761(this.field9217).method25928(class22, 0L);
                Class8328.method27761(this.field9217).method25928(class22, 2L * Class8328.method27762(this.field9217));
                Class8328.method27761(this.field9217).method25928(class22, 4L * Class8328.method27762(this.field9217));
                Class8328.method27761(this.field9217).method25928(class22, 6L * Class8328.method27762(this.field9217));
                for (long n49 = 0L; n49 < Class8328.method27762(this.field9217); ++n49) {
                    final long n50 = n49 * Class8328.method27764(this.field9217) + n42;
                    final long n51 = 2L * n49;
                    final long n52 = 2L * Class8328.method27762(this.field9217) + 2L * n49;
                    final long n53 = n52 + 2L * Class8328.method27762(this.field9217);
                    final long n54 = n53 + 2L * Class8328.method27762(this.field9217);
                    this.field9215.method171(n50, class22.method135(n51));
                    this.field9215.method171(n50 + 1L, class22.method135(n51 + 1L));
                    this.field9215.method171(n50 + 2L, class22.method135(n52));
                    this.field9215.method171(n50 + 3L, class22.method135(n52 + 1L));
                    this.field9215.method171(n50 + 4L, class22.method135(n53));
                    this.field9215.method171(n50 + 5L, class22.method135(n53 + 1L));
                    this.field9215.method171(n50 + 6L, class22.method135(n54));
                    this.field9215.method171(n50 + 7L, class22.method135(n54 + 1L));
                }
            }
        }
    }
}
