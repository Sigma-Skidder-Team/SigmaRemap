package remapped;

public class class_6612 extends class_6249 {
   private static String[] field_34163;

   public class_6612(class_317 var1) {
      super(var1);
   }

   @Override
   public class_954<class_6098> method_11231(class_6486 var1, class_704 var2, class_2584 var3) {
      class_6098 var6 = class_2143.method_10014(
         var1, class_9299.method_42847(var2.method_37302()), class_9299.method_42847(var2.method_37156()), (byte)0, true, false
      );
      class_6098 var7 = var2.method_26617(var3);
      if (!var2.field_3876.field_4944) {
         var7.method_27970(1);
      }

      var2.method_3211(class_6234.field_31907.method_43790(this));
      var2.method_37155(class_463.field_2627, 1.0F, 1.0F);
      if (!var7.method_28022()) {
         if (!var2.field_3853.method_32414(var6.method_27973())) {
            var2.method_3153(var6, false);
         }

         return class_954.<class_6098>method_4208(var7, var1.method_22567());
      } else {
         return class_954.<class_6098>method_4208(var6, var1.method_22567());
      }
   }
}
