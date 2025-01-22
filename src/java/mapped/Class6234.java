package mapped;

import net.minecraft.block.AbstractFireBlock;
import net.minecraft.block.BlockState;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;

public final class Class6234 extends Class6230 {
   private static String[] field27718;

   @Override
   public ItemStack dispenseStack(IBlockSource var1, ItemStack var2) {
      ServerWorld var5 = var1.method11326();
      this.method19204(true);
      Direction var6 = var1.method11324().<Direction>get(DispenserBlock.field18899);
      BlockPos var7 = var1.method11323().offset(var6);
      BlockState var8 = var5.getBlockState(var7);
      if (!AbstractFireBlock.method12012(var5, var7, var6)) {
         if (!CampfireBlock.method11656(var8)) {
            if (!(var8.getBlock() instanceof Class3458)) {
               this.method19204(false);
            } else {
               Class3458.method12131(var5, var7);
               var5.removeBlock(var7, false);
            }
         } else {
            var5.setBlockState(var7, var8.with(BlockStateProperties.LIT, Boolean.valueOf(true)));
         }
      } else {
         var5.setBlockState(var7, AbstractFireBlock.method12009(var5, var7));
      }

      if (this.method19203() && var2.method32120(1, var5.rand, (ServerPlayerEntity)null)) {
         var2.setCount(0);
      }

      return var2;
   }
}
