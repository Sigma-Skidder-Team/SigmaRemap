// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class999 implements Runnable
{
    private static String[] field5330;
    public final /* synthetic */ int field5331;
    public final /* synthetic */ int field5332;
    public final /* synthetic */ float[][] field5333;
    public final /* synthetic */ boolean field5334;
    public final /* synthetic */ Class8328 field5335;
    
    public Class999(final Class8328 field5335, final int field5336, final int field5337, final float[][] field5338, final boolean field5339) {
        this.field5335 = field5335;
        this.field5331 = field5336;
        this.field5332 = field5337;
        this.field5333 = field5338;
        this.field5334 = field5339;
    }
    
    @Override
    public void run() {
        for (int i = this.field5331; i < this.field5332; ++i) {
            Class8328.method27759(this.field5335).method25949(this.field5333[i], 0, this.field5334);
        }
    }
}
