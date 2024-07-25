package remapped;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;

public class class_8907 {
   private String field_45673;
   private final Reader field_45667;
   private int[] field_45665;
   private int field_45671;
   private int field_45664 = 0;
   private boolean field_45669;
   private int field_45674 = 0;
   private int field_45668 = 0;
   private int field_45666 = 0;
   private char[] field_45670;
   private static final int field_45672 = 1025;

   public class_8907(String var1) {
      this(new StringReader(var1));
      this.field_45673 = "'string'";
   }

   public class_8907(Reader var1) {
      this.field_45673 = "'reader'";
      this.field_45665 = new int[0];
      this.field_45671 = 0;
      this.field_45667 = var1;
      this.field_45669 = false;
      this.field_45670 = new char[1025];
   }

   public static boolean method_40979(String var0) {
      int var3 = var0.length();
      int var4 = 0;

      while (var4 < var3) {
         int var5 = var0.codePointAt(var4);
         if (!method_40978(var5)) {
            return false;
         }

         var4 += Character.charCount(var5);
      }

      return true;
   }

   public static boolean method_40978(int var0) {
      return var0 >= 32 && var0 <= 126
         || var0 == 9
         || var0 == 10
         || var0 == 13
         || var0 == 133
         || var0 >= 160 && var0 <= 55295
         || var0 >= 57344 && var0 <= 65533
         || var0 >= 65536 && var0 <= 1114111;
   }

   public class_404 method_40969() {
      return new class_404(this.field_45673, this.field_45674, this.field_45668, this.field_45666, this.field_45665, this.field_45664);
   }

   public void method_40970() {
      this.method_40971(1);
   }

   public void method_40971(int var1) {
      for (int var4 = 0; var4 < var1 && this.method_40980(); var4++) {
         int var5 = this.field_45665[this.field_45664++];
         this.field_45674++;
         if (!class_6121.field_31291.method_28112(var5) && (var5 != 13 || !this.method_40980() || this.field_45665[this.field_45664] == 10)) {
            if (var5 != 65279) {
               this.field_45666++;
            }
         } else {
            this.field_45668++;
            this.field_45666 = 0;
         }
      }
   }

   public int method_40982() {
      return !this.method_40980() ? 0 : this.field_45665[this.field_45664];
   }

   public int method_40983(int var1) {
      return !this.method_40981(var1) ? 0 : this.field_45665[this.field_45664 + var1];
   }

   public String method_40977(int var1) {
      if (var1 != 0) {
         return !this.method_40981(var1)
            ? new String(this.field_45665, this.field_45664, Math.min(var1, this.field_45671 - this.field_45664))
            : new String(this.field_45665, this.field_45664, var1);
      } else {
         return "";
      }
   }

   public String method_40974(int var1) {
      String var4 = this.method_40977(var1);
      this.field_45664 += var1;
      this.field_45674 += var1;
      this.field_45666 += var1;
      return var4;
   }

   private boolean method_40980() {
      return this.method_40981(0);
   }

   private boolean method_40981(int var1) {
      if (!this.field_45669 && this.field_45664 + var1 >= this.field_45671) {
         this.method_40976();
      }

      return this.field_45664 + var1 < this.field_45671;
   }

   private void method_40976() {
      try {
         int var3 = this.field_45667.read(this.field_45670, 0, 1024);
         if (var3 > 0) {
            int var4 = this.field_45671 - this.field_45664;
            this.field_45665 = Arrays.copyOfRange(this.field_45665, this.field_45664, this.field_45671 + var3);
            if (Character.isHighSurrogate(this.field_45670[var3 - 1])) {
               if (this.field_45667.read(this.field_45670, var3, 1) == -1) {
                  this.field_45669 = true;
               } else {
                  var3++;
               }
            }

            int var5 = 32;

            for (int var6 = 0; var6 < var3; var4++) {
               int var7 = Character.codePointAt(this.field_45670, var6);
               this.field_45665[var4] = var7;
               if (method_40978(var7)) {
                  var6 += Character.charCount(var7);
               } else {
                  var5 = var7;
                  var6 = var3;
               }
            }

            this.field_45671 = var4;
            this.field_45664 = 0;
            if (var5 != 32) {
               throw new class_7540(this.field_45673, var4 - 1, var5, "special characters are not allowed");
            }
         } else {
            this.field_45669 = true;
         }
      } catch (IOException var8) {
         throw new class_5251(var8);
      }
   }

   public int method_40972() {
      return this.field_45666;
   }

   public int method_40973() {
      return this.field_45674;
   }

   public int method_40975() {
      return this.field_45668;
   }
}
