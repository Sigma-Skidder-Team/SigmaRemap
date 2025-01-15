// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1552 implements Runnable
{
    private static String[] field8674;
    public final /* synthetic */ long field8675;
    public final /* synthetic */ long field8676;
    public final /* synthetic */ long field8677;
    public final /* synthetic */ Class17 field8678;
    public final /* synthetic */ long field8679;
    public final /* synthetic */ Class17 field8680;
    public final /* synthetic */ Class7992 field8681;
    
    public Class1552(final Class7992 field8681, final long field8682, final long field8683, final long field8684, final Class17 field8685, final long field8686, final Class17 field8687) {
        this.field8681 = field8681;
        this.field8675 = field8682;
        this.field8676 = field8683;
        this.field8677 = field8684;
        this.field8678 = field8685;
        this.field8679 = field8686;
        this.field8680 = field8687;
    }
    
    @Override
    public void run() {
        if (this.field8675 <= 0L) {
            for (long field8676 = this.field8676; field8676 < this.field8677; ++field8676) {
                final long n = 2L * field8676;
                final long n2 = n + 1L;
                this.field8678.method171(this.field8679 + n, Class7992.method26153(this.field8681).method137(n) * this.field8680.method137(n) + Class7992.method26153(this.field8681).method137(n2) * this.field8680.method137(n2));
                this.field8678.method171(this.field8679 + n2, -Class7992.method26153(this.field8681).method137(n2) * this.field8680.method137(n) + Class7992.method26153(this.field8681).method137(n) * this.field8680.method137(n2));
            }
        }
        else {
            for (long field8677 = this.field8676; field8677 < this.field8677; ++field8677) {
                final long n3 = 2L * field8677;
                final long n4 = n3 + 1L;
                this.field8678.method171(this.field8679 + n3, Class7992.method26153(this.field8681).method137(n3) * this.field8680.method137(n3) - Class7992.method26153(this.field8681).method137(n4) * this.field8680.method137(n4));
                this.field8678.method171(this.field8679 + n4, Class7992.method26153(this.field8681).method137(n4) * this.field8680.method137(n3) + Class7992.method26153(this.field8681).method137(n3) * this.field8680.method137(n4));
            }
        }
    }
}
