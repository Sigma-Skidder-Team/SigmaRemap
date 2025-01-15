// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1370 implements Runnable
{
    private static String[] field7521;
    public final /* synthetic */ long field7522;
    public final /* synthetic */ int field7523;
    public final /* synthetic */ long field7524;
    public final /* synthetic */ int field7525;
    public final /* synthetic */ Class17 field7526;
    public final /* synthetic */ boolean field7527;
    public final /* synthetic */ Class5815 field7528;
    
    public Class1370(final Class5815 field7528, final long field7529, final int field7530, final long field7531, final int field7532, final Class17 field7533, final boolean field7534) {
        this.field7528 = field7528;
        this.field7522 = field7529;
        this.field7523 = field7530;
        this.field7524 = field7531;
        this.field7525 = field7532;
        this.field7526 = field7533;
        this.field7527 = field7534;
    }
    
    @Override
    public void run() {
        final Class17 class17 = new Class17(this.field7522);
        if (this.field7523 != -1) {
            if (Class5815.method17506(this.field7528) <= 2L) {
                if (Class5815.method17506(this.field7528) == 2L) {
                    for (long field7524 = this.field7524; field7524 < Class5815.method17505(this.field7528); field7524 += this.field7525) {
                        final long n = field7524 * Class5815.method17509(this.field7528);
                        for (long n2 = 0L; n2 < Class5815.method17507(this.field7528); ++n2) {
                            final long n3 = n2 * Class5815.method17508(this.field7528) + n;
                            class17.method171(n2, this.field7526.method137(n3));
                            class17.method171(Class5815.method17507(this.field7528) + n2, this.field7526.method137(n3 + 1L));
                        }
                        Class5815.method17504(this.field7528).method21393(class17, 0L, this.field7527);
                        Class5815.method17504(this.field7528).method21393(class17, Class5815.method17507(this.field7528), this.field7527);
                        for (long n4 = 0L; n4 < Class5815.method17507(this.field7528); ++n4) {
                            final long n5 = n4 * Class5815.method17508(this.field7528) + n;
                            this.field7526.method171(n5, class17.method137(n4));
                            this.field7526.method171(n5 + 1L, class17.method137(Class5815.method17507(this.field7528) + n4));
                        }
                    }
                }
            }
            else {
                for (long field7525 = this.field7524; field7525 < Class5815.method17505(this.field7528); field7525 += this.field7525) {
                    final long n6 = field7525 * Class5815.method17509(this.field7528);
                    for (long n7 = 0L; n7 < Class5815.method17506(this.field7528); n7 += 4L) {
                        for (long n8 = 0L; n8 < Class5815.method17507(this.field7528); ++n8) {
                            final long n9 = n8 * Class5815.method17508(this.field7528) + n6 + n7;
                            final long n10 = Class5815.method17507(this.field7528) + n8;
                            class17.method171(n8, this.field7526.method137(n9));
                            class17.method171(n10, this.field7526.method137(n9 + 1L));
                            class17.method171(n10 + Class5815.method17507(this.field7528), this.field7526.method137(n9 + 2L));
                            class17.method171(n10 + 2L * Class5815.method17507(this.field7528), this.field7526.method137(n9 + 3L));
                        }
                        Class5815.method17504(this.field7528).method21393(class17, 0L, this.field7527);
                        Class5815.method17504(this.field7528).method21393(class17, Class5815.method17507(this.field7528), this.field7527);
                        Class5815.method17504(this.field7528).method21393(class17, 2L * Class5815.method17507(this.field7528), this.field7527);
                        Class5815.method17504(this.field7528).method21393(class17, 3L * Class5815.method17507(this.field7528), this.field7527);
                        for (long n11 = 0L; n11 < Class5815.method17507(this.field7528); ++n11) {
                            final long n12 = n11 * Class5815.method17508(this.field7528) + n6 + n7;
                            final long n13 = Class5815.method17507(this.field7528) + n11;
                            this.field7526.method171(n12, class17.method137(n11));
                            this.field7526.method171(n12 + 1L, class17.method137(n13));
                            this.field7526.method171(n12 + 2L, class17.method137(n13 + Class5815.method17507(this.field7528)));
                            this.field7526.method171(n12 + 3L, class17.method137(n13 + 2L * Class5815.method17507(this.field7528)));
                        }
                    }
                }
            }
        }
        else if (Class5815.method17506(this.field7528) <= 2L) {
            if (Class5815.method17506(this.field7528) == 2L) {
                for (long field7526 = this.field7524; field7526 < Class5815.method17505(this.field7528); field7526 += this.field7525) {
                    final long n14 = field7526 * Class5815.method17509(this.field7528);
                    for (long n15 = 0L; n15 < Class5815.method17507(this.field7528); ++n15) {
                        final long n16 = n15 * Class5815.method17508(this.field7528) + n14;
                        class17.method171(n15, this.field7526.method137(n16));
                        class17.method171(Class5815.method17507(this.field7528) + n15, this.field7526.method137(n16 + 1L));
                    }
                    Class5815.method17504(this.field7528).method21389(class17, 0L);
                    Class5815.method17504(this.field7528).method21389(class17, Class5815.method17507(this.field7528));
                    for (long n17 = 0L; n17 < Class5815.method17507(this.field7528); ++n17) {
                        final long n18 = n17 * Class5815.method17508(this.field7528) + n14;
                        this.field7526.method171(n18, class17.method137(n17));
                        this.field7526.method171(n18 + 1L, class17.method137(Class5815.method17507(this.field7528) + n17));
                    }
                }
            }
        }
        else {
            for (long field7527 = this.field7524; field7527 < Class5815.method17505(this.field7528); field7527 += this.field7525) {
                final long n19 = field7527 * Class5815.method17509(this.field7528);
                for (long n20 = 0L; n20 < Class5815.method17506(this.field7528); n20 += 4L) {
                    for (long n21 = 0L; n21 < Class5815.method17507(this.field7528); ++n21) {
                        final long n22 = n21 * Class5815.method17508(this.field7528) + n19 + n20;
                        final long n23 = Class5815.method17507(this.field7528) + n21;
                        class17.method171(n21, this.field7526.method137(n22));
                        class17.method171(n23, this.field7526.method137(n22 + 1L));
                        class17.method171(n23 + Class5815.method17507(this.field7528), this.field7526.method137(n22 + 2L));
                        class17.method171(n23 + 2L * Class5815.method17507(this.field7528), this.field7526.method137(n22 + 3L));
                    }
                    Class5815.method17504(this.field7528).method21389(class17, 0L);
                    Class5815.method17504(this.field7528).method21389(class17, Class5815.method17507(this.field7528));
                    Class5815.method17504(this.field7528).method21389(class17, 2L * Class5815.method17507(this.field7528));
                    Class5815.method17504(this.field7528).method21389(class17, 3L * Class5815.method17507(this.field7528));
                    for (long n24 = 0L; n24 < Class5815.method17507(this.field7528); ++n24) {
                        final long n25 = n24 * Class5815.method17508(this.field7528) + n19 + n20;
                        final long n26 = Class5815.method17507(this.field7528) + n24;
                        this.field7526.method171(n25, class17.method137(n24));
                        this.field7526.method171(n25 + 1L, class17.method137(n26));
                        this.field7526.method171(n25 + 2L, class17.method137(n26 + Class5815.method17507(this.field7528)));
                        this.field7526.method171(n25 + 3L, class17.method137(n26 + 2L * Class5815.method17507(this.field7528)));
                    }
                }
            }
        }
    }
}
