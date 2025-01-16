// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Class4045 extends Class4043
{
    private static String[] field18139;
    
    public Class4045(final Class8959 class8959, final Block class8960, final Block class8961) {
        super(class8960, class8961, class8959);
    }
    
    @Override
    public boolean method12232(final BlockPos class354, final World class355, final PlayerEntity class356, final ItemStack class357, final Class7096 class358) {
        final boolean method12232 = super.method12232(class354, class355, class356, class357, class358);
        if (!class355.isRemote) {
            if (!method12232) {
                if (class356 != null) {
                    class356.method2827((Class497)class355.getTileEntity(class354));
                }
            }
        }
        return method12232;
    }
}
