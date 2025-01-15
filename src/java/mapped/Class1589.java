// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1589 implements Runnable
{
    private static String[] field8866;
    public final /* synthetic */ int field8867;
    public final /* synthetic */ int field8868;
    public final /* synthetic */ double[] field8869;
    public final /* synthetic */ boolean field8870;
    public final /* synthetic */ Class7796 field8871;
    
    public Class1589(final Class7796 field8871, final int field8872, final int field8873, final double[] field8874, final boolean field8875) {
        this.field8871 = field8871;
        this.field8867 = field8872;
        this.field8868 = field8873;
        this.field8869 = field8874;
        this.field8870 = field8875;
    }
    
    @Override
    public void run() {
        for (int i = this.field8867; i < this.field8868; ++i) {
            final int n = i * Class7796.method25143(this.field8871);
            for (int j = 0; j < Class7796.method25144(this.field8871); ++j) {
                Class7796.method25146(this.field8871).method18042(this.field8869, n + j * Class7796.method25145(this.field8871), this.field8870);
            }
        }
    }
}
