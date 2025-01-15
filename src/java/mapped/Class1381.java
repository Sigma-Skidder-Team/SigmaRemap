// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1381 implements Runnable
{
    private static String[] field7597;
    public final /* synthetic */ int field7598;
    public final /* synthetic */ int field7599;
    public final /* synthetic */ double[][] field7600;
    public final /* synthetic */ boolean field7601;
    public final /* synthetic */ Class9033 field7602;
    
    public Class1381(final Class9033 field7602, final int field7603, final int field7604, final double[][] field7605, final boolean field7606) {
        this.field7602 = field7602;
        this.field7598 = field7603;
        this.field7599 = field7604;
        this.field7600 = field7605;
        this.field7601 = field7606;
    }
    
    @Override
    public void run() {
        for (int i = this.field7598; i < this.field7599; ++i) {
            Class9033.method32452(this.field7602).method18040(this.field7600[i], this.field7601);
        }
    }
}
