package remapped;

public class class_6778 extends class_1595 {
   private static String[] field_34971;

   public class_6778(EntityType<? extends class_6778> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public class_8461 method_26918() {
      return class_463.field_2036;
   }

   @Override
   public class_8461 method_26541(DamageSource var1) {
      return class_463.field_2136;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_2816;
   }

   @Override
   public class_8461 method_7150() {
      return class_463.field_2443;
   }

   @Override
   public void method_26614(DamageSource var1, int var2, boolean var3) {
      super.method_26614(var1, var2, var3);
      Entity var6 = var1.method_28372();
      if (var6 instanceof class_9490) {
         class_9490 var7 = (class_9490)var6;
         if (var7.method_43837()) {
            var7.method_43832();
            this.method_37312(class_4897.field_24880);
         }
      }
   }
}
