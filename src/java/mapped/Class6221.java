package mapped;

import net.minecraft.dispenser.IBlockSource;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;

public final class Class6221 extends Class6218 {
   private static String[] field27718;

   @Override
   public ItemStack dispenseStack(IBlockSource var1, ItemStack var2) {
      Direction var5 = var1.method11324().<Direction>get(DispenserBlock.field18899);
      BlockPos var6 = var1.method11323().offset(var5);
      ServerWorld var7 = var1.method11326();
      ArmorStandEntity var8 = new ArmorStandEntity(var7, (double)var6.getX() + 0.5, (double)var6.getY(), (double)var6.getZ() + 0.5);
      EntityType.method33204(var7, (PlayerEntity)null, var8, var2.getTag());
      var8.rotationYaw = var5.getHorizontalAngle();
      var7.addEntity(var8);
      var2.shrink(1);
      return var2;
   }
}
