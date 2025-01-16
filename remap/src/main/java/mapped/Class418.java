// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class Class418 extends Class416
{
    private static String[] field2526;
    
    public Class418(final EntityType<? extends Class418> class7499, final World class7500) {
        super(class7499, class7500);
    }
    
    public Class418(final World class1847, final LivingEntity class1848, final double n, final double n2, final double n3) {
        super(EntityType.field29026, class1848, n, n2, n3, class1847);
    }
    
    public Class418(final World class1847, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        super(EntityType.field29026, n, n2, n3, n4, n5, n6, class1847);
    }
    
    @Override
    public void method2032(final RayTraceResult class7006) {
        super.method2032(class7006);
        if (!this.world.isRemote) {
            Label_0067: {
                if (class7006.getType() != RayTraceResult.Type.ENTITY) {
                    if (this.field2527 != null) {
                        if (this.field2527 instanceof Class759) {
                            if (!this.world.method6765().method31216(Class8878.field37316)) {
                                break Label_0067;
                            }
                        }
                    }
                    final BlockRayTraceResult class7007 = (BlockRayTraceResult)class7006;
                    final BlockPos method1149 = class7007.getPos().method1149(class7007.getFace());
                    if (this.world.method6961(method1149)) {
                        this.world.method6692(method1149, Class7521.field29289.getDefaultState());
                    }
                }
                else {
                    final Entity method1150 = ((Class7007)class7006).method21452();
                    if (!method1150.method1704()) {
                        final int method1151 = method1150.method1666();
                        method1150.setFire(5);
                        if (!method1150.attackEntityFrom(DamageSource.method25698(this, this.field2527), 5.0f)) {
                            method1150.method1665(method1151);
                        }
                        else {
                            this.method1900(this.field2527, method1150);
                        }
                    }
                }
            }
            this.method1652();
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
}
