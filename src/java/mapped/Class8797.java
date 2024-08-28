package mapped;

import java.net.Proxy.Type;

public final class Class8797 {
   private Class8797() {
   }

   public static String method31759(Class8223 var0, Type var1) {
      StringBuilder var4 = new StringBuilder();
      var4.append(var0.method28613());
      var4.append(' ');
      if (!method31760(var0, var1)) {
         var4.append(method31761(var0.method28612()));
      } else {
         var4.append(var0.method28612());
      }

      var4.append(" HTTP/1.1");
      return var4.toString();
   }

   private static boolean method31760(Class8223 var0, Type var1) {
      return !var0.method28621() && var1 == Type.HTTP;
   }

   public static String method31761(Class7284 var0) {
      String var3 = var0.method22946();
      String var4 = var0.method22950();
      return var4 == null ? var3 : var3 + '?' + var4;
   }
}
