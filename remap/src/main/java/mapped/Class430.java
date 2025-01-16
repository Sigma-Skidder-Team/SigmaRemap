// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public class Class430 extends Class428
{
    private static String[] field2641;
    
    public Class430(final EntityType<?> class7499, final World class7500) {
        super(class7499, class7500);
    }
    
    public Class430(final World class1847, final double n, final double n2, final double n3) {
        super(EntityType.field28999, class1847, n, n2, n3);
    }
    
    @Override
    public boolean method1770(final PlayerEntity playerEntity, final Class316 class513) {
        if (playerEntity.method2804()) {
            return false;
        }
        if (!this.isBeingRidden()) {
            if (!this.world.isRemote) {
                playerEntity.method1778(this);
            }
            return true;
        }
        return true;
    }
    
    @Override
    public void method2126(final int n, final int n2, final int n3, final boolean b) {
        if (b) {
            if (this.isBeingRidden()) {
                this.removePassengers();
            }
            if (this.method2136() == 0) {
                this.method2137(-this.method2138());
                this.method2135(10);
                this.method2133(50.0f);
                this.method1739();
            }
        }
    }
    
    @Override
    public Class2080 method2139() {
        return Class2080.field12024;
    }
}
