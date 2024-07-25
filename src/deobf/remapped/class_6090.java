package remapped;

public abstract class class_6090<T extends class_6749> extends class_7067<T> {
   public class_6090(class_6122 var1) {
      super(var1);
   }

   public void method_27903(T var1, float var2, float var3, class_7966 var4, class_2565 var5, int var6) {
      var4.method_36063();
      var4.method_36060(class_2426.field_12074.method_11074(class_9299.method_42795(var3, var1.field_41711, var1.field_41701) - 90.0F));
      var4.method_36060(class_2426.field_12076.method_11074(class_9299.method_42795(var3, var1.field_41762, var1.field_41755)));
      boolean var9 = false;
      float var10 = 0.0F;
      float var11 = 0.5F;
      float var12 = 0.0F;
      float var13 = 0.15625F;
      float var14 = 0.0F;
      float var15 = 0.15625F;
      float var16 = 0.15625F;
      float var17 = 0.3125F;
      float var18 = 0.05625F;
      float var19 = (float)var1.field_34831 - var3;
      if (var19 > 0.0F) {
         float var20 = -class_9299.method_42818(var19 * 3.0F) * var19;
         var4.method_36060(class_2426.field_12076.method_11074(var20));
      }

      var4.method_36060(class_2426.field_12080.method_11074(45.0F));
      var4.method_36062(0.05625F, 0.05625F, 0.05625F);
      var4.method_36065(-4.0, 0.0, 0.0);
      class_7907 var25 = var5.method_11645(class_3581.method_16747(this.method_11446((T)var1)));
      class_6279 var21 = var4.method_36058();
      class_8107 var22 = var21.method_28620();
      class_6555 var23 = var21.method_28618();
      this.method_27904(var22, var23, var25, -7, -2, -2, 0.0F, 0.15625F, -1, 0, 0, var6);
      this.method_27904(var22, var23, var25, -7, -2, 2, 0.15625F, 0.15625F, -1, 0, 0, var6);
      this.method_27904(var22, var23, var25, -7, 2, 2, 0.15625F, 0.3125F, -1, 0, 0, var6);
      this.method_27904(var22, var23, var25, -7, 2, -2, 0.0F, 0.3125F, -1, 0, 0, var6);
      this.method_27904(var22, var23, var25, -7, 2, -2, 0.0F, 0.15625F, 1, 0, 0, var6);
      this.method_27904(var22, var23, var25, -7, 2, 2, 0.15625F, 0.15625F, 1, 0, 0, var6);
      this.method_27904(var22, var23, var25, -7, -2, 2, 0.15625F, 0.3125F, 1, 0, 0, var6);
      this.method_27904(var22, var23, var25, -7, -2, -2, 0.0F, 0.3125F, 1, 0, 0, var6);

      for (int var24 = 0; var24 < 4; var24++) {
         var4.method_36060(class_2426.field_12080.method_11074(90.0F));
         this.method_27904(var22, var23, var25, -8, -2, 0, 0.0F, 0.0F, 0, 1, 0, var6);
         this.method_27904(var22, var23, var25, 8, -2, 0, 0.5F, 0.0F, 0, 1, 0, var6);
         this.method_27904(var22, var23, var25, 8, 2, 0, 0.5F, 0.15625F, 0, 1, 0, var6);
         this.method_27904(var22, var23, var25, -8, 2, 0, 0.0F, 0.15625F, 0, 1, 0, var6);
      }

      var4.method_36064();
      super.method_32551((T)var1, var2, var3, var4, var5, var6);
   }

   public void method_27904(
      class_8107 var1, class_6555 var2, class_7907 var3, int var4, int var5, int var6, float var7, float var8, int var9, int var10, int var11, int var12
   ) {
      var3.method_35762(var1, (float)var4, (float)var5, (float)var6)
         .method_35743(255, 255, 255, 255)
         .method_35745(var7, var8)
         .method_35737(class_5367.field_27381)
         .method_35747(var12)
         .method_35756(var2, (float)var9, (float)var11, (float)var10)
         .method_35735();
   }
}
