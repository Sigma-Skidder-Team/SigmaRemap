package mapped;

import java.util.Optional;
import java.util.Random;

public abstract class Class3397 extends Block {
   private final float field19034;
   public static final VoxelShape field19035 = Block.method11539(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   public Class3397(AbstractBlock var1, float var2) {
      super(var1);
      this.field19034 = var2;
   }

   @Override
   public BlockState method11495(Class5909 var1) {
      return method12009(var1.method18360(), var1.method18345());
   }

   public static BlockState method12009(Class1665 var0, BlockPos var1) {
      BlockPos var4 = var1.method8313();
      BlockState var5 = var0.getBlockState(var4);
      return !Class3398.method12014(var5.getBlock()) ? ((Class3399) Blocks.FIRE).method12016(var0, var1) : Blocks.field36531.method11579();
   }

   @Override
   public VoxelShape method11483(BlockState var1, Class1665 var2, BlockPos var3, ISelectionContext var4) {
      return field19035;
   }

   @Override
   public void method11512(BlockState var1, World var2, BlockPos var3, Random var4) {
      if (var4.nextInt(24) == 0) {
         var2.method6745(
            (double)var3.getX() + 0.5,
            (double)var3.getY() + 0.5,
            (double)var3.getZ() + 0.5,
            Sounds.field26581,
            Class2266.field14732,
            1.0F + var4.nextFloat(),
            var4.nextFloat() * 0.7F + 0.3F,
            false
         );
      }

      BlockPos var7 = var3.method8313();
      BlockState var8 = var2.getBlockState(var7);
      if (!this.method12010(var8) && !var8.method23454(var2, var7, Direction.field673)) {
         if (this.method12010(var2.getBlockState(var3.method8345()))) {
            for (int var16 = 0; var16 < 2; var16++) {
               double var21 = (double)var3.getX() + var4.nextDouble() * 0.1F;
               double var26 = (double)var3.getY() + var4.nextDouble();
               double var31 = (double)var3.getZ() + var4.nextDouble();
               var2.method6746(Class7940.field34085, var21, var26, var31, 0.0, 0.0, 0.0);
            }
         }

         if (this.method12010(var2.getBlockState(var3.method8347()))) {
            for (int var17 = 0; var17 < 2; var17++) {
               double var22 = (double)(var3.getX() + 1) - var4.nextDouble() * 0.1F;
               double var27 = (double)var3.getY() + var4.nextDouble();
               double var32 = (double)var3.getZ() + var4.nextDouble();
               var2.method6746(Class7940.field34085, var22, var27, var32, 0.0, 0.0, 0.0);
            }
         }

         if (this.method12010(var2.getBlockState(var3.method8341()))) {
            for (int var18 = 0; var18 < 2; var18++) {
               double var23 = (double)var3.getX() + var4.nextDouble();
               double var28 = (double)var3.getY() + var4.nextDouble();
               double var33 = (double)var3.getZ() + var4.nextDouble() * 0.1F;
               var2.method6746(Class7940.field34085, var23, var28, var33, 0.0, 0.0, 0.0);
            }
         }

         if (this.method12010(var2.getBlockState(var3.method8343()))) {
            for (int var19 = 0; var19 < 2; var19++) {
               double var24 = (double)var3.getX() + var4.nextDouble();
               double var29 = (double)var3.getY() + var4.nextDouble();
               double var34 = (double)(var3.getZ() + 1) - var4.nextDouble() * 0.1F;
               var2.method6746(Class7940.field34085, var24, var29, var34, 0.0, 0.0, 0.0);
            }
         }

         if (this.method12010(var2.getBlockState(var3.method8311()))) {
            for (int var20 = 0; var20 < 2; var20++) {
               double var25 = (double)var3.getX() + var4.nextDouble();
               double var30 = (double)(var3.getY() + 1) - var4.nextDouble() * 0.1F;
               double var35 = (double)var3.getZ() + var4.nextDouble();
               var2.method6746(Class7940.field34085, var25, var30, var35, 0.0, 0.0, 0.0);
            }
         }
      } else {
         for (int var9 = 0; var9 < 3; var9++) {
            double var10 = (double)var3.getX() + var4.nextDouble();
            double var12 = (double)var3.getY() + var4.nextDouble() * 0.5 + 0.5;
            double var14 = (double)var3.getZ() + var4.nextDouble();
            var2.method6746(Class7940.field34085, var10, var12, var14, 0.0, 0.0, 0.0);
         }
      }
   }

   public abstract boolean method12010(BlockState var1);

   @Override
   public void method11523(BlockState var1, World var2, BlockPos var3, Entity var4) {
      if (!var4.method3249()) {
         var4.method2966(var4.method3222() + 1);
         if (var4.method3222() == 0) {
            var4.method3221(8);
         }

         var4.method2741(Class8654.field38992, this.field19034);
      }

      super.method11523(var1, var2, var3, var4);
   }

   @Override
   public void method11589(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var4.method23448(var1.getBlock())) {
         if (method12011(var2)) {
            Optional var8 = Class7473.method24194(var2, var3, Class113.field413);
            if (var8.isPresent()) {
               ((Class7473)var8.get()).method24204();
               return;
            }
         }

         if (!var1.method23443(var2, var3)) {
            var2.method6728(var3, false);
         }
      }
   }

   private static boolean method12011(World var0) {
      return var0.getDimensionKey() == World.field8999 || var0.getDimensionKey() == World.THE_NETHER;
   }

   @Override
   public void method11574(World var1, BlockPos var2, BlockState var3, PlayerEntity var4) {
      if (!var1.method6714()) {
         var1.method6869((PlayerEntity)null, 1009, var2, 0);
      }
   }

   public static boolean method12012(World var0, BlockPos var1, Direction var2) {
      BlockState var5 = var0.getBlockState(var1);
      return !var5.isAir() ? false : method12009(var0, var1).method23443(var0, var1) || method12013(var0, var1, var2);
   }

   private static boolean method12013(World var0, BlockPos var1, Direction var2) {
      if (!method12011(var0)) {
         return false;
      } else {
         Mutable var5 = var1.method8354();
         boolean var6 = false;

         for (Direction var10 : Direction.values()) {
            if (var0.getBlockState(var5.method8374(var1).method8379(var10)).method23448(Blocks.field36527)) {
               var6 = true;
               break;
            }
         }

         return var6 && Class7473.method24194(var0, var1, var2.method538().method544()).isPresent();
      }
   }
}
