package net.minecraft.fluid;

import mapped.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.particles.IParticleData;
import net.minecraft.state.StateContainer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

import java.util.Random;
import javax.annotation.Nullable;

public abstract class WaterFluid extends FlowingFluid {
   @Override
   public Fluid method25075() {
      return Fluids.FLOWING_WATER;
   }

   @Override
   public Fluid method25077() {
      return Fluids.WATER;
   }

   @Override
   public Item method25050() {
      return Items.WATER_BUCKET;
   }

   @Override
   public void method25051(World var1, BlockPos var2, FluidState var3, Random var4) {
      if (!var3.isSource() && !var3.<Boolean>get(field32712)) {
         if (var4.nextInt(64) == 0) {
            var1.playSound(
               (double)var2.getX() + 0.5,
               (double)var2.getY() + 0.5,
               (double)var2.getZ() + 0.5,
               SoundEvents.field27225,
               SoundCategory.field14732,
               var4.nextFloat() * 0.25F + 0.75F,
               var4.nextFloat() + 0.5F,
               false
            );
         }
      } else if (var4.nextInt(10) == 0) {
         var1.addParticle(
            ParticleTypes.field34098,
            (double)var2.getX() + var4.nextDouble(),
            (double)var2.getY() + var4.nextDouble(),
            (double)var2.getZ() + var4.nextDouble(),
            0.0,
            0.0,
            0.0
         );
      }
   }

   @Nullable
   @Override
   public IParticleData method25054() {
      return ParticleTypes.field34060;
   }

   @Override
   public boolean method25079() {
      return true;
   }

   @Override
   public void method25081(IWorld var1, BlockPos var2, BlockState var3) {
      TileEntity var6 = !var3.getBlock().isTileEntityProvider() ? null : var1.getTileEntity(var2);
      Block.method11555(var3, var1, var2, var6);
   }

   @Override
   public int method25087(IWorldReader var1) {
      return 4;
   }

   @Override
   public BlockState method25063(FluidState var1) {
      return Blocks.WATER.getDefaultState().with(FlowingFluidBlock.field19079, Integer.valueOf(method25094(var1)));
   }

   @Override
   public boolean method25066(Fluid var1) {
      return var1 == Fluids.WATER || var1 == Fluids.FLOWING_WATER;
   }

   @Override
   public int method25092(IWorldReader var1) {
      return 1;
   }

   @Override
   public int getTickRate(IWorldReader var1) {
      return 5;
   }

   @Override
   public boolean method25055(FluidState var1, IBlockReader var2, BlockPos var3, Fluid var4, Direction var5) {
      return var5 == Direction.DOWN && !var4.method25067(FluidTags.WATER);
   }

   @Override
   public float method25060() {
      return 100.0F;
   }

   public static class Flowing extends WaterFluid {
      private static String[] field32717;

      @Override
      public void method25046(StateContainer.Builder<Fluid, FluidState> var1) {
         super.method25046(var1);
         var1.add(field32713);
      }

      @Override
      public int method25065(FluidState var1) {
         return var1.<Integer>get(field32713);
      }

      @Override
      public boolean method25064(FluidState var1) {
         return false;
      }
   }

   public static class Source extends WaterFluid {
      private static String[] field32716;

      @Override
      public int method25065(FluidState var1) {
         return 8;
      }

      @Override
      public boolean method25064(FluidState var1) {
         return true;
      }
   }
}
