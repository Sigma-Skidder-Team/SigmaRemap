// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

import java.util.Optional;
import java.util.List;

public class Class6440 implements Class6438
{
    private final Entity field25568;
    
    public Class6440(final Entity field25568) {
        this.field25568 = field25568;
    }
    
    @Override
    public BlockPos method19204() {
        return new BlockPos(this.field25568);
    }
    
    @Override
    public Vec3d method19205() {
        return new Vec3d(this.field25568.getPosX(), this.field25568.method1944(), this.field25568.getPosZ());
    }
    
    @Override
    public boolean method19206(final LivingEntity class511) {
        final Optional<List<LivingEntity>> method1198 = class511.method2618().method1198(Class8233.field33805);
        if (this.field25568.isAlive()) {
            if (method1198.isPresent()) {
                return method1198.get().contains(this.field25568);
            }
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "EntityPosWrapper for " + this.field25568;
    }
}
