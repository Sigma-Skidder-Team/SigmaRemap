package remapped;

public abstract class class_2259 implements class_5352 {
   private static final int field_11241 = 32;
   private static final ThreadLocal<char[]> field_11242 = new class_8649();

   public abstract char[] method_10379(int var1);

   public int method_10376(CharSequence var1, int var2, int var3) {
      int var6 = var2;

      while (var6 < var3) {
         int var7 = method_10378(var1, var6, var3);
         if (var7 < 0 || this.method_10379(var7) != null) {
            break;
         }

         var6 += !Character.isSupplementaryCodePoint(var7) ? 1 : 2;
      }

      return var6;
   }

   @Override
   public String method_24434(String var1) {
      int var4 = var1.length();
      int var5 = this.method_10376(var1, 0, var4);
      return var5 != var4 ? this.method_10375(var1, var5) : var1;
   }

   public final String method_10375(String var1, int var2) {
      int var5 = var1.length();
      char[] var6 = field_11242.get();
      int var7 = 0;
      int var8 = 0;

      while (var2 < var5) {
         int var9 = method_10378(var1, var2, var5);
         if (var9 < 0) {
            throw new IllegalArgumentException("Trailing high surrogate at end of input");
         }

         char[] var10 = this.method_10379(var9);
         if (var10 != null) {
            int var11 = var2 - var8;
            int var12 = var7 + var11 + var10.length;
            if (var6.length < var12) {
               int var13 = var12 + (var5 - var2) + 32;
               var6 = method_10374(var6, var7, var13);
            }

            if (var11 > 0) {
               var1.getChars(var8, var2, var6, var7);
               var7 += var11;
            }

            if (var10.length > 0) {
               System.arraycopy(var10, 0, var6, var7, var10.length);
               var7 += var10.length;
            }
         }

         var8 = var2 + (!Character.isSupplementaryCodePoint(var9) ? 1 : 2);
         var2 = this.method_10376(var1, var8, var5);
      }

      int var14 = var5 - var8;
      if (var14 > 0) {
         int var15 = var7 + var14;
         if (var6.length < var15) {
            var6 = method_10374(var6, var7, var15);
         }

         var1.getChars(var8, var5, var6, var7);
         var7 = var15;
      }

      return new String(var6, 0, var7);
   }

   @Override
   public Appendable method_24433(Appendable var1) {
      assert var1 != null;

      return new class_7859(this, var1);
   }

   public static final int method_10378(CharSequence var0, int var1, int var2) {
      if (var1 >= var2) {
         throw new IndexOutOfBoundsException("Index exceeds specified range");
      } else {
         char var5 = var0.charAt(var1++);
         if (var5 < '\ud800' || var5 > '\udfff') {
            return var5;
         } else if (var5 > '\udbff') {
            throw new IllegalArgumentException("Unexpected low surrogate character '" + var5 + "' with value " + var5 + " at index " + (var1 - 1));
         } else if (var1 != var2) {
            char var6 = var0.charAt(var1);
            if (!Character.isLowSurrogate(var6)) {
               throw new IllegalArgumentException("Expected low surrogate but got char '" + var6 + "' with value " + var6 + " at index " + var1);
            } else {
               return Character.toCodePoint(var5, var6);
            }
         } else {
            return -var5;
         }
      }
   }

   private static final char[] method_10374(char[] var0, int var1, int var2) {
      char[] var5 = new char[var2];
      if (var1 > 0) {
         System.arraycopy(var0, 0, var5, 0, var1);
      }

      return var5;
   }
}
