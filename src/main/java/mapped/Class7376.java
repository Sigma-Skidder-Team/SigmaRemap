package mapped;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class Class7376 extends SimpleFileVisitor<Path> {
   public final Path field31562;
   public final SaveFormat.LevelSave field31563;

   public Class7376(SaveFormat.LevelSave var1, Path var2) {
      this.field31563 = var1;
      this.field31562 = var2;
   }

   public FileVisitResult visitFile(Path var1, BasicFileAttributes var2) throws IOException {
      if (!var1.equals(this.field31562)) {
         SaveFormat.method38481().debug("Deleting {}", var1);
         Files.delete(var1);
      }

      return FileVisitResult.CONTINUE;
   }

   public FileVisitResult postVisitDirectory(Path var1, IOException var2) throws IOException {
      if (var2 == null) {
         if (var1.equals(SaveFormat.LevelSave.method8008(this.field31563))) {
            SaveFormat.LevelSave.method8009(this.field31563).close();
            Files.deleteIfExists(this.field31562);
         }

         Files.delete(var1);
         return FileVisitResult.CONTINUE;
      } else {
         throw var2;
      }
   }
}
