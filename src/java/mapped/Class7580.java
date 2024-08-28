package mapped;

public class Class7580 extends Class7579 {
   public static final String field32545 = "-_.*";
   public static final String field32546 = "-_.!~*'()@:$&,;=";
   public static final String field32547 = "-_.!~*'()@:$,;/?:";
   private static final char[] field32548 = new char[]{'+'};
   private static final char[] field32549 = "0123456789ABCDEF".toCharArray();
   private final boolean field32550;
   private final boolean[] field32551;

   public Class7580(String var1, boolean var2) {
      if (!var1.matches(".*[0-9A-Za-z].*")) {
         if (var2 && var1.contains(" ")) {
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
         } else if (!var1.contains("%")) {
            this.field32550 = var2;
            this.field32551 = method24813(var1);
         } else {
            throw new IllegalArgumentException("The '%' character cannot be specified as 'safe'");
         }
      } else {
         throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
      }
   }

   private static boolean[] method24813(String var0) {
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
   public int method24807(CharSequence var1, int var2, int var3) {
      while (var2 < var3) {
         char var6 = var1.charAt(var2);
         if (var6 < this.field32551.length && this.field32551[var6]) {
            var2++;
            continue;
         }
         break;
      }

      return var2;
   }

   @Override
   public String method24808(String var1) {
      int var4 = var1.length();

      for (int var5 = 0; var5 < var4; var5++) {
         char var6 = var1.charAt(var5);
         if (var6 >= this.field32551.length || !this.field32551[var6]) {
            return this.method24809(var1, var5);
         }
      }

      return var1;
   }

   @Override
   public char[] method24806(int var1) {
      if (var1 < this.field32551.length && this.field32551[var1]) {
         return null;
      } else if (var1 == 32 && this.field32550) {
         return field32548;
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
                  var20[11] = field32549[var1 & 15];
                  var1 >>>= 4;
                  var20[10] = field32549[8 | var1 & 3];
                  var1 >>>= 2;
                  var20[8] = field32549[var1 & 15];
                  var1 >>>= 4;
                  var20[7] = field32549[8 | var1 & 3];
                  var1 >>>= 2;
                  var20[5] = field32549[var1 & 15];
                  var1 >>>= 4;
                  var20[4] = field32549[8 | var1 & 3];
                  var1 >>>= 2;
                  var20[2] = field32549[var1 & 7];
                  return var20;
               }
            } else {
               char[] var19 = new char[9];
               var19[0] = '%';
               var19[1] = 'E';
               var19[3] = '%';
               var19[6] = '%';
               var19[8] = field32549[var1 & 15];
               var1 >>>= 4;
               var19[7] = field32549[8 | var1 & 3];
               var1 >>>= 2;
               var19[5] = field32549[var1 & 15];
               var1 >>>= 4;
               var19[4] = field32549[8 | var1 & 3];
               var1 >>>= 2;
               var19[2] = field32549[var1];
               return var19;
            }
         } else {
            char[] var18 = new char[]{'%', '\u0000', '\u0000', '%', '\u0000', field32549[var1 & 15]};
            var1 >>>= 4;
            var18[4] = field32549[8 | var1 & 3];
            var1 >>>= 2;
            var18[2] = field32549[var1 & 15];
            var1 >>>= 4;
            var18[1] = field32549[12 | var1];
            return var18;
         }
      } else {
         char[] var4 = new char[]{'%', '\u0000', field32549[var1 & 15]};
         var4[1] = field32549[var1 >>> 4];
         return var4;
      }
   }
}
