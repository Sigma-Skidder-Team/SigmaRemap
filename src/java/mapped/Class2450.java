// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2450 extends Class2449<Integer, String>
{
    public final /* synthetic */ Class2808 field14407;
    
    public Class2450(final Class2808 field14407, final Class5260 class5260) {
        this.field14407 = field14407;
        super(class5260);
    }
    
    public String method9791(final Class8699 class8699, final Integer n) throws Exception {
        return (n != 0) ? ((n != 1) ? ((n != 2) ? "DATA" : "CORNER") : "LOAD") : "SAVE";
    }
}
