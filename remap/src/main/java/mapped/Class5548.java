// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

public class Class5548 extends Class5543
{
    public Class5548() {
        super(EntityType.field28990, "husk", 0.5f);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5863<Object>(0.0f, false);
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4750 class5902 = new Class4750(Minecraft.getInstance().method5306());
        class5902.field20301 = (M)class5901;
        class5902.field20284 = field20284;
        return (Class9559)class5902;
    }
}
