// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util2.Direction;
import net.minecraft.world.World;

public class Class4082 extends Class4081
{
    private static String[] field18185;
    
    public Class4082(final Class8959 class8959) {
        super(EntityType.field28993, class8959);
    }
    
    @Override
    public boolean method12287(final PlayerEntity playerEntity, final Direction class513, final ItemStack class514, final BlockPos class515) {
        return !World.isOutsideBuildHeight(class515) && playerEntity.method2881(class515, class513, class514);
    }
}
