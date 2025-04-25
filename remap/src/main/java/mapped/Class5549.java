// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

public class Class5549 extends Class5543
{
    public Class5549() {
        super(EntityType.field29052, "zombie", 0.5f);
    }
    
    public Class5549(final EntityType class7499, final String s, final float n) {
        super(class7499, s, n);
    }
    
    @Override
    public Class5901 method16811() {
        return new Class5863<Object>(0.0f, false);
    }
    
    @Override
    public Class9559 method16814(final Class5901 class5901, final float field20284) {
        final Class4749 class5902 = new Class4749(Minecraft.getInstance().method5306());
        class5902.field20301 = (M)class5901;
        class5902.field20284 = field20284;
        return (Class9559)class5902;
    }
}
