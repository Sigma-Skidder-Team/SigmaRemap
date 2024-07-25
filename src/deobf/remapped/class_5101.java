package remapped;

import java.util.List;
import java.util.function.Predicate;

public class class_5101 extends class_2451 {
   private static String[] field_26317;
   private static final Predicate<class_8145> field_26316 = class_3572.field_17483.and(class_8145::method_37167);
   private final class_3837 field_26315;

   public class_5101(class_3837 var1, class_317 var2) {
      super(var2);
      this.field_26315 = var1;
   }

   @Override
   public class_954<class_6098> method_11231(class_6486 var1, class_704 var2, class_2584 var3) {
      class_6098 var6 = var2.method_26617(var3);
      class_9529 var7 = method_11238(var1, var2, class_9583.field_48752);
      if (var7.method_33990() == class_1430.field_7721) {
         return class_954.<class_6098>method_4207(var6);
      } else {
         class_1343 var8 = var2.method_37307(1.0F);
         double var9 = 5.0;
         List var11 = var1.method_25867(var2, var2.method_37241().method_18929(var8.method_6209(5.0)).method_18898(1.0), field_26316);
         if (!var11.isEmpty()) {
            class_1343 var12 = var2.method_37335(1.0F);

            for (class_8145 var14 : var11) {
               class_4092 var15 = var14.method_37241().method_18898((double)var14.method_37355());
               if (var15.method_18903(var12)) {
                  return class_954.<class_6098>method_4207(var6);
               }
            }
         }

         if (var7.method_33990() != class_1430.field_7717) {
            return class_954.<class_6098>method_4207(var6);
         } else {
            class_9149 var16 = new class_9149(var1, var7.method_33993().field_7336, var7.method_33993().field_7333, var7.method_33993().field_7334);
            var16.method_42101(this.field_26315);
            var16.field_41701 = var2.field_41701;
            if (var1.method_6683(var16, var16.method_37241().method_18898(-0.1))) {
               if (!var1.field_33055) {
                  var1.method_7509(var16);
                  if (!var2.field_3876.field_4944) {
                     var6.method_27970(1);
                  }
               }

               var2.method_3211(class_6234.field_31907.method_43790(this));
               return class_954.<class_6098>method_4208(var6, var1.method_22567());
            } else {
               return class_954.<class_6098>method_4202(var6);
            }
         }
      }
   }
}
