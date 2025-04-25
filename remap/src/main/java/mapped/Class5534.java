// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

public class Class5534 extends Class5533
{
    public Class5534() {
        super(EntityType.field28964, "cat", 0.4f);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5926<Object>(0.0f);
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4732 class5902 = new Class4732(Minecraft.getInstance().method5306());
        class5902.field20301 = (M)class5901;
        class5902.field20284 = field20284;
        return (Class9559)class5902;
    }
}
