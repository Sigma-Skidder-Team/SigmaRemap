package remapped;

public class class_8205 extends class_7067<class_3577> {
   private static final class_4639 field_41973 = new class_4639("textures/entity/end_crystal/end_crystal.png");
   private static final class_3581 field_41970 = class_3581.method_16755(field_41973);
   private static final float field_41974 = (float)Math.sin(Math.PI / 4);
   private final class_1549 field_41972;
   private final class_1549 field_41975;
   private final class_1549 field_41971;

   public class_8205(class_6122 var1) {
      super(var1);
      this.field_36492 = 0.5F;
      this.field_41975 = new class_1549(64, 32, 0, 0);
      this.field_41975.method_7048(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F);
      this.field_41972 = new class_1549(64, 32, 32, 0);
      this.field_41972.method_7048(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F);
      this.field_41971 = new class_1549(64, 32, 0, 16);
      this.field_41971.method_7048(-6.0F, 0.0F, -6.0F, 12.0F, 4.0F, 12.0F);
   }

   public void method_37573(class_3577 var1, float var2, float var3, class_7966 var4, class_2565 var5, int var6) {
      var4.method_36063();
      float var9 = method_37574(var1, var3);
      float var10 = ((float)var1.field_17510 + var3) * 3.0F;
      class_7907 var11 = var5.method_11645(field_41970);
      var4.method_36063();
      var4.method_36062(2.0F, 2.0F, 2.0F);
      var4.method_36065(0.0, -0.5, 0.0);
      int var12 = class_5367.field_27381;
      if (var1.method_16626()) {
         this.field_41971.method_7060(var4, var11, var6, var12);
      }

      var4.method_36060(class_2426.field_12074.method_11074(var10));
      var4.method_36065(0.0, (double)(1.5F + var9 / 2.0F), 0.0);
      var4.method_36060(new class_5422(new class_2426(field_41974, 0.0F, field_41974), 60.0F, true));
      this.field_41975.method_7060(var4, var11, var6, var12);
      float var13 = 0.875F;
      var4.method_36062(0.875F, 0.875F, 0.875F);
      var4.method_36060(new class_5422(new class_2426(field_41974, 0.0F, field_41974), 60.0F, true));
      var4.method_36060(class_2426.field_12074.method_11074(var10));
      this.field_41975.method_7060(var4, var11, var6, var12);
      var4.method_36062(0.875F, 0.875F, 0.875F);
      var4.method_36060(new class_5422(new class_2426(field_41974, 0.0F, field_41974), 60.0F, true));
      var4.method_36060(class_2426.field_12074.method_11074(var10));
      this.field_41972.method_7060(var4, var11, var6, var12);
      var4.method_36064();
      var4.method_36064();
      class_1331 var14 = var1.method_16624();
      if (var14 != null) {
         float var15 = (float)var14.method_12173() + 0.5F;
         float var16 = (float)var14.method_12165() + 0.5F;
         float var17 = (float)var14.method_12185() + 0.5F;
         float var18 = (float)((double)var15 - var1.method_37302());
         float var19 = (float)((double)var16 - var1.method_37309());
         float var20 = (float)((double)var17 - var1.method_37156());
         var4.method_36065((double)var18, (double)var19, (double)var20);
         class_3867.method_17915(-var18, -var19 + var9, -var20, var3, var1.field_17510, var4, var5, var6);
      }

      super.method_32551(var1, var2, var3, var4, var5, var6);
   }

   public static float method_37574(class_3577 var0, float var1) {
      float var4 = (float)var0.field_17510 + var1;
      float var5 = class_9299.method_42818(var4 * 0.2F) / 2.0F + 0.5F;
      var5 = (var5 * var5 + var5) * 0.4F;
      return var5 - 1.4F;
   }

   public class_4639 method_37572(class_3577 var1) {
      return field_41973;
   }

   public boolean method_37571(class_3577 var1, class_2359 var2, double var3, double var5, double var7) {
      return super.method_32548(var1, var2, var3, var5, var7) || var1.method_16624() != null;
   }
}
