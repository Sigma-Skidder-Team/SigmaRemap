// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashSet;
import java.util.Set;

public class Class6979 extends Class6977
{
    private static String[] field27274;
    
    public Class6979() {
        super(Class3916.class);
    }
    
    @Override
    public Set<Class9488> method21399(final BlockPos class354, final BlockState class355, final Class7614 class356) {
        final HashSet set = new HashSet();
        set.add(new Class9488(class354, ((StateHolder<O, BlockState>)class355).with(Class3916.field17734, Class3916.method12024(class355, Minecraft.method5277().world, class354))));
        return set;
    }
}
