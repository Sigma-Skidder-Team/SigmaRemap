// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1091 implements Runnable
{
    private static String[] field5885;
    public final /* synthetic */ long field5886;
    public final /* synthetic */ int field5887;
    public final /* synthetic */ long field5888;
    public final /* synthetic */ int field5889;
    public final /* synthetic */ Class22 field5890;
    public final /* synthetic */ boolean field5891;
    public final /* synthetic */ Class5934 field5892;
    
    public Class1091(final Class5934 field5892, final long field5893, final int field5894, final long field5895, final int field5896, final Class22 field5897, final boolean field5898) {
        this.field5892 = field5892;
        this.field5886 = field5893;
        this.field5887 = field5894;
        this.field5888 = field5895;
        this.field5889 = field5896;
        this.field5890 = field5897;
        this.field5891 = field5898;
    }
    
    @Override
    public void run() {
        final Class22 class22 = new Class22(this.field5886);
        if (this.field5887 != -1) {
            for (long field5888 = this.field5888; field5888 < Class5934.method17847(this.field5892); field5888 += this.field5889) {
                final long n = field5888 * Class5934.method17837(this.field5892);
                for (long n2 = 0L; n2 < Class5934.method17845(this.field5892); ++n2) {
                    Class5934.method17840(this.field5892).method30452(this.field5890, n + n2 * Class5934.method17839(this.field5892), this.field5891);
                }
                if (Class5934.method17846(this.field5892) <= 2L) {
                    if (Class5934.method17846(this.field5892) == 2L) {
                        for (long n3 = 0L; n3 < Class5934.method17845(this.field5892); ++n3) {
                            final long n4 = n + n3 * Class5934.method17839(this.field5892);
                            class22.method169(n3, this.field5890.method135(n4));
                            class22.method169(Class5934.method17845(this.field5892) + n3, this.field5890.method135(n4 + 1L));
                        }
                        Class5934.method17842(this.field5892).method30452(class22, 0L, this.field5891);
                        Class5934.method17842(this.field5892).method30452(class22, Class5934.method17845(this.field5892), this.field5891);
                        for (long n5 = 0L; n5 < Class5934.method17845(this.field5892); ++n5) {
                            final long n6 = n + n5 * Class5934.method17839(this.field5892);
                            this.field5890.method169(n6, class22.method135(n5));
                            this.field5890.method169(n6 + 1L, class22.method135(Class5934.method17845(this.field5892) + n5));
                        }
                    }
                }
                else {
                    for (long n7 = 0L; n7 < Class5934.method17846(this.field5892); n7 += 4L) {
                        for (long n8 = 0L; n8 < Class5934.method17845(this.field5892); ++n8) {
                            final long n9 = n + n8 * Class5934.method17839(this.field5892) + n7;
                            final long n10 = Class5934.method17845(this.field5892) + n8;
                            class22.method169(n8, this.field5890.method135(n9));
                            class22.method169(n10, this.field5890.method135(n9 + 1L));
                            class22.method169(n10 + Class5934.method17845(this.field5892), this.field5890.method135(n9 + 2L));
                            class22.method169(n10 + 2L * Class5934.method17845(this.field5892), this.field5890.method135(n9 + 3L));
                        }
                        Class5934.method17842(this.field5892).method30452(class22, 0L, this.field5891);
                        Class5934.method17842(this.field5892).method30452(class22, Class5934.method17845(this.field5892), this.field5891);
                        Class5934.method17842(this.field5892).method30452(class22, 2L * Class5934.method17845(this.field5892), this.field5891);
                        Class5934.method17842(this.field5892).method30452(class22, 3L * Class5934.method17845(this.field5892), this.field5891);
                        for (long n11 = 0L; n11 < Class5934.method17845(this.field5892); ++n11) {
                            final long n12 = n + n11 * Class5934.method17839(this.field5892) + n7;
                            final long n13 = Class5934.method17845(this.field5892) + n11;
                            this.field5890.method169(n12, class22.method135(n11));
                            this.field5890.method169(n12 + 1L, class22.method135(n13));
                            this.field5890.method169(n12 + 2L, class22.method135(n13 + Class5934.method17845(this.field5892)));
                            this.field5890.method169(n12 + 3L, class22.method135(n13 + 2L * Class5934.method17845(this.field5892)));
                        }
                    }
                }
            }
        }
        else {
            for (long field5889 = this.field5888; field5889 < Class5934.method17847(this.field5892); field5889 += this.field5889) {
                final long n14 = field5889 * Class5934.method17837(this.field5892);
                for (long n15 = 0L; n15 < Class5934.method17845(this.field5892); ++n15) {
                    Class5934.method17840(this.field5892).method30448(this.field5890, n14 + n15 * Class5934.method17839(this.field5892));
                }
                if (Class5934.method17846(this.field5892) <= 2L) {
                    if (Class5934.method17846(this.field5892) == 2L) {
                        for (long n16 = 0L; n16 < Class5934.method17845(this.field5892); ++n16) {
                            final long n17 = n14 + n16 * Class5934.method17839(this.field5892);
                            class22.method169(n16, this.field5890.method135(n17));
                            class22.method169(Class5934.method17845(this.field5892) + n16, this.field5890.method135(n17 + 1L));
                        }
                        Class5934.method17842(this.field5892).method30448(class22, 0L);
                        Class5934.method17842(this.field5892).method30448(class22, Class5934.method17845(this.field5892));
                        for (long n18 = 0L; n18 < Class5934.method17845(this.field5892); ++n18) {
                            final long n19 = n14 + n18 * Class5934.method17839(this.field5892);
                            this.field5890.method169(n19, class22.method135(n18));
                            this.field5890.method169(n19 + 1L, class22.method135(Class5934.method17845(this.field5892) + n18));
                        }
                    }
                }
                else {
                    for (long n20 = 0L; n20 < Class5934.method17846(this.field5892); n20 += 4L) {
                        for (long n21 = 0L; n21 < Class5934.method17845(this.field5892); ++n21) {
                            final long n22 = n14 + n21 * Class5934.method17839(this.field5892) + n20;
                            final long n23 = Class5934.method17845(this.field5892) + n21;
                            class22.method169(n21, this.field5890.method135(n22));
                            class22.method169(n23, this.field5890.method135(n22 + 1L));
                            class22.method169(n23 + Class5934.method17845(this.field5892), this.field5890.method135(n22 + 2L));
                            class22.method169(n23 + 2L * Class5934.method17845(this.field5892), this.field5890.method135(n22 + 3L));
                        }
                        Class5934.method17842(this.field5892).method30448(class22, 0L);
                        Class5934.method17842(this.field5892).method30448(class22, Class5934.method17845(this.field5892));
                        Class5934.method17842(this.field5892).method30448(class22, 2L * Class5934.method17845(this.field5892));
                        Class5934.method17842(this.field5892).method30448(class22, 3L * Class5934.method17845(this.field5892));
                        for (long n24 = 0L; n24 < Class5934.method17845(this.field5892); ++n24) {
                            final long n25 = n14 + n24 * Class5934.method17839(this.field5892) + n20;
                            final long n26 = Class5934.method17845(this.field5892) + n24;
                            this.field5890.method169(n25, class22.method135(n24));
                            this.field5890.method169(n25 + 1L, class22.method135(n26));
                            this.field5890.method169(n25 + 2L, class22.method135(n26 + Class5934.method17845(this.field5892)));
                            this.field5890.method169(n25 + 3L, class22.method135(n26 + 2L * Class5934.method17845(this.field5892)));
                        }
                    }
                }
            }
        }
    }
}
