package remapped;

import java.util.Locale;

public enum class_5616 {
   field_28520,
   field_28521,
   field_28519,
   field_28518;

   public static class_5616 method_25478(long var0) {
      if (var0 < 1024L) {
         return field_28520;
      } else {
         try {
            int var4 = (int)(Math.log((double)var0) / Math.log(1024.0));
            String var5 = String.valueOf("KMGTPE".charAt(var4 - 1));
            return valueOf(var5 + "B");
         } catch (Exception var6) {
            return field_28518;
         }
      }
   }

   public static double method_25481(long var0, class_5616 var2) {
      return var2 != field_28520 ? (double)var0 / Math.pow(1024.0, (double)var2.ordinal()) : (double)var0;
   }

   public static String method_25482(long var0) {
      short var4 = 1024;
      if (var0 >= 1024L) {
         int var5 = (int)(Math.log((double)var0) / Math.log(1024.0));
         String var6 = "KMGTPE".charAt(var5 - 1) + "";
         return String.format(Locale.ROOT, "%.1f %sB", (double)var0 / Math.pow(1024.0, (double)var5), var6);
      } else {
         return var0 + " B";
      }
   }

   public static String method_25479(long var0, class_5616 var2) {
      return String.format("%." + (var2 != field_28518 ? "0" : "1") + "f %s", method_25481(var0, var2), var2.name());
   }
}
