// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;

public abstract class Class4748<T extends Class827, M extends Class5863<T>> extends Class4746<T, M>
{
    private static final ResourceLocation field20370;
    
    public Class4748(final Class8551 class8551, final M m, final M i, final M j) {
        super(class8551, m, 0.5f);
        this.method13978((Class1799<T, M>)new Class1835((Class4778<LivingEntity, Class5853>)this, i, j));
    }
    
    public ResourceLocation method14083(final Class827 class827) {
        return Class4748.field20370;
    }
    
    public void method14084(final T t, final MatrixStack class7351, final float n, float n2, final float n3) {
        if (t.method4923()) {
            n2 += (float)(Math.cos(t.ticksExisted * 3.25) * 3.141592653589793 * 0.25);
        }
        super.method13985(t, class7351, n, n2, n3);
    }
    
    static {
        field20370 = new ResourceLocation("textures/entity/zombie/zombie.png");
    }
}
