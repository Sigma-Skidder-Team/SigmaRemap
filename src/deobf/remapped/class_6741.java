package remapped;

public class class_6741<T extends LivingEntity, M extends class_6521<T>> extends class_4171<T, M> {
   private static String[] field_34794;

   public class_6741(class_2514<T, M> var1) {
      super(var1);
   }

   public void method_30885(class_7966 var1, class_2565 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      var1.method_36063();
      var1.method_36065(0.0, 0.4F, -0.4F);
      var1.method_36060(class_2426.field_12080.method_11074(180.0F));
      ItemStack var13 = var4.method_26520(class_6943.field_35707);
      MinecraftClient.getInstance().method_8574().method_42248(var4, var13, class_5612.field_28496, false, var1, var2, var3);
      var1.method_36064();
   }
}
