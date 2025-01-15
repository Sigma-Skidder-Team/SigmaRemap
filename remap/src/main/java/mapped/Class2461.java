// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2461 extends Class2449<Integer, String>
{
    public final /* synthetic */ Class2808 field14420;
    
    public Class2461(final Class2808 field14420, final Class5260 class5260) {
        this.field14420 = field14420;
        super(class5260);
    }
    
    public String method9791(final Class8699 class8699, final Integer n) throws Exception {
        return (n != 0) ? ((n != 1) ? ((n != 2) ? "COUNTERCLOCKWISE_90" : "CLOCKWISE_180") : "CLOCKWISE_90") : "NONE";
    }
}
