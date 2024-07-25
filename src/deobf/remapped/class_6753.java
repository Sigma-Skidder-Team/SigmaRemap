package remapped;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class class_6753 extends SimpleFileVisitor<Path> {
   public class_6753(class_3676 var1, Path var2) {
      this.field_34856 = var1;
      this.field_34857 = var2;
   }

   public FileVisitResult visitFile(Path var1, BasicFileAttributes var2) throws IOException {
      if (!var1.equals(this.field_34857)) {
         class_9663.method_44619().debug("Deleting {}", var1);
         Files.delete(var1);
      }

      return FileVisitResult.CONTINUE;
   }

   public FileVisitResult postVisitDirectory(Path var1, IOException var2) throws IOException {
      if (var2 == null) {
         if (var1.equals(class_3676.method_17063(this.field_34856))) {
            class_3676.method_17067(this.field_34856).close();
            Files.deleteIfExists(this.field_34857);
         }

         Files.delete(var1);
         return FileVisitResult.CONTINUE;
      } else {
         throw var2;
      }
   }
}
