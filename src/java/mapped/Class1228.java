// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1228 implements Runnable
{
    private static String[] field6678;
    public final /* synthetic */ int field6679;
    public final /* synthetic */ int field6680;
    public final /* synthetic */ double[] field6681;
    public final /* synthetic */ Class8788 field6682;
    
    public Class1228(final Class8788 field6682, final int field6683, final int field6684, final double[] field6685) {
        this.field6682 = field6682;
        this.field6679 = field6683;
        this.field6680 = field6684;
        this.field6681 = field6685;
    }
    
    @Override
    public void run() {
        for (int i = this.field6679; i < this.field6680; ++i) {
            Class8788.method30611(this.field6682).method21388(this.field6681, i * Class8788.method30610(this.field6682));
        }
    }
}
