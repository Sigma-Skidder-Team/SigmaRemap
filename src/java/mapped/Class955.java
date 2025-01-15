// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class955 implements Runnable
{
    private static String[] field5058;
    public final /* synthetic */ int field5059;
    public final /* synthetic */ int field5060;
    public final /* synthetic */ float[] field5061;
    public final /* synthetic */ boolean field5062;
    public final /* synthetic */ Class6874 field5063;
    
    public Class955(final Class6874 field5063, final int field5064, final int field5065, final float[] field5066, final boolean field5067) {
        this.field5063 = field5063;
        this.field5059 = field5064;
        this.field5060 = field5065;
        this.field5061 = field5066;
        this.field5062 = field5067;
    }
    
    @Override
    public void run() {
        for (int i = this.field5059; i < this.field5060; ++i) {
            Class6874.method21034(this.field5063).method30451(this.field5061, i * Class6874.method21033(this.field5063), this.field5062);
        }
    }
}
