// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1433 implements Runnable
{
    private static String[] field7928;
    public final /* synthetic */ long field7929;
    public final /* synthetic */ long field7930;
    public final /* synthetic */ long field7931;
    public final /* synthetic */ long field7932;
    public final /* synthetic */ Class22 field7933;
    public final /* synthetic */ Class22 field7934;
    public final /* synthetic */ long field7935;
    public final /* synthetic */ Class8328 field7936;
    
    public Class1433(final Class8328 field7936, final long field7937, final long field7938, final long field7939, final long field7940, final Class22 field7941, final Class22 field7942, final long field7943) {
        this.field7936 = field7936;
        this.field7929 = field7937;
        this.field7930 = field7938;
        this.field7931 = field7939;
        this.field7932 = field7940;
        this.field7933 = field7941;
        this.field7934 = field7942;
        this.field7935 = field7943;
    }
    
    @Override
    public void run() {
        for (long field7929 = this.field7929; field7929 < this.field7930; ++field7929) {
            final long n = 2L * field7929;
            for (long n2 = 0L; n2 < this.field7931; ++n2) {
                final long n3 = field7929 * this.field7932 + 2L * n2;
                this.field7933.method171(n3, this.field7934.method135(n2 * this.field7935 + n));
                this.field7933.method171(n3 + 1L, this.field7934.method135(n2 * this.field7935 + n + 1L));
            }
        }
    }
}
