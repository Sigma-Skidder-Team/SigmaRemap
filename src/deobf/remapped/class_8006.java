package remapped;

public class class_8006 extends class_8085 {
   private static String[] field_41021;

   @Override
   public ItemStack method_43688(class_8743 var1, ItemStack var2) {
      class_6331 var5 = var1.method_40140();
      if (!var5.method_22567()) {
         BlockPos var6 = var1.method_40142().method_6098(var1.method_40141().<Direction>method_10313(class_6451.field_32900));
         this.method_36717(method_36329(var5, var6) || method_36328(var5, var6));
         if (this.method_36716() && var2.method_27996(1, var5.method_43360(), (class_9359)null)) {
            var2.method_28017(0);
         }
      }

      return var2;
   }

   private static boolean method_36329(class_6331 var0, BlockPos var1) {
      class_2522 var4 = var0.method_28262(var1);
      if (var4.method_8349(class_2351.field_11727)) {
         int var5 = var4.<Integer>method_10313(class_4745.field_22992);
         if (var5 >= 5) {
            var0.method_43359((PlayerEntity)null, var1, class_463.field_2271, class_562.field_3322, 1.0F, 1.0F);
            class_4745.method_21913(var0, var1);
            ((class_4745)var4.method_8360()).method_21920(var0, var4, var1, (PlayerEntity)null, class_8771.field_44898);
            return true;
         }
      }

      return false;
   }

   private static boolean method_36328(class_6331 var0, BlockPos var1) {
      for (class_5834 var5 : var0.<Entity>method_25869(class_5834.class, new Box(var1), class_3572.field_17483)) {
         if (var5 instanceof class_9897) {
            class_9897 var6 = (class_9897)var5;
            if (var6.method_45584()) {
               var6.method_45583(class_562.field_3322);
               return true;
            }
         }
      }

      return false;
   }
}
