// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1533 implements Runnable
{
    private static String[] field8557;
    public final /* synthetic */ int field8558;
    public final /* synthetic */ int field8559;
    public final /* synthetic */ double[][] field8560;
    public final /* synthetic */ boolean field8561;
    public final /* synthetic */ Class9033 field8562;
    
    public Class1533(final Class9033 field8562, final int field8563, final int field8564, final double[][] field8565, final boolean field8566) {
        this.field8562 = field8562;
        this.field8558 = field8563;
        this.field8559 = field8564;
        this.field8560 = field8565;
        this.field8561 = field8566;
    }
    
    @Override
    public void run() {
        final double[] array = new double[Class9033.method32453(this.field8562)];
        for (int i = this.field8558; i < this.field8559; ++i) {
            for (int j = 0; j < Class9033.method32453(this.field8562); ++j) {
                array[j] = this.field8560[j][i];
            }
            Class9033.method32454(this.field8562).method18036(array, this.field8561);
            for (int k = 0; k < Class9033.method32453(this.field8562); ++k) {
                this.field8560[k][i] = array[k];
            }
        }
    }
}
