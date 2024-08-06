package remapped;

import java.awt.Color;

public class class_2377 extends class_1859 {
   private static String[] field_11883;
   public float field_11882;
   private float field_11884 = 0.0F;
   private float field_11881 = 1.0F;
   public boolean field_11885 = false;

   public class_2377(class_7038 var1, String var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field_11882 = var7;
      this.field_11884 = var8;
      this.field_11881 = var9;
   }

   public void method_10868(float var1) {
      this.field_11882 = var1;
   }

   @Override
   public void method_32145(int var1, int var2) {
      if (this.field_11885) {
         int var5 = this.method_32189() - this.method_32155();
         this.method_10865((float)var5 / (float)this.method_32109());
         int var6 = this.method_32129() - this.method_32093();
         this.method_10861(1.0F - (float)var6 / (float)this.method_32137());
      }

      super.method_32145(var1, var2);
   }

   @Override
   public void method_32178(float var1) {
      int var4 = class_314.method_1444(Color.HSBtoRGB(this.field_11882, 0.0F, 1.0F), var1);
      int var5 = class_314.method_1444(Color.HSBtoRGB(this.field_11882, 1.0F, 1.0F), var1);
      int var6 = class_314.method_1444(class_1255.field_6929.field_6917, var1);
      FontManager.method_151(this);
      FontManager.method_82(
         this.method_32132(), this.method_32173(), this.method_32132() + this.method_32109(), this.method_32173() + this.method_32137(), var4, var5, var5, var4
      );
      FontManager.method_82(
         this.method_32132(),
         this.method_32173(),
         this.method_32132() + this.method_32109(),
         this.method_32173() + this.method_32137(),
         class_314.method_1444(class_1255.field_6929.field_6917, 0.0F),
         class_314.method_1444(class_1255.field_6929.field_6917, 0.0F),
         var6,
         var6
      );
      class_628.method_2920(
         this.field_36270 + Math.round((float)this.field_36278 * this.method_10864()),
         this.field_36261 + Math.round((float)this.field_36257 * (1.0F - this.method_10867())),
         Color.HSBtoRGB(this.field_11882, this.field_11884, this.field_11881),
         var1
      );
      FontManager.method_109(
         (float)this.method_32132(),
         (float)this.method_32173(),
         (float)(this.method_32132() + this.method_32109()),
         (float)(this.method_32173() + this.method_32137()),
         class_314.method_1444(class_1255.field_6929.field_6917, 0.25F * var1)
      );
      FontManager.method_141();
      super.method_32178(var1);
   }

   @Override
   public boolean method_29508(int var1, int var2, int var3) {
      this.field_11885 = true;
      return super.method_29508(var1, var2, var3);
   }

   @Override
   public void method_29505(int var1, int var2, int var3) {
      this.field_11885 = false;
   }

   public float method_10864() {
      return this.field_11884;
   }

   public void method_10865(float var1) {
      this.method_10866(var1, true);
   }

   public void method_10866(float var1, boolean var2) {
      var1 = Math.min(Math.max(var1, 0.0F), 1.0F);
      float var5 = this.field_11884;
      this.field_11884 = var1;
      if (var2 && var5 != var1) {
         this.method_8235();
      }
   }

   public float method_10867() {
      return this.field_11881;
   }

   public void method_10861(float var1) {
      this.method_10862(var1, true);
   }

   public void method_10862(float var1, boolean var2) {
      var1 = Math.min(Math.max(var1, 0.0F), 1.0F);
      float var5 = this.field_11881;
      this.field_11881 = var1;
      if (var2 && var5 != var1) {
         this.method_8235();
      }
   }

   public int method_10863() {
      return Color.HSBtoRGB(this.field_11882, this.field_11884, this.field_11881);
   }
}
