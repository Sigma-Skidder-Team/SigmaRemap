package remapped;

public abstract class class_9387<E extends Entity> extends class_5272<E> {
   private float field_47970 = 1.0F;
   private float field_47972 = 1.0F;
   private float field_47971 = 1.0F;

   public void method_43404(float var1, float var2, float var3) {
      this.field_47970 = var1;
      this.field_47972 = var2;
      this.field_47971 = var3;
   }

   @Override
   public void method_45499(class_7966 var1, class_7907 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      super.method_45499(var1, var2, var3, var4, this.field_47970 * var5, this.field_47972 * var6, this.field_47971 * var7, var8);
   }
}
