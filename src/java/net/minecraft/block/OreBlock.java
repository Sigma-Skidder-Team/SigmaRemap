package net.minecraft.block;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class OreBlock extends Block {

   public OreBlock(Properties var1) {
      super(var1);
   }

   public int method12068(Random var1) {
      if (this != Blocks.COAL_ORE) {
         if (this != Blocks.DIAMOND_ORE) {
            if (this != Blocks.EMERALD_ORE) {
               if (this != Blocks.LAPIS_ORE) {
                  if (this != Blocks.field36722) {
                     return this != Blocks.NETHER_GOLD_ORE ? 0 : MathHelper.method37782(var1, 0, 1);
                  } else {
                     return MathHelper.method37782(var1, 2, 5);
                  }
               } else {
                  return MathHelper.method37782(var1, 2, 5);
               }
            } else {
               return MathHelper.method37782(var1, 3, 7);
            }
         } else {
            return MathHelper.method37782(var1, 3, 7);
         }
      } else {
         return MathHelper.method37782(var1, 0, 2);
      }
   }

   @Override
   public void method11965(BlockState var1, ServerWorld var2, BlockPos var3, ItemStack var4) {
      super.method11965(var1, var2, var3, var4);
      if (EnchantmentHelper.getEnchantmentLevel(Enchantments.SILK_TOUCH, var4) == 0) {
         int var7 = this.method12068(var2.rand);
         if (var7 > 0) {
            this.method11558(var2, var3, var7);
         }
      }
   }
}
