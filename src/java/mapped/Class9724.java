package mapped;

import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;

public class Class9724 {
   public static void method38083(CrashReport var0, CrashReportCategory var1) {

   }

   private static String method38084(CrashReport var0) {
      StringBuffer var3 = new StringBuffer();
      var3.append("OptiFineVersion: " + Class7944.method26777() + "\n");
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
      var0.addDetail("OptiFine Version", Class7944.method26777());
      var0.addDetail("OptiFine Build", Class7944.method26783());
      if (Class7944.method26928() != null) {
         var0.addDetail("Render Distance Chunks", "" + Class7944.method26942());
         var0.addDetail("Mipmaps", "" + Class7944.method26800());
         var0.addDetail("Anisotropic Filtering", "" + Class7944.method26889());
         var0.addDetail("Antialiasing", "" + Class7944.method26891());
         var0.addDetail("Multitexture", "" + Class7944.method26894());
      }

      var0.addDetail("Shaders", "" + Shaders.method33137());
      var0.addDetail("OpenGlVersion", "" + Class7944.field34147);
      var0.addDetail("OpenGlRenderer", "" + Class7944.field34148);
      var0.addDetail("OpenGlVendor", "" + Class7944.field34149);
      var0.addDetail("CpuCount", "" + Class7944.method26935());
   }
}
