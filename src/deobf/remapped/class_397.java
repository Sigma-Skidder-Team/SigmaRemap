package remapped;

public class class_397 extends class_1859 {
   private static String[] field_1666;
   private float field_1665;
   public boolean field_1664 = false;

   public static float method_1992(float var0, float var1, float var2) {
      return (var2 - var0) / (var1 - var0);
   }

   public static float method_1993(float var0, float var1, float var2, float var3, int var4) {
      float var7 = Math.abs(var2 - var1) / var3;
      float var8 = var1 + var0 * var7 * var3;
      return (float)Math.round((double)var8 * Math.pow(10.0, (double)var4)) / (float)Math.pow(10.0, (double)var4);
   }

   public class_397(class_7038 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.method_1990();
   }

   public class_397(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_590 var7) {
      super(var1, var2, var3, var4, var5, var6, var7, false);
      this.method_1990();
   }

   public class_397(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_590 var7, String var8) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, false);
      this.method_1990();
   }

   public class_397(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_590 var7, String var8, class_3384 var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9, false);
      this.method_1990();
   }

   private void method_1990() {
   }

   @Override
   public void method_32145(int var1, int var2) {
      int var5 = this.method_32189() - this.method_32155();
      if (this.field_1664) {
         this.method_1988((float)var5 / (float)this.method_32109());
      }

      super.method_32145(var1, var2);
   }

   @Override
   public void method_32178(float var1) {
      class_73.method_103((float)(this.field_36270 + this.field_36278), (float)(this.field_36261 + 1), 1.0F, (float)(this.field_36257 - 2), -8882056);
      class_73.method_103((float)(this.field_36270 + 1), (float)this.field_36261, (float)(this.field_36278 - 1), (float)this.field_36257, -8882056);
      class_73.method_103((float)this.field_36270, (float)(this.field_36261 + 1), 1.0F, (float)(this.field_36257 - 2), -6250336);
      class_73.method_103(
         (float)(this.field_36270 + 1), (float)this.field_36261, (float)this.field_36278 * this.field_1665 - 1.0F, (float)this.field_36257, -6250336
      );
      this.method_1991(Math.round((float)this.field_36270 + (float)this.field_36278 * this.field_1665) - 2, this.field_36261 - 3);
      super.method_32178(var1);
   }

   public void method_1991(int var1, int var2) {
      class_73.method_103((float)(var1 + 1), (float)(var2 + 1), 4.0F, 8.0F, -3618616);
      class_73.method_103((float)(var1 + 1), (float)(var2 + 1), 1.0F, 1.0F, -4934476);
      class_73.method_103((float)(var1 + 4), (float)(var2 + 1), 1.0F, 1.0F, -4934476);
      class_73.method_103((float)(var1 + 1), (float)(var2 + 8), 1.0F, 1.0F, -4934476);
      class_73.method_103((float)(var1 + 4), (float)(var2 + 8), 1.0F, 1.0F, -4934476);
      class_73.method_103((float)var1, (float)(var2 + 1), 1.0F, 8.0F, -4934476);
      class_73.method_103((float)(var1 + 5), (float)(var2 + 1), 1.0F, 8.0F, -4934476);
      class_73.method_103((float)(var1 + 1), (float)var2, 4.0F, 1.0F, -4934476);
      class_73.method_103((float)(var1 + 1), (float)(var2 + 9), 4.0F, 1.0F, -4934476);
   }

   @Override
   public boolean method_29508(int var1, int var2, int var3) {
      this.field_1664 = true;
      return super.method_29508(var1, var2, var3);
   }

   @Override
   public void method_29505(int var1, int var2, int var3) {
      this.field_1664 = false;
   }

   public float method_1987() {
      return this.field_1665;
   }

   public void method_1988(float var1) {
      this.method_1989(var1, true);
   }

   public void method_1989(float var1, boolean var2) {
      var1 = Math.min(Math.max(var1, 0.0F), 1.0F);
      float var5 = this.field_1665;
      this.field_1665 = var1;
      if (var2 && var5 != var1) {
         this.method_8235();
      }
   }
}
