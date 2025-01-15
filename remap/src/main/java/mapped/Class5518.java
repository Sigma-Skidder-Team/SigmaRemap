// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

public class Class5518 extends Class5515
{
    public Class5518() {
        super(EntityType.field28968, "cow", 0.7f);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5931<Object>();
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4728 class5902 = new Class4728(Class869.method5277().method5306());
        class5902.field20301 = (M)class5901;
        class5902.field20284 = field20284;
        return (Class9559)class5902;
    }
}
