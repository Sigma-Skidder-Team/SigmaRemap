package remapped;

public final class class_1128 extends class_9446 {
   private static String[] field_6437;

   @Override
   public ItemStack method_43688(class_8743 var1, ItemStack var2) {
      class_6331 var5 = var1.method_40140();
      BlockPos var6 = var1.method_40142().method_6098(var1.method_40141().<Direction>method_10313(class_6451.field_32900));
      class_1356 var7 = new class_1356(
         var5, (double)var6.getX() + 0.5, (double)var6.method_12165(), (double)var6.method_12185() + 0.5, (LivingEntity)null
      );
      var5.method_7509(var7);
      var5.method_29528((PlayerEntity)null, var7.getPosX(), var7.method_37309(), var7.getPosZ(), SoundEvents.field_2660, class_562.field_3322, 1.0F, 1.0F);
      var2.method_27970(1);
      return var2;
   }
}
