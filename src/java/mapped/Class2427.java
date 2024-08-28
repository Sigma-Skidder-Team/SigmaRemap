package mapped;

import java.io.Serializable;

public class Class2427 implements Serializable {
   private static String[] field16459;
   public Class2519 field16460;
   public Class2427 field16461;
   public final Class2535 field16462;

   public Class2427(Class2535 var1) {
      this.field16462 = var1;
   }

   public void method10410() {
      if (this.field16460 != null) {
         Class2535.method10716(this.field16462, this.field16460);
         this.field16460 = null;
      }
   }

   public void method10411(Class2519 var1) {
      if (this.field16460 == null) {
         this.field16460 = var1;
         var1.field16666 = var1;
         var1.field16665 = var1;
      } else {
         this.field16460.method10568(var1);
      }
   }

   public void method10412() {
      if (this.field16460 != null) {
         Class2519 var3 = this.field16460;

         do {
            var3.method10571();
         } while ((var3 = var3.field16666) != this.field16460);
      }
   }

   public boolean method10413(Class2532 var1, Class2532 var2) {
      double var5 = (double)(var2.field16737 - var1.field16737);
      double var7 = (double)(var2.field16738 - var1.field16738);
      Class2519 var9 = this.field16460;

      while (true) {
         Class2519 var10 = var9.field16666;
         if (var9.field16664 != var1 && var10.field16664 != var1 && var9.field16664 != var2 && var10.field16664 != var2) {
            double var11 = (double)(var10.field16664.field16737 - var9.field16664.field16737);
            double var13 = (double)(var10.field16664.field16738 - var9.field16664.field16738);
            double var15 = var5 * var13 - var7 * var11;
            if (Math.abs(var15) > 1.0E-5) {
               double var17 = (double)(var9.field16664.field16737 - var1.field16737);
               double var19 = (double)(var9.field16664.field16738 - var1.field16738);
               double var21 = (var13 * var17 - var11 * var19) / var15;
               double var23 = (var7 * var17 - var5 * var19) / var15;
               if (var21 >= 0.0 && var21 <= 1.0 && var23 >= 0.0 && var23 <= 1.0) {
                  return true;
               }
            }
         }

         if (var10 == this.field16460) {
            return false;
         }

         var9 = var10;
      }
   }

   public int method10414() {
      if (this.field16460 == null) {
         return 0;
      } else {
         int var3 = 0;
         Class2519 var4 = this.field16460;

         do {
            var3++;
         } while ((var4 = var4.field16666) != this.field16460);

         return var3;
      }
   }

   public boolean method10415(Class2532 var1) {
      if (this.field16460 != null) {
         return !this.field16460.field16665.field16664.equals(var1) ? this.field16460.field16664.equals(var1) : true;
      } else {
         return false;
      }
   }
}
