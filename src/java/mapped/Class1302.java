// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1302 implements Runnable
{
    private static String[] field7124;
    public final /* synthetic */ long field7125;
    public final /* synthetic */ long field7126;
    public final /* synthetic */ long field7127;
    public final /* synthetic */ long field7128;
    public final /* synthetic */ long field7129;
    public final /* synthetic */ long field7130;
    public final /* synthetic */ Class22 field7131;
    public final /* synthetic */ Class6362 field7132;
    
    public Class1302(final Class6362 field7132, final long field7133, final long field7134, final long field7135, final long field7136, final long field7137, final long field7138, final Class22 field7139) {
        this.field7132 = field7132;
        this.field7125 = field7133;
        this.field7126 = field7134;
        this.field7127 = field7135;
        this.field7128 = field7136;
        this.field7129 = field7137;
        this.field7130 = field7138;
        this.field7131 = field7139;
    }
    
    @Override
    public void run() {
        for (long field7125 = this.field7125; field7125 < this.field7126; ++field7125) {
            final long n = (Class6362.method19009(this.field7132) - field7125) % Class6362.method19009(this.field7132) * this.field7127;
            final long n2 = field7125 * this.field7127;
            for (long n3 = 1L; n3 < this.field7128; ++n3) {
                final long n4 = (Class6362.method19006(this.field7132) - n3) * this.field7129;
                final long n5 = n3 * this.field7129;
                final long n6 = n + n4;
                for (long n7 = 0L; n7 < Class6362.method19008(this.field7132); ++n7) {
                    final long n8 = 2L * n7;
                    final long n9 = this.field7130 - n8;
                    final long n10 = n2 + n5 + n8;
                    this.field7131.method169(n6 + n9 % this.field7130, this.field7131.method135(n10));
                    this.field7131.method169(n6 + (n9 + 1L) % this.field7130, -this.field7131.method135(n10 + 1L));
                }
            }
        }
    }
}
