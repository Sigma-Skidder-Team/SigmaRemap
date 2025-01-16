// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

public class Class5585 extends Class5584
{
    public Class5585() {
        super(EntityType.field29047, "witch", 0.5f);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5857<Object>(0.0f);
    }
    
    @Override
    public Class6300 method16812(final Class5901 class5901, final String s) {
        if (class5901 instanceof Class5857) {
            final Class5857 class5902 = (Class5857)class5901;
            return (Class6300)(s.equals("mole") ? Class9570.method35828(class5902, Class9570.field41559) : super.method16812(class5902, s));
        }
        return null;
    }
    
    @Override
    public String[] method16813() {
        return (String[]) Config.method28982(super.method16813(), "mole");
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4716 class5902 = new Class4716(Class869.method5277().method5306());
        class5902.field20301 = (M)class5901;
        class5902.field20284 = field20284;
        return (Class9559)class5902;
    }
}
