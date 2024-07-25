package remapped;

public class class_7254 extends class_2259 {
   public static final String field_37166 = "-_.*";
   public static final String field_37165 = "-_.!~*'()@:$&,;=";
   public static final String field_37172 = "-_.!~*'()@:$,;/?:";
   private static final char[] field_37167 = new char[]{'+'};
   private static final char[] field_37170 = "0123456789ABCDEF".toCharArray();
   private final boolean field_37168;
   private final boolean[] field_37169;

   public class_7254(String var1, boolean var2) {
      if (!var1.matches(".*[0-9A-Za-z].*")) {
         if (var2 && var1.contains(" ")) {
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
         } else if (!var1.contains("%")) {
            this.field_37168 = var2;
            this.field_37169 = method_33155(var1);
         } else {
            throw new IllegalArgumentException("The '%' character cannot be specified as 'safe'");
         }
      } else {
         throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
      }
   }

   private static boolean[] method_33155(String var0) {
      int var3 = 122;
      char[] var4 = var0.toCharArray();

      for (char var8 : var4) {
         var3 = Math.max(var8, var3);
      }

      boolean[] var10 = new boolean[var3 + 1];

      for (int var11 = 48; var11 <= 57; var11++) {
         var10[var11] = true;
      }

      for (int var12 = 65; var12 <= 90; var12++) {
         var10[var12] = true;
      }

      for (int var13 = 97; var13 <= 122; var13++) {
         var10[var13] = true;
      }

      for (char var9 : var4) {
         var10[var9] = true;
      }

      return var10;
   }

   @Override
   public int method_10376(CharSequence var1, int var2, int var3) {
      while (var2 < var3) {
         char var6 = var1.charAt(var2);
         if (var6 < this.field_37169.length && this.field_37169[var6]) {
            var2++;
            continue;
         }
         break;
      }

      return var2;
   }

   @Override
   public String method_24434(String var1) {
      int var4 = var1.length();

      for (int var5 = 0; var5 < var4; var5++) {
         char var6 = var1.charAt(var5);
         if (var6 >= this.field_37169.length || !this.field_37169[var6]) {
            return this.method_10375(var1, var5);
         }
      }

      return var1;
   }

   @Override
   public char[] method_10379(int var1) {
      if (var1 < this.field_37169.length && this.field_37169[var1]) {
         return null;
      } else if (var1 == 32 && this.field_37168) {
         return field_37167;
      } else if (var1 > 127) {
         if (var1 > 2047) {
            if (var1 > 65535) {
               if (var1 > 1114111) {
                  throw new IllegalArgumentException("Invalid unicode character value " + var1);
               } else {
                  char[] var20 = new char[12];
                  var20[0] = '%';
                  var20[1] = 'F';
                  var20[3] = '%';
                  var20[6] = '%';
                  var20[9] = '%';
                  var20[11] = field_37170[var1 & 15];
                  var1 >>>= 4;
                  var20[10] = field_37170[8 | var1 & 3];
                  var1 >>>= 2;
                  var20[8] = field_37170[var1 & 15];
                  var1 >>>= 4;
                  var20[7] = field_37170[8 | var1 & 3];
                  var1 >>>= 2;
                  var20[5] = field_37170[var1 & 15];
                  var1 >>>= 4;
                  var20[4] = field_37170[8 | var1 & 3];
                  var1 >>>= 2;
                  var20[2] = field_37170[var1 & 7];
                  return var20;
               }
            } else {
               char[] var19 = new char[9];
               var19[0] = '%';
               var19[1] = 'E';
               var19[3] = '%';
               var19[6] = '%';
               var19[8] = field_37170[var1 & 15];
               var1 >>>= 4;
               var19[7] = field_37170[8 | var1 & 3];
               var1 >>>= 2;
               var19[5] = field_37170[var1 & 15];
               var1 >>>= 4;
               var19[4] = field_37170[8 | var1 & 3];
               var1 >>>= 2;
               var19[2] = field_37170[var1];
               return var19;
            }
         } else {
            char[] var18 = new char[]{'%', '\u0000', '\u0000', '%', '\u0000', field_37170[var1 & 15]};
            var1 >>>= 4;
            var18[4] = field_37170[8 | var1 & 3];
            var1 >>>= 2;
            var18[2] = field_37170[var1 & 15];
            var1 >>>= 4;
            var18[1] = field_37170[12 | var1];
            return var18;
         }
      } else {
         char[] var4 = new char[]{'%', '\u0000', field_37170[var1 & 15]};
         var4[1] = field_37170[var1 >>> 4];
         return var4;
      }
   }
}
