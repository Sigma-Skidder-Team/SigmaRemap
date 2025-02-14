package mapped;

import com.google.common.base.Charsets;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.file.AccessDeniedException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Class1697 implements AutoCloseable {
   private final FileChannel field9238;
   private final FileLock field9239;
   private static final ByteBuffer field9240;

   public static Class1697 method7299(Path var0) throws IOException {
      Path var3 = var0.resolve("session.lock");
      if (!Files.isDirectory(var0)) {
         Files.createDirectories(var0);
      }

      FileChannel var4 = FileChannel.open(var3, StandardOpenOption.CREATE, StandardOpenOption.WRITE);

      try {
         var4.write(field9240.duplicate());
         var4.force(true);
         FileLock var5 = var4.tryLock();
         if (var5 == null) {
            throw Class2457.method10465(var3);
         } else {
            return new Class1697(var4, var5);
         }
      } catch (IOException var8) {
         try {
            var4.close();
         } catch (IOException var7) {
            var8.addSuppressed(var7);
         }

         throw var8;
      }
   }

   private Class1697(FileChannel var1, FileLock var2) {
      this.field9238 = var1;
      this.field9239 = var2;
   }

   @Override
   public void close() throws IOException {
      try {
         if (this.field9239.isValid()) {
            this.field9239.release();
         }
      } finally {
         if (this.field9238.isOpen()) {
            this.field9238.close();
         }
      }
   }

   public boolean method7300() {
      return this.field9239.isValid();
   }

   public static boolean method7301(Path var0) throws IOException {
      Path var3 = var0.resolve("session.lock");

      try (
         FileChannel var4 = FileChannel.open(var3, StandardOpenOption.WRITE);
         FileLock var6 = var4.tryLock();
      ) {
         return var6 == null;
      } catch (AccessDeniedException var39) {
         return true;
      } catch (NoSuchFileException var40) {
         return false;
      }
   }

   static {
      byte[] var4 = "☃".getBytes(Charsets.UTF_8);
      field9240 = ByteBuffer.allocateDirect(var4.length);
      field9240.put(var4);
      ((Buffer)field9240).flip();
   }
}
