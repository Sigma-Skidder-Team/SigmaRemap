// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1398 implements Runnable
{
    private static String[] field7712;
    public final /* synthetic */ int field7713;
    public final /* synthetic */ int field7714;
    public final /* synthetic */ float[][][] field7715;
    public final /* synthetic */ boolean field7716;
    public final /* synthetic */ Class5934 field7717;
    
    public Class1398(final Class5934 field7717, final int field7718, final int field7719, final float[][][] field7720, final boolean field7721) {
        this.field7717 = field7717;
        this.field7713 = field7718;
        this.field7714 = field7719;
        this.field7715 = field7720;
        this.field7716 = field7721;
    }
    
    @Override
    public void run() {
        final float[] array = new float[Class5934.method17838(this.field7717)];
        for (int i = this.field7713; i < this.field7714; ++i) {
            for (int j = 0; j < Class5934.method17841(this.field7717); ++j) {
                for (int k = 0; k < Class5934.method17838(this.field7717); ++k) {
                    array[k] = this.field7715[i][k][j];
                }
                Class5934.method17842(this.field7717).method30449(array, this.field7716);
                for (int l = 0; l < Class5934.method17838(this.field7717); ++l) {
                    this.field7715[i][l][j] = array[l];
                }
            }
        }
    }
}
