// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1078 implements Runnable
{
    private static String[] field5805;
    public final /* synthetic */ long field5806;
    public final /* synthetic */ long field5807;
    public final /* synthetic */ Class17 field5808;
    public final /* synthetic */ boolean field5809;
    public final /* synthetic */ Class6733 field5810;
    
    public Class1078(final Class6733 field5810, final long field5811, final long field5812, final Class17 field5813, final boolean field5814) {
        this.field5810 = field5810;
        this.field5806 = field5811;
        this.field5807 = field5812;
        this.field5808 = field5813;
        this.field5809 = field5814;
    }
    
    @Override
    public void run() {
        final Class17 class17 = new Class17(2L * Class6733.method20485(this.field5810), false);
        for (long field5806 = this.field5806; field5806 < this.field5807; ++field5806) {
            final long n = field5806 * Class6733.method20483(this.field5810);
            for (long n2 = 0L; n2 < Class6733.method20484(this.field5810); ++n2) {
                final long n3 = 2L * n2;
                for (long n4 = 0L; n4 < Class6733.method20485(this.field5810); ++n4) {
                    final long n5 = n4 * Class6733.method20481(this.field5810) + n + n3;
                    final long n6 = 2L * n4;
                    class17.method171(n6, this.field5808.method137(n5));
                    class17.method171(n6 + 1L, this.field5808.method137(n5 + 1L));
                }
                Class6733.method20480(this.field5810).method26077(class17, this.field5809);
                for (long n7 = 0L; n7 < Class6733.method20485(this.field5810); ++n7) {
                    final long n8 = n7 * Class6733.method20481(this.field5810) + n + n3;
                    final long n9 = 2L * n7;
                    this.field5808.method171(n8, class17.method137(n9));
                    this.field5808.method171(n8 + 1L, class17.method137(n9 + 1L));
                }
            }
        }
    }
}
