package mapped;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class Class9593 {
   private Class9593() {
   }

   public static String method37242(String var0) {
      try {
         return URLEncoder.encode(var0, "UTF-8")
            .replace("+", "%20")
            .replace("%21", "!")
            .replace("%27", "'")
            .replace("%28", "(")
            .replace("%29", ")")
            .replace("%7E", "~");
      } catch (UnsupportedEncodingException var4) {
         throw new RuntimeException(var4);
      }
   }

   public static String method37243(String var0) {
      try {
         return URLDecoder.decode(var0, "UTF-8");
      } catch (UnsupportedEncodingException var4) {
         throw new RuntimeException(var4);
      }
   }
}
