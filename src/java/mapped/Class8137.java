// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8137 implements Class8138
{
    public final /* synthetic */ Class4965 field33528;
    public final /* synthetic */ Class4965 field33529;
    
    public Class8137(final Class4965 field33529, final Class4965 field33530) {
        this.field33529 = field33529;
        this.field33528 = field33530;
    }
    
    @Override
    public boolean method26817(final Class8437 class8437, final int n, final int n2) {
        if (Class4965.method15027(this.field33528) == Class2086.field12060) {
            Class4965.method15028(this.field33528);
        }
        if (!"close".equals(class8437.field34678)) {
            Class4965.method15030(this.field33528, class8437);
            return true;
        }
        Class4965.method15029(this.field33528);
        return false;
    }
}
