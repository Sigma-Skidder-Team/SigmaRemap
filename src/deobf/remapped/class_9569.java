package remapped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_9569 {
   private static final Logger field_48690 = LogManager.getLogger();
   public static final boolean field_48691 = System.getProperty("log.detail", "false").equals("true");

   public static void method_44222(String var0) {
      if (field_48691) {
         field_48690.info("[OptiFine] " + var0);
      }
   }

   public static void method_44223(String var0) {
      field_48690.info("[OptiFine] " + var0);
   }

   public static void method_44224(String var0) {
      field_48690.warn("[OptiFine] " + var0);
   }

   public static void method_44225(String var0, Throwable var1) {
      field_48690.warn("[OptiFine] " + var0, var1);
   }

   public static void method_44219(String var0) {
      field_48690.error("[OptiFine] " + var0);
   }

   public static void method_44220(String var0, Throwable var1) {
      field_48690.error("[OptiFine] " + var0, var1);
   }

   public static void method_44218(String var0) {
      method_44223(var0);
   }
}
