// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

public class Class5566 extends Class5509
{
    public Class5566() {
        super(EntityType.field28979, "evoker_fangs", 0.0f, new String[] { "evocation_fangs" });
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5897<Object>();
    }
    
    @Override
    public Class6300 method16812(final Class5901 class5901, final String s) {
        if (!(class5901 instanceof Class5897)) {
            return null;
        }
        final Class5897 class5902 = (Class5897)class5901;
        if (s.equals("base")) {
            return (Class6300)Class9570.method35831(class5902, Class9570.field41476, 0);
        }
        if (!s.equals("upper_jaw")) {
            return s.equals("lower_jaw") ? ((Class6300)Class9570.method35831(class5902, Class9570.field41476, 2)) : null;
        }
        return (Class6300)Class9570.method35831(class5902, Class9570.field41476, 1);
    }
    
    @Override
    public String[] method16813() {
        return new String[] { "base", "upper_jaw", "lower_jaw" };
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4795 class5902 = new Class4795(Class869.method5277().method5306());
        if (Class9570.field41570.method22634()) {
            Class9570.method35837(class5902, Class9570.field41570, class5901);
            class5902.field20284 = field20284;
            return (Class9559)class5902;
        }
        Class8571.method28848("Field not found: RenderEvokerFangs.model");
        return null;
    }
}
