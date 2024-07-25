package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_4258 extends class_3982 {
   public class_4258(Codec<class_1926> var1) {
      super(var1);
   }

   @Override
   public void method_18373(class_9379 var1, Random var2, BlockPos var3, int var4, class_2921 var5, class_1926 var6) {
      for (int var9 = var4 - 3; var9 <= var4; var9++) {
         int var10 = var9 >= var4 ? var6.field_9859 - 1 : var6.field_9859;
         int var11 = var6.field_9859 - 2;

         for (int var12 = -var10; var12 <= var10; var12++) {
            for (int var13 = -var10; var13 <= var10; var13++) {
               boolean var14 = var12 == -var10;
               boolean var15 = var12 == var10;
               boolean var16 = var13 == -var10;
               boolean var17 = var13 == var10;
               boolean var18 = var14 || var15;
               boolean var19 = var16 || var17;
               if (var9 >= var4 || var18 != var19) {
                  var5.method_13360(var3, var12, var9, var13);
                  if (!var1.method_28262(var5).method_8321(var1, var5)) {
                     this.method_19906(
                        var1,
                        var5,
                        var6.field_9855
                           .method_35002(var2, var3)
                           .method_10308(class_5970.field_30406, Boolean.valueOf(var9 >= var4 - 1))
                           .method_10308(class_5970.field_30402, Boolean.valueOf(var12 < -var11))
                           .method_10308(class_5970.field_30408, Boolean.valueOf(var12 > var11))
                           .method_10308(class_5970.field_30404, Boolean.valueOf(var13 < -var11))
                           .method_10308(class_5970.field_30403, Boolean.valueOf(var13 > var11))
                     );
                  }
               }
            }
         }
      }
   }

   @Override
   public int method_18370(int var1, int var2, int var3, int var4) {
      int var7 = 0;
      if (var4 < var2 && var4 >= var2 - 3) {
         var7 = var3;
      } else if (var4 == var2) {
         var7 = var3;
      }

      return var7;
   }
}
