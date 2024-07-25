package remapped;

public class class_2774 extends class_9609 {
   private static String[] field_13553;
   public float field_13552;

   public strictfp class_2774(float var1, float var2, float var3) {
      this(var1, var2, var3, 50);
   }

   public strictfp class_2774(float var1, float var2, float var3, int var4) {
      super(var1, var2, var3, var3, var4);
      this.field_16381 = var1 - var3;
      this.field_16380 = var2 - var3;
      this.field_13552 = var3;
      this.field_16379 = var3;
   }

   @Override
   public strictfp float method_15241() {
      return this.method_15212() + this.field_13552;
   }

   @Override
   public strictfp float method_15222() {
      return this.method_15220() + this.field_13552;
   }

   public strictfp void method_12631(float var1) {
      if (var1 != this.field_13552) {
         this.field_16377 = true;
         this.field_13552 = var1;
         this.method_44371(var1, var1);
      }
   }

   public strictfp float method_12632() {
      return this.field_13552;
   }

   @Override
   public strictfp boolean method_15205(class_3316 var1) {
      if (!(var1 instanceof class_2774)) {
         return !(var1 instanceof class_2783) ? super.method_15205(var1) : this.method_12629((class_2783)var1);
      } else {
         class_2774 var4 = (class_2774)var1;
         float var5 = this.method_12632() + var4.method_12632();
         if (!(Math.abs(var4.method_15241() - this.method_15241()) > var5)) {
            if (!(Math.abs(var4.method_15222() - this.method_15222()) > var5)) {
               var5 *= var5;
               float var6 = Math.abs(var4.method_15241() - this.method_15241());
               float var7 = Math.abs(var4.method_15222() - this.method_15222());
               return var5 >= var6 * var6 + var7 * var7;
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   @Override
   public strictfp boolean method_15224(float var1, float var2) {
      return (var1 - this.method_15212()) * (var1 - this.method_15212()) + (var2 - this.method_15220()) * (var2 - this.method_15220())
         < this.method_12632() * this.method_12632();
   }

   private strictfp boolean method_12633(class_7133 var1) {
      return this.method_15224(var1.method_32762(), var1.method_32770()) && this.method_15224(var1.method_32755(), var1.method_32754());
   }

   @Override
   public strictfp void method_15218() {
      this.field_16376 = new float[2];
      this.field_16376[0] = this.field_16381 + this.field_13552;
      this.field_16376[1] = this.field_16380 + this.field_13552;
   }

   @Override
   public strictfp void method_15235() {
      this.field_16379 = this.field_13552;
   }

   private strictfp boolean method_12629(class_2783 var1) {
      if (var1.method_15224(this.field_16381 + this.field_13552, this.field_16380 + this.field_13552)) {
         return true;
      } else {
         float var6 = var1.method_15212();
         float var7 = var1.method_15220();
         float var8 = var1.method_15212() + var1.method_15213();
         float var9 = var1.method_15220() + var1.method_15239();
         class_7133[] var10 = new class_7133[]{
            new class_7133(var6, var7, var8, var7),
            new class_7133(var8, var7, var8, var9),
            new class_7133(var8, var9, var6, var9),
            new class_7133(var6, var9, var6, var7)
         };
         float var11 = this.method_12632() * this.method_12632();
         class_1440 var12 = new class_1440(this.method_15241(), this.method_15222());

         for (int var13 = 0; var13 < 4; var13++) {
            float var14 = var10[var13].method_32767(var12);
            if (var14 < var11) {
               return true;
            }
         }

         return false;
      }
   }

   private strictfp boolean method_12630(class_7133 var1) {
      class_1440 var4 = new class_1440(var1.method_32762(), var1.method_32770());
      class_1440 var5 = new class_1440(var1.method_32755(), var1.method_32754());
      class_1440 var6 = new class_1440(this.method_15241(), this.method_15222());
      class_1440 var7 = var5.method_6600().method_6605(var4);
      class_1440 var8 = var6.method_6600().method_6605(var4);
      float var9 = var7.method_6597();
      float var10 = var8.method_6606(var7) / var9;
      class_1440 var12;
      if (!(var10 < 0.0F)) {
         if (!(var10 > var9)) {
            class_1440 var11 = var7.method_6600().method_6595(var10 / var9);
            var12 = var4.method_6600().method_6612(var11);
         } else {
            var12 = var5;
         }
      } else {
         var12 = var4;
      }

      return var6.method_6600().method_6605(var12).method_6601() <= this.method_12632() * this.method_12632();
   }
}
