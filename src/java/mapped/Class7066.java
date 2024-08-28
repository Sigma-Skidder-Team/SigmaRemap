package mapped;

import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Class7066 extends Class7067 {
   public static String field30443;

   @Override
   public String method21980() {
      if (field30443 != null) {
         return field30443;
      } else {
         try {
            Object var3 = null;
            InputStream var4 = null;
            Runtime var5 = Runtime.getRuntime();
            Process var6 = null;

            try {
               var6 = var5.exec(new String[]{"wmic", "bios", "get", "serialnumber"});
            } catch (IOException var15) {
               field30443 = "IOEXCEPTION";
            }

            var3 = var6.getOutputStream();
            var4 = var6.getInputStream();
            Scanner var7 = new Scanner(var4);

            try {
               while (var7.hasNext()) {
                  String var8 = var7.next();

                  try {
                     if ("SerialNumber".equals(var8)) {
                        field30443 = var7.next().trim();
                        break;
                     }
                  } catch (NoSuchElementException var16) {
                     field30443 = "NoSuchElement";
                  }
               }
            } finally {
               var4.close();
            }

            if (field30443 == null) {
               field30443 = "Serial Number Failed";
            }
         } catch (IOException var18) {
            var18.printStackTrace();
         }

         return field30443 = field30443 + " " + System.getProperty("user.name") + " " + System.getProperty("user.home");
      }
   }
}
