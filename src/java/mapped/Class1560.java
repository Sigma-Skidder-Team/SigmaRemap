// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1560 implements Runnable
{
    private static String[] field8729;
    public final /* synthetic */ int field8730;
    public final /* synthetic */ int field8731;
    public final /* synthetic */ double[][] field8732;
    public final /* synthetic */ Class8983 field8733;
    
    public Class1560(final Class8983 field8733, final int field8734, final int field8735, final double[][] field8736) {
        this.field8733 = field8733;
        this.field8730 = field8734;
        this.field8731 = field8735;
        this.field8732 = field8736;
    }
    
    @Override
    public void run() {
        for (int i = this.field8730; i < this.field8731; ++i) {
            Class8983.method31975(this.field8733).method26072(this.field8732[i]);
        }
    }
}
