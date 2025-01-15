// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1283 implements Runnable
{
    private static String[] field7006;
    public final /* synthetic */ long field7007;
    public final /* synthetic */ long field7008;
    public final /* synthetic */ Class17 field7009;
    public final /* synthetic */ long field7010;
    public final /* synthetic */ Class17 field7011;
    public final /* synthetic */ Class7992 field7012;
    
    public Class1283(final Class7992 field7012, final long field7013, final long field7014, final Class17 field7015, final long field7016, final Class17 field7017) {
        this.field7012 = field7012;
        this.field7007 = field7013;
        this.field7008 = field7014;
        this.field7009 = field7015;
        this.field7010 = field7016;
        this.field7011 = field7017;
    }
    
    @Override
    public void run() {
        for (long field7007 = this.field7007; field7007 < this.field7008; ++field7007) {
            final long n = 2L * field7007;
            final long n2 = n + 1L;
            this.field7009.method171(this.field7010 + field7007, Class7992.method26153(this.field7012).method137(n) * this.field7011.method137(n) - Class7992.method26153(this.field7012).method137(n2) * this.field7011.method137(n2));
        }
    }
}
