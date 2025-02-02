// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class Class417 extends Class416
{
    public int field2525;
    
    public Class417(final EntityType<? extends Class417> class7499, final World class7500) {
        super(class7499, class7500);
        this.field2525 = 1;
    }
    
    public Class417(final World class1847, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        super(EntityType.field28994, n, n2, n3, n4, n5, n6, class1847);
        this.field2525 = 1;
    }
    
    public Class417(final World class1847, final LivingEntity class1848, final double n, final double n2, final double n3) {
        super(EntityType.field28994, class1848, n, n2, n3, class1847);
        this.field2525 = 1;
    }
    
    @Override
    public void method2032(final RayTraceResult class7006) {
        super.method2032(class7006);
        if (!this.world.isRemote) {
            if (class7006.getType() == RayTraceResult.Type.ENTITY) {
                final Entity method21452 = ((EntityRayTraceResult)class7006).getEntity();
                method21452.attackEntityFrom(DamageSource.method25698(this, this.field2527), 6.0f);
                this.method1900(this.field2527, method21452);
            }
            final boolean method21453 = this.world.method6765().method31216(Class8878.field37316);
            this.world.method6723(null, this.getPosX(), this.getPosY(), this.getPosZ(), (float)this.field2525, method21453, method21453 ? Explosion.Mode.field13367 : Explosion.Mode.field13365);
            this.method1652();
        }
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        super.method1761(class51);
        class51.putInt("ExplosionPower", this.field2525);
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        super.method1760(class51);
        if (class51.contains("ExplosionPower", 99)) {
            this.field2525 = class51.getInt("ExplosionPower");
        }
    }
}
