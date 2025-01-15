// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1617 implements Runnable
{
    private static String[] field9032;
    public final /* synthetic */ long field9033;
    public final /* synthetic */ long field9034;
    public final /* synthetic */ Class22 field9035;
    public final /* synthetic */ boolean field9036;
    public final /* synthetic */ Class6362 field9037;
    
    public Class1617(final Class6362 field9037, final long field9038, final long field9039, final Class22 field9040, final boolean field9041) {
        this.field9037 = field9037;
        this.field9033 = field9038;
        this.field9034 = field9039;
        this.field9035 = field9040;
        this.field9036 = field9041;
    }
    
    @Override
    public void run() {
        final Class22 class22 = new Class22(2L * Class6362.method19006(this.field9037), false);
        for (long field9033 = this.field9033; field9033 < this.field9034; ++field9033) {
            final long n = field9033 * Class6362.method19005(this.field9037);
            for (long n2 = 0L; n2 < Class6362.method19008(this.field9037); ++n2) {
                final long n3 = 2L * n2;
                for (long n4 = 0L; n4 < Class6362.method19006(this.field9037); ++n4) {
                    final long n5 = n + n3 + n4 * Class6362.method19007(this.field9037);
                    final long n6 = 2L * n4;
                    class22.method169(n6, this.field9035.method135(n5));
                    class22.method169(n6 + 1L, this.field9035.method135(n5 + 1L));
                }
                Class6362.method19002(this.field9037).method25930(class22, this.field9036);
                for (long n7 = 0L; n7 < Class6362.method19006(this.field9037); ++n7) {
                    final long n8 = n + n3 + n7 * Class6362.method19007(this.field9037);
                    final long n9 = 2L * n7;
                    this.field9035.method169(n8, class22.method135(n9));
                    this.field9035.method169(n8 + 1L, class22.method135(n9 + 1L));
                }
            }
        }
    }
}
