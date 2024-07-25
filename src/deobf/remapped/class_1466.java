package remapped;

public final class class_1466 extends class_9446 {
   private static String[] field_7878;
   private final class_9446 field_7879 = new class_9446();

   @Override
   public ItemStack method_43688(class_8743 var1, ItemStack var2) {
      class_3997 var5 = (class_3997)var2.method_27960();
      BlockPos var6 = var1.method_40142().method_6098(var1.method_40141().<Direction>method_10313(class_6451.field_32900));
      class_6331 var7 = var1.method_40140();
      if (!var5.method_18424((PlayerEntity)null, var7, var6, (class_9529)null)) {
         return this.field_7879.method_28324(var1, var2);
      } else {
         var5.method_18422(var7, var2, var6);
         return new ItemStack(class_4897.field_24548);
      }
   }
}
