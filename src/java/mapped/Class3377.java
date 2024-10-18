package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.PushReaction;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.LightType;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class Class3377 extends Class3231 {
   private static String[] field18977;

   public Class3377(Properties var1) {
      super(var1);
   }

   @Override
   public void method11562(World var1, PlayerEntity var2, BlockPos var3, BlockState var4, TileEntity var5, ItemStack var6) {
      super.method11562(var1, var2, var3, var4, var5, var6);
      if (EnchantmentHelper.getEnchantmentLevel(Enchantments.SILK_TOUCH, var6) == 0) {
         if (var1.getDimensionType().isUltrawarm()) {
            var1.removeBlock(var3, false);
            return;
         }

         Material var9 = var1.getBlockState(var3.down()).getMaterial();
         if (var9.blocksMovement() || var9.isLiquid()) {
            var1.setBlockState(var3, Blocks.WATER.getDefaultState());
         }
      }
   }

   @Override
   public void randomTick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (var2.getLightFor(LightType.BLOCK, var3) > 11 - var1.getOpacity(var2, var3)) {
         this.method11968(var1, var2, var3);
      }
   }

   public void method11968(BlockState var1, World var2, BlockPos var3) {
      if (!var2.getDimensionType().isUltrawarm()) {
         var2.setBlockState(var3, Blocks.WATER.getDefaultState());
         var2.neighborChanged(var3, Blocks.WATER, var3);
      } else {
         var2.removeBlock(var3, false);
      }
   }

   @Override
   public PushReaction method11689(BlockState var1) {
      return PushReaction.field15862;
   }
}
