package remapped;

import java.net.Proxy.Type;

public final class class_5947 {
   private class_5947() {
   }

   public static String method_27187(class_3918 var0, Type var1) {
      StringBuilder var4 = new StringBuilder();
      var4.append(var0.method_18137());
      var4.append(' ');
      if (!method_27186(var0, var1)) {
         var4.append(method_27188(var0.method_18136()));
      } else {
         var4.append(var0.method_18136());
      }

      var4.append(" HTTP/1.1");
      return var4.toString();
   }

   private static boolean method_27186(class_3918 var0, Type var1) {
      return !var0.method_18142() && var1 == Type.HTTP;
   }

   public static String method_27188(class_1672 var0) {
      String var3 = var0.method_7481();
      String var4 = var0.method_7487();
      return var4 == null ? var3 : var3 + '?' + var4;
   }
}
