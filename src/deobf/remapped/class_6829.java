package remapped;

public class class_6829<T extends class_5834, M extends class_3169<T>> extends class_5105<T, M> {
   private static String[] field_35219;
   private final EntityRenderDispatcher field_35220;
   private class_581 field_35221;

   public class_6829(class_6353<T, M> var1) {
      super(var1);
      this.field_35220 = var1.method_32558();
   }

   @Override
   public int method_23423(T var1) {
      return var1.method_26569();
   }

   @Override
   public void method_23424(class_7966 var1, class_2565 var2, int var3, Entity var4, float var5, float var6, float var7, float var8) {
      float var11 = class_9299.method_42843(var5 * var5 + var7 * var7);
      this.field_35221 = new class_581(var4.world, var4.method_37302(), var4.method_37309(), var4.method_37156());
      this.field_35221.rotationYaw = (float)(Math.atan2((double)var5, (double)var7) * 180.0F / (float)Math.PI);
      this.field_35221.rotationPitch = (float)(Math.atan2((double)var6, (double)var11) * 180.0F / (float)Math.PI);
      this.field_35221.prevRotationYaw = this.field_35221.rotationYaw;
      this.field_35221.field_41762 = this.field_35221.rotationPitch;
      this.field_35220.method_28115(this.field_35221, 0.0, 0.0, 0.0, 0.0F, var8, var1, var2, var3);
   }
}
