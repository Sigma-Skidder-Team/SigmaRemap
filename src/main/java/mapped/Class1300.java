// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1300 implements Runnable
{
    private static String[] field7111;
    public final /* synthetic */ long field7112;
    public final /* synthetic */ long field7113;
    public final /* synthetic */ long field7114;
    public final /* synthetic */ long field7115;
    public final /* synthetic */ Class22 field7116;
    public final /* synthetic */ Class8328 field7117;
    
    public Class1300(final Class8328 field7117, final long field7118, final long field7119, final long field7120, final long field7121, final Class22 field7122) {
        this.field7117 = field7117;
        this.field7112 = field7118;
        this.field7113 = field7119;
        this.field7114 = field7120;
        this.field7115 = field7121;
        this.field7116 = field7122;
    }
    
    @Override
    public void run() {
        for (long field7112 = this.field7112; field7112 < this.field7113; ++field7112) {
            final long n = field7112 * this.field7114;
            final long n2 = (Class8328.method27762(this.field7117) - field7112 + 1L) * this.field7114;
            for (long field7113 = this.field7115; field7113 < Class8328.method27764(this.field7117); ++field7113) {
                final long n3 = 2L * field7113;
                final long n4 = 2L * (Class8328.method27764(this.field7117) - field7113);
                this.field7116.method171(n3, this.field7116.method135(n4));
                this.field7116.method171(n3 + 1L, -this.field7116.method135(n4 + 1L));
                final long n5 = n + n3;
                final long n6 = n2 - n3;
                this.field7116.method171(n5, this.field7116.method135(n6));
                this.field7116.method171(n5 + 1L, -this.field7116.method135(n6 + 1L));
            }
        }
    }
}
