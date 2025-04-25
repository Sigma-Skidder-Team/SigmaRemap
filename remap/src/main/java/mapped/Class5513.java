// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

public class Class5513 extends Class5509
{
    public Class5513() {
        super(EntityType.field29011, "parrot", 0.3f);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5869();
    }
    
    @Override
    public Class6300 method16812(final Class5901 class5901, final String s) {
        if (!(class5901 instanceof Class5869)) {
            return null;
        }
        final Class5869 class5902 = (Class5869)class5901;
        if (s.equals("body")) {
            return (Class6300)Class9570.method35831(class5902, Class9570.field41512, 0);
        }
        if (s.equals("tail")) {
            return (Class6300)Class9570.method35831(class5902, Class9570.field41512, 1);
        }
        if (s.equals("left_wing")) {
            return (Class6300)Class9570.method35831(class5902, Class9570.field41512, 2);
        }
        if (s.equals("right_wing")) {
            return (Class6300)Class9570.method35831(class5902, Class9570.field41512, 3);
        }
        if (s.equals("head")) {
            return (Class6300)Class9570.method35831(class5902, Class9570.field41512, 4);
        }
        if (!s.equals("left_leg")) {
            return s.equals("right_leg") ? ((Class6300)Class9570.method35831(class5902, Class9570.field41512, 10)) : null;
        }
        return (Class6300)Class9570.method35831(class5902, Class9570.field41512, 9);
    }
    
    @Override
    public String[] method16813() {
        return new String[] { "body", "tail", "left_wing", "right_wing", "head", "left_leg", "right_leg" };
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4715 class5902 = new Class4715(Minecraft.getInstance().method5306());
        class5902.field20301 = (M)class5901;
        class5902.field20284 = field20284;
        return (Class9559)class5902;
    }
}
