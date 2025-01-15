// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

public class Class5512 extends Class5509
{
    public Class5512() {
        super(EntityType.field29027, "snow_golem", 0.5f);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5894<Object>();
    }
    
    @Override
    public Class6300 method16812(final Class5901 class5901, final String s) {
        if (!(class5901 instanceof Class5894)) {
            return null;
        }
        final Class5894 class5902 = (Class5894)class5901;
        if (s.equals("body")) {
            return (Class6300)Class9570.field41541.method21625(class5902, 0);
        }
        if (s.equals("body_bottom")) {
            return (Class6300)Class9570.field41541.method21625(class5902, 1);
        }
        if (s.equals("head")) {
            return (Class6300)Class9570.field41541.method21625(class5902, 2);
        }
        if (!s.equals("right_hand")) {
            return s.equals("left_hand") ? ((Class6300)Class9570.field41541.method21625(class5902, 4)) : null;
        }
        return (Class6300)Class9570.field41541.method21625(class5902, 3);
    }
    
    @Override
    public String[] method16813() {
        return new String[] { "body", "body_bottom", "head", "right_hand", "left_hand" };
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4721 class5902 = new Class4721(Class869.method5277().method5306());
        class5902.field20301 = (M)class5901;
        class5902.field20284 = field20284;
        return (Class9559)class5902;
    }
}
