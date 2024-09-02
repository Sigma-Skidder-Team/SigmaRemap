package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.particles.IParticleData;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;
import javax.annotation.Nullable;

public abstract class Class7637 extends Class7633 {
   @Override
   public Fluid method25075() {
      return Class9479.field44067;
   }

   @Override
   public Fluid method25077() {
      return Class9479.field44068;
   }

   @Override
   public Item method25050() {
      return Items.field37884;
   }

   @Override
   public void method25051(World var1, BlockPos var2, FluidState var3, Random var4) {
      BlockPos var7 = var2.up();
      if (var1.getBlockState(var7).isAir() && !var1.getBlockState(var7).method23409(var1, var7)) {
         if (var4.nextInt(100) == 0) {
            double var8 = (double)var2.getX() + var4.nextDouble();
            double var10 = (double)var2.getY() + 1.0;
            double var12 = (double)var2.getZ() + var4.nextDouble();
            var1.method6746(ParticleTypes.field34086, var8, var10, var12, 0.0, 0.0, 0.0);
            var1.method6745(
               var8, var10, var12, Sounds.field26727, Class2266.field14732, 0.2F + var4.nextFloat() * 0.2F, 0.9F + var4.nextFloat() * 0.15F, false
            );
         }

         if (var4.nextInt(200) == 0) {
            var1.method6745(
               (double)var2.getX(),
               (double)var2.getY(),
               (double)var2.getZ(),
               Sounds.field26725,
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
      if (var1.method6789().method17135(Class5462.field24223)) {
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
                  if (var10.method23384().method31087()) {
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

   private boolean method25102(Class1662 var1, BlockPos var2) {
      for (Direction var8 : Direction.values()) {
         if (this.method25103(var1, var2.method8349(var8))) {
            return true;
         }
      }

      return false;
   }

   private boolean method25103(Class1662 var1, BlockPos var2) {
      return var2.getY() >= 0 && var2.getY() < 256 && !var1.method7017(var2) ? false : var1.getBlockState(var2).method23384().method31088();
   }

   @Nullable
   @Override
   public IParticleData method25054() {
      return ParticleTypes.field34057;
   }

   @Override
   public void method25081(Class1660 var1, BlockPos var2, BlockState var3) {
      this.method25104(var1, var2);
   }

   @Override
   public int method25087(Class1662 var1) {
      return !var1.method6812().isUltrawarm() ? 2 : 4;
   }

   @Override
   public BlockState method25063(FluidState var1) {
      return Blocks.LAVA.method11579().method23465(Class3404.field19079, Integer.valueOf(method25094(var1)));
   }

   @Override
   public boolean method25066(Fluid var1) {
      return var1 == Class9479.field44068 || var1 == Class9479.field44067;
   }

   @Override
   public int method25092(Class1662 var1) {
      return !var1.method6812().isUltrawarm() ? 2 : 1;
   }

   @Override
   public boolean method25055(FluidState var1, Class1665 var2, BlockPos var3, Fluid var4, Direction var5) {
      return var1.method23475(var2, var3) >= 0.44444445F && var4.method25067(Class8953.field40469);
   }

   @Override
   public int method25057(Class1662 var1) {
      return !var1.method6812().isUltrawarm() ? 30 : 10;
   }

   @Override
   public int method25093(World var1, BlockPos var2, FluidState var3, FluidState var4) {
      int var7 = this.method25057(var1);
      if (!var3.method23474()
         && !var4.method23474()
         && !var3.<Boolean>method23463(field32712)
         && !var4.<Boolean>method23463(field32712)
         && var4.method23475(var1, var2) > var3.method23475(var1, var2)
         && var1.method6814().nextInt(4) != 0) {
         var7 *= 4;
      }

      return var7;
   }

   private void method25104(Class1660 var1, BlockPos var2) {
      var1.playEvent(1501, var2, 0);
   }

   @Override
   public boolean method25079() {
      return false;
   }

   @Override
   public void method25080(Class1660 var1, BlockPos var2, BlockState var3, Direction var4, FluidState var5) {
      if (var4 == Direction.DOWN) {
         FluidState var8 = var1.getFluidState(var2);
         if (this.method25067(Class8953.field40470) && var8.method23486(Class8953.field40469)) {
            if (var3.getBlock() instanceof Class3404) {
               var1.setBlockState(var2, Blocks.STONE.method11579(), 3);
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
}
