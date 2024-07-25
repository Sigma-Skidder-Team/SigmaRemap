package remapped;

public final class class_7530 extends class_1425 {
   private static String[] field_38447;

   public class_7530(class_7822 var1, int var2) {
      super(var1, var2);
   }

   @Override
   public boolean method_6549(int var1, int var2) {
      return true;
   }

   @Override
   public void method_6537(LivingEntity var1, int var2) {
      if (var1 instanceof class_9359 && !var1.method_37221()) {
         class_9359 var5 = (class_9359)var1;
         class_6331 var6 = var5.method_43235();
         if (var6.method_43370() == class_423.field_1790) {
            return;
         }

         if (var6.method_28994(var1.method_37075())) {
            var6.method_28985().method_41271(var5);
         }
      }
   }
}
