// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1226 implements Runnable
{
    private static String[] field6665;
    public final /* synthetic */ long field6666;
    public final /* synthetic */ long field6667;
    public final /* synthetic */ long field6668;
    public final /* synthetic */ long field6669;
    public final /* synthetic */ long field6670;
    public final /* synthetic */ long field6671;
    public final /* synthetic */ Class17 field6672;
    public final /* synthetic */ Class6733 field6673;
    
    public Class1226(final Class6733 field6673, final long field6674, final long field6675, final long field6676, final long field6677, final long field6678, final long field6679, final Class17 field6680) {
        this.field6673 = field6673;
        this.field6666 = field6674;
        this.field6667 = field6675;
        this.field6668 = field6676;
        this.field6669 = field6677;
        this.field6670 = field6678;
        this.field6671 = field6679;
        this.field6672 = field6680;
    }
    
    @Override
    public void run() {
        for (long field6666 = this.field6666; field6666 < this.field6667; ++field6666) {
            final long n = (Class6733.method20485(this.field6673) - field6666) % Class6733.method20485(this.field6673) * this.field6668;
            final long n2 = field6666 * this.field6668;
            for (long n3 = 1L; n3 < this.field6669; ++n3) {
                final long n4 = (Class6733.method20482(this.field6673) - n3) * this.field6670;
                final long n5 = n3 * this.field6670;
                final long n6 = n + n4;
                for (long n7 = 0L; n7 < Class6733.method20484(this.field6673); ++n7) {
                    final long n8 = 2L * n7;
                    final long n9 = this.field6671 - n8;
                    final long n10 = n2 + n5 + n8;
                    this.field6672.method171(n6 + n9 % this.field6671, this.field6672.method137(n10));
                    this.field6672.method171(n6 + (n9 + 1L) % this.field6671, -this.field6672.method137(n10 + 1L));
                }
            }
        }
    }
}
