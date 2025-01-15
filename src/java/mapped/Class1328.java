// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1328 implements Runnable
{
    private static String[] field7288;
    public final /* synthetic */ int field7289;
    public final /* synthetic */ int field7290;
    public final /* synthetic */ double[] field7291;
    public final /* synthetic */ boolean field7292;
    public final /* synthetic */ Class8788 field7293;
    
    public Class1328(final Class8788 field7293, final int field7294, final int field7295, final double[] field7296, final boolean field7297) {
        this.field7293 = field7293;
        this.field7289 = field7294;
        this.field7290 = field7295;
        this.field7291 = field7296;
        this.field7292 = field7297;
    }
    
    @Override
    public void run() {
        for (int i = this.field7289; i < this.field7290; ++i) {
            Class8788.method30611(this.field7293).method21392(this.field7291, i * Class8788.method30610(this.field7293), this.field7292);
        }
    }
}
