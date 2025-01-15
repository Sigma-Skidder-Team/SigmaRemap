// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1292 implements Runnable
{
    private static String[] field7057;
    public final /* synthetic */ long field7058;
    public final /* synthetic */ long field7059;
    public final /* synthetic */ Class22 field7060;
    public final /* synthetic */ boolean field7061;
    public final /* synthetic */ Class6362 field7062;
    
    public Class1292(final Class6362 field7062, final long field7063, final long field7064, final Class22 field7065, final boolean field7066) {
        this.field7062 = field7062;
        this.field7058 = field7063;
        this.field7059 = field7064;
        this.field7060 = field7065;
        this.field7061 = field7066;
    }
    
    @Override
    public void run() {
        final Class22 class22 = new Class22(2L * Class6362.method19009(this.field7062), false);
        for (long field7058 = this.field7058; field7058 < this.field7059; ++field7058) {
            final long n = field7058 * Class6362.method19007(this.field7062);
            for (long n2 = 0L; n2 < Class6362.method19008(this.field7062); ++n2) {
                final long n3 = 2L * n2;
                for (long n4 = 0L; n4 < Class6362.method19009(this.field7062); ++n4) {
                    final long n5 = n4 * Class6362.method19005(this.field7062) + n + n3;
                    final long n6 = 2L * n4;
                    class22.method169(n6, this.field7060.method135(n5));
                    class22.method169(n6 + 1L, this.field7060.method135(n5 + 1L));
                }
                Class6362.method19004(this.field7062).method25930(class22, this.field7061);
                for (long n7 = 0L; n7 < Class6362.method19009(this.field7062); ++n7) {
                    final long n8 = n7 * Class6362.method19005(this.field7062) + n + n3;
                    final long n9 = 2L * n7;
                    this.field7060.method169(n8, class22.method135(n9));
                    this.field7060.method169(n8 + 1L, class22.method135(n9 + 1L));
                }
            }
        }
    }
}
