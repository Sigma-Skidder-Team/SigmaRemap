// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

public class Class5551 extends Class5549
{
    public Class5551() {
        super(EntityType.field28973, "drowned", 0.5f);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5864<Object>(0.0f, 0.0f, 64, 64);
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4751 class5902 = new Class4751(Class869.method5277().method5306());
        class5902.field20301 = (M)class5901;
        class5902.field20284 = field20284;
        return (Class9559)class5902;
    }
}
