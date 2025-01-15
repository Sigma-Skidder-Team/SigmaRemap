// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1221 implements Runnable
{
    private static String[] field6631;
    public final /* synthetic */ long field6632;
    public final /* synthetic */ int field6633;
    public final /* synthetic */ long field6634;
    public final /* synthetic */ long field6635;
    public final /* synthetic */ Class22 field6636;
    public final /* synthetic */ boolean field6637;
    public final /* synthetic */ Class7706 field6638;
    
    public Class1221(final Class7706 field6638, final long field6639, final int field6640, final long field6641, final long field6642, final Class22 field6643, final boolean field6644) {
        this.field6638 = field6638;
        this.field6632 = field6639;
        this.field6633 = field6640;
        this.field6634 = field6641;
        this.field6635 = field6642;
        this.field6636 = field6643;
        this.field6637 = field6644;
    }
    
    @Override
    public void run() {
        final Class22 class22 = new Class22(this.field6632);
        if (Class7706.method24580(this.field6638) <= 2L) {
            if (Class7706.method24580(this.field6638) == 2L) {
                for (long n = 0L; n < Class7706.method24581(this.field6638); ++n) {
                    final long n2 = n * Class7706.method24580(this.field6638) + 2L * this.field6634;
                    final long n3 = n;
                    class22.method169(n3, this.field6636.method135(n2));
                    class22.method169(n3 + Class7706.method24581(this.field6638), this.field6636.method135(n2 + 1L));
                }
                if (this.field6633 != -1) {
                    Class7706.method24579(this.field6638).method29696(class22, 0L, this.field6637);
                    Class7706.method24579(this.field6638).method29696(class22, Class7706.method24581(this.field6638), this.field6637);
                }
                else {
                    Class7706.method24579(this.field6638).method29692(class22, 0L, this.field6637);
                    Class7706.method24579(this.field6638).method29692(class22, Class7706.method24581(this.field6638), this.field6637);
                }
                for (long n4 = 0L; n4 < Class7706.method24581(this.field6638); ++n4) {
                    final long n5 = n4 * Class7706.method24580(this.field6638) + 2L * this.field6634;
                    final long n6 = n4;
                    this.field6636.method169(n5, class22.method135(n6));
                    this.field6636.method169(n5 + 1L, class22.method135(n6 + Class7706.method24581(this.field6638)));
                }
            }
        }
        else if (this.field6633 != -1) {
            for (long n7 = 4L * this.field6634; n7 < Class7706.method24580(this.field6638); n7 += 4L * this.field6635) {
                for (long n8 = 0L; n8 < Class7706.method24581(this.field6638); ++n8) {
                    final long n9 = n8 * Class7706.method24580(this.field6638) + n7;
                    final long n10 = Class7706.method24581(this.field6638) + n8;
                    class22.method169(n8, this.field6636.method135(n9));
                    class22.method169(n10, this.field6636.method135(n9 + 1L));
                    class22.method169(n10 + Class7706.method24581(this.field6638), this.field6636.method135(n9 + 2L));
                    class22.method169(n10 + 2L * Class7706.method24581(this.field6638), this.field6636.method135(n9 + 3L));
                }
                Class7706.method24579(this.field6638).method29694(class22, this.field6637);
                Class7706.method24579(this.field6638).method29696(class22, Class7706.method24581(this.field6638), this.field6637);
                Class7706.method24579(this.field6638).method29696(class22, 2L * Class7706.method24581(this.field6638), this.field6637);
                Class7706.method24579(this.field6638).method29696(class22, 3L * Class7706.method24581(this.field6638), this.field6637);
                for (long n11 = 0L; n11 < Class7706.method24581(this.field6638); ++n11) {
                    final long n12 = n11 * Class7706.method24580(this.field6638) + n7;
                    final long n13 = Class7706.method24581(this.field6638) + n11;
                    this.field6636.method169(n12, class22.method135(n11));
                    this.field6636.method169(n12 + 1L, class22.method135(n13));
                    this.field6636.method169(n12 + 2L, class22.method135(n13 + Class7706.method24581(this.field6638)));
                    this.field6636.method169(n12 + 3L, class22.method135(n13 + 2L * Class7706.method24581(this.field6638)));
                }
            }
        }
        else {
            for (long n14 = 4L * this.field6634; n14 < Class7706.method24580(this.field6638); n14 += 4L * this.field6635) {
                for (long n15 = 0L; n15 < Class7706.method24581(this.field6638); ++n15) {
                    final long n16 = n15 * Class7706.method24580(this.field6638) + n14;
                    final long n17 = Class7706.method24581(this.field6638) + n15;
                    class22.method169(n15, this.field6636.method135(n16));
                    class22.method169(n17, this.field6636.method135(n16 + 1L));
                    class22.method169(n17 + Class7706.method24581(this.field6638), this.field6636.method135(n16 + 2L));
                    class22.method169(n17 + 2L * Class7706.method24581(this.field6638), this.field6636.method135(n16 + 3L));
                }
                Class7706.method24579(this.field6638).method29692(class22, 0L, this.field6637);
                Class7706.method24579(this.field6638).method29692(class22, Class7706.method24581(this.field6638), this.field6637);
                Class7706.method24579(this.field6638).method29692(class22, 2L * Class7706.method24581(this.field6638), this.field6637);
                Class7706.method24579(this.field6638).method29692(class22, 3L * Class7706.method24581(this.field6638), this.field6637);
                for (long n18 = 0L; n18 < Class7706.method24581(this.field6638); ++n18) {
                    final long n19 = n18 * Class7706.method24580(this.field6638) + n14;
                    final long n20 = Class7706.method24581(this.field6638) + n18;
                    this.field6636.method169(n19, class22.method135(n18));
                    this.field6636.method169(n19 + 1L, class22.method135(n20));
                    this.field6636.method169(n19 + 2L, class22.method135(n20 + Class7706.method24581(this.field6638)));
                    this.field6636.method169(n19 + 3L, class22.method135(n20 + 2L * Class7706.method24581(this.field6638)));
                }
            }
        }
    }
}
