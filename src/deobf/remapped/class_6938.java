package remapped;

public class class_6938 {
   private static String[] field_35665;
   private final RenderLayer field_35664;
   private final RenderLayer field_35670;
   private final float field_35669;
   private final float field_35672;
   private final float field_35671;
   private final float field_35667;
   private final float field_35668;
   private final float field_35662;
   private final float field_35661;
   private final float field_35663;
   public static final class_8107 field_35666 = MathUtils.method_7800();

   public class_6938(RenderLayer var1, RenderLayer var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      this.field_35664 = var1;
      this.field_35670 = var2;
      this.field_35669 = var3;
      this.field_35672 = var4;
      this.field_35671 = var5;
      this.field_35667 = var6;
      this.field_35668 = var7;
      this.field_35662 = var8;
      this.field_35661 = var9;
      this.field_35663 = var10;
   }

   public void method_31742(boolean var1, float var2, float var3, class_8107 var4, class_7907 var5, float var6, float var7, float var8, float var9, int var10) {
      byte var13 = 3;
      float var14 = var2 + this.field_35668;
      float var15 = var2 + this.field_35662;
      float var16 = this.field_35661 - 3.0F;
      float var17 = this.field_35663 - 3.0F;
      float var18 = var3 + var16;
      float var19 = var3 + var17;
      float var20 = !var1 ? 0.0F : 1.0F - 0.25F * var16;
      float var21 = !var1 ? 0.0F : 1.0F - 0.25F * var17;
      if (var5 instanceof class_9633 && var4 == field_35666) {
         class_9633 var22 = (class_9633)var5;
         int var23 = (int)(var6 * 255.0F);
         int var24 = (int)(var7 * 255.0F);
         int var25 = (int)(var8 * 255.0F);
         int var26 = (int)(var9 * 255.0F);
         int var28 = var10 >> 16 & 65535;
         byte var27;
         var22.method_44481(var14 + var20, var18, 0.0F, var23, var24, var25, var26, this.field_35669, this.field_35671, var27, var28);
         var22.method_44481(var14 + var21, var19, 0.0F, var23, var24, var25, var26, this.field_35669, this.field_35667, var27, var28);
         var22.method_44481(var15 + var21, var19, 0.0F, var23, var24, var25, var26, this.field_35672, this.field_35667, var27, var28);
         var22.method_44481(var15 + var20, var18, 0.0F, var23, var24, var25, var26, this.field_35672, this.field_35671, var27, var28);
      } else {
         var5.method_35762(var4, var14 + var20, var18, 0.0F)
            .method_35742(var6, var7, var8, var9)
            .method_35745(this.field_35669, this.field_35671)
            .method_35747(var10)
            .method_35735();
         var5.method_35762(var4, var14 + var21, var19, 0.0F)
            .method_35742(var6, var7, var8, var9)
            .method_35745(this.field_35669, this.field_35667)
            .method_35747(var10)
            .method_35735();
         var5.method_35762(var4, var15 + var21, var19, 0.0F)
            .method_35742(var6, var7, var8, var9)
            .method_35745(this.field_35672, this.field_35667)
            .method_35747(var10)
            .method_35735();
         var5.method_35762(var4, var15 + var20, var18, 0.0F)
            .method_35742(var6, var7, var8, var9)
            .method_35745(this.field_35672, this.field_35671)
            .method_35747(var10)
            .method_35735();
      }
   }

   public void method_31741(class_4598 var1, class_8107 var2, class_7907 var3, int var4) {
      var3.method_35762(var2, var1.field_22357, var1.field_22358, var1.field_22356)
         .method_35742(var1.field_22352, var1.field_22350, var1.field_22351, var1.field_22355)
         .method_35745(this.field_35669, this.field_35671)
         .method_35747(var4)
         .method_35735();
      var3.method_35762(var2, var1.field_22354, var1.field_22358, var1.field_22356)
         .method_35742(var1.field_22352, var1.field_22350, var1.field_22351, var1.field_22355)
         .method_35745(this.field_35669, this.field_35667)
         .method_35747(var4)
         .method_35735();
      var3.method_35762(var2, var1.field_22354, var1.field_22353, var1.field_22356)
         .method_35742(var1.field_22352, var1.field_22350, var1.field_22351, var1.field_22355)
         .method_35745(this.field_35672, this.field_35667)
         .method_35747(var4)
         .method_35735();
      var3.method_35762(var2, var1.field_22357, var1.field_22353, var1.field_22356)
         .method_35742(var1.field_22352, var1.field_22350, var1.field_22351, var1.field_22355)
         .method_35745(this.field_35672, this.field_35671)
         .method_35747(var4)
         .method_35735();
   }

   public RenderLayer method_31740(boolean var1) {
      return !var1 ? this.field_35664 : this.field_35670;
   }
}
