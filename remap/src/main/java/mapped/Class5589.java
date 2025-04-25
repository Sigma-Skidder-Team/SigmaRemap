// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

public class Class5589 extends Class5509
{
    public Class5589() {
        super(EntityType.field29043, "iron_golem", 0.5f);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5874<Object>();
    }
    
    @Override
    public Class6300 method16812(final Class5901 class5901, final String s) {
        if (!(class5901 instanceof Class5874)) {
            return null;
        }
        final Class5874 class5902 = (Class5874)class5901;
        if (s.equals("head")) {
            return (Class6300)Class9570.field41493.method21625(class5902, 0);
        }
        if (s.equals("body")) {
            return (Class6300)Class9570.field41493.method21625(class5902, 1);
        }
        if (s.equals("right_arm")) {
            return (Class6300)Class9570.field41493.method21625(class5902, 2);
        }
        if (s.equals("left_arm")) {
            return (Class6300)Class9570.field41493.method21625(class5902, 3);
        }
        if (!s.equals("left_leg")) {
            return s.equals("right_leg") ? ((Class6300)Class9570.field41493.method21625(class5902, 5)) : null;
        }
        return (Class6300)Class9570.field41493.method21625(class5902, 4);
    }
    
    @Override
    public String[] method16813() {
        return new String[] { "head", "body", "right_arm", "left_arm", "left_leg", "right_leg" };
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4740 class5902 = new Class4740(Minecraft.getInstance().method5306());
        class5902.field20301 = (M)class5901;
        class5902.field20284 = field20284;
        return (Class9559)class5902;
    }
}
