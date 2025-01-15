// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1176 implements Runnable
{
    private static String[] field6375;
    public final /* synthetic */ int field6376;
    public final /* synthetic */ int field6377;
    public final /* synthetic */ float[][][] field6378;
    public final /* synthetic */ boolean field6379;
    public final /* synthetic */ Class9117 field6380;
    
    public Class1176(final Class9117 field6380, final int field6381, final int field6382, final float[][][] field6383, final boolean field6384) {
        this.field6380 = field6380;
        this.field6376 = field6381;
        this.field6377 = field6382;
        this.field6378 = field6383;
        this.field6379 = field6384;
    }
    
    @Override
    public void run() {
        final float[] array = new float[Class9117.method33003(this.field6380)];
        for (int i = this.field6376; i < this.field6377; ++i) {
            for (int j = 0; j < Class9117.method33006(this.field6380); ++j) {
                for (int k = 0; k < Class9117.method33003(this.field6380); ++k) {
                    array[k] = this.field6378[i][k][j];
                }
                Class9117.method33007(this.field6380).method29689(array, this.field6379);
                for (int l = 0; l < Class9117.method33003(this.field6380); ++l) {
                    this.field6378[i][l][j] = array[l];
                }
            }
        }
    }
}
