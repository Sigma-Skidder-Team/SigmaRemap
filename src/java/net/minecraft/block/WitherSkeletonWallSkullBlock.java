package net.minecraft.block;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class WitherSkeletonWallSkullBlock extends CreeperWallHeadBlock {
   private static String[] field18729;

   public WitherSkeletonWallSkullBlock(Properties var1) {
      super(Class2136.field13990, var1);
   }

   @Override
   public void method11563(World var1, BlockPos var2, BlockState var3, LivingEntity var4, ItemStack var5) {
      Blocks.WITHER_SKELETON_SKULL.method11563(var1, var2, var3, var4, var5);
   }
}