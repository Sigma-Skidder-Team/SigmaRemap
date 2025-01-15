// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1232 implements Runnable
{
    private static String[] field6696;
    public final /* synthetic */ long field6697;
    public final /* synthetic */ long field6698;
    public final /* synthetic */ long field6699;
    public final /* synthetic */ long field6700;
    public final /* synthetic */ Class17 field6701;
    public final /* synthetic */ boolean field6702;
    public final /* synthetic */ long field6703;
    public final /* synthetic */ Class6733 field6704;
    
    public Class1232(final Class6733 field6704, final long field6705, final long field6706, final long field6707, final long field6708, final Class17 field6709, final boolean field6710, final long field6711) {
        this.field6704 = field6704;
        this.field6697 = field6705;
        this.field6698 = field6706;
        this.field6699 = field6707;
        this.field6700 = field6708;
        this.field6701 = field6709;
        this.field6702 = field6710;
        this.field6703 = field6711;
    }
    
    @Override
    public void run() {
        final Class17 class17 = new Class17(this.field6697);
        for (long field6698 = this.field6698; field6698 >= this.field6699; --field6698) {
            final long n = field6698 * Class6733.method20481(this.field6704);
            final long n2 = field6698 * this.field6700;
            for (long n3 = Class6733.method20482(this.field6704) - 1L; n3 >= 0L; --n3) {
                Class8601.method29154(this.field6701, n + n3 * Class6733.method20483(this.field6704), class17, 0L, Class6733.method20484(this.field6704));
                Class6733.method20476(this.field6704).method26093(class17, this.field6702);
                Class8601.method29154(class17, 0L, this.field6701, n2 + n3 * this.field6703, this.field6697);
            }
        }
    }
}
