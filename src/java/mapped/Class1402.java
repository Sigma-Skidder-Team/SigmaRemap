// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1402 implements Runnable
{
    private static String[] field7741;
    public final /* synthetic */ int field7742;
    public final /* synthetic */ int field7743;
    public final /* synthetic */ float[] field7744;
    public final /* synthetic */ Class8328 field7745;
    
    public Class1402(final Class8328 field7745, final int field7746, final int field7747, final float[] field7748) {
        this.field7745 = field7745;
        this.field7742 = field7746;
        this.field7743 = field7747;
        this.field7744 = field7748;
    }
    
    @Override
    public void run() {
        for (int i = this.field7742; i < this.field7743; ++i) {
            Class8328.method27759(this.field7745).method25935(this.field7744, i * Class8328.method27763(this.field7745));
        }
    }
}
