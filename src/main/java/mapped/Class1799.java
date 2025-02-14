package mapped;

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

public class Class1799 implements Class1798 {
   private long field9695;
   private final AudioFormat field9696;
   private final InputStream field9697;
   private ByteBuffer field9698 = MemoryUtil.memAlloc(8192);

   public Class1799(InputStream var1) throws IOException {
      this.field9697 = var1;
      ((Buffer)this.field9698).limit(0);
      MemoryStack var4 = MemoryStack.stackPush();
      Throwable var5 = null;

      try {
         IntBuffer var6 = var4.mallocInt(1);
         IntBuffer var7 = var4.mallocInt(1);

         while (this.field9695 == 0L) {
            if (!this.method7867()) {
               throw new IOException("Failed to find Ogg header");
            }

            int var8 = this.field9698.position();
            ((Buffer)this.field9698).position(0);
            this.field9695 = STBVorbis.stb_vorbis_open_pushdata(this.field9698, var6, var7, (STBVorbisAlloc)null);
            ((Buffer)this.field9698).position(var8);
            int var9 = var7.get(0);
            if (var9 == 1) {
               this.method7868();
            } else if (var9 != 0) {
               throw new IOException("Failed to read Ogg file " + var9);
            }
         }

         ((Buffer)this.field9698).position(this.field9698.position() + var6.get(0));
         STBVorbisInfo var19 = STBVorbisInfo.mallocStack(var4);
         STBVorbis.stb_vorbis_get_info(this.field9695, var19);
         this.field9696 = new AudioFormat((float)var19.sample_rate(), 16, var19.channels(), true, false);
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

   private boolean method7867() throws IOException {
      int var3 = this.field9698.limit();
      int var4 = this.field9698.capacity() - var3;
      if (var4 != 0) {
         byte[] var5 = new byte[var4];
         int var6 = this.field9697.read(var5);
         if (var6 != -1) {
            int var7 = this.field9698.position();
            ((Buffer)this.field9698).limit(var3 + var6);
            ((Buffer)this.field9698).position(var3);
            this.field9698.put(var5, 0, var6);
            ((Buffer)this.field9698).position(var7);
            return true;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   private void method7868() {
      boolean var3 = this.field9698.position() == 0;
      boolean var4 = this.field9698.position() == this.field9698.limit();
      if (var4 && !var3) {
         ((Buffer)this.field9698).position(0);
         ((Buffer)this.field9698).limit(0);
      } else {
         ByteBuffer var5 = MemoryUtil.memAlloc(!var3 ? this.field9698.capacity() : 2 * this.field9698.capacity());
         var5.put(this.field9698);
         MemoryUtil.memFree(this.field9698);
         ((Buffer)var5).flip();
         this.field9698 = var5;
      }
   }

   private boolean method7869(Class8516 var1) throws IOException {
      if (this.field9695 == 0L) {
         return false;
      } else {
         MemoryStack var4 = MemoryStack.stackPush();
         Throwable var5 = null;

         try {
            PointerBuffer var6 = var4.mallocPointer(1);
            IntBuffer var7 = var4.mallocInt(1);
            IntBuffer var8 = var4.mallocInt(1);

            while (true) {
               int var9 = STBVorbis.stb_vorbis_decode_frame_pushdata(this.field9695, this.field9698, var7, var6, var8);
               ((Buffer)this.field9698).position(this.field9698.position() + var9);
               int var10 = STBVorbis.stb_vorbis_get_error(this.field9695);
               if (var10 == 1) {
                  this.method7868();
                  if (!this.method7867()) {
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

                        this.method7871(var13.getFloatBuffer(0, var11), var13.getFloatBuffer(1, var11), var1);
                        return true;
                     }

                     this.method7870(var13.getFloatBuffer(0, var11), var1);
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

   private void method7870(FloatBuffer var1, Class8516 var2) {
      while (var1.hasRemaining()) {
         var2.method30163(var1.get());
      }
   }

   private void method7871(FloatBuffer var1, FloatBuffer var2, Class8516 var3) {
      while (var1.hasRemaining() && var2.hasRemaining()) {
         var3.method30163(var1.get());
         var3.method30163(var2.get());
      }
   }

   @Override
   public void close() throws IOException {
      if (this.field9695 != 0L) {
         STBVorbis.stb_vorbis_close(this.field9695);
         this.field9695 = 0L;
      }

      MemoryUtil.memFree(this.field9698);
      this.field9697.close();
   }

   @Override
   public AudioFormat method7865() {
      return this.field9696;
   }

   @Override
   public ByteBuffer method7866(int var1) throws IOException {
      Class8516 var4 = new Class8516(var1 + 8192);

      while (this.method7869(var4) && Class8516.method30165(var4) < var1) {
      }

      return var4.method30164();
   }

   public ByteBuffer method7872() throws IOException {
      Class8516 var3 = new Class8516(16384);

      while (this.method7869(var3)) {
      }

      return var3.method30164();
   }
}
