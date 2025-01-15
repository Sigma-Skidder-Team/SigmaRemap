// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1074 implements Runnable
{
    private static String[] field5778;
    public final /* synthetic */ int field5779;
    public final /* synthetic */ int field5780;
    public final /* synthetic */ double[][] field5781;
    public final /* synthetic */ Class8788 field5782;
    
    public Class1074(final Class8788 field5782, final int field5783, final int field5784, final double[][] field5785) {
        this.field5782 = field5782;
        this.field5779 = field5783;
        this.field5780 = field5784;
        this.field5781 = field5785;
    }
    
    @Override
    public void run() {
        for (int i = this.field5779; i < this.field5780; ++i) {
            Class8788.method30611(this.field5782).method21386(this.field5781[i]);
        }
    }
}
