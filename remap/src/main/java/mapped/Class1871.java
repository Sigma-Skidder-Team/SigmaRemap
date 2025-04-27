// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class Class1871 extends Class1868
{
    private static String[] field10201;
    private final Class8910 field10202;
    private static final Set<Biome> field10203;
    
    public Class1871(final Class5469 class5469) {
        super(Class1871.field10203);
        this.field10202 = Class7983.method26036(class5469.method16706(), class5469.method16707(), class5469.method16708());
    }
    
    @Override
    public Biome method6960(final int n, final int n2, final int n3) {
        return this.field10202.method31393(n, n3);
    }
    
    static {
        field10203 = (Set)ImmutableSet.of(Class7102.field27631, Class7102.field27633, Class7102.field27634, Class7102.field27635, Class7102.field27636, Class7102.field27637, (Object[])new Biome[] { Class7102.field27638, Class7102.field27639, Class7102.field27642, Class7102.field27643, Class7102.field27644, Class7102.field27645, Class7102.field27646, Class7102.field27647, Class7102.field27648, Class7102.field27649, Class7102.field27650, Class7102.field27651, Class7102.field27652, Class7102.field27653, Class7102.field27654, Class7102.field27655, Class7102.field27656, Class7102.field27657, Class7102.field27658, Class7102.field27659, Class7102.field27660, Class7102.field27661, Class7102.field27662, Class7102.field27663, Class7102.field27664, Class7102.field27665, Class7102.field27666, Class7102.field27667, Class7102.field27668, Class7102.field27669, Class7102.field27670, Class7102.field27671, Class7102.field27676, Class7102.field27677, Class7102.field27678, Class7102.field27679, Class7102.field27680, Class7102.field27681, Class7102.field27682, Class7102.field27684, Class7102.field27685, Class7102.field27686, Class7102.field27687, Class7102.field27688, Class7102.field27689, Class7102.field27690, Class7102.field27691, Class7102.field27692, Class7102.field27693, Class7102.field27694, Class7102.field27695, Class7102.field27696, Class7102.field27697, Class7102.field27698, Class7102.field27699, Class7102.field27700, Class7102.field27701, Class7102.field27702, Class7102.field27703, Class7102.field27704 });
    }
}
