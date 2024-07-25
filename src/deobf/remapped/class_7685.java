package remapped;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class class_7685 {
   private static String[] field_39045;

   public static Iterator<class_3511> method_34827(ClientWorld var0, double var1, Entity var3, int var4, class_7626 var5) {
      float var8 = class_6588.method_30251();
      if (!(var8 <= 0.0F) && !(var8 >= (float)((var4 - 1) * 16))) {
         int var19 = class_9299.method_42816(var8 / 16.0F) + 1;
         float var10 = var0.method_29553((float)var1);
         float var11 = class_6588.field_33824 * class_9299.field_47452;
         float var12 = var10 > class_9299.field_47439 && var10 < 3.0F * class_9299.field_47439 ? var10 + class_9299.field_47442 : var10;
         float var13 = -class_9299.method_42818(var12);
         float var14 = class_9299.method_42840(var12) * class_9299.method_42840(var11);
         float var15 = -class_9299.method_42840(var12) * class_9299.method_42818(var11);
         class_1331 var16 = new class_1331(
            class_9299.method_42847(var3.method_37302()) >> 4,
            class_9299.method_42847(var3.method_37309()) >> 4,
            class_9299.method_42847(var3.method_37156()) >> 4
         );
         class_1331 var17 = var16.method_6103((double)(-var13 * (float)var19), (double)(-var14 * (float)var19), (double)(-var15 * (float)var19));
         class_1331 var18 = var16.method_6103((double)(var13 * (float)var4), (double)(var14 * (float)var4), (double)(var15 * (float)var4));
         return new class_5126(var5, var17, var18, var19, var19);
      } else {
         List var9 = Arrays.<class_3511>asList(var5.field_38807);
         return var9.iterator();
      }
   }
}
