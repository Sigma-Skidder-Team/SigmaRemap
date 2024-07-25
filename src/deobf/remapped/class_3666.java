package remapped;

public abstract class class_3666<E extends Entity> extends class_1498<E> {
   private float field_17839 = 1.0F;
   private float field_17838 = 1.0F;
   private float field_17840 = 1.0F;

   public void method_17012(float var1, float var2, float var3) {
      this.field_17839 = var1;
      this.field_17838 = var2;
      this.field_17840 = var3;
   }

   @Override
   public void method_45499(class_7966 var1, class_7907 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      super.method_45499(var1, var2, var3, var4, this.field_17839 * var5, this.field_17838 * var6, this.field_17840 * var7, var8);
   }
}
