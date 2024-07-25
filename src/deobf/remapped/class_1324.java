package remapped;

import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class class_1324 extends class_6891 {
   public static String field_7286;

   @Override
   public String method_31579() {
      if (field_7286 != null) {
         return field_7286;
      } else {
         try {
            Object var3 = null;
            InputStream var4 = null;
            Runtime var5 = Runtime.getRuntime();
            Process var6 = null;

            try {
               var6 = var5.exec(new String[]{"wmic", "bios", "get", "serialnumber"});
            } catch (IOException var15) {
               field_7286 = "IOEXCEPTION";
            }

            var3 = var6.getOutputStream();
            var4 = var6.getInputStream();
            Scanner var7 = new Scanner(var4);

            try {
               while (var7.hasNext()) {
                  String var8 = var7.next();

                  try {
                     if ("SerialNumber".equals(var8)) {
                        field_7286 = var7.next().trim();
                        break;
                     }
                  } catch (NoSuchElementException var16) {
                     field_7286 = "NoSuchElement";
                  }
               }
            } finally {
               var4.close();
            }

            if (field_7286 == null) {
               field_7286 = "Serial Number Failed";
            }
         } catch (IOException var18) {
            var18.printStackTrace();
         }

         return field_7286 = field_7286 + " " + System.getProperty("user.name") + " " + System.getProperty("user.home");
      }
   }
}
