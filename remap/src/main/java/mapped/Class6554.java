// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6554
{
    private static String[] field26040;
    private Class7771[] field26041;
    private boolean field26042;
    
    public Class6554() {
        this.field26041 = new Class7771[0];
        this.field26042 = false;
    }
    
    public void method19859(final Class5853 class5853, final AbstractClientPlayerEntity class5854, final MatrixStack class5855, final IRenderTypeBuffer class5856, final int n, final int n2) {
        if (this.field26042) {
            for (int i = 0; i < this.field26041.length; ++i) {
                this.field26041[i].method24880(class5853, class5854, class5855, class5856, n, n2);
            }
        }
    }
    
    public boolean method19860() {
        return this.field26042;
    }
    
    public void method19861(final boolean field26042) {
        this.field26042 = field26042;
    }
    
    public Class7771[] method19862() {
        return this.field26041;
    }
    
    public void method19863(final Class7771 class7771) {
        this.field26041 = (Class7771[]) Config.method28982(this.field26041, class7771);
    }
}
