// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1595 implements Runnable
{
    private static String[] field8900;
    public final /* synthetic */ int field8901;
    public final /* synthetic */ int field8902;
    public final /* synthetic */ float[][][] field8903;
    public final /* synthetic */ boolean field8904;
    public final /* synthetic */ Class6362 field8905;
    
    public Class1595(final Class6362 field8905, final int field8906, final int field8907, final float[][][] field8908, final boolean field8909) {
        this.field8905 = field8905;
        this.field8901 = field8906;
        this.field8902 = field8907;
        this.field8903 = field8908;
        this.field8904 = field8909;
    }
    
    @Override
    public void run() {
        for (int i = this.field8901; i < this.field8902; ++i) {
            for (int j = 0; j < Class6362.method18998(this.field8905); ++j) {
                Class6362.method19000(this.field8905).method25929(this.field8903[i][j], this.field8904);
            }
        }
    }
}
