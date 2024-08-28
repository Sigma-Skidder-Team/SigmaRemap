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
   public static final Class8350[] field45480 = new Class8350[]{
      new Class8350(Class8350.field35885, ""),
      new Class8350(Class8350.field35882, "GET"),
      new Class8350(Class8350.field35882, "POST"),
      new Class8350(Class8350.field35883, "/"),
      new Class8350(Class8350.field35883, "/index.html"),
      new Class8350(Class8350.field35884, "http"),
      new Class8350(Class8350.field35884, "https"),
      new Class8350(Class8350.field35881, "200"),
      new Class8350(Class8350.field35881, "204"),
      new Class8350(Class8350.field35881, "206"),
      new Class8350(Class8350.field35881, "304"),
      new Class8350(Class8350.field35881, "400"),
      new Class8350(Class8350.field35881, "404"),
      new Class8350(Class8350.field35881, "500"),
      new Class8350("accept-charset", ""),
      new Class8350("accept-encoding", "gzip, deflate"),
      new Class8350("accept-language", ""),
      new Class8350("accept-ranges", ""),
      new Class8350("accept", ""),
      new Class8350("access-control-allow-origin", ""),
      new Class8350("age", ""),
      new Class8350("allow", ""),
      new Class8350("authorization", ""),
      new Class8350("cache-control", ""),
      new Class8350("content-disposition", ""),
      new Class8350("content-encoding", ""),
      new Class8350("content-language", ""),
      new Class8350("content-length", ""),
      new Class8350("content-location", ""),
      new Class8350("content-range", ""),
      new Class8350("content-type", ""),
      new Class8350("cookie", ""),
      new Class8350("date", ""),
      new Class8350("etag", ""),
      new Class8350("expect", ""),
      new Class8350("expires", ""),
      new Class8350("from", ""),
      new Class8350("host", ""),
      new Class8350("if-match", ""),
      new Class8350("if-modified-since", ""),
      new Class8350("if-none-match", ""),
      new Class8350("if-range", ""),
      new Class8350("if-unmodified-since", ""),
      new Class8350("last-modified", ""),
      new Class8350("link", ""),
      new Class8350("location", ""),
      new Class8350("max-forwards", ""),
      new Class8350("proxy-authenticate", ""),
      new Class8350("proxy-authorization", ""),
      new Class8350("range", ""),
      new Class8350("referer", ""),
      new Class8350("refresh", ""),
      new Class8350("retry-after", ""),
      new Class8350("server", ""),
      new Class8350("set-cookie", ""),
      new Class8350("strict-transport-security", ""),
      new Class8350("transfer-encoding", ""),
      new Class8350("user-agent", ""),
      new Class8350("vary", ""),
      new Class8350("via", ""),
      new Class8350("www-authenticate", "")
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
