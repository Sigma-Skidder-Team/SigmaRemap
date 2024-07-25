package remapped;

public class class_6300<T extends class_5886 & class_2354> extends class_2344<T> {
   private static String[] field_32192;

   public class_6300() {
      this(0.0F, false);
   }

   public class_6300(float var1, boolean var2) {
      super(var1);
      if (!var2) {
         this.field_11705 = new class_1549(this, 40, 16);
         this.field_11705.method_7049(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, var1);
         this.field_11705.method_7046(-5.0F, 2.0F, 0.0F);
         this.field_11701 = new class_1549(this, 40, 16);
         this.field_11701.field_8197 = true;
         this.field_11701.method_7049(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, var1);
         this.field_11701.method_7046(5.0F, 2.0F, 0.0F);
         this.field_11706 = new class_1549(this, 0, 16);
         this.field_11706.method_7049(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, var1);
         this.field_11706.method_7046(-2.0F, 12.0F, 0.0F);
         this.field_11703 = new class_1549(this, 0, 16);
         this.field_11703.field_8197 = true;
         this.field_11703.method_7049(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, var1);
         this.field_11703.method_7046(2.0F, 12.0F, 0.0F);
      }
   }

   public void method_28755(T var1, float var2, float var3, float var4) {
      this.field_11698 = class_5455.field_27806;
      this.field_11702 = class_5455.field_27806;
      class_6098 var7 = var1.method_26617(class_2584.field_12791);
      if (var7.method_27960() == class_4897.field_25206 && var1.method_26892()) {
         if (var1.method_26432() != class_1736.field_8943) {
            this.field_11702 = class_5455.field_27803;
         } else {
            this.field_11698 = class_5455.field_27803;
         }
      }

      super.method_10747((T)var1, var2, var3, var4);
   }

   public void method_28754(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.method_10738((T)var1, var2, var3, var4, var5, var6);
      class_6098 var9 = var1.method_26446();
      if (var1.method_26892() && (var9.method_28022() || var9.method_27960() != class_4897.field_25206)) {
         float var10 = class_9299.method_42818(this.field_33202 * (float) Math.PI);
         float var11 = class_9299.method_42818((1.0F - (1.0F - this.field_33202) * (1.0F - this.field_33202)) * (float) Math.PI);
         this.field_11705.field_8185 = 0.0F;
         this.field_11701.field_8185 = 0.0F;
         this.field_11705.field_8190 = -(0.1F - var10 * 0.6F);
         this.field_11701.field_8190 = 0.1F - var10 * 0.6F;
         this.field_11705.field_8191 = (float) (-Math.PI / 2);
         this.field_11701.field_8191 = (float) (-Math.PI / 2);
         this.field_11705.field_8191 -= var10 * 1.2F - var11 * 0.4F;
         this.field_11701.field_8191 -= var10 * 1.2F - var11 * 0.4F;
         class_3191.method_14687(this.field_11705, this.field_11701, var4);
      }
   }

   @Override
   public void method_7948(class_1736 var1, class_7966 var2) {
      float var5 = var1 != class_1736.field_8943 ? -1.0F : 1.0F;
      class_1549 var6 = this.method_10746(var1);
      var6.field_8183 += var5;
      var6.method_7057(var2);
      var6.field_8183 -= var5;
   }
}
