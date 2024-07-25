package remapped;

public class class_2401<T extends LivingEntity> extends class_4171<T, class_3169<T>> {
   public static final Identifier field_11975 = new Identifier("textures/entity/trident_riptide.png");
   private final class_1549 field_11974 = new class_1549(64, 64, 0, 0);

   public class_2401(class_2514<T, class_3169<T>> var1) {
      super(var1);
      this.field_11974.method_7048(-8.0F, -16.0F, -8.0F, 16.0F, 32.0F, 16.0F);
   }

   public void method_10929(class_7966 var1, class_2565 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (var4.method_26600()) {
         class_7907 var13 = var2.method_11645(RenderLayer.method_16755(field_11975));

         for (int var14 = 0; var14 < 3; var14++) {
            var1.method_36063();
            float var15 = var8 * (float)(-(45 + var14 * 5));
            var1.method_36060(class_2426.field_12074.method_11074(var15));
            float var16 = 0.75F * (float)var14;
            var1.method_36062(var16, var16, var16);
            var1.method_36065(0.0, (double)(-0.2F + 0.6F * (float)var14), 0.0);
            this.field_11974.method_7060(var1, var13, var3, class_5367.field_27381);
            var1.method_36064();
         }
      }
   }
}
