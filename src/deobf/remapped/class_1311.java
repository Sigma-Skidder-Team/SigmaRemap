package remapped;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_1311 {
   private static final Logger field_7243 = LogManager.getLogger();
   private final Path field_7244;
   private final boolean field_7245;

   public class_1311(Path var1) {
      this.field_7244 = var1;
      this.field_7245 = class_7665.field_38958 || this.method_5973();
   }

   private boolean method_5973() {
      try (InputStream var3 = Files.newInputStream(this.field_7244)) {
         Properties var5 = new Properties();
         var5.load(var3);
         return Boolean.parseBoolean(var5.getProperty("eula", "false"));
      } catch (Exception var18) {
         field_7243.warn("Failed to load {}", this.field_7244);
         this.method_5976();
         return false;
      }
   }

   public boolean method_5974() {
      return this.field_7245;
   }

   private void method_5976() {
      if (!class_7665.field_38958) {
         try (OutputStream var3 = Files.newOutputStream(this.field_7244)) {
            Properties var5 = new Properties();
            var5.setProperty("eula", "false");
            var5.store(
               var3,
               "By changing the setting below to TRUE you are indicating your agreement to our EULA (https://account.mojang.com/documents/minecraft_eula)."
            );
         } catch (Exception var16) {
            field_7243.warn("Failed to save {}", this.field_7244, var16);
         }
      }
   }
}
