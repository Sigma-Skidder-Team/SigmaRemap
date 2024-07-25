package remapped;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class class_6508 {
   private static final Logger field_33104 = Logger.getLogger(class_6508.class.getName());
   private static final ConcurrentHashMap<String, class_1289> field_33107 = new ConcurrentHashMap<String, class_1289>();
   public static int field_33106 = 4;

   public static void method_29660(class_3323 var0) {
      class_1289.field_7104 = var0;
   }

   public static void method_29662(class_2839 var0) {
      class_1289.field_7082 = var0;
   }

   private class_6508() {
   }

   public static class_3484 method_29656(String var0) throws URISyntaxException {
      return method_29657(var0, null);
   }

   public static class_3484 method_29657(String var0, class_3470 var1) throws URISyntaxException {
      return method_29659(new URI(var0), var1);
   }

   public static class_3484 method_29658(URI var0) {
      return method_29659(var0, null);
   }

   public static class_3484 method_29659(URI var0, class_3470 var1) {
      if (var1 == null) {
         var1 = new class_3470();
      }

      URL var4 = class_824.method_3606(var0);

      URI var5;
      try {
         var5 = var4.toURI();
      } catch (URISyntaxException var12) {
         throw new RuntimeException(var12);
      }

      String var6 = class_824.method_3604(var4);
      String var7 = var4.getPath();
      boolean var8 = field_33107.containsKey(var6) && field_33107.get(var6).field_7101.containsKey(var7);
      boolean var9 = var1.field_16997 || !var1.field_16998 || var8;
      class_1289 var10;
      if (var9) {
         if (field_33104.isLoggable(Level.FINE)) {
            field_33104.fine(String.format("ignoring socket cache for %s", var5));
         }

         var10 = new class_1289(var5, var1);
      } else {
         if (!field_33107.containsKey(var6)) {
            if (field_33104.isLoggable(Level.FINE)) {
               field_33104.fine(String.format("new io instance for %s", var5));
            }

            field_33107.putIfAbsent(var6, new class_1289(var5, var1));
         }

         var10 = field_33107.get(var6);
      }

      String var11 = var4.getQuery();
      if (var11 != null && (var1.field_30043 == null || var1.field_30043.isEmpty())) {
         var1.field_30043 = var11;
      }

      return var10.method_5794(var4.getPath(), var1);
   }
}
