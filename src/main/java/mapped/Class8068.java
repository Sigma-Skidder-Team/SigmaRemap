package mapped;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import net.minecraft.client.Minecraft;
import org.apache.commons.io.FileUtils;

public class Class8068 {
   private static final Class8650 field34644 = new Class8650();

   public static Class6113 method27770() {
      File var2 = method27772();

      try {
         return field34644.<Class6113>method31094(FileUtils.readFileToString(var2, StandardCharsets.UTF_8), Class6113.class);
      } catch (IOException var4) {
         return new Class6113();
      }
   }

   public static void method27771(Class6113 var0) {
      File var3 = method27772();

      try {
         FileUtils.writeStringToFile(var3, field34644.method31093(var0), StandardCharsets.UTF_8);
      } catch (IOException var5) {
      }
   }

   private static File method27772() {
      return new File(Minecraft.getInstance().gameDir, "realms_persistence.json");
   }
}
