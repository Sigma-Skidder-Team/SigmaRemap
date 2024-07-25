package remapped;

public class class_2853 extends class_8497 {
   private static String[] field_13972;

   public class_2853(class_3073 var1) {
      super(var1);
   }

   @Override
   public class_6910 method_10777(class_2522 var1, class_6486 var2, class_1331 var3, class_704 var4, class_2584 var5, class_9529 var6) {
      class_6098 var9 = var4.method_26617(var5);
      if (var9.method_27960() != class_4897.field_24853) {
         return super.method_10777(var1, var2, var3, var4, var5, var6);
      } else {
         if (!var2.field_33055) {
            class_240 var10 = var6.method_43956();
            class_240 var11 = var10.method_1029() != class_9249.field_47216 ? var10 : var4.method_37365().method_1046();
            var2.method_43359((class_704)null, var3, class_463.field_2282, class_562.field_3322, 1.0F, 1.0F);
            var2.method_7513(var3, class_4783.field_23281.method_29260().method_10308(class_4888.field_24302, var11), 11);
            class_91 var12 = new class_91(
               var2,
               (double)var3.method_12173() + 0.5 + (double)var11.method_1041() * 0.65,
               (double)var3.method_12165() + 0.1,
               (double)var3.method_12185() + 0.5 + (double)var11.method_1034() * 0.65,
               new class_6098(class_4897.field_24480, 4)
            );
            var12.method_37214(
               0.05 * (double)var11.method_1041() + var2.field_33033.nextDouble() * 0.02,
               0.05,
               0.05 * (double)var11.method_1034() + var2.field_33033.nextDouble() * 0.02
            );
            var2.method_7509(var12);
            var9.method_28003(1, var4, var1x -> var1x.method_26447(var5));
         }

         return class_6910.method_31659(var2.field_33055);
      }
   }

   @Override
   public class_8138 method_39158() {
      return (class_8138)class_4783.field_23301;
   }

   @Override
   public class_8330 method_39159() {
      return (class_8330)class_4783.field_23544;
   }
}
