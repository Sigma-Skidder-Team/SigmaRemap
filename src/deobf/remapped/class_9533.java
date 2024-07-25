package remapped;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public final class class_9533 {
   private static final int field_48517 = 15;
   private static final int field_48515 = 31;
   private static final int field_48516 = 63;
   private static final int field_48514 = 127;
   public static final class_4331[] field_48519 = new class_4331[]{
      new class_4331(class_4331.field_21068, ""),
      new class_4331(class_4331.field_21060, "GET"),
      new class_4331(class_4331.field_21060, "POST"),
      new class_4331(class_4331.field_21061, "/"),
      new class_4331(class_4331.field_21061, "/index.html"),
      new class_4331(class_4331.field_21069, "http"),
      new class_4331(class_4331.field_21069, "https"),
      new class_4331(class_4331.field_21064, "200"),
      new class_4331(class_4331.field_21064, "204"),
      new class_4331(class_4331.field_21064, "206"),
      new class_4331(class_4331.field_21064, "304"),
      new class_4331(class_4331.field_21064, "400"),
      new class_4331(class_4331.field_21064, "404"),
      new class_4331(class_4331.field_21064, "500"),
      new class_4331("accept-charset", ""),
      new class_4331("accept-encoding", "gzip, deflate"),
      new class_4331("accept-language", ""),
      new class_4331("accept-ranges", ""),
      new class_4331("accept", ""),
      new class_4331("access-control-allow-origin", ""),
      new class_4331("age", ""),
      new class_4331("allow", ""),
      new class_4331("authorization", ""),
      new class_4331("cache-control", ""),
      new class_4331("content-disposition", ""),
      new class_4331("content-encoding", ""),
      new class_4331("content-language", ""),
      new class_4331("content-length", ""),
      new class_4331("content-location", ""),
      new class_4331("content-range", ""),
      new class_4331("content-type", ""),
      new class_4331("cookie", ""),
      new class_4331("date", ""),
      new class_4331("etag", ""),
      new class_4331("expect", ""),
      new class_4331("expires", ""),
      new class_4331("from", ""),
      new class_4331("host", ""),
      new class_4331("if-match", ""),
      new class_4331("if-modified-since", ""),
      new class_4331("if-none-match", ""),
      new class_4331("if-range", ""),
      new class_4331("if-unmodified-since", ""),
      new class_4331("last-modified", ""),
      new class_4331("link", ""),
      new class_4331("location", ""),
      new class_4331("max-forwards", ""),
      new class_4331("proxy-authenticate", ""),
      new class_4331("proxy-authorization", ""),
      new class_4331("range", ""),
      new class_4331("referer", ""),
      new class_4331("refresh", ""),
      new class_4331("retry-after", ""),
      new class_4331("server", ""),
      new class_4331("set-cookie", ""),
      new class_4331("strict-transport-security", ""),
      new class_4331("transfer-encoding", ""),
      new class_4331("user-agent", ""),
      new class_4331("vary", ""),
      new class_4331("via", ""),
      new class_4331("www-authenticate", "")
   };
   public static final Map<class_9091, Integer> field_48518 = method_43970();

   private class_9533() {
   }

   private static Map<class_9091, Integer> method_43970() {
      LinkedHashMap var2 = new LinkedHashMap(field_48519.length);

      for (int var3 = 0; var3 < field_48519.length; var3++) {
         if (!var2.containsKey(field_48519[var3].field_21066)) {
            var2.put(field_48519[var3].field_21066, var3);
         }
      }

      return Collections.<class_9091, Integer>unmodifiableMap(var2);
   }

   public static class_9091 method_43972(class_9091 var0) throws IOException {
      int var3 = 0;

      for (int var4 = var0.method_41902(); var3 < var4; var3++) {
         byte var5 = var0.method_41879(var3);
         if (var5 >= 65 && var5 <= 90) {
            throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + var0.method_41869());
         }
      }

      return var0;
   }
}
