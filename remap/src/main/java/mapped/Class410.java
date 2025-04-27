// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class Class410 extends Class409
{
    private static String[] field2507;
    
    public Class410(final EntityType<? extends Class410> class7499, final World class7500) {
        super(class7499, class7500);
    }
    
    public Class410(final World class1847, final LivingEntity class1848) {
        super(EntityType.field29036, class1848, class1847);
    }
    
    public Class410(final World class1847, final double n, final double n2, final double n3) {
        super(EntityType.field29036, n, n2, n3, class1847);
    }
    
    @Override
    public void method1798(final byte b) {
        if (b == 3) {
            for (int i = 0; i < 8; ++i) {
                this.world.addParticle(new Class6910(Class8432.field34629, this.method2005()), this.getPosX(), this.getPosY(), this.getPosZ(), (this.rand.nextFloat() - 0.5) * 0.08, (this.rand.nextFloat() - 0.5) * 0.08, (this.rand.nextFloat() - 0.5) * 0.08);
            }
        }
    }
    
    @Override
    public void method2016(final RayTraceResult class7006) {
        if (class7006.getType() == RayTraceResult.Type.ENTITY) {
            ((EntityRayTraceResult)class7006).getEntity().attackEntityFrom(DamageSource.method25699(this, this.method2019()), 0.0f);
        }
        if (!this.world.isRemote) {
            if (this.rand.nextInt(8) == 0) {
                int n = 1;
                if (this.rand.nextInt(32) == 0) {
                    n = 4;
                }
                for (int i = 0; i < n; ++i) {
                    final Class818 class7007 = EntityType.field28966.method23371(this.world);
                    class7007.method4354(-24000);
                    class7007.method1730(this.getPosX(), this.getPosY(), this.getPosZ(), this.rotationYaw, 0.0f);
                    this.world.method6886(class7007);
                }
            }
            this.world.method6761(this, (byte)3);
            this.method1652();
        }
    }
    
    @Override
    public Item method2013() {
        return Items.field31374;
    }
}
