// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7285 implements Class7284
{
    public final /* synthetic */ Class4965 field28229;
    public final /* synthetic */ Runnable field28230;
    public final /* synthetic */ Class4965 field28231;
    
    public Class7285(final Class4965 field28231, final Class4965 field28232, final Runnable field28233) {
        this.field28231 = field28231;
        this.field28229 = field28232;
        this.field28230 = field28233;
    }
    
    @Override
    public void method22343(final Object obj) {
        if (!(obj instanceof byte[])) {
            if (!(obj instanceof String)) {
                Class4965.method15024().warning("Unexpected data: " + obj);
            }
            else {
                this.field28229.method15021((String)obj, this.field28230);
            }
        }
        else {
            this.field28229.method15020((byte[])obj, this.field28230);
        }
    }
}
