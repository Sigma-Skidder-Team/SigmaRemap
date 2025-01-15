// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1427 implements Runnable
{
    private static String[] field7891;
    public final /* synthetic */ int field7892;
    public final /* synthetic */ int field7893;
    public final /* synthetic */ double[] field7894;
    public final /* synthetic */ Class7992 field7895;
    
    public Class1427(final Class7992 field7895, final int field7896, final int field7897, final double[] field7898) {
        this.field7895 = field7895;
        this.field7892 = field7896;
        this.field7893 = field7897;
        this.field7894 = field7898;
    }
    
    @Override
    public void run() {
        for (int i = this.field7892; i < this.field7893; ++i) {
            final int n = 2 * i;
            final int n2 = n + 1;
            final double n3 = -this.field7894[n] * Class7992.method26152(this.field7895)[n2] + this.field7894[n2] * Class7992.method26152(this.field7895)[n];
            this.field7894[n] = this.field7894[n] * Class7992.method26152(this.field7895)[n] + this.field7894[n2] * Class7992.method26152(this.field7895)[n2];
            this.field7894[n2] = n3;
        }
    }
}
