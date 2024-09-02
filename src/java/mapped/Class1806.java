package mapped;

import com.google.common.base.Charsets;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.Channels;
import java.nio.channels.SeekableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Base64;
import java.util.EnumSet;
import java.util.Set;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.stb.STBImage;
import org.lwjgl.stb.STBImageResize;
import org.lwjgl.stb.STBImageWrite;
import org.lwjgl.stb.STBTTFontinfo;
import org.lwjgl.stb.STBTruetype;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;

public final class Class1806 implements AutoCloseable {
   private static final Logger field9722 = LogManager.getLogger();
   private static final Set<StandardOpenOption> field9723 = EnumSet.<StandardOpenOption>of(
      StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING
   );
   private final Class2237 field9724;
   private final int field9725;
   private final int field9726;
   private final boolean field9727;
   private long field9728;
   private final long field9729;

   public Class1806(int var1, int var2, boolean var3) {
      this(Class2237.field14626, var1, var2, var3);
   }

   public Class1806(Class2237 var1, int var2, int var3, boolean var4) {
      this.field9724 = var1;
      this.field9725 = var2;
      this.field9726 = var3;
      this.field9729 = (long)var2 * (long)var3 * (long)var1.method8973();
      this.field9727 = false;
      if (!var4) {
         this.field9728 = MemoryUtil.nmemAlloc(this.field9729);
      } else {
         this.field9728 = MemoryUtil.nmemCalloc(1L, this.field9729);
      }

      this.method7885();
      Class9323.method35238(this);
   }

   private Class1806(Class2237 var1, int var2, int var3, boolean var4, long var5) {
      this.field9724 = var1;
      this.field9725 = var2;
      this.field9726 = var3;
      this.field9727 = var4;
      this.field9728 = var5;
      this.field9729 = (long)(var2 * var3 * var1.method8973());
   }

   @Override
   public String toString() {
      return "NativeImage[" + this.field9724 + " " + this.field9725 + "x" + this.field9726 + "@" + this.field9728 + (!this.field9727 ? "N" : "S") + "]";
   }

   public static Class1806 method7879(InputStream var0) throws IOException {
      return method7880(Class2237.field14626, var0);
   }

   public static Class1806 method7880(Class2237 var0, InputStream var1) throws IOException {
      ByteBuffer var4 = null;

      Class1806 var5;
      try {
         var4 = Class8535.method30373(var1);
         ((Buffer)var4).rewind();
         var5 = method7882(var0, var4);
      } finally {
         MemoryUtil.memFree(var4);
         IOUtils.closeQuietly(var1);
      }

      return var5;
   }

   public static Class1806 method7881(ByteBuffer var0) throws IOException {
      return method7882(Class2237.field14626, var0);
   }

   public static Class1806 method7882(Class2237 var0, ByteBuffer var1) throws IOException {
      if (var0 != null && !var0.method8981()) {
         throw new UnsupportedOperationException("Don't know how to read format " + var0);
      } else if (MemoryUtil.memAddress(var1) == 0L) {
         throw new IllegalArgumentException("Invalid buffer");
      } else {
         MemoryStack var4 = MemoryStack.stackPush();
         Throwable var5 = null;

         Class1806 var10;
         try {
            IntBuffer var6 = var4.mallocInt(1);
            IntBuffer var7 = var4.mallocInt(1);
            IntBuffer var8 = var4.mallocInt(1);
            ByteBuffer var9 = STBImage.stbi_load_from_memory(var1, var6, var7, var8, var0 == null ? 0 : Class2237.method8983(var0));
            if (var9 == null) {
               throw new IOException("Could not load image: " + STBImage.stbi_failure_reason());
            }

            var10 = new Class1806(var0 == null ? Class2237.method8984(var8.get(0)) : var0, var6.get(0), var7.get(0), true, MemoryUtil.memAddress(var9));
            Class9323.method35238(var10);
         } catch (Throwable var18) {
            var5 = var18;
            throw var18;
         } finally {
            if (var4 != null) {
               if (var5 != null) {
                  try {
                     var4.close();
                  } catch (Throwable var17) {
                     var5.addSuppressed(var17);
                  }
               } else {
                  var4.close();
               }
            }
         }

         return var10;
      }
   }

   public static void method7883(boolean var0) {
      RenderSystem.assertThread(RenderSystem::method27804);
      if (!var0) {
         GlStateManager.method23808(3553, 10242, 10497);
         GlStateManager.method23808(3553, 10243, 10497);
      } else {
         GlStateManager.method23808(3553, 10242, 33071);
         GlStateManager.method23808(3553, 10243, 33071);
      }
   }

   public static void method7884(boolean var0, boolean var1) {
      RenderSystem.assertThread(RenderSystem::method27804);
      if (!var0) {
         int var4 = Class7944.method26801();
         GlStateManager.method23808(3553, 10241, !var1 ? 9728 : var4);
         GlStateManager.method23808(3553, 10240, 9728);
      } else {
         GlStateManager.method23808(3553, 10241, !var1 ? 9729 : 9987);
         GlStateManager.method23808(3553, 10240, 9729);
      }
   }

   private void method7885() {
      if (this.field9728 == 0L) {
         throw new IllegalStateException("Image is not allocated.");
      }
   }

   @Override
   public void close() {
      if (this.field9728 != 0L) {
         if (!this.field9727) {
            MemoryUtil.nmemFree(this.field9728);
         } else {
            STBImage.nstbi_image_free(this.field9728);
         }

         Class9323.method35239(this);
      }

      this.field9728 = 0L;
   }

   public int method7886() {
      return this.field9725;
   }

   public int method7887() {
      return this.field9726;
   }

   public Class2237 method7888() {
      return this.field9724;
   }

   public int method7889(int var1, int var2) {
      if (this.field9724 == Class2237.field14626) {
         if (var1 >= 0 && var2 >= 0 && var1 < this.field9725 && var2 < this.field9726) {
            this.method7885();
            long var5 = (long)((var1 + var2 * this.field9725) * 4);
            return MemoryUtil.memGetInt(this.field9728 + var5);
         } else {
            throw new IllegalArgumentException(String.format("(%s, %s) outside of image bounds (%s, %s)", var1, var2, this.field9725, this.field9726));
         }
      } else {
         throw new IllegalArgumentException(String.format("getPixelRGBA only works on RGBA images; have %s", this.field9724));
      }
   }

   public void method7890(int var1, int var2, int var3) {
      if (this.field9724 == Class2237.field14626) {
         if (var1 >= 0 && var2 >= 0 && var1 < this.field9725 && var2 < this.field9726) {
            this.method7885();
            long var6 = (long)((var1 + var2 * this.field9725) * 4);
            MemoryUtil.memPutInt(this.field9728 + var6, var3);
         } else {
            throw new IllegalArgumentException(String.format("(%s, %s) outside of image bounds (%s, %s)", var1, var2, this.field9725, this.field9726));
         }
      } else {
         throw new IllegalArgumentException(String.format("getPixelRGBA only works on RGBA images; have %s", this.field9724));
      }
   }

   public byte method7891(int var1, int var2) {
      if (this.field9724.method8979()) {
         if (var1 >= 0 && var2 >= 0 && var1 < this.field9725 && var2 < this.field9726) {
            int var5 = (var1 + var2 * this.field9725) * this.field9724.method8973() + this.field9724.method8980() / 8;
            return MemoryUtil.memGetByte(this.field9728 + (long)var5);
         } else {
            throw new IllegalArgumentException(String.format("(%s, %s) outside of image bounds (%s, %s)", var1, var2, this.field9725, this.field9726));
         }
      } else {
         throw new IllegalArgumentException(String.format("no luminance or alpha in %s", this.field9724));
      }
   }

   @Deprecated
   public int[] method7892() {
      if (this.field9724 != Class2237.field14626) {
         throw new UnsupportedOperationException("can only call makePixelArray for RGBA images.");
      } else {
         this.method7885();
         int[] var3 = new int[this.method7886() * this.method7887()];

         for (int var4 = 0; var4 < this.method7887(); var4++) {
            for (int var5 = 0; var5 < this.method7886(); var5++) {
               int var6 = this.method7889(var5, var4);
               int var7 = method7910(var6);
               int var8 = method7913(var6);
               int var9 = method7912(var6);
               int var10 = method7911(var6);
               int var11 = var7 << 24 | var10 << 16 | var9 << 8 | var8;
               var3[var5 + var4 * this.method7886()] = var11;
            }
         }

         return var3;
      }
   }

   public void method7893(int var1, int var2, int var3, boolean var4) {
      this.method7894(var1, var2, var3, 0, 0, this.field9725, this.field9726, false, var4);
   }

   public void method7894(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, boolean var9) {
      this.method7895(var1, var2, var3, var4, var5, var6, var7, false, false, var8, var9);
   }

   public void method7895(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, boolean var9, boolean var10, boolean var11) {
      if (RenderSystem.method27804()) {
         this.method7896(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
      } else {
         RenderSystem.method27810(() -> this.method7896(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11));
      }
   }

   private void method7896(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, boolean var9, boolean var10, boolean var11) {
      RenderSystem.assertThread(RenderSystem::method27804);
      this.method7885();
      method7884(var8, var10);
      method7883(var9);
      if (var6 != this.method7886()) {
         GlStateManager.method23856(3314, this.method7886());
      } else {
         GlStateManager.method23856(3314, 0);
      }

      GlStateManager.method23856(3316, var4);
      GlStateManager.method23856(3315, var5);
      this.field9724.method8975();
      GlStateManager.method23816(3553, var1, var2, var3, var6, var7, this.field9724.method8976(), 5121, this.field9728);
      if (var11) {
         this.close();
      }
   }

   public void method7897(int var1, boolean var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      this.method7885();
      this.field9724.method8974();
      GlStateManager.method23817(3553, var1, this.field9724.method8976(), 5121, this.field9728);
      if (var2 && this.field9724.method8977()) {
         for (int var5 = 0; var5 < this.method7887(); var5++) {
            for (int var6 = 0; var6 < this.method7886(); var6++) {
               this.method7890(var6, var5, this.method7889(var6, var5) | 255 << this.field9724.method8978());
            }
         }
      }
   }

   public void method7898(File var1) throws IOException {
      this.method7900(var1.toPath());
   }

   public void method7899(STBTTFontinfo var1, int var2, int var3, int var4, float var5, float var6, float var7, float var8, int var9, int var10) {
      if (var9 < 0 || var9 + var3 > this.method7886() || var10 < 0 || var10 + var4 > this.method7887()) {
         throw new IllegalArgumentException(
            String.format("Out of bounds: start: (%s, %s) (size: %sx%s); size: %sx%s", var9, var10, var3, var4, this.method7886(), this.method7887())
         );
      } else if (this.field9724.method8973() == 1) {
         STBTruetype.nstbtt_MakeGlyphBitmapSubpixel(
            var1.address(), this.field9728 + (long)var9 + (long)(var10 * this.method7886()), var3, var4, this.method7886(), var5, var6, var7, var8, var2
         );
      } else {
         throw new IllegalArgumentException("Can only write fonts into 1-component images.");
      }
   }

   public void method7900(Path var1) throws IOException {
      if (!this.field9724.method8981()) {
         throw new UnsupportedOperationException("Don't know how to write format " + this.field9724);
      } else {
         this.method7885();

         try (SeekableByteChannel var4 = Files.newByteChannel(var1, field9723)) {
            if (!this.method7902(var4)) {
               throw new IOException("Could not write image to the PNG file \"" + var1.toAbsolutePath() + "\": " + STBImage.stbi_failure_reason());
            }
         }
      }
   }

   public byte[] method7901() throws IOException {
      byte[] var7;
      try (
         ByteArrayOutputStream var3 = new ByteArrayOutputStream();
         WritableByteChannel var5 = Channels.newChannel(var3);
      ) {
         if (!this.method7902(var5)) {
            throw new IOException("Could not write image to byte array: " + STBImage.stbi_failure_reason());
         }

         var7 = var3.toByteArray();
      }

      return var7;
   }

   private boolean method7902(WritableByteChannel var1) throws IOException {
      Class9744 var4 = new Class9744(var1);

      boolean var6;
      try {
         int var5 = Math.min(this.method7887(), Integer.MAX_VALUE / this.method7886() / this.field9724.method8973());
         if (var5 < this.method7887()) {
            field9722.warn("Dropping image height from {} to {} to fit the size into 32-bit signed int", this.method7887(), var5);
         }

         if (STBImageWrite.nstbi_write_png_to_func(var4.address(), 0L, this.method7886(), var5, this.field9724.method8973(), this.field9728, 0) != 0) {
            var4.method38211();
            return true;
         }

         var6 = false;
      } finally {
         var4.free();
      }

      return var6;
   }

   public void method7903(Class1806 var1) {
      if (var1.method7888() != this.field9724) {
         throw new UnsupportedOperationException("Image formats don't match.");
      } else {
         int var4 = this.field9724.method8973();
         this.method7885();
         var1.method7885();
         if (this.field9725 != var1.field9725) {
            int var5 = Math.min(this.method7886(), var1.method7886());
            int var6 = Math.min(this.method7887(), var1.method7887());

            for (int var7 = 0; var7 < var6; var7++) {
               int var8 = var7 * var1.method7886() * var4;
               int var9 = var7 * this.method7886() * var4;
               MemoryUtil.memCopy(var1.field9728 + (long)var8, this.field9728 + (long)var9, (long)var5 * (long)var4);
            }
         } else {
            MemoryUtil.memCopy(var1.field9728, this.field9728, Math.min(this.field9729, var1.field9729));
         }
      }
   }

   public void method7904(int var1, int var2, int var3, int var4, int var5) {
      for (int var8 = var2; var8 < var2 + var4; var8++) {
         for (int var9 = var1; var9 < var1 + var3; var9++) {
            this.method7890(var9, var8, var5);
         }
      }
   }

   public void method7905(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
      for (int var11 = 0; var11 < var6; var11++) {
         for (int var12 = 0; var12 < var5; var12++) {
            int var13 = !var7 ? var12 : var5 - 1 - var12;
            int var14 = !var8 ? var11 : var6 - 1 - var11;
            int var15 = this.method7889(var1 + var12, var2 + var11);
            this.method7890(var1 + var3 + var13, var2 + var4 + var14, var15);
         }
      }
   }

   public void method7906() {
      this.method7885();
      MemoryStack var3 = MemoryStack.stackPush();
      Throwable var4 = null;

      try {
         int var5 = this.field9724.method8973();
         int var6 = this.method7886() * var5;
         long var7 = var3.nmalloc(var6);

         for (int var9 = 0; var9 < this.method7887() / 2; var9++) {
            int var10 = var9 * this.method7886() * var5;
            int var11 = (this.method7887() - 1 - var9) * this.method7886() * var5;
            MemoryUtil.memCopy(this.field9728 + (long)var10, var7, (long)var6);
            MemoryUtil.memCopy(this.field9728 + (long)var11, this.field9728 + (long)var10, (long)var6);
            MemoryUtil.memCopy(var7, this.field9728 + (long)var11, (long)var6);
         }
      } catch (Throwable var19) {
         var4 = var19;
         throw var19;
      } finally {
         if (var3 != null) {
            if (var4 != null) {
               try {
                  var3.close();
               } catch (Throwable var18) {
                  var4.addSuppressed(var18);
               }
            } else {
               var3.close();
            }
         }
      }
   }

   public void method7907(int var1, int var2, int var3, int var4, Class1806 var5) {
      this.method7885();
      if (var5.method7888() == this.field9724) {
         int var8 = this.field9724.method8973();
         STBImageResize.nstbir_resize_uint8(
            this.field9728 + (long)((var1 + var2 * this.method7886()) * var8),
            var3,
            var4,
            this.method7886() * var8,
            var5.field9728,
            var5.method7886(),
            var5.method7887(),
            0,
            var8
         );
      } else {
         throw new UnsupportedOperationException("resizeSubRectTo only works for images of the same format.");
      }
   }

   public void method7908() {
      Class8317.method29100(this.field9728);
   }

   public static Class1806 method7909(String var0) throws IOException {
      byte[] var3 = Base64.getDecoder().decode(var0.replaceAll("\n", "").getBytes(Charsets.UTF_8));
      MemoryStack var4 = MemoryStack.stackPush();
      Throwable var5 = null;

      Class1806 var7;
      try {
         ByteBuffer var6 = var4.malloc(var3.length);
         var6.put(var3);
         ((Buffer)var6).rewind();
         var7 = method7881(var6);
      } catch (Throwable var15) {
         var5 = var15;
         throw var15;
      } finally {
         if (var4 != null) {
            if (var5 != null) {
               try {
                  var4.close();
               } catch (Throwable var14) {
                  var5.addSuppressed(var14);
               }
            } else {
               var4.close();
            }
         }
      }

      return var7;
   }

   public static int method7910(int var0) {
      return var0 >> 24 & 0xFF;
   }

   public static int method7911(int var0) {
      return var0 >> 0 & 0xFF;
   }

   public static int method7912(int var0) {
      return var0 >> 8 & 0xFF;
   }

   public static int method7913(int var0) {
      return var0 >> 16 & 0xFF;
   }

   public static int method7914(int var0, int var1, int var2, int var3) {
      return (var0 & 0xFF) << 24 | (var1 & 0xFF) << 16 | (var2 & 0xFF) << 8 | (var3 & 0xFF) << 0;
   }

   public IntBuffer method7915() {
      if (this.field9724 == Class2237.field14626) {
         this.method7885();
         return MemoryUtil.memIntBuffer(this.field9728, (int)this.field9729);
      } else {
         throw new IllegalArgumentException(String.format("getBuffer only works on RGBA images; have %s", this.field9724));
      }
   }

   public void method7916(int var1) {
      if (this.field9724 == Class2237.field14626) {
         this.method7885();
         MemoryUtil.memSet(this.field9728, var1, this.field9729);
      } else {
         throw new IllegalArgumentException(String.format("getBuffer only works on RGBA images; have %s", this.field9724));
      }
   }

   public long method7917() {
      return this.field9729;
   }
}
