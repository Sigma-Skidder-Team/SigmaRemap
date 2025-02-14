package mapped;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum Class2034 {
   field13205("TLSv1.3"),
   field13206("TLSv1.2"),
   field13207("TLSv1.1"),
   field13208("TLSv1"),
   field13209("SSLv3");

   public final String field13210;
   private static final Class2034[] field13211 = new Class2034[]{field13205, field13206, field13207, field13208, field13209};

   private Class2034(String var3) {
      this.field13210 = var3;
   }

   public static Class2034 method8676(String var0) {
      switch (var0) {
         case "TLSv1.3":
            return field13205;
         case "TLSv1.2":
            return field13206;
         case "TLSv1.1":
            return field13207;
         case "TLSv1":
            return field13208;
         case "SSLv3":
            return field13209;
         default:
            throw new IllegalArgumentException("Unexpected TLS version: " + var0);
      }
   }

   public static List<Class2034> method8677(String... var0) {
      ArrayList var3 = new ArrayList(var0.length);

      for (String var7 : var0) {
         var3.add(method8676(var7));
      }

      return Collections.<Class2034>unmodifiableList(var3);
   }

   public String method8678() {
      return this.field13210;
   }
}
