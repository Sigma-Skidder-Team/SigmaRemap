// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

import java.util.List;

public class Class420 extends Class419
{
    private static String[] field2533;
    
    public Class420(final EntityType<? extends Class420> class7499, final World class7500) {
        super(class7499, class7500);
    }
    
    public Class420(final World class1847, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        super(EntityType.field28972, n, n2, n3, n4, n5, n6, class1847);
    }
    
    public Class420(final World class1847, final LivingEntity class1848, final double n, final double n2, final double n3) {
        super(EntityType.field28972, class1848, n, n2, n3, class1847);
    }
    
    @Override
    public void method2032(final Class7006 class7006) {
        super.method2032(class7006);
        if (class7006.method21449() != Class2165.field12882 || !((Class7007)class7006).method21452().method1843(this.field2527)) {
            if (!this.world.isRemote) {
                final List<Entity> method7128 = this.world.method7128((Class<? extends Entity>) LivingEntity.class, this.getBoundingBox().method18495(4.0, 2.0, 4.0));
                final Class426 class7007 = new Class426(this.world, this.getPosX(), this.getPosY(), this.getPosZ());
                class7007.method2097(this.field2527);
                class7007.method2089(Class8432.field34605);
                class7007.method2081(3.0f);
                class7007.method2093(600);
                class7007.method2095((7.0f - class7007.method2082()) / class7007.method2092());
                class7007.method2085(new Class1948(Class9439.field40480, 1, 1));
                if (!method7128.isEmpty()) {
                    for (final LivingEntity class7008 : method7128) {
                        if (this.method1734(class7008) >= 16.0) {
                            continue;
                        }
                        class7007.setPosition(class7008.getPosX(), class7008.getPosY(), class7008.getPosZ());
                        break;
                    }
                }
                this.world.method6955(2006, new BlockPos(this), 0);
                this.world.method6886(class7007);
                this.method1652();
            }
        }
    }
    
    @Override
    public boolean method1749() {
        return false;
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource class7929, final float n) {
        return false;
    }
    
    @Override
    public IParticleData method2034() {
        return Class8432.field34605;
    }
    
    @Override
    public boolean method2033() {
        return false;
    }
}
