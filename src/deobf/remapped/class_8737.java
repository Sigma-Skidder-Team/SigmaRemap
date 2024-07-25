package remapped;

public class class_8737 extends class_446 {
   private final class_2612 field_44758;

   public class_8737(class_9568 var1, class_9568 var2, int var3) {
      super(var2, "verticalScrollBarButton", 0, 0, var3, 10, true);
      this.field_44759 = var1;
      this.field_20347 = true;
      this.field_44758 = (class_2612)var2.method_32167();
      this.method_32105(false);
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
      float var5 = (float)this.field_44758.method_11850().method_32137();
      float var6 = (float)this.field_36283.method_32167().method_32137();
      float var7 = (float)this.field_36283.method_32137();
      float var8 = var6 / var5;
      float var9 = var7 * var8;
      float var10 = 20.0F;
      if (!(var9 < 20.0F)) {
         if (var9 > var7) {
            var9 = var7;
         }
      } else {
         var9 = 20.0F;
      }

      this.method_32158((int)var9);
      if (!this.field_20339 && this.method_32137() != this.field_36283.method_32137()) {
         if (this.field_44759.field_48684 >= 0) {
            if (this.field_44759.field_48684 + this.field_36283.method_32167().method_32137() > this.field_44758.method_11850().method_32137()) {
               this.field_44759.field_48684 = this.field_44758.method_11850().method_32137() - this.field_36283.method_32167().method_32137();
            }
         } else {
            this.field_44759.field_48684 = 0;
         }

         float var16 = var5 - var6;
         float var13 = (float)this.field_44759.field_48684 / var16;
         float var14 = (float)(this.field_36283.method_32137() - this.method_32137());
         float var15 = var14 * var13 + 0.5F;
         this.method_32117((int)var15);
      } else if (this.method_1535()) {
         float var12 = (float)this.method_32173() / (float)this.field_36283.method_32137();
         this.field_44759.field_48684 = (int)(var12 * (float)this.field_44758.method_11850().method_32137());
         if (this.field_44759.field_48684 >= 0) {
            if (this.field_44759.field_48684 + this.field_36283.method_32167().method_32137() > this.field_44758.method_11850().method_32137()) {
               this.field_44759.field_48684 = this.field_44758.method_11850().method_32137() - this.field_36283.method_32167().method_32137();
            }
         } else {
            this.field_44759.field_48684 = 0;
         }

         this.field_44759.field_48686.method_14773();
         this.field_44759.field_48686.method_14776();
      }
   }

   @Override
   public void method_32178(float var1) {
      byte var4 = 5;
      var1 *= !this.field_20339 ? (!this.field_36279 ? 0.3F : 0.7F) : 0.75F;
      int var5 = this.field_36270;
      int var6 = this.field_36278;
      if (SigmaMainClass.getInstance().method_3312() != class_6015.field_30645) {
         var4 = 0;
         var6 -= 7;
         var5 += 7;
         class_73.method_94(
            (float)var5,
            (float)(this.field_36261 + var4),
            (float)(var5 + var6),
            (float)(this.field_36261 + this.method_32137() - var4),
            class_314.method_1444(class_1255.field_6920.field_6917, 1.0F * var1)
         );
      } else {
         class_73.method_97((float)var5, (float)this.field_36261, (float)var6, (float)var4, class_2209.field_11025, var1);
         class_73.method_97((float)var5, (float)(this.field_36261 + this.field_36257 - var4), (float)var6, (float)var4, class_2209.field_11047, var1);
         class_73.method_94(
            (float)var5,
            (float)(this.field_36261 + var4),
            (float)(var5 + var6),
            (float)(this.field_36261 + this.method_32137() - var4),
            class_314.method_1444(class_1255.field_6929.field_6917, 0.45F * var1)
         );
      }

      super.method_32178(var1);
   }
}
