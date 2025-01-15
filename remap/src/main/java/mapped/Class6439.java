// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.Vec3d;

public class Class6439 implements Class6438
{
    private final BlockPos field25566;
    private final Vec3d field25567;
    
    public Class6439(final BlockPos field25566) {
        this.field25566 = field25566;
        this.field25567 = new Vec3d(field25566.getX() + 0.5, field25566.getY() + 0.5, field25566.getZ() + 0.5);
    }
    
    @Override
    public BlockPos method19204() {
        return this.field25566;
    }
    
    @Override
    public Vec3d method19205() {
        return this.field25567;
    }
    
    @Override
    public boolean method19206(final Class511 class511) {
        return true;
    }
    
    @Override
    public String toString() {
        return "BlockPosWrapper{pos=" + this.field25566 + ", lookAt=" + this.field25567 + '}';
    }
}
