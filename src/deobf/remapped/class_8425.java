package remapped;

import java.util.List;

public final class class_8425 extends class_8085 {
   private static String[] field_43085;

   @Override
   public ItemStack method_43688(class_8743 var1, ItemStack var2) {
      BlockPos var5 = var1.method_40142().method_6098(var1.method_40141().<Direction>method_10313(class_6451.field_32900));
      List var6 = var1.method_40140().<class_5834>method_25869(class_5834.class, new Box(var5), var0 -> {
         if (!(var0 instanceof class_9378)) {
            return false;
         } else {
            class_9378 var3 = (class_9378)var0;
            return !var3.method_43357() && var3.method_43356();
         }
      });
      if (var6.isEmpty()) {
         return super.method_43688(var1, var2);
      } else {
         ((class_9378)var6.get(0)).method_43358(class_562.field_3322);
         var2.method_27970(1);
         this.method_36717(true);
         return var2;
      }
   }
}
