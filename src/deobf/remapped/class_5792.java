package remapped;

public class class_5792 extends class_4171<class_3551, class_3192<class_3551>> {
   private static String[] field_29271;
   private final class_3192<class_3551> field_29270 = new class_3192<class_3551>(0.1F);

   public class_5792(class_2514<class_3551, class_3192<class_3551>> var1) {
      super(var1);
   }

   public void method_26213(
      class_7966 var1, class_2565 var2, int var3, class_3551 var4, float var5, float var6, float var7, float var8, float var9, float var10
   ) {
      ItemStack var13 = var4.method_16523();
      if (var13.method_27960() instanceof class_2706) {
         class_2706 var14 = (class_2706)var13.method_27960();
         this.method_19347().method_29701(this.field_29270);
         this.field_29270.method_14692(var4, var5, var6, var7);
         this.field_29270.method_14690(var4, var5, var6, var8, var9, var10);
         float var15;
         float var16;
         float var17;
         if (!(var14 instanceof class_4442)) {
            var15 = 1.0F;
            var16 = 1.0F;
            var17 = 1.0F;
         } else {
            int var18 = ((class_4442)var14).method_42261(var13);
            var15 = (float)(var18 >> 16 & 0xFF) / 255.0F;
            var16 = (float)(var18 >> 8 & 0xFF) / 255.0F;
            var17 = (float)(var18 & 0xFF) / 255.0F;
         }

         class_7907 var19 = var2.method_11645(RenderLayer.method_16755(var14.method_12199()));
         this.field_29270.method_45499(var1, var19, var3, class_5367.field_27381, var15, var16, var17, 1.0F);
      }
   }
}
