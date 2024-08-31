package mapped;

import net.minecraft.client.gui.screen.PackScreen;

import javax.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class Class1651 implements AutoCloseable {
   private final WatchService field8977;
   private final Path field8978;

   public Class1651(File var1) throws IOException {
      this.field8978 = var1.toPath();
      this.field8977 = this.field8978.getFileSystem().newWatchService();

      try {
         this.method6639(this.field8978);

         try (DirectoryStream<Path> var4 = Files.newDirectoryStream(this.field8978)) {
            for (Path var7 : var4) {
               if (Files.isDirectory(var7, LinkOption.NOFOLLOW_LINKS)) {
                  this.method6639(var7);
               }
            }
         }
      } catch (Exception var18) {
         this.field8977.close();
         throw var18;
      }
   }

   @Nullable
   public static Class1651 method6638(File var0) {
      try {
         return new Class1651(var0);
      } catch (IOException var4) {
         PackScreen.method6415().warn("Failed to initialize pack directory {} monitoring", var0, var4);
         return null;
      }
   }

   private void method6639(Path var1) throws IOException {
      var1.register(this.field8977, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY);
   }

   public boolean method6640() throws IOException {
      boolean var3 = false;

      WatchKey var4;
      while ((var4 = this.field8977.poll()) != null) {
         for (WatchEvent var6 : var4.pollEvents()) {
            var3 = true;
            if (var4.watchable() == this.field8978 && var6.kind() == StandardWatchEventKinds.ENTRY_CREATE) {
               Path var7 = this.field8978.resolve((Path)var6.context());
               if (Files.isDirectory(var7, LinkOption.NOFOLLOW_LINKS)) {
                  this.method6639(var7);
               }
            }
         }

         var4.reset();
      }

      return var3;
   }

   @Override
   public void close() throws IOException {
      this.field8977.close();
   }
}
