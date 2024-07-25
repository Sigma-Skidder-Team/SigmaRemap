package remapped;

import java.nio.charset.Charset;

public final class class_6283 {
   private class_6283() {
   }

   public static String method_28640(String var0, String var1) {
      return method_28641(var0, var1, Charset.forName("ISO-8859-1"));
   }

   public static String method_28641(String var0, String var1, Charset var2) {
      String var5 = var0 + ":" + var1;
      byte[] var6 = var5.getBytes(var2);
      String var7 = class_9091.method_41910(var6).method_41880();
      return "Basic " + var7;
   }
}
