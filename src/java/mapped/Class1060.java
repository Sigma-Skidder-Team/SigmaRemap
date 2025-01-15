// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1060 implements Runnable
{
    private static String[] field5700;
    public final /* synthetic */ int field5701;
    public final /* synthetic */ int field5702;
    public final /* synthetic */ double[] field5703;
    public final /* synthetic */ Class8983 field5704;
    
    public Class1060(final Class8983 field5704, final int field5705, final int field5706, final double[] field5707) {
        this.field5704 = field5704;
        this.field5701 = field5705;
        this.field5702 = field5706;
        this.field5703 = field5707;
    }
    
    @Override
    public void run() {
        for (int i = this.field5701; i < this.field5702; ++i) {
            Class8983.method31975(this.field5704).method26082(this.field5703, i * Class8983.method31979(this.field5704));
        }
    }
}
