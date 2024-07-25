package remapped;

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

public class class_7532 implements AutoCloseable {
   private final FileChannel field_38452;
   private final FileLock field_38450;
   private static final ByteBuffer field_38451;

   public static class_7532 method_34315(Path var0) throws IOException {
      Path var3 = var0.resolve("session.lock");
      if (!Files.isDirectory(var0)) {
         Files.createDirectories(var0);
      }

      FileChannel var4 = FileChannel.open(var3, StandardOpenOption.CREATE, StandardOpenOption.WRITE);

      try {
         var4.write(field_38451.duplicate());
         var4.force(true);
         FileLock var5 = var4.tryLock();
         if (var5 == null) {
            throw class_1569.method_7084(var3);
         } else {
            return new class_7532(var4, var5);
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

   private class_7532(FileChannel var1, FileLock var2) {
      this.field_38452 = var1;
      this.field_38450 = var2;
   }

   @Override
   public void close() throws IOException {
      try {
         if (this.field_38450.isValid()) {
            this.field_38450.release();
         }
      } finally {
         if (this.field_38452.isOpen()) {
            this.field_38452.close();
         }
      }
   }

   public boolean method_34314() {
      return this.field_38450.isValid();
   }

   public static boolean method_34317(Path var0) throws IOException {
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
      field_38451 = ByteBuffer.allocateDirect(var4.length);
      field_38451.put(var4);
      ((Buffer)field_38451).flip();
   }
}
