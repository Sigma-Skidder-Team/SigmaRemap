package mapped;

import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.optifine.Config;
import net.optifine.shaders.Shaders;

public class Class9724 {
   public static void method38083(CrashReport var0, CrashReportCategory var1) {

   }

   private static String method38084(CrashReport var0) {
      StringBuffer var3 = new StringBuffer();
      var3.append("OptiFineVersion: " + Config.method26777() + "\n");
      var3.append("Summary: " + method38085(var0) + "\n");
      var3.append("\n");
      var3.append(var0.getCompleteReport());
      var3.append("\n");
      return var3.toString();
   }

   private static String method38085(CrashReport var0) {
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

   public static void method38086(CrashReportCategory var0) {
      var0.addDetail("OptiFine Version", Config.method26777());
      var0.addDetail("OptiFine Build", Config.method26783());
      if (Config.method26928() != null) {
         var0.addDetail("Render Distance Chunks", "" + Config.method26942());
         var0.addDetail("Mipmaps", "" + Config.method26800());
         var0.addDetail("Anisotropic Filtering", "" + Config.method26889());
         var0.addDetail("Antialiasing", "" + Config.method26891());
         var0.addDetail("Multitexture", "" + Config.method26894());
      }

      var0.addDetail("Shaders", "" + Shaders.method33137());
      var0.addDetail("OpenGlVersion", "" + Config.field34147);
      var0.addDetail("OpenGlRenderer", "" + Config.field34148);
      var0.addDetail("OpenGlVendor", "" + Config.field34149);
      var0.addDetail("CpuCount", "" + Config.method26935());
   }
}
