package mapped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Class7399 {
   private static final Logger field31662 = LogManager.getLogger();
   private static final String field31663 = "[Shaders] ";

   public static void method23632(String var0) {
      field31662.error("[Shaders] " + var0);
   }

   public static void method23633(String var0) {
      field31662.warn("[Shaders] " + var0);
   }

   public static void method23634(String var0) {
      field31662.info("[Shaders] " + var0);
   }

   public static void method23635(String var0) {
      field31662.debug("[Shaders] " + var0);
   }

   public static void method23636(String var0, Object... var1) {
      String var4 = String.format(var0, var1);
      field31662.error("[Shaders] " + var4);
   }

   public static void method23637(String var0, Object... var1) {
      String var4 = String.format(var0, var1);
      field31662.warn("[Shaders] " + var4);
   }

   public static void method23638(String var0, Object... var1) {
      String var4 = String.format(var0, var1);
      field31662.info("[Shaders] " + var4);
   }

   public static void method23639(String var0, Object... var1) {
      String var4 = String.format(var0, var1);
      field31662.debug("[Shaders] " + var4);
   }
}
