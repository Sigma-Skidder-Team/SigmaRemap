// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class978 implements Runnable
{
    private static String[] field5213;
    public final /* synthetic */ int field5214;
    public final /* synthetic */ int field5215;
    public final /* synthetic */ float[][] field5216;
    public final /* synthetic */ int field5217;
    public final /* synthetic */ int field5218;
    public final /* synthetic */ int field5219;
    public final /* synthetic */ Class8328 field5220;
    
    public Class978(final Class8328 field5220, final int field5221, final int field5222, final float[][] field5223, final int field5224, final int field5225, final int field5226) {
        this.field5220 = field5220;
        this.field5214 = field5221;
        this.field5215 = field5222;
        this.field5216 = field5223;
        this.field5217 = field5224;
        this.field5218 = field5225;
        this.field5219 = field5226;
    }
    
    @Override
    public void run() {
        for (int i = this.field5214; i < this.field5215; ++i) {
            final int n = Class8328.method27760(this.field5220) - i;
            this.field5216[i][Class8328.method27763(this.field5220)] = this.field5216[n][1];
            this.field5216[i][Class8328.method27763(this.field5220) + 1] = -this.field5216[n][0];
        }
        for (int j = this.field5214; j < this.field5215; ++j) {
            final int n2 = Class8328.method27760(this.field5220) - j;
            for (int k = Class8328.method27763(this.field5220) + 2; k < this.field5217; k += 2) {
                final int n3 = this.field5217 - k;
                this.field5216[j][k] = this.field5216[n2][n3];
                this.field5216[j][k + 1] = -this.field5216[n2][n3 + 1];
            }
        }
        for (int l = this.field5218; l < this.field5219; ++l) {
            final int n4 = (Class8328.method27760(this.field5220) - l) % Class8328.method27760(this.field5220);
            for (int n5 = 0; n5 < this.field5217; n5 += 2) {
                final int n6 = (this.field5217 - n5) % this.field5217;
                this.field5216[n4][n6] = this.field5216[l][n5];
                this.field5216[n4][n6 + 1] = -this.field5216[l][n5 + 1];
            }
        }
    }
}
