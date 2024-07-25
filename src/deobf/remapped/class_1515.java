package remapped;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import javax.annotation.Nullable;

public class class_1515 implements AutoCloseable {
   private final WatchService field_8077;
   private final Path field_8075;

   public class_1515(File var1) throws IOException {
      this.field_8075 = var1.toPath();
      this.field_8077 = this.field_8075.getFileSystem().newWatchService();

      try {
         this.method_6927(this.field_8075);

         try (DirectoryStream var4 = Files.newDirectoryStream(this.field_8075)) {
            for (Path var7 : var4) {
               if (Files.isDirectory(var7, LinkOption.NOFOLLOW_LINKS)) {
                  this.method_6927(var7);
               }
            }
         }
      } catch (Exception var18) {
         this.field_8077.close();
         throw var18;
      }
   }

   @Nullable
   public static class_1515 method_6929(File var0) {
      try {
         return new class_1515(var0);
      } catch (IOException var4) {
         class_6707.method_30763().warn("Failed to initialize pack directory {} monitoring", var0, var4);
         return null;
      }
   }

   private void method_6927(Path var1) throws IOException {
      var1.register(this.field_8077, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY);
   }

   public boolean method_6930() throws IOException {
      boolean var3 = false;

      WatchKey var4;
      while ((var4 = this.field_8077.poll()) != null) {
         for (WatchEvent var6 : var4.pollEvents()) {
            var3 = true;
            if (var4.watchable() == this.field_8075 && var6.kind() == StandardWatchEventKinds.ENTRY_CREATE) {
               Path var7 = this.field_8075.resolve((Path)var6.context());
               if (Files.isDirectory(var7, LinkOption.NOFOLLOW_LINKS)) {
                  this.method_6927(var7);
               }
            }
         }

         var4.reset();
      }

      return var3;
   }

   @Override
   public void close() throws IOException {
      this.field_8077.close();
   }
}
