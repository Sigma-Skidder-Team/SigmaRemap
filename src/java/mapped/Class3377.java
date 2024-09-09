package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class Class3377 extends Class3231 {
   private static String[] field18977;

   public Class3377(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public void method11562(World var1, PlayerEntity var2, BlockPos var3, BlockState var4, TileEntity var5, ItemStack var6) {
      super.method11562(var1, var2, var3, var4, var5, var6);
      if (EnchantmentHelper.method26311(Class8122.field34916, var6) == 0) {
         if (var1.method6812().isUltrawarm()) {
            var1.removeBlock(var3, false);
            return;
         }

         Class8649 var9 = var1.getBlockState(var3.down()).getMaterial();
         if (var9.method31087() || var9.isLiquid()) {
            var1.setBlockState(var3, Blocks.WATER.method11579());
         }
      }
   }

   @Override
   public void method11484(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (var2.method7020(Class1977.field12882, var3) > 11 - var1.getOpacity(var2, var3)) {
         this.method11968(var1, var2, var3);
      }
   }

   public void method11968(BlockState var1, World var2, BlockPos var3) {
      if (!var2.method6812().isUltrawarm()) {
         var2.setBlockState(var3, Blocks.WATER.method11579());
         var2.neighborChanged(var3, Blocks.WATER, var3);
      } else {
         var2.removeBlock(var3, false);
      }
   }

   @Override
   public Class2315 method11689(BlockState var1) {
      return Class2315.field15862;
   }
}
