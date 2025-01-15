// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1517 implements Runnable
{
    private static String[] field8452;
    public final /* synthetic */ long field8453;
    public final /* synthetic */ long field8454;
    public final /* synthetic */ long field8455;
    public final /* synthetic */ long field8456;
    public final /* synthetic */ Class17 field8457;
    public final /* synthetic */ Class6733 field8458;
    
    public Class1517(final Class6733 field8458, final long field8459, final long field8460, final long field8461, final long field8462, final Class17 field8463) {
        this.field8458 = field8458;
        this.field8453 = field8459;
        this.field8454 = field8460;
        this.field8455 = field8461;
        this.field8456 = field8462;
        this.field8457 = field8463;
    }
    
    @Override
    public void run() {
        final Class17 class17 = new Class17(2L * Class6733.method20482(this.field8458), false);
        for (long field8453 = this.field8453; field8453 < this.field8454; ++field8453) {
            final long n = field8453 * this.field8455;
            for (long n2 = 0L; n2 < Class6733.method20484(this.field8458); ++n2) {
                final long n3 = 2L * n2;
                for (long n4 = 0L; n4 < Class6733.method20482(this.field8458); ++n4) {
                    final long n5 = n + n4 * this.field8456 + n3;
                    final long n6 = 2L * n4;
                    class17.method171(n6, this.field8457.method137(n5));
                    class17.method171(n6 + 1L, this.field8457.method137(n5 + 1L));
                }
                Class6733.method20478(this.field8458).method26073(class17);
                for (long n7 = 0L; n7 < Class6733.method20482(this.field8458); ++n7) {
                    final long n8 = n + n7 * this.field8456 + n3;
                    final long n9 = 2L * n7;
                    this.field8457.method171(n8, class17.method137(n9));
                    this.field8457.method171(n8 + 1L, class17.method137(n9 + 1L));
                }
            }
        }
    }
}
