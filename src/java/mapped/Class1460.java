// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1460 implements Runnable
{
    private static String[] field8098;
    public final /* synthetic */ long field8099;
    public final /* synthetic */ long field8100;
    public final /* synthetic */ long field8101;
    public final /* synthetic */ Class22 field8102;
    public final /* synthetic */ Class8328 field8103;
    
    public Class1460(final Class8328 field8103, final long field8104, final long field8105, final long field8106, final Class22 field8107) {
        this.field8103 = field8103;
        this.field8099 = field8104;
        this.field8100 = field8105;
        this.field8101 = field8106;
        this.field8102 = field8107;
    }
    
    @Override
    public void run() {
        final Class22 class22 = new Class22(2L * Class8328.method27762(this.field8103), false);
        for (long field8099 = this.field8099; field8099 < this.field8100; ++field8099) {
            final long n = 2L * field8099;
            for (long n2 = 0L; n2 < Class8328.method27762(this.field8103); ++n2) {
                final long n3 = 2L * n2;
                final long n4 = n2 * this.field8101 + n;
                class22.method171(n3, this.field8102.method135(n4));
                class22.method171(n3 + 1L, this.field8102.method135(n4 + 1L));
            }
            Class8328.method27761(this.field8103).method25926(class22);
            for (long n5 = 0L; n5 < Class8328.method27762(this.field8103); ++n5) {
                final long n6 = 2L * n5;
                final long n7 = n5 * this.field8101 + n;
                this.field8102.method171(n7, class22.method135(n6));
                this.field8102.method171(n7 + 1L, class22.method135(n6 + 1L));
            }
        }
    }
}
