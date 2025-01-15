// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1309 implements Runnable
{
    private static String[] field7175;
    public final /* synthetic */ int field7176;
    public final /* synthetic */ int field7177;
    public final /* synthetic */ float[][][] field7178;
    public final /* synthetic */ boolean field7179;
    public final /* synthetic */ Class6498 field7180;
    
    public Class1309(final Class6498 field7180, final int field7181, final int field7182, final float[][][] field7183, final boolean field7184) {
        this.field7180 = field7180;
        this.field7176 = field7181;
        this.field7177 = field7182;
        this.field7178 = field7183;
        this.field7179 = field7184;
    }
    
    @Override
    public void run() {
        for (int i = this.field7176; i < this.field7177; ++i) {
            for (int j = 0; j < Class6498.method19565(this.field7180); ++j) {
                Class6498.method19567(this.field7180).method34185(this.field7178[i][j], this.field7179);
            }
        }
    }
}
