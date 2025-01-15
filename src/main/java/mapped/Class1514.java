// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1514 implements Runnable
{
    private static String[] field8436;
    public final /* synthetic */ int field8437;
    public final /* synthetic */ int field8438;
    public final /* synthetic */ float[] field8439;
    public final /* synthetic */ boolean field8440;
    public final /* synthetic */ Class6498 field8441;
    
    public Class1514(final Class6498 field8441, final int field8442, final int field8443, final float[] field8444, final boolean field8445) {
        this.field8441 = field8441;
        this.field8437 = field8442;
        this.field8438 = field8443;
        this.field8439 = field8444;
        this.field8440 = field8445;
    }
    
    @Override
    public void run() {
        final float[] array = new float[Class6498.method19565(this.field8441)];
        for (int i = this.field8437; i < this.field8438; ++i) {
            final int n = i * Class6498.method19564(this.field8441);
            for (int j = 0; j < Class6498.method19568(this.field8441); ++j) {
                for (int k = 0; k < Class6498.method19565(this.field8441); ++k) {
                    array[k] = this.field8439[n + k * Class6498.method19566(this.field8441) + j];
                }
                Class6498.method19569(this.field8441).method34181(array, this.field8440);
                for (int l = 0; l < Class6498.method19565(this.field8441); ++l) {
                    this.field8439[n + l * Class6498.method19566(this.field8441) + j] = array[l];
                }
            }
        }
    }
}
