// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class2459 extends Class2449<String, String>
{
    public final /* synthetic */ Class2828 field14417;
    
    public Class2459(final Class2828 field14417, final Class5260 class5260) {
        this.field14417 = field14417;
        super(class5260);
    }
    
    public String method9795(final Class8699 class8699, final String s) {
        return s.startsWith("/") ? s.substring(1) : s;
    }
}
