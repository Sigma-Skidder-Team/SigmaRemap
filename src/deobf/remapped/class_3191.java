package remapped;

public class class_3191 {
   private static String[] field_15932;

   public static void method_14689(class_1549 var0, class_1549 var1, class_1549 var2, boolean var3) {
      class_1549 var6 = !var3 ? var1 : var0;
      class_1549 var7 = !var3 ? var0 : var1;
      var6.field_8190 = (!var3 ? 0.3F : -0.3F) + var2.field_8190;
      var7.field_8190 = (!var3 ? -0.6F : 0.6F) + var2.field_8190;
      var6.field_8191 = (float) (-Math.PI / 2) + var2.field_8191 + 0.1F;
      var7.field_8191 = -1.5F + var2.field_8191;
   }

   public static void method_14685(class_1549 var0, class_1549 var1, class_5834 var2, boolean var3) {
      class_1549 var6 = !var3 ? var1 : var0;
      class_1549 var7 = !var3 ? var0 : var1;
      var6.field_8190 = !var3 ? 0.8F : -0.8F;
      var6.field_8191 = -0.97079635F;
      var7.field_8191 = var6.field_8191;
      float var8 = (float)class_4380.method_20403(var2.method_26576());
      float var9 = class_9299.method_42828((float)var2.method_26613(), 0.0F, var8);
      float var10 = var9 / var8;
      var7.field_8190 = class_9299.method_42795(var10, 0.4F, 0.85F) * (float)(!var3 ? -1 : 1);
      var7.field_8191 = class_9299.method_42795(var10, var7.field_8191, (float) (-Math.PI / 2));
   }

   public static <T extends class_5886> void method_14684(class_1549 var0, class_1549 var1, T var2, float var3, float var4) {
      float var7 = class_9299.method_42818(var3 * (float) Math.PI);
      float var8 = class_9299.method_42818((1.0F - (1.0F - var3) * (1.0F - var3)) * (float) Math.PI);
      var0.field_8185 = 0.0F;
      var1.field_8185 = 0.0F;
      var0.field_8190 = (float) (Math.PI / 20);
      var1.field_8190 = (float) (-Math.PI / 20);
      if (var2.method_26432() != class_1736.field_8943) {
         var0.field_8191 = -0.0F + class_9299.method_42840(var4 * 0.19F) * 0.5F;
         var1.field_8191 = -1.8849558F + class_9299.method_42840(var4 * 0.09F) * 0.15F;
         var0.field_8191 += var7 * 1.2F - var8 * 0.4F;
         var1.field_8191 += var7 * 2.2F - var8 * 0.4F;
      } else {
         var0.field_8191 = -1.8849558F + class_9299.method_42840(var4 * 0.09F) * 0.15F;
         var1.field_8191 = -0.0F + class_9299.method_42840(var4 * 0.19F) * 0.5F;
         var0.field_8191 += var7 * 2.2F - var8 * 0.4F;
         var1.field_8191 += var7 * 1.2F - var8 * 0.4F;
      }

      method_14687(var0, var1, var4);
   }

   public static void method_14687(class_1549 var0, class_1549 var1, float var2) {
      var0.field_8185 = var0.field_8185 + class_9299.method_42840(var2 * 0.09F) * 0.05F + 0.05F;
      var1.field_8185 = var1.field_8185 - (class_9299.method_42840(var2 * 0.09F) * 0.05F + 0.05F);
      var0.field_8191 = var0.field_8191 + class_9299.method_42818(var2 * 0.067F) * 0.05F;
      var1.field_8191 = var1.field_8191 - class_9299.method_42818(var2 * 0.067F) * 0.05F;
   }

   public static void method_14688(class_1549 var0, class_1549 var1, boolean var2, float var3, float var4) {
      float var7 = class_9299.method_42818(var3 * (float) Math.PI);
      float var8 = class_9299.method_42818((1.0F - (1.0F - var3) * (1.0F - var3)) * (float) Math.PI);
      var1.field_8185 = 0.0F;
      var0.field_8185 = 0.0F;
      var1.field_8190 = -(0.1F - var7 * 0.6F);
      var0.field_8190 = 0.1F - var7 * 0.6F;
      float var9 = (float) -Math.PI / (!var2 ? 2.25F : 1.5F);
      var1.field_8191 = var9;
      var0.field_8191 = var9;
      var1.field_8191 += var7 * 1.2F - var8 * 0.4F;
      var0.field_8191 += var7 * 1.2F - var8 * 0.4F;
      method_14687(var1, var0, var4);
   }
}
