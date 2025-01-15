// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1434 implements Runnable
{
    private static String[] field7937;
    public final /* synthetic */ long field7938;
    public final /* synthetic */ long field7939;
    public final /* synthetic */ long field7940;
    public final /* synthetic */ Class22 field7941;
    public final /* synthetic */ boolean field7942;
    public final /* synthetic */ Class8328 field7943;
    
    public Class1434(final Class8328 field7943, final long field7944, final long field7945, final long field7946, final Class22 field7947, final boolean field7948) {
        this.field7943 = field7943;
        this.field7938 = field7944;
        this.field7939 = field7945;
        this.field7940 = field7946;
        this.field7941 = field7947;
        this.field7942 = field7948;
    }
    
    @Override
    public void run() {
        final Class22 class22 = new Class22(2L * Class8328.method27762(this.field7943), false);
        for (long field7938 = this.field7938; field7938 < this.field7939; ++field7938) {
            final long n = 2L * field7938;
            for (long n2 = 0L; n2 < Class8328.method27762(this.field7943); ++n2) {
                final long n3 = 2L * n2;
                final long n4 = n2 * this.field7940 + n;
                class22.method171(n3, this.field7941.method135(n4));
                class22.method171(n3 + 1L, this.field7941.method135(n4 + 1L));
            }
            Class8328.method27761(this.field7943).method25930(class22, this.field7942);
            for (long n5 = 0L; n5 < Class8328.method27762(this.field7943); ++n5) {
                final long n6 = 2L * n5;
                final long n7 = n5 * this.field7940 + n;
                this.field7941.method171(n7, class22.method135(n6));
                this.field7941.method171(n7 + 1L, class22.method135(n6 + 1L));
            }
        }
    }
}
