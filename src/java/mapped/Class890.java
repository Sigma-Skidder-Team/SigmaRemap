// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class890 implements Runnable
{
    private static String[] field4810;
    public final /* synthetic */ int field4811;
    public final /* synthetic */ int field4812;
    public final /* synthetic */ int field4813;
    public final /* synthetic */ double[][] field4814;
    public final /* synthetic */ boolean field4815;
    public final /* synthetic */ Class8788 field4816;
    
    public Class890(final Class8788 field4816, final int field4817, final int field4818, final int field4819, final double[][] field4820, final boolean field4821) {
        this.field4816 = field4816;
        this.field4811 = field4817;
        this.field4812 = field4818;
        this.field4813 = field4819;
        this.field4814 = field4820;
        this.field4815 = field4821;
    }
    
    @Override
    public void run() {
        if (this.field4811 != -1) {
            for (int i = this.field4812; i < Class8788.method30612(this.field4816); i += this.field4813) {
                Class8788.method30611(this.field4816).method21390(this.field4814[i], this.field4815);
            }
        }
        else {
            for (int j = this.field4812; j < Class8788.method30612(this.field4816); j += this.field4813) {
                Class8788.method30611(this.field4816).method21386(this.field4814[j]);
            }
        }
    }
}
