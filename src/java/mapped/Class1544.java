// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1544 implements Runnable
{
    private static String[] field8619;
    public final /* synthetic */ long field8620;
    public final /* synthetic */ int field8621;
    public final /* synthetic */ long field8622;
    public final /* synthetic */ int field8623;
    public final /* synthetic */ long field8624;
    public final /* synthetic */ Class17 field8625;
    public final /* synthetic */ boolean field8626;
    public final /* synthetic */ Class6733 field8627;
    
    public Class1544(final Class6733 field8627, final long field8628, final int field8629, final long field8630, final int field8631, final long field8632, final Class17 field8633, final boolean field8634) {
        this.field8627 = field8627;
        this.field8620 = field8628;
        this.field8621 = field8629;
        this.field8622 = field8630;
        this.field8623 = field8631;
        this.field8624 = field8632;
        this.field8625 = field8633;
        this.field8626 = field8634;
    }
    
    @Override
    public void run() {
        final Class17 class17 = new Class17(this.field8620);
        if (this.field8621 != -1) {
            for (long field8622 = this.field8622; field8622 < Class6733.method20485(this.field8627); field8622 += this.field8623) {
                final long n = field8622 * Class6733.method20481(this.field8627);
                if (this.field8624 == 0L) {
                    for (long n2 = 0L; n2 < Class6733.method20482(this.field8627); ++n2) {
                        Class6733.method20476(this.field8627).method26079(this.field8625, n + n2 * Class6733.method20483(this.field8627), this.field8626);
                    }
                }
                if (Class6733.method20484(this.field8627) <= 4L) {
                    if (Class6733.method20484(this.field8627) != 4L) {
                        if (Class6733.method20484(this.field8627) == 2L) {
                            for (long n3 = 0L; n3 < Class6733.method20482(this.field8627); ++n3) {
                                final long n4 = n + n3 * Class6733.method20483(this.field8627);
                                final long n5 = 2L * n3;
                                class17.method171(n5, this.field8625.method137(n4));
                                class17.method171(n5 + 1L, this.field8625.method137(n4 + 1L));
                            }
                            Class6733.method20478(this.field8627).method26079(class17, 0L, this.field8626);
                            for (long n6 = 0L; n6 < Class6733.method20482(this.field8627); ++n6) {
                                final long n7 = n + n6 * Class6733.method20483(this.field8627);
                                final long n8 = 2L * n6;
                                this.field8625.method171(n7, class17.method137(n8));
                                this.field8625.method171(n7 + 1L, class17.method137(n8 + 1L));
                            }
                        }
                    }
                    else {
                        for (long n9 = 0L; n9 < Class6733.method20482(this.field8627); ++n9) {
                            final long n10 = n + n9 * Class6733.method20483(this.field8627);
                            final long n11 = 2L * n9;
                            final long n12 = 2L * Class6733.method20482(this.field8627) + 2L * n9;
                            class17.method171(n11, this.field8625.method137(n10));
                            class17.method171(n11 + 1L, this.field8625.method137(n10 + 1L));
                            class17.method171(n12, this.field8625.method137(n10 + 2L));
                            class17.method171(n12 + 1L, this.field8625.method137(n10 + 3L));
                        }
                        Class6733.method20478(this.field8627).method26079(class17, 0L, this.field8626);
                        Class6733.method20478(this.field8627).method26079(class17, 2L * Class6733.method20482(this.field8627), this.field8626);
                        for (long n13 = 0L; n13 < Class6733.method20482(this.field8627); ++n13) {
                            final long n14 = n + n13 * Class6733.method20483(this.field8627);
                            final long n15 = 2L * n13;
                            final long n16 = 2L * Class6733.method20482(this.field8627) + 2L * n13;
                            this.field8625.method171(n14, class17.method137(n15));
                            this.field8625.method171(n14 + 1L, class17.method137(n15 + 1L));
                            this.field8625.method171(n14 + 2L, class17.method137(n16));
                            this.field8625.method171(n14 + 3L, class17.method137(n16 + 1L));
                        }
                    }
                }
                else {
                    for (long n17 = 0L; n17 < Class6733.method20484(this.field8627); n17 += 8L) {
                        for (long n18 = 0L; n18 < Class6733.method20482(this.field8627); ++n18) {
                            final long n19 = n + n18 * Class6733.method20483(this.field8627) + n17;
                            final long n20 = 2L * n18;
                            final long n21 = 2L * Class6733.method20482(this.field8627) + 2L * n18;
                            final long n22 = n21 + 2L * Class6733.method20482(this.field8627);
                            final long n23 = n22 + 2L * Class6733.method20482(this.field8627);
                            class17.method171(n20, this.field8625.method137(n19));
                            class17.method171(n20 + 1L, this.field8625.method137(n19 + 1L));
                            class17.method171(n21, this.field8625.method137(n19 + 2L));
                            class17.method171(n21 + 1L, this.field8625.method137(n19 + 3L));
                            class17.method171(n22, this.field8625.method137(n19 + 4L));
                            class17.method171(n22 + 1L, this.field8625.method137(n19 + 5L));
                            class17.method171(n23, this.field8625.method137(n19 + 6L));
                            class17.method171(n23 + 1L, this.field8625.method137(n19 + 7L));
                        }
                        Class6733.method20478(this.field8627).method26079(class17, 0L, this.field8626);
                        Class6733.method20478(this.field8627).method26079(class17, 2L * Class6733.method20482(this.field8627), this.field8626);
                        Class6733.method20478(this.field8627).method26079(class17, 4L * Class6733.method20482(this.field8627), this.field8626);
                        Class6733.method20478(this.field8627).method26079(class17, 6L * Class6733.method20482(this.field8627), this.field8626);
                        for (long n24 = 0L; n24 < Class6733.method20482(this.field8627); ++n24) {
                            final long n25 = n + n24 * Class6733.method20483(this.field8627) + n17;
                            final long n26 = 2L * n24;
                            final long n27 = 2L * Class6733.method20482(this.field8627) + 2L * n24;
                            final long n28 = n27 + 2L * Class6733.method20482(this.field8627);
                            final long n29 = n28 + 2L * Class6733.method20482(this.field8627);
                            this.field8625.method171(n25, class17.method137(n26));
                            this.field8625.method171(n25 + 1L, class17.method137(n26 + 1L));
                            this.field8625.method171(n25 + 2L, class17.method137(n27));
                            this.field8625.method171(n25 + 3L, class17.method137(n27 + 1L));
                            this.field8625.method171(n25 + 4L, class17.method137(n28));
                            this.field8625.method171(n25 + 5L, class17.method137(n28 + 1L));
                            this.field8625.method171(n25 + 6L, class17.method137(n29));
                            this.field8625.method171(n25 + 7L, class17.method137(n29 + 1L));
                        }
                    }
                }
                if (this.field8624 != 0L) {
                    for (long n30 = 0L; n30 < Class6733.method20482(this.field8627); ++n30) {
                        Class6733.method20476(this.field8627).method26091(this.field8625, n + n30 * Class6733.method20483(this.field8627), this.field8626);
                    }
                }
            }
        }
        else {
            for (long field8623 = this.field8622; field8623 < Class6733.method20485(this.field8627); field8623 += this.field8623) {
                final long n31 = field8623 * Class6733.method20481(this.field8627);
                if (this.field8624 != 0L) {
                    for (long n32 = 0L; n32 < Class6733.method20482(this.field8627); ++n32) {
                        Class6733.method20476(this.field8627).method26083(this.field8625, n31 + n32 * Class6733.method20483(this.field8627));
                    }
                }
                else {
                    for (long n33 = 0L; n33 < Class6733.method20482(this.field8627); ++n33) {
                        Class6733.method20476(this.field8627).method26075(this.field8625, n31 + n33 * Class6733.method20483(this.field8627));
                    }
                }
                if (Class6733.method20484(this.field8627) <= 4L) {
                    if (Class6733.method20484(this.field8627) != 4L) {
                        if (Class6733.method20484(this.field8627) == 2L) {
                            for (long n34 = 0L; n34 < Class6733.method20482(this.field8627); ++n34) {
                                final long n35 = n31 + n34 * Class6733.method20483(this.field8627);
                                final long n36 = 2L * n34;
                                class17.method171(n36, this.field8625.method137(n35));
                                class17.method171(n36 + 1L, this.field8625.method137(n35 + 1L));
                            }
                            Class6733.method20478(this.field8627).method26075(class17, 0L);
                            for (long n37 = 0L; n37 < Class6733.method20482(this.field8627); ++n37) {
                                final long n38 = n31 + n37 * Class6733.method20483(this.field8627);
                                final long n39 = 2L * n37;
                                this.field8625.method171(n38, class17.method137(n39));
                                this.field8625.method171(n38 + 1L, class17.method137(n39 + 1L));
                            }
                        }
                    }
                    else {
                        for (long n40 = 0L; n40 < Class6733.method20482(this.field8627); ++n40) {
                            final long n41 = n31 + n40 * Class6733.method20483(this.field8627);
                            final long n42 = 2L * n40;
                            final long n43 = 2L * Class6733.method20482(this.field8627) + 2L * n40;
                            class17.method171(n42, this.field8625.method137(n41));
                            class17.method171(n42 + 1L, this.field8625.method137(n41 + 1L));
                            class17.method171(n43, this.field8625.method137(n41 + 2L));
                            class17.method171(n43 + 1L, this.field8625.method137(n41 + 3L));
                        }
                        Class6733.method20478(this.field8627).method26075(class17, 0L);
                        Class6733.method20478(this.field8627).method26075(class17, 2L * Class6733.method20482(this.field8627));
                        for (long n44 = 0L; n44 < Class6733.method20482(this.field8627); ++n44) {
                            final long n45 = n31 + n44 * Class6733.method20483(this.field8627);
                            final long n46 = 2L * n44;
                            final long n47 = 2L * Class6733.method20482(this.field8627) + 2L * n44;
                            this.field8625.method171(n45, class17.method137(n46));
                            this.field8625.method171(n45 + 1L, class17.method137(n46 + 1L));
                            this.field8625.method171(n45 + 2L, class17.method137(n47));
                            this.field8625.method171(n45 + 3L, class17.method137(n47 + 1L));
                        }
                    }
                }
                else {
                    for (long n48 = 0L; n48 < Class6733.method20484(this.field8627); n48 += 8L) {
                        for (long n49 = 0L; n49 < Class6733.method20482(this.field8627); ++n49) {
                            final long n50 = n31 + n49 * Class6733.method20483(this.field8627) + n48;
                            final long n51 = 2L * n49;
                            final long n52 = 2L * Class6733.method20482(this.field8627) + 2L * n49;
                            final long n53 = n52 + 2L * Class6733.method20482(this.field8627);
                            final long n54 = n53 + 2L * Class6733.method20482(this.field8627);
                            class17.method171(n51, this.field8625.method137(n50));
                            class17.method171(n51 + 1L, this.field8625.method137(n50 + 1L));
                            class17.method171(n52, this.field8625.method137(n50 + 2L));
                            class17.method171(n52 + 1L, this.field8625.method137(n50 + 3L));
                            class17.method171(n53, this.field8625.method137(n50 + 4L));
                            class17.method171(n53 + 1L, this.field8625.method137(n50 + 5L));
                            class17.method171(n54, this.field8625.method137(n50 + 6L));
                            class17.method171(n54 + 1L, this.field8625.method137(n50 + 7L));
                        }
                        Class6733.method20478(this.field8627).method26075(class17, 0L);
                        Class6733.method20478(this.field8627).method26075(class17, 2L * Class6733.method20482(this.field8627));
                        Class6733.method20478(this.field8627).method26075(class17, 4L * Class6733.method20482(this.field8627));
                        Class6733.method20478(this.field8627).method26075(class17, 6L * Class6733.method20482(this.field8627));
                        for (long n55 = 0L; n55 < Class6733.method20482(this.field8627); ++n55) {
                            final long n56 = n31 + n55 * Class6733.method20483(this.field8627) + n48;
                            final long n57 = 2L * n55;
                            final long n58 = 2L * Class6733.method20482(this.field8627) + 2L * n55;
                            final long n59 = n58 + 2L * Class6733.method20482(this.field8627);
                            final long n60 = n59 + 2L * Class6733.method20482(this.field8627);
                            this.field8625.method171(n56, class17.method137(n57));
                            this.field8625.method171(n56 + 1L, class17.method137(n57 + 1L));
                            this.field8625.method171(n56 + 2L, class17.method137(n58));
                            this.field8625.method171(n56 + 3L, class17.method137(n58 + 1L));
                            this.field8625.method171(n56 + 4L, class17.method137(n59));
                            this.field8625.method171(n56 + 5L, class17.method137(n59 + 1L));
                            this.field8625.method171(n56 + 6L, class17.method137(n60));
                            this.field8625.method171(n56 + 7L, class17.method137(n60 + 1L));
                        }
                    }
                }
            }
        }
    }
}
