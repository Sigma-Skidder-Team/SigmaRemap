package remapped;

import java.io.InputStream;
import java.net.URL;

public class class_3008 implements class_5550 {
   private static String[] field_14762;

   public URL 欫塱쿨㻣郝姮(String var1) {
      String var4 = var1.replace('\\', '/');
      return class_8975.class.getClassLoader().getResource(var4);
   }

   public InputStream 醧瀳㮃睬綋콵(String var1) {
      String var4 = var1.replace('\\', '/');
      return class_8975.class.getClassLoader().getResourceAsStream(var4);
   }
}
