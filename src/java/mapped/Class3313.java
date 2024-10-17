package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Class3313 extends Class3312 {
   private static String[] field18823;

   public Class3313(Properties var1) {
      super(EntityType.ITEM_FRAME, var1);
   }

   @Override
   public boolean method11857(PlayerEntity var1, Direction var2, ItemStack var3, BlockPos var4) {
      return !World.isOutsideBuildHeight(var4) && var1.method2936(var4, var2, var3);
   }
}
