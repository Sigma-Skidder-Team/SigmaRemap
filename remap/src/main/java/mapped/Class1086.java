// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1086 implements Runnable
{
    private static String[] field5862;
    public final /* synthetic */ int field5863;
    public final /* synthetic */ int field5864;
    public final /* synthetic */ int field5865;
    public final /* synthetic */ double[] field5866;
    public final /* synthetic */ boolean field5867;
    public final /* synthetic */ Class4406 field5868;
    
    public Class1086(final Class4406 field5868, final int field5869, final int field5870, final int field5871, final double[] field5872, final boolean field5873) {
        this.field5868 = field5868;
        this.field5863 = field5869;
        this.field5864 = field5870;
        this.field5865 = field5871;
        this.field5866 = field5872;
        this.field5867 = field5873;
    }
    
    @Override
    public void run() {
        if (this.field5863 != -1) {
            for (int i = this.field5864; i < Class4406.method13334(this.field5868); i += this.field5865) {
                Class4406.method13333(this.field5868).method30727(this.field5866, i * Class4406.method13332(this.field5868), this.field5867);
            }
        }
        else {
            for (int j = this.field5864; j < Class4406.method13334(this.field5868); j += this.field5865) {
                Class4406.method13333(this.field5868).method30723(this.field5866, j * Class4406.method13332(this.field5868), this.field5867);
            }
        }
    }
}
