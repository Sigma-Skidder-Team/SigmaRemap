package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.Items;
import net.minecraft.particles.IParticleData;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

import java.util.Random;
import javax.annotation.Nullable;

public abstract class LavaFluid extends FlowingFluid {
   @Override
   public Fluid method25075() {
      return Fluids.FLOWING_LAVA;
   }

   @Override
   public Fluid method25077() {
      return Fluids.LAVA;
   }

   @Override
   public Item method25050() {
      return Items.LAVA_BUCKET;
   }

   @Override
   public void method25051(World var1, BlockPos var2, FluidState var3, Random var4) {
      BlockPos var7 = var2.up();
      if (var1.getBlockState(var7).isAir() && !var1.getBlockState(var7).method23409(var1, var7)) {
         if (var4.nextInt(100) == 0) {
            double var8 = (double)var2.getX() + var4.nextDouble();
            double var10 = (double)var2.getY() + 1.0;
            double var12 = (double)var2.getZ() + var4.nextDouble();
            var1.addParticle(ParticleTypes.field34086, var8, var10, var12, 0.0, 0.0, 0.0);
            var1.method6745(
               var8, var10, var12, SoundEvents.field26727, Class2266.field14732, 0.2F + var4.nextFloat() * 0.2F, 0.9F + var4.nextFloat() * 0.15F, false
            );
         }

         if (var4.nextInt(200) == 0) {
            var1.method6745(
               (double)var2.getX(),
               (double)var2.getY(),
               (double)var2.getZ(),
               SoundEvents.field26725,
               Class2266.field14732,
               0.2F + var4.nextFloat() * 0.2F,
               0.9F + var4.nextFloat() * 0.15F,
               false
            );
         }
      }
   }

   @Override
   public void method25053(World var1, BlockPos var2, FluidState var3, Random var4) {
      if (var1.getGameRules().getBoolean(Class5462.field24223)) {
         int var7 = var4.nextInt(3);
         if (var7 <= 0) {
            for (int var8 = 0; var8 < 3; var8++) {
               BlockPos var9 = var2.method8336(var4.nextInt(3) - 1, 0, var4.nextInt(3) - 1);
               if (!var1.method6763(var9)) {
                  return;
               }

               if (var1.method7007(var9.up()) && this.method25103(var1, var9)) {
                  var1.setBlockState(var9.up(), AbstractFireBlock.method12009(var1, var9));
               }
            }
         } else {
            BlockPos var11 = var2;

            for (int var12 = 0; var12 < var7; var12++) {
               var11 = var11.method8336(var4.nextInt(3) - 1, 1, var4.nextInt(3) - 1);
               if (!var1.method6763(var11)) {
                  return;
               }

               BlockState var10 = var1.getBlockState(var11);
               if (!var10.isAir()) {
                  if (var10.getMaterial().blocksMovement()) {
                     return;
                  }
               } else if (this.method25102(var1, var11)) {
                  var1.setBlockState(var11, AbstractFireBlock.method12009(var1, var11));
                  return;
               }
            }
         }
      }
   }

   private boolean method25102(IWorldReader var1, BlockPos var2) {
      for (Direction var8 : Direction.values()) {
         if (this.method25103(var1, var2.offset(var8))) {
            return true;
         }
      }

      return false;
   }

   private boolean method25103(IWorldReader var1, BlockPos var2) {
      return var2.getY() >= 0 && var2.getY() < 256 && !var1.isBlockLoaded(var2) ? false : var1.getBlockState(var2).getMaterial().isFlammable();
   }

   @Nullable
   @Override
   public IParticleData method25054() {
      return ParticleTypes.field34057;
   }

   @Override
   public void method25081(IWorld var1, BlockPos var2, BlockState var3) {
      this.method25104(var1, var2);
   }

   @Override
   public int method25087(IWorldReader var1) {
      return !var1.method6812().isUltrawarm() ? 2 : 4;
   }

   @Override
   public BlockState method25063(FluidState var1) {
      return Blocks.LAVA.getDefaultState().with(Class3404.field19079, Integer.valueOf(method25094(var1)));
   }

   @Override
   public boolean method25066(Fluid var1) {
      return var1 == Fluids.LAVA || var1 == Fluids.FLOWING_LAVA;
   }

   @Override
   public int method25092(IWorldReader var1) {
      return !var1.method6812().isUltrawarm() ? 2 : 1;
   }

   @Override
   public boolean method25055(FluidState var1, IBlockReader var2, BlockPos var3, Fluid var4, Direction var5) {
      return var1.method23475(var2, var3) >= 0.44444445F && var4.method25067(FluidTags.field40469);
   }

   @Override
   public int getTickRate(IWorldReader var1) {
      return !var1.method6812().isUltrawarm() ? 30 : 10;
   }

   @Override
   public int method25093(World var1, BlockPos var2, FluidState var3, FluidState var4) {
      int var7 = this.getTickRate(var1);
      if (!var3.method23474()
         && !var4.method23474()
         && !var3.<Boolean>get(field32712)
         && !var4.<Boolean>get(field32712)
         && var4.method23475(var1, var2) > var3.method23475(var1, var2)
         && var1.method6814().nextInt(4) != 0) {
         var7 *= 4;
      }

      return var7;
   }

   private void method25104(IWorld var1, BlockPos var2) {
      var1.playEvent(1501, var2, 0);
   }

   @Override
   public boolean method25079() {
      return false;
   }

   @Override
   public void method25080(IWorld var1, BlockPos var2, BlockState var3, Direction var4, FluidState var5) {
      if (var4 == Direction.DOWN) {
         FluidState var8 = var1.getFluidState(var2);
         if (this.method25067(FluidTags.field40470) && var8.method23486(FluidTags.field40469)) {
            if (var3.getBlock() instanceof Class3404) {
               var1.setBlockState(var2, Blocks.STONE.getDefaultState(), 3);
            }

            this.method25104(var1, var2);
            return;
         }
      }

      super.method25080(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean method25058() {
      return true;
   }

   @Override
   public float method25060() {
      return 100.0F;
   }

   public static class Source extends LavaFluid {
      private static String[] field32719;

      @Override
      public int method25065(FluidState var1) {
         return 8;
      }

      @Override
      public boolean method25064(FluidState var1) {
         return true;
      }
   }

   public static class Flowing extends LavaFluid {
      private static String[] field32718;

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
}
