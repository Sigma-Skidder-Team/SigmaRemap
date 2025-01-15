// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1057 implements Runnable
{
    private static String[] field5677;
    public final /* synthetic */ long field5678;
    public final /* synthetic */ int field5679;
    public final /* synthetic */ long field5680;
    public final /* synthetic */ int field5681;
    public final /* synthetic */ Class17 field5682;
    public final /* synthetic */ boolean field5683;
    public final /* synthetic */ Class6733 field5684;
    
    public Class1057(final Class6733 field5684, final long field5685, final int field5686, final long field5687, final int field5688, final Class17 field5689, final boolean field5690) {
        this.field5684 = field5684;
        this.field5678 = field5685;
        this.field5679 = field5686;
        this.field5680 = field5687;
        this.field5681 = field5688;
        this.field5682 = field5689;
        this.field5683 = field5690;
    }
    
    @Override
    public void run() {
        final Class17 class17 = new Class17(this.field5678);
        if (this.field5679 != -1) {
            if (Class6733.method20484(this.field5684) <= 4L) {
                if (Class6733.method20484(this.field5684) != 4L) {
                    if (Class6733.method20484(this.field5684) == 2L) {
                        for (long field5680 = this.field5680; field5680 < Class6733.method20482(this.field5684); field5680 += this.field5681) {
                            final long n = field5680 * Class6733.method20483(this.field5684);
                            for (long n2 = 0L; n2 < Class6733.method20485(this.field5684); ++n2) {
                                final long n3 = n2 * Class6733.method20481(this.field5684) + n;
                                final long n4 = 2L * n2;
                                class17.method171(n4, this.field5682.method137(n3));
                                class17.method171(n4 + 1L, this.field5682.method137(n3 + 1L));
                            }
                            Class6733.method20480(this.field5684).method26079(class17, 0L, this.field5683);
                            for (long n5 = 0L; n5 < Class6733.method20485(this.field5684); ++n5) {
                                final long n6 = n5 * Class6733.method20481(this.field5684) + n;
                                final long n7 = 2L * n5;
                                this.field5682.method171(n6, class17.method137(n7));
                                this.field5682.method171(n6 + 1L, class17.method137(n7 + 1L));
                            }
                        }
                    }
                }
                else {
                    for (long field5681 = this.field5680; field5681 < Class6733.method20482(this.field5684); field5681 += this.field5681) {
                        final long n8 = field5681 * Class6733.method20483(this.field5684);
                        for (long n9 = 0L; n9 < Class6733.method20485(this.field5684); ++n9) {
                            final long n10 = n9 * Class6733.method20481(this.field5684) + n8;
                            final long n11 = 2L * n9;
                            final long n12 = 2L * Class6733.method20485(this.field5684) + 2L * n9;
                            class17.method171(n11, this.field5682.method137(n10));
                            class17.method171(n11 + 1L, this.field5682.method137(n10 + 1L));
                            class17.method171(n12, this.field5682.method137(n10 + 2L));
                            class17.method171(n12 + 1L, this.field5682.method137(n10 + 3L));
                        }
                        Class6733.method20480(this.field5684).method26079(class17, 0L, this.field5683);
                        Class6733.method20480(this.field5684).method26079(class17, 2L * Class6733.method20485(this.field5684), this.field5683);
                        for (long n13 = 0L; n13 < Class6733.method20485(this.field5684); ++n13) {
                            final long n14 = n13 * Class6733.method20481(this.field5684) + n8;
                            final long n15 = 2L * n13;
                            final long n16 = 2L * Class6733.method20485(this.field5684) + 2L * n13;
                            this.field5682.method171(n14, class17.method137(n15));
                            this.field5682.method171(n14 + 1L, class17.method137(n15 + 1L));
                            this.field5682.method171(n14 + 2L, class17.method137(n16));
                            this.field5682.method171(n14 + 3L, class17.method137(n16 + 1L));
                        }
                    }
                }
            }
            else {
                for (long field5682 = this.field5680; field5682 < Class6733.method20482(this.field5684); field5682 += this.field5681) {
                    final long n17 = field5682 * Class6733.method20483(this.field5684);
                    for (long n18 = 0L; n18 < Class6733.method20484(this.field5684); n18 += 8L) {
                        for (long n19 = 0L; n19 < Class6733.method20485(this.field5684); ++n19) {
                            final long n20 = n19 * Class6733.method20481(this.field5684) + n17 + n18;
                            final long n21 = 2L * n19;
                            final long n22 = 2L * Class6733.method20485(this.field5684) + 2L * n19;
                            final long n23 = n22 + 2L * Class6733.method20485(this.field5684);
                            final long n24 = n23 + 2L * Class6733.method20485(this.field5684);
                            class17.method171(n21, this.field5682.method137(n20));
                            class17.method171(n21 + 1L, this.field5682.method137(n20 + 1L));
                            class17.method171(n22, this.field5682.method137(n20 + 2L));
                            class17.method171(n22 + 1L, this.field5682.method137(n20 + 3L));
                            class17.method171(n23, this.field5682.method137(n20 + 4L));
                            class17.method171(n23 + 1L, this.field5682.method137(n20 + 5L));
                            class17.method171(n24, this.field5682.method137(n20 + 6L));
                            class17.method171(n24 + 1L, this.field5682.method137(n20 + 7L));
                        }
                        Class6733.method20480(this.field5684).method26079(class17, 0L, this.field5683);
                        Class6733.method20480(this.field5684).method26079(class17, 2L * Class6733.method20485(this.field5684), this.field5683);
                        Class6733.method20480(this.field5684).method26079(class17, 4L * Class6733.method20485(this.field5684), this.field5683);
                        Class6733.method20480(this.field5684).method26079(class17, 6L * Class6733.method20485(this.field5684), this.field5683);
                        for (long n25 = 0L; n25 < Class6733.method20485(this.field5684); ++n25) {
                            final long n26 = n25 * Class6733.method20481(this.field5684) + n17 + n18;
                            final long n27 = 2L * n25;
                            final long n28 = 2L * Class6733.method20485(this.field5684) + 2L * n25;
                            final long n29 = n28 + 2L * Class6733.method20485(this.field5684);
                            final long n30 = n29 + 2L * Class6733.method20485(this.field5684);
                            this.field5682.method171(n26, class17.method137(n27));
                            this.field5682.method171(n26 + 1L, class17.method137(n27 + 1L));
                            this.field5682.method171(n26 + 2L, class17.method137(n28));
                            this.field5682.method171(n26 + 3L, class17.method137(n28 + 1L));
                            this.field5682.method171(n26 + 4L, class17.method137(n29));
                            this.field5682.method171(n26 + 5L, class17.method137(n29 + 1L));
                            this.field5682.method171(n26 + 6L, class17.method137(n30));
                            this.field5682.method171(n26 + 7L, class17.method137(n30 + 1L));
                        }
                    }
                }
            }
        }
        else if (Class6733.method20484(this.field5684) <= 4L) {
            if (Class6733.method20484(this.field5684) != 4L) {
                if (Class6733.method20484(this.field5684) == 2L) {
                    for (long field5683 = this.field5680; field5683 < Class6733.method20482(this.field5684); field5683 += this.field5681) {
                        final long n31 = field5683 * Class6733.method20483(this.field5684);
                        for (long n32 = 0L; n32 < Class6733.method20485(this.field5684); ++n32) {
                            final long n33 = n32 * Class6733.method20481(this.field5684) + n31;
                            final long n34 = 2L * n32;
                            class17.method171(n34, this.field5682.method137(n33));
                            class17.method171(n34 + 1L, this.field5682.method137(n33 + 1L));
                        }
                        Class6733.method20480(this.field5684).method26075(class17, 0L);
                        for (long n35 = 0L; n35 < Class6733.method20485(this.field5684); ++n35) {
                            final long n36 = n35 * Class6733.method20481(this.field5684) + n31;
                            final long n37 = 2L * n35;
                            this.field5682.method171(n36, class17.method137(n37));
                            this.field5682.method171(n36 + 1L, class17.method137(n37 + 1L));
                        }
                    }
                }
            }
            else {
                for (long field5684 = this.field5680; field5684 < Class6733.method20482(this.field5684); field5684 += this.field5681) {
                    final long n38 = field5684 * Class6733.method20483(this.field5684);
                    for (long n39 = 0L; n39 < Class6733.method20485(this.field5684); ++n39) {
                        final long n40 = n39 * Class6733.method20481(this.field5684) + n38;
                        final long n41 = 2L * n39;
                        final long n42 = 2L * Class6733.method20485(this.field5684) + 2L * n39;
                        class17.method171(n41, this.field5682.method137(n40));
                        class17.method171(n41 + 1L, this.field5682.method137(n40 + 1L));
                        class17.method171(n42, this.field5682.method137(n40 + 2L));
                        class17.method171(n42 + 1L, this.field5682.method137(n40 + 3L));
                    }
                    Class6733.method20480(this.field5684).method26075(class17, 0L);
                    Class6733.method20480(this.field5684).method26075(class17, 2L * Class6733.method20485(this.field5684));
                    for (long n43 = 0L; n43 < Class6733.method20485(this.field5684); ++n43) {
                        final long n44 = n43 * Class6733.method20481(this.field5684) + n38;
                        final long n45 = 2L * n43;
                        final long n46 = 2L * Class6733.method20485(this.field5684) + 2L * n43;
                        this.field5682.method171(n44, class17.method137(n45));
                        this.field5682.method171(n44 + 1L, class17.method137(n45 + 1L));
                        this.field5682.method171(n44 + 2L, class17.method137(n46));
                        this.field5682.method171(n44 + 3L, class17.method137(n46 + 1L));
                    }
                }
            }
        }
        else {
            for (long field5685 = this.field5680; field5685 < Class6733.method20482(this.field5684); field5685 += this.field5681) {
                final long n47 = field5685 * Class6733.method20483(this.field5684);
                for (long n48 = 0L; n48 < Class6733.method20484(this.field5684); n48 += 8L) {
                    for (long n49 = 0L; n49 < Class6733.method20485(this.field5684); ++n49) {
                        final long n50 = n49 * Class6733.method20481(this.field5684) + n47 + n48;
                        final long n51 = 2L * n49;
                        final long n52 = 2L * Class6733.method20485(this.field5684) + 2L * n49;
                        final long n53 = n52 + 2L * Class6733.method20485(this.field5684);
                        final long n54 = n53 + 2L * Class6733.method20485(this.field5684);
                        class17.method171(n51, this.field5682.method137(n50));
                        class17.method171(n51 + 1L, this.field5682.method137(n50 + 1L));
                        class17.method171(n52, this.field5682.method137(n50 + 2L));
                        class17.method171(n52 + 1L, this.field5682.method137(n50 + 3L));
                        class17.method171(n53, this.field5682.method137(n50 + 4L));
                        class17.method171(n53 + 1L, this.field5682.method137(n50 + 5L));
                        class17.method171(n54, this.field5682.method137(n50 + 6L));
                        class17.method171(n54 + 1L, this.field5682.method137(n50 + 7L));
                    }
                    Class6733.method20480(this.field5684).method26075(class17, 0L);
                    Class6733.method20480(this.field5684).method26075(class17, 2L * Class6733.method20485(this.field5684));
                    Class6733.method20480(this.field5684).method26075(class17, 4L * Class6733.method20485(this.field5684));
                    Class6733.method20480(this.field5684).method26075(class17, 6L * Class6733.method20485(this.field5684));
                    for (long n55 = 0L; n55 < Class6733.method20485(this.field5684); ++n55) {
                        final long n56 = n55 * Class6733.method20481(this.field5684) + n47 + n48;
                        final long n57 = 2L * n55;
                        final long n58 = 2L * Class6733.method20485(this.field5684) + 2L * n55;
                        final long n59 = n58 + 2L * Class6733.method20485(this.field5684);
                        final long n60 = n59 + 2L * Class6733.method20485(this.field5684);
                        this.field5682.method171(n56, class17.method137(n57));
                        this.field5682.method171(n56 + 1L, class17.method137(n57 + 1L));
                        this.field5682.method171(n56 + 2L, class17.method137(n58));
                        this.field5682.method171(n56 + 3L, class17.method137(n58 + 1L));
                        this.field5682.method171(n56 + 4L, class17.method137(n59));
                        this.field5682.method171(n56 + 5L, class17.method137(n59 + 1L));
                        this.field5682.method171(n56 + 6L, class17.method137(n60));
                        this.field5682.method171(n56 + 7L, class17.method137(n60 + 1L));
                    }
                }
            }
        }
    }
}
