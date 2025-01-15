// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1058 implements Runnable
{
    private static String[] field5685;
    public final /* synthetic */ long field5686;
    public final /* synthetic */ int field5687;
    public final /* synthetic */ long field5688;
    public final /* synthetic */ int field5689;
    public final /* synthetic */ Class22 field5690;
    public final /* synthetic */ boolean field5691;
    public final /* synthetic */ Class6710 field5692;
    
    public Class1058(final Class6710 field5692, final long field5693, final int field5694, final long field5695, final int field5696, final Class22 field5697, final boolean field5698) {
        this.field5692 = field5692;
        this.field5686 = field5693;
        this.field5687 = field5694;
        this.field5688 = field5695;
        this.field5689 = field5696;
        this.field5690 = field5697;
        this.field5691 = field5698;
    }
    
    @Override
    public void run() {
        final Class22 class22 = new Class22(this.field5686);
        if (Class6710.method20384(this.field5692) <= 2L) {
            if (Class6710.method20384(this.field5692) == 2L) {
                for (long n = 0L; n < Class6710.method20385(this.field5692); ++n) {
                    final long n2 = n * Class6710.method20384(this.field5692) + 2L * this.field5688;
                    final long n3 = n;
                    class22.method169(n3, this.field5690.method135(n2));
                    class22.method169(n3 + Class6710.method20385(this.field5692), this.field5690.method135(n2 + 1L));
                }
                if (this.field5687 != -1) {
                    Class6710.method20383(this.field5692).method34188(class22, 0L, this.field5691);
                    Class6710.method20383(this.field5692).method34188(class22, Class6710.method20385(this.field5692), this.field5691);
                }
                else {
                    Class6710.method20383(this.field5692).method34184(class22, 0L, this.field5691);
                    Class6710.method20383(this.field5692).method34184(class22, Class6710.method20385(this.field5692), this.field5691);
                }
                for (long n4 = 0L; n4 < Class6710.method20385(this.field5692); ++n4) {
                    final long n5 = n4 * Class6710.method20384(this.field5692) + 2L * this.field5688;
                    final long n6 = n4;
                    this.field5690.method169(n5, class22.method135(n6));
                    this.field5690.method169(n5 + 1L, class22.method135(n6 + Class6710.method20385(this.field5692)));
                }
            }
        }
        else if (this.field5687 != -1) {
            for (long n7 = 4L * this.field5688; n7 < Class6710.method20384(this.field5692); n7 += 4 * this.field5689) {
                for (long n8 = 0L; n8 < Class6710.method20385(this.field5692); ++n8) {
                    final long n9 = n8 * Class6710.method20384(this.field5692) + n7;
                    final long n10 = Class6710.method20385(this.field5692) + n8;
                    class22.method169(n8, this.field5690.method135(n9));
                    class22.method169(n10, this.field5690.method135(n9 + 1L));
                    class22.method169(n10 + Class6710.method20385(this.field5692), this.field5690.method135(n9 + 2L));
                    class22.method169(n10 + 2L * Class6710.method20385(this.field5692), this.field5690.method135(n9 + 3L));
                }
                Class6710.method20383(this.field5692).method34188(class22, 0L, this.field5691);
                Class6710.method20383(this.field5692).method34188(class22, Class6710.method20385(this.field5692), this.field5691);
                Class6710.method20383(this.field5692).method34188(class22, 2L * Class6710.method20385(this.field5692), this.field5691);
                Class6710.method20383(this.field5692).method34188(class22, 3L * Class6710.method20385(this.field5692), this.field5691);
                for (long n11 = 0L; n11 < Class6710.method20385(this.field5692); ++n11) {
                    final long n12 = n11 * Class6710.method20384(this.field5692) + n7;
                    final long n13 = Class6710.method20385(this.field5692) + n11;
                    this.field5690.method169(n12, class22.method135(n11));
                    this.field5690.method169(n12 + 1L, class22.method135(n13));
                    this.field5690.method169(n12 + 2L, class22.method135(n13 + Class6710.method20385(this.field5692)));
                    this.field5690.method169(n12 + 3L, class22.method135(n13 + 2L * Class6710.method20385(this.field5692)));
                }
            }
        }
        else {
            for (long n14 = 4L * this.field5688; n14 < Class6710.method20384(this.field5692); n14 += 4 * this.field5689) {
                for (long n15 = 0L; n15 < Class6710.method20385(this.field5692); ++n15) {
                    final long n16 = n15 * Class6710.method20384(this.field5692) + n14;
                    final long n17 = Class6710.method20385(this.field5692) + n15;
                    class22.method169(n15, this.field5690.method135(n16));
                    class22.method169(n17, this.field5690.method135(n16 + 1L));
                    class22.method169(n17 + Class6710.method20385(this.field5692), this.field5690.method135(n16 + 2L));
                    class22.method169(n17 + 2L * Class6710.method20385(this.field5692), this.field5690.method135(n16 + 3L));
                }
                Class6710.method20383(this.field5692).method34184(class22, 0L, this.field5691);
                Class6710.method20383(this.field5692).method34184(class22, Class6710.method20385(this.field5692), this.field5691);
                Class6710.method20383(this.field5692).method34184(class22, 2L * Class6710.method20385(this.field5692), this.field5691);
                Class6710.method20383(this.field5692).method34184(class22, 3L * Class6710.method20385(this.field5692), this.field5691);
                for (long n18 = 0L; n18 < Class6710.method20385(this.field5692); ++n18) {
                    final long n19 = n18 * Class6710.method20384(this.field5692) + n14;
                    final long n20 = Class6710.method20385(this.field5692) + n18;
                    this.field5690.method169(n19, class22.method135(n18));
                    this.field5690.method169(n19 + 1L, class22.method135(n20));
                    this.field5690.method169(n19 + 2L, class22.method135(n20 + Class6710.method20385(this.field5692)));
                    this.field5690.method169(n19 + 3L, class22.method135(n20 + 2L * Class6710.method20385(this.field5692)));
                }
            }
        }
    }
}
