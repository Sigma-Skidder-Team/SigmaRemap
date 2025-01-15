// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1052 implements Runnable
{
    private static String[] field5643;
    public final /* synthetic */ int field5644;
    public final /* synthetic */ int field5645;
    public final /* synthetic */ float[][] field5646;
    public final /* synthetic */ boolean field5647;
    public final /* synthetic */ Class8328 field5648;
    
    public Class1052(final Class8328 field5648, final int field5649, final int field5650, final float[][] field5651, final boolean field5652) {
        this.field5648 = field5648;
        this.field5644 = field5649;
        this.field5645 = field5650;
        this.field5646 = field5651;
        this.field5647 = field5652;
    }
    
    @Override
    public void run() {
        for (int i = this.field5644; i < this.field5645; ++i) {
            Class8328.method27759(this.field5648).method25929(this.field5646[i], this.field5647);
        }
    }
}
