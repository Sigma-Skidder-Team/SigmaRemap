// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

public class Class5561 extends Class5509
{
    public Class5561() {
        super(EntityType.field29021, "shulker_bullet", 0.0f);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5887<Object>();
    }
    
    @Override
    public Class6300 method16812(final Class5901 class5901, final String s) {
        if (class5901 instanceof Class5887) {
            final Class5887 class5902 = (Class5887)class5901;
            return s.equals("bullet") ? ((Class6300)Class9570.field41530.method22631(class5902)) : null;
        }
        return null;
    }
    
    @Override
    public String[] method16813() {
        return new String[] { "bullet" };
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4798 class5902 = new Class4798(Minecraft.method5277().method5306());
        if (Class9570.field41578.method22634()) {
            Class9570.method35837(class5902, Class9570.field41578, class5901);
            class5902.field20284 = field20284;
            return (Class9559)class5902;
        }
        Config.warn("Field not found: RenderShulkerBullet.model");
        return null;
    }
}
