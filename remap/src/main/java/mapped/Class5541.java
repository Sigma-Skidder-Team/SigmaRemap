// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

public class Class5541 extends Class5538
{
    public Class5541() {
        super(EntityType.field28980, "evoker", 0.5f, new String[] { "evocation_illager" });
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5851<Object>(0.0f, 0.0f, 64, 64);
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4726 class5902 = new Class4726(Minecraft.getInstance().method5306());
        class5902.field20301 = (M)class5901;
        class5902.field20284 = field20284;
        return (Class9559)class5902;
    }
}
