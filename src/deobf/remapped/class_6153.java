package remapped;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

public class class_6153 extends class_1131 {
   private static String[] field_31523;
   public static final Codec<class_6153> field_31522 = RecordCodecBuilder.create(var0 -> method_4972(var0).apply(var0, class_6153::new));

   public class_6153(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   public class_7027<?> method_4970() {
      return class_7027.field_36191;
   }

   @Override
   public List<class_8070> method_4966(class_6755 var1, Random var2, int var3, BlockPos var4, Set<BlockPos> var5, class_9616 var6, class_1297 var7) {
      byte var10 = 5;
      int var11 = var3 + 2;
      int var12 = MathHelper.floor((double)var11 * 0.618);
      if (!var7.field_7153) {
         method_4969(var1, var4.method_6100());
      }

      double var13 = 1.0;
      int var15 = Math.min(1, MathHelper.floor(1.382 + Math.pow(1.0 * (double)var11 / 13.0, 2.0)));
      int var16 = var4.method_12165() + var12;
      int var17 = var11 - 5;
      ArrayList var18 = Lists.newArrayList();
      var18.add(new class_5811(var4.method_6082(var17), var16));

      for (; var17 >= 0; var17--) {
         float var19 = this.method_28230(var11, var17);
         if (!(var19 < 0.0F)) {
            for (int var20 = 0; var20 < var15; var20++) {
               double var21 = 1.0;
               double var23 = 1.0 * (double)var19 * ((double)var2.nextFloat() + 0.328);
               double var25 = (double)(var2.nextFloat() * 2.0F) * Math.PI;
               double var27 = var23 * Math.sin(var25) + 0.5;
               double var29 = var23 * Math.cos(var25) + 0.5;
               BlockPos var31 = var4.method_6103(var27, (double)(var17 - 1), var29);
               BlockPos var32 = var31.method_6082(5);
               if (this.method_28231(var1, var2, var31, var32, false, var5, var6, var7)) {
                  int var33 = var4.getX() - var31.getX();
                  int var34 = var4.method_12185() - var31.method_12185();
                  double var35 = (double)var31.method_12165() - Math.sqrt((double)(var33 * var33 + var34 * var34)) * 0.381;
                  int var37 = !(var35 > (double)var16) ? (int)var35 : var16;
                  BlockPos var38 = new BlockPos(var4.getX(), var37, var4.method_12185());
                  if (this.method_28231(var1, var2, var38, var31, false, var5, var6, var7)) {
                     var18.add(new class_5811(var31, var38.method_12165()));
                  }
               }
            }
         }
      }

      this.method_28231(var1, var2, var4, var4.method_6082(var12), true, var5, var6, var7);
      this.method_28229(var1, var2, var11, var4, var18, var5, var6, var7);
      ArrayList var40 = Lists.newArrayList();

      for (class_5811 var39 : var18) {
         if (this.method_28234(var11, var39.method_26317() - var4.method_12165())) {
            var40.add(class_5811.method_26316(var39));
         }
      }

      return var40;
   }

   private boolean method_28231(
           class_6755 var1, Random var2, BlockPos var3, BlockPos var4, boolean var5, Set<BlockPos> var6, class_9616 var7, class_1297 var8
   ) {
      if (!var5 && Objects.equals(var3, var4)) {
         return true;
      } else {
         BlockPos var11 = var4.method_6104(-var3.getX(), -var3.method_12165(), -var3.method_12185());
         int var12 = this.method_28233(var11);
         float var13 = (float)var11.getX() / (float)var12;
         float var14 = (float)var11.method_12165() / (float)var12;
         float var15 = (float)var11.method_12185() / (float)var12;

         for (int var16 = 0; var16 <= var12; var16++) {
            BlockPos var17 = var3.method_6103(
               (double)(0.5F + (float)var16 * var13), (double)(0.5F + (float)var16 * var14), (double)(0.5F + (float)var16 * var15)
            );
            if (!var5) {
               if (!class_8739.method_40122(var1, var17)) {
                  return false;
               }
            } else {
               method_4967(var1, var17, var8.field_7145.method_35002(var2, var17).method_10308(class_7947.field_40671, this.method_28232(var3, var17)), var7);
               var6.add(var17.method_6072());
            }
         }

         return true;
      }
   }

   private int method_28233(BlockPos var1) {
      int var4 = MathHelper.abs(var1.getX());
      int var5 = MathHelper.abs(var1.method_12165());
      int var6 = MathHelper.abs(var1.method_12185());
      return Math.max(var4, Math.max(var5, var6));
   }

   private class_9249 method_28232(BlockPos var1, BlockPos var2) {
      class_9249 var5 = class_9249.field_47216;
      int var6 = Math.abs(var2.getX() - var1.getX());
      int var7 = Math.abs(var2.method_12185() - var1.method_12185());
      int var8 = Math.max(var6, var7);
      if (var8 > 0) {
         if (var6 != var8) {
            var5 = class_9249.field_47219;
         } else {
            var5 = class_9249.field_47215;
         }
      }

      return var5;
   }

   private boolean method_28234(int var1, int var2) {
      return (double)var2 >= (double)var1 * 0.2;
   }

   private void method_28229(
           class_6755 var1, Random var2, int var3, BlockPos var4, List<class_5811> var5, Set<BlockPos> var6, class_9616 var7, class_1297 var8
   ) {
      for (class_5811 var12 : var5) {
         int var13 = var12.method_26317();
         BlockPos var14 = new BlockPos(var4.getX(), var13, var4.method_12185());
         if (!var14.equals(class_5811.method_26316(var12).method_36623()) && this.method_28234(var3, var13 - var4.method_12165())) {
            this.method_28231(var1, var2, var14, class_5811.method_26316(var12).method_36623(), true, var6, var7, var8);
         }
      }
   }

   private float method_28230(int var1, int var2) {
      if (!((float)var2 < (float)var1 * 0.3F)) {
         float var5 = (float)var1 / 2.0F;
         float var6 = var5 - (float)var2;
         float var7 = MathHelper.sqrt(var5 * var5 - var6 * var6);
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
