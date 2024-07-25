package remapped;

import java.io.UnsupportedEncodingException;

public class class_4692 implements class_4027 {
   private class_1888 field_22834;
   private char field_22835;
   private int field_22833;
   private int field_22831;
   private int field_22837;
   private int field_22836;

   public class_4692(class_1888 var1, char var2) {
      this.field_22834 = var1;
      this.field_22835 = var2;
      this.field_22837 = var1.method_8427();
      int var5 = var1.method_8425();
      this.field_22833 = var1.method_36877() / this.field_22837;
      this.field_22831 = var1.method_36856() / var5;
      this.field_22836 = this.field_22837 * var5;
   }

   @Override
   public void method_18544(float var1, float var2, String var3) {
      this.method_18545(var1, var2, var3, class_8709.field_44646);
   }

   @Override
   public void method_18545(float var1, float var2, String var3, class_8709 var4) {
      this.method_18546(var1, var2, var3, var4, 0, var3.length() - 1);
   }

   @Override
   public void method_18546(float var1, float var2, String var3, class_8709 var4, int var5, int var6) {
      try {
         byte[] var9 = var3.getBytes("US-ASCII");

         for (int var10 = 0; var10 < var9.length; var10++) {
            int var11 = var9[var10] - this.field_22835;
            if (var11 < this.field_22836) {
               int var12 = var11 % this.field_22837;
               int var13 = var11 / this.field_22837;
               if (var10 >= var5 || var10 <= var6) {
                  this.field_22834.method_8424(var12, var13).method_36894(var1 + (float)(var10 * this.field_22833), var2, var4);
               }
            }
         }
      } catch (UnsupportedEncodingException var14) {
         class_2598.method_11785(var14);
      }
   }

   @Override
   public int method_18548(String var1) {
      return this.field_22831;
   }

   @Override
   public int method_18547(String var1) {
      return this.field_22833 * var1.length();
   }

   @Override
   public int method_18543() {
      return this.field_22831;
   }
}
