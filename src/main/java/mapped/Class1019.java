// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1019 implements Runnable
{
    private static String[] field5452;
    public final /* synthetic */ long field5453;
    public final /* synthetic */ long field5454;
    public final /* synthetic */ Class22 field5455;
    public final /* synthetic */ Class6362 field5456;
    
    public Class1019(final Class6362 field5456, final long field5457, final long field5458, final Class22 field5459) {
        this.field5456 = field5456;
        this.field5453 = field5457;
        this.field5454 = field5458;
        this.field5455 = field5459;
    }
    
    @Override
    public void run() {
        final Class22 class22 = new Class22(2L * Class6362.method19009(this.field5456), false);
        for (long field5453 = this.field5453; field5453 < this.field5454; ++field5453) {
            final long n = field5453 * Class6362.method19007(this.field5456);
            for (long n2 = 0L; n2 < Class6362.method19008(this.field5456); ++n2) {
                final long n3 = 2L * n2;
                for (long n4 = 0L; n4 < Class6362.method19009(this.field5456); ++n4) {
                    final long n5 = n4 * Class6362.method19005(this.field5456) + n + n3;
                    final long n6 = 2L * n4;
                    class22.method169(n6, this.field5455.method135(n5));
                    class22.method169(n6 + 1L, this.field5455.method135(n5 + 1L));
                }
                Class6362.method19004(this.field5456).method25926(class22);
                for (long n7 = 0L; n7 < Class6362.method19009(this.field5456); ++n7) {
                    final long n8 = n7 * Class6362.method19005(this.field5456) + n + n3;
                    final long n9 = 2L * n7;
                    this.field5455.method169(n8, class22.method135(n9));
                    this.field5455.method169(n8 + 1L, class22.method135(n9 + 1L));
                }
            }
        }
    }
}
