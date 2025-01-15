// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1492 implements Runnable
{
    private static String[] field8294;
    public final /* synthetic */ long field8295;
    public final /* synthetic */ long field8296;
    public final /* synthetic */ Class17 field8297;
    public final /* synthetic */ Class6733 field8298;
    
    public Class1492(final Class6733 field8298, final long field8299, final long field8300, final Class17 field8301) {
        this.field8298 = field8298;
        this.field8295 = field8299;
        this.field8296 = field8300;
        this.field8297 = field8301;
    }
    
    @Override
    public void run() {
        final Class17 class17 = new Class17(2L * Class6733.method20482(this.field8298), false);
        for (long field8295 = this.field8295; field8295 < this.field8296; ++field8295) {
            final long n = field8295 * Class6733.method20481(this.field8298);
            for (long n2 = 0L; n2 < Class6733.method20484(this.field8298); ++n2) {
                final long n3 = 2L * n2;
                for (long n4 = 0L; n4 < Class6733.method20482(this.field8298); ++n4) {
                    final long n5 = n + n3 + n4 * Class6733.method20483(this.field8298);
                    final long n6 = 2L * n4;
                    class17.method171(n6, this.field8297.method137(n5));
                    class17.method171(n6 + 1L, this.field8297.method137(n5 + 1L));
                }
                Class6733.method20478(this.field8298).method26073(class17);
                for (long n7 = 0L; n7 < Class6733.method20482(this.field8298); ++n7) {
                    final long n8 = n + n3 + n7 * Class6733.method20483(this.field8298);
                    final long n9 = 2L * n7;
                    this.field8297.method171(n8, class17.method137(n9));
                    this.field8297.method171(n8 + 1L, class17.method137(n9 + 1L));
                }
            }
        }
    }
}
