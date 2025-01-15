// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.Vec3d;

public interface Class5346
{
    Vec3d method16504(final Class7492 p0);
    
    Vec2f method16505(final Class7492 p0);
    
    default BlockPos method16506(final Class7492 class7492) {
        return new BlockPos(this.method16504(class7492));
    }
    
    boolean method16507();
    
    boolean method16508();
    
    boolean method16509();
}
