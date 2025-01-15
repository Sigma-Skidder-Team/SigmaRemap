// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1102 implements Runnable
{
    private static String[] field5950;
    public final /* synthetic */ long field5951;
    public final /* synthetic */ long field5952;
    public final /* synthetic */ long field5953;
    public final /* synthetic */ long field5954;
    public final /* synthetic */ Class17 field5955;
    public final /* synthetic */ Class17 field5956;
    public final /* synthetic */ long field5957;
    public final /* synthetic */ Class8983 field5958;
    
    public Class1102(final Class8983 field5958, final long field5959, final long field5960, final long field5961, final long field5962, final Class17 field5963, final Class17 field5964, final long field5965) {
        this.field5958 = field5958;
        this.field5951 = field5959;
        this.field5952 = field5960;
        this.field5953 = field5961;
        this.field5954 = field5962;
        this.field5955 = field5963;
        this.field5956 = field5964;
        this.field5957 = field5965;
    }
    
    @Override
    public void run() {
        for (long field5951 = this.field5951; field5951 < this.field5952; ++field5951) {
            final long n = 2L * field5951;
            for (long n2 = 0L; n2 < this.field5953; ++n2) {
                final long n3 = field5951 * this.field5954 + 2L * n2;
                this.field5955.method171(n3, this.field5956.method137(n2 * this.field5957 + n));
                this.field5955.method171(n3 + 1L, this.field5956.method137(n2 * this.field5957 + n + 1L));
            }
        }
    }
}
