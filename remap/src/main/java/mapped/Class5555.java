// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

public class Class5555 extends Class5543
{
    public Class5555() {
        super(EntityType.field29014, "zombie_pigman", 0.5f);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5863<Object>(0.0f, false);
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4752 class5902 = new Class4752(Minecraft.getInstance().method5306());
        class5902.field20301 = (M)class5901;
        class5902.field20284 = field20284;
        return (Class9559)class5902;
    }
}
