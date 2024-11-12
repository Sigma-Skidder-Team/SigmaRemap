package net.minecraft.client.renderer.texture;

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

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import mapped.Class9323;
import mapped.Class9744;
import net.minecraft.client.util.LWJGLMemoryUntracker;
import net.optifine.Config;
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

public final class NativeImage implements AutoCloseable {
   private static final Logger LOGGER = LogManager.getLogger();
   private static final Set<StandardOpenOption> OPEN_OPTIONS = EnumSet.<StandardOpenOption>of(
      StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING
   );
   private final PixelFormat pixelFormat;
   private final int width;
   private final int height;
   private final boolean stbiPointer;
   private long imagePointer;
   private final long size;

   public NativeImage(int var1, int var2, boolean var3) {
      this(PixelFormat.field14626, var1, var2, var3);
   }

   public NativeImage(PixelFormat var1, int var2, int var3, boolean var4) {
      this.pixelFormat = var1;
      this.width = var2;
      this.height = var3;
      this.size = (long)var2 * (long)var3 * (long)var1.getPixelSize();
      this.stbiPointer = false;
      if (!var4) {
         this.imagePointer = MemoryUtil.nmemAlloc(this.size);
      } else {
         this.imagePointer = MemoryUtil.nmemCalloc(1L, this.size);
      }

      this.checkImage();
      Class9323.method35238(this);
   }

   private NativeImage(PixelFormat var1, int var2, int var3, boolean var4, long var5) {
      this.pixelFormat = var1;
      this.width = var2;
      this.height = var3;
      this.stbiPointer = var4;
      this.imagePointer = var5;
      this.size = (long)(var2 * var3 * var1.getPixelSize());
   }

   @Override
   public String toString() {
      return "NativeImage[" + this.pixelFormat + " " + this.width + "x" + this.height + "@" + this.imagePointer + (!this.stbiPointer ? "N" : "S") + "]";
   }

   public static NativeImage method7879(InputStream var0) throws IOException {
      return method7880(PixelFormat.field14626, var0);
   }

   public static NativeImage method7880(PixelFormat var0, InputStream var1) throws IOException {
      ByteBuffer var4 = null;

      NativeImage var5;
      try {
         var4 = TextureUtil.method30373(var1);
         ((Buffer)var4).rewind();
         var5 = method7882(var0, var4);
      } finally {
         MemoryUtil.memFree(var4);
         IOUtils.closeQuietly(var1);
      }

      return var5;
   }

   public static NativeImage method7881(ByteBuffer var0) throws IOException {
      return method7882(PixelFormat.field14626, var0);
   }

   public static NativeImage method7882(PixelFormat var0, ByteBuffer var1) throws IOException {
      if (var0 != null && !var0.method8981()) {
         throw new UnsupportedOperationException("Don't know how to read format " + var0);
      } else if (MemoryUtil.memAddress(var1) == 0L) {
         throw new IllegalArgumentException("Invalid buffer");
      } else {
         MemoryStack var4 = MemoryStack.stackPush();
         Throwable var5 = null;

         NativeImage var10;
         try {
            IntBuffer var6 = var4.mallocInt(1);
            IntBuffer var7 = var4.mallocInt(1);
            IntBuffer var8 = var4.mallocInt(1);
            ByteBuffer var9 = STBImage.stbi_load_from_memory(var1, var6, var7, var8, var0 == null ? 0 : PixelFormat.method8983(var0));
            if (var9 == null) {
               throw new IOException("Could not load image: " + STBImage.stbi_failure_reason());
            }

            var10 = new NativeImage(var0 == null ? PixelFormat.method8984(var8.get(0)) : var0, var6.get(0), var7.get(0), true, MemoryUtil.memAddress(var9));
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
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      if (!var0) {
         GlStateManager.texParameter(3553, 10242, 10497);
         GlStateManager.texParameter(3553, 10243, 10497);
      } else {
         GlStateManager.texParameter(3553, 10242, 33071);
         GlStateManager.texParameter(3553, 10243, 33071);
      }
   }

   public static void method7884(boolean var0, boolean var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      if (!var0) {
         int var4 = Config.method26801();
         GlStateManager.texParameter(3553, 10241, !var1 ? 9728 : var4);
         GlStateManager.texParameter(3553, 10240, 9728);
      } else {
         GlStateManager.texParameter(3553, 10241, !var1 ? 9729 : 9987);
         GlStateManager.texParameter(3553, 10240, 9729);
      }
   }

   private void checkImage() {
      if (this.imagePointer == 0L) {
         throw new IllegalStateException("Image is not allocated.");
      }
   }

   @Override
   public void close() {
      if (this.imagePointer != 0L) {
         if (!this.stbiPointer) {
            MemoryUtil.nmemFree(this.imagePointer);
         } else {
            STBImage.nstbi_image_free(this.imagePointer);
         }

         Class9323.method35239(this);
      }

      this.imagePointer = 0L;
   }

   public int method7886() {
      return this.width;
   }

   public int method7887() {
      return this.height;
   }

   public PixelFormat method7888() {
      return this.pixelFormat;
   }

   public int method7889(int var1, int var2) {
      if (this.pixelFormat == PixelFormat.field14626) {
         if (var1 >= 0 && var2 >= 0 && var1 < this.width && var2 < this.height) {
            this.checkImage();
            long var5 = (long)((var1 + var2 * this.width) * 4);
            return MemoryUtil.memGetInt(this.imagePointer + var5);
         } else {
            throw new IllegalArgumentException(String.format("(%s, %s) outside of image bounds (%s, %s)", var1, var2, this.width, this.height));
         }
      } else {
         throw new IllegalArgumentException(String.format("getPixelRGBA only works on RGBA images; have %s", this.pixelFormat));
      }
   }

   public void method7890(int var1, int var2, int var3) {
      if (this.pixelFormat == PixelFormat.field14626) {
         if (var1 >= 0 && var2 >= 0 && var1 < this.width && var2 < this.height) {
            this.checkImage();
            long var6 = (long)((var1 + var2 * this.width) * 4);
            MemoryUtil.memPutInt(this.imagePointer + var6, var3);
         } else {
            throw new IllegalArgumentException(String.format("(%s, %s) outside of image bounds (%s, %s)", var1, var2, this.width, this.height));
         }
      } else {
         throw new IllegalArgumentException(String.format("getPixelRGBA only works on RGBA images; have %s", this.pixelFormat));
      }
   }

   public byte method7891(int var1, int var2) {
      if (this.pixelFormat.method8979()) {
         if (var1 >= 0 && var2 >= 0 && var1 < this.width && var2 < this.height) {
            int var5 = (var1 + var2 * this.width) * this.pixelFormat.getPixelSize() + this.pixelFormat.method8980() / 8;
            return MemoryUtil.memGetByte(this.imagePointer + (long)var5);
         } else {
            throw new IllegalArgumentException(String.format("(%s, %s) outside of image bounds (%s, %s)", var1, var2, this.width, this.height));
         }
      } else {
         throw new IllegalArgumentException(String.format("no luminance or alpha in %s", this.pixelFormat));
      }
   }

   @Deprecated
   public int[] method7892() {
      if (this.pixelFormat != PixelFormat.field14626) {
         throw new UnsupportedOperationException("can only call makePixelArray for RGBA images.");
      } else {
         this.checkImage();
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
      this.method7894(var1, var2, var3, 0, 0, this.width, this.height, false, var4);
   }

   public void method7894(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, boolean var9) {
      this.method7895(var1, var2, var3, var4, var5, var6, var7, false, false, var8, var9);
   }

   public void method7895(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, boolean var9, boolean var10, boolean var11) {
      if (RenderSystem.isOnRenderThreadOrInit()) {
         this.method7896(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
      } else {
         RenderSystem.recordRenderCall(() -> this.method7896(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11));
      }
   }

   private void method7896(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, boolean var9, boolean var10, boolean var11) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      this.checkImage();
      method7884(var8, var10);
      method7883(var9);
      if (var6 != this.method7886()) {
         GlStateManager.pixelStore(3314, this.method7886());
      } else {
         GlStateManager.pixelStore(3314, 0);
      }

      GlStateManager.pixelStore(3316, var4);
      GlStateManager.pixelStore(3315, var5);
      this.pixelFormat.setGlUnpackAlignment();
      GlStateManager.method23816(3553, var1, var2, var3, var6, var7, this.pixelFormat.getGlFormat(), 5121, this.imagePointer);
      if (var11) {
         this.close();
      }
   }

   public void downloadFromTexture(int var1, boolean var2) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      this.checkImage();
      this.pixelFormat.setGlPackAlignment();
      GlStateManager.method23817(3553, var1, this.pixelFormat.getGlFormat(), 5121, this.imagePointer);
      if (var2 && this.pixelFormat.hasAlpha()) {
         for (int var5 = 0; var5 < this.method7887(); var5++) {
            for (int var6 = 0; var6 < this.method7886(); var6++) {
               this.method7890(var6, var5, this.method7889(var6, var5) | 255 << this.pixelFormat.getOffsetAlpha());
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
      } else if (this.pixelFormat.getPixelSize() == 1) {
         STBTruetype.nstbtt_MakeGlyphBitmapSubpixel(
            var1.address(), this.imagePointer + (long)var9 + (long)(var10 * this.method7886()), var3, var4, this.method7886(), var5, var6, var7, var8, var2
         );
      } else {
         throw new IllegalArgumentException("Can only write fonts into 1-component images.");
      }
   }

   public void method7900(Path var1) throws IOException {
      if (!this.pixelFormat.method8981()) {
         throw new UnsupportedOperationException("Don't know how to write format " + this.pixelFormat);
      } else {
         this.checkImage();

         try (SeekableByteChannel var4 = Files.newByteChannel(var1, OPEN_OPTIONS)) {
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
         int var5 = Math.min(this.method7887(), Integer.MAX_VALUE / this.method7886() / this.pixelFormat.getPixelSize());
         if (var5 < this.method7887()) {
            LOGGER.warn("Dropping image height from {} to {} to fit the size into 32-bit signed int", this.method7887(), var5);
         }

         if (STBImageWrite.nstbi_write_png_to_func(var4.address(), 0L, this.method7886(), var5, this.pixelFormat.getPixelSize(), this.imagePointer, 0) != 0) {
            var4.method38211();
            return true;
         }

         var6 = false;
      } finally {
         var4.free();
      }

      return var6;
   }

   public void method7903(NativeImage var1) {
      if (var1.method7888() != this.pixelFormat) {
         throw new UnsupportedOperationException("Image formats don't match.");
      } else {
         int var4 = this.pixelFormat.getPixelSize();
         this.checkImage();
         var1.checkImage();
         if (this.width != var1.width) {
            int var5 = Math.min(this.method7886(), var1.method7886());
            int var6 = Math.min(this.method7887(), var1.method7887());

            for (int var7 = 0; var7 < var6; var7++) {
               int var8 = var7 * var1.method7886() * var4;
               int var9 = var7 * this.method7886() * var4;
               MemoryUtil.memCopy(var1.imagePointer + (long)var8, this.imagePointer + (long)var9, (long)var5 * (long)var4);
            }
         } else {
            MemoryUtil.memCopy(var1.imagePointer, this.imagePointer, Math.min(this.size, var1.size));
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

   public void flip() {
      this.checkImage();
      MemoryStack var3 = MemoryStack.stackPush();
      Throwable var4 = null;

      try {
         int var5 = this.pixelFormat.getPixelSize();
         int var6 = this.method7886() * var5;
         long var7 = var3.nmalloc(var6);

         for (int var9 = 0; var9 < this.method7887() / 2; var9++) {
            int var10 = var9 * this.method7886() * var5;
            int var11 = (this.method7887() - 1 - var9) * this.method7886() * var5;
            MemoryUtil.memCopy(this.imagePointer + (long)var10, var7, (long)var6);
            MemoryUtil.memCopy(this.imagePointer + (long)var11, this.imagePointer + (long)var10, (long)var6);
            MemoryUtil.memCopy(var7, this.imagePointer + (long)var11, (long)var6);
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

   public void resizeSubRectTo(int var1, int var2, int var3, int var4, NativeImage var5) {
      this.checkImage();
      if (var5.method7888() == this.pixelFormat) {
         int var8 = this.pixelFormat.getPixelSize();
         STBImageResize.nstbir_resize_uint8_srgb(
            this.imagePointer + (long)((var1 + var2 * this.method7886()) * var8),
            var3,
            var4,
            this.method7886() * var8,
            var5.imagePointer,
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
      LWJGLMemoryUntracker.untrack(this.imagePointer);
   }

   public static NativeImage method7909(String var0) throws IOException {
      byte[] var3 = Base64.getDecoder().decode(var0.replaceAll("\n", "").getBytes(Charsets.UTF_8));
      MemoryStack var4 = MemoryStack.stackPush();
      Throwable var5 = null;

      NativeImage var7;
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
      if (this.pixelFormat == PixelFormat.field14626) {
         this.checkImage();
         return MemoryUtil.memIntBuffer(this.imagePointer, (int)this.size);
      } else {
         throw new IllegalArgumentException(String.format("getBuffer only works on RGBA images; have %s", this.pixelFormat));
      }
   }

   public void method7916(int var1) {
      if (this.pixelFormat == PixelFormat.field14626) {
         this.checkImage();
         MemoryUtil.memSet(this.imagePointer, var1, this.size);
      } else {
         throw new IllegalArgumentException(String.format("getBuffer only works on RGBA images; have %s", this.pixelFormat));
      }
   }

   public long getSize() {
      return this.size;
   }

   public void downloadFromFramebuffer(boolean p_downloadFromFramebuffer_1_)
   {
      this.checkImage();
      this.pixelFormat.setGlPackAlignment();

      if (p_downloadFromFramebuffer_1_)
      {
         GlStateManager.pixelTransfer(3357, Float.MAX_VALUE);
      }

      GlStateManager.readPixels(0, 0, this.width, this.height, this.pixelFormat.getGlFormat(), 5121, this.imagePointer);

      if (p_downloadFromFramebuffer_1_)
      {
         GlStateManager.pixelTransfer(3357, 0.0F);
      }
   }

   public enum PixelFormat {
      field14626(4, 6408, true, true, true, false, true, 0, 8, 16, 255, 24, true),
      field14627(3, 6407, true, true, true, false, false, 0, 8, 16, 255, 255, true),
      field14628(2, 6410, false, false, false, true, true, 255, 255, 255, 0, 8, true),
      field14629(1, 6409, false, false, false, true, false, 0, 0, 0, 0, 255, true);

      private final int field14630;
      private final int glFormat;
      private final boolean field14632;
      private final boolean field14633;
      private final boolean field14634;
      private final boolean field14635;
      private final boolean hasAlpha;
      private final int field14637;
      private final int field14638;
      private final int field14639;
      private final int field14640;
      private final int offsetAlpha;
      private final boolean field14642;
      private static final PixelFormat[] field14643 = new PixelFormat[]{field14626, field14627, field14628, field14629};

      private PixelFormat(
         int var3,
         int var4,
         boolean var5,
         boolean var6,
         boolean var7,
         boolean var8,
         boolean var9,
         int var10,
         int var11,
         int var12,
         int var13,
         int var14,
         boolean var15
      ) {
         this.field14630 = var3;
         this.glFormat = var4;
         this.field14632 = var5;
         this.field14633 = var6;
         this.field14634 = var7;
         this.field14635 = var8;
         this.hasAlpha = var9;
         this.field14637 = var10;
         this.field14638 = var11;
         this.field14639 = var12;
         this.field14640 = var13;
         this.offsetAlpha = var14;
         this.field14642 = var15;
      }

      public int getPixelSize() {
         return this.field14630;
      }

      public void setGlPackAlignment() {
         RenderSystem.assertThread(RenderSystem::isOnRenderThread);
         GlStateManager.pixelStore(3333, this.getPixelSize());
      }

      public void setGlUnpackAlignment() {
         RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
         GlStateManager.pixelStore(3317, this.getPixelSize());
      }

      public int getGlFormat() {
         return this.glFormat;
      }

      public boolean hasAlpha() {
         return this.hasAlpha;
      }

      public int getOffsetAlpha() {
         return this.offsetAlpha;
      }

      public boolean method8979() {
         return this.field14635 || this.hasAlpha;
      }

      public int method8980() {
         return !this.field14635 ? this.offsetAlpha : this.field14640;
      }

      public boolean method8981() {
         return this.field14642;
      }

      private static PixelFormat method8982(int var0) {
         switch (var0) {
            case 1:
               return field14629;
            case 2:
               return field14628;
            case 3:
               return field14627;
            case 4:
            default:
               return field14626;
         }
      }

      // $VF: synthetic method
      public static int method8983(PixelFormat var0) {
         return var0.field14630;
      }

      // $VF: synthetic method
      public static PixelFormat method8984(int var0) {
         return method8982(var0);
      }
   }
}
