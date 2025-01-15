// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1540 implements Runnable
{
    private static String[] field8605;
    public final /* synthetic */ int field8606;
    public final /* synthetic */ int field8607;
    public final /* synthetic */ double[] field8608;
    public final /* synthetic */ boolean field8609;
    public final /* synthetic */ Class8788 field8610;
    
    public Class1540(final Class8788 field8610, final int field8611, final int field8612, final double[] field8613, final boolean field8614) {
        this.field8610 = field8610;
        this.field8606 = field8611;
        this.field8607 = field8612;
        this.field8608 = field8613;
        this.field8609 = field8614;
    }
    
    @Override
    public void run() {
        final double[] array = new double[Class8788.method30612(this.field8610)];
        for (int i = this.field8606; i < this.field8607; ++i) {
            for (int j = 0; j < Class8788.method30612(this.field8610); ++j) {
                array[j] = this.field8608[j * Class8788.method30610(this.field8610) + i];
            }
            Class8788.method30613(this.field8610).method21390(array, this.field8609);
            for (int k = 0; k < Class8788.method30612(this.field8610); ++k) {
                this.field8608[k * Class8788.method30610(this.field8610) + i] = array[k];
            }
        }
    }
}
