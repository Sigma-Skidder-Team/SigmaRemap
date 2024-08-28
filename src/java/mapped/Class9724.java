package mapped;

import java.util.HashMap;

public class Class9724 {
   public static void method38083(Class4526 var0, Class8965 var1) {
      try {
         Throwable var4 = var0.method14403();
         if (var4 == null) {
            return;
         }

         if (var4.getClass().getName().contains(".fml.client.SplashProgress")) {
            return;
         }

         if (var4.getClass() == Throwable.class) {
            return;
         }

         method38086(var1);
         Class9574 var5 = Class7944.method26928();
         if (var5 == null) {
            return;
         }

         if (!var5.field44622) {
            return;
         }

         String var6 = "http://optifine.net/crashReport";
         String var7 = method38084(var0);
         byte[] var8 = var7.getBytes("ASCII");
         Class5912 var9 = new Class5912();
         HashMap var10 = new HashMap();
         var10.put("OF-Version", Class7944.method26777());
         var10.put("OF-Summary", method38085(var0));
         Class355 var11 = new Class355(var6, var10, var8, var9);
         var11.setPriority(10);
         var11.start();
         Thread.sleep(1000L);
      } catch (Exception var12) {
         Class7944.method26810(var12.getClass().getName() + ": " + var12.getMessage());
      }
   }

   private static String method38084(Class4526 var0) {
      StringBuffer var3 = new StringBuffer();
      var3.append("OptiFineVersion: " + Class7944.method26777() + "\n");
      var3.append("Summary: " + method38085(var0) + "\n");
      var3.append("\n");
      var3.append(var0.method14406());
      var3.append("\n");
      return var3.toString();
   }

   private static String method38085(Class4526 var0) {
      Throwable var3 = var0.method14403();
      if (var3 != null) {
         StackTraceElement[] var4 = var3.getStackTrace();
         String var5 = "unknown";
         if (var4.length > 0) {
            var5 = var4[0].toString().trim();
         }

         return var3.getClass().getName() + ": " + var3.getMessage() + " (" + var0.method14402() + ") [" + var5 + "]";
      } else {
         return "Unknown";
      }
   }

   public static void method38086(Class8965 var0) {
      var0.method32807("OptiFine Version", Class7944.method26777());
      var0.method32807("OptiFine Build", Class7944.method26783());
      if (Class7944.method26928() != null) {
         var0.method32807("Render Distance Chunks", "" + Class7944.method26942());
         var0.method32807("Mipmaps", "" + Class7944.method26800());
         var0.method32807("Anisotropic Filtering", "" + Class7944.method26889());
         var0.method32807("Antialiasing", "" + Class7944.method26891());
         var0.method32807("Multitexture", "" + Class7944.method26894());
      }

      var0.method32807("Shaders", "" + Class8981.method33137());
      var0.method32807("OpenGlVersion", "" + Class7944.field34147);
      var0.method32807("OpenGlRenderer", "" + Class7944.field34148);
      var0.method32807("OpenGlVendor", "" + Class7944.field34149);
      var0.method32807("CpuCount", "" + Class7944.method26935());
   }
}
