// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public abstract class ShoulderRidingEntity extends Class794
{
    private int field4246;
    
    public ShoulderRidingEntity(final EntityType<? extends ShoulderRidingEntity> class7499, final World class7500) {
        super(class7499, class7500);
    }
    
    public boolean method4492(final Class513 class513) {
        final CompoundNBT class514 = new CompoundNBT();
        class514.putString("id", this.method1759());
        this.method1756(class514);
        if (!class513.method2886(class514)) {
            return false;
        }
        this.method1652();
        return true;
    }
    
    @Override
    public void method1659() {
        ++this.field4246;
        super.method1659();
    }
    
    public boolean method4493() {
        return this.field4246 > 100;
    }
}
