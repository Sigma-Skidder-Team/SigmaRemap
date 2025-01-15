// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1638 implements Runnable
{
    private static String[] field9154;
    public final /* synthetic */ int field9155;
    public final /* synthetic */ int field9156;
    public final /* synthetic */ double[][] field9157;
    public final /* synthetic */ boolean field9158;
    public final /* synthetic */ Class8983 field9159;
    
    public Class1638(final Class8983 field9159, final int field9160, final int field9161, final double[][] field9162, final boolean field9163) {
        this.field9159 = field9159;
        this.field9155 = field9160;
        this.field9156 = field9161;
        this.field9157 = field9162;
        this.field9158 = field9163;
    }
    
    @Override
    public void run() {
        for (int i = this.field9155; i < this.field9156; ++i) {
            Class8983.method31975(this.field9159).method26096(this.field9157[i], 0, this.field9158);
        }
    }
}
