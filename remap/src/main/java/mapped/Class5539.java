// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

public class Class5539 extends Class5538
{
    public Class5539() {
        super(EntityType.field28991, "illusioner", 0.5f, new String[] { "illusion_illager" });
    }
    
    @Override
    public Class5901 method16811() {
        final Class5851 class5851 = new Class5851(0.0f, 0.0f, 64, 64);
        class5851.method17576().field25187 = true;
        return class5851;
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4727 class5902 = new Class4727(Minecraft.getInstance().method5306());
        class5902.field20301 = (M)class5901;
        class5902.field20284 = field20284;
        return (Class9559)class5902;
    }
}
