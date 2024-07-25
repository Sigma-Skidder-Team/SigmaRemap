package remapped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class class_1910 {
   private static final Logger field_9732 = LogManager.getLogger();
   private static final String field_9731 = "[Shaders] ";

   public static void method_8673(String var0) {
      field_9732.error("[Shaders] " + var0);
   }

   public static void method_8669(String var0) {
      field_9732.warn("[Shaders] " + var0);
   }

   public static void method_8671(String var0) {
      field_9732.info("[Shaders] " + var0);
   }

   public static void method_8675(String var0) {
      field_9732.debug("[Shaders] " + var0);
   }

   public static void method_8674(String var0, Object... var1) {
      String var4 = String.format(var0, var1);
      field_9732.error("[Shaders] " + var4);
   }

   public static void method_8670(String var0, Object... var1) {
      String var4 = String.format(var0, var1);
      field_9732.warn("[Shaders] " + var4);
   }

   public static void method_8672(String var0, Object... var1) {
      String var4 = String.format(var0, var1);
      field_9732.info("[Shaders] " + var4);
   }

   public static void method_8676(String var0, Object... var1) {
      String var4 = String.format(var0, var1);
      field_9732.debug("[Shaders] " + var4);
   }
}
