package remapped;

import com.google.common.io.Files;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class class_1872 extends SimpleFileVisitor<Path> {
   public class_1872(class_3676 var1, Path var2, ZipOutputStream var3) {
      this.field_9483 = var1;
      this.field_9480 = var2;
      this.field_9482 = var3;
   }

   public FileVisitResult visitFile(Path var1, BasicFileAttributes var2) throws IOException {
      if (!var1.endsWith("session.lock")) {
         String var5 = this.field_9480.resolve(class_3676.method_17063(this.field_9483).relativize(var1)).toString().replace('\\', '/');
         ZipEntry var6 = new ZipEntry(var5);
         this.field_9482.putNextEntry(var6);
         Files.asByteSource(var1.toFile()).copyTo(this.field_9482);
         this.field_9482.closeEntry();
         return FileVisitResult.CONTINUE;
      } else {
         return FileVisitResult.CONTINUE;
      }
   }
}
