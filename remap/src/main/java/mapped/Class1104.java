// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1104 implements Runnable
{
    private static String[] field5961;
    public final /* synthetic */ int field5962;
    public final /* synthetic */ int field5963;
    public final /* synthetic */ float[][][] field5964;
    public final /* synthetic */ Class5934 field5965;
    
    public Class1104(final Class5934 field5965, final int field5966, final int field5967, final float[][][] field5968) {
        this.field5965 = field5965;
        this.field5962 = field5966;
        this.field5963 = field5967;
        this.field5964 = field5968;
    }
    
    @Override
    public void run() {
        for (int i = this.field5962; i < this.field5963; ++i) {
            for (int j = 0; j < Class5934.method17838(this.field5965); ++j) {
                Class5934.method17840(this.field5965).method30445(this.field5964[i][j]);
            }
        }
    }
}
