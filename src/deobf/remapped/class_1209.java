package remapped;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_1209 implements AutoCloseable {
   private static final Logger field_6744 = LogManager.getLogger();
   private static final ByteBuffer field_6740 = ByteBuffer.allocateDirect(1);
   private final FileChannel field_6745;
   private final Path field_6742;
   private final class_8500 field_6741;
   private final ByteBuffer field_6739 = ByteBuffer.allocateDirect(8192);
   private final IntBuffer field_6743;
   private final IntBuffer field_6737;
   public final class_3175 field_6736 = new class_3175();

   public class_1209(File var1, File var2, boolean var3) throws IOException {
      this(var1.toPath(), var2.toPath(), class_8500.field_43530, var3);
   }

   public class_1209(Path var1, Path var2, class_8500 var3, boolean var4) throws IOException {
      this.field_6741 = var3;
      if (Files.isDirectory(var2)) {
         this.field_6742 = var2;
         this.field_6743 = this.field_6739.asIntBuffer();
         ((Buffer)this.field_6743).limit(1024);
         ((Buffer)this.field_6739).position(4096);
         this.field_6737 = this.field_6739.asIntBuffer();
         if (!var4) {
            this.field_6745 = FileChannel.open(var1, StandardOpenOption.CREATE, StandardOpenOption.READ, StandardOpenOption.WRITE);
         } else {
            this.field_6745 = FileChannel.open(var1, StandardOpenOption.CREATE, StandardOpenOption.READ, StandardOpenOption.WRITE, StandardOpenOption.DSYNC);
         }

         this.field_6736.method_14631(0, 2);
         ((Buffer)this.field_6739).position(0);
         int var7 = this.field_6745.read(this.field_6739, 0L);
         if (var7 != -1) {
            if (var7 != 8192) {
               field_6744.warn("Region file {} has truncated header: {}", var1, var7);
            }

            long var8 = Files.size(var1);

            for (int var10 = 0; var10 < 1024; var10++) {
               int var11 = this.field_6743.get(var10);
               if (var11 != 0) {
                  int var12 = method_5347(var11);
                  int var13 = method_5362(var11);
                  if (var12 >= 2) {
                     if (var13 != 0) {
                        if ((long)var12 * 4096L <= var8) {
                           this.field_6736.method_14631(var12, var13);
                        } else {
                           field_6744.warn("Region file {} has an invalid sector at index: {}; sector {} is out of bounds", var1, var10, var12);
                           this.field_6743.put(var10, 0);
                        }
                     } else {
                        field_6744.warn("Region file {} has an invalid sector at index: {}; size has to be > 0", var1, var10);
                        this.field_6743.put(var10, 0);
                     }
                  } else {
                     field_6744.warn("Region file {} has invalid sector at index: {}; sector {} overlaps with header", var1, var10, var12);
                     this.field_6743.put(var10, 0);
                  }
               }
            }
         }
      } else {
         throw new IllegalArgumentException("Expected directory, got " + var2.toAbsolutePath());
      }
   }

   private Path method_5360(class_2034 var1) {
      String var4 = "c." + var1.field_10328 + "." + var1.field_10327 + ".mcc";
      return this.field_6742.resolve(var4);
   }

   @Nullable
   public synchronized DataInputStream method_5344(class_2034 var1) throws IOException {
      int var4 = this.method_5350(var1);
      if (var4 != 0) {
         int var5 = method_5347(var4);
         int var6 = method_5362(var4);
         int var7 = var6 * 4096;
         ByteBuffer var8 = ByteBuffer.allocate(var7);
         this.field_6745.read(var8, (long)(var5 * 4096));
         ((Buffer)var8).flip();
         if (var8.remaining() >= 5) {
            int var9 = var8.getInt();
            byte var10 = var8.get();
            if (var9 != 0) {
               int var11 = var9 - 1;
               if (!method_5358(var10)) {
                  if (var11 <= var8.remaining()) {
                     if (var11 >= 0) {
                        return this.method_5349(var1, var10, method_5364(var8, var11));
                     } else {
                        field_6744.error("Declared size {} of chunk {} is negative", var9, var1);
                        return null;
                     }
                  } else {
                     field_6744.error("Chunk {} stream is truncated: expected {} but read {}", var1, var11, var8.remaining());
                     return null;
                  }
               } else {
                  if (var11 != 0) {
                     field_6744.warn("Chunk has both internal and external streams");
                  }

                  return this.method_5356(var1, method_5352(var10));
               }
            } else {
               field_6744.warn("Chunk {} is allocated, but stream is missing", var1);
               return null;
            }
         } else {
            field_6744.error("Chunk {} header is truncated: expected {} but read {}", var1, var7, var8.remaining());
            return null;
         }
      } else {
         return null;
      }
   }

   private static boolean method_5358(byte var0) {
      return false;
   }

   private static byte method_5352(byte var0) {
      return (byte)(var0 & -129);
   }

   @Nullable
   private DataInputStream method_5349(class_2034 var1, byte var2, InputStream var3) throws IOException {
      class_8500 var6 = class_8500.method_39169(var2);
      if (var6 != null) {
         return new DataInputStream(new BufferedInputStream(var6.method_39167(var3)));
      } else {
         field_6744.error("Chunk {} has invalid chunk stream version {}", var1, var2);
         return null;
      }
   }

   @Nullable
   private DataInputStream method_5356(class_2034 var1, byte var2) throws IOException {
      Path var5 = this.method_5360(var1);
      if (Files.isRegularFile(var5)) {
         return this.method_5349(var1, var2, Files.newInputStream(var5));
      } else {
         field_6744.error("External chunk path {} is not file", var5);
         return null;
      }
   }

   private static ByteArrayInputStream method_5364(ByteBuffer var0, int var1) {
      return new ByteArrayInputStream(var0.array(), var0.position(), var1);
   }

   private int method_5359(int var1, int var2) {
      return var1 << 8 | var2;
   }

   private static int method_5362(int var0) {
      return var0 & 0xFF;
   }

   private static int method_5347(int var0) {
      return var0 >> 8 & 16777215;
   }

   private static int method_5354(int var0) {
      return (var0 + 4096 - 1) / 4096;
   }

   public boolean method_5346(class_2034 var1) {
      int var4 = this.method_5350(var1);
      if (var4 == 0) {
         return false;
      } else {
         int var5 = method_5347(var4);
         int var6 = method_5362(var4);
         ByteBuffer var7 = ByteBuffer.allocate(5);

         try {
            this.field_6745.read(var7, (long)(var5 * 4096));
            ((Buffer)var7).flip();
            if (var7.remaining() != 5) {
               return false;
            } else {
               int var8 = var7.getInt();
               byte var9 = var7.get();
               if (method_5358(var9)) {
                  if (!class_8500.method_39168(method_5352(var9))) {
                     return false;
                  }

                  if (!Files.isRegularFile(this.method_5360(var1))) {
                     return false;
                  }
               } else {
                  if (!class_8500.method_39168(var9)) {
                     return false;
                  }

                  if (var8 == 0) {
                     return false;
                  }

                  int var10 = var8 - 1;
                  if (var10 < 0 || var10 > 4096 * var6) {
                     return false;
                  }
               }

               return true;
            }
         } catch (IOException var11) {
            return false;
         }
      }
   }

   public DataOutputStream method_5353(class_2034 var1) throws IOException {
      return new DataOutputStream(new BufferedOutputStream(this.field_6741.method_39163(new class_844(this, var1))));
   }

   public void method_5355() throws IOException {
      this.field_6745.force(true);
   }

   public synchronized void method_5341(class_2034 var1, ByteBuffer var2) throws IOException {
      int var5 = method_5361(var1);
      int var6 = this.field_6743.get(var5);
      int var7 = method_5347(var6);
      int var8 = method_5362(var6);
      int var9 = var2.remaining();
      int var10 = method_5354(var9);
      int var11;
      class_1034 var12;
      if (var10 < 256) {
         var11 = this.field_6736.method_14632(var10);
         var12 = () -> Files.deleteIfExists(this.method_5360(var1));
         this.field_6745.write(var2, (long)(var11 * 4096));
      } else {
         Path var13 = this.method_5360(var1);
         field_6744.warn("Saving oversized chunk {} ({} bytes} to external file {}", var1, var9, var13);
         var10 = 1;
         var11 = this.field_6736.method_14632(var10);
         var12 = this.method_5363(var13, var2);
         ByteBuffer var14 = this.method_5345();
         this.field_6745.write(var14, (long)(var11 * 4096));
      }

      int var15 = (int)(class_9665.method_44686() / 1000L);
      this.field_6743.put(var5, this.method_5359(var11, var10));
      this.field_6737.put(var5, var15);
      this.method_5343();
      var12.run();
      if (var7 != 0) {
         this.field_6736.method_14630(var7, var8);
      }
   }

   private ByteBuffer method_5345() {
      ByteBuffer var3 = ByteBuffer.allocate(5);
      var3.putInt(1);
      var3.put((byte)(this.field_6741.method_39165() | 128));
      ((Buffer)var3).flip();
      return var3;
   }

   private class_1034 method_5363(Path var1, ByteBuffer var2) throws IOException {
      Path var5 = Files.createTempFile(this.field_6742, "tmp", (String)null);

      try (FileChannel var6 = FileChannel.open(var5, StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
         ((Buffer)var2).position(5);
         var6.write(var2);
      }

      return () -> Files.move(var5, var1, StandardCopyOption.REPLACE_EXISTING);
   }

   private void method_5343() throws IOException {
      ((Buffer)this.field_6739).position(0);
      this.field_6745.write(this.field_6739, 0L);
   }

   private int method_5350(class_2034 var1) {
      return this.field_6743.get(method_5361(var1));
   }

   public boolean method_5351(class_2034 var1) {
      return this.method_5350(var1) != 0;
   }

   private static int method_5361(class_2034 var0) {
      return var0.method_9548() + var0.method_9547() * 32;
   }

   @Override
   public void close() throws IOException {
      try {
         this.method_5357();
      } finally {
         try {
            this.field_6745.force(true);
         } finally {
            this.field_6745.close();
         }
      }
   }

   private void method_5357() throws IOException {
      int var3 = (int)this.field_6745.size();
      int var4 = method_5354(var3) * 4096;
      if (var3 != var4) {
         ByteBuffer var5 = field_6740.duplicate();
         ((Buffer)var5).position(0);
         this.field_6745.write(var5, (long)(var4 - 1));
      }
   }
}
