package remapped;

import java.io.IOException;

public class class_7859 implements Appendable {
   public int field_39836;
   public char[] field_39835;

   public class_7859(class_2259 var1, Appendable var2) {
      this.field_39833 = var1;
      this.field_39834 = var2;
      this.field_39836 = -1;
      this.field_39835 = new char[2];
   }

   @Override
   public Appendable append(CharSequence var1) throws IOException {
      return this.append(var1, 0, var1.length());
   }

   @Override
   public Appendable append(CharSequence var1, int var2, int var3) throws IOException {
      int var6 = var2;
      if (var2 < var3) {
         int var7 = var2;
         if (this.field_39836 != -1) {
            var6 = var2 + 1;
            char var8 = var1.charAt(var2);
            if (!Character.isLowSurrogate(var8)) {
               throw new IllegalArgumentException("Expected low surrogate character but got " + var8);
            }

            char[] var9 = this.field_39833.method_10379(Character.toCodePoint((char)this.field_39836, var8));
            if (var9 == null) {
               this.field_39834.append((char)this.field_39836);
            } else {
               this.method_35544(var9, var9.length);
               var7 = var2 + 1;
            }

            this.field_39836 = -1;
         }

         while (true) {
            var6 = this.field_39833.method_10376(var1, var6, var3);
            if (var6 > var7) {
               this.field_39834.append(var1, var7, var6);
            }

            if (var6 == var3) {
               break;
            }

            int var12 = class_2259.method_10378(var1, var6, var3);
            if (var12 < 0) {
               this.field_39836 = -var12;
               break;
            }

            char[] var13 = this.field_39833.method_10379(var12);
            if (var13 == null) {
               int var10 = Character.toChars(var12, this.field_39835, 0);
               this.method_35544(this.field_39835, var10);
            } else {
               this.method_35544(var13, var13.length);
            }

            var6 += !Character.isSupplementaryCodePoint(var12) ? 1 : 2;
            var7 = var6;
         }
      }

      return this;
   }

   @Override
   public Appendable append(char var1) throws IOException {
      if (this.field_39836 == -1) {
         if (!Character.isHighSurrogate(var1)) {
            if (Character.isLowSurrogate(var1)) {
               throw new IllegalArgumentException("Unexpected low surrogate character '" + var1 + "' with value " + var1);
            }

            char[] var4 = this.field_39833.method_10379(var1);
            if (var4 == null) {
               this.field_39834.append(var1);
            } else {
               this.method_35544(var4, var4.length);
            }
         } else {
            this.field_39836 = var1;
         }
      } else {
         if (!Character.isLowSurrogate(var1)) {
            throw new IllegalArgumentException("Expected low surrogate character but got '" + var1 + "' with value " + var1);
         }

         char[] var5 = this.field_39833.method_10379(Character.toCodePoint((char)this.field_39836, var1));
         if (var5 == null) {
            this.field_39834.append((char)this.field_39836);
            this.field_39834.append(var1);
         } else {
            this.method_35544(var5, var5.length);
         }

         this.field_39836 = -1;
      }

      return this;
   }

   private void method_35544(char[] var1, int var2) throws IOException {
      for (int var5 = 0; var5 < var2; var5++) {
         this.field_39834.append(var1[var5]);
      }
   }
}
