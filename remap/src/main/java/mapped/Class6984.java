// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashSet;
import java.util.Set;

public class Class6984 extends Class6977
{
    private static String[] field27274;
    
    public Class6984() {
        super(Class3865.class);
    }
    
    @Override
    public Set<Class9488> method21398(final BlockPos class354, final Class7096 class355, final Class7614 class356) {
        final HashSet set = new HashSet();
        final Class7096 method6701 = Class869.method5277().field4683.getBlockState(class354);
        if (method6701.method21696() instanceof Class3865) {
            set.add(new Class9488(class354, method6701));
        }
        return set;
    }
}
