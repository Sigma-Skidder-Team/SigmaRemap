package mapped;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class7036 {
   private static final Logger field30362 = LogManager.getLogger();
   private final Path field30363;
   private final boolean field30364;

   public Class7036(Path var1) {
      this.field30363 = var1;
      this.field30364 = SharedConstants.developmentMode || this.method21844();
   }

   private boolean method21844() {
      try (InputStream var3 = Files.newInputStream(this.field30363)) {
         Properties var5 = new Properties();
         var5.load(var3);
         return Boolean.parseBoolean(var5.getProperty("eula", "false"));
      } catch (Exception var18) {
         field30362.warn("Failed to load {}", this.field30363);
         this.method21846();
         return false;
      }
   }

   public boolean method21845() {
      return this.field30364;
   }

   private void method21846() {
      if (!SharedConstants.developmentMode) {
         try (OutputStream var3 = Files.newOutputStream(this.field30363)) {
            Properties var5 = new Properties();
            var5.setProperty("eula", "false");
            var5.store(
               var3,
               "By changing the setting below to TRUE you are indicating your agreement to our EULA (https://account.mojang.com/documents/minecraft_eula)."
            );
         } catch (Exception var16) {
            field30362.warn("Failed to save {}", this.field30363, var16);
         }
      }
   }
}
