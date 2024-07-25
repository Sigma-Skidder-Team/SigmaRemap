package remapped;

public class class_1304 extends class_2451 {
   private static String[] field_7221;

   public class_1304(class_317 var1) {
      super(var1);
   }

   @Override
   public class_6910 method_11202(ItemStack var1, class_704 var2, class_5834 var3, Hand var4) {
      if (var3 instanceof class_9378 && var3.isAlive()) {
         class_9378 var7 = (class_9378)var3;
         if (!var7.method_43357() && var7.method_43356()) {
            if (!var2.world.field_33055) {
               var7.method_43358(class_562.field_3328);
               var1.method_27970(1);
            }

            return class_6910.method_31659(var2.world.field_33055);
         }
      }

      return class_6910.field_35521;
   }
}
