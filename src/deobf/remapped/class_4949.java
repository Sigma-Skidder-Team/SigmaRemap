package remapped;

public class class_4949 extends class_1050 {
   private static String[] field_25611;

   public class_4949(class_8461 var1, class_562 var2, float var3, float var4, BlockPos var5) {
      this(var1, var2, var3, var4, (double)var5.method_12173() + 0.5, (double)var5.method_12165() + 0.5, (double)var5.method_12185() + 0.5);
   }

   public static class_4949 method_22675(class_8461 var0, float var1) {
      return method_22676(var0, var1, 0.25F);
   }

   public static class_4949 method_22676(class_8461 var0, float var1, float var2) {
      return new class_4949(var0.method_38928(), class_562.field_3326, var2, var1, false, 0, class_6656.field_34443, 0.0, 0.0, 0.0, true);
   }

   public static class_4949 method_22678(class_8461 var0) {
      return new class_4949(var0.method_38928(), class_562.field_3324, 1.0F, 1.0F, false, 0, class_6656.field_34443, 0.0, 0.0, 0.0, true);
   }

   public static class_4949 method_22679(class_8461 var0, double var1, double var3, double var5) {
      return new class_4949(var0, class_562.field_3333, 4.0F, 1.0F, false, 0, class_6656.field_34440, var1, var3, var5);
   }

   public static class_4949 method_22680(class_8461 var0, float var1, float var2) {
      return new class_4949(var0.method_38928(), class_562.field_3325, var2, var1, false, 0, class_6656.field_34443, 0.0, 0.0, 0.0, true);
   }

   public static class_4949 method_22681(class_8461 var0) {
      return method_22680(var0, 1.0F, 1.0F);
   }

   public static class_4949 method_22677(class_8461 var0, double var1, double var3, double var5) {
      return new class_4949(var0, class_562.field_3325, 1.0F, 1.0F, false, 0, class_6656.field_34440, var1, var3, var5);
   }

   public class_4949(class_8461 var1, class_562 var2, float var3, float var4, double var5, double var7, double var9) {
      this(var1, var2, var3, var4, false, 0, class_6656.field_34440, var5, var7, var9);
   }

   private class_4949(class_8461 var1, class_562 var2, float var3, float var4, boolean var5, int var6, class_6656 var7, double var8, double var10, double var12) {
      this(var1.method_38928(), var2, var3, var4, var5, var6, var7, var8, var10, var12, false);
   }

   public class_4949(
           Identifier var1, class_562 var2, float var3, float var4, boolean var5, int var6, class_6656 var7, double var8, double var10, double var12, boolean var14
   ) {
      super(var1, var2);
      this.field_5766 = var3;
      this.field_5773 = var4;
      this.field_5761 = var8;
      this.field_5765 = var10;
      this.field_5762 = var12;
      this.field_5768 = var5;
      this.field_5764 = var6;
      this.field_5763 = var7;
      this.field_5769 = var14;
   }
}
