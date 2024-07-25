package remapped;

import java.io.Serializable;

public class class_8664 implements Serializable {
   private static String[] field_44349;
   public class_2251 field_44347;
   public class_8664 field_44346;

   public class_8664(class_1930 var1) {
      this.field_44348 = var1;
   }

   public void method_39723() {
      if (this.field_44347 != null) {
         class_1930.method_8966(this.field_44348, this.field_44347);
         this.field_44347 = null;
      }
   }

   public void method_39722(class_2251 var1) {
      if (this.field_44347 == null) {
         this.field_44347 = var1;
         var1.field_11197 = var1;
         var1.field_11202 = var1;
      } else {
         this.field_44347.method_10351(var1);
      }
   }

   public void method_39718() {
      if (this.field_44347 != null) {
         class_2251 var3 = this.field_44347;

         do {
            var3.method_10353();
         } while ((var3 = var3.field_11197) != this.field_44347);
      }
   }

   public boolean method_39717(class_1440 var1, class_1440 var2) {
      double var5 = (double)(var2.field_7766 - var1.field_7766);
      double var7 = (double)(var2.field_7765 - var1.field_7765);
      class_2251 var9 = this.field_44347;

      while (true) {
         class_2251 var10 = var9.field_11197;
         if (var9.field_11203 != var1 && var10.field_11203 != var1 && var9.field_11203 != var2 && var10.field_11203 != var2) {
            double var11 = (double)(var10.field_11203.field_7766 - var9.field_11203.field_7766);
            double var13 = (double)(var10.field_11203.field_7765 - var9.field_11203.field_7765);
            double var15 = var5 * var13 - var7 * var11;
            if (Math.abs(var15) > 1.0E-5) {
               double var17 = (double)(var9.field_11203.field_7766 - var1.field_7766);
               double var19 = (double)(var9.field_11203.field_7765 - var1.field_7765);
               double var21 = (var13 * var17 - var11 * var19) / var15;
               double var23 = (var7 * var17 - var5 * var19) / var15;
               if (var21 >= 0.0 && var21 <= 1.0 && var23 >= 0.0 && var23 <= 1.0) {
                  return true;
               }
            }
         }

         if (var10 == this.field_44347) {
            return false;
         }

         var9 = var10;
      }
   }

   public int method_39719() {
      if (this.field_44347 == null) {
         return 0;
      } else {
         int var3 = 0;
         class_2251 var4 = this.field_44347;

         do {
            var3++;
         } while ((var4 = var4.field_11197) != this.field_44347);

         return var3;
      }
   }

   public boolean method_39721(class_1440 var1) {
      if (this.field_44347 != null) {
         return !this.field_44347.field_11202.field_11203.equals(var1) ? this.field_44347.field_11203.equals(var1) : true;
      } else {
         return false;
      }
   }
}
