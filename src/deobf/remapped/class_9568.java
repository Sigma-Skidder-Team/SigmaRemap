package remapped;

public class class_9568 extends class_446 implements class_475 {
   public int field_48684;
   public float field_48688;
   public boolean field_48685;
   public final class_8737 field_48683;
   public Timer field_48686 = new Timer();

   public class_9568(class_7038 var1, int var2) {
      super(var1, "verticalScrollBar", var1.method_32109() - var2 - 5, 5, var2, var1.method_32137() - 10, false);
      this.method_32135((var1x, var2x) -> {
         var1x.method_32175(var2x.method_32109() - var2 - 5);
         var1x.method_32117(5);
         var1x.method_32142(var2);
         var1x.method_32158(var2x.method_32137() - 10);
      });
      this.method_32148(this.field_48683 = new class_8737(this, this, var2));
   }

   @Override
   public void method_29510(float var1) {
      super.method_29510(var1);
      if (this.field_36283 != null && this.field_36283.method_32157(this.method_32189(), this.method_32129(), false)
         || ((class_2612)this.field_36283).field_12896) {
         float var4 = (float)((class_2612)this.method_32167()).method_11850().method_32137();
         float var5 = (float)this.method_32167().method_32137();
         float var6 = (float)this.method_32137();
         if (var4 == 0.0F) {
            return;
         }

         float var7 = var5 / var4;
         if (var7 >= 1.0F) {
            return;
         }

         this.field_48684 = this.field_48684
            - Math.round(
               !(var1 < 0.0F) ? (float)((class_2612)this.field_36283).field_12900 * var1 : 1.0F * (float)((class_2612)this.field_36283).field_12900 * var1
            );
         this.field_48686.method_14773();
         this.field_48686.method_14776();
      }
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
      this.field_36279 = this.method_32157(var1, var2, false);
      this.field_48688 = this.field_48688
         + (
            this.field_48683.method_32137() >= this.method_32137()
               ? -1.0F
               : (
                  !this.method_32183() && !this.field_48683.method_1535() && (!this.field_48686.method_14771() || this.field_48686.method_14772() >= 500L)
                     ? -0.05F
                     : 0.05F
               )
         );
      this.field_48688 = Math.min(Math.max(0.0F, this.field_48688), 1.0F);
      float var5 = (float)((class_2612)this.method_32167()).method_11850().method_32137();
      float var6 = (float)this.method_32167().method_32137();
      float var7 = (float)this.method_32137();
      float var8 = var6 / var5;
      boolean var9 = var8 < 1.0F && var5 > 0.0F && this.field_48688 >= 0.0F;
      this.method_32104(var9);
      this.method_32119(var9);
   }

   @Override
   public void method_32178(float var1) {
      var1 *= this.field_48688;
      byte var4 = 5;
      int var5 = class_314.method_1444(class_1255.field_6929.field_6917, 0.2F * var1);
      int var6 = this.field_36270;
      int var7 = this.field_36278;
      if (SigmaMainClass.getInstance().method_3312() != class_6015.field_30645) {
         var4 = 0;
         var7 -= 8;
         var6 += 8;
         class_73.method_94(
            (float)var6,
            (float)(this.field_36261 + var4),
            (float)(var6 + var7),
            (float)(this.field_36261 + this.field_36257 - var4),
            class_314.method_1444(class_1255.field_6920.field_6917, 0.1F * var1)
         );
      } else {
         class_73.method_97((float)var6, (float)this.field_36261, (float)var7, 5.0F, class_2209.field_11025, 0.45F * var1);
         class_73.method_97((float)var6, (float)(this.field_36261 + this.field_36257 - var4), (float)var7, 5.0F, class_2209.field_11047, 0.45F * var1);
         class_73.method_94((float)var6, (float)(this.field_36261 + var4), (float)(var6 + var7), (float)(this.field_36261 + this.field_36257 - var4), var5);
      }

      super.method_32178(var1);
   }

   @Override
   public boolean method_29508(int var1, int var2, int var3) {
      if (!super.method_29508(var1, var2, var3)) {
         this.field_36279 = this.method_32157(var1, var2, false);
         if (this.method_32183()) {
            int var6 = var2 - this.method_32093();
            if (var6 <= this.field_48683.method_32173() + this.field_48683.method_32137()) {
               if (var6 < this.field_48683.method_32173()) {
                  this.field_48684 = this.field_48684 - (int)((float)((class_2612)this.field_36283).method_11850().method_32137() / 4.0F);
               }
            } else {
               this.field_48684 = this.field_48684 + (int)((float)((class_2612)this.field_36283).method_11850().method_32137() / 4.0F);
            }
         }

         return false;
      } else {
         return true;
      }
   }

   @Override
   public JSONObjectImpl method_32180(JSONObjectImpl var1) {
      var1.method_5818("offset", this.field_48684);
      return super.method_32180(var1);
   }

   @Override
   public void method_32159(JSONObjectImpl var1) {
      super.method_32159(var1);
      this.field_48684 = JSONWriter.saveIntValue(var1, "offset", this.field_48684);
   }

   @Override
   public int method_2266() {
      return this.field_48684;
   }

   @Override
   public void method_2265(int var1) {
      this.field_48684 = var1;
   }

   @Override
   public boolean method_2264() {
      return this.field_48685;
   }
}
