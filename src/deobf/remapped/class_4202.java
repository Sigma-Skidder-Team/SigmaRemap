package remapped;

public final class class_4202 extends class_8085 {
   private static String[] field_20434;

   @Override
   public ItemStack method_43688(class_8743 var1, ItemStack var2) {
      this.method_36717(true);
      class_6331 var5 = var1.method_40140();
      BlockPos var6 = var1.method_40142().method_6098(var1.method_40141().<Direction>method_10313(class_6451.field_32900));
      if (!class_8579.method_39459(var2, var5, var6) && !class_8579.method_39460(var2, var5, var6, (Direction)null)) {
         this.method_36717(false);
      } else if (!var5.field_33055) {
         var5.method_43364(2005, var6, 0);
      }

      return var2;
   }
}
