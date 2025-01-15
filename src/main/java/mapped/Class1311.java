// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1311 implements Runnable
{
    private static String[] field7188;
    public final /* synthetic */ int field7189;
    public final /* synthetic */ int field7190;
    public final /* synthetic */ float[] field7191;
    public final /* synthetic */ boolean field7192;
    public final /* synthetic */ Class6710 field7193;
    
    public Class1311(final Class6710 field7193, final int field7194, final int field7195, final float[] field7196, final boolean field7197) {
        this.field7193 = field7193;
        this.field7189 = field7194;
        this.field7190 = field7195;
        this.field7191 = field7196;
        this.field7192 = field7197;
    }
    
    @Override
    public void run() {
        final float[] array = new float[Class6710.method20382(this.field7193)];
        for (int i = this.field7189; i < this.field7190; ++i) {
            for (int j = 0; j < Class6710.method20382(this.field7193); ++j) {
                array[j] = this.field7191[j * Class6710.method20380(this.field7193) + i];
            }
            Class6710.method20383(this.field7193).method34181(array, this.field7192);
            for (int k = 0; k < Class6710.method20382(this.field7193); ++k) {
                this.field7191[k * Class6710.method20380(this.field7193) + i] = array[k];
            }
        }
    }
}
