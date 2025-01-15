// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

public class Class5550 extends Class5549
{
    public Class5550() {
        super(EntityType.field28987, "giant", 3.0f);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5865();
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4719 class5902 = new Class4719(Class869.method5277().method5306(), 6.0f);
        class5902.field20301 = (M)class5901;
        class5902.field20284 = field20284;
        return (Class9559)class5902;
    }
}
