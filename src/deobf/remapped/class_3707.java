package remapped;

import java.awt.Color;

public class class_3707 extends class_1859 {
   private static String[] field_18190;
   private float field_18189;
   public boolean field_18191 = false;

   public class_3707(class_7038 var1, String var2, int var3, int var4, int var5, int var6, float var7) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field_18189 = var7;
   }

   @Override
   public void method_32145(int var1, int var2) {
      int var5 = this.method_32189() - this.method_32155();
      if (this.field_18191) {
         this.method_17209((float)var5 / (float)this.method_32109());
      }

      super.method_32145(var1, var2);
   }

   @Override
   public void method_32178(float var1) {
      for (int var4 = 0; var4 < this.field_36278; var4++) {
         float var5 = (float)var4 / (float)this.field_36278;
         class_73.method_103(
            (float)(this.field_36270 + var4),
            (float)this.field_36261,
            1.0F,
            (float)this.field_36257,
            class_314.method_1444(Color.HSBtoRGB(var5, 1.0F, 1.0F), var1)
         );
      }

      class_73.method_109(
         (float)this.method_32132(),
         (float)this.method_32173(),
         (float)(this.method_32132() + this.method_32109()),
         (float)(this.method_32173() + this.method_32137()),
         class_314.method_1444(class_1255.field_6920.field_6917, 0.5F * var1)
      );
      class_628.method_2920(
         this.field_36270 + Math.round((float)this.field_36278 * this.field_18189) + 1,
         this.field_36261 + 4,
         Color.HSBtoRGB(this.field_18189, 1.0F, 1.0F),
         var1
      );
      super.method_32178(var1);
   }

   @Override
   public boolean method_29508(int var1, int var2, int var3) {
      this.field_18191 = true;
      return super.method_29508(var1, var2, var3);
   }

   @Override
   public void method_29505(int var1, int var2, int var3) {
      this.field_18191 = false;
   }

   public float method_17208() {
      return this.field_18189;
   }

   public void method_17209(float var1) {
      this.method_17210(var1, true);
   }

   public void method_17210(float var1, boolean var2) {
      var1 = Math.min(Math.max(var1, 0.0F), 1.0F);
      float var5 = this.field_18189;
      this.field_18189 = var1;
      if (var2 && var5 != var1) {
         this.method_8235();
      }
   }
}
