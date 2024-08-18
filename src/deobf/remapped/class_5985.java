package remapped;

public class class_5985 extends class_4171<AbstractClientPlayerEntity, class_3169<AbstractClientPlayerEntity>> {
   public class_5985(class_2514<AbstractClientPlayerEntity, class_3169<AbstractClientPlayerEntity>> var1) {
      super(var1);
   }

   public void method_27295(
           class_7966 var1, class_2565 var2, int var3, AbstractClientPlayerEntity var4, float var5, float var6, float var7, float var8, float var9, float var10
   ) {
      if ("deadmau5".equals(var4.method_45509().getString()) && var4.method_44880() && !var4.method_37109()) {
         class_7907 var13 = var2.method_11645(RenderLayer.method_16734(var4.method_44889()));
         int var14 = class_6353.method_29110(var4, 0.0F);

         for (int var15 = 0; var15 < 2; var15++) {
            float var16 = MathHelper.lerp(var7, var4.prevRotationYaw, var4.rotationYaw) - MathHelper.lerp(var7, var4.field_29611, var4.field_29605);
            float var17 = MathHelper.lerp(var7, var4.prevRotationPitch, var4.rotationPitch);
            var1.method_36063();
            var1.method_36060(class_2426.field_12074.method_11074(var16));
            var1.method_36060(class_2426.field_12080.method_11074(var17));
            var1.method_36065((double)(0.375F * (float)(var15 * 2 - 1)), 0.0, 0.0);
            var1.method_36065(0.0, -0.375, 0.0);
            var1.method_36060(class_2426.field_12080.method_11074(-var17));
            var1.method_36060(class_2426.field_12074.method_11074(-var16));
            float var18 = 1.3333334F;
            var1.method_36062(1.3333334F, 1.3333334F, 1.3333334F);
            this.method_19347().method_14621(var1, var13, var3, var14);
            var1.method_36064();
         }
      }
   }
}
