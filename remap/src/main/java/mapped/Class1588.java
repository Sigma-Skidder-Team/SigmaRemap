// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1588 implements Runnable
{
    private static String[] field8859;
    public final /* synthetic */ long field8860;
    public final /* synthetic */ long field8861;
    public final /* synthetic */ Class17 field8862;
    public final /* synthetic */ Class17 field8863;
    public final /* synthetic */ long field8864;
    public final /* synthetic */ Class6733 field8865;
    
    public Class1588(final Class6733 field8865, final long field8866, final long field8867, final Class17 field8868, final Class17 field8869, final long field8870) {
        this.field8865 = field8865;
        this.field8860 = field8866;
        this.field8861 = field8867;
        this.field8862 = field8868;
        this.field8863 = field8869;
        this.field8864 = field8870;
    }
    
    @Override
    public void run() {
        for (long field8860 = this.field8860; field8860 < this.field8861; ++field8860) {
            final long n = field8860 * Class6733.method20481(this.field8865);
            for (long n2 = 0L; n2 < Class6733.method20482(this.field8865); ++n2) {
                Class8601.method29154(this.field8862, n + n2 * Class6733.method20483(this.field8865), this.field8863, field8860 * Class6733.method20482(this.field8865) * this.field8864 + n2 * this.field8864, Class6733.method20484(this.field8865));
                Class6733.method20476(this.field8865).method26087(this.field8863, field8860 * Class6733.method20482(this.field8865) * this.field8864 + n2 * this.field8864);
            }
        }
    }
}
