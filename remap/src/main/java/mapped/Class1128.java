// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1128 implements Runnable
{
    private static String[] field6089;
    public final /* synthetic */ int field6090;
    public final /* synthetic */ int field6091;
    public final /* synthetic */ double[][][] field6092;
    public final /* synthetic */ boolean field6093;
    public final /* synthetic */ Class7796 field6094;
    
    public Class1128(final Class7796 field6094, final int field6095, final int field6096, final double[][][] field6097, final boolean field6098) {
        this.field6094 = field6094;
        this.field6090 = field6095;
        this.field6091 = field6096;
        this.field6092 = field6097;
        this.field6093 = field6098;
    }
    
    @Override
    public void run() {
        for (int i = this.field6090; i < this.field6091; ++i) {
            for (int j = 0; j < Class7796.method25144(this.field6094); ++j) {
                Class7796.method25146(this.field6094).method18036(this.field6092[i][j], this.field6093);
            }
        }
    }
}
