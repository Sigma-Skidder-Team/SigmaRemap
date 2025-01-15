// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1623 implements Runnable
{
    private static String[] field9062;
    public final /* synthetic */ long field9063;
    public final /* synthetic */ long field9064;
    public final /* synthetic */ Class17 field9065;
    public final /* synthetic */ boolean field9066;
    public final /* synthetic */ Class6733 field9067;
    
    public Class1623(final Class6733 field9067, final long field9068, final long field9069, final Class17 field9070, final boolean field9071) {
        this.field9067 = field9067;
        this.field9063 = field9068;
        this.field9064 = field9069;
        this.field9065 = field9070;
        this.field9066 = field9071;
    }
    
    @Override
    public void run() {
        final Class17 class17 = new Class17(2L * Class6733.method20482(this.field9067), false);
        for (long field9063 = this.field9063; field9063 < this.field9064; ++field9063) {
            final long n = field9063 * Class6733.method20481(this.field9067);
            for (long n2 = 0L; n2 < Class6733.method20484(this.field9067); ++n2) {
                final long n3 = 2L * n2;
                for (long n4 = 0L; n4 < Class6733.method20482(this.field9067); ++n4) {
                    final long n5 = n + n3 + n4 * Class6733.method20483(this.field9067);
                    final long n6 = 2L * n4;
                    class17.method171(n6, this.field9065.method137(n5));
                    class17.method171(n6 + 1L, this.field9065.method137(n5 + 1L));
                }
                Class6733.method20478(this.field9067).method26077(class17, this.field9066);
                for (long n7 = 0L; n7 < Class6733.method20482(this.field9067); ++n7) {
                    final long n8 = n + n3 + n7 * Class6733.method20483(this.field9067);
                    final long n9 = 2L * n7;
                    this.field9065.method171(n8, class17.method137(n9));
                    this.field9065.method171(n8 + 1L, class17.method137(n9 + 1L));
                }
            }
        }
    }
}
