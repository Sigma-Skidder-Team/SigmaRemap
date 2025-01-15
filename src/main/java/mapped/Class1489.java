// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1489 implements Runnable
{
    private static String[] field8279;
    public final /* synthetic */ int field8280;
    public final /* synthetic */ int field8281;
    public final /* synthetic */ float[][] field8282;
    public final /* synthetic */ boolean field8283;
    public final /* synthetic */ Class6874 field8284;
    
    public Class1489(final Class6874 field8284, final int field8285, final int field8286, final float[][] field8287, final boolean field8288) {
        this.field8284 = field8284;
        this.field8280 = field8285;
        this.field8281 = field8286;
        this.field8282 = field8287;
        this.field8283 = field8288;
    }
    
    @Override
    public void run() {
        final float[] array = new float[Class6874.method21035(this.field8284)];
        for (int i = this.field8280; i < this.field8281; ++i) {
            for (int j = 0; j < Class6874.method21035(this.field8284); ++j) {
                array[j] = this.field8282[j][i];
            }
            Class6874.method21036(this.field8284).method30449(array, this.field8283);
            for (int k = 0; k < Class6874.method21035(this.field8284); ++k) {
                this.field8282[k][i] = array[k];
            }
        }
    }
}
