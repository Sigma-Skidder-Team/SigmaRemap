// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class Class411 extends Class409
{
    private static String[] field2508;
    
    public Class411(final EntityType<? extends Class411> class7499, final World class7500) {
        super(class7499, class7500);
    }
    
    public Class411(final World class1847, final LivingEntity class1848) {
        super(EntityType.field29028, class1848, class1847);
    }
    
    public Class411(final World class1847, final double n, final double n2, final double n3) {
        super(EntityType.field29028, n, n2, n3, class1847);
    }
    
    @Override
    public Item method2013() {
        return Items.field31355;
    }
    
    private IParticleData method2017() {
        final ItemStack method2014 = this.method2014();
        return method2014.method27620() ? Class8432.field34631 : new Class6910(Class8432.field34629, method2014);
    }
    
    @Override
    public void method1798(final byte b) {
        if (b == 3) {
            final IParticleData method2017 = this.method2017();
            for (int i = 0; i < 8; ++i) {
                this.world.addParticle(method2017, this.getPosX(), this.getPosY(), this.getPosZ(), 0.0, 0.0, 0.0);
            }
        }
    }
    
    @Override
    public void method2016(final RayTraceResult class7006) {
        if (class7006.getType() == RayTraceResult.Type.ENTITY) {
            final Entity method21452 = ((EntityRayTraceResult)class7006).getEntity();
            method21452.attackEntityFrom(DamageSource.method25699(this, this.method2019()), (method21452 instanceof Class849) ? 3 : 0);
        }
        if (!this.world.isRemote) {
            this.world.method6761(this, (byte)3);
            this.method1652();
        }
    }
}
