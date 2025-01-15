// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1079 implements Runnable
{
    private static String[] field5811;
    public final /* synthetic */ long field5812;
    public final /* synthetic */ long field5813;
    public final /* synthetic */ long field5814;
    public final /* synthetic */ long field5815;
    public final /* synthetic */ Class17 field5816;
    public final /* synthetic */ boolean field5817;
    public final /* synthetic */ Class6733 field5818;
    
    public Class1079(final Class6733 field5818, final long field5819, final long field5820, final long field5821, final long field5822, final Class17 field5823, final boolean field5824) {
        this.field5818 = field5818;
        this.field5812 = field5819;
        this.field5813 = field5820;
        this.field5814 = field5821;
        this.field5815 = field5822;
        this.field5816 = field5823;
        this.field5817 = field5824;
    }
    
    @Override
    public void run() {
        final Class17 class17 = new Class17(2L * Class6733.method20485(this.field5818), false);
        for (long field5812 = this.field5812; field5812 < this.field5813; ++field5812) {
            final long n = field5812 * this.field5814;
            for (long n2 = 0L; n2 < Class6733.method20484(this.field5818); ++n2) {
                final long n3 = 2L * n2;
                for (long n4 = 0L; n4 < Class6733.method20485(this.field5818); ++n4) {
                    final long n5 = 2L * n4;
                    final long n6 = n4 * this.field5815 + n + n3;
                    class17.method171(n5, this.field5816.method137(n6));
                    class17.method171(n5 + 1L, this.field5816.method137(n6 + 1L));
                }
                Class6733.method20480(this.field5818).method26077(class17, this.field5817);
                for (long n7 = 0L; n7 < Class6733.method20485(this.field5818); ++n7) {
                    final long n8 = 2L * n7;
                    final long n9 = n7 * this.field5815 + n + n3;
                    this.field5816.method171(n9, class17.method137(n8));
                    this.field5816.method171(n9 + 1L, class17.method137(n8 + 1L));
                }
            }
        }
    }
}
