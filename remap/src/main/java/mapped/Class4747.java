// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;

public class Class4747 extends Class4746<Class826, Class5859<Class826>>
{
    private static final ResourceLocation field20369;
    
    public Class4747(final Class8551 class8551, final Class6580 class8552) {
        super(class8551, new Class5859(0.0f, false), 0.5f);
        this.method13978((Class1799<Class826, Class5859<Class826>>)new Class1835((Class4778<LivingEntity, Class5853>)this, new Class5859(0.5f, true), new Class5859(1.0f, true)));
        this.method13978(new Class1798<Class826, Class5859<Class826>>(this, class8552, "zombie_villager"));
    }
    
    public ResourceLocation method14081(final Class826 class826) {
        return Class4747.field20369;
    }
    
    public void method14082(final Class826 class826, final MatrixStack class827, final float n, float n2, final float n3) {
        if (class826.method4913()) {
            n2 += (float)(Math.cos(class826.ticksExisted * 3.25) * 3.141592653589793 * 0.25);
        }
        super.method13985(class826, class827, n, n2, n3);
    }
    
    static {
        field20369 = new ResourceLocation("textures/entity/zombie_villager/zombie_villager.png");
    }
}
