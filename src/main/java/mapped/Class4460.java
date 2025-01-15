// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Comparator;

public class Class4460 implements Comparator<Class9035>
{
    private static String[] field19813;
    public final /* synthetic */ Class9147 field19814;
    
    public Class4460(final Class9147 field19814) {
        this.field19814 = field19814;
    }
    
    @Override
    public int compare(final Class9035 class9035, final Class9035 class9036) {
        return (int)(class9035.method32470() + class9035.method32477() - (class9036.method32470() + class9036.method32477()));
    }
}
