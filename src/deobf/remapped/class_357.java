package remapped;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.commons.io.IOUtils;

public class class_357 {
   public static boolean field_1386 = false;

   public static void method_1791(JSONObjectImpl var0, File var1) throws IOException {
      FileOutputStream var4 = new FileOutputStream(var1);
      IOUtils.write(var0.toString(0), var4);
      var4.close();
   }

   public static JSONObjectImpl method_1789(File var0) throws IOException {
      JSONObjectImpl var3 = new JSONObjectImpl();
      if (var0.exists()) {
         FileInputStream var4 = new FileInputStream(var0);
         String var5 = IOUtils.toString(var4);
         if (var5 == null) {
            var4.close();
            return new JSONObjectImpl();
         }

         if (!var5.isEmpty()) {
            try {
               var3 = new JSONObjectImpl(var5);
            } catch (class_7584 var7) {
               if (SigmaMainClass.getInstance().method_3326() != null) {
                  SigmaMainClass.getInstance().method_3326().method_12862("Error when reading json from config. Continuing, but no preferences will be loaded.");
               }

               var7.printStackTrace();
            }
         } else if (SigmaMainClass.getInstance().method_3326() != null) {
            SigmaMainClass.getInstance().method_3326().method_12862("Empty config file");
         }

         var4.close();
      } else {
         if (SigmaMainClass.getInstance().method_3326() != null) {
            SigmaMainClass.getInstance().method_3326().method_12863("Config does not exist... creating new config file...");
         }

         field_1386 = true;
         var0.createNewFile();
      }

      return var3;
   }
}
