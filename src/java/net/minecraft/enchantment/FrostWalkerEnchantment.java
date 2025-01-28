package net.minecraft.enchantment;

import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class FrostWalkerEnchantment extends Enchantment {
   private static String[] field27333;

   public FrostWalkerEnchantment(Rarity var1, EquipmentSlotType... var2) {
      super(var1, EnchantmentType.ARMOR_FEET, var2);
   }

   @Override
   public int method18807(int var1) {
      return var1 * 10;
   }

   @Override
   public int method18808(int var1) {
      return this.method18807(var1) + 15;
   }

   @Override
   public boolean method18824() {
      return true;
   }

   @Override
   public int method18809() {
      return 2;
   }

   public static void method18829(LivingEntity var0, World var1, BlockPos var2, int var3) {
      if (var0.isOnGround()) {
         BlockState var6 = Blocks.FROSTED_ICE.getDefaultState();
         float var7 = (float)Math.min(16, 2 + var3);
         BlockPos.Mutable var8 = new BlockPos.Mutable();

         for (BlockPos var10 : BlockPos.method8359(var2.method8335((double)(-var7), -1.0, (double)(-var7)), var2.method8335((double)var7, -1.0, (double)var7))) {
            if (var10.withinDistance(var0.getPositionVec(), (double)var7)) {
               var8.setPos(var10.getX(), var10.getY() + 1, var10.getZ());
               BlockState var11 = var1.getBlockState(var8);
               if (var11.isAir()) {
                  BlockState var12 = var1.getBlockState(var10);
                  if (var12.getMaterial() == Material.field38941
                     && var12.<Integer>get(FlowingFluidBlock.field19079) == 0
                     && var6.isValidPosition(var1, var10)
                     && var1.placedBlockCollides(var6, var10, ISelectionContext.method14947())) {
                     var1.setBlockState(var10, var6);
                     var1.getBlockTickScheduler().scheduleTick(var10, Blocks.FROSTED_ICE, MathHelper.method37782(var0.getRNG(), 60, 120));
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean method18817(Enchantment var1) {
      return super.method18817(var1) && var1 != Enchantments.DEPTH_STRIDER;
   }
}
