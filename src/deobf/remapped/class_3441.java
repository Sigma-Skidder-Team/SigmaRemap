package remapped;

public class class_3441 extends class_4314 implements class_7431 {
   private static String[] field_16910;

   public class_3441(class_3073 var1) {
      super(var1);
   }

   @Override
   public class_9077 method_33828() {
      return class_9077.field_46493;
   }

   @Override
   public class_3757 method_3281(class_6163 var1) {
      return new class_1100();
   }

   @Override
   public class_6910 method_10777(class_2522 var1, class_6486 var2, class_1331 var3, class_704 var4, class_2584 var5, class_9529 var6) {
      if (!var2.field_33055) {
         class_3757 var9 = var2.method_28260(var3);
         if (var9 instanceof class_1100) {
            var4.method_3152((class_1100)var9);
            var4.method_3209(class_6234.field_31862);
         }

         return class_6910.field_35518;
      } else {
         return class_6910.field_35520;
      }
   }

   @Override
   public class_7537 method_10788(class_2522 var1) {
      return class_7537.field_38469;
   }

   @Override
   public void method_29257(class_6486 var1, class_1331 var2, class_2522 var3, class_5834 var4, class_6098 var5) {
      if (var5.method_28018()) {
         class_3757 var8 = var1.method_28260(var2);
         if (var8 instanceof class_1100) {
            ((class_1100)var8).method_4887(var5.method_28008());
         }
      }
   }
}
