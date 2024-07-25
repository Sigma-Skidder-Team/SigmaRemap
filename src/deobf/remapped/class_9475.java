package remapped;

import java.util.HashMap;

public class class_9475 {
   public static void method_43765(class_159 var0, class_6544 var1) {
      try {
         Throwable var4 = var0.method_631();
         if (var4 == null) {
            return;
         }

         if (var4.getClass().getName().contains(".fml.client.SplashProgress")) {
            return;
         }

         if (var4.getClass() == Throwable.class) {
            return;
         }

         method_43766(var1);
         GameOptions var5 = Config.method_14310();
         if (var5 == null) {
            return;
         }

         if (!var5.field_45403) {
            return;
         }

         String var6 = "http://optifine.net/crashReport";
         String var7 = method_43762(var0);
         byte[] var8 = var7.getBytes("ASCII");
         class_354 var9 = new class_354();
         HashMap var10 = new HashMap();
         var10.put("OF-Version", Config.method_14314());
         var10.put("OF-Summary", method_43763(var0));
         class_7080 var11 = new class_7080(var6, var10, var8, var9);
         var11.setPriority(10);
         var11.start();
         Thread.sleep(1000L);
      } catch (Exception var12) {
         Config.method_14277(var12.getClass().getName() + ": " + var12.getMessage());
      }
   }

   private static String method_43762(class_159 var0) {
      StringBuffer var3 = new StringBuffer();
      var3.append("OptiFineVersion: " + Config.method_14314() + "\n");
      var3.append("Summary: " + method_43763(var0) + "\n");
      var3.append("\n");
      var3.append(var0.method_632());
      var3.append("\n");
      return var3.toString();
   }

   private static String method_43763(class_159 var0) {
      Throwable var3 = var0.method_631();
      if (var3 != null) {
         StackTraceElement[] var4 = var3.getStackTrace();
         String var5 = "unknown";
         if (var4.length > 0) {
            var5 = var4[0].toString().trim();
         }

         return var3.getClass().getName() + ": " + var3.getMessage() + " (" + var0.method_630() + ") [" + var5 + "]";
      } else {
         return "Unknown";
      }
   }

   public static void method_43766(class_6544 var0) {
      var0.method_29850("OptiFine Version", Config.method_14314());
      var0.method_29850("OptiFine Build", Config.method_14376());
      if (Config.method_14310() != null) {
         var0.method_29850("Render Distance Chunks", "" + Config.method_14358());
         var0.method_29850("Mipmaps", "" + Config.method_14245());
         var0.method_29850("Anisotropic Filtering", "" + Config.method_14412());
         var0.method_29850("Antialiasing", "" + Config.method_14447());
         var0.method_29850("Multitexture", "" + Config.method_14405());
      }

      var0.method_29850("Shaders", "" + class_6588.method_30235());
      var0.method_29850("OpenGlVersion", "" + Config.field_15464);
      var0.method_29850("OpenGlRenderer", "" + Config.field_15458);
      var0.method_29850("OpenGlVendor", "" + Config.field_15479);
      var0.method_29850("CpuCount", "" + Config.method_14308());
   }
}
