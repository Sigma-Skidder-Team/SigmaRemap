package mapped;

import java.util.Locale;

public enum Class2072 {
   field13498,
   field13499,
   field13500,
   field13501;

   private static final Class2072[] field13502 = new Class2072[]{field13498, field13499, field13500, field13501};

   public static Class2072 method8727(long var0) {
      if (var0 < 1024L) {
         return field13498;
      } else {
         try {
            int var4 = (int)(Math.log((double)var0) / Math.log(1024.0));
            String var5 = String.valueOf("KMGTPE".charAt(var4 - 1));
            return valueOf(var5 + "B");
         } catch (Exception var6) {
            return field13501;
         }
      }
   }

   public static double method8728(long var0, Class2072 var2) {
      return var2 != field13498 ? (double)var0 / Math.pow(1024.0, (double)var2.ordinal()) : (double)var0;
   }

   public static String method8729(long var0) {
      if (var0 >= 1024L) {
         int var5 = (int)(Math.log((double)var0) / Math.log(1024.0));
         String var6 = "KMGTPE".charAt(var5 - 1) + "";
         return String.format(Locale.ROOT, "%.1f %sB", (double)var0 / Math.pow(1024.0, (double)var5), var6);
      } else {
         return var0 + " B";
      }
   }

   public static String method8730(long var0, Class2072 var2) {
      return String.format("%." + (var2 != field13501 ? "0" : "1") + "f %s", method8728(var0, var2), var2.name());
   }
}
