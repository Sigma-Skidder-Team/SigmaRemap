// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1640 implements Runnable
{
    private static String[] field9166;
    public final /* synthetic */ long field9167;
    public final /* synthetic */ int field9168;
    public final /* synthetic */ long field9169;
    public final /* synthetic */ int field9170;
    public final /* synthetic */ Class22 field9171;
    public final /* synthetic */ boolean field9172;
    public final /* synthetic */ Class6498 field9173;
    
    public Class1640(final Class6498 field9173, final long field9174, final int field9175, final long field9176, final int field9177, final Class22 field9178, final boolean field9179) {
        this.field9173 = field9173;
        this.field9167 = field9174;
        this.field9168 = field9175;
        this.field9169 = field9176;
        this.field9170 = field9177;
        this.field9171 = field9178;
        this.field9172 = field9179;
    }
    
    @Override
    public void run() {
        final Class22 class22 = new Class22(this.field9167);
        if (this.field9168 != -1) {
            for (long field9169 = this.field9169; field9169 < Class6498.method19576(this.field9173); field9169 += this.field9170) {
                final long n = field9169 * Class6498.method19572(this.field9173);
                for (long n2 = 0L; n2 < Class6498.method19573(this.field9173); ++n2) {
                    Class6498.method19567(this.field9173).method34188(this.field9171, n + n2 * Class6498.method19574(this.field9173), this.field9172);
                }
                if (Class6498.method19575(this.field9173) <= 2L) {
                    if (Class6498.method19575(this.field9173) == 2L) {
                        for (long n3 = 0L; n3 < Class6498.method19573(this.field9173); ++n3) {
                            final long n4 = n + n3 * Class6498.method19574(this.field9173);
                            class22.method169(n3, this.field9171.method135(n4));
                            class22.method169(Class6498.method19573(this.field9173) + n3, this.field9171.method135(n4 + 1L));
                        }
                        Class6498.method19569(this.field9173).method34188(class22, 0L, this.field9172);
                        Class6498.method19569(this.field9173).method34188(class22, Class6498.method19573(this.field9173), this.field9172);
                        for (long n5 = 0L; n5 < Class6498.method19573(this.field9173); ++n5) {
                            final long n6 = n + n5 * Class6498.method19574(this.field9173);
                            this.field9171.method169(n6, class22.method135(n5));
                            this.field9171.method169(n6 + 1L, class22.method135(Class6498.method19573(this.field9173) + n5));
                        }
                    }
                }
                else {
                    for (long n7 = 0L; n7 < Class6498.method19575(this.field9173); n7 += 4L) {
                        for (long n8 = 0L; n8 < Class6498.method19573(this.field9173); ++n8) {
                            final long n9 = n + n8 * Class6498.method19574(this.field9173) + n7;
                            final long n10 = Class6498.method19573(this.field9173) + n8;
                            class22.method169(n8, this.field9171.method135(n9));
                            class22.method169(n10, this.field9171.method135(n9 + 1L));
                            class22.method169(n10 + Class6498.method19573(this.field9173), this.field9171.method135(n9 + 2L));
                            class22.method169(n10 + 2L * Class6498.method19573(this.field9173), this.field9171.method135(n9 + 3L));
                        }
                        Class6498.method19569(this.field9173).method34188(class22, 0L, this.field9172);
                        Class6498.method19569(this.field9173).method34188(class22, Class6498.method19573(this.field9173), this.field9172);
                        Class6498.method19569(this.field9173).method34188(class22, 2L * Class6498.method19573(this.field9173), this.field9172);
                        Class6498.method19569(this.field9173).method34188(class22, 3L * Class6498.method19573(this.field9173), this.field9172);
                        for (long n11 = 0L; n11 < Class6498.method19573(this.field9173); ++n11) {
                            final long n12 = n + n11 * Class6498.method19574(this.field9173) + n7;
                            final long n13 = Class6498.method19573(this.field9173) + n11;
                            this.field9171.method169(n12, class22.method135(n11));
                            this.field9171.method169(n12 + 1L, class22.method135(n13));
                            this.field9171.method169(n12 + 2L, class22.method135(n13 + Class6498.method19573(this.field9173)));
                            this.field9171.method169(n12 + 3L, class22.method135(n13 + 2L * Class6498.method19573(this.field9173)));
                        }
                    }
                }
            }
        }
        else {
            for (long field9170 = this.field9169; field9170 < Class6498.method19576(this.field9173); field9170 += this.field9170) {
                final long n14 = field9170 * Class6498.method19572(this.field9173);
                for (long n15 = 0L; n15 < Class6498.method19573(this.field9173); ++n15) {
                    Class6498.method19567(this.field9173).method34184(this.field9171, n14 + n15 * Class6498.method19574(this.field9173), this.field9172);
                }
                if (Class6498.method19575(this.field9173) <= 2L) {
                    if (Class6498.method19575(this.field9173) == 2L) {
                        for (long n16 = 0L; n16 < Class6498.method19573(this.field9173); ++n16) {
                            final long n17 = n14 + n16 * Class6498.method19574(this.field9173);
                            class22.method169(n16, this.field9171.method135(n17));
                            class22.method169(Class6498.method19573(this.field9173) + n16, this.field9171.method135(n17 + 1L));
                        }
                        Class6498.method19569(this.field9173).method34184(class22, 0L, this.field9172);
                        Class6498.method19569(this.field9173).method34184(class22, Class6498.method19573(this.field9173), this.field9172);
                        for (long n18 = 0L; n18 < Class6498.method19573(this.field9173); ++n18) {
                            final long n19 = n14 + n18 * Class6498.method19574(this.field9173);
                            this.field9171.method169(n19, class22.method135(n18));
                            this.field9171.method169(n19 + 1L, class22.method135(Class6498.method19573(this.field9173) + n18));
                        }
                    }
                }
                else {
                    for (long n20 = 0L; n20 < Class6498.method19575(this.field9173); n20 += 4L) {
                        for (long n21 = 0L; n21 < Class6498.method19573(this.field9173); ++n21) {
                            final long n22 = n14 + n21 * Class6498.method19574(this.field9173) + n20;
                            final long n23 = Class6498.method19573(this.field9173) + n21;
                            class22.method169(n21, this.field9171.method135(n22));
                            class22.method169(n23, this.field9171.method135(n22 + 1L));
                            class22.method169(n23 + Class6498.method19573(this.field9173), this.field9171.method135(n22 + 2L));
                            class22.method169(n23 + 2L * Class6498.method19573(this.field9173), this.field9171.method135(n22 + 3L));
                        }
                        Class6498.method19569(this.field9173).method34184(class22, 0L, this.field9172);
                        Class6498.method19569(this.field9173).method34184(class22, Class6498.method19573(this.field9173), this.field9172);
                        Class6498.method19569(this.field9173).method34184(class22, 2L * Class6498.method19573(this.field9173), this.field9172);
                        Class6498.method19569(this.field9173).method34184(class22, 3L * Class6498.method19573(this.field9173), this.field9172);
                        for (long n24 = 0L; n24 < Class6498.method19573(this.field9173); ++n24) {
                            final long n25 = n14 + n24 * Class6498.method19574(this.field9173) + n20;
                            final long n26 = Class6498.method19573(this.field9173) + n24;
                            this.field9171.method169(n25, class22.method135(n24));
                            this.field9171.method169(n25 + 1L, class22.method135(n26));
                            this.field9171.method169(n25 + 2L, class22.method135(n26 + Class6498.method19573(this.field9173)));
                            this.field9171.method169(n25 + 3L, class22.method135(n26 + 2L * Class6498.method19573(this.field9173)));
                        }
                    }
                }
            }
        }
    }
}
