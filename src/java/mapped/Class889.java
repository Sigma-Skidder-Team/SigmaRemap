// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class889 implements Runnable
{
    private static String[] field4803;
    public final /* synthetic */ int field4804;
    public final /* synthetic */ int field4805;
    public final /* synthetic */ int field4806;
    public final /* synthetic */ double[][] field4807;
    public final /* synthetic */ boolean field4808;
    public final /* synthetic */ Class9033 field4809;
    
    public Class889(final Class9033 field4809, final int field4810, final int field4811, final int field4812, final double[][] field4813, final boolean field4814) {
        this.field4809 = field4809;
        this.field4804 = field4810;
        this.field4805 = field4811;
        this.field4806 = field4812;
        this.field4807 = field4813;
        this.field4808 = field4814;
    }
    
    @Override
    public void run() {
        if (this.field4804 != -1) {
            for (int i = this.field4805; i < Class9033.method32453(this.field4809); i += this.field4806) {
                Class9033.method32452(this.field4809).method18040(this.field4807[i], this.field4808);
            }
        }
        else {
            for (int j = this.field4805; j < Class9033.method32453(this.field4809); j += this.field4806) {
                Class9033.method32452(this.field4809).method18036(this.field4807[j], this.field4808);
            }
        }
    }
}
