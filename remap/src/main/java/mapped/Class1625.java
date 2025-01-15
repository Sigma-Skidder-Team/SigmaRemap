// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1625 implements Runnable
{
    private static String[] field9074;
    public final /* synthetic */ long field9075;
    public final /* synthetic */ int field9076;
    public final /* synthetic */ long field9077;
    public final /* synthetic */ int field9078;
    public final /* synthetic */ long field9079;
    public final /* synthetic */ Class22 field9080;
    public final /* synthetic */ boolean field9081;
    public final /* synthetic */ Class6362 field9082;
    
    public Class1625(final Class6362 field9082, final long field9083, final int field9084, final long field9085, final int field9086, final long field9087, final Class22 field9088, final boolean field9089) {
        this.field9082 = field9082;
        this.field9075 = field9083;
        this.field9076 = field9084;
        this.field9077 = field9085;
        this.field9078 = field9086;
        this.field9079 = field9087;
        this.field9080 = field9088;
        this.field9081 = field9089;
    }
    
    @Override
    public void run() {
        final Class22 class22 = new Class22(this.field9075);
        if (this.field9076 != -1) {
            for (long field9077 = this.field9077; field9077 < Class6362.method19009(this.field9082); field9077 += this.field9078) {
                final long n = field9077 * Class6362.method19005(this.field9082);
                if (this.field9079 != 0L) {
                    for (long n2 = 0L; n2 < Class6362.method19006(this.field9082); ++n2) {
                        Class6362.method19000(this.field9082).method25950(this.field9080, n + n2 * Class6362.method19007(this.field9082), this.field9081);
                    }
                }
                else {
                    for (long n3 = 0L; n3 < Class6362.method19006(this.field9082); ++n3) {
                        Class6362.method19000(this.field9082).method25932(this.field9080, n + n3 * Class6362.method19007(this.field9082), this.field9081);
                    }
                }
                if (Class6362.method19008(this.field9082) <= 4L) {
                    if (Class6362.method19008(this.field9082) != 4L) {
                        if (Class6362.method19008(this.field9082) == 2L) {
                            for (long n4 = 0L; n4 < Class6362.method19006(this.field9082); ++n4) {
                                final long n5 = n + n4 * Class6362.method19007(this.field9082);
                                final long n6 = 2L * n4;
                                class22.method169(n6, this.field9080.method135(n5));
                                class22.method169(n6 + 1L, this.field9080.method135(n5 + 1L));
                            }
                            Class6362.method19002(this.field9082).method25932(class22, 0L, this.field9081);
                            for (long n7 = 0L; n7 < Class6362.method19006(this.field9082); ++n7) {
                                final long n8 = n + n7 * Class6362.method19007(this.field9082);
                                final long n9 = 2L * n7;
                                this.field9080.method169(n8, class22.method135(n9));
                                this.field9080.method169(n8 + 1L, class22.method135(n9 + 1L));
                            }
                        }
                    }
                    else {
                        for (long n10 = 0L; n10 < Class6362.method19006(this.field9082); ++n10) {
                            final long n11 = n + n10 * Class6362.method19007(this.field9082);
                            final long n12 = 2L * n10;
                            final long n13 = 2L * Class6362.method19006(this.field9082) + 2L * n10;
                            class22.method169(n12, this.field9080.method135(n11));
                            class22.method169(n12 + 1L, this.field9080.method135(n11 + 1L));
                            class22.method169(n13, this.field9080.method135(n11 + 2L));
                            class22.method169(n13 + 1L, this.field9080.method135(n11 + 3L));
                        }
                        Class6362.method19002(this.field9082).method25932(class22, 0L, this.field9081);
                        Class6362.method19002(this.field9082).method25932(class22, 2L * Class6362.method19006(this.field9082), this.field9081);
                        for (long n14 = 0L; n14 < Class6362.method19006(this.field9082); ++n14) {
                            final long n15 = n + n14 * Class6362.method19007(this.field9082);
                            final long n16 = 2L * n14;
                            final long n17 = 2L * Class6362.method19006(this.field9082) + 2L * n14;
                            this.field9080.method169(n15, class22.method135(n16));
                            this.field9080.method169(n15 + 1L, class22.method135(n16 + 1L));
                            this.field9080.method169(n15 + 2L, class22.method135(n17));
                            this.field9080.method169(n15 + 3L, class22.method135(n17 + 1L));
                        }
                    }
                }
                else {
                    for (long n18 = 0L; n18 < Class6362.method19008(this.field9082); n18 += 8L) {
                        for (long n19 = 0L; n19 < Class6362.method19006(this.field9082); ++n19) {
                            final long n20 = n + n19 * Class6362.method19007(this.field9082) + n18;
                            final long n21 = 2L * n19;
                            final long n22 = 2L * Class6362.method19006(this.field9082) + 2L * n19;
                            final long n23 = n22 + 2L * Class6362.method19006(this.field9082);
                            final long n24 = n23 + 2L * Class6362.method19006(this.field9082);
                            class22.method169(n21, this.field9080.method135(n20));
                            class22.method169(n21 + 1L, this.field9080.method135(n20 + 1L));
                            class22.method169(n22, this.field9080.method135(n20 + 2L));
                            class22.method169(n22 + 1L, this.field9080.method135(n20 + 3L));
                            class22.method169(n23, this.field9080.method135(n20 + 4L));
                            class22.method169(n23 + 1L, this.field9080.method135(n20 + 5L));
                            class22.method169(n24, this.field9080.method135(n20 + 6L));
                            class22.method169(n24 + 1L, this.field9080.method135(n20 + 7L));
                        }
                        Class6362.method19002(this.field9082).method25932(class22, 0L, this.field9081);
                        Class6362.method19002(this.field9082).method25932(class22, 2L * Class6362.method19006(this.field9082), this.field9081);
                        Class6362.method19002(this.field9082).method25932(class22, 4L * Class6362.method19006(this.field9082), this.field9081);
                        Class6362.method19002(this.field9082).method25932(class22, 6L * Class6362.method19006(this.field9082), this.field9081);
                        for (long n25 = 0L; n25 < Class6362.method19006(this.field9082); ++n25) {
                            final long n26 = n + n25 * Class6362.method19007(this.field9082) + n18;
                            final long n27 = 2L * n25;
                            final long n28 = 2L * Class6362.method19006(this.field9082) + 2L * n25;
                            final long n29 = n28 + 2L * Class6362.method19006(this.field9082);
                            final long n30 = n29 + 2L * Class6362.method19006(this.field9082);
                            this.field9080.method169(n26, class22.method135(n27));
                            this.field9080.method169(n26 + 1L, class22.method135(n27 + 1L));
                            this.field9080.method169(n26 + 2L, class22.method135(n28));
                            this.field9080.method169(n26 + 3L, class22.method135(n28 + 1L));
                            this.field9080.method169(n26 + 4L, class22.method135(n29));
                            this.field9080.method169(n26 + 5L, class22.method135(n29 + 1L));
                            this.field9080.method169(n26 + 6L, class22.method135(n30));
                            this.field9080.method169(n26 + 7L, class22.method135(n30 + 1L));
                        }
                    }
                }
            }
        }
        else {
            for (long field9078 = this.field9077; field9078 < Class6362.method19009(this.field9082); field9078 += this.field9078) {
                final long n31 = field9078 * Class6362.method19005(this.field9082);
                if (this.field9079 != 0L) {
                    for (long n32 = 0L; n32 < Class6362.method19006(this.field9082); ++n32) {
                        Class6362.method19000(this.field9082).method25936(this.field9080, n31 + n32 * Class6362.method19007(this.field9082));
                    }
                }
                else {
                    for (long n33 = 0L; n33 < Class6362.method19006(this.field9082); ++n33) {
                        Class6362.method19000(this.field9082).method25928(this.field9080, n31 + n33 * Class6362.method19007(this.field9082));
                    }
                }
                if (Class6362.method19008(this.field9082) <= 4L) {
                    if (Class6362.method19008(this.field9082) != 4L) {
                        if (Class6362.method19008(this.field9082) == 2L) {
                            for (long n34 = 0L; n34 < Class6362.method19006(this.field9082); ++n34) {
                                final long n35 = n31 + n34 * Class6362.method19007(this.field9082);
                                final long n36 = 2L * n34;
                                class22.method169(n36, this.field9080.method135(n35));
                                class22.method169(n36 + 1L, this.field9080.method135(n35 + 1L));
                            }
                            Class6362.method19002(this.field9082).method25928(class22, 0L);
                            for (long n37 = 0L; n37 < Class6362.method19006(this.field9082); ++n37) {
                                final long n38 = n31 + n37 * Class6362.method19007(this.field9082);
                                final long n39 = 2L * n37;
                                this.field9080.method169(n38, class22.method135(n39));
                                this.field9080.method169(n38 + 1L, class22.method135(n39 + 1L));
                            }
                        }
                    }
                    else {
                        for (long n40 = 0L; n40 < Class6362.method19006(this.field9082); ++n40) {
                            final long n41 = n31 + n40 * Class6362.method19007(this.field9082);
                            final long n42 = 2L * n40;
                            final long n43 = 2L * Class6362.method19006(this.field9082) + 2L * n40;
                            class22.method169(n42, this.field9080.method135(n41));
                            class22.method169(n42 + 1L, this.field9080.method135(n41 + 1L));
                            class22.method169(n43, this.field9080.method135(n41 + 2L));
                            class22.method169(n43 + 1L, this.field9080.method135(n41 + 3L));
                        }
                        Class6362.method19002(this.field9082).method25928(class22, 0L);
                        Class6362.method19002(this.field9082).method25928(class22, 2L * Class6362.method19006(this.field9082));
                        for (long n44 = 0L; n44 < Class6362.method19006(this.field9082); ++n44) {
                            final long n45 = n31 + n44 * Class6362.method19007(this.field9082);
                            final long n46 = 2L * n44;
                            final long n47 = 2L * Class6362.method19006(this.field9082) + 2L * n44;
                            this.field9080.method169(n45, class22.method135(n46));
                            this.field9080.method169(n45 + 1L, class22.method135(n46 + 1L));
                            this.field9080.method169(n45 + 2L, class22.method135(n47));
                            this.field9080.method169(n45 + 3L, class22.method135(n47 + 1L));
                        }
                    }
                }
                else {
                    for (long n48 = 0L; n48 < Class6362.method19008(this.field9082); n48 += 8L) {
                        for (long n49 = 0L; n49 < Class6362.method19006(this.field9082); ++n49) {
                            final long n50 = n31 + n49 * Class6362.method19007(this.field9082) + n48;
                            final long n51 = 2L * n49;
                            final long n52 = 2L * Class6362.method19006(this.field9082) + 2L * n49;
                            final long n53 = n52 + 2L * Class6362.method19006(this.field9082);
                            final long n54 = n53 + 2L * Class6362.method19006(this.field9082);
                            class22.method169(n51, this.field9080.method135(n50));
                            class22.method169(n51 + 1L, this.field9080.method135(n50 + 1L));
                            class22.method169(n52, this.field9080.method135(n50 + 2L));
                            class22.method169(n52 + 1L, this.field9080.method135(n50 + 3L));
                            class22.method169(n53, this.field9080.method135(n50 + 4L));
                            class22.method169(n53 + 1L, this.field9080.method135(n50 + 5L));
                            class22.method169(n54, this.field9080.method135(n50 + 6L));
                            class22.method169(n54 + 1L, this.field9080.method135(n50 + 7L));
                        }
                        Class6362.method19002(this.field9082).method25928(class22, 0L);
                        Class6362.method19002(this.field9082).method25928(class22, 2L * Class6362.method19006(this.field9082));
                        Class6362.method19002(this.field9082).method25928(class22, 4L * Class6362.method19006(this.field9082));
                        Class6362.method19002(this.field9082).method25928(class22, 6L * Class6362.method19006(this.field9082));
                        for (long n55 = 0L; n55 < Class6362.method19006(this.field9082); ++n55) {
                            final long n56 = n31 + n55 * Class6362.method19007(this.field9082) + n48;
                            final long n57 = 2L * n55;
                            final long n58 = 2L * Class6362.method19006(this.field9082) + 2L * n55;
                            final long n59 = n58 + 2L * Class6362.method19006(this.field9082);
                            final long n60 = n59 + 2L * Class6362.method19006(this.field9082);
                            this.field9080.method169(n56, class22.method135(n57));
                            this.field9080.method169(n56 + 1L, class22.method135(n57 + 1L));
                            this.field9080.method169(n56 + 2L, class22.method135(n58));
                            this.field9080.method169(n56 + 3L, class22.method135(n58 + 1L));
                            this.field9080.method169(n56 + 4L, class22.method135(n59));
                            this.field9080.method169(n56 + 5L, class22.method135(n59 + 1L));
                            this.field9080.method169(n56 + 6L, class22.method135(n60));
                            this.field9080.method169(n56 + 7L, class22.method135(n60 + 1L));
                        }
                    }
                }
            }
        }
    }
}
