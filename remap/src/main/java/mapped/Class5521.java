// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

public class Class5521 extends Class5515
{
    public Class5521() {
        super(EntityType.field29007, "mooshroom", 0.7f);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5931<Object>();
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4713 class5902 = new Class4713(Minecraft.getInstance().method5306());
        class5902.field20301 = (M)class5901;
        class5902.field20284 = field20284;
        return (Class9559)class5902;
    }
}
