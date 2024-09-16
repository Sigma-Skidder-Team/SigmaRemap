package mapped;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

public class Class6898 extends Class6896 {
   private static String[] field29890;
   public static final Codec<Class6898> field29891 = RecordCodecBuilder.create(var0 -> method21063(var0).apply(var0, Class6898::new));

   public Class6898(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   public Class9107<?> method21064() {
      return Class9107.field41836;
   }

   @Override
   public List<Class9359> method21065(Class1679 var1, Random var2, int var3, BlockPos var4, Set<BlockPos> var5, Class9764 var6, Class4733 var7) {
      int var11 = var3 + 2;
      int var12 = MathHelper.floor((double)var11 * 0.618);
      if (!var7.field22414) {
         method21069(var1, var4.down());
      }

      double var13 = 1.0;
      int var15 = Math.min(1, MathHelper.floor(1.382 + Math.pow(1.0 * (double)var11 / 13.0, 2.0)));
      int var16 = var4.getY() + var12;
      int var17 = var11 - 5;
      List<Class8765> var18 = Lists.newArrayList();
      var18.add(new Class8765(var4.method8339(var17), var16));

      for (; var17 >= 0; var17--) {
         float var19 = this.method21082(var11, var17);
         if (!(var19 < 0.0F)) {
            for (int var20 = 0; var20 < var15; var20++) {
               double var21 = 1.0;
               double var23 = 1.0 * (double)var19 * ((double)var2.nextFloat() + 0.328);
               double var25 = (double)(var2.nextFloat() * 2.0F) * Math.PI;
               double var27 = var23 * Math.sin(var25) + 0.5;
               double var29 = var23 * Math.cos(var25) + 0.5;
               BlockPos var31 = var4.method8335(var27, (double)(var17 - 1), var29);
               BlockPos var32 = var31.method8339(5);
               if (this.method21077(var1, var2, var31, var32, false, var5, var6, var7)) {
                  int var33 = var4.getX() - var31.getX();
                  int var34 = var4.getZ() - var31.getZ();
                  double var35 = (double)var31.getY() - Math.sqrt((double)(var33 * var33 + var34 * var34)) * 0.381;
                  int var37 = !(var35 > (double)var16) ? (int)var35 : var16;
                  BlockPos var38 = new BlockPos(var4.getX(), var37, var4.getZ());
                  if (this.method21077(var1, var2, var38, var31, false, var5, var6, var7)) {
                     var18.add(new Class8765(var31, var38.getY()));
                  }
               }
            }
         }
      }

      this.method21077(var1, var2, var4, var4.method8339(var12), true, var5, var6, var7);
      this.method21081(var1, var2, var11, var4, var18, var5, var6, var7);
      ArrayList var40 = Lists.newArrayList();

      for (Class8765 var39 : var18) {
         if (this.method21080(var11, var39.method31621() - var4.getY())) {
            var40.add(Class8765.method31622(var39));
         }
      }

      return var40;
   }

   private boolean method21077(Class1679 var1, Random var2, BlockPos var3, BlockPos var4, boolean var5, Set<BlockPos> var6, Class9764 var7, Class4733 var8) {
      if (!var5 && Objects.equals(var3, var4)) {
         return true;
      } else {
         BlockPos var11 = var4.method8336(-var3.getX(), -var3.getY(), -var3.getZ());
         int var12 = this.method21078(var11);
         float var13 = (float)var11.getX() / (float)var12;
         float var14 = (float)var11.getY() / (float)var12;
         float var15 = (float)var11.getZ() / (float)var12;

         for (int var16 = 0; var16 <= var12; var16++) {
            BlockPos var17 = var3.method8335(
               (double)(0.5F + (float)var16 * var13), (double)(0.5F + (float)var16 * var14), (double)(0.5F + (float)var16 * var15)
            );
            if (!var5) {
               if (!Class2903.method11226(var1, var17)) {
                  return false;
               }
            } else {
               method21067(var1, var17, var8.field22411.method20424(var2, var17).method23465(Class3386.field18994, this.method21079(var3, var17)), var7);
               var6.add(var17.toImmutable());
            }
         }

         return true;
      }
   }

   private int method21078(BlockPos var1) {
      int var4 = MathHelper.method37772(var1.getX());
      int var5 = MathHelper.method37772(var1.getY());
      int var6 = MathHelper.method37772(var1.getZ());
      return Math.max(var4, Math.max(var5, var6));
   }

   private Direction method21079(BlockPos var1, BlockPos var2) {
      Direction var5 = Direction.field414;
      int var6 = Math.abs(var2.getX() - var1.getX());
      int var7 = Math.abs(var2.getZ() - var1.getZ());
      int var8 = Math.max(var6, var7);
      if (var8 > 0) {
         if (var6 != var8) {
            var5 = Direction.field415;
         } else {
            var5 = Direction.field413;
         }
      }

      return var5;
   }

   private boolean method21080(int var1, int var2) {
      return (double)var2 >= (double)var1 * 0.2;
   }

   private void method21081(Class1679 var1, Random var2, int var3, BlockPos var4, List<Class8765> var5, Set<BlockPos> var6, Class9764 var7, Class4733 var8) {
      for (Class8765 var12 : var5) {
         int var13 = var12.method31621();
         BlockPos var14 = new BlockPos(var4.getX(), var13, var4.getZ());
         if (!var14.equals(Class8765.method31622(var12).method35437()) && this.method21080(var3, var13 - var4.getY())) {
            this.method21077(var1, var2, var14, Class8765.method31622(var12).method35437(), true, var6, var7, var8);
         }
      }
   }

   private float method21082(int var1, int var2) {
      if (!((float)var2 < (float)var1 * 0.3F)) {
         float var5 = (float)var1 / 2.0F;
         float var6 = var5 - (float)var2;
         float var7 = MathHelper.method37765(var5 * var5 - var6 * var6);
         if (var6 != 0.0F) {
            if (Math.abs(var6) >= var5) {
               return 0.0F;
            }
         } else {
            var7 = var5;
         }

         return var7 * 0.5F;
      } else {
         return -1.0F;
      }
   }
}
