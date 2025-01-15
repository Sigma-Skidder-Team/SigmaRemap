// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1383 implements Runnable
{
    private static String[] field7609;
    public final /* synthetic */ int field7610;
    public final /* synthetic */ int field7611;
    public final /* synthetic */ float[] field7612;
    public final /* synthetic */ boolean field7613;
    public final /* synthetic */ Class9117 field7614;
    
    public Class1383(final Class9117 field7614, final int field7615, final int field7616, final float[] field7617, final boolean field7618) {
        this.field7614 = field7614;
        this.field7610 = field7615;
        this.field7611 = field7616;
        this.field7612 = field7617;
        this.field7613 = field7618;
    }
    
    @Override
    public void run() {
        final float[] array = new float[Class9117.method33003(this.field7614)];
        for (int i = this.field7610; i < this.field7611; ++i) {
            final int n = i * Class9117.method33002(this.field7614);
            for (int j = 0; j < Class9117.method33006(this.field7614); ++j) {
                for (int k = 0; k < Class9117.method33003(this.field7614); ++k) {
                    array[k] = this.field7612[n + k * Class9117.method33004(this.field7614) + j];
                }
                Class9117.method33007(this.field7614).method29693(array, this.field7613);
                for (int l = 0; l < Class9117.method33003(this.field7614); ++l) {
                    this.field7612[n + l * Class9117.method33004(this.field7614) + j] = array[l];
                }
            }
        }
    }
}
