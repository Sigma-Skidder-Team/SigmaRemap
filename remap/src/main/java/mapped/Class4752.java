// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;

public class Class4752 extends Class4746<Class828, Class5863<Class828>>
{
    private static final ResourceLocation field20374;
    
    public Class4752(final Class8551 class8551) {
        super(class8551, new Class5863(0.0f, false), 0.5f);
        this.method13978((Class1799<Class828, Class5863<Class828>>)new Class1835(this, new Class5863(0.5f, true), new Class5863(1.0f, true)));
    }
    
    public ResourceLocation method14087(final Class828 class828) {
        return Class4752.field20374;
    }
    
    static {
        field20374 = new ResourceLocation("textures/entity/zombie_pigman.png");
    }
}
