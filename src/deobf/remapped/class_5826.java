package remapped;

public class class_5826 extends class_4171<class_449, class_4995<class_449>> {
   private static String[] field_29576;

   public class_5826(class_2514<class_449, class_4995<class_449>> var1) {
      super(var1);
   }

   public void method_26379(class_7966 var1, class_2565 var2, int var3, class_449 var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      boolean var13 = var4.method_26432() == class_1736.field_8943;
      var1.method_36063();
      float var14 = 1.0F;
      float var15 = -1.0F;
      float var16 = class_9299.method_42804(var4.field_41755) / 60.0F;
      if (!(var4.field_41755 < 0.0F)) {
         var1.method_36065(0.0, (double)(1.0F + var16 * 0.8F), (double)(-1.0F + var16 * 0.2F));
      } else {
         var1.method_36065(0.0, (double)(1.0F - var16 * 0.5F), (double)(-1.0F + var16 * 0.5F));
      }

      class_6098 var17 = !var13 ? var4.method_26568() : var4.method_26446();
      MinecraftClient.method_8510().method_8574().method_42248(var4, var17, class_5612.field_28496, false, var1, var2, var3);
      var1.method_36064();
   }
}
