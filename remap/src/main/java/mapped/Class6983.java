// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.util.math.BlockPos;

import java.util.HashSet;
import java.util.Set;

public class Class6983 extends Class6977
{
    private static String[] field27278;
    
    public Class6983() {
        super(Class3971.class);
    }
    
    @Override
    public Set<Class9488> method21398(final BlockPos class354, final Class7096 class355, final Class7614 class356) {
        final HashSet set = new HashSet();
        if (Class9367.method34762() == Class7906.field32452.method25613() && this.field27275.method5282() != null) {
            set.add(new Class9488(class354, new Class7096(Class7521.field29147, (ImmutableMap<IProperty<?>, Comparable<?>>)ImmutableMap.builder().build())));
            return set;
        }
        return set;
    }
}
