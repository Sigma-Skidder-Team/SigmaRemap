// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1461 implements Runnable
{
    private static String[] field8104;
    public final /* synthetic */ int field8105;
    public final /* synthetic */ int field8106;
    public final /* synthetic */ float[][] field8107;
    public final /* synthetic */ boolean field8108;
    public final /* synthetic */ Class6710 field8109;
    
    public Class1461(final Class6710 field8109, final int field8110, final int field8111, final float[][] field8112, final boolean field8113) {
        this.field8109 = field8109;
        this.field8105 = field8110;
        this.field8106 = field8111;
        this.field8107 = field8112;
        this.field8108 = field8113;
    }
    
    @Override
    public void run() {
        final float[] array = new float[Class6710.method20382(this.field8109)];
        for (int i = this.field8105; i < this.field8106; ++i) {
            for (int j = 0; j < Class6710.method20382(this.field8109); ++j) {
                array[j] = this.field8107[j][i];
            }
            Class6710.method20383(this.field8109).method34181(array, this.field8108);
            for (int k = 0; k < Class6710.method20382(this.field8109); ++k) {
                this.field8107[k][i] = array[k];
            }
        }
    }
}
