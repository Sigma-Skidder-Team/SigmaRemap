// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1624 implements Runnable
{
    private static String[] field9068;
    public final /* synthetic */ int field9069;
    public final /* synthetic */ int field9070;
    public final /* synthetic */ double[][][] field9071;
    public final /* synthetic */ boolean field9072;
    public final /* synthetic */ Class7568 field9073;
    
    public Class1624(final Class7568 field9073, final int field9074, final int field9075, final double[][][] field9076, final boolean field9077) {
        this.field9073 = field9073;
        this.field9069 = field9074;
        this.field9070 = field9075;
        this.field9071 = field9076;
        this.field9072 = field9077;
    }
    
    @Override
    public void run() {
        for (int i = this.field9069; i < this.field9070; ++i) {
            for (int j = 0; j < Class7568.method23777(this.field9073); ++j) {
                Class7568.method23779(this.field9073).method30725(this.field9071[i][j], this.field9072);
            }
        }
    }
}
