package mapped;

public final class Class8537 {
   private Class8537() {
   }

   public static long method30381(String var0) {
      return method30382(var0, 0, var0.length());
   }

   public static long method30382(String var0, int var1, int var2) {
      if (var0 == null) {
         throw new IllegalArgumentException("string == null");
      } else if (var1 < 0) {
         throw new IllegalArgumentException("beginIndex < 0: " + var1);
      } else if (var2 < var1) {
         throw new IllegalArgumentException("endIndex < beginIndex: " + var2 + " < " + var1);
      } else if (var2 > var0.length()) {
         throw new IllegalArgumentException("endIndex > string.length: " + var2 + " > " + var0.length());
      } else {
         long var5 = 0L;
         int var7 = var1;

         while (var7 < var2) {
            char var8 = var0.charAt(var7);
            if (var8 >= 128) {
               if (var8 >= 2048) {
                  if (var8 >= '\ud800' && var8 <= '\udfff') {
                     char var9 = var7 + 1 >= var2 ? 0 : var0.charAt(var7 + 1);
                     if (var8 <= '\udbff' && var9 >= '\udc00' && var9 <= '\udfff') {
                        var5 += 4L;
                        var7 += 2;
                     } else {
                        var5++;
                        var7++;
                     }
                  } else {
                     var5 += 3L;
                     var7++;
                  }
               } else {
                  var5 += 2L;
                  var7++;
               }
            } else {
               var5++;
               var7++;
            }
         }

         return var5;
      }
   }
}
