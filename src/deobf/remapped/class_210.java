package remapped;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class class_210 extends Thread {
   public class_210() {
      super("VersionCheck");
   }

   @Override
   public void run() {
      HttpURLConnection var3 = null;

      try {
         class_3111.method_14277("Checking for new version");
         URL var4 = new URL("http://optifine.net/version/1.16.4/HD_U.txt");
         var3 = (HttpURLConnection)var4.openConnection();
         if (class_3111.method_14310().field_45403) {
            var3.setRequestProperty("OF-MC-Version", "1.16.4");
            var3.setRequestProperty("OF-MC-Brand", "" + class_6489.method_29605());
            var3.setRequestProperty("OF-Edition", "HD_U");
            var3.setRequestProperty("OF-Release", "G5");
            var3.setRequestProperty("OF-Java-Version", "" + System.getProperty("java.version"));
            var3.setRequestProperty("OF-CpuCount", "" + class_3111.method_14308());
            var3.setRequestProperty("OF-OpenGL-Version", "" + class_3111.field_15464);
            var3.setRequestProperty("OF-OpenGL-Vendor", "" + class_3111.field_15479);
         }

         var3.setDoInput(true);
         var3.setDoOutput(false);
         var3.connect();

         try {
            InputStream var5 = var3.getInputStream();
            String var6 = class_3111.method_14270(var5);
            var5.close();
            String[] var7 = class_3111.method_14302(var6, "\n\r");
            if (var7.length < 1) {
               return;
            }

            String var8 = var7[0].trim();
            class_3111.method_14277("Version found: " + var8);
            if (class_3111.method_14281(var8, "G5") > 0) {
               class_3111.method_14388(var8);
               return;
            }
         } finally {
            if (var3 != null) {
               var3.disconnect();
            }
         }
      } catch (Exception var13) {
         class_3111.method_14277(var13.getClass().getName() + ": " + var13.getMessage());
      }
   }
}
