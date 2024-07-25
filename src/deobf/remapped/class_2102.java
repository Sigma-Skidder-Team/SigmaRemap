package remapped;

import com.google.common.collect.Maps;
import java.util.Map;

public class class_2102 extends class_7164<class_496, class_1253<class_496>> {
   private static final Map<class_1360, class_4639> field_10542 = class_9665.<Map<class_1360, class_4639>>method_44659(
      Maps.newEnumMap(class_1360.class), var0 -> {
         var0.put(class_1360.field_7401, new class_4639("textures/entity/panda/panda.png"));
         var0.put(class_1360.field_7402, new class_4639("textures/entity/panda/lazy_panda.png"));
         var0.put(class_1360.field_7409, new class_4639("textures/entity/panda/worried_panda.png"));
         var0.put(class_1360.field_7400, new class_4639("textures/entity/panda/playful_panda.png"));
         var0.put(class_1360.field_7410, new class_4639("textures/entity/panda/brown_panda.png"));
         var0.put(class_1360.field_7406, new class_4639("textures/entity/panda/weak_panda.png"));
         var0.put(class_1360.field_7403, new class_4639("textures/entity/panda/aggressive_panda.png"));
      }
   );

   public class_2102(class_6122 var1) {
      super(var1, new class_1253<class_496>(9, 0.0F), 0.9F);
      this.method_29100(new class_9197(this));
   }

   public class_4639 method_9855(class_496 var1) {
      return field_10542.getOrDefault(var1.method_2448(), field_10542.get(class_1360.field_7401));
   }

   public void method_9854(class_496 var1, class_7966 var2, float var3, float var4, float var5) {
      super.method_29099(var1, var2, var3, var4, var5);
      if (var1.field_3086 > 0) {
         int var8 = var1.field_3086;
         int var9 = var8 + 1;
         float var10 = 7.0F;
         float var11 = !var1.method_26449() ? 0.8F : 0.3F;
         if (var8 >= 8) {
            if (var8 >= 16) {
               if (!((float)var8 < 24.0F)) {
                  if (var8 < 32) {
                     float var12 = ((float)var8 - 24.0F) / 7.0F;
                     float var13 = 270.0F + 90.0F * var12;
                     float var14 = 270.0F + 90.0F * ((float)var9 - 24.0F) / 7.0F;
                     float var15 = this.method_9856(var13, var14, var9, var5, 32.0F);
                     var2.method_36065(0.0, (double)(var11 * ((360.0F - var15) / 90.0F)), 0.0);
                     var2.method_36060(class_2426.field_12080.method_11074(-var15));
                  }
               } else {
                  float var20 = ((float)var8 - 16.0F) / 7.0F;
                  float var23 = 180.0F + 90.0F * var20;
                  float var26 = 180.0F + 90.0F * ((float)var9 - 16.0F) / 7.0F;
                  float var29 = this.method_9856(var23, var26, var9, var5, 24.0F);
                  var2.method_36065(0.0, (double)(var11 + var11 * (270.0F - var29) / 90.0F), 0.0);
                  var2.method_36060(class_2426.field_12080.method_11074(-var29));
               }
            } else {
               float var21 = ((float)var8 - 8.0F) / 7.0F;
               float var24 = 90.0F + 90.0F * var21;
               float var27 = 90.0F + 90.0F * ((float)var9 - 8.0F) / 7.0F;
               float var30 = this.method_9856(var24, var27, var9, var5, 16.0F);
               var2.method_36065(0.0, (double)(var11 + 0.2F + (var11 - 0.2F) * (var30 - 90.0F) / 90.0F), 0.0);
               var2.method_36060(class_2426.field_12080.method_11074(-var30));
            }
         } else {
            float var22 = (float)(90 * var8) / 7.0F;
            float var25 = (float)(90 * var9) / 7.0F;
            float var28 = this.method_9856(var22, var25, var9, var5, 8.0F);
            var2.method_36065(0.0, (double)((var11 + 0.2F) * (var28 / 90.0F)), 0.0);
            var2.method_36060(class_2426.field_12080.method_11074(-var28));
         }
      }

      float var16 = var1.method_2411(var5);
      if (var16 > 0.0F) {
         var2.method_36065(0.0, (double)(0.8F * var16), 0.0);
         var2.method_36060(class_2426.field_12080.method_11074(class_9299.method_42795(var16, var1.field_41755, var1.field_41755 + 90.0F)));
         var2.method_36065(0.0, (double)(-1.0F * var16), 0.0);
         if (var1.method_2421()) {
            float var17 = (float)(Math.cos((double)var1.field_41697 * 1.25) * Math.PI * 0.05F);
            var2.method_36060(class_2426.field_12074.method_11074(var17));
            if (var1.method_26449()) {
               var2.method_36065(0.0, 0.8F, 0.55F);
            }
         }
      }

      float var18 = var1.method_2420(var5);
      if (var18 > 0.0F) {
         float var19 = !var1.method_26449() ? 1.3F : 0.5F;
         var2.method_36065(0.0, (double)(var19 * var18), 0.0);
         var2.method_36060(class_2426.field_12080.method_11074(class_9299.method_42795(var18, var1.field_41755, var1.field_41755 + 180.0F)));
      }
   }

   private float method_9856(float var1, float var2, int var3, float var4, float var5) {
      return !((float)var3 < var5) ? var1 : class_9299.method_42795(var4, var1, var2);
   }
}
