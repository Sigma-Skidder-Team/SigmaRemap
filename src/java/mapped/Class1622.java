// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1622 implements Runnable
{
    private static String[] field9056;
    public final /* synthetic */ long field9057;
    public final /* synthetic */ long field9058;
    public final /* synthetic */ Class22 field9059;
    public final /* synthetic */ boolean field9060;
    public final /* synthetic */ Class6498 field9061;
    
    public Class1622(final Class6498 field9061, final long field9062, final long field9063, final Class22 field9064, final boolean field9065) {
        this.field9061 = field9061;
        this.field9057 = field9062;
        this.field9058 = field9063;
        this.field9059 = field9064;
        this.field9060 = field9065;
    }
    
    @Override
    public void run() {
        final Class22 class22 = new Class22(Class6498.method19573(this.field9061), false);
        for (long field9057 = this.field9057; field9057 < this.field9058; ++field9057) {
            final long n = field9057 * Class6498.method19564(this.field9061);
            for (long n2 = 0L; n2 < Class6498.method19575(this.field9061); ++n2) {
                for (long n3 = 0L; n3 < Class6498.method19573(this.field9061); ++n3) {
                    class22.method169(n3, this.field9059.method135(n + n3 * Class6498.method19566(this.field9061) + n2));
                }
                Class6498.method19569(this.field9061).method34186(class22, this.field9060);
                for (long n4 = 0L; n4 < Class6498.method19573(this.field9061); ++n4) {
                    this.field9059.method169(n + n4 * Class6498.method19566(this.field9061) + n2, class22.method135(n4));
                }
            }
        }
    }
}
