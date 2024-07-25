package remapped;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum class_5010 {
   field_25918(field_25913[0]),
   field_25912(field_25913[1]),
   field_25917(field_25913[2]),
   field_25916(field_25913[3]),
   field_25914(field_25913[4]);

   public final String field_25911;

   private class_5010(String var3) {
      this.field_25911 = var3;
   }

   public static class_5010 method_23055(String var0) {
      switch (var0) {
         case "TLSv1.3":
            return field_25918;
         case "TLSv1.2":
            return field_25912;
         case "TLSv1.1":
            return field_25917;
         case "TLSv1":
            return field_25916;
         case "SSLv3":
            return field_25914;
         default:
            throw new IllegalArgumentException("Unexpected TLS version: " + var0);
      }
   }

   public static List<class_5010> method_23058(String... var0) {
      ArrayList var3 = new ArrayList(var0.length);

      for (String var7 : var0) {
         var3.add(method_23055(var7));
      }

      return Collections.<class_5010>unmodifiableList(var3);
   }

   public String method_23056() {
      return this.field_25911;
   }
}
