package remapped;

import java.util.function.Predicate;

public class class_2100 extends class_551 implements class_1538 {
   private static String[] field_10539;

   public class_2100(class_317 var1) {
      super(var1);
   }

   @Override
   public void method_11206(class_6098 var1, World var2, class_5834 var3, int var4) {
      if (var3 instanceof class_704) {
         class_704 var7 = (class_704)var3;
         boolean var8 = var7.field_3876.field_4944 || class_2931.method_13423(class_3668.field_17874, var1) > 0;
         class_6098 var9 = var7.method_26475(var1);
         if (!var9.method_28022() || var8) {
            if (var9.method_28022()) {
               var9 = new class_6098(class_4897.field_25024);
            }

            int var10 = this.method_11230(var1) - var4;
            float var11 = method_9852(var10);
            if (!((double)var11 < 0.1)) {
               boolean var12 = var8 && var9.method_27960() == class_4897.field_25024;
               if (!var2.field_33055) {
                  class_603 var13 = (class_603)(!(var9.method_27960() instanceof class_603) ? class_4897.field_25024 : var9.method_27960());
                  class_6749 var14 = var13.method_2819(var2, var9, var7);
                  var14.method_26158(var7, var7.field_41755, var7.field_41701, 0.0F, var11 * 3.0F, 1.0F);
                  if (var11 == 1.0F) {
                     var14.method_30918(true);
                  }

                  int var15 = class_2931.method_13423(class_3668.field_17850, var1);
                  if (var15 > 0) {
                     var14.method_30924(var14.method_30928() + (double)var15 * 0.5 + 0.5);
                  }

                  int var16 = class_2931.method_13423(class_3668.field_17845, var1);
                  if (var16 > 0) {
                     var14.method_30940(var16);
                  }

                  if (class_2931.method_13423(class_3668.field_17855, var1) > 0) {
                     var14.method_37178(100);
                  }

                  var1.method_28003(1, var7, var1x -> var1x.method_26447(var7.method_26500()));
                  if (var12 || var7.field_3876.field_4944 && (var9.method_27960() == class_4897.field_25049 || var9.method_27960() == class_4897.field_25013)) {
                     var14.field_34835 = class_4237.field_20565;
                  }

                  var2.method_7509(var14);
               }

               var2.method_29528(
                  (class_704)null,
                  var7.method_37302(),
                  var7.method_37309(),
                  var7.method_37156(),
                  class_463.field_2702,
                  class_562.field_3335,
                  1.0F,
                  1.0F / (field_12172.nextFloat() * 0.4F + 1.2F) + var11 * 0.5F
               );
               if (!var12 && !var7.field_3876.field_4944) {
                  var9.method_27970(1);
                  if (var9.method_28022()) {
                     var7.field_3853.method_32419(var9);
                  }
               }

               var7.method_3211(class_6234.field_31907.method_43790(this));
            }
         }
      }
   }

   public static float method_9852(int var0) {
      float var3 = (float)var0 / 20.0F;
      var3 = (var3 * var3 + var3 * 2.0F) / 3.0F;
      if (var3 > 1.0F) {
         var3 = 1.0F;
      }

      return var3;
   }

   @Override
   public int method_11230(class_6098 var1) {
      return 72000;
   }

   @Override
   public class_6209 method_11233(class_6098 var1) {
      return class_6209.field_31738;
   }

   @Override
   public class_954<class_6098> method_11231(World var1, class_704 var2, class_2584 var3) {
      class_6098 var6 = var2.method_26617(var3);
      boolean var7 = !var2.method_26475(var6).method_28022();
      if (!var2.field_3876.field_4944 && !var7) {
         return class_954.<class_6098>method_4202(var6);
      } else {
         var2.method_26462(var3);
         return class_954.<class_6098>method_4206(var6);
      }
   }

   @Override
   public Predicate<class_6098> method_2655() {
      return field_3286;
   }

   @Override
   public int method_2654() {
      return 15;
   }
}
