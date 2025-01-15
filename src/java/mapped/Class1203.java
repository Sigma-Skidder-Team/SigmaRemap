// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1203 implements Runnable
{
    private static String[] field6516;
    public final /* synthetic */ long field6517;
    public final /* synthetic */ int field6518;
    public final /* synthetic */ long field6519;
    public final /* synthetic */ int field6520;
    public final /* synthetic */ long field6521;
    public final /* synthetic */ Class22 field6522;
    public final /* synthetic */ boolean field6523;
    public final /* synthetic */ Class6362 field6524;
    
    public Class1203(final Class6362 field6524, final long field6525, final int field6526, final long field6527, final int field6528, final long field6529, final Class22 field6530, final boolean field6531) {
        this.field6524 = field6524;
        this.field6517 = field6525;
        this.field6518 = field6526;
        this.field6519 = field6527;
        this.field6520 = field6528;
        this.field6521 = field6529;
        this.field6522 = field6530;
        this.field6523 = field6531;
    }
    
    @Override
    public void run() {
        final Class22 class22 = new Class22(this.field6517);
        if (this.field6518 != -1) {
            for (long field6519 = this.field6519; field6519 < Class6362.method19009(this.field6524); field6519 += this.field6520) {
                final long n = field6519 * Class6362.method19005(this.field6524);
                if (this.field6521 == 0L) {
                    for (long n2 = 0L; n2 < Class6362.method19006(this.field6524); ++n2) {
                        Class6362.method19000(this.field6524).method25932(this.field6522, n + n2 * Class6362.method19007(this.field6524), this.field6523);
                    }
                }
                if (Class6362.method19008(this.field6524) <= 4L) {
                    if (Class6362.method19008(this.field6524) != 4L) {
                        if (Class6362.method19008(this.field6524) == 2L) {
                            for (long n3 = 0L; n3 < Class6362.method19006(this.field6524); ++n3) {
                                final long n4 = n + n3 * Class6362.method19007(this.field6524);
                                final long n5 = 2L * n3;
                                class22.method169(n5, this.field6522.method135(n4));
                                class22.method169(n5 + 1L, this.field6522.method135(n4 + 1L));
                            }
                            Class6362.method19002(this.field6524).method25932(class22, 0L, this.field6523);
                            for (long n6 = 0L; n6 < Class6362.method19006(this.field6524); ++n6) {
                                final long n7 = n + n6 * Class6362.method19007(this.field6524);
                                final long n8 = 2L * n6;
                                this.field6522.method169(n7, class22.method135(n8));
                                this.field6522.method169(n7 + 1L, class22.method135(n8 + 1L));
                            }
                        }
                    }
                    else {
                        for (long n9 = 0L; n9 < Class6362.method19006(this.field6524); ++n9) {
                            final long n10 = n + n9 * Class6362.method19007(this.field6524);
                            final long n11 = 2L * n9;
                            final long n12 = 2L * Class6362.method19006(this.field6524) + 2L * n9;
                            class22.method169(n11, this.field6522.method135(n10));
                            class22.method169(n11 + 1L, this.field6522.method135(n10 + 1L));
                            class22.method169(n12, this.field6522.method135(n10 + 2L));
                            class22.method169(n12 + 1L, this.field6522.method135(n10 + 3L));
                        }
                        Class6362.method19002(this.field6524).method25932(class22, 0L, this.field6523);
                        Class6362.method19002(this.field6524).method25932(class22, 2L * Class6362.method19006(this.field6524), this.field6523);
                        for (long n13 = 0L; n13 < Class6362.method19006(this.field6524); ++n13) {
                            final long n14 = n + n13 * Class6362.method19007(this.field6524);
                            final long n15 = 2L * n13;
                            final long n16 = 2L * Class6362.method19006(this.field6524) + 2L * n13;
                            this.field6522.method169(n14, class22.method135(n15));
                            this.field6522.method169(n14 + 1L, class22.method135(n15 + 1L));
                            this.field6522.method169(n14 + 2L, class22.method135(n16));
                            this.field6522.method169(n14 + 3L, class22.method135(n16 + 1L));
                        }
                    }
                }
                else {
                    for (long n17 = 0L; n17 < Class6362.method19008(this.field6524); n17 += 8L) {
                        for (long n18 = 0L; n18 < Class6362.method19006(this.field6524); ++n18) {
                            final long n19 = n + n18 * Class6362.method19007(this.field6524) + n17;
                            final long n20 = 2L * n18;
                            final long n21 = 2L * Class6362.method19006(this.field6524) + 2L * n18;
                            final long n22 = n21 + 2L * Class6362.method19006(this.field6524);
                            final long n23 = n22 + 2L * Class6362.method19006(this.field6524);
                            class22.method169(n20, this.field6522.method135(n19));
                            class22.method169(n20 + 1L, this.field6522.method135(n19 + 1L));
                            class22.method169(n21, this.field6522.method135(n19 + 2L));
                            class22.method169(n21 + 1L, this.field6522.method135(n19 + 3L));
                            class22.method169(n22, this.field6522.method135(n19 + 4L));
                            class22.method169(n22 + 1L, this.field6522.method135(n19 + 5L));
                            class22.method169(n23, this.field6522.method135(n19 + 6L));
                            class22.method169(n23 + 1L, this.field6522.method135(n19 + 7L));
                        }
                        Class6362.method19002(this.field6524).method25932(class22, 0L, this.field6523);
                        Class6362.method19002(this.field6524).method25932(class22, 2L * Class6362.method19006(this.field6524), this.field6523);
                        Class6362.method19002(this.field6524).method25932(class22, 4L * Class6362.method19006(this.field6524), this.field6523);
                        Class6362.method19002(this.field6524).method25932(class22, 6L * Class6362.method19006(this.field6524), this.field6523);
                        for (long n24 = 0L; n24 < Class6362.method19006(this.field6524); ++n24) {
                            final long n25 = n + n24 * Class6362.method19007(this.field6524) + n17;
                            final long n26 = 2L * n24;
                            final long n27 = 2L * Class6362.method19006(this.field6524) + 2L * n24;
                            final long n28 = n27 + 2L * Class6362.method19006(this.field6524);
                            final long n29 = n28 + 2L * Class6362.method19006(this.field6524);
                            this.field6522.method169(n25, class22.method135(n26));
                            this.field6522.method169(n25 + 1L, class22.method135(n26 + 1L));
                            this.field6522.method169(n25 + 2L, class22.method135(n27));
                            this.field6522.method169(n25 + 3L, class22.method135(n27 + 1L));
                            this.field6522.method169(n25 + 4L, class22.method135(n28));
                            this.field6522.method169(n25 + 5L, class22.method135(n28 + 1L));
                            this.field6522.method169(n25 + 6L, class22.method135(n29));
                            this.field6522.method169(n25 + 7L, class22.method135(n29 + 1L));
                        }
                    }
                }
                if (this.field6521 != 0L) {
                    for (long n30 = 0L; n30 < Class6362.method19006(this.field6524); ++n30) {
                        Class6362.method19000(this.field6524).method25944(this.field6522, n + n30 * Class6362.method19007(this.field6524), this.field6523);
                    }
                }
            }
        }
        else {
            for (long field6520 = this.field6519; field6520 < Class6362.method19009(this.field6524); field6520 += this.field6520) {
                final long n31 = field6520 * Class6362.method19005(this.field6524);
                if (this.field6521 != 0L) {
                    for (long n32 = 0L; n32 < Class6362.method19006(this.field6524); ++n32) {
                        Class6362.method19000(this.field6524).method25936(this.field6522, n31 + n32 * Class6362.method19007(this.field6524));
                    }
                }
                else {
                    for (long n33 = 0L; n33 < Class6362.method19006(this.field6524); ++n33) {
                        Class6362.method19000(this.field6524).method25928(this.field6522, n31 + n33 * Class6362.method19007(this.field6524));
                    }
                }
                if (Class6362.method19008(this.field6524) <= 4L) {
                    if (Class6362.method19008(this.field6524) != 4L) {
                        if (Class6362.method19008(this.field6524) == 2L) {
                            for (long n34 = 0L; n34 < Class6362.method19006(this.field6524); ++n34) {
                                final long n35 = n31 + n34 * Class6362.method19007(this.field6524);
                                final long n36 = 2L * n34;
                                class22.method169(n36, this.field6522.method135(n35));
                                class22.method169(n36 + 1L, this.field6522.method135(n35 + 1L));
                            }
                            Class6362.method19002(this.field6524).method25928(class22, 0L);
                            for (long n37 = 0L; n37 < Class6362.method19006(this.field6524); ++n37) {
                                final long n38 = n31 + n37 * Class6362.method19007(this.field6524);
                                final long n39 = 2L * n37;
                                this.field6522.method169(n38, class22.method135(n39));
                                this.field6522.method169(n38 + 1L, class22.method135(n39 + 1L));
                            }
                        }
                    }
                    else {
                        for (long n40 = 0L; n40 < Class6362.method19006(this.field6524); ++n40) {
                            final long n41 = n31 + n40 * Class6362.method19007(this.field6524);
                            final long n42 = 2L * n40;
                            final long n43 = 2L * Class6362.method19006(this.field6524) + 2L * n40;
                            class22.method169(n42, this.field6522.method135(n41));
                            class22.method169(n42 + 1L, this.field6522.method135(n41 + 1L));
                            class22.method169(n43, this.field6522.method135(n41 + 2L));
                            class22.method169(n43 + 1L, this.field6522.method135(n41 + 3L));
                        }
                        Class6362.method19002(this.field6524).method25928(class22, 0L);
                        Class6362.method19002(this.field6524).method25928(class22, 2L * Class6362.method19006(this.field6524));
                        for (long n44 = 0L; n44 < Class6362.method19006(this.field6524); ++n44) {
                            final long n45 = n31 + n44 * Class6362.method19007(this.field6524);
                            final long n46 = 2L * n44;
                            final long n47 = 2L * Class6362.method19006(this.field6524) + 2L * n44;
                            this.field6522.method169(n45, class22.method135(n46));
                            this.field6522.method169(n45 + 1L, class22.method135(n46 + 1L));
                            this.field6522.method169(n45 + 2L, class22.method135(n47));
                            this.field6522.method169(n45 + 3L, class22.method135(n47 + 1L));
                        }
                    }
                }
                else {
                    for (long n48 = 0L; n48 < Class6362.method19008(this.field6524); n48 += 8L) {
                        for (long n49 = 0L; n49 < Class6362.method19006(this.field6524); ++n49) {
                            final long n50 = n31 + n49 * Class6362.method19007(this.field6524) + n48;
                            final long n51 = 2L * n49;
                            final long n52 = 2L * Class6362.method19006(this.field6524) + 2L * n49;
                            final long n53 = n52 + 2L * Class6362.method19006(this.field6524);
                            final long n54 = n53 + 2L * Class6362.method19006(this.field6524);
                            class22.method169(n51, this.field6522.method135(n50));
                            class22.method169(n51 + 1L, this.field6522.method135(n50 + 1L));
                            class22.method169(n52, this.field6522.method135(n50 + 2L));
                            class22.method169(n52 + 1L, this.field6522.method135(n50 + 3L));
                            class22.method169(n53, this.field6522.method135(n50 + 4L));
                            class22.method169(n53 + 1L, this.field6522.method135(n50 + 5L));
                            class22.method169(n54, this.field6522.method135(n50 + 6L));
                            class22.method169(n54 + 1L, this.field6522.method135(n50 + 7L));
                        }
                        Class6362.method19002(this.field6524).method25928(class22, 0L);
                        Class6362.method19002(this.field6524).method25928(class22, 2L * Class6362.method19006(this.field6524));
                        Class6362.method19002(this.field6524).method25928(class22, 4L * Class6362.method19006(this.field6524));
                        Class6362.method19002(this.field6524).method25928(class22, 6L * Class6362.method19006(this.field6524));
                        for (long n55 = 0L; n55 < Class6362.method19006(this.field6524); ++n55) {
                            final long n56 = n31 + n55 * Class6362.method19007(this.field6524) + n48;
                            final long n57 = 2L * n55;
                            final long n58 = 2L * Class6362.method19006(this.field6524) + 2L * n55;
                            final long n59 = n58 + 2L * Class6362.method19006(this.field6524);
                            final long n60 = n59 + 2L * Class6362.method19006(this.field6524);
                            this.field6522.method169(n56, class22.method135(n57));
                            this.field6522.method169(n56 + 1L, class22.method135(n57 + 1L));
                            this.field6522.method169(n56 + 2L, class22.method135(n58));
                            this.field6522.method169(n56 + 3L, class22.method135(n58 + 1L));
                            this.field6522.method169(n56 + 4L, class22.method135(n59));
                            this.field6522.method169(n56 + 5L, class22.method135(n59 + 1L));
                            this.field6522.method169(n56 + 6L, class22.method135(n60));
                            this.field6522.method169(n56 + 7L, class22.method135(n60 + 1L));
                        }
                    }
                }
            }
        }
    }
}
