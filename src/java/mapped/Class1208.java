// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1208 implements Runnable
{
    private static String[] field6548;
    public final /* synthetic */ long field6549;
    public final /* synthetic */ int field6550;
    public final /* synthetic */ long field6551;
    public final /* synthetic */ int field6552;
    public final /* synthetic */ Class17 field6553;
    public final /* synthetic */ boolean field6554;
    public final /* synthetic */ Class7796 field6555;
    
    public Class1208(final Class7796 field6555, final long field6556, final int field6557, final long field6558, final int field6559, final Class17 field6560, final boolean field6561) {
        this.field6555 = field6555;
        this.field6549 = field6556;
        this.field6550 = field6557;
        this.field6551 = field6558;
        this.field6552 = field6559;
        this.field6553 = field6560;
        this.field6554 = field6561;
    }
    
    @Override
    public void run() {
        final Class17 class17 = new Class17(this.field6549);
        if (this.field6550 != -1) {
            for (long field6551 = this.field6551; field6551 < Class7796.method25155(this.field6555); field6551 += this.field6552) {
                final long n = field6551 * Class7796.method25151(this.field6555);
                for (long n2 = 0L; n2 < Class7796.method25152(this.field6555); ++n2) {
                    Class7796.method25146(this.field6555).method18043(this.field6553, n + n2 * Class7796.method25153(this.field6555), this.field6554);
                }
                if (Class7796.method25154(this.field6555) <= 2L) {
                    if (Class7796.method25154(this.field6555) == 2L) {
                        for (long n3 = 0L; n3 < Class7796.method25152(this.field6555); ++n3) {
                            final long n4 = n + n3 * Class7796.method25153(this.field6555);
                            class17.method171(n3, this.field6553.method137(n4));
                            class17.method171(Class7796.method25152(this.field6555) + n3, this.field6553.method137(n4 + 1L));
                        }
                        Class7796.method25148(this.field6555).method18043(class17, 0L, this.field6554);
                        Class7796.method25148(this.field6555).method18043(class17, Class7796.method25152(this.field6555), this.field6554);
                        for (long n5 = 0L; n5 < Class7796.method25152(this.field6555); ++n5) {
                            final long n6 = n + n5 * Class7796.method25153(this.field6555);
                            this.field6553.method171(n6, class17.method137(n5));
                            this.field6553.method171(n6 + 1L, class17.method137(Class7796.method25152(this.field6555) + n5));
                        }
                    }
                }
                else {
                    for (long n7 = 0L; n7 < Class7796.method25154(this.field6555); n7 += 4L) {
                        for (long n8 = 0L; n8 < Class7796.method25152(this.field6555); ++n8) {
                            final long n9 = n + n8 * Class7796.method25153(this.field6555) + n7;
                            final long n10 = Class7796.method25152(this.field6555) + n8;
                            class17.method171(n8, this.field6553.method137(n9));
                            class17.method171(n10, this.field6553.method137(n9 + 1L));
                            class17.method171(n10 + Class7796.method25152(this.field6555), this.field6553.method137(n9 + 2L));
                            class17.method171(n10 + 2L * Class7796.method25152(this.field6555), this.field6553.method137(n9 + 3L));
                        }
                        Class7796.method25148(this.field6555).method18043(class17, 0L, this.field6554);
                        Class7796.method25148(this.field6555).method18043(class17, Class7796.method25152(this.field6555), this.field6554);
                        Class7796.method25148(this.field6555).method18043(class17, 2L * Class7796.method25152(this.field6555), this.field6554);
                        Class7796.method25148(this.field6555).method18043(class17, 3L * Class7796.method25152(this.field6555), this.field6554);
                        for (long n11 = 0L; n11 < Class7796.method25152(this.field6555); ++n11) {
                            final long n12 = n + n11 * Class7796.method25153(this.field6555) + n7;
                            final long n13 = Class7796.method25152(this.field6555) + n11;
                            this.field6553.method171(n12, class17.method137(n11));
                            this.field6553.method171(n12 + 1L, class17.method137(n13));
                            this.field6553.method171(n12 + 2L, class17.method137(n13 + Class7796.method25152(this.field6555)));
                            this.field6553.method171(n12 + 3L, class17.method137(n13 + 2L * Class7796.method25152(this.field6555)));
                        }
                    }
                }
            }
        }
        else {
            for (long field6552 = this.field6551; field6552 < Class7796.method25155(this.field6555); field6552 += this.field6552) {
                final long n14 = field6552 * Class7796.method25151(this.field6555);
                for (long n15 = 0L; n15 < Class7796.method25152(this.field6555); ++n15) {
                    Class7796.method25146(this.field6555).method18039(this.field6553, n14 + n15 * Class7796.method25153(this.field6555), this.field6554);
                }
                if (Class7796.method25154(this.field6555) <= 2L) {
                    if (Class7796.method25154(this.field6555) == 2L) {
                        for (long n16 = 0L; n16 < Class7796.method25152(this.field6555); ++n16) {
                            final long n17 = n14 + n16 * Class7796.method25153(this.field6555);
                            class17.method171(n16, this.field6553.method137(n17));
                            class17.method171(Class7796.method25152(this.field6555) + n16, this.field6553.method137(n17 + 1L));
                        }
                        Class7796.method25148(this.field6555).method18039(class17, 0L, this.field6554);
                        Class7796.method25148(this.field6555).method18039(class17, Class7796.method25152(this.field6555), this.field6554);
                        for (long n18 = 0L; n18 < Class7796.method25152(this.field6555); ++n18) {
                            final long n19 = n14 + n18 * Class7796.method25153(this.field6555);
                            this.field6553.method171(n19, class17.method137(n18));
                            this.field6553.method171(n19 + 1L, class17.method137(Class7796.method25152(this.field6555) + n18));
                        }
                    }
                }
                else {
                    for (long n20 = 0L; n20 < Class7796.method25154(this.field6555); n20 += 4L) {
                        for (long n21 = 0L; n21 < Class7796.method25152(this.field6555); ++n21) {
                            final long n22 = n14 + n21 * Class7796.method25153(this.field6555) + n20;
                            final long n23 = Class7796.method25152(this.field6555) + n21;
                            class17.method171(n21, this.field6553.method137(n22));
                            class17.method171(n23, this.field6553.method137(n22 + 1L));
                            class17.method171(n23 + Class7796.method25152(this.field6555), this.field6553.method137(n22 + 2L));
                            class17.method171(n23 + 2L * Class7796.method25152(this.field6555), this.field6553.method137(n22 + 3L));
                        }
                        Class7796.method25148(this.field6555).method18039(class17, 0L, this.field6554);
                        Class7796.method25148(this.field6555).method18039(class17, Class7796.method25152(this.field6555), this.field6554);
                        Class7796.method25148(this.field6555).method18039(class17, 2L * Class7796.method25152(this.field6555), this.field6554);
                        Class7796.method25148(this.field6555).method18039(class17, 3L * Class7796.method25152(this.field6555), this.field6554);
                        for (long n24 = 0L; n24 < Class7796.method25152(this.field6555); ++n24) {
                            final long n25 = n14 + n24 * Class7796.method25153(this.field6555) + n20;
                            final long n26 = Class7796.method25152(this.field6555) + n24;
                            this.field6553.method171(n25, class17.method137(n24));
                            this.field6553.method171(n25 + 1L, class17.method137(n26));
                            this.field6553.method171(n25 + 2L, class17.method137(n26 + Class7796.method25152(this.field6555)));
                            this.field6553.method171(n25 + 3L, class17.method137(n26 + 2L * Class7796.method25152(this.field6555)));
                        }
                    }
                }
            }
        }
    }
}
