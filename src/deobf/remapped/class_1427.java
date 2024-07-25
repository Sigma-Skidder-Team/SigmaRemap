package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_1427 extends class_4285<class_8541> {
   public class_1427(Codec<class_8541> var1) {
      super(var1);
   }

   public boolean method_6558(class_700 var1, class_6541 var2, Random var3, BlockPos var4, class_8541 var5) {
      class_6414 var8 = var5.field_43717.method_8360();
      BlockPos var9 = null;
      class_6414 var10 = var1.method_28262(var4.method_6100()).method_8360();
      if (var10 == var8) {
         var9 = var4;
      }

      if (var9 == null) {
         return false;
      } else {
         int var11 = class_9299.method_42824(var3, 4, 13);
         if (var3.nextInt(12) == 0) {
            var11 *= 2;
         }

         if (!var5.field_43718) {
            int var12 = var2.method_29826();
            if (var9.method_12165() + var11 + 1 >= var12) {
               return false;
            }
         }

         boolean var13 = !var5.field_43718 && var3.nextFloat() < 0.06F;
         var1.method_7513(var4, class_4783.field_23184.method_29260(), 4);
         this.method_6556(var1, var3, var5, var9, var11, var13);
         this.method_6560(var1, var3, var5, var9, var11, var13);
         return true;
      }
   }

   private static boolean method_6557(class_9379 var0, BlockPos var1, boolean var2) {
      return var0.method_38320(var1, var1x -> {
         class_5371 var4 = var1x.method_8362();
         return var1x.method_8362().method_24497() || var2 && var4 == class_5371.field_27440;
      });
   }

   private void method_6556(class_9379 var1, Random var2, class_8541 var3, BlockPos var4, int var5, boolean var6) {
      class_2921 var9 = new class_2921();
      class_2522 var10 = var3.field_43723;
      int var11 = !var6 ? 0 : 1;

      for (int var12 = -var11; var12 <= var11; var12++) {
         for (int var13 = -var11; var13 <= var11; var13++) {
            boolean var14 = var6 && class_9299.method_42805(var12) == var11 && class_9299.method_42805(var13) == var11;

            for (int var15 = 0; var15 < var5; var15++) {
               var9.method_13360(var4, var12, var15, var13);
               if (method_6557(var1, var9, true)) {
                  if (!var3.field_43718) {
                     if (!var14) {
                        this.method_19906(var1, var9, var10);
                     } else if (var2.nextFloat() < 0.1F) {
                        this.method_19906(var1, var9, var10);
                     }
                  } else {
                     if (!var1.method_28262(var9.method_6100()).method_8345()) {
                        var1.method_7510(var9, true);
                     }

                     var1.method_7513(var9, var10, 3);
                  }
               }
            }
         }
      }
   }

   private void method_6560(class_9379 var1, Random var2, class_8541 var3, BlockPos var4, int var5, boolean var6) {
      class_2921 var9 = new class_2921();
      boolean var10 = var3.field_43720.method_8350(class_4783.field_23273);
      int var11 = Math.min(var2.nextInt(1 + var5 / 3) + 5, var5);
      int var12 = var5 - var11;

      for (int var13 = var12; var13 <= var5; var13++) {
         int var14 = var13 >= var5 - var2.nextInt(3) ? 1 : 2;
         if (var11 > 8 && var13 < var12 + 4) {
            var14 = 3;
         }

         if (var6) {
            var14++;
         }

         for (int var15 = -var14; var15 <= var14; var15++) {
            for (int var16 = -var14; var16 <= var14; var16++) {
               boolean var17 = var15 == -var14 || var15 == var14;
               boolean var18 = var16 == -var14 || var16 == var14;
               boolean var19 = !var17 && !var18 && var13 != var5;
               boolean var20 = var17 && var18;
               boolean var21 = var13 < var12 + 3;
               var9.method_13360(var4, var15, var13, var16);
               if (method_6557(var1, var9, false)) {
                  if (var3.field_43718 && !var1.method_28262(var9.method_6100()).method_8345()) {
                     var1.method_7510(var9, true);
                  }

                  if (!var21) {
                     if (!var19) {
                        if (!var20) {
                           this.method_6561(var1, var2, var3, var9, 5.0E-4F, 0.98F, !var10 ? 0.0F : 0.07F);
                        } else {
                           this.method_6561(var1, var2, var3, var9, 0.01F, 0.7F, !var10 ? 0.0F : 0.083F);
                        }
                     } else {
                        this.method_6561(var1, var2, var3, var9, 0.1F, 0.2F, !var10 ? 0.0F : 0.1F);
                     }
                  } else if (!var19) {
                     this.method_6559(var1, var2, var9, var3.field_43720, var10);
                  }
               }
            }
         }
      }
   }

   private void method_6561(class_9379 var1, Random var2, class_8541 var3, class_2921 var4, float var5, float var6, float var7) {
      if (!(var2.nextFloat() < var5)) {
         if (var2.nextFloat() < var6) {
            this.method_19906(var1, var4, var3.field_43720);
            if (var2.nextFloat() < var7) {
               method_6555(var4, var1, var2);
            }
         }
      } else {
         this.method_19906(var1, var4, var3.field_43714);
      }
   }

   private void method_6559(class_9379 var1, Random var2, BlockPos var3, class_2522 var4, boolean var5) {
      if (!var1.method_28262(var3.method_6100()).method_8350(var4.method_8360())) {
         if ((double)var2.nextFloat() < 0.15) {
            this.method_19906(var1, var3, var4);
            if (var5 && var2.nextInt(11) == 0) {
               method_6555(var3, var1, var2);
            }
         }
      } else {
         this.method_19906(var1, var3, var4);
      }
   }

   private static void method_6555(BlockPos var0, class_9379 var1, Random var2) {
      class_2921 var5 = var0.method_6089().method_13368(Direction.field_802);
      if (var1.method_22548(var5)) {
         int var6 = class_9299.method_42824(var2, 1, 5);
         if (var2.nextInt(7) == 0) {
            var6 *= 2;
         }

         byte var7 = 23;
         byte var8 = 25;
         class_5836.method_26625(var1, var2, var5, var6, 23, 25);
      }
   }
}
