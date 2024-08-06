package remapped;

public class class_2816 extends class_6220 {
   private class_1479 field_13826;
   private class_2440 field_13828 = new class_2440(125, 125);

   public class_2816(class_1479 var1, int var2) {
      super(var1, "sliderButton", 0, 0, var2, var2, new class_590(class_1255.field_6918.field_6917));
      this.field_13828.method_11119(class_4043.field_19618);
      this.method_1533(true);
      this.field_20347 = true;
      this.field_13826 = var1;
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
      float var5 = this.field_13826.method_6822();
      float var6 = (float)this.method_32132() / (float)(this.field_36283.method_32109() - this.method_32109());
      if (!this.method_32185() && !this.method_32183() && !this.method_1535()) {
         this.field_13828.method_11119(class_4043.field_19618);
      } else {
         this.field_13828.method_11119(class_4043.field_19620);
      }

      this.field_13826.method_6826(var6);
   }

   @Override
   public void method_32178(float var1) {
      if (!this.method_32140()) {
         float var10000 = 0.3F;
      } else if (!this.method_1535()) {
         if (!this.method_32185()) {
            Math.max(var1 * this.field_31774, 0.0F);
         } else {
            float var8 = 1.5F;
         }
      } else {
         float var9 = 0.0F;
      }

      byte var5 = 5;
      float var6 = (float)this.method_32109();
      FontManager.method_128(
         (float)(this.method_32132() + var5),
         (float)(this.method_32173() + var5),
         (float)(this.method_32109() - var5 * 2),
         (float)(this.method_32137() - var5 * 2),
         10.0F,
         var1 * 0.8F
      );
      FontManager.method_121(
         (float)(this.method_32132() + this.method_32109() / 2),
         (float)(this.method_32173() + this.method_32109() / 2),
         var6,
         class_314.method_1444(class_1255.field_6918.field_6917, var1)
      );
      if (this.method_32165() == null) {
      }

      FontRenderer var7 = class_5320.field_27145;
      super.method_32182(var1);
   }
}
