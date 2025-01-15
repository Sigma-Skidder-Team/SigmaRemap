// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class954 implements Runnable
{
    private static String[] field5050;
    public final /* synthetic */ int field5051;
    public final /* synthetic */ int field5052;
    public final /* synthetic */ int field5053;
    public final /* synthetic */ int field5054;
    public final /* synthetic */ double[] field5055;
    public final /* synthetic */ boolean field5056;
    public final /* synthetic */ Class8983 field5057;
    
    public Class954(final Class8983 field5057, final int field5058, final int field5059, final int field5060, final int field5061, final double[] field5062, final boolean field5063) {
        this.field5057 = field5057;
        this.field5051 = field5058;
        this.field5052 = field5059;
        this.field5053 = field5060;
        this.field5054 = field5061;
        this.field5055 = field5062;
        this.field5056 = field5063;
    }
    
    @Override
    public void run() {
        if (this.field5051 != 0) {
            if (this.field5052 != 1) {
                for (int i = this.field5053; i < Class8983.method31976(this.field5057); i += this.field5054) {
                    Class8983.method31975(this.field5057).method26090(this.field5055, i * Class8983.method31979(this.field5057), this.field5056);
                }
            }
            else {
                for (int j = this.field5053; j < Class8983.method31976(this.field5057); j += this.field5054) {
                    Class8983.method31975(this.field5057).method26082(this.field5055, j * Class8983.method31979(this.field5057));
                }
            }
        }
        else if (this.field5052 != -1) {
            for (int k = this.field5053; k < Class8983.method31976(this.field5057); k += this.field5054) {
                Class8983.method31975(this.field5057).method26078(this.field5055, k * Class8983.method31979(this.field5057), this.field5056);
            }
        }
        else {
            for (int l = this.field5053; l < Class8983.method31976(this.field5057); l += this.field5054) {
                Class8983.method31975(this.field5057).method26074(this.field5055, l * Class8983.method31979(this.field5057));
            }
        }
    }
}
