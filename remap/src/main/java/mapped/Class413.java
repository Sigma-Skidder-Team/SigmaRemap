// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.World;

public class Class413 extends Class409
{
    private static String[] field2511;
    
    public Class413(final EntityType<? extends Class413> class7499, final World class7500) {
        super(class7499, class7500);
    }
    
    public Class413(final World class1847, final LivingEntity class1848) {
        super(EntityType.field29038, class1848, class1847);
    }
    
    public Class413(final World class1847, final double n, final double n2, final double n3) {
        super(EntityType.field29038, n, n2, n3, class1847);
    }
    
    @Override
    public Class3820 method2013() {
        return Class7739.field31510;
    }
    
    @Override
    public float method2018() {
        return 0.07f;
    }
    
    @Override
    public void method2016(final Class7006 class7006) {
        if (!this.world.field10067) {
            this.world.method6955(2002, new BlockPos(this), Class5333.method16472(Class8644.field36251));
            int i = 3 + this.world.field10062.nextInt(5) + this.world.field10062.nextInt(5);
            while (i > 0) {
                final int method2609 = Class508.method2609(i);
                i -= method2609;
                this.world.method6886(new Class508(this.world, this.getPosX(), this.getPosY(), this.getPosZ(), method2609));
            }
            this.method1652();
        }
    }
}
