// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1528 implements Runnable
{
    private static String[] field8525;
    public final /* synthetic */ long field8526;
    public final /* synthetic */ int field8527;
    public final /* synthetic */ long field8528;
    public final /* synthetic */ int field8529;
    public final /* synthetic */ Class22 field8530;
    public final /* synthetic */ boolean field8531;
    public final /* synthetic */ Class9117 field8532;
    
    public Class1528(final Class9117 field8532, final long field8533, final int field8534, final long field8535, final int field8536, final Class22 field8537, final boolean field8538) {
        this.field8532 = field8532;
        this.field8526 = field8533;
        this.field8527 = field8534;
        this.field8528 = field8535;
        this.field8529 = field8536;
        this.field8530 = field8537;
        this.field8531 = field8538;
    }
    
    @Override
    public void run() {
        final Class22 class22 = new Class22(this.field8526);
        if (this.field8527 != -1) {
            for (long field8528 = this.field8528; field8528 < Class9117.method33014(this.field8532); field8528 += this.field8529) {
                final long n = field8528 * Class9117.method33010(this.field8532);
                for (long n2 = 0L; n2 < Class9117.method33011(this.field8532); ++n2) {
                    Class9117.method33005(this.field8532).method29696(this.field8530, n + n2 * Class9117.method33012(this.field8532), this.field8531);
                }
                if (Class9117.method33013(this.field8532) <= 2L) {
                    if (Class9117.method33013(this.field8532) == 2L) {
                        for (long n3 = 0L; n3 < Class9117.method33011(this.field8532); ++n3) {
                            final long n4 = n + n3 * Class9117.method33012(this.field8532);
                            class22.method169(n3, this.field8530.method135(n4));
                            class22.method169(Class9117.method33011(this.field8532) + n3, this.field8530.method135(n4 + 1L));
                        }
                        Class9117.method33007(this.field8532).method29696(class22, 0L, this.field8531);
                        Class9117.method33007(this.field8532).method29696(class22, Class9117.method33011(this.field8532), this.field8531);
                        for (long n5 = 0L; n5 < Class9117.method33011(this.field8532); ++n5) {
                            final long n6 = n + n5 * Class9117.method33012(this.field8532);
                            this.field8530.method169(n6, class22.method135(n5));
                            this.field8530.method169(n6 + 1L, class22.method135(Class9117.method33011(this.field8532) + n5));
                        }
                    }
                }
                else {
                    for (long n7 = 0L; n7 < Class9117.method33013(this.field8532); n7 += 4L) {
                        for (long n8 = 0L; n8 < Class9117.method33011(this.field8532); ++n8) {
                            final long n9 = n + n8 * Class9117.method33012(this.field8532) + n7;
                            final long n10 = Class9117.method33011(this.field8532) + n8;
                            class22.method169(n8, this.field8530.method135(n9));
                            class22.method169(n10, this.field8530.method135(n9 + 1L));
                            class22.method169(n10 + Class9117.method33011(this.field8532), this.field8530.method135(n9 + 2L));
                            class22.method169(n10 + 2L * Class9117.method33011(this.field8532), this.field8530.method135(n9 + 3L));
                        }
                        Class9117.method33007(this.field8532).method29696(class22, 0L, this.field8531);
                        Class9117.method33007(this.field8532).method29696(class22, Class9117.method33011(this.field8532), this.field8531);
                        Class9117.method33007(this.field8532).method29696(class22, 2L * Class9117.method33011(this.field8532), this.field8531);
                        Class9117.method33007(this.field8532).method29696(class22, 3L * Class9117.method33011(this.field8532), this.field8531);
                        for (long n11 = 0L; n11 < Class9117.method33011(this.field8532); ++n11) {
                            final long n12 = n + n11 * Class9117.method33012(this.field8532) + n7;
                            final long n13 = Class9117.method33011(this.field8532) + n11;
                            this.field8530.method169(n12, class22.method135(n11));
                            this.field8530.method169(n12 + 1L, class22.method135(n13));
                            this.field8530.method169(n12 + 2L, class22.method135(n13 + Class9117.method33011(this.field8532)));
                            this.field8530.method169(n12 + 3L, class22.method135(n13 + 2L * Class9117.method33011(this.field8532)));
                        }
                    }
                }
            }
        }
        else {
            for (long field8529 = this.field8528; field8529 < Class9117.method33014(this.field8532); field8529 += this.field8529) {
                final long n14 = field8529 * Class9117.method33010(this.field8532);
                for (long n15 = 0L; n15 < Class9117.method33011(this.field8532); ++n15) {
                    Class9117.method33005(this.field8532).method29692(this.field8530, n14 + n15 * Class9117.method33012(this.field8532), this.field8531);
                }
                if (Class9117.method33013(this.field8532) <= 2L) {
                    if (Class9117.method33013(this.field8532) == 2L) {
                        for (long n16 = 0L; n16 < Class9117.method33011(this.field8532); ++n16) {
                            final long n17 = n14 + n16 * Class9117.method33012(this.field8532);
                            class22.method169(n16, this.field8530.method135(n17));
                            class22.method169(Class9117.method33011(this.field8532) + n16, this.field8530.method135(n17 + 1L));
                        }
                        Class9117.method33007(this.field8532).method29692(class22, 0L, this.field8531);
                        Class9117.method33007(this.field8532).method29692(class22, Class9117.method33011(this.field8532), this.field8531);
                        for (long n18 = 0L; n18 < Class9117.method33011(this.field8532); ++n18) {
                            final long n19 = n14 + n18 * Class9117.method33012(this.field8532);
                            this.field8530.method169(n19, class22.method135(n18));
                            this.field8530.method169(n19 + 1L, class22.method135(Class9117.method33011(this.field8532) + n18));
                        }
                    }
                }
                else {
                    for (long n20 = 0L; n20 < Class9117.method33013(this.field8532); n20 += 4L) {
                        for (long n21 = 0L; n21 < Class9117.method33011(this.field8532); ++n21) {
                            final long n22 = n14 + n21 * Class9117.method33012(this.field8532) + n20;
                            final long n23 = Class9117.method33011(this.field8532) + n21;
                            class22.method169(n21, this.field8530.method135(n22));
                            class22.method169(n23, this.field8530.method135(n22 + 1L));
                            class22.method169(n23 + Class9117.method33011(this.field8532), this.field8530.method135(n22 + 2L));
                            class22.method169(n23 + 2L * Class9117.method33011(this.field8532), this.field8530.method135(n22 + 3L));
                        }
                        Class9117.method33007(this.field8532).method29692(class22, 0L, this.field8531);
                        Class9117.method33007(this.field8532).method29692(class22, Class9117.method33011(this.field8532), this.field8531);
                        Class9117.method33007(this.field8532).method29692(class22, 2L * Class9117.method33011(this.field8532), this.field8531);
                        Class9117.method33007(this.field8532).method29692(class22, 3L * Class9117.method33011(this.field8532), this.field8531);
                        for (long n24 = 0L; n24 < Class9117.method33011(this.field8532); ++n24) {
                            final long n25 = n14 + n24 * Class9117.method33012(this.field8532) + n20;
                            final long n26 = Class9117.method33011(this.field8532) + n24;
                            this.field8530.method169(n25, class22.method135(n24));
                            this.field8530.method169(n25 + 1L, class22.method135(n26));
                            this.field8530.method169(n25 + 2L, class22.method135(n26 + Class9117.method33011(this.field8532)));
                            this.field8530.method169(n25 + 3L, class22.method135(n26 + 2L * Class9117.method33011(this.field8532)));
                        }
                    }
                }
            }
        }
    }
}
