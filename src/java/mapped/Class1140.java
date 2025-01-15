// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1140 implements Runnable
{
    private static String[] field6165;
    public final /* synthetic */ int field6166;
    public final /* synthetic */ int field6167;
    public final /* synthetic */ int field6168;
    public final /* synthetic */ double[][] field6169;
    public final /* synthetic */ boolean field6170;
    public final /* synthetic */ Class4406 field6171;
    
    public Class1140(final Class4406 field6171, final int field6172, final int field6173, final int field6174, final double[][] field6175, final boolean field6176) {
        this.field6171 = field6171;
        this.field6166 = field6172;
        this.field6167 = field6173;
        this.field6168 = field6174;
        this.field6169 = field6175;
        this.field6170 = field6176;
    }
    
    @Override
    public void run() {
        if (this.field6166 != -1) {
            for (int i = this.field6167; i < Class4406.method13334(this.field6171); i += this.field6168) {
                Class4406.method13333(this.field6171).method30725(this.field6169[i], this.field6170);
            }
        }
        else {
            for (int j = this.field6167; j < Class4406.method13334(this.field6171); j += this.field6168) {
                Class4406.method13333(this.field6171).method30721(this.field6169[j], this.field6170);
            }
        }
    }
}
