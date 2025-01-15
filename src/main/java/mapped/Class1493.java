// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1493 implements Runnable
{
    private static String[] field8299;
    public final /* synthetic */ int field8300;
    public final /* synthetic */ int field8301;
    public final /* synthetic */ double[] field8302;
    public final /* synthetic */ boolean field8303;
    public final /* synthetic */ Class9033 field8304;
    
    public Class1493(final Class9033 field8304, final int field8305, final int field8306, final double[] field8307, final boolean field8308) {
        this.field8304 = field8304;
        this.field8300 = field8305;
        this.field8301 = field8306;
        this.field8302 = field8307;
        this.field8303 = field8308;
    }
    
    @Override
    public void run() {
        for (int i = this.field8300; i < this.field8301; ++i) {
            Class9033.method32452(this.field8304).method18042(this.field8302, i * Class9033.method32451(this.field8304), this.field8303);
        }
    }
}
