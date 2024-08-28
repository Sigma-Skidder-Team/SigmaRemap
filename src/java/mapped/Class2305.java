package mapped;

import java.util.Locale;

public enum Class2305 {
   field15739,
   field15740,
   field15741,
   field15742;

   private static final Class2305[] field15743 = values();
   private static final Class2305[] field15744 = new Class2305[]{field15739, field15740, field15741, field15742};

   private static Class2305 method9073(String var0) {
      for (Class2305 var6 : field15743) {
         if (var0.equalsIgnoreCase(var6.name())) {
            return var6;
         }
      }

      return field15739;
   }

   public String method9074() {
      return this.name().toLowerCase(Locale.ROOT);
   }

   // $VF: synthetic method
   public static Class2305 method9075(String var0) {
      return method9073(var0);
   }
}
