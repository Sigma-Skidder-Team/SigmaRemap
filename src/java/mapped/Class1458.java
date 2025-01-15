// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1458 implements Runnable
{
    private static String[] field8084;
    public final /* synthetic */ long field8085;
    public final /* synthetic */ int field8086;
    public final /* synthetic */ long field8087;
    public final /* synthetic */ int field8088;
    public final /* synthetic */ Class22 field8089;
    public final /* synthetic */ boolean field8090;
    public final /* synthetic */ Class6362 field8091;
    
    public Class1458(final Class6362 field8091, final long field8092, final int field8093, final long field8094, final int field8095, final Class22 field8096, final boolean field8097) {
        this.field8091 = field8091;
        this.field8085 = field8092;
        this.field8086 = field8093;
        this.field8087 = field8094;
        this.field8088 = field8095;
        this.field8089 = field8096;
        this.field8090 = field8097;
    }
    
    @Override
    public void run() {
        final Class22 class22 = new Class22(this.field8085);
        if (this.field8086 != -1) {
            if (Class6362.method19008(this.field8091) <= 4L) {
                if (Class6362.method19008(this.field8091) != 4L) {
                    if (Class6362.method19008(this.field8091) == 2L) {
                        for (long field8087 = this.field8087; field8087 < Class6362.method19006(this.field8091); field8087 += this.field8088) {
                            final long n = field8087 * Class6362.method19007(this.field8091);
                            for (long n2 = 0L; n2 < Class6362.method19009(this.field8091); ++n2) {
                                final long n3 = n2 * Class6362.method19005(this.field8091) + n;
                                final long n4 = 2L * n2;
                                class22.method169(n4, this.field8089.method135(n3));
                                class22.method169(n4 + 1L, this.field8089.method135(n3 + 1L));
                            }
                            Class6362.method19004(this.field8091).method25932(class22, 0L, this.field8090);
                            for (long n5 = 0L; n5 < Class6362.method19009(this.field8091); ++n5) {
                                final long n6 = n5 * Class6362.method19005(this.field8091) + n;
                                final long n7 = 2L * n5;
                                this.field8089.method169(n6, class22.method135(n7));
                                this.field8089.method169(n6 + 1L, class22.method135(n7 + 1L));
                            }
                        }
                    }
                }
                else {
                    for (long field8088 = this.field8087; field8088 < Class6362.method19006(this.field8091); field8088 += this.field8088) {
                        final long n8 = field8088 * Class6362.method19007(this.field8091);
                        for (long n9 = 0L; n9 < Class6362.method19009(this.field8091); ++n9) {
                            final long n10 = n9 * Class6362.method19005(this.field8091) + n8;
                            final long n11 = 2L * n9;
                            final long n12 = 2L * Class6362.method19009(this.field8091) + 2L * n9;
                            class22.method169(n11, this.field8089.method135(n10));
                            class22.method169(n11 + 1L, this.field8089.method135(n10 + 1L));
                            class22.method169(n12, this.field8089.method135(n10 + 2L));
                            class22.method169(n12 + 1L, this.field8089.method135(n10 + 3L));
                        }
                        Class6362.method19004(this.field8091).method25932(class22, 0L, this.field8090);
                        Class6362.method19004(this.field8091).method25932(class22, 2L * Class6362.method19009(this.field8091), this.field8090);
                        for (long n13 = 0L; n13 < Class6362.method19009(this.field8091); ++n13) {
                            final long n14 = n13 * Class6362.method19005(this.field8091) + n8;
                            final long n15 = 2L * n13;
                            final long n16 = 2L * Class6362.method19009(this.field8091) + 2L * n13;
                            this.field8089.method169(n14, class22.method135(n15));
                            this.field8089.method169(n14 + 1L, class22.method135(n15 + 1L));
                            this.field8089.method169(n14 + 2L, class22.method135(n16));
                            this.field8089.method169(n14 + 3L, class22.method135(n16 + 1L));
                        }
                    }
                }
            }
            else {
                for (long field8089 = this.field8087; field8089 < Class6362.method19006(this.field8091); field8089 += this.field8088) {
                    final long n17 = field8089 * Class6362.method19007(this.field8091);
                    for (long n18 = 0L; n18 < Class6362.method19008(this.field8091); n18 += 8L) {
                        for (long n19 = 0L; n19 < Class6362.method19009(this.field8091); ++n19) {
                            final long n20 = n19 * Class6362.method19005(this.field8091) + n17 + n18;
                            final long n21 = 2L * n19;
                            final long n22 = 2L * Class6362.method19009(this.field8091) + 2L * n19;
                            final long n23 = n22 + 2L * Class6362.method19009(this.field8091);
                            final long n24 = n23 + 2L * Class6362.method19009(this.field8091);
                            class22.method169(n21, this.field8089.method135(n20));
                            class22.method169(n21 + 1L, this.field8089.method135(n20 + 1L));
                            class22.method169(n22, this.field8089.method135(n20 + 2L));
                            class22.method169(n22 + 1L, this.field8089.method135(n20 + 3L));
                            class22.method169(n23, this.field8089.method135(n20 + 4L));
                            class22.method169(n23 + 1L, this.field8089.method135(n20 + 5L));
                            class22.method169(n24, this.field8089.method135(n20 + 6L));
                            class22.method169(n24 + 1L, this.field8089.method135(n20 + 7L));
                        }
                        Class6362.method19004(this.field8091).method25932(class22, 0L, this.field8090);
                        Class6362.method19004(this.field8091).method25932(class22, 2L * Class6362.method19009(this.field8091), this.field8090);
                        Class6362.method19004(this.field8091).method25932(class22, 4L * Class6362.method19009(this.field8091), this.field8090);
                        Class6362.method19004(this.field8091).method25932(class22, 6L * Class6362.method19009(this.field8091), this.field8090);
                        for (long n25 = 0L; n25 < Class6362.method19009(this.field8091); ++n25) {
                            final long n26 = n25 * Class6362.method19005(this.field8091) + n17 + n18;
                            final long n27 = 2L * n25;
                            final long n28 = 2L * Class6362.method19009(this.field8091) + 2L * n25;
                            final long n29 = n28 + 2L * Class6362.method19009(this.field8091);
                            final long n30 = n29 + 2L * Class6362.method19009(this.field8091);
                            this.field8089.method169(n26, class22.method135(n27));
                            this.field8089.method169(n26 + 1L, class22.method135(n27 + 1L));
                            this.field8089.method169(n26 + 2L, class22.method135(n28));
                            this.field8089.method169(n26 + 3L, class22.method135(n28 + 1L));
                            this.field8089.method169(n26 + 4L, class22.method135(n29));
                            this.field8089.method169(n26 + 5L, class22.method135(n29 + 1L));
                            this.field8089.method169(n26 + 6L, class22.method135(n30));
                            this.field8089.method169(n26 + 7L, class22.method135(n30 + 1L));
                        }
                    }
                }
            }
        }
        else if (Class6362.method19008(this.field8091) <= 4L) {
            if (Class6362.method19008(this.field8091) != 4L) {
                if (Class6362.method19008(this.field8091) == 2L) {
                    for (long field8090 = this.field8087; field8090 < Class6362.method19006(this.field8091); field8090 += this.field8088) {
                        final long n31 = field8090 * Class6362.method19007(this.field8091);
                        for (long n32 = 0L; n32 < Class6362.method19009(this.field8091); ++n32) {
                            final long n33 = n32 * Class6362.method19005(this.field8091) + n31;
                            final long n34 = 2L * n32;
                            class22.method169(n34, this.field8089.method135(n33));
                            class22.method169(n34 + 1L, this.field8089.method135(n33 + 1L));
                        }
                        Class6362.method19004(this.field8091).method25928(class22, 0L);
                        for (long n35 = 0L; n35 < Class6362.method19009(this.field8091); ++n35) {
                            final long n36 = n35 * Class6362.method19005(this.field8091) + n31;
                            final long n37 = 2L * n35;
                            this.field8089.method169(n36, class22.method135(n37));
                            this.field8089.method169(n36 + 1L, class22.method135(n37 + 1L));
                        }
                    }
                }
            }
            else {
                for (long field8091 = this.field8087; field8091 < Class6362.method19006(this.field8091); field8091 += this.field8088) {
                    final long n38 = field8091 * Class6362.method19007(this.field8091);
                    for (long n39 = 0L; n39 < Class6362.method19009(this.field8091); ++n39) {
                        final long n40 = n39 * Class6362.method19005(this.field8091) + n38;
                        final long n41 = 2L * n39;
                        final long n42 = 2L * Class6362.method19009(this.field8091) + 2L * n39;
                        class22.method169(n41, this.field8089.method135(n40));
                        class22.method169(n41 + 1L, this.field8089.method135(n40 + 1L));
                        class22.method169(n42, this.field8089.method135(n40 + 2L));
                        class22.method169(n42 + 1L, this.field8089.method135(n40 + 3L));
                    }
                    Class6362.method19004(this.field8091).method25928(class22, 0L);
                    Class6362.method19004(this.field8091).method25928(class22, 2L * Class6362.method19009(this.field8091));
                    for (long n43 = 0L; n43 < Class6362.method19009(this.field8091); ++n43) {
                        final long n44 = n43 * Class6362.method19005(this.field8091) + n38;
                        final long n45 = 2L * n43;
                        final long n46 = 2L * Class6362.method19009(this.field8091) + 2L * n43;
                        this.field8089.method169(n44, class22.method135(n45));
                        this.field8089.method169(n44 + 1L, class22.method135(n45 + 1L));
                        this.field8089.method169(n44 + 2L, class22.method135(n46));
                        this.field8089.method169(n44 + 3L, class22.method135(n46 + 1L));
                    }
                }
            }
        }
        else {
            for (long field8092 = this.field8087; field8092 < Class6362.method19006(this.field8091); field8092 += this.field8088) {
                final long n47 = field8092 * Class6362.method19007(this.field8091);
                for (long n48 = 0L; n48 < Class6362.method19008(this.field8091); n48 += 8L) {
                    for (long n49 = 0L; n49 < Class6362.method19009(this.field8091); ++n49) {
                        final long n50 = n49 * Class6362.method19005(this.field8091) + n47 + n48;
                        final long n51 = 2L * n49;
                        final long n52 = 2L * Class6362.method19009(this.field8091) + 2L * n49;
                        final long n53 = n52 + 2L * Class6362.method19009(this.field8091);
                        final long n54 = n53 + 2L * Class6362.method19009(this.field8091);
                        class22.method169(n51, this.field8089.method135(n50));
                        class22.method169(n51 + 1L, this.field8089.method135(n50 + 1L));
                        class22.method169(n52, this.field8089.method135(n50 + 2L));
                        class22.method169(n52 + 1L, this.field8089.method135(n50 + 3L));
                        class22.method169(n53, this.field8089.method135(n50 + 4L));
                        class22.method169(n53 + 1L, this.field8089.method135(n50 + 5L));
                        class22.method169(n54, this.field8089.method135(n50 + 6L));
                        class22.method169(n54 + 1L, this.field8089.method135(n50 + 7L));
                    }
                    Class6362.method19004(this.field8091).method25928(class22, 0L);
                    Class6362.method19004(this.field8091).method25928(class22, 2L * Class6362.method19009(this.field8091));
                    Class6362.method19004(this.field8091).method25928(class22, 4L * Class6362.method19009(this.field8091));
                    Class6362.method19004(this.field8091).method25928(class22, 6L * Class6362.method19009(this.field8091));
                    for (long n55 = 0L; n55 < Class6362.method19009(this.field8091); ++n55) {
                        final long n56 = n55 * Class6362.method19005(this.field8091) + n47 + n48;
                        final long n57 = 2L * n55;
                        final long n58 = 2L * Class6362.method19009(this.field8091) + 2L * n55;
                        final long n59 = n58 + 2L * Class6362.method19009(this.field8091);
                        final long n60 = n59 + 2L * Class6362.method19009(this.field8091);
                        this.field8089.method169(n56, class22.method135(n57));
                        this.field8089.method169(n56 + 1L, class22.method135(n57 + 1L));
                        this.field8089.method169(n56 + 2L, class22.method135(n58));
                        this.field8089.method169(n56 + 3L, class22.method135(n58 + 1L));
                        this.field8089.method169(n56 + 4L, class22.method135(n59));
                        this.field8089.method169(n56 + 5L, class22.method135(n59 + 1L));
                        this.field8089.method169(n56 + 6L, class22.method135(n60));
                        this.field8089.method169(n56 + 7L, class22.method135(n60 + 1L));
                    }
                }
            }
        }
    }
}
