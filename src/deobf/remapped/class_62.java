package remapped;

public class class_62<T extends class_2811> extends class_7939<T> {
   private static String[] field_62;

   public class_62(float var1, float var2, int var3, int var4) {
      super(var1, var2, var3, var4);
      this.field_11705 = new class_1549(this, 32, 48);
      this.field_11705.method_7049(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
      this.field_11705.method_7046(-5.0F, 2.0F + var2, 0.0F);
      this.field_11706 = new class_1549(this, 16, 48);
      this.field_11706.method_7049(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
      this.field_11706.method_7046(-1.9F, 12.0F + var2, 0.0F);
   }

   public class_62(float var1, boolean var2) {
      super(var1, 0.0F, 64, !var2 ? 64 : 32);
   }

   public void method_42(T var1, float var2, float var3, float var4) {
      this.field_11698 = class_5455.field_27806;
      this.field_11702 = class_5455.field_27806;
      class_6098 var7 = var1.method_26617(class_2584.field_12791);
      if (var7.method_27960() == class_4897.field_25086 && var1.method_26892()) {
         if (var1.method_26432() != class_1736.field_8943) {
            this.field_11702 = class_5455.field_27807;
         } else {
            this.field_11698 = class_5455.field_27807;
         }
      }

      super.method_10747((T)var1, var2, var3, var4);
   }

   public void method_41(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.method_11330((T)var1, var2, var3, var4, var5, var6);
      if (this.field_11702 == class_5455.field_27807) {
         this.field_11701.field_8191 = this.field_11701.field_8191 * 0.5F - (float) Math.PI;
         this.field_11701.field_8190 = 0.0F;
      }

      if (this.field_11698 == class_5455.field_27807) {
         this.field_11705.field_8191 = this.field_11705.field_8191 * 0.5F - (float) Math.PI;
         this.field_11705.field_8190 = 0.0F;
      }

      if (this.field_11699 > 0.0F) {
         this.field_11705.field_8191 = this.method_10745(this.field_11699, this.field_11705.field_8191, (float) (-Math.PI * 4.0 / 5.0))
            + this.field_11699 * 0.35F * class_9299.method_42818(0.1F * var4);
         this.field_11701.field_8191 = this.method_10745(this.field_11699, this.field_11701.field_8191, (float) (-Math.PI * 4.0 / 5.0))
            - this.field_11699 * 0.35F * class_9299.method_42818(0.1F * var4);
         this.field_11705.field_8185 = this.method_10745(this.field_11699, this.field_11705.field_8185, -0.15F);
         this.field_11701.field_8185 = this.method_10745(this.field_11699, this.field_11701.field_8185, 0.15F);
         this.field_11703.field_8191 = this.field_11703.field_8191 - this.field_11699 * 0.55F * class_9299.method_42818(0.1F * var4);
         this.field_11706.field_8191 = this.field_11706.field_8191 + this.field_11699 * 0.55F * class_9299.method_42818(0.1F * var4);
         this.field_11696.field_8191 = 0.0F;
      }
   }
}
