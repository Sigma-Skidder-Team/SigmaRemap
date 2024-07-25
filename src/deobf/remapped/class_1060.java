package remapped;

public class class_1060 extends class_7067<class_5614> {
   private static final Identifier field_5816 = new Identifier("textures/entity/experience_orb.png");
   private static final class_3581 field_5818 = class_3581.method_16766(field_5816);

   public class_1060(class_6122 var1) {
      super(var1);
      this.field_36492 = 0.15F;
      this.field_36494 = 0.75F;
   }

   public int method_4657(class_5614 var1, class_1331 var2) {
      return class_9299.method_42829(super.method_32546(var1, var2) + 7, 0, 15);
   }

   public void method_4659(class_5614 var1, float var2, float var3, class_7966 var4, class_2565 var5, int var6) {
      var4.method_36063();
      int var9 = var1.method_25473();
      float var10 = (float)(var9 % 4 * 16 + 0) / 64.0F;
      float var11 = (float)(var9 % 4 * 16 + 16) / 64.0F;
      float var12 = (float)(var9 / 4 * 16 + 0) / 64.0F;
      float var13 = (float)(var9 / 4 * 16 + 16) / 64.0F;
      float var14 = 1.0F;
      float var15 = 0.5F;
      float var16 = 0.25F;
      float var17 = 255.0F;
      float var18 = ((float)var1.field_28508 + var3) / 2.0F;
      if (class_3111.method_14438()) {
         var18 = class_9300.method_42880(var18);
      }

      int var19 = (int)((class_9299.method_42818(var18 + 0.0F) + 1.0F) * 0.5F * 255.0F);
      short var20 = 255;
      int var21 = (int)((class_9299.method_42818(var18 + (float) (Math.PI * 4.0 / 3.0)) + 1.0F) * 0.1F * 255.0F);
      var4.method_36065(0.0, 0.1F, 0.0);
      var4.method_36060(this.field_36493.method_28121());
      var4.method_36060(class_2426.field_12074.method_11074(180.0F));
      float var22 = 0.3F;
      var4.method_36062(0.3F, 0.3F, 0.3F);
      class_7907 var23 = var5.method_11645(field_5818);
      class_6279 var24 = var4.method_36058();
      class_8107 var25 = var24.method_28620();
      class_6555 var26 = var24.method_28618();
      int var27 = var19;
      int var28 = 255;
      int var29 = var21;
      if (class_3111.method_14438()) {
         int var30 = class_9300.method_42918(var18);
         if (var30 >= 0) {
            var27 = var30 >> 16 & 0xFF;
            var28 = var30 >> 8 & 0xFF;
            var29 = var30 >> 0 & 0xFF;
         }
      }

      method_4660(var23, var25, var26, -0.5F, -0.25F, var27, var28, var29, var10, var13, var6);
      method_4660(var23, var25, var26, 0.5F, -0.25F, var27, var28, var29, var11, var13, var6);
      method_4660(var23, var25, var26, 0.5F, 0.75F, var27, var28, var29, var11, var12, var6);
      method_4660(var23, var25, var26, -0.5F, 0.75F, var27, var28, var29, var10, var12, var6);
      var4.method_36064();
      super.method_32551(var1, var2, var3, var4, var5, var6);
   }

   private static void method_4660(
      class_7907 var0, class_8107 var1, class_6555 var2, float var3, float var4, int var5, int var6, int var7, float var8, float var9, int var10
   ) {
      var0.method_35762(var1, var3, var4, 0.0F)
         .method_35743(var5, var6, var7, 128)
         .method_35745(var8, var9)
         .method_35737(class_5367.field_27381)
         .method_35747(var10)
         .method_35756(var2, 0.0F, 1.0F, 0.0F)
         .method_35735();
   }

   public Identifier method_4658(class_5614 var1) {
      return field_5816;
   }
}
