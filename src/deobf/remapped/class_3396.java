package remapped;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

public class class_3396 {
   public static Map<String, class_832> field_16728;

   public static void method_15688() {
      InputStream var2 = class_9333.class.getClassLoader().getResourceAsStream("assets/viaversion/data/itemrecipes1_12_2to1_13.json");
      InputStreamReader var3 = new InputStreamReader(var2);

      try {
         field_16728 = (Map<String, class_832>)class_9012.method_41350().fromJson(var3, new class_6078().getType());
      } finally {
         try {
            var3.close();
         } catch (IOException var10) {
         }
      }
   }
}
