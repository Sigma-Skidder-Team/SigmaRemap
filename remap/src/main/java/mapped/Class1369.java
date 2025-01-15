// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class1369 implements Runnable
{
    private static String[] field7514;
    public final /* synthetic */ long field7515;
    public final /* synthetic */ long field7516;
    public final /* synthetic */ Class17 field7517;
    public final /* synthetic */ long field7518;
    public final /* synthetic */ double[] field7519;
    public final /* synthetic */ int field7520;
    
    public Class1369(final long field7515, final long field7516, final Class17 field7517, final long field7518, final double[] field7519, final int field7520) {
        this.field7515 = field7515;
        this.field7516 = field7516;
        this.field7517 = field7517;
        this.field7518 = field7518;
        this.field7519 = field7519;
        this.field7520 = field7520;
    }
    
    @Override
    public void run() {
        for (long field7515 = this.field7515; field7515 < this.field7516; ++field7515) {
            this.field7517.method171(this.field7518 + field7515, this.field7519[this.field7520 + (int)field7515]);
        }
    }
}
