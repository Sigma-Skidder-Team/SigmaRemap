// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

public interface Class1876
{
    boolean setBlockState(final BlockPos p0, final BlockState p1, final int p2);
    
    boolean method6690(final BlockPos p0, final boolean p1);
    
    default boolean method7149(final BlockPos class354, final boolean b) {
        return this.method6691(class354, b, null);
    }
    
    boolean method6691(final BlockPos p0, final boolean p1, final Entity p2);
    
    default boolean method6886(final Entity class399) {
        return false;
    }
}
