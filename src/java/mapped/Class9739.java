package mapped;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public final class Class9739 {
   private static final int field45476 = 15;
   private static final int field45477 = 31;
   private static final int field45478 = 63;
   private static final int field45479 = 127;
   public static final Header[] field45480 = new Header[]{
      new Header(Header.field35885, ""),
      new Header(Header.field35882, "GET"),
      new Header(Header.field35882, "POST"),
      new Header(Header.field35883, "/"),
      new Header(Header.field35883, "/index.html"),
      new Header(Header.field35884, "http"),
      new Header(Header.field35884, "https"),
      new Header(Header.field35881, "200"),
      new Header(Header.field35881, "204"),
      new Header(Header.field35881, "206"),
      new Header(Header.field35881, "304"),
      new Header(Header.field35881, "400"),
      new Header(Header.field35881, "404"),
      new Header(Header.field35881, "500"),
      new Header("accept-charset", ""),
      new Header("accept-encoding", "gzip, deflate"),
      new Header("accept-language", ""),
      new Header("accept-ranges", ""),
      new Header("accept", ""),
      new Header("access-control-allow-origin", ""),
      new Header("age", ""),
      new Header("allow", ""),
      new Header("authorization", ""),
      new Header("cache-control", ""),
      new Header("content-disposition", ""),
      new Header("content-encoding", ""),
      new Header("content-language", ""),
      new Header("content-length", ""),
      new Header("content-location", ""),
      new Header("content-range", ""),
      new Header("content-type", ""),
      new Header("cookie", ""),
      new Header("date", ""),
      new Header("etag", ""),
      new Header("expect", ""),
      new Header("expires", ""),
      new Header("from", ""),
      new Header("host", ""),
      new Header("if-match", ""),
      new Header("if-modified-since", ""),
      new Header("if-none-match", ""),
      new Header("if-range", ""),
      new Header("if-unmodified-since", ""),
      new Header("last-modified", ""),
      new Header("link", ""),
      new Header("location", ""),
      new Header("max-forwards", ""),
      new Header("proxy-authenticate", ""),
      new Header("proxy-authorization", ""),
      new Header("range", ""),
      new Header("referer", ""),
      new Header("refresh", ""),
      new Header("retry-after", ""),
      new Header("server", ""),
      new Header("set-cookie", ""),
      new Header("strict-transport-security", ""),
      new Header("transfer-encoding", ""),
      new Header("user-agent", ""),
      new Header("vary", ""),
      new Header("via", ""),
      new Header("www-authenticate", "")
   };
   public static final Map<Class2003, Integer> field45481 = method38169();

   private Class9739() {
   }

   private static Map<Class2003, Integer> method38169() {
      LinkedHashMap var2 = new LinkedHashMap(field45480.length);

      for (int var3 = 0; var3 < field45480.length; var3++) {
         if (!var2.containsKey(field45480[var3].field35886)) {
            var2.put(field45480[var3].field35886, var3);
         }
      }

      return Collections.<Class2003, Integer>unmodifiableMap(var2);
   }

   public static Class2003 method38170(Class2003 var0) throws IOException {
      int var3 = 0;

      for (int var4 = var0.method8458(); var3 < var4; var3++) {
         byte var5 = var0.method8457(var3);
         if (var5 >= 65 && var5 <= 90) {
            throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + var0.method8435());
         }
      }

      return var0;
   }
}
