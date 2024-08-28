package mapped;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;

public class Class9583 {
   private String field44797;
   private final Reader field44798;
   private int[] field44799;
   private int field44800;
   private int field44801 = 0;
   private boolean field44802;
   private int field44803 = 0;
   private int field44804 = 0;
   private int field44805 = 0;
   private char[] field44806;
   private static final int field44807 = 1025;

   public Class9583(String var1) {
      this(new StringReader(var1));
      this.field44797 = "'string'";
   }

   public Class9583(Reader var1) {
      this.field44797 = "'reader'";
      this.field44799 = new int[0];
      this.field44800 = 0;
      this.field44798 = var1;
      this.field44802 = false;
      this.field44806 = new char[1025];
   }

   public static boolean method37197(String var0) {
      int var3 = var0.length();
      int var4 = 0;

      while (var4 < var3) {
         int var5 = var0.codePointAt(var4);
         if (!method37198(var5)) {
            return false;
         }

         var4 += Character.charCount(var5);
      }

      return true;
   }

   public static boolean method37198(int var0) {
      return var0 >= 32 && var0 <= 126
         || var0 == 9
         || var0 == 10
         || var0 == 13
         || var0 == 133
         || var0 >= 160 && var0 <= 55295
         || var0 >= 57344 && var0 <= 65533
         || var0 >= 65536 && var0 <= 1114111;
   }

   public Class2512 method37199() {
      return new Class2512(this.field44797, this.field44803, this.field44804, this.field44805, this.field44799, this.field44801);
   }

   public void method37200() {
      this.method37201(1);
   }

   public void method37201(int var1) {
      for (int var4 = 0; var4 < var1 && this.method37206(); var4++) {
         int var5 = this.field44799[this.field44801++];
         this.field44803++;
         if (!Class8852.field39999.method32204(var5) && (var5 != 13 || !this.method37206() || this.field44799[this.field44801] == 10)) {
            if (var5 != 65279) {
               this.field44805++;
            }
         } else {
            this.field44804++;
            this.field44805 = 0;
         }
      }
   }

   public int method37202() {
      return !this.method37206() ? 0 : this.field44799[this.field44801];
   }

   public int method37203(int var1) {
      return !this.method37207(var1) ? 0 : this.field44799[this.field44801 + var1];
   }

   public String method37204(int var1) {
      if (var1 != 0) {
         return !this.method37207(var1)
            ? new String(this.field44799, this.field44801, Math.min(var1, this.field44800 - this.field44801))
            : new String(this.field44799, this.field44801, var1);
      } else {
         return "";
      }
   }

   public String method37205(int var1) {
      String var4 = this.method37204(var1);
      this.field44801 += var1;
      this.field44803 += var1;
      this.field44805 += var1;
      return var4;
   }

   private boolean method37206() {
      return this.method37207(0);
   }

   private boolean method37207(int var1) {
      if (!this.field44802 && this.field44801 + var1 >= this.field44800) {
         this.method37208();
      }

      return this.field44801 + var1 < this.field44800;
   }

   private void method37208() {
      try {
         int var3 = this.field44798.read(this.field44806, 0, 1024);
         if (var3 > 0) {
            int var4 = this.field44800 - this.field44801;
            this.field44799 = Arrays.copyOfRange(this.field44799, this.field44801, this.field44800 + var3);
            if (Character.isHighSurrogate(this.field44806[var3 - 1])) {
               if (this.field44798.read(this.field44806, var3, 1) == -1) {
                  this.field44802 = true;
               } else {
                  var3++;
               }
            }

            int var5 = 32;

            for (int var6 = 0; var6 < var3; var4++) {
               int var7 = Character.codePointAt(this.field44806, var6);
               this.field44799[var4] = var7;
               if (method37198(var7)) {
                  var6 += Character.charCount(var7);
               } else {
                  var5 = var7;
                  var6 = var3;
               }
            }

            this.field44800 = var4;
            this.field44801 = 0;
            if (var5 != 32) {
               throw new Class2486(this.field44797, var4 - 1, var5, "special characters are not allowed");
            }
         } else {
            this.field44802 = true;
         }
      } catch (IOException var8) {
         throw new Class2478(var8);
      }
   }

   public int method37209() {
      return this.field44805;
   }

   public int method37210() {
      return this.field44803;
   }

   public int method37211() {
      return this.field44804;
   }
}
