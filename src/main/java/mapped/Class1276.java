// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1276 implements Runnable
{
    private static String[] field6970;
    public final /* synthetic */ long field6971;
    public final /* synthetic */ long field6972;
    public final /* synthetic */ long field6973;
    public final /* synthetic */ long field6974;
    public final /* synthetic */ Class22 field6975;
    public final /* synthetic */ Class6362 field6976;
    
    public Class1276(final Class6362 field6976, final long field6977, final long field6978, final long field6979, final long field6980, final Class22 field6981) {
        this.field6976 = field6976;
        this.field6971 = field6977;
        this.field6972 = field6978;
        this.field6973 = field6979;
        this.field6974 = field6980;
        this.field6975 = field6981;
    }
    
    @Override
    public void run() {
        final Class22 class22 = new Class22(2L * Class6362.method19006(this.field6976), false);
        for (long field6971 = this.field6971; field6971 < this.field6972; ++field6971) {
            final long n = field6971 * this.field6973;
            for (long n2 = 0L; n2 < Class6362.method19008(this.field6976); ++n2) {
                final long n3 = 2L * n2;
                for (long n4 = 0L; n4 < Class6362.method19006(this.field6976); ++n4) {
                    final long n5 = n + n4 * this.field6974 + n3;
                    final long n6 = 2L * n4;
                    class22.method169(n6, this.field6975.method135(n5));
                    class22.method169(n6 + 1L, this.field6975.method135(n5 + 1L));
                }
                Class6362.method19002(this.field6976).method25926(class22);
                for (long n7 = 0L; n7 < Class6362.method19006(this.field6976); ++n7) {
                    final long n8 = n + n7 * this.field6974 + n3;
                    final long n9 = 2L * n7;
                    this.field6975.method169(n8, class22.method135(n9));
                    this.field6975.method169(n8 + 1L, class22.method135(n9 + 1L));
                }
            }
        }
    }
}
