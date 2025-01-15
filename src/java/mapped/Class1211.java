// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1211 implements Runnable
{
    private static String[] field6570;
    public final /* synthetic */ int field6571;
    public final /* synthetic */ int field6572;
    public final /* synthetic */ int field6573;
    public final /* synthetic */ double[] field6574;
    public final /* synthetic */ boolean field6575;
    public final /* synthetic */ Class8788 field6576;
    
    public Class1211(final Class8788 field6576, final int field6577, final int field6578, final int field6579, final double[] field6580, final boolean field6581) {
        this.field6576 = field6576;
        this.field6571 = field6577;
        this.field6572 = field6578;
        this.field6573 = field6579;
        this.field6574 = field6580;
        this.field6575 = field6581;
    }
    
    @Override
    public void run() {
        if (this.field6571 != -1) {
            for (int i = this.field6572; i < Class8788.method30612(this.field6576); i += this.field6573) {
                Class8788.method30611(this.field6576).method21392(this.field6574, i * Class8788.method30610(this.field6576), this.field6575);
            }
        }
        else {
            for (int j = this.field6572; j < Class8788.method30612(this.field6576); j += this.field6573) {
                Class8788.method30611(this.field6576).method21388(this.field6574, j * Class8788.method30610(this.field6576));
            }
        }
    }
}
