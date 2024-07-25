package remapped;

public class class_6329<T extends class_5834, M extends class_6521<T> & class_1787> extends class_4171<T, M> {
   private static String[] field_32316;

   public class_6329(class_2514<T, M> var1) {
      super(var1);
   }

   public void method_28898(class_7966 var1, class_2565 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      boolean var13 = var4.method_26432() == class_1736.field_8943;
      class_6098 var14 = !var13 ? var4.method_26446() : var4.method_26568();
      class_6098 var15 = !var13 ? var4.method_26568() : var4.method_26446();
      if (!var14.method_28022() || !var15.method_28022()) {
         var1.method_36063();
         if (this.method_19347().field_33204) {
            float var16 = 0.5F;
            var1.method_36065(0.0, 0.75, 0.0);
            var1.method_36062(0.5F, 0.5F, 0.5F);
         }

         this.method_28897(var4, var15, class_5612.field_28493, class_1736.field_8943, var1, var2, var3);
         this.method_28897(var4, var14, class_5612.field_28492, class_1736.field_8940, var1, var2, var3);
         var1.method_36064();
      }
   }

   private void method_28897(class_5834 var1, class_6098 var2, class_5612 var3, class_1736 var4, class_7966 var5, class_2565 var6, int var7) {
      if (!var2.method_28022()) {
         var5.method_36063();
         this.method_19347().method_7948(var4, var5);
         var5.method_36060(class_2426.field_12080.method_11074(-90.0F));
         var5.method_36060(class_2426.field_12074.method_11074(180.0F));
         boolean var10 = var4 == class_1736.field_8940;
         var5.method_36065((double)((float)(!var10 ? 1 : -1) / 16.0F), 0.125, -0.625);
         class_1893.method_8510().method_8574().method_42248(var1, var2, var3, var10, var5, var6, var7);
         var5.method_36064();
      }
   }
}
