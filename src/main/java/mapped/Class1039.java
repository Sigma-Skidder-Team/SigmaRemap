// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1039 implements Runnable
{
    private static String[] field5568;
    public final /* synthetic */ int field5569;
    public final /* synthetic */ int field5570;
    public final /* synthetic */ double[][][] field5571;
    public final /* synthetic */ boolean field5572;
    public final /* synthetic */ Class5815 field5573;
    
    public Class1039(final Class5815 field5573, final int field5574, final int field5575, final double[][][] field5576, final boolean field5577) {
        this.field5573 = field5573;
        this.field5569 = field5574;
        this.field5570 = field5575;
        this.field5571 = field5576;
        this.field5572 = field5577;
    }
    
    @Override
    public void run() {
        for (int i = this.field5569; i < this.field5570; ++i) {
            for (int j = 0; j < Class5815.method17498(this.field5573); ++j) {
                Class5815.method17500(this.field5573).method21390(this.field5571[i][j], this.field5572);
            }
        }
    }
}
