// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1500 implements Runnable
{
    private static String[] field8342;
    public final /* synthetic */ int field8343;
    public final /* synthetic */ int field8344;
    public final /* synthetic */ int field8345;
    public final /* synthetic */ int field8346;
    public final /* synthetic */ double[] field8347;
    public final /* synthetic */ int field8348;
    public final /* synthetic */ Class6733 field8349;
    
    public Class1500(final Class6733 field8349, final int field8350, final int field8351, final int field8352, final int field8353, final double[] field8354, final int field8355) {
        this.field8349 = field8349;
        this.field8343 = field8350;
        this.field8344 = field8351;
        this.field8345 = field8352;
        this.field8346 = field8353;
        this.field8347 = field8354;
        this.field8348 = field8355;
    }
    
    @Override
    public void run() {
        final double[] array = new double[this.field8343];
        for (int i = this.field8344; i >= this.field8345; --i) {
            final int n = i * Class6733.method20473(this.field8349);
            final int n2 = i * this.field8346;
            for (int j = Class6733.method20474(this.field8349) - 1; j >= 0; --j) {
                System.arraycopy(this.field8347, n + j * Class6733.method20475(this.field8349), array, 0, Class6733.method20477(this.field8349));
                Class6733.method20476(this.field8349).method26084(array);
                System.arraycopy(array, 0, this.field8347, n2 + j * this.field8348, this.field8343);
            }
        }
    }
}
