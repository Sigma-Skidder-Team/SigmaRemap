// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class879 implements Runnable
{
    private static String[] field4734;
    public final /* synthetic */ long field4735;
    public final /* synthetic */ int field4736;
    public final /* synthetic */ long field4737;
    public final /* synthetic */ int field4738;
    public final /* synthetic */ Class22 field4739;
    public final /* synthetic */ boolean field4740;
    public final /* synthetic */ Class9117 field4741;
    
    public Class879(final Class9117 field4741, final long field4742, final int field4743, final long field4744, final int field4745, final Class22 field4746, final boolean field4747) {
        this.field4741 = field4741;
        this.field4735 = field4742;
        this.field4736 = field4743;
        this.field4737 = field4744;
        this.field4738 = field4745;
        this.field4739 = field4746;
        this.field4740 = field4747;
    }
    
    @Override
    public void run() {
        final Class22 class22 = new Class22(this.field4735);
        if (this.field4736 != -1) {
            if (Class9117.method33013(this.field4741) <= 2L) {
                if (Class9117.method33013(this.field4741) == 2L) {
                    for (long field4737 = this.field4737; field4737 < Class9117.method33011(this.field4741); field4737 += this.field4738) {
                        final long n = field4737 * Class9117.method33012(this.field4741);
                        for (long n2 = 0L; n2 < Class9117.method33014(this.field4741); ++n2) {
                            final long n3 = n2 * Class9117.method33010(this.field4741) + n;
                            class22.method169(n2, this.field4739.method135(n3));
                            class22.method169(Class9117.method33014(this.field4741) + n2, this.field4739.method135(n3 + 1L));
                        }
                        Class9117.method33009(this.field4741).method29696(class22, 0L, this.field4740);
                        Class9117.method33009(this.field4741).method29696(class22, Class9117.method33014(this.field4741), this.field4740);
                        for (long n4 = 0L; n4 < Class9117.method33014(this.field4741); ++n4) {
                            final long n5 = n4 * Class9117.method33010(this.field4741) + n;
                            this.field4739.method169(n5, class22.method135(n4));
                            this.field4739.method169(n5 + 1L, class22.method135(Class9117.method33014(this.field4741) + n4));
                        }
                    }
                }
            }
            else {
                for (long field4738 = this.field4737; field4738 < Class9117.method33011(this.field4741); field4738 += this.field4738) {
                    final long n6 = field4738 * Class9117.method33012(this.field4741);
                    for (long n7 = 0L; n7 < Class9117.method33013(this.field4741); n7 += 4L) {
                        for (long n8 = 0L; n8 < Class9117.method33014(this.field4741); ++n8) {
                            final long n9 = n8 * Class9117.method33010(this.field4741) + n6 + n7;
                            final long n10 = Class9117.method33014(this.field4741) + n8;
                            class22.method169(n8, this.field4739.method135(n9));
                            class22.method169(n10, this.field4739.method135(n9 + 1L));
                            class22.method169(n10 + Class9117.method33014(this.field4741), this.field4739.method135(n9 + 2L));
                            class22.method169(n10 + 2L * Class9117.method33014(this.field4741), this.field4739.method135(n9 + 3L));
                        }
                        Class9117.method33009(this.field4741).method29696(class22, 0L, this.field4740);
                        Class9117.method33009(this.field4741).method29696(class22, Class9117.method33014(this.field4741), this.field4740);
                        Class9117.method33009(this.field4741).method29696(class22, 2L * Class9117.method33014(this.field4741), this.field4740);
                        Class9117.method33009(this.field4741).method29696(class22, 3L * Class9117.method33014(this.field4741), this.field4740);
                        for (long n11 = 0L; n11 < Class9117.method33014(this.field4741); ++n11) {
                            final long n12 = n11 * Class9117.method33010(this.field4741) + n6 + n7;
                            final long n13 = Class9117.method33014(this.field4741) + n11;
                            this.field4739.method169(n12, class22.method135(n11));
                            this.field4739.method169(n12 + 1L, class22.method135(n13));
                            this.field4739.method169(n12 + 2L, class22.method135(n13 + Class9117.method33014(this.field4741)));
                            this.field4739.method169(n12 + 3L, class22.method135(n13 + 2L * Class9117.method33014(this.field4741)));
                        }
                    }
                }
            }
        }
        else if (Class9117.method33013(this.field4741) <= 2L) {
            if (Class9117.method33013(this.field4741) == 2L) {
                for (long field4739 = this.field4737; field4739 < Class9117.method33011(this.field4741); field4739 += this.field4738) {
                    final long n14 = field4739 * Class9117.method33012(this.field4741);
                    for (long n15 = 0L; n15 < Class9117.method33014(this.field4741); ++n15) {
                        final long n16 = n15 * Class9117.method33010(this.field4741) + n14;
                        class22.method169(n15, this.field4739.method135(n16));
                        class22.method169(Class9117.method33014(this.field4741) + n15, this.field4739.method135(n16 + 1L));
                    }
                    Class9117.method33009(this.field4741).method29692(class22, 0L, this.field4740);
                    Class9117.method33009(this.field4741).method29692(class22, Class9117.method33014(this.field4741), this.field4740);
                    for (long n17 = 0L; n17 < Class9117.method33014(this.field4741); ++n17) {
                        final long n18 = n17 * Class9117.method33010(this.field4741) + n14;
                        this.field4739.method169(n18, class22.method135(n17));
                        this.field4739.method169(n18 + 1L, class22.method135(Class9117.method33014(this.field4741) + n17));
                    }
                }
            }
        }
        else {
            for (long field4740 = this.field4737; field4740 < Class9117.method33011(this.field4741); field4740 += this.field4738) {
                final long n19 = field4740 * Class9117.method33012(this.field4741);
                for (long n20 = 0L; n20 < Class9117.method33013(this.field4741); n20 += 4L) {
                    for (long n21 = 0L; n21 < Class9117.method33014(this.field4741); ++n21) {
                        final long n22 = n21 * Class9117.method33010(this.field4741) + n19 + n20;
                        final long n23 = Class9117.method33014(this.field4741) + n21;
                        class22.method169(n21, this.field4739.method135(n22));
                        class22.method169(n23, this.field4739.method135(n22 + 1L));
                        class22.method169(n23 + Class9117.method33014(this.field4741), this.field4739.method135(n22 + 2L));
                        class22.method169(n23 + 2L * Class9117.method33014(this.field4741), this.field4739.method135(n22 + 3L));
                    }
                    Class9117.method33009(this.field4741).method29692(class22, 0L, this.field4740);
                    Class9117.method33009(this.field4741).method29692(class22, Class9117.method33014(this.field4741), this.field4740);
                    Class9117.method33009(this.field4741).method29692(class22, 2L * Class9117.method33014(this.field4741), this.field4740);
                    Class9117.method33009(this.field4741).method29692(class22, 3L * Class9117.method33014(this.field4741), this.field4740);
                    for (long n24 = 0L; n24 < Class9117.method33014(this.field4741); ++n24) {
                        final long n25 = n24 * Class9117.method33010(this.field4741) + n19 + n20;
                        final long n26 = Class9117.method33014(this.field4741) + n24;
                        this.field4739.method169(n25, class22.method135(n24));
                        this.field4739.method169(n25 + 1L, class22.method135(n26));
                        this.field4739.method169(n25 + 2L, class22.method135(n26 + Class9117.method33014(this.field4741)));
                        this.field4739.method169(n25 + 3L, class22.method135(n26 + 2L * Class9117.method33014(this.field4741)));
                    }
                }
            }
        }
    }
}
