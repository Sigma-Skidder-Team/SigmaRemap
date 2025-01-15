// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1139 implements Runnable
{
    private static String[] field6159;
    public final /* synthetic */ int field6160;
    public final /* synthetic */ int field6161;
    public final /* synthetic */ float[][][] field6162;
    public final /* synthetic */ boolean field6163;
    public final /* synthetic */ Class9117 field6164;
    
    public Class1139(final Class9117 field6164, final int field6165, final int field6166, final float[][][] field6167, final boolean field6168) {
        this.field6164 = field6164;
        this.field6160 = field6165;
        this.field6161 = field6166;
        this.field6162 = field6167;
        this.field6163 = field6168;
    }
    
    @Override
    public void run() {
        final float[] array = new float[Class9117.method33003(this.field6164)];
        for (int i = this.field6160; i < this.field6161; ++i) {
            for (int j = 0; j < Class9117.method33006(this.field6164); ++j) {
                for (int k = 0; k < Class9117.method33003(this.field6164); ++k) {
                    array[k] = this.field6162[i][k][j];
                }
                Class9117.method33007(this.field6164).method29693(array, this.field6163);
                for (int l = 0; l < Class9117.method33003(this.field6164); ++l) {
                    this.field6162[i][l][j] = array[l];
                }
            }
        }
    }
}
