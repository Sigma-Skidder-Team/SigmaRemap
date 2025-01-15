// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1389 implements Runnable
{
    private static String[] field7649;
    public final /* synthetic */ int field7650;
    public final /* synthetic */ int field7651;
    public final /* synthetic */ double[] field7652;
    public final /* synthetic */ boolean field7653;
    public final /* synthetic */ Class9033 field7654;
    
    public Class1389(final Class9033 field7654, final int field7655, final int field7656, final double[] field7657, final boolean field7658) {
        this.field7654 = field7654;
        this.field7650 = field7655;
        this.field7651 = field7656;
        this.field7652 = field7657;
        this.field7653 = field7658;
    }
    
    @Override
    public void run() {
        for (int i = this.field7650; i < this.field7651; ++i) {
            Class9033.method32452(this.field7654).method18038(this.field7652, i * Class9033.method32451(this.field7654), this.field7653);
        }
    }
}
