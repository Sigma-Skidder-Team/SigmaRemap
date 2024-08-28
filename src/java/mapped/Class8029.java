package mapped;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

public class Class8029 {
   public static Map<String, Class6641> field34505;

   public static void method27529() {
      InputStream var2 = Class5980.class.getClassLoader().getResourceAsStream("assets/viaversion/data/itemrecipes1_12_2to1_13.json");
      InputStreamReader var3 = new InputStreamReader(var2);

      try {
         field34505 = (Map<String, Class6641>)Class9610.method37357().fromJson(var3, new Class5801().getType());
      } finally {
         try {
            var3.close();
         } catch (IOException var10) {
         }
      }
   }
}
