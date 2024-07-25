package remapped;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.commons.io.IOUtils;

public class class_357 {
   public static boolean field_1386 = false;

   public static void method_1791(class_1293 var0, File var1) throws IOException {
      FileOutputStream var4 = new FileOutputStream(var1);
      IOUtils.write(var0.toString(0), var4);
      var4.close();
   }

   public static class_1293 method_1789(File var0) throws IOException {
      class_1293 var3 = new class_1293();
      if (var0.exists()) {
         FileInputStream var4 = new FileInputStream(var0);
         String var5 = IOUtils.toString(var4);
         if (var5 == null) {
            var4.close();
            return new class_1293();
         }

         if (!var5.isEmpty()) {
            try {
               var3 = new class_1293(var5);
            } catch (class_7584 var7) {
               if (SigmaMainClass.method_3328().method_3326() != null) {
                  SigmaMainClass.method_3328().method_3326().method_12862("Error when reading json from config. Continuing, but no preferences will be loaded.");
               }

               var7.printStackTrace();
            }
         } else if (SigmaMainClass.method_3328().method_3326() != null) {
            SigmaMainClass.method_3328().method_3326().method_12862("Empty config file");
         }

         var4.close();
      } else {
         if (SigmaMainClass.method_3328().method_3326() != null) {
            SigmaMainClass.method_3328().method_3326().method_12863("Config does not exist... creating new config file...");
         }

         field_1386 = true;
         var0.createNewFile();
      }

      return var3;
   }
}
