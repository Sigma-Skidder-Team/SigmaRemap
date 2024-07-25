package remapped;

public class class_1570 extends class_9873 {
   private static String[] field_8247;
   public final class_1549 field_8248;

   public class_1570() {
      this(0, 35, 64, 64);
   }

   public class_1570(int var1, int var2, int var3, int var4) {
      super(RenderLayer::method_16705);
      this.field_49928 = var3;
      this.field_49927 = var4;
      this.field_8248 = new class_1549(this, var1, var2);
      this.field_8248.method_7049(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F);
      this.field_8248.method_7046(0.0F, 0.0F, 0.0F);
   }

   public void method_7085(float var1, float var2, float var3) {
      this.field_8248.field_8190 = var2 * (float) (Math.PI / 180.0);
      this.field_8248.field_8191 = var3 * (float) (Math.PI / 180.0);
   }

   @Override
   public void method_45499(class_7966 var1, class_7907 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      this.field_8248.method_7061(var1, var2, var3, var4, var5, var6, var7, var8);
   }
}
