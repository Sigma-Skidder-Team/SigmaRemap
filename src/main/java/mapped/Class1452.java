// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1452 implements Runnable
{
    private static String[] field8045;
    public final /* synthetic */ long field8046;
    public final /* synthetic */ int field8047;
    public final /* synthetic */ long field8048;
    public final /* synthetic */ int field8049;
    public final /* synthetic */ Class22 field8050;
    public final /* synthetic */ boolean field8051;
    public final /* synthetic */ Class6498 field8052;
    
    public Class1452(final Class6498 field8052, final long field8053, final int field8054, final long field8055, final int field8056, final Class22 field8057, final boolean field8058) {
        this.field8052 = field8052;
        this.field8046 = field8053;
        this.field8047 = field8054;
        this.field8048 = field8055;
        this.field8049 = field8056;
        this.field8050 = field8057;
        this.field8051 = field8058;
    }
    
    @Override
    public void run() {
        final Class22 class22 = new Class22(this.field8046);
        if (this.field8047 != -1) {
            if (Class6498.method19575(this.field8052) <= 2L) {
                if (Class6498.method19575(this.field8052) == 2L) {
                    for (long field8048 = this.field8048; field8048 < Class6498.method19573(this.field8052); field8048 += this.field8049) {
                        final long n = field8048 * Class6498.method19574(this.field8052);
                        for (long n2 = 0L; n2 < Class6498.method19576(this.field8052); ++n2) {
                            final long n3 = n2 * Class6498.method19572(this.field8052) + n;
                            class22.method169(n2, this.field8050.method135(n3));
                            class22.method169(Class6498.method19576(this.field8052) + n2, this.field8050.method135(n3 + 1L));
                        }
                        Class6498.method19571(this.field8052).method34188(class22, 0L, this.field8051);
                        Class6498.method19571(this.field8052).method34188(class22, Class6498.method19576(this.field8052), this.field8051);
                        for (long n4 = 0L; n4 < Class6498.method19576(this.field8052); ++n4) {
                            final long n5 = n4 * Class6498.method19572(this.field8052) + n;
                            this.field8050.method169(n5, class22.method135(n4));
                            this.field8050.method169(n5 + 1L, class22.method135(Class6498.method19576(this.field8052) + n4));
                        }
                    }
                }
            }
            else {
                for (long field8049 = this.field8048; field8049 < Class6498.method19573(this.field8052); field8049 += this.field8049) {
                    final long n6 = field8049 * Class6498.method19574(this.field8052);
                    for (long n7 = 0L; n7 < Class6498.method19575(this.field8052); n7 += 4L) {
                        for (long n8 = 0L; n8 < Class6498.method19576(this.field8052); ++n8) {
                            final long n9 = n8 * Class6498.method19572(this.field8052) + n6 + n7;
                            final long n10 = Class6498.method19576(this.field8052) + n8;
                            class22.method169(n8, this.field8050.method135(n9));
                            class22.method169(n10, this.field8050.method135(n9 + 1L));
                            class22.method169(n10 + Class6498.method19576(this.field8052), this.field8050.method135(n9 + 2L));
                            class22.method169(n10 + 2L * Class6498.method19576(this.field8052), this.field8050.method135(n9 + 3L));
                        }
                        Class6498.method19571(this.field8052).method34188(class22, 0L, this.field8051);
                        Class6498.method19571(this.field8052).method34188(class22, Class6498.method19576(this.field8052), this.field8051);
                        Class6498.method19571(this.field8052).method34188(class22, 2L * Class6498.method19576(this.field8052), this.field8051);
                        Class6498.method19571(this.field8052).method34188(class22, 3L * Class6498.method19576(this.field8052), this.field8051);
                        for (long n11 = 0L; n11 < Class6498.method19576(this.field8052); ++n11) {
                            final long n12 = n11 * Class6498.method19572(this.field8052) + n6 + n7;
                            final long n13 = Class6498.method19576(this.field8052) + n11;
                            this.field8050.method169(n12, class22.method135(n11));
                            this.field8050.method169(n12 + 1L, class22.method135(n13));
                            this.field8050.method169(n12 + 2L, class22.method135(n13 + Class6498.method19576(this.field8052)));
                            this.field8050.method169(n12 + 3L, class22.method135(n13 + 2L * Class6498.method19576(this.field8052)));
                        }
                    }
                }
            }
        }
        else if (Class6498.method19575(this.field8052) <= 2L) {
            if (Class6498.method19575(this.field8052) == 2L) {
                for (long field8050 = this.field8048; field8050 < Class6498.method19573(this.field8052); field8050 += this.field8049) {
                    final long n14 = field8050 * Class6498.method19574(this.field8052);
                    for (long n15 = 0L; n15 < Class6498.method19576(this.field8052); ++n15) {
                        final long n16 = n15 * Class6498.method19572(this.field8052) + n14;
                        class22.method169(n15, this.field8050.method135(n16));
                        class22.method169(Class6498.method19576(this.field8052) + n15, this.field8050.method135(n16 + 1L));
                    }
                    Class6498.method19571(this.field8052).method34184(class22, 0L, this.field8051);
                    Class6498.method19571(this.field8052).method34184(class22, Class6498.method19576(this.field8052), this.field8051);
                    for (long n17 = 0L; n17 < Class6498.method19576(this.field8052); ++n17) {
                        final long n18 = n17 * Class6498.method19572(this.field8052) + n14;
                        this.field8050.method169(n18, class22.method135(n17));
                        this.field8050.method169(n18 + 1L, class22.method135(Class6498.method19576(this.field8052) + n17));
                    }
                }
            }
        }
        else {
            for (long field8051 = this.field8048; field8051 < Class6498.method19573(this.field8052); field8051 += this.field8049) {
                final long n19 = field8051 * Class6498.method19574(this.field8052);
                for (long n20 = 0L; n20 < Class6498.method19575(this.field8052); n20 += 4L) {
                    for (long n21 = 0L; n21 < Class6498.method19576(this.field8052); ++n21) {
                        final long n22 = n21 * Class6498.method19572(this.field8052) + n19 + n20;
                        final long n23 = Class6498.method19576(this.field8052) + n21;
                        class22.method169(n21, this.field8050.method135(n22));
                        class22.method169(n23, this.field8050.method135(n22 + 1L));
                        class22.method169(n23 + Class6498.method19576(this.field8052), this.field8050.method135(n22 + 2L));
                        class22.method169(n23 + 2L * Class6498.method19576(this.field8052), this.field8050.method135(n22 + 3L));
                    }
                    Class6498.method19571(this.field8052).method34184(class22, 0L, this.field8051);
                    Class6498.method19571(this.field8052).method34184(class22, Class6498.method19576(this.field8052), this.field8051);
                    Class6498.method19571(this.field8052).method34184(class22, 2L * Class6498.method19576(this.field8052), this.field8051);
                    Class6498.method19571(this.field8052).method34184(class22, 3L * Class6498.method19576(this.field8052), this.field8051);
                    for (long n24 = 0L; n24 < Class6498.method19576(this.field8052); ++n24) {
                        final long n25 = n24 * Class6498.method19572(this.field8052) + n19 + n20;
                        final long n26 = Class6498.method19576(this.field8052) + n24;
                        this.field8050.method169(n25, class22.method135(n24));
                        this.field8050.method169(n25 + 1L, class22.method135(n26));
                        this.field8050.method169(n25 + 2L, class22.method135(n26 + Class6498.method19576(this.field8052)));
                        this.field8050.method169(n25 + 3L, class22.method135(n26 + 2L * Class6498.method19576(this.field8052)));
                    }
                }
            }
        }
    }
}
