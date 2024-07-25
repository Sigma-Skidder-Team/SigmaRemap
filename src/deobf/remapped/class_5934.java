package remapped;

import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import javax.sound.sampled.AudioFormat;
import org.lwjgl.PointerBuffer;
import org.lwjgl.stb.STBVorbis;
import org.lwjgl.stb.STBVorbisAlloc;
import org.lwjgl.stb.STBVorbisInfo;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;

public class class_5934 implements class_2613 {
   private long field_30167;
   private final AudioFormat field_30164;
   private final InputStream field_30166;
   private ByteBuffer field_30168 = MemoryUtil.memAlloc(8192);

   public class_5934(InputStream var1) throws IOException {
      this.field_30166 = var1;
      ((Buffer)this.field_30168).limit(0);
      MemoryStack var4 = MemoryStack.stackPush();
      Throwable var5 = null;

      try {
         IntBuffer var6 = var4.mallocInt(1);
         IntBuffer var7 = var4.mallocInt(1);

         while (this.field_30167 == 0L) {
            if (!this.method_27131()) {
               throw new IOException("Failed to find Ogg header");
            }

            int var8 = this.field_30168.position();
            ((Buffer)this.field_30168).position(0);
            this.field_30167 = STBVorbis.stb_vorbis_open_pushdata(this.field_30168, var6, var7, (STBVorbisAlloc)null);
            ((Buffer)this.field_30168).position(var8);
            int var9 = var7.get(0);
            if (var9 == 1) {
               this.method_27127();
            } else if (var9 != 0) {
               throw new IOException("Failed to read Ogg file " + var9);
            }
         }

         ((Buffer)this.field_30168).position(this.field_30168.position() + var6.get(0));
         STBVorbisInfo var19 = STBVorbisInfo.mallocStack(var4);
         STBVorbis.stb_vorbis_get_info(this.field_30167, var19);
         this.field_30164 = new AudioFormat((float)var19.sample_rate(), 16, var19.channels(), true, false);
      } catch (Throwable var17) {
         var5 = var17;
         throw var17;
      } finally {
         if (var4 != null) {
            if (var5 != null) {
               try {
                  var4.close();
               } catch (Throwable var16) {
                  var5.addSuppressed(var16);
               }
            } else {
               var4.close();
            }
         }
      }
   }

   private boolean method_27131() throws IOException {
      int var3 = this.field_30168.limit();
      int var4 = this.field_30168.capacity() - var3;
      if (var4 != 0) {
         byte[] var5 = new byte[var4];
         int var6 = this.field_30166.read(var5);
         if (var6 != -1) {
            int var7 = this.field_30168.position();
            ((Buffer)this.field_30168).limit(var3 + var6);
            ((Buffer)this.field_30168).position(var3);
            this.field_30168.put(var5, 0, var6);
            ((Buffer)this.field_30168).position(var7);
            return true;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   private void method_27127() {
      boolean var3 = this.field_30168.position() == 0;
      boolean var4 = this.field_30168.position() == this.field_30168.limit();
      if (var4 && !var3) {
         ((Buffer)this.field_30168).position(0);
         ((Buffer)this.field_30168).limit(0);
      } else {
         ByteBuffer var5 = MemoryUtil.memAlloc(!var3 ? this.field_30168.capacity() : 2 * this.field_30168.capacity());
         var5.put(this.field_30168);
         MemoryUtil.memFree(this.field_30168);
         ((Buffer)var5).flip();
         this.field_30168 = var5;
      }
   }

   private boolean method_27128(class_4915 var1) throws IOException {
      if (this.field_30167 == 0L) {
         return false;
      } else {
         MemoryStack var4 = MemoryStack.stackPush();
         Throwable var5 = null;

         try {
            PointerBuffer var6 = var4.mallocPointer(1);
            IntBuffer var7 = var4.mallocInt(1);
            IntBuffer var8 = var4.mallocInt(1);

            while (true) {
               int var9 = STBVorbis.stb_vorbis_decode_frame_pushdata(this.field_30167, this.field_30168, var7, var6, var8);
               ((Buffer)this.field_30168).position(this.field_30168.position() + var9);
               int var10 = STBVorbis.stb_vorbis_get_error(this.field_30167);
               if (var10 == 1) {
                  this.method_27127();
                  if (!this.method_27131()) {
                     return false;
                  }
               } else {
                  if (var10 != 0) {
                     throw new IOException("Failed to read Ogg file " + var10);
                  }

                  int var11 = var8.get(0);
                  if (var11 != 0) {
                     int var12 = var7.get(0);
                     PointerBuffer var13 = var6.getPointerBuffer(var12);
                     if (var12 != 1) {
                        if (var12 != 2) {
                           throw new IllegalStateException("Invalid number of channels: " + var12);
                        }

                        this.method_27133(var13.getFloatBuffer(0, var11), var13.getFloatBuffer(1, var11), var1);
                        return true;
                     }

                     this.method_27132(var13.getFloatBuffer(0, var11), var1);
                     return true;
                  }
               }
            }
         } catch (Throwable var25) {
            var5 = var25;
            throw var25;
         } finally {
            if (var4 != null) {
               if (var5 != null) {
                  try {
                     var4.close();
                  } catch (Throwable var24) {
                     var5.addSuppressed(var24);
                  }
               } else {
                  var4.close();
               }
            }
         }
      }
   }

   private void method_27132(FloatBuffer var1, class_4915 var2) {
      while (var1.hasRemaining()) {
         var2.method_22508(var1.get());
      }
   }

   private void method_27133(FloatBuffer var1, FloatBuffer var2, class_4915 var3) {
      while (var1.hasRemaining() && var2.hasRemaining()) {
         var3.method_22508(var1.get());
         var3.method_22508(var2.get());
      }
   }

   @Override
   public void close() throws IOException {
      if (this.field_30167 != 0L) {
         STBVorbis.stb_vorbis_close(this.field_30167);
         this.field_30167 = 0L;
      }

      MemoryUtil.memFree(this.field_30168);
      this.field_30166.close();
   }

   @Override
   public AudioFormat method_11855() {
      return this.field_30164;
   }

   @Override
   public ByteBuffer method_11856(int var1) throws IOException {
      class_4915 var4 = new class_4915(var1 + 8192);

      while (this.method_27128(var4) && class_4915.method_22510(var4) < var1) {
      }

      return var4.method_22509();
   }

   public ByteBuffer method_27130() throws IOException {
      class_4915 var3 = new class_4915(16384);

      while (this.method_27128(var3)) {
      }

      return var3.method_22509();
   }
}
