// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class985 implements Runnable
{
    private static String[] field5253;
    public final /* synthetic */ long field5254;
    public final /* synthetic */ int field5255;
    public final /* synthetic */ long field5256;
    public final /* synthetic */ int field5257;
    public final /* synthetic */ Class22 field5258;
    public final /* synthetic */ boolean field5259;
    public final /* synthetic */ Class6874 field5260;
    
    public Class985(final Class6874 field5260, final long field5261, final int field5262, final long field5263, final int field5264, final Class22 field5265, final boolean field5266) {
        this.field5260 = field5260;
        this.field5254 = field5261;
        this.field5255 = field5262;
        this.field5256 = field5263;
        this.field5257 = field5264;
        this.field5258 = field5265;
        this.field5259 = field5266;
    }
    
    @Override
    public void run() {
        final Class22 class22 = new Class22(this.field5254);
        if (Class6874.method21037(this.field5260) <= 2L) {
            if (Class6874.method21037(this.field5260) == 2L) {
                for (long n = 0L; n < Class6874.method21038(this.field5260); ++n) {
                    final long n2 = n * Class6874.method21037(this.field5260) + 2L * this.field5256;
                    final long n3 = n;
                    class22.method169(n3, this.field5258.method135(n2));
                    class22.method169(n3 + Class6874.method21038(this.field5260), this.field5258.method135(n2 + 1L));
                }
                if (this.field5255 != -1) {
                    Class6874.method21036(this.field5260).method30452(class22, 0L, this.field5259);
                    Class6874.method21036(this.field5260).method30452(class22, Class6874.method21038(this.field5260), this.field5259);
                }
                else {
                    Class6874.method21036(this.field5260).method30448(class22, 0L);
                    Class6874.method21036(this.field5260).method30448(class22, Class6874.method21038(this.field5260));
                }
                for (long n4 = 0L; n4 < Class6874.method21038(this.field5260); ++n4) {
                    final long n5 = n4 * Class6874.method21037(this.field5260) + 2L * this.field5256;
                    final long n6 = n4;
                    this.field5258.method169(n5, class22.method135(n6));
                    this.field5258.method169(n5 + 1L, class22.method135(n6 + Class6874.method21038(this.field5260)));
                }
            }
        }
        else if (this.field5255 != -1) {
            for (long n7 = 4L * this.field5256; n7 < Class6874.method21037(this.field5260); n7 += 4L * this.field5257) {
                for (long n8 = 0L; n8 < Class6874.method21038(this.field5260); ++n8) {
                    final long n9 = n8 * Class6874.method21037(this.field5260) + n7;
                    final long n10 = Class6874.method21038(this.field5260) + n8;
                    class22.method169(n8, this.field5258.method135(n9));
                    class22.method169(n10, this.field5258.method135(n9 + 1L));
                    class22.method169(n10 + Class6874.method21038(this.field5260), this.field5258.method135(n9 + 2L));
                    class22.method169(n10 + 2L * Class6874.method21038(this.field5260), this.field5258.method135(n9 + 3L));
                }
                Class6874.method21036(this.field5260).method30452(class22, 0L, this.field5259);
                Class6874.method21036(this.field5260).method30452(class22, Class6874.method21038(this.field5260), this.field5259);
                Class6874.method21036(this.field5260).method30452(class22, 2L * Class6874.method21038(this.field5260), this.field5259);
                Class6874.method21036(this.field5260).method30452(class22, 3L * Class6874.method21038(this.field5260), this.field5259);
                for (long n11 = 0L; n11 < Class6874.method21038(this.field5260); ++n11) {
                    final long n12 = n11 * Class6874.method21037(this.field5260) + n7;
                    final long n13 = Class6874.method21038(this.field5260) + n11;
                    this.field5258.method169(n12, class22.method135(n11));
                    this.field5258.method169(n12 + 1L, class22.method135(n13));
                    this.field5258.method169(n12 + 2L, class22.method135(n13 + Class6874.method21038(this.field5260)));
                    this.field5258.method169(n12 + 3L, class22.method135(n13 + 2L * Class6874.method21038(this.field5260)));
                }
            }
        }
        else {
            for (long n14 = 4L * this.field5256; n14 < Class6874.method21037(this.field5260); n14 += 4L * this.field5257) {
                for (long n15 = 0L; n15 < Class6874.method21038(this.field5260); ++n15) {
                    final long n16 = n15 * Class6874.method21037(this.field5260) + n14;
                    final long n17 = Class6874.method21038(this.field5260) + n15;
                    class22.method169(n15, this.field5258.method135(n16));
                    class22.method169(n17, this.field5258.method135(n16 + 1L));
                    class22.method169(n17 + Class6874.method21038(this.field5260), this.field5258.method135(n16 + 2L));
                    class22.method169(n17 + 2L * Class6874.method21038(this.field5260), this.field5258.method135(n16 + 3L));
                }
                Class6874.method21036(this.field5260).method30448(class22, 0L);
                Class6874.method21036(this.field5260).method30448(class22, Class6874.method21038(this.field5260));
                Class6874.method21036(this.field5260).method30448(class22, 2L * Class6874.method21038(this.field5260));
                Class6874.method21036(this.field5260).method30448(class22, 3L * Class6874.method21038(this.field5260));
                for (long n18 = 0L; n18 < Class6874.method21038(this.field5260); ++n18) {
                    final long n19 = n18 * Class6874.method21037(this.field5260) + n14;
                    final long n20 = Class6874.method21038(this.field5260) + n18;
                    this.field5258.method169(n19, class22.method135(n18));
                    this.field5258.method169(n19 + 1L, class22.method135(n20));
                    this.field5258.method169(n19 + 2L, class22.method135(n20 + Class6874.method21038(this.field5260)));
                    this.field5258.method169(n19 + 3L, class22.method135(n20 + 2L * Class6874.method21038(this.field5260)));
                }
            }
        }
    }
}
