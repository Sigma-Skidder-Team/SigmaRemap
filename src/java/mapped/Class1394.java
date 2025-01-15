// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1394 implements Runnable
{
    private static String[] field7683;
    public final /* synthetic */ long field7684;
    public final /* synthetic */ long field7685;
    public final /* synthetic */ long field7686;
    public final /* synthetic */ long field7687;
    public final /* synthetic */ long field7688;
    public final /* synthetic */ long field7689;
    public final /* synthetic */ Class22 field7690;
    public final /* synthetic */ Class6362 field7691;
    
    public Class1394(final Class6362 field7691, final long field7692, final long field7693, final long field7694, final long field7695, final long field7696, final long field7697, final Class22 field7698) {
        this.field7691 = field7691;
        this.field7684 = field7692;
        this.field7685 = field7693;
        this.field7686 = field7694;
        this.field7687 = field7695;
        this.field7688 = field7696;
        this.field7689 = field7697;
        this.field7690 = field7698;
    }
    
    @Override
    public void run() {
        for (long field7684 = this.field7684; field7684 < this.field7685; ++field7684) {
            final long n = (Class6362.method19009(this.field7691) - field7684) % Class6362.method19009(this.field7691) * this.field7686;
            final long n2 = field7684 * this.field7686;
            for (long n3 = 1L; n3 < this.field7687; ++n3) {
                final long n4 = (Class6362.method19006(this.field7691) - n3) * this.field7688;
                final long n5 = n3 * this.field7688;
                final long n6 = n + n4;
                for (long n7 = 0L; n7 < Class6362.method19008(this.field7691); ++n7) {
                    final long n8 = 2L * n7;
                    final long n9 = this.field7689 - n8;
                    final long n10 = n2 + n5 + n8;
                    this.field7690.method169(n6 + n9 % this.field7689, this.field7690.method135(n10));
                    this.field7690.method169(n6 + (n9 + 1L) % this.field7689, -this.field7690.method135(n10 + 1L));
                }
            }
        }
    }
}
