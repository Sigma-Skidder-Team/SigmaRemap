// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

public class Class5582 extends Class5509
{
    public Class5582() {
        super(EntityType.field28995, "lead_knot", 0.0f);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5892<Object>();
    }
    
    @Override
    public Class6300 method16812(final Class5901 class5901, final String s) {
        if (class5901 instanceof Class5892) {
            final Class5892 class5902 = (Class5892)class5901;
            return s.equals("knot") ? ((Class6300)Class9570.field41497.method22631(class5902)) : null;
        }
        return null;
    }
    
    @Override
    public String[] method16813() {
        return new String[] { "knot" };
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4707 class5902 = new Class4707(Minecraft.method5277().method5306());
        if (Class9570.field41499.method22634()) {
            Class9570.method35837(class5902, Class9570.field41499, class5901);
            class5902.field20284 = field20284;
            return (Class9559)class5902;
        }
        Config.warn("Field not found: RenderLeashKnot.leashKnotModel");
        return null;
    }
}
