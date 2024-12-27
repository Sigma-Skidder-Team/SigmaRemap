package net.minecraft.block;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;

public class PlayerWallHeadBlock extends CreeperWallHeadBlock {
   private static String[] field18730;

   public PlayerWallHeadBlock(Properties var1) {
      super(Class2136.field13991, var1);
   }

   @Override
   public void method11563(World var1, BlockPos var2, BlockState var3, LivingEntity var4, ItemStack var5) {
      Blocks.PLAYER_HEAD.method11563(var1, var2, var3, var4, var5);
   }

   @Override
   public List<ItemStack> method11697(BlockState var1, Class9464 var2) {
      return Blocks.PLAYER_HEAD.method11697(var1, var2);
   }
}
