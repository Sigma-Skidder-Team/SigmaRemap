package mapped;

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

import net.minecraft.client.util.Util;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class1692 implements AutoCloseable {
   private static final Logger field9216 = LogManager.getLogger();
   private static final ByteBuffer field9217 = ByteBuffer.allocateDirect(1);
   private final FileChannel field9218;
   private final Path field9219;
   private final Class9471 field9220;
   private final ByteBuffer field9221 = ByteBuffer.allocateDirect(8192);
   private final IntBuffer field9222;
   private final IntBuffer field9223;
   public final Class7965 field9224 = new Class7965();

   public Class1692(File var1, File var2, boolean var3) throws IOException {
      this(var1.toPath(), var2.toPath(), Class9471.field44009, var3);
   }

   public Class1692(Path var1, Path var2, Class9471 var3, boolean var4) throws IOException {
      this.field9220 = var3;
      if (Files.isDirectory(var2)) {
         this.field9219 = var2;
         this.field9222 = this.field9221.asIntBuffer();
         ((Buffer)this.field9222).limit(1024);
         ((Buffer)this.field9221).position(4096);
         this.field9223 = this.field9221.asIntBuffer();
         if (!var4) {
            this.field9218 = FileChannel.open(var1, StandardOpenOption.CREATE, StandardOpenOption.READ, StandardOpenOption.WRITE);
         } else {
            this.field9218 = FileChannel.open(var1, StandardOpenOption.CREATE, StandardOpenOption.READ, StandardOpenOption.WRITE, StandardOpenOption.DSYNC);
         }

         this.field9224.method27088(0, 2);
         ((Buffer)this.field9221).position(0);
         int var7 = this.field9218.read(this.field9221, 0L);
         if (var7 != -1) {
            if (var7 != 8192) {
               field9216.warn("Region file {} has truncated header: {}", var1, var7);
            }

            long var8 = Files.size(var1);

            for (int var10 = 0; var10 < 1024; var10++) {
               int var11 = this.field9222.get(var10);
               if (var11 != 0) {
                  int var12 = method7255(var11);
                  int var13 = method7254(var11);
                  if (var12 >= 2) {
                     if (var13 != 0) {
                        if ((long)var12 * 4096L <= var8) {
                           this.field9224.method27088(var12, var13);
                        } else {
                           field9216.warn("Region file {} has an invalid sector at index: {}; sector {} is out of bounds", var1, var10, var12);
                           this.field9222.put(var10, 0);
                        }
                     } else {
                        field9216.warn("Region file {} has an invalid sector at index: {}; size has to be > 0", var1, var10);
                        this.field9222.put(var10, 0);
                     }
                  } else {
                     field9216.warn("Region file {} has invalid sector at index: {}; sector {} overlaps with header", var1, var10, var12);
                     this.field9222.put(var10, 0);
                  }
               }
            }
         }
      } else {
         throw new IllegalArgumentException("Expected directory, got " + var2.toAbsolutePath());
      }
   }

   private Path method7246(Class7481 var1) {
      String var4 = "c." + var1.field32174 + "." + var1.field32175 + ".mcc";
      return this.field9219.resolve(var4);
   }

   @Nullable
   public synchronized DataInputStream method7247(Class7481 var1) throws IOException {
      int var4 = this.method7264(var1);
      if (var4 != 0) {
         int var5 = method7255(var4);
         int var6 = method7254(var4);
         int var7 = var6 * 4096;
         ByteBuffer var8 = ByteBuffer.allocate(var7);
         this.field9218.read(var8, (long)(var5 * 4096));
         ((Buffer)var8).flip();
         if (var8.remaining() >= 5) {
            int var9 = var8.getInt();
            byte var10 = var8.get();
            if (var9 != 0) {
               int var11 = var9 - 1;
               if (!method7248(var10)) {
                  if (var11 <= var8.remaining()) {
                     if (var11 >= 0) {
                        return this.method7250(var1, var10, method7252(var8, var11));
                     } else {
                        field9216.error("Declared size {} of chunk {} is negative", var9, var1);
                        return null;
                     }
                  } else {
                     field9216.error("Chunk {} stream is truncated: expected {} but read {}", var1, var11, var8.remaining());
                     return null;
                  }
               } else {
                  if (var11 != 0) {
                     field9216.warn("Chunk has both internal and external streams");
                  }

                  return this.method7251(var1, method7249(var10));
               }
            } else {
               field9216.warn("Chunk {} is allocated, but stream is missing", var1);
               return null;
            }
         } else {
            field9216.error("Chunk {} header is truncated: expected {} but read {}", var1, var7, var8.remaining());
            return null;
         }
      } else {
         return null;
      }
   }

   private static boolean method7248(byte var0) {
      return false;
   }

   private static byte method7249(byte var0) {
      return (byte)(var0 & -129);
   }

   @Nullable
   private DataInputStream method7250(Class7481 var1, byte var2, InputStream var3) throws IOException {
      Class9471 var6 = Class9471.method36523(var2);
      if (var6 != null) {
         return new DataInputStream(new BufferedInputStream(var6.method36527(var3)));
      } else {
         field9216.error("Chunk {} has invalid chunk stream version {}", var1, var2);
         return null;
      }
   }

   @Nullable
   private DataInputStream method7251(Class7481 var1, byte var2) throws IOException {
      Path var5 = this.method7246(var1);
      if (Files.isRegularFile(var5)) {
         return this.method7250(var1, var2, Files.newInputStream(var5));
      } else {
         field9216.error("External chunk path {} is not file", var5);
         return null;
      }
   }

   private static ByteArrayInputStream method7252(ByteBuffer var0, int var1) {
      return new ByteArrayInputStream(var0.array(), var0.position(), var1);
   }

   private int method7253(int var1, int var2) {
      return var1 << 8 | var2;
   }

   private static int method7254(int var0) {
      return var0 & 0xFF;
   }

   private static int method7255(int var0) {
      return var0 >> 8 & 16777215;
   }

   private static int method7256(int var0) {
      return (var0 + 4096 - 1) / 4096;
   }

   public boolean method7257(Class7481 var1) {
      int var4 = this.method7264(var1);
      if (var4 == 0) {
         return false;
      } else {
         int var5 = method7255(var4);
         int var6 = method7254(var4);
         ByteBuffer var7 = ByteBuffer.allocate(5);

         try {
            this.field9218.read(var7, (long)(var5 * 4096));
            ((Buffer)var7).flip();
            if (var7.remaining() != 5) {
               return false;
            } else {
               int var8 = var7.getInt();
               byte var9 = var7.get();
               if (method7248(var9)) {
                  if (!Class9471.method36524(method7249(var9))) {
                     return false;
                  }

                  if (!Files.isRegularFile(this.method7246(var1))) {
                     return false;
                  }
               } else {
                  if (!Class9471.method36524(var9)) {
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

   public DataOutputStream method7258(Class7481 var1) throws IOException {
      return new DataOutputStream(new BufferedOutputStream(this.field9220.method36526(new Class1765(this, var1))));
   }

   public void method7259() throws IOException {
      this.field9218.force(true);
   }

   public synchronized void method7260(Class7481 var1, ByteBuffer var2) throws IOException {
      int var5 = method7266(var1);
      int var6 = this.field9222.get(var5);
      int var7 = method7255(var6);
      int var8 = method7254(var6);
      int var9 = var2.remaining();
      int var10 = method7256(var9);
      int var11;
      Class6855 var12;
      if (var10 < 256) {
         var11 = this.field9224.method27090(var10);
         var12 = () -> Files.deleteIfExists(this.method7246(var1));
         this.field9218.write(var2, (long)(var11 * 4096));
      } else {
         Path var13 = this.method7246(var1);
         field9216.warn("Saving oversized chunk {} ({} bytes} to external file {}", var1, var9, var13);
         var10 = 1;
         var11 = this.field9224.method27090(var10);
         var12 = this.method7262(var13, var2);
         ByteBuffer var14 = this.method7261();
         this.field9218.write(var14, (long)(var11 * 4096));
      }

      int var15 = (int)(Util.method38489() / 1000L);
      this.field9222.put(var5, this.method7253(var11, var10));
      this.field9223.put(var5, var15);
      this.method7263();
      var12.run();
      if (var7 != 0) {
         this.field9224.method27089(var7, var8);
      }
   }

   private ByteBuffer method7261() {
      ByteBuffer var3 = ByteBuffer.allocate(5);
      var3.putInt(1);
      var3.put((byte)(this.field9220.method36525() | 128));
      ((Buffer)var3).flip();
      return var3;
   }

   private Class6855 method7262(Path var1, ByteBuffer var2) throws IOException {
      Path var5 = Files.createTempFile(this.field9219, "tmp", (String)null);

      try (FileChannel var6 = FileChannel.open(var5, StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
         ((Buffer)var2).position(5);
         var6.write(var2);
      }

      return () -> Files.move(var5, var1, StandardCopyOption.REPLACE_EXISTING);
   }

   private void method7263() throws IOException {
      ((Buffer)this.field9221).position(0);
      this.field9218.write(this.field9221, 0L);
   }

   private int method7264(Class7481 var1) {
      return this.field9222.get(method7266(var1));
   }

   public boolean method7265(Class7481 var1) {
      return this.method7264(var1) != 0;
   }

   private static int method7266(Class7481 var0) {
      return var0.method24362() + var0.method24363() * 32;
   }

   @Override
   public void close() throws IOException {
      try {
         this.method7267();
      } finally {
         try {
            this.field9218.force(true);
         } finally {
            this.field9218.close();
         }
      }
   }

   private void method7267() throws IOException {
      int var3 = (int)this.field9218.size();
      int var4 = method7256(var3) * 4096;
      if (var3 != var4) {
         ByteBuffer var5 = field9217.duplicate();
         ((Buffer)var5).position(0);
         this.field9218.write(var5, (long)(var4 - 1));
      }
   }

   // $VF: synthetic method
   public static Class9471 method7270(Class1692 var0) {
      return var0.field9220;
   }
}
