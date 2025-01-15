// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1455 implements Runnable
{
    private static String[] field8063;
    public final /* synthetic */ long field8064;
    public final /* synthetic */ long field8065;
    public final /* synthetic */ long field8066;
    public final /* synthetic */ long field8067;
    public final /* synthetic */ Class22 field8068;
    public final /* synthetic */ Class8328 field8069;
    
    public Class1455(final Class8328 field8069, final long field8070, final long field8071, final long field8072, final long field8073, final Class22 field8074) {
        this.field8069 = field8069;
        this.field8064 = field8070;
        this.field8065 = field8071;
        this.field8066 = field8072;
        this.field8067 = field8073;
        this.field8068 = field8074;
    }
    
    @Override
    public void run() {
        for (long field8064 = this.field8064; field8064 < this.field8065; ++field8064) {
            final long n = field8064 * this.field8066;
            final long n2 = (Class8328.method27762(this.field8069) - field8064 + 1L) * this.field8066;
            for (long field8065 = this.field8067; field8065 < Class8328.method27764(this.field8069); ++field8065) {
                final long n3 = 2L * field8065;
                final long n4 = 2L * (Class8328.method27764(this.field8069) - field8065);
                this.field8068.method171(n3, this.field8068.method135(n4));
                this.field8068.method171(n3 + 1L, -this.field8068.method135(n4 + 1L));
                final long n5 = n + n3;
                final long n6 = n2 - n3;
                this.field8068.method171(n5, this.field8068.method135(n6));
                this.field8068.method171(n5 + 1L, -this.field8068.method135(n6 + 1L));
            }
        }
    }
}
