package remapped;

public class class_7547 extends class_2451 {
   private static String[] field_38496;

   public class_7547(class_317 var1) {
      super(var1);
   }

   @Override
   public class_954<class_6098> method_11231(class_6486 var1, class_704 var2, class_2584 var3) {
      class_6098 var6 = var2.method_26617(var3);
      var1.method_29528(
         (class_704)null,
         var2.method_37302(),
         var2.method_37309(),
         var2.method_37156(),
         class_463.field_2338,
         class_562.field_3328,
         0.5F,
         0.4F / (field_12172.nextFloat() * 0.4F + 0.8F)
      );
      if (!var1.field_33055) {
         class_6889 var7 = new class_6889(var1, var2);
         var7.method_15852(var6);
         var7.method_26158(var2, var2.field_41755, var2.field_41701, 0.0F, 1.5F, 1.0F);
         var1.method_7509(var7);
      }

      var2.method_3211(class_6234.field_31907.method_43790(this));
      if (!var2.field_3876.field_4944) {
         var6.method_27970(1);
      }

      return class_954.<class_6098>method_4208(var6, var1.method_22567());
   }
}
