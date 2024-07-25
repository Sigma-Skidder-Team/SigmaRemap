package remapped;

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

public final class class_5797 implements AutoCloseable {
   private static final Logger field_29282 = LogManager.getLogger();
   private static final Set<StandardOpenOption> field_29280 = EnumSet.<StandardOpenOption>of(
      StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING
   );
   private final class_5810 field_29284;
   private final int field_29285;
   private final int field_29283;
   private final boolean field_29286;
   private long field_29281;
   private final long field_29278;

   public class_5797(int var1, int var2, boolean var3) {
      this(class_5810.field_29333, var1, var2, var3);
   }

   public class_5797(class_5810 var1, int var2, int var3, boolean var4) {
      this.field_29284 = var1;
      this.field_29285 = var2;
      this.field_29283 = var3;
      this.field_29278 = (long)var2 * (long)var3 * (long)var1.method_26306();
      this.field_29286 = false;
      if (!var4) {
         this.field_29281 = MemoryUtil.nmemAlloc(this.field_29278);
      } else {
         this.field_29281 = MemoryUtil.nmemCalloc(1L, this.field_29278);
      }

      this.method_26254();
      class_7949.method_35982(this);
   }

   private class_5797(class_5810 var1, int var2, int var3, boolean var4, long var5) {
      this.field_29284 = var1;
      this.field_29285 = var2;
      this.field_29283 = var3;
      this.field_29286 = var4;
      this.field_29281 = var5;
      this.field_29278 = (long)(var2 * var3 * var1.method_26306());
   }

   @Override
   public String toString() {
      return "NativeImage["
         + this.field_29284
         + " "
         + this.field_29285
         + "x"
         + this.field_29283
         + "@"
         + this.field_29281
         + (!this.field_29286 ? "N" : "S")
         + "]";
   }

   public static class_5797 method_26230(InputStream var0) throws IOException {
      return method_26232(class_5810.field_29333, var0);
   }

   public static class_5797 method_26232(class_5810 var0, InputStream var1) throws IOException {
      ByteBuffer var4 = null;

      class_5797 var5;
      try {
         var4 = class_4970.method_22844(var1);
         ((Buffer)var4).rewind();
         var5 = method_26233(var0, var4);
      } finally {
         MemoryUtil.memFree(var4);
         IOUtils.closeQuietly(var1);
      }

      return var5;
   }

   public static class_5797 method_26231(ByteBuffer var0) throws IOException {
      return method_26233(class_5810.field_29333, var0);
   }

   public static class_5797 method_26233(class_5810 var0, ByteBuffer var1) throws IOException {
      if (var0 != null && !var0.method_26311()) {
         throw new UnsupportedOperationException("Don't know how to read format " + var0);
      } else if (MemoryUtil.memAddress(var1) == 0L) {
         throw new IllegalArgumentException("Invalid buffer");
      } else {
         MemoryStack var4 = MemoryStack.stackPush();
         Throwable var5 = null;

         class_5797 var10;
         try {
            IntBuffer var6 = var4.mallocInt(1);
            IntBuffer var7 = var4.mallocInt(1);
            IntBuffer var8 = var4.mallocInt(1);
            ByteBuffer var9 = STBImage.stbi_load_from_memory(var1, var6, var7, var8, var0 == null ? 0 : class_5810.method_26313(var0));
            if (var9 == null) {
               throw new IOException("Could not load image: " + STBImage.stbi_failure_reason());
            }

            var10 = new class_5797(var0 == null ? class_5810.method_26315(var8.get(0)) : var0, var6.get(0), var7.get(0), true, MemoryUtil.memAddress(var9));
            class_7949.method_35982(var10);
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

   public static void method_26227(boolean var0) {
      RenderSystem.assertThread(RenderSystem::method_16440);
      if (!var0) {
         GlStateManager.method_8879(3553, 10242, 10497);
         GlStateManager.method_8879(3553, 10243, 10497);
      } else {
         GlStateManager.method_8879(3553, 10242, 33071);
         GlStateManager.method_8879(3553, 10243, 33071);
      }
   }

   public static void method_26234(boolean var0, boolean var1) {
      RenderSystem.assertThread(RenderSystem::method_16440);
      if (!var0) {
         int var4 = Config.method_14392();
         GlStateManager.method_8879(3553, 10241, !var1 ? 9728 : var4);
         GlStateManager.method_8879(3553, 10240, 9728);
      } else {
         GlStateManager.method_8879(3553, 10241, !var1 ? 9729 : 9987);
         GlStateManager.method_8879(3553, 10240, 9729);
      }
   }

   private void method_26254() {
      if (this.field_29281 == 0L) {
         throw new IllegalStateException("Image is not allocated.");
      }
   }

   @Override
   public void close() {
      if (this.field_29281 != 0L) {
         if (!this.field_29286) {
            MemoryUtil.nmemFree(this.field_29281);
         } else {
            STBImage.nstbi_image_free(this.field_29281);
         }

         class_7949.method_35985(this);
      }

      this.field_29281 = 0L;
   }

   public int method_26228() {
      return this.field_29285;
   }

   public int method_26253() {
      return this.field_29283;
   }

   public class_5810 method_26262() {
      return this.field_29284;
   }

   public int method_26252(int var1, int var2) {
      if (this.field_29284 == class_5810.field_29333) {
         if (var1 >= 0 && var2 >= 0 && var1 < this.field_29285 && var2 < this.field_29283) {
            this.method_26254();
            long var5 = (long)((var1 + var2 * this.field_29285) * 4);
            return MemoryUtil.memGetInt(this.field_29281 + var5);
         } else {
            throw new IllegalArgumentException(String.format("(%s, %s) outside of image bounds (%s, %s)", var1, var2, this.field_29285, this.field_29283));
         }
      } else {
         throw new IllegalArgumentException(String.format("getPixelRGBA only works on RGBA images; have %s", this.field_29284));
      }
   }

   public void method_26242(int var1, int var2, int var3) {
      if (this.field_29284 == class_5810.field_29333) {
         if (var1 >= 0 && var2 >= 0 && var1 < this.field_29285 && var2 < this.field_29283) {
            this.method_26254();
            long var6 = (long)((var1 + var2 * this.field_29285) * 4);
            MemoryUtil.memPutInt(this.field_29281 + var6, var3);
         } else {
            throw new IllegalArgumentException(String.format("(%s, %s) outside of image bounds (%s, %s)", var1, var2, this.field_29285, this.field_29283));
         }
      } else {
         throw new IllegalArgumentException(String.format("getPixelRGBA only works on RGBA images; have %s", this.field_29284));
      }
   }

   public byte method_26265(int var1, int var2) {
      if (this.field_29284.method_26310()) {
         if (var1 >= 0 && var2 >= 0 && var1 < this.field_29285 && var2 < this.field_29283) {
            int var5 = (var1 + var2 * this.field_29285) * this.field_29284.method_26306() + this.field_29284.method_26303() / 8;
            return MemoryUtil.memGetByte(this.field_29281 + (long)var5);
         } else {
            throw new IllegalArgumentException(String.format("(%s, %s) outside of image bounds (%s, %s)", var1, var2, this.field_29285, this.field_29283));
         }
      } else {
         throw new IllegalArgumentException(String.format("no luminance or alpha in %s", this.field_29284));
      }
   }

   @Deprecated
   public int[] method_26246() {
      if (this.field_29284 != class_5810.field_29333) {
         throw new UnsupportedOperationException("can only call makePixelArray for RGBA images.");
      } else {
         this.method_26254();
         int[] var3 = new int[this.method_26228() * this.method_26253()];

         for (int var4 = 0; var4 < this.method_26253(); var4++) {
            for (int var5 = 0; var5 < this.method_26228(); var5++) {
               int var6 = this.method_26252(var5, var4);
               int var7 = method_26235(var6);
               int var8 = method_26264(var6);
               int var9 = method_26240(var6);
               int var10 = method_26255(var6);
               int var11 = var7 << 24 | var10 << 16 | var9 << 8 | var8;
               var3[var5 + var4 * this.method_26228()] = var11;
            }
         }

         return var3;
      }
   }

   public void method_26260(int var1, int var2, int var3, boolean var4) {
      this.method_26258(var1, var2, var3, 0, 0, this.field_29285, this.field_29283, false, var4);
   }

   public void method_26258(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, boolean var9) {
      this.method_26259(var1, var2, var3, var4, var5, var6, var7, false, false, var8, var9);
   }

   public void method_26259(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, boolean var9, boolean var10, boolean var11) {
      if (RenderSystem.method_16440()) {
         this.method_26247(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
      } else {
         RenderSystem.method_16474(() -> this.method_26247(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11));
      }
   }

   private void method_26247(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, boolean var9, boolean var10, boolean var11) {
      RenderSystem.assertThread(RenderSystem::method_16440);
      this.method_26254();
      method_26234(var8, var10);
      method_26227(var9);
      if (var6 != this.method_26228()) {
         GlStateManager.method_8763(3314, this.method_26228());
      } else {
         GlStateManager.method_8763(3314, 0);
      }

      GlStateManager.method_8763(3316, var4);
      GlStateManager.method_8763(3315, var5);
      this.field_29284.method_26314();
      GlStateManager.method_8776(3553, var1, var2, var3, var6, var7, this.field_29284.method_26312(), 5121, this.field_29281);
      if (var11) {
         this.close();
      }
   }

   public void method_26229(int var1, boolean var2) {
      RenderSystem.assertThread(RenderSystem::method_16366);
      this.method_26254();
      this.field_29284.method_26308();
      GlStateManager.method_8926(3553, var1, this.field_29284.method_26312(), 5121, this.field_29281);
      if (var2 && this.field_29284.method_26305()) {
         for (int var5 = 0; var5 < this.method_26253(); var5++) {
            for (int var6 = 0; var6 < this.method_26228(); var6++) {
               this.method_26242(var6, var5, this.method_26252(var6, var5) | 255 << this.field_29284.method_26309());
            }
         }
      }
   }

   public void method_26237(File var1) throws IOException {
      this.method_26239(var1.toPath());
   }

   public void method_26261(STBTTFontinfo var1, int var2, int var3, int var4, float var5, float var6, float var7, float var8, int var9, int var10) {
      if (var9 < 0 || var9 + var3 > this.method_26228() || var10 < 0 || var10 + var4 > this.method_26253()) {
         throw new IllegalArgumentException(
            String.format("Out of bounds: start: (%s, %s) (size: %sx%s); size: %sx%s", var9, var10, var3, var4, this.method_26228(), this.method_26253())
         );
      } else if (this.field_29284.method_26306() == 1) {
         STBTruetype.nstbtt_MakeGlyphBitmapSubpixel(
            var1.address(), this.field_29281 + (long)var9 + (long)(var10 * this.method_26228()), var3, var4, this.method_26228(), var5, var6, var7, var8, var2
         );
      } else {
         throw new IllegalArgumentException("Can only write fonts into 1-component images.");
      }
   }

   public void method_26239(Path var1) throws IOException {
      if (!this.field_29284.method_26311()) {
         throw new UnsupportedOperationException("Don't know how to write format " + this.field_29284);
      } else {
         this.method_26254();

         try (SeekableByteChannel var4 = Files.newByteChannel(var1, field_29280)) {
            if (!this.method_26238(var4)) {
               throw new IOException("Could not write image to the PNG file \"" + var1.toAbsolutePath() + "\": " + STBImage.stbi_failure_reason());
            }
         }
      }
   }

   public byte[] method_26243() throws IOException {
      byte[] var7;
      try (
         ByteArrayOutputStream var3 = new ByteArrayOutputStream();
         WritableByteChannel var5 = Channels.newChannel(var3);
      ) {
         if (!this.method_26238(var5)) {
            throw new IOException("Could not write image to byte array: " + STBImage.stbi_failure_reason());
         }

         var7 = var3.toByteArray();
      }

      return var7;
   }

   private boolean method_26238(WritableByteChannel var1) throws IOException {
      class_9548 var4 = new class_9548(var1, null);

      boolean var6;
      try {
         int var5 = Math.min(this.method_26253(), Integer.MAX_VALUE / this.method_26228() / this.field_29284.method_26306());
         if (var5 < this.method_26253()) {
            field_29282.warn("Dropping image height from {} to {} to fit the size into 32-bit signed int", this.method_26253(), var5);
         }

         if (STBImageWrite.nstbi_write_png_to_func(var4.address(), 0L, this.method_26228(), var5, this.field_29284.method_26306(), this.field_29281, 0) != 0) {
            var4.method_44065();
            return true;
         }

         var6 = false;
      } finally {
         var4.free();
      }

      return var6;
   }

   public void method_26250(class_5797 var1) {
      if (var1.method_26262() != this.field_29284) {
         throw new UnsupportedOperationException("Image formats don't match.");
      } else {
         int var4 = this.field_29284.method_26306();
         this.method_26254();
         var1.method_26254();
         if (this.field_29285 != var1.field_29285) {
            int var5 = Math.min(this.method_26228(), var1.method_26228());
            int var6 = Math.min(this.method_26253(), var1.method_26253());

            for (int var7 = 0; var7 < var6; var7++) {
               int var8 = var7 * var1.method_26228() * var4;
               int var9 = var7 * this.method_26228() * var4;
               MemoryUtil.memCopy(var1.field_29281 + (long)var8, this.field_29281 + (long)var9, (long)var5 * (long)var4);
            }
         } else {
            MemoryUtil.memCopy(var1.field_29281, this.field_29281, Math.min(this.field_29278, var1.field_29278));
         }
      }
   }

   public void method_26226(int var1, int var2, int var3, int var4, int var5) {
      for (int var8 = var2; var8 < var2 + var4; var8++) {
         for (int var9 = var1; var9 < var1 + var3; var9++) {
            this.method_26242(var9, var8, var5);
         }
      }
   }

   public void method_26249(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
      for (int var11 = 0; var11 < var6; var11++) {
         for (int var12 = 0; var12 < var5; var12++) {
            int var13 = !var7 ? var12 : var5 - 1 - var12;
            int var14 = !var8 ? var11 : var6 - 1 - var11;
            int var15 = this.method_26252(var1 + var12, var2 + var11);
            this.method_26242(var1 + var3 + var13, var2 + var4 + var14, var15);
         }
      }
   }

   public void method_26256() {
      this.method_26254();
      MemoryStack var3 = MemoryStack.stackPush();
      Throwable var4 = null;

      try {
         int var5 = this.field_29284.method_26306();
         int var6 = this.method_26228() * var5;
         long var7 = var3.nmalloc(var6);

         for (int var9 = 0; var9 < this.method_26253() / 2; var9++) {
            int var10 = var9 * this.method_26228() * var5;
            int var11 = (this.method_26253() - 1 - var9) * this.method_26228() * var5;
            MemoryUtil.memCopy(this.field_29281 + (long)var10, var7, (long)var6);
            MemoryUtil.memCopy(this.field_29281 + (long)var11, this.field_29281 + (long)var10, (long)var6);
            MemoryUtil.memCopy(var7, this.field_29281 + (long)var11, (long)var6);
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

   public void method_26248(int var1, int var2, int var3, int var4, class_5797 var5) {
      this.method_26254();
      if (var5.method_26262() == this.field_29284) {
         int var8 = this.field_29284.method_26306();
         STBImageResize.nstbir_resize_uint8(
            this.field_29281 + (long)((var1 + var2 * this.method_26228()) * var8),
            var3,
            var4,
            this.method_26228() * var8,
            var5.field_29281,
            var5.method_26228(),
            var5.method_26253(),
            0,
            var8
         );
      } else {
         throw new UnsupportedOperationException("resizeSubRectTo only works for images of the same format.");
      }
   }

   public void method_26245() {
      class_4208.method_19578(this.field_29281);
   }

   public static class_5797 method_26257(String var0) throws IOException {
      byte[] var3 = Base64.getDecoder().decode(var0.replaceAll("\n", "").getBytes(Charsets.UTF_8));
      MemoryStack var4 = MemoryStack.stackPush();
      Throwable var5 = null;

      class_5797 var7;
      try {
         ByteBuffer var6 = var4.malloc(var3.length);
         var6.put(var3);
         ((Buffer)var6).rewind();
         var7 = method_26231(var6);
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

   public static int method_26235(int var0) {
      return var0 >> 24 & 0xFF;
   }

   public static int method_26255(int var0) {
      return var0 >> 0 & 0xFF;
   }

   public static int method_26240(int var0) {
      return var0 >> 8 & 0xFF;
   }

   public static int method_26264(int var0) {
      return var0 >> 16 & 0xFF;
   }

   public static int method_26244(int var0, int var1, int var2, int var3) {
      return (var0 & 0xFF) << 24 | (var1 & 0xFF) << 16 | (var2 & 0xFF) << 8 | (var3 & 0xFF) << 0;
   }

   public IntBuffer method_26251() {
      if (this.field_29284 == class_5810.field_29333) {
         this.method_26254();
         return MemoryUtil.memIntBuffer(this.field_29281, (int)this.field_29278);
      } else {
         throw new IllegalArgumentException(String.format("getBuffer only works on RGBA images; have %s", this.field_29284));
      }
   }

   public void method_26241(int var1) {
      if (this.field_29284 == class_5810.field_29333) {
         this.method_26254();
         MemoryUtil.memSet(this.field_29281, var1, this.field_29278);
      } else {
         throw new IllegalArgumentException(String.format("getBuffer only works on RGBA images; have %s", this.field_29284));
      }
   }

   public long method_26263() {
      return this.field_29278;
   }
}
