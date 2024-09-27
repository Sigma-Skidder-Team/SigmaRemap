package mapped;

import net.optifine.Config;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Class383 extends Thread {
   public Class383() {
      super("VersionCheck");
   }

   @Override
   public void run() {
      HttpURLConnection var3 = null;

      try {
         Config.method26810("Checking for new version");
         URL var4 = new URL("http://optifine.net/version/1.16.4/HD_U.txt");
         var3 = (HttpURLConnection)var4.openConnection();
         if (Config.method26928().field44622) {
            var3.setRequestProperty("OF-MC-Version", "1.16.4");
            var3.setRequestProperty("OF-MC-Brand", "" + ClientBrandRetriever.getClientModName());
            var3.setRequestProperty("OF-Edition", "HD_U");
            var3.setRequestProperty("OF-Release", "G5");
            var3.setRequestProperty("OF-Java-Version", "" + System.getProperty("java.version"));
            var3.setRequestProperty("OF-CpuCount", "" + Config.method26935());
            var3.setRequestProperty("OF-OpenGL-Version", "" + Config.field34147);
            var3.setRequestProperty("OF-OpenGL-Vendor", "" + Config.field34149);
         }

         var3.setDoInput(true);
         var3.setDoOutput(false);
         var3.connect();

         try {
            InputStream var5 = var3.getInputStream();
            String var6 = Config.method26925(var5);
            var5.close();
            String[] var7 = Config.method26903(var6, "\n\r");
            if (var7.length < 1) {
               return;
            }

            String var8 = var7[0].trim();
            Config.method26810("Version found: " + var8);
            if (Config.method26931(var8, "G5") > 0) {
               Config.method26930(var8);
               return;
            }
         } finally {
            if (var3 != null) {
               var3.disconnect();
            }
         }
      } catch (Exception var13) {
         Config.method26810(var13.getClass().getName() + ": " + var13.getMessage());
      }
   }
}
