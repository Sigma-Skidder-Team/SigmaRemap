package remapped;

public class class_3787<T extends class_5834, M extends class_3169<T>> extends class_5105<T, M> {
   private static final Identifier field_18505 = new Identifier("textures/entity/bee/bee_stinger.png");

   public class_3787(class_6353<T, M> var1) {
      super(var1);
   }

   @Override
   public int method_23423(T var1) {
      return var1.method_26619();
   }

   @Override
   public void method_23424(class_7966 var1, class_2565 var2, int var3, class_8145 var4, float var5, float var6, float var7, float var8) {
      float var11 = class_9299.method_42843(var5 * var5 + var7 * var7);
      float var12 = (float)(Math.atan2((double)var5, (double)var7) * 180.0F / (float)Math.PI);
      float var13 = (float)(Math.atan2((double)var6, (double)var11) * 180.0F / (float)Math.PI);
      var1.method_36065(0.0, 0.0, 0.0);
      var1.method_36060(class_2426.field_12074.method_11074(var12 - 90.0F));
      var1.method_36060(class_2426.field_12076.method_11074(var13));
      float var14 = 0.0F;
      float var15 = 0.125F;
      float var16 = 0.0F;
      float var17 = 0.0625F;
      float var18 = 0.03125F;
      var1.method_36060(class_2426.field_12080.method_11074(45.0F));
      var1.method_36062(0.03125F, 0.03125F, 0.03125F);
      var1.method_36065(2.5, 0.0, 0.0);
      class_7907 var19 = var2.method_11645(class_3581.method_16755(field_18505));

      for (int var20 = 0; var20 < 4; var20++) {
         var1.method_36060(class_2426.field_12080.method_11074(90.0F));
         class_6279 var21 = var1.method_36058();
         class_8107 var22 = var21.method_28620();
         class_6555 var23 = var21.method_28618();
         method_17592(var19, var22, var23, -4.5F, -1, 0.0F, 0.0F, var3);
         method_17592(var19, var22, var23, 4.5F, -1, 0.125F, 0.0F, var3);
         method_17592(var19, var22, var23, 4.5F, 1, 0.125F, 0.0625F, var3);
         method_17592(var19, var22, var23, -4.5F, 1, 0.0F, 0.0625F, var3);
      }
   }

   private static void method_17592(class_7907 var0, class_8107 var1, class_6555 var2, float var3, int var4, float var5, float var6, int var7) {
      var0.method_35762(var1, var3, (float)var4, 0.0F)
         .method_35743(255, 255, 255, 255)
         .method_35745(var5, var6)
         .method_35737(class_5367.field_27381)
         .method_35747(var7)
         .method_35756(var2, 0.0F, 1.0F, 0.0F)
         .method_35735();
   }
}
