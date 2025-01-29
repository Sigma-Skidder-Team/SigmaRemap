package mapped;

import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;

import lol.LoadableImageData;
import org.lwjgl.BufferUtils;

public class PNGImageData implements LoadableImageData {
   private int width;
   private int height;
   private int texHeight;
   private int texWidth;
   private PNGDecoder field30160;
   private int bitDepth;
   private ByteBuffer scratch;

   @Override
   public int getDepth() {
      return this.bitDepth;
   }

   @Override
   public ByteBuffer getImageBufferData() {
      return this.scratch;
   }

   @Override
   public int getTexHeight() {
      return this.texHeight;
   }

   @Override
   public int getTexWidth() {
      return this.texWidth;
   }

   @Override
   public ByteBuffer method21467(InputStream var1) throws IOException {
      return this.method21468(var1, false, null);
   }

   @Override
   public ByteBuffer method21468(InputStream var1, boolean var2, int[] var3) throws IOException {
      return this.loadImage(var1, var2, false, var3);
   }

   @Override
   public ByteBuffer loadImage(InputStream fis, boolean flipped, boolean forceAlpha, int[] transparent) throws IOException {
      if (transparent != null) {
         forceAlpha = true;
         throw new IOException("Transparent color not support in custom PNG Decoder");
      } else {
         PNGDecoder decoder = new PNGDecoder(fis);
         if (decoder.isRGB()) {
            this.width = decoder.getWidth();
            this.height = decoder.getHeight();
            this.texWidth = this.get2Fold(this.width);
            this.texHeight = this.get2Fold(this.height);
            int perPixel = !decoder.hasAlpha() ? 3 : 4;
            this.bitDepth = !decoder.hasAlpha() ? 24 : 32;
            this.scratch = BufferUtils.createByteBuffer(this.texWidth * this.texHeight * perPixel);
            decoder.decode(this.scratch, this.texWidth * perPixel, perPixel != 4 ? PNGDecoder.RGB : PNGDecoder.RGBA);
            if (this.height < this.texHeight - 1) {
               int topOffset = (this.texHeight - 1) * this.texWidth * perPixel;
               int bottomOffset = (this.height - 1) * this.texWidth * perPixel;

               for (int x = 0; x < this.texWidth; x++) {
                  for (int i = 0; i < perPixel; i++) {
                     this.scratch.put(topOffset + x + i, this.scratch.get(x + i));
                     this.scratch.put(bottomOffset + this.texWidth * perPixel + x + i, this.scratch.get(bottomOffset + x + i));
                  }
               }
            }

            if (this.width < this.texWidth - 1) {
               for (int y = 0; y < this.texHeight; y++) {
                  for (int i = 0; i < perPixel; i++) {
                     this.scratch.put((y + 1) * this.texWidth * perPixel - perPixel + i, this.scratch.get(y * this.texWidth * perPixel + i));
                     this.scratch
                        .put(
                           y * this.texWidth * perPixel + this.width * perPixel + i,
                           this.scratch.get(y * this.texWidth * perPixel + (this.width - 1) * perPixel + i)
                        );
                  }
               }
            }

            if (!decoder.hasAlpha() && forceAlpha) {
               ByteBuffer temp = BufferUtils.createByteBuffer(this.texWidth * this.texHeight * 4);

               for (int x = 0; x < this.texWidth; x++) {
                  for (int y = 0; y < this.texHeight; y++) {
                     int srcOffset = y * 3 + x * this.texHeight * 3;
                     int dstOffset = y * 4 + x * this.texHeight * 4;
                     temp.put(dstOffset, this.scratch.get(srcOffset));
                     temp.put(dstOffset + 1, this.scratch.get(srcOffset + 1));
                     temp.put(dstOffset + 2, this.scratch.get(srcOffset + 2));
                     if (x < this.getHeight() && y < this.getWidth()) {
                        temp.put(dstOffset + 3, (byte)-1);
                     } else {
                        temp.put(dstOffset + 3, (byte)0);
                     }
                  }
               }

               this.bitDepth = 32;
               this.scratch = temp;
            }

            if (transparent != null) {
               for (int i = 0; i < this.texWidth * this.texHeight * 4; i += 4) {
                  boolean match = true;

                  for (int c = 0; c < 3; c++) {
                     if (this.toInt(this.scratch.get(i + c)) != transparent[c]) {
                        match = false;
                     }
                  }

                  if (match) {
                     this.scratch.put(i + 3, (byte)0);
                  }
               }
            }

            this.scratch.position(0);
            return this.scratch;
         } else {
            throw new IOException("Only RGB formatted images are supported by the PNGLoader");
         }
      }
   }

   private int toInt(byte var1) {
      return var1 >= 0 ? var1 : 256 + var1;
   }

   private int get2Fold(int var1) {
      int var4 = 2;

      while (var4 < var1) {
         var4 *= 2;
      }

      return var4;
   }

   @Override
   public void method21466(boolean var1) {
   }

   @Override
   public int getWidth() {
      return this.width;
   }

   @Override
   public int getHeight() {
      return this.height;
   }
}
