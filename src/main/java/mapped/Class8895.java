package mapped;

import java.nio.charset.Charset;

public final class Class8895 {
   private Class8895() {
   }

   public static String method32380(String var0, String var1) {
      return method32381(var0, var1, Charset.forName("ISO-8859-1"));
   }

   public static String method32381(String var0, String var1, Charset var2) {
      String var5 = var0 + ":" + var1;
      byte[] var6 = var5.getBytes(var2);
      String var7 = Class2003.method8430(var6).method8437();
      return "Basic " + var7;
   }
}
