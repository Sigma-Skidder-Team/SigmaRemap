// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

public class Class5546 extends Class5543
{
    public Class5546() {
        super(EntityType.field29041, "vex", 0.3f);
    }
    
    @Override
    public Class6300 method16812(final Class5901 class5901, final String s) {
        if (!(class5901 instanceof Class5861)) {
            return null;
        }
        final Class6300 method16812 = super.method16812(class5901, s);
        if (method16812 != null) {
            return method16812;
        }
        final Class5861 class5902 = (Class5861)class5901;
        if (!s.equals("left_wing")) {
            return s.equals("right_wing") ? ((Class6300)Class9570.method35828(class5902, Class9570.field41555)) : null;
        }
        return (Class6300)Class9570.method35828(class5902, Class9570.field41554);
    }
    
    @Override
    public String[] method16813() {
        return (String[])Class8571.method28984(super.method16813(), new String[] { "left_wing", "right_wing" });
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5861();
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4753 class5902 = new Class4753(Class869.method5277().method5306());
        class5902.field20301 = (M)class5901;
        class5902.field20284 = field20284;
        return (Class9559)class5902;
    }
}
