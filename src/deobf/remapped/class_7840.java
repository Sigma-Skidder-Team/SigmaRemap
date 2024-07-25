package remapped;

public class class_7840 extends class_1570 {
   private final class_1549 field_39753;
   private final class_1549 field_39752;

   public class_7840(float var1) {
      this.field_49928 = 256;
      this.field_49927 = 256;
      float var4 = -16.0F;
      this.field_39753 = new class_1549(this);
      this.field_39753.method_7054("upperlip", -6.0F, -1.0F, -24.0F, 12, 5, 16, var1, 176, 44);
      this.field_39753.method_7054("upperhead", -8.0F, -8.0F, -10.0F, 16, 16, 16, var1, 112, 30);
      this.field_39753.field_8197 = true;
      this.field_39753.method_7054("scale", -5.0F, -12.0F, -4.0F, 2, 4, 6, var1, 0, 0);
      this.field_39753.method_7054("nostril", -5.0F, -3.0F, -22.0F, 2, 2, 4, var1, 112, 0);
      this.field_39753.field_8197 = false;
      this.field_39753.method_7054("scale", 3.0F, -12.0F, -4.0F, 2, 4, 6, var1, 0, 0);
      this.field_39753.method_7054("nostril", 3.0F, -3.0F, -22.0F, 2, 2, 4, var1, 112, 0);
      this.field_39752 = new class_1549(this);
      this.field_39752.method_7046(0.0F, 4.0F, -8.0F);
      this.field_39752.method_7054("jaw", -6.0F, 0.0F, -16.0F, 12, 4, 16, var1, 176, 65);
      this.field_39753.method_7043(this.field_39752);
   }

   @Override
   public void method_7085(float var1, float var2, float var3) {
      this.field_39752.field_8191 = (float)(Math.sin((double)(var1 * (float) Math.PI * 0.2F)) + 1.0) * 0.2F;
      this.field_39753.field_8190 = var2 * (float) (Math.PI / 180.0);
      this.field_39753.field_8191 = var3 * (float) (Math.PI / 180.0);
   }

   @Override
   public void method_45499(class_7966 var1, class_7907 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      var1.method_36063();
      var1.method_36065(0.0, -0.374375F, 0.0);
      var1.method_36062(0.75F, 0.75F, 0.75F);
      this.field_39753.method_7061(var1, var2, var3, var4, var5, var6, var7, var8);
      var1.method_36064();
   }
}
