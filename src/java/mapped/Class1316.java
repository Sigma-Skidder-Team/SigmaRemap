// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1316 implements Runnable
{
    private static String[] field7217;
    public final /* synthetic */ long field7218;
    public final /* synthetic */ long field7219;
    public final /* synthetic */ long field7220;
    public final /* synthetic */ long field7221;
    public final /* synthetic */ Class17 field7222;
    public final /* synthetic */ boolean field7223;
    public final /* synthetic */ Class6733 field7224;
    
    public Class1316(final Class6733 field7224, final long field7225, final long field7226, final long field7227, final long field7228, final Class17 field7229, final boolean field7230) {
        this.field7224 = field7224;
        this.field7218 = field7225;
        this.field7219 = field7226;
        this.field7220 = field7227;
        this.field7221 = field7228;
        this.field7222 = field7229;
        this.field7223 = field7230;
    }
    
    @Override
    public void run() {
        final Class17 class17 = new Class17(2L * Class6733.method20482(this.field7224), false);
        for (long field7218 = this.field7218; field7218 < this.field7219; ++field7218) {
            final long n = field7218 * this.field7220;
            for (long n2 = 0L; n2 < Class6733.method20484(this.field7224); ++n2) {
                final long n3 = 2L * n2;
                for (long n4 = 0L; n4 < Class6733.method20482(this.field7224); ++n4) {
                    final long n5 = n + n4 * this.field7221 + n3;
                    final long n6 = 2L * n4;
                    class17.method171(n6, this.field7222.method137(n5));
                    class17.method171(n6 + 1L, this.field7222.method137(n5 + 1L));
                }
                Class6733.method20478(this.field7224).method26077(class17, this.field7223);
                for (long n7 = 0L; n7 < Class6733.method20482(this.field7224); ++n7) {
                    final long n8 = n + n7 * this.field7221 + n3;
                    final long n9 = 2L * n7;
                    this.field7222.method171(n8, class17.method137(n9));
                    this.field7222.method171(n8 + 1L, class17.method137(n9 + 1L));
                }
            }
        }
    }
}
