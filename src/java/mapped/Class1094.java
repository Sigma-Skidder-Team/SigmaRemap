// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1094 implements Runnable
{
    private static String[] field5901;
    public final /* synthetic */ int field5902;
    public final /* synthetic */ int field5903;
    public final /* synthetic */ float[][][] field5904;
    public final /* synthetic */ boolean field5905;
    public final /* synthetic */ Class6362 field5906;
    
    public Class1094(final Class6362 field5906, final int field5907, final int field5908, final float[][][] field5909, final boolean field5910) {
        this.field5906 = field5906;
        this.field5902 = field5907;
        this.field5903 = field5908;
        this.field5904 = field5909;
        this.field5905 = field5910;
    }
    
    @Override
    public void run() {
        for (int i = this.field5902; i < this.field5903; ++i) {
            for (int j = 0; j < Class6362.method18998(this.field5906); ++j) {
                Class6362.method19000(this.field5906).method25945(this.field5904[i][j], this.field5905);
            }
        }
    }
}
