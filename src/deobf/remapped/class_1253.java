package remapped;

public class class_1253<T extends class_496> extends class_6484<T> {
   private static String[] field_6905;
   private float field_6904;
   private float field_6902;
   private float field_6903;

   public class_1253(int var1, float var2) {
      super(var1, var2, true, 23.0F, 4.8F, 2.7F, 3.0F, 49);
      this.field_49928 = 64;
      this.field_49927 = 64;
      this.field_33024 = new class_1549(this, 0, 6);
      this.field_33024.method_7048(-6.5F, -5.0F, -4.0F, 13.0F, 10.0F, 9.0F);
      this.field_33024.method_7046(0.0F, 11.5F, -17.0F);
      this.field_33024.method_7037(45, 16).method_7048(-3.5F, 0.0F, -6.0F, 7.0F, 5.0F, 2.0F);
      this.field_33024.method_7037(52, 25).method_7048(-8.5F, -8.0F, -1.0F, 5.0F, 4.0F, 1.0F);
      this.field_33024.method_7037(52, 25).method_7048(3.5F, -8.0F, -1.0F, 5.0F, 4.0F, 1.0F);
      this.field_33021 = new class_1549(this, 0, 25);
      this.field_33021.method_7048(-9.5F, -13.0F, -6.5F, 19.0F, 26.0F, 13.0F);
      this.field_33021.method_7046(0.0F, 10.0F, 0.0F);
      byte var5 = 9;
      byte var6 = 6;
      this.field_33022 = new class_1549(this, 40, 0);
      this.field_33022.method_7048(-3.0F, 0.0F, -3.0F, 6.0F, 9.0F, 6.0F);
      this.field_33022.method_7046(-5.5F, 15.0F, 9.0F);
      this.field_33027 = new class_1549(this, 40, 0);
      this.field_33027.method_7048(-3.0F, 0.0F, -3.0F, 6.0F, 9.0F, 6.0F);
      this.field_33027.method_7046(5.5F, 15.0F, 9.0F);
      this.field_33023 = new class_1549(this, 40, 0);
      this.field_33023.method_7048(-3.0F, 0.0F, -3.0F, 6.0F, 9.0F, 6.0F);
      this.field_33023.method_7046(-5.5F, 15.0F, -9.0F);
      this.field_33026 = new class_1549(this, 40, 0);
      this.field_33026.method_7048(-3.0F, 0.0F, -3.0F, 6.0F, 9.0F, 6.0F);
      this.field_33026.method_7046(5.5F, 15.0F, -9.0F);
   }

   public void method_5643(T var1, float var2, float var3, float var4) {
      super.method_29702((T)var1, var2, var3, var4);
      this.field_6904 = var1.method_2411(var4);
      this.field_6902 = var1.method_2420(var4);
      this.field_6903 = !var1.method_26449() ? var1.method_2425(var4) : 0.0F;
   }

   public void method_5642(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.method_29700((T)var1, var2, var3, var4, var5, var6);
      boolean var9 = var1.method_2430() > 0;
      boolean var10 = var1.method_2464();
      int var11 = var1.method_2460();
      boolean var12 = var1.method_2427();
      boolean var13 = var1.method_2421();
      if (!var9) {
         this.field_33024.field_8185 = 0.0F;
      } else {
         this.field_33024.field_8190 = 0.35F * MathHelper.sin(0.6F * var4);
         this.field_33024.field_8185 = 0.35F * MathHelper.sin(0.6F * var4);
         this.field_33023.field_8191 = -0.75F * MathHelper.sin(0.3F * var4);
         this.field_33026.field_8191 = 0.75F * MathHelper.sin(0.3F * var4);
      }

      if (var10) {
         if (var11 >= 15) {
            if (var11 < 20) {
               float var14 = (float)((var11 - 15) / 5);
               this.field_33024.field_8191 = (float) (-Math.PI / 4) + (float) (Math.PI / 4) * var14;
            }
         } else {
            this.field_33024.field_8191 = (float) (-Math.PI / 4) * (float)var11 / 14.0F;
         }
      }

      if (!(this.field_6904 > 0.0F)) {
         this.field_33022.field_8185 = 0.0F;
         this.field_33027.field_8185 = 0.0F;
         this.field_33023.field_8185 = 0.0F;
         this.field_33026.field_8185 = 0.0F;
      } else {
         this.field_33021.field_8191 = class_8746.method_40145(this.field_33021.field_8191, 1.7407963F, this.field_6904);
         this.field_33024.field_8191 = class_8746.method_40145(this.field_33024.field_8191, (float) (Math.PI / 2), this.field_6904);
         this.field_33023.field_8185 = -0.27079642F;
         this.field_33026.field_8185 = 0.27079642F;
         this.field_33022.field_8185 = 0.5707964F;
         this.field_33027.field_8185 = -0.5707964F;
         if (var12) {
            this.field_33024.field_8191 = (float) (Math.PI / 2) + 0.2F * MathHelper.sin(var4 * 0.6F);
            this.field_33023.field_8191 = -0.4F - 0.2F * MathHelper.sin(var4 * 0.6F);
            this.field_33026.field_8191 = -0.4F - 0.2F * MathHelper.sin(var4 * 0.6F);
         }

         if (var13) {
            this.field_33024.field_8191 = 2.1707964F;
            this.field_33023.field_8191 = -0.9F;
            this.field_33026.field_8191 = -0.9F;
         }
      }

      if (this.field_6902 > 0.0F) {
         this.field_33022.field_8191 = -0.6F * MathHelper.sin(var4 * 0.15F);
         this.field_33027.field_8191 = 0.6F * MathHelper.sin(var4 * 0.15F);
         this.field_33023.field_8191 = 0.3F * MathHelper.sin(var4 * 0.25F);
         this.field_33026.field_8191 = -0.3F * MathHelper.sin(var4 * 0.25F);
         this.field_33024.field_8191 = class_8746.method_40145(this.field_33024.field_8191, (float) (Math.PI / 2), this.field_6902);
      }

      if (this.field_6903 > 0.0F) {
         this.field_33024.field_8191 = class_8746.method_40145(this.field_33024.field_8191, 2.0561945F, this.field_6903);
         this.field_33022.field_8191 = -0.5F * MathHelper.sin(var4 * 0.5F);
         this.field_33027.field_8191 = 0.5F * MathHelper.sin(var4 * 0.5F);
         this.field_33023.field_8191 = 0.5F * MathHelper.sin(var4 * 0.5F);
         this.field_33026.field_8191 = -0.5F * MathHelper.sin(var4 * 0.5F);
      }
   }
}
