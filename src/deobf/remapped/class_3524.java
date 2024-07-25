package remapped;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.apache.commons.io.FileUtils;

public class class_3524 {
   private static final class_5380 field_17267 = new class_5380();

   public static class_8974 method_16270() {
      File var2 = method_16272();

      try {
         return field_17267.<class_8974>method_24513(FileUtils.readFileToString(var2, StandardCharsets.UTF_8), class_8974.class);
      } catch (IOException var4) {
         return new class_8974();
      }
   }

   public static void method_16271(class_8974 var0) {
      File var3 = method_16272();

      try {
         FileUtils.writeStringToFile(var3, field_17267.method_24512(var0), StandardCharsets.UTF_8);
      } catch (IOException var5) {
      }
   }

   private static File method_16272() {
      return new File(class_1893.method_8510().field_9575, "realms_persistence.json");
   }
}
