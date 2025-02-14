package net.minecraft.block;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.stats.Stats;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class Class3395 extends Block {
   private static String[] field19031;
   private static final IntegerProperty field19032 = BlockStateProperties.POWER;

   public Class3395(Properties var1) {
      super(var1);
      this.setDefaultState(this.stateContainer.getBaseState().with(field19032, Integer.valueOf(0)));
   }

   @Override
   public void method11595(World var1, BlockState var2, BlockRayTraceResult var3, ProjectileEntity var4) {
      int var7 = method12006(var1, var2, var3, var4);
      Entity var8 = var4.method3460();
      if (var8 instanceof ServerPlayerEntity) {
         ServerPlayerEntity var9 = (ServerPlayerEntity)var8;
         var9.method2911(Stats.field40177);
         CriteriaTriggers.field44502.method15161(var9, var4, var3.getHitVec(), var7);
      }
   }

   private static int method12006(IWorld var0, BlockState var1, BlockRayTraceResult var2, Entity var3) {
      int var6 = method12007(var2, var2.getHitVec());
      int var7 = !(var3 instanceof AbstractArrowEntity) ? 8 : 20;
      if (!var0.getBlockTickScheduler().method20718(var2.getPos(), var1.getBlock())) {
         method12008(var0, var1, var6, var2.getPos(), var7);
      }

      return var6;
   }

   private static int method12007(BlockRayTraceResult var0, Vector3d var1) {
      Direction var4 = var0.getFace();
      double var5 = Math.abs(MathHelper.frac(var1.x) - 0.5);
      double var7 = Math.abs(MathHelper.frac(var1.y) - 0.5);
      double var9 = Math.abs(MathHelper.frac(var1.z) - 0.5);
      Direction.Axis var11 = var4.getAxis();
      double var12;
      if (var11 != Direction.Axis.Y) {
         if (var11 != Direction.Axis.Z) {
            var12 = Math.max(var7, var9);
         } else {
            var12 = Math.max(var5, var7);
         }
      } else {
         var12 = Math.max(var5, var9);
      }

      return Math.max(1, MathHelper.method37774(15.0 * MathHelper.clamp((0.5 - var12) / 0.5, 0.0, 1.0)));
   }

   private static void method12008(IWorld var0, BlockState var1, int var2, BlockPos var3, int var4) {
      var0.setBlockState(var3, var1.with(field19032, Integer.valueOf(var2)), 3);
      var0.getBlockTickScheduler().scheduleTick(var3, var1.getBlock(), var4);
   }

   @Override
   public void tick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (var1.<Integer>get(field19032) != 0) {
         var2.setBlockState(var3, var1.with(field19032, Integer.valueOf(0)), 3);
      }
   }

   @Override
   public int method11514(BlockState var1, IBlockReader var2, BlockPos var3, Direction var4) {
      return var1.<Integer>get(field19032);
   }

   @Override
   public boolean method11516(BlockState var1) {
      return true;
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field19032);
   }

   @Override
   public void onBlockAdded(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var2.isRemote()
         && !var1.isIn(var4.getBlock())
         && var1.<Integer>get(field19032) > 0
         && !var2.getBlockTickScheduler().method20718(var3, this)) {
         var2.setBlockState(var3, var1.with(field19032, Integer.valueOf(0)), 18);
      }
   }
}
