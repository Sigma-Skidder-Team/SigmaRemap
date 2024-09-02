package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class Class3461 extends Block {
   private static String[] field19292;
   public static final Class8553 field19293 = Class3198.field18484;
   public static final Class8551 field19294 = Class8820.field39702;
   public static final Class8552<Class183> field19295 = Class8820.field39767;
   public static final Class8551 field19296 = Class8820.field39704;
   public static final Class8552<Class84> field19297 = Class8820.field39734;
   public static final VoxelShape field19298 = Block.method11539(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   public static final VoxelShape field19299 = Block.method11539(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   public static final VoxelShape field19300 = Block.method11539(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   public static final VoxelShape field19301 = Block.method11539(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);

   public Class3461(AbstractBlock var1) {
      super(var1);
      this.method11578(
         this.field18612
            .method35393()
            .method23465(field19293, Direction.NORTH)
            .method23465(field19294, Boolean.valueOf(false))
            .method23465(field19295, Class183.field664)
            .method23465(field19296, Boolean.valueOf(false))
            .method23465(field19297, Class84.field210)
      );
   }

   @Override
   public VoxelShape method11483(BlockState var1, Class1665 var2, BlockPos var3, ISelectionContext var4) {
      Direction var7 = var1.<Direction>method23463(field19293);
      boolean var8 = !var1.<Boolean>method23463(field19294);
      boolean var9 = var1.<Class183>method23463(field19295) == Class183.field665;
      switch (Class5988.field26125[var7.ordinal()]) {
         case 1:
         default:
            return var8 ? field19301 : (var9 ? field19299 : field19298);
         case 2:
            return var8 ? field19298 : (var9 ? field19301 : field19300);
         case 3:
            return var8 ? field19300 : (var9 ? field19298 : field19299);
         case 4:
            return var8 ? field19299 : (var9 ? field19300 : field19301);
      }
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      Class84 var9 = var1.<Class84>method23463(field19297);
      if (var2.method544() == Class113.field414 && var9 == Class84.field210 == (var2 == Direction.field673)) {
         return var3.method23448(this) && var3.method23463(field19297) != var9
            ? var1.method23465(field19293, var3.<Direction>method23463(field19293))
               .method23465(field19294, var3.<Boolean>method23463(field19294))
               .method23465(field19295, var3.<Class183>method23463(field19295))
               .method23465(field19296, var3.<Boolean>method23463(field19296))
            : Blocks.AIR.method11579();
      } else {
         return var9 == Class84.field210 && var2 == Direction.DOWN && !var1.method23443(var4, var5)
            ? Blocks.AIR.method11579()
            : super.method11491(var1, var2, var3, var4, var5, var6);
      }
   }

   @Override
   public void method11574(World var1, BlockPos var2, BlockState var3, PlayerEntity var4) {
      if (!var1.isRemote && var4.isCreative()) {
         Class3456.method12130(var1, var2, var3, var4);
      }

      super.method11574(var1, var2, var3, var4);
   }

   @Override
   public boolean method11494(BlockState var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      switch (Class5988.field26126[var4.ordinal()]) {
         case 1:
            return var1.<Boolean>method23463(field19294);
         case 2:
            return false;
         case 3:
            return var1.<Boolean>method23463(field19294);
         default:
            return false;
      }
   }

   private int method12138() {
      return this.field19004 != Class8649.field38967 ? 1012 : 1011;
   }

   private int method12139() {
      return this.field19004 != Class8649.field38967 ? 1006 : 1005;
   }

   @Nullable
   @Override
   public BlockState method11495(Class5909 var1) {
      BlockPos var4 = var1.method18345();
      if (var4.getY() < 255 && var1.method18360().getBlockState(var4.up()).method23441(var1)) {
         World var5 = var1.method18360();
         boolean var6 = var5.method6780(var4) || var5.method6780(var4.up());
         return this.method11579()
            .method23465(field19293, var1.method18350())
            .method23465(field19295, this.method12140(var1))
            .method23465(field19296, Boolean.valueOf(var6))
            .method23465(field19294, Boolean.valueOf(var6))
            .method23465(field19297, Class84.field210);
      } else {
         return null;
      }
   }

   @Override
   public void method11563(World var1, BlockPos var2, BlockState var3, LivingEntity var4, ItemStack var5) {
      var1.setBlockState(var2.up(), var3.method23465(field19297, Class84.field209), 3);
   }

   private Class183 method12140(Class5909 var1) {
      World var4 = var1.method18360();
      BlockPos var5 = var1.method18345();
      Direction var6 = var1.method18350();
      BlockPos var7 = var5.up();
      Direction var8 = var6.method538();
      BlockPos var9 = var5.method8349(var8);
      BlockState var10 = var4.getBlockState(var9);
      BlockPos var11 = var7.method8349(var8);
      BlockState var12 = var4.getBlockState(var11);
      Direction var13 = var6.method537();
      BlockPos var14 = var5.method8349(var13);
      BlockState var15 = var4.getBlockState(var14);
      BlockPos var16 = var7.method8349(var13);
      BlockState var17 = var4.getBlockState(var16);
      int var18 = (!var10.method23456(var4, var9) ? 0 : -1)
         + (!var12.method23456(var4, var11) ? 0 : -1)
         + (!var15.method23456(var4, var14) ? 0 : 1)
         + (!var17.method23456(var4, var16) ? 0 : 1);
      boolean var19 = var10.method23448(this) && var10.<Class84>method23463(field19297) == Class84.field210;
      boolean var20 = var15.method23448(this) && var15.<Class84>method23463(field19297) == Class84.field210;
      if ((!var19 || var20) && var18 <= 0) {
         if ((!var20 || var19) && var18 >= 0) {
            int var21 = var6.method539();
            int var22 = var6.method541();
            Vector3d var23 = var1.method18355();
            double var24 = var23.x - (double)var5.getX();
            double var26 = var23.z - (double)var5.getZ();
            return var21 < 0 && var26 < 0.5 || var21 > 0 && var26 > 0.5 || var22 < 0 && var24 > 0.5 || var22 > 0 && var24 < 0.5
               ? Class183.field665
               : Class183.field664;
         } else {
            return Class183.field664;
         }
      } else {
         return Class183.field665;
      }
   }

   @Override
   public ActionResultType method11505(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      if (this.field19004 != Class8649.field38967) {
         var1 = var1.method23459(field19294);
         var2.setBlockState(var3, var1, 10);
         var2.method6869(var4, !var1.<Boolean>method23463(field19294) ? this.method12138() : this.method12139(), var3, 0);
         return ActionResultType.method9002(var2.isRemote);
      } else {
         return ActionResultType.field14820;
      }
   }

   public boolean method12141(BlockState var1) {
      return var1.<Boolean>method23463(field19294);
   }

   public void method12142(World var1, BlockState var2, BlockPos var3, boolean var4) {
      if (var2.method23448(this) && var2.<Boolean>method23463(field19294) != var4) {
         var1.setBlockState(var3, var2.method23465(field19294, Boolean.valueOf(var4)), 10);
         this.method12143(var1, var3, var4);
      }
   }

   @Override
   public void method11506(BlockState var1, World var2, BlockPos var3, Block var4, BlockPos var5, boolean var6) {
      boolean var9 = var2.method6780(var3)
         || var2.method6780(var3.method8349(var1.method23463(field19297) != Class84.field210 ? Direction.DOWN : Direction.field673));
      if (var4 != this && var9 != var1.<Boolean>method23463(field19296)) {
         if (var9 != var1.<Boolean>method23463(field19294)) {
            this.method12143(var2, var3, var9);
         }

         var2.setBlockState(var3, var1.method23465(field19296, Boolean.valueOf(var9)).method23465(field19294, Boolean.valueOf(var9)), 2);
      }
   }

   @Override
   public boolean method11492(BlockState var1, Class1662 var2, BlockPos var3) {
      BlockPos var6 = var3.down();
      BlockState var7 = var2.getBlockState(var6);
      return var1.method23463(field19297) != Class84.field210 ? var7.method23448(this) : var7.method23454(var2, var6, Direction.field673);
   }

   private void method12143(World var1, BlockPos var2, boolean var3) {
      var1.method6869((PlayerEntity)null, !var3 ? this.method12138() : this.method12139(), var2, 0);
   }

   @Override
   public Class2315 method11689(BlockState var1) {
      return Class2315.field15863;
   }

   @Override
   public BlockState method11500(BlockState var1, Class80 var2) {
      return var1.method23465(field19293, var2.method252(var1.<Direction>method23463(field19293)));
   }

   @Override
   public BlockState method11501(BlockState var1, Class2089 var2) {
      return var2 != Class2089.field13614 ? var1.method23395(var2.method8749(var1.<Direction>method23463(field19293))).method23459(field19295) : var1;
   }

   @Override
   public long method11691(BlockState var1, BlockPos var2) {
      return MathHelper.method37810(var2.getX(), var2.method8340(var1.method23463(field19297) != Class84.field210 ? 1 : 0).getY(), var2.getZ());
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field19297, field19293, field19294, field19295, field19296);
   }

   public static boolean method12144(World var0, BlockPos var1) {
      return method12145(var0.getBlockState(var1));
   }

   public static boolean method12145(BlockState var0) {
      return var0.getBlock() instanceof Class3461 && (var0.method23384() == Class8649.field38956 || var0.method23384() == Class8649.field38957);
   }
}
