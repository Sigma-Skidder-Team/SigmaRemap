package remapped;

public class class_9197 extends class_4171<class_496, class_1253<class_496>> {
   private static String[] field_47046;

   public class_9197(class_2514<class_496, class_1253<class_496>> var1) {
      super(var1);
   }

   public void method_42395(class_7966 var1, class_2565 var2, int var3, class_496 var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      class_6098 var13 = var4.method_26520(class_6943.field_35707);
      if (var4.method_2449() && !var4.method_2421()) {
         float var14 = -0.6F;
         float var15 = 1.4F;
         if (var4.method_2427()) {
            var14 -= 0.2F * class_9299.method_42818(var8 * 0.6F) + 0.2F;
            var15 -= 0.09F * class_9299.method_42818(var8 * 0.6F);
         }

         var1.method_36063();
         var1.method_36065(0.1F, (double)var15, (double)var14);
         class_1893.method_8510().method_8574().method_42248(var4, var13, class_5612.field_28496, false, var1, var2, var3);
         var1.method_36064();
      }
   }
}
