// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1150 implements Runnable
{
    private static String[] field6219;
    public final /* synthetic */ long field6220;
    public final /* synthetic */ int field6221;
    public final /* synthetic */ long field6222;
    public final /* synthetic */ int field6223;
    public final /* synthetic */ long field6224;
    public final /* synthetic */ Class17 field6225;
    public final /* synthetic */ boolean field6226;
    public final /* synthetic */ Class6733 field6227;
    
    public Class1150(final Class6733 field6227, final long field6228, final int field6229, final long field6230, final int field6231, final long field6232, final Class17 field6233, final boolean field6234) {
        this.field6227 = field6227;
        this.field6220 = field6228;
        this.field6221 = field6229;
        this.field6222 = field6230;
        this.field6223 = field6231;
        this.field6224 = field6232;
        this.field6225 = field6233;
        this.field6226 = field6234;
    }
    
    @Override
    public void run() {
        final Class17 class17 = new Class17(this.field6220);
        if (this.field6221 != -1) {
            for (long field6222 = this.field6222; field6222 < Class6733.method20485(this.field6227); field6222 += this.field6223) {
                final long n = field6222 * Class6733.method20481(this.field6227);
                if (this.field6224 != 0L) {
                    for (long n2 = 0L; n2 < Class6733.method20482(this.field6227); ++n2) {
                        Class6733.method20476(this.field6227).method26097(this.field6225, n + n2 * Class6733.method20483(this.field6227), this.field6226);
                    }
                }
                else {
                    for (long n3 = 0L; n3 < Class6733.method20482(this.field6227); ++n3) {
                        Class6733.method20476(this.field6227).method26079(this.field6225, n + n3 * Class6733.method20483(this.field6227), this.field6226);
                    }
                }
                if (Class6733.method20484(this.field6227) <= 4L) {
                    if (Class6733.method20484(this.field6227) != 4L) {
                        if (Class6733.method20484(this.field6227) == 2L) {
                            for (long n4 = 0L; n4 < Class6733.method20482(this.field6227); ++n4) {
                                final long n5 = n + n4 * Class6733.method20483(this.field6227);
                                final long n6 = 2L * n4;
                                class17.method171(n6, this.field6225.method137(n5));
                                class17.method171(n6 + 1L, this.field6225.method137(n5 + 1L));
                            }
                            Class6733.method20478(this.field6227).method26079(class17, 0L, this.field6226);
                            for (long n7 = 0L; n7 < Class6733.method20482(this.field6227); ++n7) {
                                final long n8 = n + n7 * Class6733.method20483(this.field6227);
                                final long n9 = 2L * n7;
                                this.field6225.method171(n8, class17.method137(n9));
                                this.field6225.method171(n8 + 1L, class17.method137(n9 + 1L));
                            }
                        }
                    }
                    else {
                        for (long n10 = 0L; n10 < Class6733.method20482(this.field6227); ++n10) {
                            final long n11 = n + n10 * Class6733.method20483(this.field6227);
                            final long n12 = 2L * n10;
                            final long n13 = 2L * Class6733.method20482(this.field6227) + 2L * n10;
                            class17.method171(n12, this.field6225.method137(n11));
                            class17.method171(n12 + 1L, this.field6225.method137(n11 + 1L));
                            class17.method171(n13, this.field6225.method137(n11 + 2L));
                            class17.method171(n13 + 1L, this.field6225.method137(n11 + 3L));
                        }
                        Class6733.method20478(this.field6227).method26079(class17, 0L, this.field6226);
                        Class6733.method20478(this.field6227).method26079(class17, 2L * Class6733.method20482(this.field6227), this.field6226);
                        for (long n14 = 0L; n14 < Class6733.method20482(this.field6227); ++n14) {
                            final long n15 = n + n14 * Class6733.method20483(this.field6227);
                            final long n16 = 2L * n14;
                            final long n17 = 2L * Class6733.method20482(this.field6227) + 2L * n14;
                            this.field6225.method171(n15, class17.method137(n16));
                            this.field6225.method171(n15 + 1L, class17.method137(n16 + 1L));
                            this.field6225.method171(n15 + 2L, class17.method137(n17));
                            this.field6225.method171(n15 + 3L, class17.method137(n17 + 1L));
                        }
                    }
                }
                else {
                    for (long n18 = 0L; n18 < Class6733.method20484(this.field6227); n18 += 8L) {
                        for (long n19 = 0L; n19 < Class6733.method20482(this.field6227); ++n19) {
                            final long n20 = n + n19 * Class6733.method20483(this.field6227) + n18;
                            final long n21 = 2L * n19;
                            final long n22 = 2L * Class6733.method20482(this.field6227) + 2L * n19;
                            final long n23 = n22 + 2L * Class6733.method20482(this.field6227);
                            final long n24 = n23 + 2L * Class6733.method20482(this.field6227);
                            class17.method171(n21, this.field6225.method137(n20));
                            class17.method171(n21 + 1L, this.field6225.method137(n20 + 1L));
                            class17.method171(n22, this.field6225.method137(n20 + 2L));
                            class17.method171(n22 + 1L, this.field6225.method137(n20 + 3L));
                            class17.method171(n23, this.field6225.method137(n20 + 4L));
                            class17.method171(n23 + 1L, this.field6225.method137(n20 + 5L));
                            class17.method171(n24, this.field6225.method137(n20 + 6L));
                            class17.method171(n24 + 1L, this.field6225.method137(n20 + 7L));
                        }
                        Class6733.method20478(this.field6227).method26079(class17, 0L, this.field6226);
                        Class6733.method20478(this.field6227).method26079(class17, 2L * Class6733.method20482(this.field6227), this.field6226);
                        Class6733.method20478(this.field6227).method26079(class17, 4L * Class6733.method20482(this.field6227), this.field6226);
                        Class6733.method20478(this.field6227).method26079(class17, 6L * Class6733.method20482(this.field6227), this.field6226);
                        for (long n25 = 0L; n25 < Class6733.method20482(this.field6227); ++n25) {
                            final long n26 = n + n25 * Class6733.method20483(this.field6227) + n18;
                            final long n27 = 2L * n25;
                            final long n28 = 2L * Class6733.method20482(this.field6227) + 2L * n25;
                            final long n29 = n28 + 2L * Class6733.method20482(this.field6227);
                            final long n30 = n29 + 2L * Class6733.method20482(this.field6227);
                            this.field6225.method171(n26, class17.method137(n27));
                            this.field6225.method171(n26 + 1L, class17.method137(n27 + 1L));
                            this.field6225.method171(n26 + 2L, class17.method137(n28));
                            this.field6225.method171(n26 + 3L, class17.method137(n28 + 1L));
                            this.field6225.method171(n26 + 4L, class17.method137(n29));
                            this.field6225.method171(n26 + 5L, class17.method137(n29 + 1L));
                            this.field6225.method171(n26 + 6L, class17.method137(n30));
                            this.field6225.method171(n26 + 7L, class17.method137(n30 + 1L));
                        }
                    }
                }
            }
        }
        else {
            for (long field6223 = this.field6222; field6223 < Class6733.method20485(this.field6227); field6223 += this.field6223) {
                final long n31 = field6223 * Class6733.method20481(this.field6227);
                if (this.field6224 != 0L) {
                    for (long n32 = 0L; n32 < Class6733.method20482(this.field6227); ++n32) {
                        Class6733.method20476(this.field6227).method26083(this.field6225, n31 + n32 * Class6733.method20483(this.field6227));
                    }
                }
                else {
                    for (long n33 = 0L; n33 < Class6733.method20482(this.field6227); ++n33) {
                        Class6733.method20476(this.field6227).method26075(this.field6225, n31 + n33 * Class6733.method20483(this.field6227));
                    }
                }
                if (Class6733.method20484(this.field6227) <= 4L) {
                    if (Class6733.method20484(this.field6227) != 4L) {
                        if (Class6733.method20484(this.field6227) == 2L) {
                            for (long n34 = 0L; n34 < Class6733.method20482(this.field6227); ++n34) {
                                final long n35 = n31 + n34 * Class6733.method20483(this.field6227);
                                final long n36 = 2L * n34;
                                class17.method171(n36, this.field6225.method137(n35));
                                class17.method171(n36 + 1L, this.field6225.method137(n35 + 1L));
                            }
                            Class6733.method20478(this.field6227).method26075(class17, 0L);
                            for (long n37 = 0L; n37 < Class6733.method20482(this.field6227); ++n37) {
                                final long n38 = n31 + n37 * Class6733.method20483(this.field6227);
                                final long n39 = 2L * n37;
                                this.field6225.method171(n38, class17.method137(n39));
                                this.field6225.method171(n38 + 1L, class17.method137(n39 + 1L));
                            }
                        }
                    }
                    else {
                        for (long n40 = 0L; n40 < Class6733.method20482(this.field6227); ++n40) {
                            final long n41 = n31 + n40 * Class6733.method20483(this.field6227);
                            final long n42 = 2L * n40;
                            final long n43 = 2L * Class6733.method20482(this.field6227) + 2L * n40;
                            class17.method171(n42, this.field6225.method137(n41));
                            class17.method171(n42 + 1L, this.field6225.method137(n41 + 1L));
                            class17.method171(n43, this.field6225.method137(n41 + 2L));
                            class17.method171(n43 + 1L, this.field6225.method137(n41 + 3L));
                        }
                        Class6733.method20478(this.field6227).method26075(class17, 0L);
                        Class6733.method20478(this.field6227).method26075(class17, 2L * Class6733.method20482(this.field6227));
                        for (long n44 = 0L; n44 < Class6733.method20482(this.field6227); ++n44) {
                            final long n45 = n31 + n44 * Class6733.method20483(this.field6227);
                            final long n46 = 2L * n44;
                            final long n47 = 2L * Class6733.method20482(this.field6227) + 2L * n44;
                            this.field6225.method171(n45, class17.method137(n46));
                            this.field6225.method171(n45 + 1L, class17.method137(n46 + 1L));
                            this.field6225.method171(n45 + 2L, class17.method137(n47));
                            this.field6225.method171(n45 + 3L, class17.method137(n47 + 1L));
                        }
                    }
                }
                else {
                    for (long n48 = 0L; n48 < Class6733.method20484(this.field6227); n48 += 8L) {
                        for (long n49 = 0L; n49 < Class6733.method20482(this.field6227); ++n49) {
                            final long n50 = n31 + n49 * Class6733.method20483(this.field6227) + n48;
                            final long n51 = 2L * n49;
                            final long n52 = 2L * Class6733.method20482(this.field6227) + 2L * n49;
                            final long n53 = n52 + 2L * Class6733.method20482(this.field6227);
                            final long n54 = n53 + 2L * Class6733.method20482(this.field6227);
                            class17.method171(n51, this.field6225.method137(n50));
                            class17.method171(n51 + 1L, this.field6225.method137(n50 + 1L));
                            class17.method171(n52, this.field6225.method137(n50 + 2L));
                            class17.method171(n52 + 1L, this.field6225.method137(n50 + 3L));
                            class17.method171(n53, this.field6225.method137(n50 + 4L));
                            class17.method171(n53 + 1L, this.field6225.method137(n50 + 5L));
                            class17.method171(n54, this.field6225.method137(n50 + 6L));
                            class17.method171(n54 + 1L, this.field6225.method137(n50 + 7L));
                        }
                        Class6733.method20478(this.field6227).method26075(class17, 0L);
                        Class6733.method20478(this.field6227).method26075(class17, 2L * Class6733.method20482(this.field6227));
                        Class6733.method20478(this.field6227).method26075(class17, 4L * Class6733.method20482(this.field6227));
                        Class6733.method20478(this.field6227).method26075(class17, 6L * Class6733.method20482(this.field6227));
                        for (long n55 = 0L; n55 < Class6733.method20482(this.field6227); ++n55) {
                            final long n56 = n31 + n55 * Class6733.method20483(this.field6227) + n48;
                            final long n57 = 2L * n55;
                            final long n58 = 2L * Class6733.method20482(this.field6227) + 2L * n55;
                            final long n59 = n58 + 2L * Class6733.method20482(this.field6227);
                            final long n60 = n59 + 2L * Class6733.method20482(this.field6227);
                            this.field6225.method171(n56, class17.method137(n57));
                            this.field6225.method171(n56 + 1L, class17.method137(n57 + 1L));
                            this.field6225.method171(n56 + 2L, class17.method137(n58));
                            this.field6225.method171(n56 + 3L, class17.method137(n58 + 1L));
                            this.field6225.method171(n56 + 4L, class17.method137(n59));
                            this.field6225.method171(n56 + 5L, class17.method137(n59 + 1L));
                            this.field6225.method171(n56 + 6L, class17.method137(n60));
                            this.field6225.method171(n56 + 7L, class17.method137(n60 + 1L));
                        }
                    }
                }
            }
        }
    }
}
