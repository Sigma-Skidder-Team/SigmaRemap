// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;

public abstract class Class3542 extends Class3446
{
    private final Class7843 field16592;
    public final /* synthetic */ Class803 field16593;
    
    private Class3542(final Class803 field16593) {
        this.field16593 = field16593;
        final Class7843 method25340 = new Class7843().method25337(12.0).method25340();
        final Class803 field16594 = this.field16593;
        field16594.getClass();
        this.field16592 = method25340.method25343(new Class163(field16594));
    }
    
    public boolean method11092() {
        final BlockPos class354 = new BlockPos(this.field16593);
        return !this.field16593.world.method6994(class354) && this.field16593.method4345(class354) >= 0.0f;
    }
    
    public boolean method11093() {
        return !this.field16593.world.method7142((Class<? extends LivingEntity>) LivingEntity.class, this.field16592, (LivingEntity)this.field16593, this.field16593.getBoundingBox().method18495(12.0, 6.0, 12.0)).isEmpty();
    }
}
