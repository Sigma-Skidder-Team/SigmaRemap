// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class977 implements Runnable
{
    private static String[] field5208;
    public final /* synthetic */ int field5209;
    public final /* synthetic */ int field5210;
    public final /* synthetic */ float[] field5211;
    public final /* synthetic */ Class5934 field5212;
    
    public Class977(final Class5934 field5212, final int field5213, final int field5214, final float[] field5215) {
        this.field5212 = field5212;
        this.field5209 = field5213;
        this.field5210 = field5214;
        this.field5211 = field5215;
    }
    
    @Override
    public void run() {
        for (int i = this.field5209; i < this.field5210; ++i) {
            final int n = i * Class5934.method17837(this.field5212);
            for (int j = 0; j < Class5934.method17838(this.field5212); ++j) {
                Class5934.method17840(this.field5212).method30447(this.field5211, n + j * Class5934.method17839(this.field5212));
            }
        }
    }
}
