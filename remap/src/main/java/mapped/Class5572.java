// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

public class Class5572 extends Class5509
{
    public Class5572() {
        super(EntityType.field28966, "chicken", 0.3f);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5930<Object>();
    }
    
    @Override
    public Class6300 method16812(final Class5901 class5901, final String s) {
        if (!(class5901 instanceof Class5930)) {
            return null;
        }
        final Class5930 class5902 = (Class5930)class5901;
        if (s.equals("head")) {
            return (Class6300)Class9570.field41461.method21625(class5902, 0);
        }
        if (s.equals("body")) {
            return (Class6300)Class9570.field41461.method21625(class5902, 1);
        }
        if (s.equals("right_leg")) {
            return (Class6300)Class9570.field41461.method21625(class5902, 2);
        }
        if (s.equals("left_leg")) {
            return (Class6300)Class9570.field41461.method21625(class5902, 3);
        }
        if (s.equals("right_wing")) {
            return (Class6300)Class9570.field41461.method21625(class5902, 4);
        }
        if (s.equals("left_wing")) {
            return (Class6300)Class9570.field41461.method21625(class5902, 5);
        }
        if (!s.equals("bill")) {
            return s.equals("chin") ? ((Class6300)Class9570.field41461.method21625(class5902, 7)) : null;
        }
        return (Class6300)Class9570.field41461.method21625(class5902, 6);
    }
    
    @Override
    public String[] method16813() {
        return new String[] { "head", "body", "right_leg", "left_leg", "right_wing", "left_wing", "bill", "chin" };
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4743 class5902 = new Class4743(Minecraft.getInstance().method5306());
        class5902.field20301 = (M)class5901;
        class5902.field20284 = field20284;
        return (Class9559)class5902;
    }
}
