// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1207 implements Runnable
{
    private static String[] field6542;
    public final /* synthetic */ int field6543;
    public final /* synthetic */ int field6544;
    public final /* synthetic */ float[][] field6545;
    public final /* synthetic */ boolean field6546;
    public final /* synthetic */ Class6710 field6547;
    
    public Class1207(final Class6710 field6547, final int field6548, final int field6549, final float[][] field6550, final boolean field6551) {
        this.field6547 = field6547;
        this.field6543 = field6548;
        this.field6544 = field6549;
        this.field6545 = field6550;
        this.field6546 = field6551;
    }
    
    @Override
    public void run() {
        final float[] array = new float[Class6710.method20382(this.field6547)];
        for (int i = this.field6543; i < this.field6544; ++i) {
            for (int j = 0; j < Class6710.method20382(this.field6547); ++j) {
                array[j] = this.field6545[j][i];
            }
            Class6710.method20383(this.field6547).method34185(array, this.field6546);
            for (int k = 0; k < Class6710.method20382(this.field6547); ++k) {
                this.field6545[k][i] = array[k];
            }
        }
    }
}
