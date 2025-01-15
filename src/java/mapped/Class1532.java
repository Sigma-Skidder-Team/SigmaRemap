// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1532 implements Runnable
{
    private static String[] field8549;
    public final /* synthetic */ long field8550;
    public final /* synthetic */ long field8551;
    public final /* synthetic */ long field8552;
    public final /* synthetic */ long field8553;
    public final /* synthetic */ Class22 field8554;
    public final /* synthetic */ boolean field8555;
    public final /* synthetic */ Class6362 field8556;
    
    public Class1532(final Class6362 field8556, final long field8557, final long field8558, final long field8559, final long field8560, final Class22 field8561, final boolean field8562) {
        this.field8556 = field8556;
        this.field8550 = field8557;
        this.field8551 = field8558;
        this.field8552 = field8559;
        this.field8553 = field8560;
        this.field8554 = field8561;
        this.field8555 = field8562;
    }
    
    @Override
    public void run() {
        final Class22 class22 = new Class22(2L * Class6362.method19006(this.field8556), false);
        for (long field8550 = this.field8550; field8550 < this.field8551; ++field8550) {
            final long n = field8550 * this.field8552;
            for (long n2 = 0L; n2 < Class6362.method19008(this.field8556); ++n2) {
                final long n3 = 2L * n2;
                for (long n4 = 0L; n4 < Class6362.method19006(this.field8556); ++n4) {
                    final long n5 = n + n4 * this.field8553 + n3;
                    final long n6 = 2L * n4;
                    class22.method169(n6, this.field8554.method135(n5));
                    class22.method169(n6 + 1L, this.field8554.method135(n5 + 1L));
                }
                Class6362.method19002(this.field8556).method25930(class22, this.field8555);
                for (long n7 = 0L; n7 < Class6362.method19006(this.field8556); ++n7) {
                    final long n8 = n + n7 * this.field8553 + n3;
                    final long n9 = 2L * n7;
                    this.field8554.method169(n8, class22.method135(n9));
                    this.field8554.method169(n8 + 1L, class22.method135(n9 + 1L));
                }
            }
        }
    }
}
