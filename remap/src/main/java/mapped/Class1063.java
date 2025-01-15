// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1063 implements Runnable
{
    private static String[] field5717;
    public final /* synthetic */ int field5718;
    public final /* synthetic */ int field5719;
    public final /* synthetic */ float[][][] field5720;
    public final /* synthetic */ boolean field5721;
    public final /* synthetic */ Class9117 field5722;
    
    public Class1063(final Class9117 field5722, final int field5723, final int field5724, final float[][][] field5725, final boolean field5726) {
        this.field5722 = field5722;
        this.field5718 = field5723;
        this.field5719 = field5724;
        this.field5720 = field5725;
        this.field5721 = field5726;
    }
    
    @Override
    public void run() {
        for (int i = this.field5718; i < this.field5719; ++i) {
            for (int j = 0; j < Class9117.method33003(this.field5722); ++j) {
                Class9117.method33005(this.field5722).method29689(this.field5720[i][j], this.field5721);
            }
        }
    }
}
