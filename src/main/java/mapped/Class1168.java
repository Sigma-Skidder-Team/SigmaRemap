// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1168 implements Runnable
{
    private static String[] field6332;
    public final /* synthetic */ long field6333;
    public final /* synthetic */ long field6334;
    public final /* synthetic */ Class17 field6335;
    public final /* synthetic */ Class6733 field6336;
    
    public Class1168(final Class6733 field6336, final long field6337, final long field6338, final Class17 field6339) {
        this.field6336 = field6336;
        this.field6333 = field6337;
        this.field6334 = field6338;
        this.field6335 = field6339;
    }
    
    @Override
    public void run() {
        final Class17 class17 = new Class17(2L * Class6733.method20485(this.field6336), false);
        for (long field6333 = this.field6333; field6333 < this.field6334; ++field6333) {
            final long n = field6333 * Class6733.method20483(this.field6336);
            for (long n2 = 0L; n2 < Class6733.method20484(this.field6336); ++n2) {
                final long n3 = 2L * n2;
                for (long n4 = 0L; n4 < Class6733.method20485(this.field6336); ++n4) {
                    final long n5 = n4 * Class6733.method20481(this.field6336) + n + n3;
                    final long n6 = 2L * n4;
                    class17.method171(n6, this.field6335.method137(n5));
                    class17.method171(n6 + 1L, this.field6335.method137(n5 + 1L));
                }
                Class6733.method20480(this.field6336).method26073(class17);
                for (long n7 = 0L; n7 < Class6733.method20485(this.field6336); ++n7) {
                    final long n8 = n7 * Class6733.method20481(this.field6336) + n + n3;
                    final long n9 = 2L * n7;
                    this.field6335.method171(n8, class17.method137(n9));
                    this.field6335.method171(n8 + 1L, class17.method137(n9 + 1L));
                }
            }
        }
    }
}
