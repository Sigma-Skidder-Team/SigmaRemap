// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

public class Class5530 extends Class5528
{
    public Class5530() {
        super(EntityType.field29004, "spawner_minecart", 0.5f);
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4708 class5902 = new Class4708(Minecraft.getInstance().method5306());
        if (Class9570.field41576.method22634()) {
            Class9570.method35837(class5902, Class9570.field41576, class5901);
            class5902.field20284 = field20284;
            return (Class9559)class5902;
        }
        Config.warn("Field not found: RenderMinecart.modelMinecart");
        return null;
    }
}
