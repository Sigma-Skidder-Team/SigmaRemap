// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1127 implements Runnable
{
    private static String[] field6083;
    public final /* synthetic */ int field6084;
    public final /* synthetic */ int field6085;
    public final /* synthetic */ double[][] field6086;
    public final /* synthetic */ boolean field6087;
    public final /* synthetic */ Class8788 field6088;
    
    public Class1127(final Class8788 field6088, final int field6089, final int field6090, final double[][] field6091, final boolean field6092) {
        this.field6088 = field6088;
        this.field6084 = field6089;
        this.field6085 = field6090;
        this.field6086 = field6091;
        this.field6087 = field6092;
    }
    
    @Override
    public void run() {
        for (int i = this.field6084; i < this.field6085; ++i) {
            Class8788.method30611(this.field6088).method21390(this.field6086[i], this.field6087);
        }
    }
}
