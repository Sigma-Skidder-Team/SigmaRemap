// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1162 implements Runnable
{
    private static String[] field6302;
    public final /* synthetic */ int field6303;
    public final /* synthetic */ int field6304;
    public final /* synthetic */ double[] field6305;
    public final /* synthetic */ Class7992 field6306;
    
    public Class1162(final Class7992 field6306, final int field6307, final int field6308, final double[] field6309) {
        this.field6306 = field6306;
        this.field6303 = field6307;
        this.field6304 = field6308;
        this.field6305 = field6309;
    }
    
    @Override
    public void run() {
        for (int i = this.field6303; i < this.field6304; ++i) {
            final int n = 2 * i;
            final int n2 = n + 1;
            final double n3 = -this.field6305[n] * Class7992.method26152(this.field6306)[n2] + this.field6305[n2] * Class7992.method26152(this.field6306)[n];
            this.field6305[n] = this.field6305[n] * Class7992.method26152(this.field6306)[n] + this.field6305[n2] * Class7992.method26152(this.field6306)[n2];
            this.field6305[n2] = n3;
        }
    }
}
