package remapped;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

public class class_5052 {
   private static String field_26110 = null;
   private static String field_26108 = null;
   private static boolean field_26111 = false;
   private static boolean field_26109 = false;
   private static boolean field_26103 = false;
   private static boolean field_26104 = false;
   private static final String field_26113 = ".png";
   private static final class_4639 field_26107 = class_5525.field_28154;
   private static final class_4639 field_26106 = class_5525.field_28139;
   private static class_7889 field_26105;
   private static int field_26112 = 0;

   public static boolean method_23281() {
      return field_26111;
   }

   public static String method_23267() {
      return field_26110;
   }

   public static void method_23286() {
      if (!field_26109) {
         field_26109 = true;
         field_26103 = false;
      } else {
         field_26112++;
      }
   }

   public static class_4639 method_23273(class_4639 var0) {
      if (field_26109) {
         class_8143 var3 = field_26105.method_35679(var0);
         class_4639 var4 = null;
         if (var3 instanceof class_1809) {
            var4 = ((class_1809)var3).field_9205;
         }

         if (field_26104) {
            if (var4 == null) {
               var4 = field_26107;
            }

            return var4;
         } else {
            if (var4 != null) {
               field_26103 = true;
            }

            return var0;
         }
      } else {
         return var0;
      }
   }

   public static class_5155 method_23271(class_5155 var0) {
      if (field_26109) {
         class_5155 var3 = var0.field_26538;
         if (field_26104) {
            if (var3 == null) {
               var3 = var0.method_23608().method_38528(field_26106);
            }

            return var3;
         } else {
            if (var3 != null) {
               field_26103 = true;
            }

            return var0;
         }
      } else {
         return var0;
      }
   }

   public static class_5024 method_23266(class_5024 var0) {
      if (field_26109) {
         class_5024 var3 = var0.method_23162();
         if (field_26104) {
            return var3;
         } else {
            if (var3 != null) {
               field_26103 = true;
            }

            return var0;
         }
      } else {
         return var0;
      }
   }

   public static boolean method_23269() {
      return field_26112 <= 0 ? field_26103 : false;
   }

   public static void method_23282() {
      class_4811.method_22179();
      field_26104 = true;
   }

   public static boolean method_23276() {
      return field_26104;
   }

   public static void method_23278() {
      class_4811.method_22179();
      field_26104 = false;
   }

   public static void method_23275() {
      if (field_26112 <= 0) {
         field_26109 = false;
         field_26103 = false;
      } else {
         field_26112--;
      }
   }

   public static void method_23268() {
      field_26105 = MinecraftClient.getInstance().method_8577();
      field_26111 = false;
      field_26110 = null;
      field_26108 = null;
      if (class_3111.method_14328()) {
         try {
            String var2 = "optifine/emissive.properties";
            class_4639 var3 = new class_4639(var2);
            InputStream var4 = class_3111.method_14374(var3);
            if (var4 == null) {
               return;
            }

            method_23272("Loading " + var2);
            class_8407 var5 = new class_8407();
            var5.load(var4);
            var4.close();
            field_26110 = var5.getProperty("suffix.emissive");
            if (field_26110 != null) {
               field_26108 = field_26110 + ".png";
            }

            field_26111 = field_26110 != null;
         } catch (FileNotFoundException var6) {
            return;
         } catch (IOException var7) {
            var7.printStackTrace();
         }
      }
   }

   public static void method_23274(class_8359 var0, Set<class_4639> var1) {
      if (field_26111) {
         for (class_4639 var5 : var1) {
            method_23280(var0, var5);
         }
      }
   }

   private static void method_23280(class_8359 var0, class_4639 var1) {
      String var4 = method_23267();
      if (var4 != null && !var1.method_21456().endsWith(var4)) {
         class_4639 var5 = new class_4639(var1.method_21461(), var1.method_21456() + var4);
         class_4639 var6 = var0.method_38503(var5);
         if (class_3111.method_14362(var6)) {
            class_5155 var7 = var0.method_38515(var1);
            class_5155 var8 = var0.method_38515(var5);
            var8.field_26528 = true;
            var7.field_26538 = var8;
            var0.method_38515(field_26106);
         }
      }
   }

   public static void method_23279(class_8359 var0) {
      for (class_5155 var4 : var0.method_38506()) {
         method_23270(var4, var0);
      }
   }

   private static void method_23270(class_5155 var0, class_8359 var1) {
      if (var0.field_26538 != null) {
         class_5155 var4 = var1.method_38523(var0.method_23644());
         if (var4 != null) {
            class_5155 var5 = var1.method_38523(var0.field_26538.method_23644());
            if (var5 != null) {
               var5.field_26528 = true;
               var4.field_26538 = var5;
            }
         }
      }
   }

   private static void method_23272(String var0) {
      class_3111.method_14277("EmissiveTextures: " + var0);
   }

   private static void method_23284(String var0) {
      class_3111.method_14317("EmissiveTextures: " + var0);
   }

   public static boolean method_23285(class_4639 var0) {
      return field_26108 != null ? var0.method_21456().endsWith(field_26108) : false;
   }

   public static void method_23283(class_4639 var0, class_1809 var1) {
      if (var0 != null && var1 != null) {
         var1.field_9204 = false;
         var1.field_9205 = null;
         if (field_26108 != null) {
            String var4 = var0.method_21456();
            if (var4.endsWith(".png")) {
               if (!var4.endsWith(field_26108)) {
                  String var5 = var4.substring(0, var4.length() - ".png".length()) + field_26108;
                  class_4639 var6 = new class_4639(var0.method_21461(), var5);
                  if (class_3111.method_14362(var6)) {
                     var1.field_9205 = var6;
                  }
               } else {
                  var1.field_9204 = true;
               }
            }
         }
      }
   }
}
