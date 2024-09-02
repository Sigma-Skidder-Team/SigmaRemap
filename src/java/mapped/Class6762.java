package mapped;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;

import java.util.EnumSet;
import javax.annotation.Nullable;

public class Class6762 extends Class6764 {
   private static String[] field29471;
   public float field29472;
   private final Long2ObjectMap<Class2163> field29473 = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<AxisAlignedBB> field29474 = new Object2BooleanOpenHashMap();

   @Override
   public void method20613(Class1667 var1, Class1006 var2) {
      super.method20613(var1, var2);
      this.field29472 = var2.method4223(Class2163.field14191);
   }

   @Override
   public void method20614() {
      this.field29476.method4224(Class2163.field14191, this.field29472);
      this.field29473.clear();
      this.field29474.clear();
      super.method20614();
   }

   @Override
   public Class7176 method20615() {
      Mutable var3 = new Mutable();
      int var4 = MathHelper.floor(this.field29476.getPosY());
      BlockState var5 = this.field29475.getBlockState(var3.method8373(this.field29476.getPosX(), (double)var4, this.field29476.getPosZ()));
      if (!this.field29476.method3107(var5.method23449().method23472())) {
         if (this.method20649() && this.field29476.method3250()) {
            while (true) {
               if (var5.getBlock() != Blocks.WATER && var5.method23449() != Class9479.field44066.method25078(false)) {
                  var4--;
                  break;
               }

               var5 = this.field29475.getBlockState(var3.method8373(this.field29476.getPosX(), (double)(++var4), this.field29476.getPosZ()));
            }
         } else if (!this.field29476.method3226()) {
            BlockPos var6 = this.field29476.getPosition();

            while (
               (this.field29475.getBlockState(var6).isAir() || this.field29475.getBlockState(var6).method23440(this.field29475, var6, Class1947.field12614))
                  && var6.getY() > 0
            ) {
               var6 = var6.down();
            }

            var4 = var6.up().getY();
         } else {
            var4 = MathHelper.floor(this.field29476.getPosY() + 0.5);
         }
      } else {
         while (this.field29476.method3107(var5.method23449().method23472())) {
            var5 = this.field29475.getBlockState(var3.method8373(this.field29476.getPosX(), (double)(++var4), this.field29476.getPosZ()));
         }

         var4--;
      }

      BlockPos var11 = this.field29476.getPosition();
      Class2163 var7 = this.method20632(this.field29476, var11.getX(), var4, var11.getZ());
      if (this.field29476.method4223(var7) < 0.0F) {
         AxisAlignedBB var8 = this.field29476.getBoundingBox();
         if (this.method20622(var3.method8373(var8.field28449, (double)var4, var8.field28451))
            || this.method20622(var3.method8373(var8.field28449, (double)var4, var8.field28454))
            || this.method20622(var3.method8373(var8.field28452, (double)var4, var8.field28451))
            || this.method20622(var3.method8373(var8.field28452, (double)var4, var8.field28454))) {
            Class7176 var9 = this.method20643(var3);
            var9.field30859 = this.method20631(this.field29476, var9.method22531());
            var9.field30858 = this.field29476.method4223(var9.field30859);
            return var9;
         }
      }

      Class7176 var12 = this.method20641(var11.getX(), var4, var11.getZ());
      var12.field30859 = this.method20631(this.field29476, var12.method22531());
      var12.field30858 = this.field29476.method4223(var12.field30859);
      return var12;
   }

   private boolean method20622(BlockPos var1) {
      Class2163 var4 = this.method20631(this.field29476, var1);
      return this.field29476.method4223(var4) >= 0.0F;
   }

   @Override
   public Class7175 method20616(double var1, double var3, double var5) {
      return new Class7175(this.method20641(MathHelper.floor(var1), MathHelper.floor(var3), MathHelper.floor(var5)));
   }

   @Override
   public int method20617(Class7176[] var1, Class7176 var2) {
      int var5 = 0;
      int var6 = 0;
      Class2163 var7 = this.method20632(this.field29476, var2.field30847, var2.field30848 + 1, var2.field30849);
      Class2163 var8 = this.method20632(this.field29476, var2.field30847, var2.field30848, var2.field30849);
      if (this.field29476.method4223(var7) >= 0.0F && var8 != Class2163.field14206) {
         var6 = MathHelper.method37767(Math.max(1.0F, this.field29476.stepHeight));
      }

      double var9 = method20626(this.field29475, new BlockPos(var2.field30847, var2.field30848, var2.field30849));
      Class7176 var11 = this.method20627(var2.field30847, var2.field30848, var2.field30849 + 1, var6, var9, Direction.SOUTH, var8);
      if (this.method20623(var11, var2)) {
         var1[var5++] = var11;
      }

      Class7176 var12 = this.method20627(var2.field30847 - 1, var2.field30848, var2.field30849, var6, var9, Direction.WEST, var8);
      if (this.method20623(var12, var2)) {
         var1[var5++] = var12;
      }

      Class7176 var13 = this.method20627(var2.field30847 + 1, var2.field30848, var2.field30849, var6, var9, Direction.EAST, var8);
      if (this.method20623(var13, var2)) {
         var1[var5++] = var13;
      }

      Class7176 var14 = this.method20627(var2.field30847, var2.field30848, var2.field30849 - 1, var6, var9, Direction.NORTH, var8);
      if (this.method20623(var14, var2)) {
         var1[var5++] = var14;
      }

      Class7176 var15 = this.method20627(var2.field30847 - 1, var2.field30848, var2.field30849 - 1, var6, var9, Direction.NORTH, var8);
      if (this.method20624(var2, var12, var14, var15)) {
         var1[var5++] = var15;
      }

      Class7176 var16 = this.method20627(var2.field30847 + 1, var2.field30848, var2.field30849 - 1, var6, var9, Direction.NORTH, var8);
      if (this.method20624(var2, var13, var14, var16)) {
         var1[var5++] = var16;
      }

      Class7176 var17 = this.method20627(var2.field30847 - 1, var2.field30848, var2.field30849 + 1, var6, var9, Direction.SOUTH, var8);
      if (this.method20624(var2, var12, var11, var17)) {
         var1[var5++] = var17;
      }

      Class7176 var18 = this.method20627(var2.field30847 + 1, var2.field30848, var2.field30849 + 1, var6, var9, Direction.SOUTH, var8);
      if (this.method20624(var2, var13, var11, var18)) {
         var1[var5++] = var18;
      }

      return var5;
   }

   private boolean method20623(Class7176 var1, Class7176 var2) {
      return var1 != null && !var1.field30856 && (var1.field30858 >= 0.0F || var2.field30858 < 0.0F);
   }

   private boolean method20624(Class7176 var1, Class7176 var2, Class7176 var3, Class7176 var4) {
      if (var4 == null || var3 == null || var2 == null) {
         return false;
      } else if (var4.field30856) {
         return false;
      } else if (var3.field30848 > var1.field30848 || var2.field30848 > var1.field30848) {
         return false;
      } else if (var2.field30859 != Class2163.field14187 && var3.field30859 != Class2163.field14187 && var4.field30859 != Class2163.field14187) {
         boolean var7 = var3.field30859 == Class2163.field14189 && var2.field30859 == Class2163.field14189 && (double)this.field29476.method3429() < 0.5;
         return var4.field30858 >= 0.0F
            && (var3.field30848 < var1.field30848 || var3.field30858 >= 0.0F || var7)
            && (var2.field30848 < var1.field30848 || var2.field30858 >= 0.0F || var7);
      } else {
         return false;
      }
   }

   private boolean method20625(Class7176 var1) {
      Vector3d var4 = new Vector3d(
         (double)var1.field30847 - this.field29476.getPosX(),
         (double)var1.field30848 - this.field29476.getPosY(),
         (double)var1.field30849 - this.field29476.getPosZ()
      );
      AxisAlignedBB var5 = this.field29476.getBoundingBox();
      int var6 = MathHelper.method37774(var4.method11348() / var5.getAverageEdgeLength());
      var4 = var4.method11344((double)(1.0F / (float)var6));

      for (int var7 = 1; var7 <= var6; var7++) {
         var5 = var5.method19669(var4);
         if (this.method20628(var5)) {
            return false;
         }
      }

      return true;
   }

   public static double method20626(Class1665 var0, BlockPos var1) {
      BlockPos var4 = var1.down();
      VoxelShape var5 = var0.getBlockState(var4).method23414(var0, var4);
      return (double)var4.getY() + (!var5.method19516() ? var5.method19513(Class113.field414) : 0.0);
   }

   @Nullable
   private Class7176 method20627(int var1, int var2, int var3, int var4, double var5, Direction var7, Class2163 var8) {
      Class7176 var11 = null;
      Mutable var12 = new Mutable();
      double var13 = method20626(this.field29475, var12.method8372(var1, var2, var3));
      if (!(var13 - var5 > 1.125)) {
         Class2163 var15 = this.method20632(this.field29476, var1, var2, var3);
         float var16 = this.field29476.method4223(var15);
         double var17 = (double)this.field29476.method3429() / 2.0;
         if (var16 >= 0.0F) {
            var11 = this.method20641(var1, var2, var3);
            var11.field30859 = var15;
            var11.field30858 = Math.max(var11.field30858, var16);
         }

         if (var8 == Class2163.field14189 && var11 != null && var11.field30858 >= 0.0F && !this.method20625(var11)) {
            var11 = null;
         }

         if (var15 == Class2163.field14186) {
            return var11;
         } else {
            if ((var11 == null || var11.field30858 < 0.0F)
               && var4 > 0
               && var15 != Class2163.field14189
               && var15 != Class2163.field14194
               && var15 != Class2163.field14188) {
               var11 = this.method20627(var1, var2 + 1, var3, var4 - 1, var5, var7, var8);
               if (var11 != null
                  && (var11.field30859 == Class2163.field14185 || var11.field30859 == Class2163.field14186)
                  && this.field29476.method3429() < 1.0F) {
                  double var19 = (double)(var1 - var7.method539()) + 0.5;
                  double var21 = (double)(var3 - var7.method541()) + 0.5;
                  AxisAlignedBB var23 = new AxisAlignedBB(
                     var19 - var17,
                     method20626(this.field29475, var12.method8373(var19, (double)(var2 + 1), var21)) + 0.001,
                     var21 - var17,
                     var19 + var17,
                     (double)this.field29476.method3430()
                        + method20626(this.field29475, var12.method8373((double)var11.field30847, (double)var11.field30848, (double)var11.field30849))
                        - 0.002,
                     var21 + var17
                  );
                  if (this.method20628(var23)) {
                     var11 = null;
                  }
               }
            }

            if (var15 == Class2163.field14191 && !this.method20649()) {
               if (this.method20632(this.field29476, var1, var2 - 1, var3) != Class2163.field14191) {
                  return var11;
               }

               while (var2 > 0) {
                  var15 = this.method20632(this.field29476, var1, --var2, var3);
                  if (var15 != Class2163.field14191) {
                     return var11;
                  }

                  var11 = this.method20641(var1, var2, var3);
                  var11.field30859 = var15;
                  var11.field30858 = Math.max(var11.field30858, this.field29476.method4223(var15));
               }
            }

            if (var15 == Class2163.field14185) {
               int var24 = 0;
               int var25 = var2;

               while (var15 == Class2163.field14185) {
                  if (--var2 < 0) {
                     Class7176 var29 = this.method20641(var1, var25, var3);
                     var29.field30859 = Class2163.field14184;
                     var29.field30858 = -1.0F;
                     return var29;
                  }

                  if (var24++ >= this.field29476.method3370()) {
                     Class7176 var28 = this.method20641(var1, var2, var3);
                     var28.field30859 = Class2163.field14184;
                     var28.field30858 = -1.0F;
                     return var28;
                  }

                  var15 = this.method20632(this.field29476, var1, var2, var3);
                  var16 = this.field29476.method4223(var15);
                  if (var15 != Class2163.field14185 && var16 >= 0.0F) {
                     var11 = this.method20641(var1, var2, var3);
                     var11.field30859 = var15;
                     var11.field30858 = Math.max(var11.field30858, var16);
                     break;
                  }

                  if (var16 < 0.0F) {
                     Class7176 var26 = this.method20641(var1, var2, var3);
                     var26.field30859 = Class2163.field14184;
                     var26.field30858 = -1.0F;
                     return var26;
                  }
               }
            }

            if (var15 == Class2163.field14189) {
               var11 = this.method20641(var1, var2, var3);
               var11.field30856 = true;
               var11.field30859 = var15;
               var11.field30858 = var15.method8884();
            }

            return var11;
         }
      } else {
         return null;
      }
   }

   private boolean method20628(AxisAlignedBB var1) {
      return (Boolean)this.field29474.computeIfAbsent(var1, var2 -> !this.field29475.method7053(this.field29476, var1));
   }

   @Override
   public Class2163 method20629(Class1665 var1, int var2, int var3, int var4, Class1006 var5, int var6, int var7, int var8, boolean var9, boolean var10) {
      EnumSet<Class2163> var13 = EnumSet.noneOf(Class2163.class);
      Class2163 var14 = Class2163.field14184;
      BlockPos var15 = var5.getPosition();
      var14 = this.method20630(var1, var2, var3, var4, var6, var7, var8, var9, var10, var13, var14, var15);
      if (var13.contains(Class2163.field14189)) {
         return Class2163.field14189;
      } else if (var13.contains(Class2163.field14194)) {
         return Class2163.field14194;
      } else {
         Class2163 var16 = Class2163.field14184;

         for (Class2163 var18 : var13) {
            if (var5.method4223(var18) < 0.0F) {
               return var18;
            }

            if (var5.method4223(var18) >= var5.method4223(var16)) {
               var16 = var18;
            }
         }

         return var14 == Class2163.field14185 && var5.method4223(var16) == 0.0F && var6 <= 1 ? Class2163.field14185 : var16;
      }
   }

   public Class2163 method20630(
      Class1665 var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      boolean var8,
      boolean var9,
      EnumSet<Class2163> var10,
      Class2163 var11,
      BlockPos var12
   ) {
      for (int var15 = 0; var15 < var5; var15++) {
         for (int var16 = 0; var16 < var6; var16++) {
            for (int var17 = 0; var17 < var7; var17++) {
               int var18 = var15 + var2;
               int var19 = var16 + var3;
               int var20 = var17 + var4;
               Class2163 var21 = this.method20621(var1, var18, var19, var20);
               var21 = this.method20620(var1, var8, var9, var12, var21);
               if (var15 == 0 && var16 == 0 && var17 == 0) {
                  var11 = var21;
               }

               var10.add(var21);
            }
         }
      }

      return var11;
   }

   public Class2163 method20620(Class1665 var1, boolean var2, boolean var3, BlockPos var4, Class2163 var5) {
      if (var5 == Class2163.field14202 && var2 && var3) {
         var5 = Class2163.field14187;
      }

      if (var5 == Class2163.field14201 && !var3) {
         var5 = Class2163.field14184;
      }

      if (var5 == Class2163.field14193
         && !(var1.getBlockState(var4).getBlock() instanceof Class3429)
         && !(var1.getBlockState(var4.down()).getBlock() instanceof Class3429)) {
         var5 = Class2163.field14194;
      }

      if (var5 == Class2163.field14205) {
         var5 = Class2163.field14184;
      }

      return var5;
   }

   private Class2163 method20631(Class1006 var1, BlockPos var2) {
      return this.method20632(var1, var2.getX(), var2.getY(), var2.getZ());
   }

   private Class2163 method20632(Class1006 var1, int var2, int var3, int var4) {
      return (Class2163)this.field29473
         .computeIfAbsent(
            BlockPos.method8333(var2, var3, var4),
            var5 -> this.method20629(
                  this.field29475, var2, var3, var4, var1, this.field29478, this.field29479, this.field29480, this.method20648(), this.method20647()
               )
         );
   }

   @Override
   public Class2163 method20621(Class1665 var1, int var2, int var3, int var4) {
      return method20633(var1, new Mutable(var2, var3, var4));
   }

   public static Class2163 method20633(Class1665 var0, Mutable var1) {
      int var4 = var1.getX();
      int var5 = var1.getY();
      int var6 = var1.getZ();
      Class2163 var7 = method20635(var0, var1);
      if (var7 == Class2163.field14185 && var5 >= 1) {
         Class2163 var8 = method20635(var0, var1.method8372(var4, var5 - 1, var6));
         var7 = var8 != Class2163.field14186 && var8 != Class2163.field14185 && var8 != Class2163.field14191 && var8 != Class2163.field14190
            ? Class2163.field14186
            : Class2163.field14185;
         if (var8 == Class2163.field14196) {
            var7 = Class2163.field14196;
         }

         if (var8 == Class2163.field14198) {
            var7 = Class2163.field14198;
         }

         if (var8 == Class2163.field14200) {
            var7 = Class2163.field14200;
         }

         if (var8 == Class2163.field14206) {
            var7 = Class2163.field14206;
         }
      }

      if (var7 == Class2163.field14186) {
         var7 = method20634(var0, var1.method8372(var4, var5, var6), var7);
      }

      return var7;
   }

   public static Class2163 method20634(Class1665 var0, Mutable var1, Class2163 var2) {
      int var5 = var1.getX();
      int var6 = var1.getY();
      int var7 = var1.getZ();

      for (int var8 = -1; var8 <= 1; var8++) {
         for (int var9 = -1; var9 <= 1; var9++) {
            for (int var10 = -1; var10 <= 1; var10++) {
               if (var8 != 0 || var10 != 0) {
                  var1.method8372(var5 + var8, var6 + var9, var7 + var10);
                  BlockState var11 = var0.getBlockState(var1);
                  if (var11.method23448(Blocks.CACTUS)) {
                     return Class2163.field14197;
                  }

                  if (var11.method23448(Blocks.field37069)) {
                     return Class2163.field14199;
                  }

                  if (method20636(var11)) {
                     return Class2163.field14195;
                  }

                  if (var0.getFluidState(var1).method23486(Class8953.field40469)) {
                     return Class2163.field14192;
                  }
               }
            }
         }
      }

      return var2;
   }

   public static Class2163 method20635(Class1665 var0, BlockPos var1) {
      BlockState var4 = var0.getBlockState(var1);
      Block var5 = var4.getBlock();
      Class8649 var6 = var4.method23384();
      if (var4.isAir()) {
         return Class2163.field14185;
      } else if (var4.method23446(BlockTags.field32768) || var4.method23448(Blocks.LILY_PAD)) {
         return Class2163.field14188;
      } else if (var4.method23448(Blocks.CACTUS)) {
         return Class2163.field14198;
      } else if (var4.method23448(Blocks.field37069)) {
         return Class2163.field14200;
      } else if (var4.method23448(Blocks.field37119)) {
         return Class2163.field14206;
      } else if (var4.method23448(Blocks.COCOA)) {
         return Class2163.field14207;
      } else {
         FluidState var7 = var0.getFluidState(var1);
         if (var7.method23486(Class8953.field40469)) {
            return Class2163.field14191;
         } else if (var7.method23486(Class8953.field40470)) {
            return Class2163.field14190;
         } else if (method20636(var4)) {
            return Class2163.field14196;
         } else if (Class3461.method12145(var4) && !var4.<Boolean>method23463(Class3461.field19294)) {
            return Class2163.field14202;
         } else if (var5 instanceof Class3461 && var6 == Class8649.field38967 && !var4.<Boolean>method23463(Class3461.field19294)) {
            return Class2163.field14203;
         } else if (var5 instanceof Class3461 && var4.<Boolean>method23463(Class3461.field19294)) {
            return Class2163.field14201;
         } else if (var5 instanceof Class3429) {
            return Class2163.field14193;
         } else if (var5 instanceof Class3465) {
            return Class2163.field14205;
         } else if (!var5.method11540(BlockTags.field32771)
            && !var5.method11540(BlockTags.field32764)
            && (!(var5 instanceof Class3199) || var4.<Boolean>method23463(Class3199.field18486))) {
            return var4.method23440(var0, var1, Class1947.field12614) ? Class2163.field14185 : Class2163.field14184;
         } else {
            return Class2163.field14189;
         }
      }
   }

   private static boolean method20636(BlockState var0) {
      return var0.method23446(BlockTags.field32798)
         || var0.method23448(Blocks.LAVA)
         || var0.method23448(Blocks.field36890)
         || Class3244.method11655(var0);
   }
}
