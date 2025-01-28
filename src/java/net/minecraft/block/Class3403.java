package net.minecraft.block;

import mapped.Class3383;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.RedstoneParticleData;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class Class3403 extends Block {
   private static String[] field19076;
   public static final BooleanProperty field19077 = Class3383.field18987;

   public Class3403(Properties var1) {
      super(var1);
      this.setDefaultState(this.getDefaultState().with(field19077, Boolean.valueOf(false)));
   }

   @Override
   public void onBlockClicked(BlockState var1, World var2, BlockPos var3, PlayerEntity var4) {
      method12041(var1, var2, var3);
      super.onBlockClicked(var1, var2, var3, var4);
   }

   @Override
   public void onEntityWalk(World var1, BlockPos var2, Entity var3) {
      method12041(var1.getBlockState(var2), var1, var2);
      super.onEntityWalk(var1, var2, var3);
   }

   @Override
   public ActionResultType onBlockActivated(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      if (!var2.isRemote) {
         method12041(var1, var2, var3);
      } else {
         method12042(var2, var3);
      }

      ItemStack var9 = var4.getHeldItem(var5);
      return var9.getItem() instanceof BlockItem && new BlockItemUseContext(var4, var5, var9, var6).method18346() ? ActionResultType.field14820 : ActionResultType.SUCCESS;
   }

   private static void method12041(BlockState var0, World var1, BlockPos var2) {
      method12042(var1, var2);
      if (!var0.<Boolean>get(field19077)) {
         var1.setBlockState(var2, var0.with(field19077, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   public boolean ticksRandomly(BlockState var1) {
      return var1.<Boolean>get(field19077);
   }

   @Override
   public void randomTick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (var1.<Boolean>get(field19077)) {
         var2.setBlockState(var3, var1.with(field19077, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   public void method11965(BlockState var1, ServerWorld var2, BlockPos var3, ItemStack var4) {
      super.method11965(var1, var2, var3, var4);
      if (EnchantmentHelper.getEnchantmentLevel(Enchantments.SILK_TOUCH, var4) == 0) {
         int var7 = 1 + var2.rand.nextInt(5);
         this.method11558(var2, var3, var7);
      }
   }

   @Override
   public void animateTick(BlockState var1, World var2, BlockPos var3, Random var4) {
      if (var1.<Boolean>get(field19077)) {
         method12042(var2, var3);
      }
   }

   private static void method12042(World var0, BlockPos var1) {
      double var4 = 0.5625;
      Random var6 = var0.rand;

      for (Direction var10 : Direction.values()) {
         BlockPos var11 = var1.offset(var10);
         if (!var0.getBlockState(var11).method23409(var0, var11)) {
            Direction.Axis var12 = var10.getAxis();
            double var13 = var12 != Direction.Axis.X ? (double)var6.nextFloat() : 0.5 + 0.5625 * (double)var10.getXOffset();
            double var15 = var12 != Direction.Axis.Y ? (double)var6.nextFloat() : 0.5 + 0.5625 * (double)var10.getYOffset();
            double var17 = var12 != Direction.Axis.Z ? (double)var6.nextFloat() : 0.5 + 0.5625 * (double)var10.getZOffset();
            var0.addParticle(
               RedstoneParticleData.REDSTONE_DUST, (double)var1.getX() + var13, (double)var1.getY() + var15, (double)var1.getZ() + var17, 0.0, 0.0, 0.0
            );
         }
      }
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field19077);
   }
}
