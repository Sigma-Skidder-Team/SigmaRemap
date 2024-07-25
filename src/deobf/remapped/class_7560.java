package remapped;

public final class class_7560 implements AutoCloseable {
   private static String[] field_38524;
   private final class_5797[] field_38526;

   private class_7560(class_5155 var1, class_8353 var2, int var3) {
      this.field_38525 = var1;
      this.field_38526 = new class_5797[var3 + 1];

      for (int var6 = 0; var6 < this.field_38526.length; var6++) {
         int var7 = class_8353.method_38462(var2) >> var6;
         int var8 = class_8353.method_38461(var2) >> var6;
         if (this.field_38526[var6] == null) {
            this.field_38526[var6] = new class_5797(var7, var8, false);
         }
      }
   }

   private void method_34389() {
      double var3 = 1.0
         - (double)class_5155.method_23614(this.field_38525)
            / (double)class_5155.method_23618(this.field_38525).method_18500(class_5155.method_23636(this.field_38525));
      int var5 = class_5155.method_23618(this.field_38525).method_18506(class_5155.method_23636(this.field_38525));
      int var6 = class_5155.method_23618(this.field_38525).method_18507() != 0
         ? class_5155.method_23618(this.field_38525).method_18507()
         : this.field_38525.method_23610();
      int var7 = class_5155.method_23618(this.field_38525).method_18506((class_5155.method_23636(this.field_38525) + 1) % var6);
      if (var5 != var7 && var7 >= 0 && var7 < this.field_38525.method_23610()) {
         for (int var8 = 0; var8 < this.field_38526.length; var8++) {
            int var9 = class_8353.method_38462(class_5155.method_23643(this.field_38525)) >> var8;
            int var10 = class_8353.method_38461(class_5155.method_23643(this.field_38525)) >> var8;

            for (int var11 = 0; var11 < var10; var11++) {
               for (int var12 = 0; var12 < var9; var12++) {
                  int var13 = this.method_34390(var5, var8, var12, var11);
                  int var14 = this.method_34390(var7, var8, var12, var11);
                  int var15 = this.method_34388(var3, var13 >> 16 & 0xFF, var14 >> 16 & 0xFF);
                  int var16 = this.method_34388(var3, var13 >> 8 & 0xFF, var14 >> 8 & 0xFF);
                  int var17 = this.method_34388(var3, var13 & 0xFF, var14 & 0xFF);
                  this.field_38526[var8].method_26242(var12, var11, var13 & 0xFF000000 | var15 << 16 | var16 << 8 | var17);
               }
            }
         }

         class_5155.method_23609(this.field_38525, 0, 0, this.field_38526);
      }
   }

   private int method_34390(int var1, int var2, int var3, int var4) {
      return this.field_38525.field_26552[var2]
         .method_26252(
            var3 + (class_5155.method_23594(this.field_38525)[var1] * class_8353.method_38462(class_5155.method_23643(this.field_38525)) >> var2),
            var4 + (class_5155.method_23623(this.field_38525)[var1] * class_8353.method_38461(class_5155.method_23643(this.field_38525)) >> var2)
         );
   }

   private int method_34388(double var1, int var3, int var4) {
      return (int)(var1 * (double)var3 + (1.0 - var1) * (double)var4);
   }

   @Override
   public void close() {
      for (class_5797 var6 : this.field_38526) {
         if (var6 != null) {
            var6.close();
         }
      }
   }
}
