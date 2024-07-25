package remapped;

public class class_5424 {
   private class_5851[] field_27629 = new class_5851[128];
   private int field_27630;

   public class_5851 method_24666(class_5851 var1) {
      if (var1.field_29737 < 0) {
         if (this.field_27630 == this.field_27629.length) {
            class_5851[] var4 = new class_5851[this.field_27630 << 1];
            System.arraycopy(this.field_27629, 0, var4, 0, this.field_27630);
            this.field_27629 = var4;
         }

         this.field_27629[this.field_27630] = var1;
         var1.field_29737 = this.field_27630;
         this.method_24665(this.field_27630++);
         return var1;
      } else {
         throw new IllegalStateException("OW KNOWS!");
      }
   }

   public void method_24664() {
      this.field_27630 = 0;
   }

   public class_5851 method_24667() {
      class_5851 var3 = this.field_27629[0];
      this.field_27629[0] = this.field_27629[--this.field_27630];
      this.field_27629[this.field_27630] = null;
      if (this.field_27630 > 0) {
         this.method_24662(0);
      }

      var3.field_29737 = -1;
      return var3;
   }

   public void method_24668(class_5851 var1, float var2) {
      float var5 = var1.field_29732;
      var1.field_29732 = var2;
      if (!(var2 < var5)) {
         this.method_24662(var1.field_29737);
      } else {
         this.method_24665(var1.field_29737);
      }
   }

   private void method_24665(int var1) {
      class_5851 var4 = this.field_27629[var1];
      float var5 = var4.field_29732;

      while (var1 > 0) {
         int var6 = var1 - 1 >> 1;
         class_5851 var7 = this.field_27629[var6];
         if (!(var5 < var7.field_29732)) {
            break;
         }

         this.field_27629[var1] = var7;
         var7.field_29737 = var1;
         var1 = var6;
      }

      this.field_27629[var1] = var4;
      var4.field_29737 = var1;
   }

   private void method_24662(int var1) {
      class_5851 var4 = this.field_27629[var1];
      float var5 = var4.field_29732;

      while (true) {
         int var6 = 1 + (var1 << 1);
         int var7 = var6 + 1;
         if (var6 >= this.field_27630) {
            break;
         }

         class_5851 var8 = this.field_27629[var6];
         float var9 = var8.field_29732;
         class_5851 var10;
         float var11;
         if (var7 < this.field_27630) {
            var10 = this.field_27629[var7];
            var11 = var10.field_29732;
         } else {
            var10 = null;
            var11 = Float.POSITIVE_INFINITY;
         }

         if (!(var9 < var11)) {
            if (!(var11 < var5)) {
               break;
            }

            this.field_27629[var1] = var10;
            var10.field_29737 = var1;
            var1 = var7;
         } else {
            if (!(var9 < var5)) {
               break;
            }

            this.field_27629[var1] = var8;
            var8.field_29737 = var1;
            var1 = var6;
         }
      }

      this.field_27629[var1] = var4;
      var4.field_29737 = var1;
   }

   public boolean method_24663() {
      return this.field_27630 == 0;
   }
}
