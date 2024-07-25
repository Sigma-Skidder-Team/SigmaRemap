package remapped;

public class class_7003 extends class_4171<class_223, class_7749<class_223>> {
   private static String[] field_35932;

   public class_7003(class_2514<class_223, class_7749<class_223>> var1) {
      super(var1);
   }

   public void method_32015(class_7966 var1, class_2565 var2, int var3, class_223 var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (!var4.method_37109() && var4.method_947()) {
         var1.method_36063();
         this.method_19347().method_35149().method_7057(var1);
         float var13 = 0.625F;
         var1.method_36065(0.0, -0.34375, 0.0);
         var1.method_36060(class_2426.field_12074.method_11074(180.0F));
         var1.method_36062(0.625F, -0.625F, -0.625F);
         ItemStack var14 = new ItemStack(class_4783.field_23281);
         MinecraftClient.getInstance()
            .method_8511()
            .method_40268(var4, var14, class_5612.field_28497, false, var1, var2, var4.field_41768, var3, class_6353.method_29110(var4, 0.0F));
         var1.method_36064();
      }
   }
}
