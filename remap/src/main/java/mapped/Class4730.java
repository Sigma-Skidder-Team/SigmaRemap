// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Vec3d;

import java.util.Random;

public class Class4730 extends Class4712<Class850, Class5868<Class850>>
{
    private static final ResourceLocation field20332;
    private final Random field20333;
    
    public Class4730(final Class8551 class8551) {
        super(class8551, new Class5868(0.0f), 0.5f);
        this.field20333 = new Random();
        this.method13978((Class1799<Class850, Class5868<Class850>>)new Class1839((Class4778<LivingEntity, Class5868<LivingEntity>>)this));
        this.method13978(new Class1833(this));
    }
    
    public void method14043(final Class850 class850, final float n, final float n2, final MatrixStack class851, final IRenderTypeBuffer class852, final int n3) {
        final BlockState method5080 = class850.method5080();
        final Class5868 class853 = ((Class4710<T, Class5868>)this).method13979();
        class853.field24042 = (method5080 != null);
        class853.field24043 = class850.method5081();
        super.method14006(class850, n, n2, class851, class852, n3);
    }
    
    public Vec3d method14044(final Class850 class850, final float n) {
        if (!class850.method5081()) {
            return super.method13955((T)class850, n);
        }
        return new Vec3d(this.field20333.nextGaussian() * 0.02, 0.0, this.field20333.nextGaussian() * 0.02);
    }
    
    public ResourceLocation method14045(final Class850 class850) {
        return Class4730.field20332;
    }
    
    static {
        field20332 = new ResourceLocation("textures/entity/enderman/enderman.png");
    }
}
