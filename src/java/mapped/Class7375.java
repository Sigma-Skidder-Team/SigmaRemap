package mapped;

import com.google.common.io.Files;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Class7375 extends SimpleFileVisitor<Path> {
   public final Path field31559;
   public final ZipOutputStream field31560;
   public final Class1814 field31561;

   public Class7375(Class1814 var1, Path var2, ZipOutputStream var3) {
      this.field31561 = var1;
      this.field31559 = var2;
      this.field31560 = var3;
   }

   public FileVisitResult visitFile(Path var1, BasicFileAttributes var2) throws IOException {
      if (!var1.endsWith("session.lock")) {
         String var5 = this.field31559.resolve(Class1814.method8008(this.field31561).relativize(var1)).toString().replace('\\', '/');
         ZipEntry var6 = new ZipEntry(var5);
         this.field31560.putNextEntry(var6);
         Files.asByteSource(var1.toFile()).copyTo(this.field31560);
         this.field31560.closeEntry();
         return FileVisitResult.CONTINUE;
      } else {
         return FileVisitResult.CONTINUE;
      }
   }
}
