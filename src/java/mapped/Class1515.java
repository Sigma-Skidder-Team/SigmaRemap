// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1515 implements Runnable
{
    private static String[] field8442;
    public final /* synthetic */ long field8443;
    public final /* synthetic */ int field8444;
    public final /* synthetic */ long field8445;
    public final /* synthetic */ int field8446;
    public final /* synthetic */ Class22 field8447;
    public final /* synthetic */ boolean field8448;
    public final /* synthetic */ Class5934 field8449;
    
    public Class1515(final Class5934 field8449, final long field8450, final int field8451, final long field8452, final int field8453, final Class22 field8454, final boolean field8455) {
        this.field8449 = field8449;
        this.field8443 = field8450;
        this.field8444 = field8451;
        this.field8445 = field8452;
        this.field8446 = field8453;
        this.field8447 = field8454;
        this.field8448 = field8455;
    }
    
    @Override
    public void run() {
        final Class22 class22 = new Class22(this.field8443);
        if (this.field8444 != -1) {
            if (Class5934.method17846(this.field8449) <= 2L) {
                if (Class5934.method17846(this.field8449) == 2L) {
                    for (long field8445 = this.field8445; field8445 < Class5934.method17845(this.field8449); field8445 += this.field8446) {
                        final long n = field8445 * Class5934.method17849(this.field8449);
                        for (long n2 = 0L; n2 < Class5934.method17847(this.field8449); ++n2) {
                            final long n3 = n2 * Class5934.method17848(this.field8449) + n;
                            class22.method169(n2, this.field8447.method135(n3));
                            class22.method169(Class5934.method17847(this.field8449) + n2, this.field8447.method135(n3 + 1L));
                        }
                        Class5934.method17844(this.field8449).method30452(class22, 0L, this.field8448);
                        Class5934.method17844(this.field8449).method30452(class22, Class5934.method17847(this.field8449), this.field8448);
                        for (long n4 = 0L; n4 < Class5934.method17847(this.field8449); ++n4) {
                            final long n5 = n4 * Class5934.method17848(this.field8449) + n;
                            this.field8447.method169(n5, class22.method135(n4));
                            this.field8447.method169(n5 + 1L, class22.method135(Class5934.method17847(this.field8449) + n4));
                        }
                    }
                }
            }
            else {
                for (long field8446 = this.field8445; field8446 < Class5934.method17845(this.field8449); field8446 += this.field8446) {
                    final long n6 = field8446 * Class5934.method17849(this.field8449);
                    for (long n7 = 0L; n7 < Class5934.method17846(this.field8449); n7 += 4L) {
                        for (long n8 = 0L; n8 < Class5934.method17847(this.field8449); ++n8) {
                            final long n9 = n8 * Class5934.method17848(this.field8449) + n6 + n7;
                            final long n10 = Class5934.method17847(this.field8449) + n8;
                            class22.method169(n8, this.field8447.method135(n9));
                            class22.method169(n10, this.field8447.method135(n9 + 1L));
                            class22.method169(n10 + Class5934.method17847(this.field8449), this.field8447.method135(n9 + 2L));
                            class22.method169(n10 + 2L * Class5934.method17847(this.field8449), this.field8447.method135(n9 + 3L));
                        }
                        Class5934.method17844(this.field8449).method30452(class22, 0L, this.field8448);
                        Class5934.method17844(this.field8449).method30452(class22, Class5934.method17847(this.field8449), this.field8448);
                        Class5934.method17844(this.field8449).method30452(class22, 2L * Class5934.method17847(this.field8449), this.field8448);
                        Class5934.method17844(this.field8449).method30452(class22, 3L * Class5934.method17847(this.field8449), this.field8448);
                        for (long n11 = 0L; n11 < Class5934.method17847(this.field8449); ++n11) {
                            final long n12 = n11 * Class5934.method17848(this.field8449) + n6 + n7;
                            final long n13 = Class5934.method17847(this.field8449) + n11;
                            this.field8447.method169(n12, class22.method135(n11));
                            this.field8447.method169(n12 + 1L, class22.method135(n13));
                            this.field8447.method169(n12 + 2L, class22.method135(n13 + Class5934.method17847(this.field8449)));
                            this.field8447.method169(n12 + 3L, class22.method135(n13 + 2L * Class5934.method17847(this.field8449)));
                        }
                    }
                }
            }
        }
        else if (Class5934.method17846(this.field8449) <= 2L) {
            if (Class5934.method17846(this.field8449) == 2L) {
                for (long field8447 = this.field8445; field8447 < Class5934.method17845(this.field8449); field8447 += this.field8446) {
                    final long n14 = field8447 * Class5934.method17849(this.field8449);
                    for (long n15 = 0L; n15 < Class5934.method17847(this.field8449); ++n15) {
                        final long n16 = n15 * Class5934.method17848(this.field8449) + n14;
                        class22.method169(n15, this.field8447.method135(n16));
                        class22.method169(Class5934.method17847(this.field8449) + n15, this.field8447.method135(n16 + 1L));
                    }
                    Class5934.method17844(this.field8449).method30448(class22, 0L);
                    Class5934.method17844(this.field8449).method30448(class22, Class5934.method17847(this.field8449));
                    for (long n17 = 0L; n17 < Class5934.method17847(this.field8449); ++n17) {
                        final long n18 = n17 * Class5934.method17848(this.field8449) + n14;
                        this.field8447.method169(n18, class22.method135(n17));
                        this.field8447.method169(n18 + 1L, class22.method135(Class5934.method17847(this.field8449) + n17));
                    }
                }
            }
        }
        else {
            for (long field8448 = this.field8445; field8448 < Class5934.method17845(this.field8449); field8448 += this.field8446) {
                final long n19 = field8448 * Class5934.method17849(this.field8449);
                for (long n20 = 0L; n20 < Class5934.method17846(this.field8449); n20 += 4L) {
                    for (long n21 = 0L; n21 < Class5934.method17847(this.field8449); ++n21) {
                        final long n22 = n21 * Class5934.method17848(this.field8449) + n19 + n20;
                        final long n23 = Class5934.method17847(this.field8449) + n21;
                        class22.method169(n21, this.field8447.method135(n22));
                        class22.method169(n23, this.field8447.method135(n22 + 1L));
                        class22.method169(n23 + Class5934.method17847(this.field8449), this.field8447.method135(n22 + 2L));
                        class22.method169(n23 + 2L * Class5934.method17847(this.field8449), this.field8447.method135(n22 + 3L));
                    }
                    Class5934.method17844(this.field8449).method30448(class22, 0L);
                    Class5934.method17844(this.field8449).method30448(class22, Class5934.method17847(this.field8449));
                    Class5934.method17844(this.field8449).method30448(class22, 2L * Class5934.method17847(this.field8449));
                    Class5934.method17844(this.field8449).method30448(class22, 3L * Class5934.method17847(this.field8449));
                    for (long n24 = 0L; n24 < Class5934.method17847(this.field8449); ++n24) {
                        final long n25 = n24 * Class5934.method17848(this.field8449) + n19 + n20;
                        final long n26 = Class5934.method17847(this.field8449) + n24;
                        this.field8447.method169(n25, class22.method135(n24));
                        this.field8447.method169(n25 + 1L, class22.method135(n26));
                        this.field8447.method169(n25 + 2L, class22.method135(n26 + Class5934.method17847(this.field8449)));
                        this.field8447.method169(n25 + 3L, class22.method135(n26 + 2L * Class5934.method17847(this.field8449)));
                    }
                }
            }
        }
    }
}
