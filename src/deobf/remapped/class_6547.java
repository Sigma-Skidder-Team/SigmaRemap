package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class class_6547 extends class_3982 {
   public class_6547(Codec<class_1926> var1) {
      super(var1);
   }

   @Override
   public void method_18373(class_9379 var1, Random var2, BlockPos var3, int var4, class_2921 var5, class_1926 var6) {
      int var9 = var6.field_9859;

      for (int var10 = -var9; var10 <= var9; var10++) {
         for (int var11 = -var9; var11 <= var9; var11++) {
            boolean var12 = var10 == -var9;
            boolean var13 = var10 == var9;
            boolean var14 = var11 == -var9;
            boolean var15 = var11 == var9;
            boolean var16 = var12 || var13;
            boolean var17 = var14 || var15;
            if (!var16 || !var17) {
               var5.method_13360(var3, var10, var4, var11);
               if (!var1.method_28262(var5).method_8321(var1, var5)) {
                  boolean var18 = var12 || var17 && var10 == 1 - var9;
                  boolean var19 = var13 || var17 && var10 == var9 - 1;
                  boolean var20 = var14 || var16 && var11 == 1 - var9;
                  boolean var21 = var15 || var16 && var11 == var9 - 1;
                  this.method_19906(
                     var1,
                     var5,
                     var6.field_9855
                        .method_35002(var2, var3)
                        .method_10308(class_5970.field_30402, Boolean.valueOf(var18))
                        .method_10308(class_5970.field_30408, Boolean.valueOf(var19))
                        .method_10308(class_5970.field_30404, Boolean.valueOf(var20))
                        .method_10308(class_5970.field_30403, Boolean.valueOf(var21))
                  );
               }
            }
         }
      }
   }

   @Override
   public int method_18370(int var1, int var2, int var3, int var4) {
      return var4 > 3 ? var3 : 0;
   }
}
