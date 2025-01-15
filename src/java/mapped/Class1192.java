// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1192 implements Runnable
{
    private static String[] field6456;
    public final /* synthetic */ long field6457;
    public final /* synthetic */ long field6458;
    public final /* synthetic */ long field6459;
    public final /* synthetic */ long field6460;
    public final /* synthetic */ Class17 field6461;
    public final /* synthetic */ Class6733 field6462;
    
    public Class1192(final Class6733 field6462, final long field6463, final long field6464, final long field6465, final long field6466, final Class17 field6467) {
        this.field6462 = field6462;
        this.field6457 = field6463;
        this.field6458 = field6464;
        this.field6459 = field6465;
        this.field6460 = field6466;
        this.field6461 = field6467;
    }
    
    @Override
    public void run() {
        final Class17 class17 = new Class17(2L * Class6733.method20485(this.field6462), false);
        for (long field6457 = this.field6457; field6457 < this.field6458; ++field6457) {
            final long n = field6457 * this.field6459;
            for (long n2 = 0L; n2 < Class6733.method20484(this.field6462); ++n2) {
                final long n3 = 2L * n2;
                for (long n4 = 0L; n4 < Class6733.method20485(this.field6462); ++n4) {
                    final long n5 = 2L * n4;
                    final long n6 = n4 * this.field6460 + n + n3;
                    class17.method171(n5, this.field6461.method137(n6));
                    class17.method171(n5 + 1L, this.field6461.method137(n6 + 1L));
                }
                Class6733.method20480(this.field6462).method26073(class17);
                for (long n7 = 0L; n7 < Class6733.method20485(this.field6462); ++n7) {
                    final long n8 = 2L * n7;
                    final long n9 = n7 * this.field6460 + n + n3;
                    this.field6461.method171(n9, class17.method137(n8));
                    this.field6461.method171(n9 + 1L, class17.method137(n8 + 1L));
                }
            }
        }
    }
}
