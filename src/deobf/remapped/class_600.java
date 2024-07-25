package remapped;

public class class_600 extends class_1570 {
   private static String[] field_3449;
   private final class_1549 field_3450 = new class_1549(this, 32, 0);

   public class_600() {
      super(0, 0, 64, 64);
      this.field_3450.method_7049(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.25F);
      this.field_3450.method_7046(0.0F, 0.0F, 0.0F);
   }

   @Override
   public void method_7085(float var1, float var2, float var3) {
      super.method_7085(var1, var2, var3);
      this.field_3450.field_8190 = this.field_8248.field_8190;
      this.field_3450.field_8191 = this.field_8248.field_8191;
   }

   @Override
   public void method_45499(class_7966 var1, class_7907 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      super.method_45499(var1, var2, var3, var4, var5, var6, var7, var8);
      this.field_3450.method_7061(var1, var2, var3, var4, var5, var6, var7, var8);
   }
}
