// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1263 implements Runnable
{
    private static String[] field6884;
    public final /* synthetic */ long field6885;
    public final /* synthetic */ long field6886;
    public final /* synthetic */ long field6887;
    public final /* synthetic */ long field6888;
    public final /* synthetic */ long field6889;
    public final /* synthetic */ Class17 field6890;
    public final /* synthetic */ Class6733 field6891;
    
    public Class1263(final Class6733 field6891, final long field6892, final long field6893, final long field6894, final long field6895, final long field6896, final Class17 field6897) {
        this.field6891 = field6891;
        this.field6885 = field6892;
        this.field6886 = field6893;
        this.field6887 = field6894;
        this.field6888 = field6895;
        this.field6889 = field6896;
        this.field6890 = field6897;
    }
    
    @Override
    public void run() {
        for (long field6885 = this.field6885; field6885 < this.field6886; ++field6885) {
            final long n = (Class6733.method20485(this.field6891) - field6885) % Class6733.method20485(this.field6891) * this.field6887;
            final long n2 = field6885 * this.field6887;
            for (long n3 = 1L; n3 < this.field6888; ++n3) {
                final long n4 = n + (Class6733.method20482(this.field6891) - n3) * this.field6889;
                final long n5 = n2 + n3 * this.field6889;
                this.field6890.method171(n4, this.field6890.method137(n5));
                this.field6890.method171(n4 + 1L, -this.field6890.method137(n5 + 1L));
            }
        }
    }
}
