package remapped;

public final class class_5939 extends class_9446 {
   private static String[] field_30292;

   @Override
   public ItemStack method_43688(class_8743 var1, ItemStack var2) {
      Direction var5 = var1.method_40141().<Direction>method_10313(class_6451.field_32900);
      BlockPos var6 = var1.method_40142().method_6098(var5);
      class_6331 var7 = var1.method_40140();
      class_9399 var8 = new class_9399(var7, (double)var6.getX() + 0.5, (double)var6.method_12165(), (double)var6.method_12185() + 0.5);
      EntityType.method_30458(var7, (PlayerEntity)null, var8, var2.method_27990());
      var8.rotationYaw = var5.method_1028();
      var7.method_7509(var8);
      var2.method_27970(1);
      return var2;
   }
}
