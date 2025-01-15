// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1161 implements Runnable
{
    private static String[] field6296;
    public final /* synthetic */ int field6297;
    public final /* synthetic */ int field6298;
    public final /* synthetic */ float[][][] field6299;
    public final /* synthetic */ boolean field6300;
    public final /* synthetic */ Class6498 field6301;
    
    public Class1161(final Class6498 field6301, final int field6302, final int field6303, final float[][][] field6304, final boolean field6305) {
        this.field6301 = field6301;
        this.field6297 = field6302;
        this.field6298 = field6303;
        this.field6299 = field6304;
        this.field6300 = field6305;
    }
    
    @Override
    public void run() {
        for (int i = this.field6297; i < this.field6298; ++i) {
            for (int j = 0; j < Class6498.method19565(this.field6301); ++j) {
                Class6498.method19567(this.field6301).method34181(this.field6299[i][j], this.field6300);
            }
        }
    }
}
