// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;

public class Class4754 extends Class4746<Class780, Class5854<Class780>>
{
    private static final ResourceLocation field20377;
    
    public Class4754(final Class8551 class8551) {
        super(class8551, new Class5854(), 0.5f);
        this.method13978(new Class1823<Class780, Class5854<Class780>>(this));
        this.method13978((Class1799<Class780, Class5854<Class780>>)new Class1835((Class4778<LivingEntity, Class5853>)this, new Class5854(0.5f, true), new Class5854(1.0f, true)));
    }
    
    public ResourceLocation method14091(final Class780 class780) {
        return Class4754.field20377;
    }
    
    static {
        field20377 = new ResourceLocation("textures/entity/skeleton/skeleton.png");
    }
}
