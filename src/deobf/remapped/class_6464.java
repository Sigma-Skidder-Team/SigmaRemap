package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_6464 extends class_4285<class_1941> {
   public class_6464(Codec<class_1941> var1) {
      super(var1);
   }

   public boolean method_29444(class_700 var1, class_6541 var2, Random var3, BlockPos var4, class_1941 var5) {
      while (var1.method_22548(var4) && var4.getY() > 2) {
         var4 = var4.method_6100();
      }

      if (!var1.method_28262(var4).method_8350(class_4783.field_23813)) {
         return false;
      } else {
         var4 = var4.method_6082(var3.nextInt(4));
         int var8 = var3.nextInt(4) + 7;
         int var9 = var8 / 4 + var3.nextInt(2);
         if (var9 > 1 && var3.nextInt(60) == 0) {
            var4 = var4.method_6082(10 + var3.nextInt(30));
         }

         for (int var10 = 0; var10 < var8; var10++) {
            float var11 = (1.0F - (float)var10 / (float)var8) * (float)var9;
            int var12 = MathHelper.ceil(var11);

            for (int var13 = -var12; var13 <= var12; var13++) {
               float var14 = (float) MathHelper.abs(var13) - 0.25F;

               for (int var15 = -var12; var15 <= var12; var15++) {
                  float var16 = (float) MathHelper.abs(var15) - 0.25F;
                  if ((var13 == 0 && var15 == 0 || !(var14 * var14 + var16 * var16 > var11 * var11))
                     && (var13 != -var12 && var13 != var12 && var15 != -var12 && var15 != var12 || !(var3.nextFloat() > 0.75F))) {
                     class_2522 var17 = var1.method_28262(var4.method_6104(var13, var10, var15));
                     class_6414 var18 = var17.method_8360();
                     if (var17.method_8345() || method_19910(var18) || var18 == class_4783.field_23813 || var18 == class_4783.field_23496) {
                        this.method_19906(var1, var4.method_6104(var13, var10, var15), class_4783.field_23829.method_29260());
                     }

                     if (var10 != 0 && var12 > 1) {
                        var17 = var1.method_28262(var4.method_6104(var13, -var10, var15));
                        var18 = var17.method_8360();
                        if (var17.method_8345() || method_19910(var18) || var18 == class_4783.field_23813 || var18 == class_4783.field_23496) {
                           this.method_19906(var1, var4.method_6104(var13, -var10, var15), class_4783.field_23829.method_29260());
                        }
                     }
                  }
               }
            }
         }

         int var20 = var9 - 1;
         if (var20 >= 0) {
            if (var20 > 1) {
               var20 = 1;
            }
         } else {
            var20 = 0;
         }

         for (int var21 = -var20; var21 <= var20; var21++) {
            for (int var22 = -var20; var22 <= var20; var22++) {
               BlockPos var23 = var4.method_6104(var21, -1, var22);
               int var24 = 50;
               if (Math.abs(var21) == 1 && Math.abs(var22) == 1) {
                  var24 = var3.nextInt(5);
               }

               while (var23.getY() > 50) {
                  class_2522 var25 = var1.method_28262(var23);
                  class_6414 var26 = var25.method_8360();
                  if (!var25.method_8345()
                     && !method_19910(var26)
                     && var26 != class_4783.field_23813
                     && var26 != class_4783.field_23496
                     && var26 != class_4783.field_23829) {
                     break;
                  }

                  this.method_19906(var1, var23, class_4783.field_23829.method_29260());
                  var23 = var23.method_6100();
                  if (--var24 <= 0) {
                     var23 = var23.method_6101(var3.nextInt(5) + 1);
                     var24 = var3.nextInt(5);
                  }
               }
            }
         }

         return true;
      }
   }
}
