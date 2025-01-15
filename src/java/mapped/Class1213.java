// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1213 implements Runnable
{
    private static String[] field6584;
    public final /* synthetic */ long field6585;
    public final /* synthetic */ long field6586;
    public final /* synthetic */ Class22 field6587;
    public final /* synthetic */ Class6362 field6588;
    
    public Class1213(final Class6362 field6588, final long field6589, final long field6590, final Class22 field6591) {
        this.field6588 = field6588;
        this.field6585 = field6589;
        this.field6586 = field6590;
        this.field6587 = field6591;
    }
    
    @Override
    public void run() {
        final Class22 class22 = new Class22(2L * Class6362.method19006(this.field6588), false);
        for (long field6585 = this.field6585; field6585 < this.field6586; ++field6585) {
            final long n = field6585 * Class6362.method19005(this.field6588);
            for (long n2 = 0L; n2 < Class6362.method19008(this.field6588); ++n2) {
                final long n3 = 2L * n2;
                for (long n4 = 0L; n4 < Class6362.method19006(this.field6588); ++n4) {
                    final long n5 = n + n3 + n4 * Class6362.method19007(this.field6588);
                    final long n6 = 2L * n4;
                    class22.method169(n6, this.field6587.method135(n5));
                    class22.method169(n6 + 1L, this.field6587.method135(n5 + 1L));
                }
                Class6362.method19002(this.field6588).method25926(class22);
                for (long n7 = 0L; n7 < Class6362.method19006(this.field6588); ++n7) {
                    final long n8 = n + n3 + n7 * Class6362.method19007(this.field6588);
                    final long n9 = 2L * n7;
                    this.field6587.method169(n8, class22.method135(n9));
                    this.field6587.method169(n8 + 1L, class22.method135(n9 + 1L));
                }
            }
        }
    }
}
