package mapped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class9751 {
   private static final Logger field45511 = LogManager.getLogger();
   public static final boolean field45512 = System.getProperty("log.detail", "false").equals("true");

   public static void method38302(String var0) {
      if (field45512) {
         field45511.info("[OptiFine] " + var0);
      }
   }

   public static void method38303(String var0) {
      field45511.info("[OptiFine] " + var0);
   }

   public static void method38304(String var0) {
      field45511.warn("[OptiFine] " + var0);
   }

   public static void method38305(String var0, Throwable var1) {
      field45511.warn("[OptiFine] " + var0, var1);
   }

   public static void method38306(String var0) {
      field45511.error("[OptiFine] " + var0);
   }

   public static void method38307(String var0, Throwable var1) {
      field45511.error("[OptiFine] " + var0, var1);
   }

   public static void method38308(String var0) {
      method38303(var0);
   }
}
