package mapped;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public class PNGDecoder {
   public static Format ALPHA = new Format(1, true);
   public static Format LUMINANCE = new Format(1, false);
   public static Format LUMINANCE_ALPHA = new Format(2, true);
   public static Format RGB = new Format(3, false);
   public static Format RGBA = new Format(4, true);
   public static Format BGRA = new Format(4, true);
   public static Format ABGR = new Format(4, true);
   private static final byte[] SIGNATURE = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
   private static final int field30770 = 1229472850;
   private static final int field30771 = 1347179589;
   private static final int field30772 = 1951551059;
   private static final int field30773 = 1229209940;
   private static final int field30774 = 1229278788;
   private static final byte field30775 = 0;
   private static final byte field30776 = 2;
   private static final byte field30777 = 3;
   private static final byte field30778 = 4;
   private static final byte field30779 = 6;
   private final InputStream input;
   private final CRC32 crc;
   private final byte[] buffer;
   private int chunkLength;
   private int chunkType;
   private int chunkRemaining;
   private int width;
   private int height;
   private int bitdepth;
   private int colorType;
   private int bytesPerPixel;
   private byte[] palette;
   private byte[] paletteA;
   private byte[] transPixel;

   public PNGDecoder(InputStream var1) throws IOException {
      this.input = var1;
      this.crc = new CRC32();
      this.buffer = new byte[4096];
      this.readFully(this.buffer, 0, SIGNATURE.length);
      if (!checkSignature(this.buffer)) {
         throw new IOException("Not a valid PNG file");
      } else {
         this.openChunk(1229472850);
         this.readIHDR();
         this.closeChunk();

         while (true) {
            this.openChunk();
            switch (this.chunkType) {
               case 1229209940:
                  if (this.colorType == 3 && this.palette == null) {
                     throw new IOException("Missing PLTE chunk");
                  }

                  return;
               case 1347179589:
                  this.readPLTE();
                  break;
               case 1951551059:
                  this.readtRNS();
            }

            this.closeChunk();
         }
      }
   }

   public int getHeight() {
      return this.height;
   }

   public int getWidth() {
      return this.width;
   }

   public boolean hasAlpha() {
      return this.colorType == 6 || this.paletteA != null || this.transPixel != null;
   }

   public boolean isRGB() {
      return this.colorType == 6 || this.colorType == 2 || this.colorType == 3;
   }

   public Format method22404(Format var1) {
      switch (this.colorType) {
         case 0:
            if (var1 != LUMINANCE && var1 != ALPHA) {
               return LUMINANCE;
            }

            return var1;
         case 1:
         case 5:
         default:
            throw new UnsupportedOperationException("Not yet implemented");
         case 2:
            if (var1 != ABGR && var1 != RGBA && var1 != BGRA && var1 != RGB) {
               return RGB;
            }

            return var1;
         case 3:
            if (var1 != ABGR && var1 != RGBA && var1 != BGRA) {
               return RGBA;
            }

            return var1;
         case 4:
            return LUMINANCE_ALPHA;
         case 6:
            return var1 != ABGR && var1 != RGBA && var1 != BGRA && var1 != RGB ? RGBA : var1;
      }
   }

   public void decode(ByteBuffer var1, int var2, Format var3) throws IOException {
      int var6 = var1.position();
      int var7 = (this.width * this.bitdepth + 7) / 8 * this.bytesPerPixel;
      byte[] var8 = new byte[var7 + 1];
      byte[] var9 = new byte[var7 + 1];
      byte[] var10 = this.bitdepth < 8 ? new byte[this.width + 1] : null;
      Inflater var11 = new Inflater();

      try {
         for (int var12 = 0; var12 < this.height; var12++) {
            this.method22433(var11, var8, 0, var8.length);
            this.method22419(var8, var9);
            ((Buffer)var1).position(var6 + var12 * var2);
            switch (this.colorType) {
               case 0:
                  if (var3 != LUMINANCE && var3 != ALPHA) {
                     throw new UnsupportedOperationException("Unsupported format for this image");
                  }

                  this.method22406(var1, var8);
                  break;
               case 1:
               case 5:
               default:
                  throw new UnsupportedOperationException("Not yet implemented");
               case 2:
                  if (var3 == ABGR) {
                     this.method22407(var1, var8);
                  } else if (var3 == RGBA) {
                     this.method22408(var1, var8);
                  } else if (var3 == BGRA) {
                     this.method22409(var1, var8);
                  } else {
                     if (var3 != RGB) {
                        throw new UnsupportedOperationException("Unsupported format for this image");
                     }

                     this.method22406(var1, var8);
                  }
                  break;
               case 3:
                  switch (this.bitdepth) {
                     case 1:
                        this.method22418(var8, var10);
                        break;
                     case 2:
                        this.method22417(var8, var10);
                        break;
                     case 3:
                     case 5:
                     case 6:
                     case 7:
                     default:
                        throw new UnsupportedOperationException("Unsupported bitdepth for this image");
                     case 4:
                        this.method22416(var8, var10);
                        break;
                     case 8:
                        var10 = var8;
                  }

                  if (var3 == ABGR) {
                     this.method22413(var1, var10);
                  } else if (var3 == RGBA) {
                     this.method22414(var1, var10);
                  } else {
                     if (var3 != BGRA) {
                        throw new UnsupportedOperationException("Unsupported format for this image");
                     }

                     this.method22415(var1, var10);
                  }
                  break;
               case 4:
                  if (var3 != LUMINANCE_ALPHA) {
                     throw new UnsupportedOperationException("Unsupported format for this image");
                  }

                  this.method22406(var1, var8);
                  break;
               case 6:
                  if (var3 == ABGR) {
                     this.method22410(var1, var8);
                  } else if (var3 == RGBA) {
                     this.method22406(var1, var8);
                  } else if (var3 == BGRA) {
                     this.method22411(var1, var8);
                  } else {
                     if (var3 != RGB) {
                        throw new UnsupportedOperationException("Unsupported format for this image");
                     }

                     this.method22412(var1, var8);
                  }
            }

            byte[] var13 = var8;
            var8 = var9;
            var9 = var13;
         }
      } finally {
         var11.end();
      }
   }

   private void method22406(ByteBuffer var1, byte[] var2) {
      var1.put(var2, 1, var2.length - 1);
   }

   private void method22407(ByteBuffer var1, byte[] var2) {
      if (this.transPixel == null) {
         int var5 = 1;

         for (int var6 = var2.length; var5 < var6; var5 += 3) {
            var1.put((byte)-1).put(var2[var5 + 2]).put(var2[var5 + 1]).put(var2[var5]);
         }
      } else {
         byte var14 = this.transPixel[1];
         byte var15 = this.transPixel[3];
         byte var7 = this.transPixel[5];
         int var8 = 1;

         for (int var9 = var2.length; var8 < var9; var8 += 3) {
            byte var10 = var2[var8];
            byte var11 = var2[var8 + 1];
            byte var12 = var2[var8 + 2];
            byte var13 = -1;
            if (var10 == var14 && var11 == var15 && var12 == var7) {
               var13 = 0;
            }

            var1.put(var13).put(var12).put(var11).put(var10);
         }
      }
   }

   private void method22408(ByteBuffer var1, byte[] var2) {
      if (this.transPixel == null) {
         int var5 = 1;

         for (int var6 = var2.length; var5 < var6; var5 += 3) {
            var1.put(var2[var5]).put(var2[var5 + 1]).put(var2[var5 + 2]).put((byte)-1);
         }
      } else {
         byte var14 = this.transPixel[1];
         byte var15 = this.transPixel[3];
         byte var7 = this.transPixel[5];
         int var8 = 1;

         for (int var9 = var2.length; var8 < var9; var8 += 3) {
            byte var10 = var2[var8];
            byte var11 = var2[var8 + 1];
            byte var12 = var2[var8 + 2];
            byte var13 = -1;
            if (var10 == var14 && var11 == var15 && var12 == var7) {
               var13 = 0;
            }

            var1.put(var10).put(var11).put(var12).put(var13);
         }
      }
   }

   private void method22409(ByteBuffer var1, byte[] var2) {
      if (this.transPixel == null) {
         int var5 = 1;

         for (int var6 = var2.length; var5 < var6; var5 += 3) {
            var1.put(var2[var5 + 2]).put(var2[var5 + 1]).put(var2[var5]).put((byte)-1);
         }
      } else {
         byte var14 = this.transPixel[1];
         byte var15 = this.transPixel[3];
         byte var7 = this.transPixel[5];
         int var8 = 1;

         for (int var9 = var2.length; var8 < var9; var8 += 3) {
            byte var10 = var2[var8];
            byte var11 = var2[var8 + 1];
            byte var12 = var2[var8 + 2];
            byte var13 = -1;
            if (var10 == var14 && var11 == var15 && var12 == var7) {
               var13 = 0;
            }

            var1.put(var12).put(var11).put(var10).put(var13);
         }
      }
   }

   private void method22410(ByteBuffer var1, byte[] var2) {
      int var5 = 1;

      for (int var6 = var2.length; var5 < var6; var5 += 4) {
         var1.put(var2[var5 + 3]).put(var2[var5 + 2]).put(var2[var5 + 1]).put(var2[var5]);
      }
   }

   private void method22411(ByteBuffer var1, byte[] var2) {
      int var5 = 1;

      for (int var6 = var2.length; var5 < var6; var5 += 4) {
         var1.put(var2[var5 + 2]).put(var2[var5 + 1]).put(var2[var5 + 0]).put(var2[var5 + 3]);
      }
   }

   private void method22412(ByteBuffer var1, byte[] var2) {
      int var5 = 1;

      for (int var6 = var2.length; var5 < var6; var5 += 4) {
         var1.put(var2[var5]).put(var2[var5 + 1]).put(var2[var5 + 2]);
      }
   }

   private void method22413(ByteBuffer var1, byte[] var2) {
      if (this.paletteA == null) {
         int var5 = 1;

         for (int var6 = var2.length; var5 < var6; var5++) {
            int var7 = var2[var5] & 255;
            byte var8 = this.palette[var7 * 3 + 0];
            byte var9 = this.palette[var7 * 3 + 1];
            byte var10 = this.palette[var7 * 3 + 2];
            byte var11 = -1;
            var1.put(var11).put(var10).put(var9).put(var8);
         }
      } else {
         int var12 = 1;

         for (int var13 = var2.length; var12 < var13; var12++) {
            int var14 = var2[var12] & 255;
            byte var15 = this.palette[var14 * 3 + 0];
            byte var16 = this.palette[var14 * 3 + 1];
            byte var17 = this.palette[var14 * 3 + 2];
            byte var18 = this.paletteA[var14];
            var1.put(var18).put(var17).put(var16).put(var15);
         }
      }
   }

   private void method22414(ByteBuffer var1, byte[] var2) {
      if (this.paletteA == null) {
         int var5 = 1;

         for (int var6 = var2.length; var5 < var6; var5++) {
            int var7 = var2[var5] & 255;
            byte var8 = this.palette[var7 * 3 + 0];
            byte var9 = this.palette[var7 * 3 + 1];
            byte var10 = this.palette[var7 * 3 + 2];
            byte var11 = -1;
            var1.put(var8).put(var9).put(var10).put(var11);
         }
      } else {
         int var12 = 1;

         for (int var13 = var2.length; var12 < var13; var12++) {
            int var14 = var2[var12] & 255;
            byte var15 = this.palette[var14 * 3 + 0];
            byte var16 = this.palette[var14 * 3 + 1];
            byte var17 = this.palette[var14 * 3 + 2];
            byte var18 = this.paletteA[var14];
            var1.put(var15).put(var16).put(var17).put(var18);
         }
      }
   }

   private void method22415(ByteBuffer var1, byte[] var2) {
      if (this.paletteA == null) {
         int var5 = 1;

         for (int var6 = var2.length; var5 < var6; var5++) {
            int var7 = var2[var5] & 255;
            byte var8 = this.palette[var7 * 3 + 0];
            byte var9 = this.palette[var7 * 3 + 1];
            byte var10 = this.palette[var7 * 3 + 2];
            byte var11 = -1;
            var1.put(var10).put(var9).put(var8).put(var11);
         }
      } else {
         int var12 = 1;

         for (int var13 = var2.length; var12 < var13; var12++) {
            int var14 = var2[var12] & 255;
            byte var15 = this.palette[var14 * 3 + 0];
            byte var16 = this.palette[var14 * 3 + 1];
            byte var17 = this.palette[var14 * 3 + 2];
            byte var18 = this.paletteA[var14];
            var1.put(var17).put(var16).put(var15).put(var18);
         }
      }
   }

   private void method22416(byte[] var1, byte[] var2) {
      int var5 = 1;

      for (int var6 = var2.length; var5 < var6; var5 += 2) {
         int var7 = var1[1 + (var5 >> 1)] & 255;
         switch (var6 - var5) {
            default:
               var2[var5 + 1] = (byte)(var7 & 15);
            case 1:
               var2[var5] = (byte)(var7 >> 4);
         }
      }
   }

   private void method22417(byte[] var1, byte[] var2) {
      int var5 = 1;

      for (int var6 = var2.length; var5 < var6; var5 += 4) {
         int var7 = var1[1 + (var5 >> 2)] & 255;
         switch (var6 - var5) {
            default:
               var2[var5 + 3] = (byte)(var7 & 3);
            case 3:
               var2[var5 + 2] = (byte)(var7 >> 2 & 3);
            case 2:
               var2[var5 + 1] = (byte)(var7 >> 4 & 3);
            case 1:
               var2[var5] = (byte)(var7 >> 6);
         }
      }
   }

   private void method22418(byte[] var1, byte[] var2) {
      int var5 = 1;

      for (int var6 = var2.length; var5 < var6; var5 += 8) {
         int var7 = var1[1 + (var5 >> 3)] & 255;
         switch (var6 - var5) {
            default:
               var2[var5 + 7] = (byte)(var7 & 1);
            case 7:
               var2[var5 + 6] = (byte)(var7 >> 1 & 1);
            case 6:
               var2[var5 + 5] = (byte)(var7 >> 2 & 1);
            case 5:
               var2[var5 + 4] = (byte)(var7 >> 3 & 1);
            case 4:
               var2[var5 + 3] = (byte)(var7 >> 4 & 1);
            case 3:
               var2[var5 + 2] = (byte)(var7 >> 5 & 1);
            case 2:
               var2[var5 + 1] = (byte)(var7 >> 6 & 1);
            case 1:
               var2[var5] = (byte)(var7 >> 7);
         }
      }
   }

   private void method22419(byte[] var1, byte[] var2) throws IOException {
      switch (var1[0]) {
         case 0:
            break;
         case 1:
            this.method22420(var1);
            break;
         case 2:
            this.method22421(var1, var2);
            break;
         case 3:
            this.method22422(var1, var2);
            break;
         case 4:
            this.method22423(var1, var2);
            break;
         default:
            throw new IOException("invalide filter type in scanline: " + var1[0]);
      }
   }

   private void method22420(byte[] var1) {
      int var4 = this.bytesPerPixel;
      int var5 = var4 + 1;

      for (int var6 = var1.length; var5 < var6; var5++) {
         var1[var5] += var1[var5 - var4];
      }
   }

   private void method22421(byte[] var1, byte[] var2) {
      int var5 = this.bytesPerPixel;
      int var6 = 1;

      for (int var7 = var1.length; var6 < var7; var6++) {
         var1[var6] += var2[var6];
      }
   }

   private void method22422(byte[] var1, byte[] var2) {
      int var5 = this.bytesPerPixel;

      int var6;
      for (var6 = 1; var6 <= var5; var6++) {
         var1[var6] += (byte)((var2[var6] & 255) >>> 1);
      }

      for (int var7 = var1.length; var6 < var7; var6++) {
         var1[var6] += (byte)((var2[var6] & 255) + (var1[var6 - var5] & 255) >>> 1);
      }
   }

   private void method22423(byte[] var1, byte[] var2) {
      int var5 = this.bytesPerPixel;

      int var6;
      for (var6 = 1; var6 <= var5; var6++) {
         var1[var6] += var2[var6];
      }

      for (int var7 = var1.length; var6 < var7; var6++) {
         int var8 = var1[var6 - var5] & 255;
         int var9 = var2[var6] & 255;
         int var10 = var2[var6 - var5] & 255;
         int var11 = var8 + var9 - var10;
         int var12 = var11 - var8;
         if (var12 < 0) {
            var12 = -var12;
         }

         int var13 = var11 - var9;
         if (var13 < 0) {
            var13 = -var13;
         }

         int var14 = var11 - var10;
         if (var14 < 0) {
            var14 = -var14;
         }

         if (var12 <= var13 && var12 <= var14) {
            var10 = var8;
         } else if (var13 <= var14) {
            var10 = var9;
         }

         var1[var6] += (byte)var10;
      }
   }

   private void readIHDR() throws IOException {
      this.checkChunkLength(13);
      this.readChunk(this.buffer, 0, 13);
      this.width = this.readInt(this.buffer, 0);
      this.height = this.readInt(this.buffer, 4);
      this.bitdepth = this.buffer[8] & 255;
      this.colorType = this.buffer[9] & 255;
      label59:
      switch (this.colorType) {
         case 0:
            if (this.bitdepth != 8) {
               throw new IOException("Unsupported bit depth: " + this.bitdepth);
            }

            this.bytesPerPixel = 1;
            break;
         case 1:
         case 5:
         default:
            throw new IOException("unsupported color format: " + this.colorType);
         case 2:
            if (this.bitdepth != 8) {
               throw new IOException("Unsupported bit depth: " + this.bitdepth);
            }

            this.bytesPerPixel = 3;
            break;
         case 3:
            switch (this.bitdepth) {
               case 1:
               case 2:
               case 4:
               case 8:
                  this.bytesPerPixel = 1;
                  break label59;
               case 3:
               case 5:
               case 6:
               case 7:
               default:
                  throw new IOException("Unsupported bit depth: " + this.bitdepth);
            }
         case 4:
            if (this.bitdepth != 8) {
               throw new IOException("Unsupported bit depth: " + this.bitdepth);
            }

            this.bytesPerPixel = 2;
            break;
         case 6:
            if (this.bitdepth != 8) {
               throw new IOException("Unsupported bit depth: " + this.bitdepth);
            }

            this.bytesPerPixel = 4;
      }

      if (this.buffer[10] != 0) {
         throw new IOException("unsupported compression method");
      } else if (this.buffer[11] != 0) {
         throw new IOException("unsupported filtering method");
      } else if (this.buffer[12] != 0) {
         throw new IOException("unsupported interlace method");
      }
   }

   private void readPLTE() throws IOException {
      int var3 = this.chunkLength / 3;
      if (var3 >= 1 && var3 <= 256 && this.chunkLength % 3 == 0) {
         this.palette = new byte[var3 * 3];
         this.readChunk(this.palette, 0, this.palette.length);
      } else {
         throw new IOException("PLTE chunk has wrong length");
      }
   }

   private void readtRNS() throws IOException {
      switch (this.colorType) {
         case 0:
            this.checkChunkLength(2);
            this.transPixel = new byte[2];
            this.readChunk(this.transPixel, 0, 2);
         case 1:
         default:
            break;
         case 2:
            this.checkChunkLength(6);
            this.transPixel = new byte[6];
            this.readChunk(this.transPixel, 0, 6);
            break;
         case 3:
            if (this.palette == null) {
               throw new IOException("tRNS chunk without PLTE chunk");
            }

            this.paletteA = new byte[this.palette.length / 3];
            Arrays.fill(this.paletteA, (byte)-1);
            this.readChunk(this.paletteA, 0, this.paletteA.length);
      }
   }

   private void closeChunk() throws IOException {
      if (this.chunkRemaining <= 0) {
         this.readFully(this.buffer, 0, 4);
         int var3 = this.readInt(this.buffer, 0);
         int var4 = (int)this.crc.getValue();
         if (var4 != var3) {
            throw new IOException("Invalid CRC");
         }
      } else {
         this.method22436((long)(this.chunkRemaining + 4));
      }

      this.chunkRemaining = 0;
      this.chunkLength = 0;
      this.chunkType = 0;
   }

   private void openChunk() throws IOException {
      this.readFully(this.buffer, 0, 8);
      this.chunkLength = this.readInt(this.buffer, 0);
      this.chunkType = this.readInt(this.buffer, 4);
      this.chunkRemaining = this.chunkLength;
      this.crc.reset();
      this.crc.update(this.buffer, 4, 4);
   }

   private void openChunk(int var1) throws IOException {
      this.openChunk();
      if (this.chunkType != var1) {
         throw new IOException("Expected chunk: " + Integer.toHexString(var1));
      }
   }

   private void checkChunkLength(int var1) throws IOException {
      if (this.chunkLength != var1) {
         throw new IOException("Chunk has wrong size");
      }
   }

   private int readChunk(byte[] var1, int var2, int var3) throws IOException {
      if (var3 > this.chunkRemaining) {
         var3 = this.chunkRemaining;
      }

      this.readFully(var1, var2, var3);
      this.crc.update(var1, var2, var3);
      this.chunkRemaining -= var3;
      return var3;
   }

   private void method22432(Inflater var1) throws IOException {
      while (this.chunkRemaining == 0) {
         this.closeChunk();
         this.openChunk(1229209940);
      }

      int var4 = this.readChunk(this.buffer, 0, this.buffer.length);
      var1.setInput(this.buffer, 0, var4);
   }

   private void method22433(Inflater var1, byte[] var2, int var3, int var4) throws IOException {
      try {
         do {
            int var7 = var1.inflate(var2, var3, var4);
            if (var7 <= 0) {
               if (var1.finished()) {
                  throw new EOFException();
               }

               if (!var1.needsInput()) {
                  throw new IOException("Can't inflate " + var4 + " bytes");
               }

               this.method22432(var1);
            } else {
               var3 += var7;
               var4 -= var7;
            }
         } while (var4 > 0);
      } catch (DataFormatException var8) {
         throw (IOException)new IOException("inflate error").initCause(var8);
      }
   }

   private void readFully(byte[] var1, int var2, int var3) throws IOException {
      while (true) {
         int var6 = this.input.read(var1, var2, var3);
         if (var6 >= 0) {
            var2 += var6;
            var3 -= var6;
            if (var3 > 0) {
               continue;
            }

            return;
         }

         throw new EOFException();
      }
   }

   private int readInt(byte[] var1, int var2) {
      return var1[var2] << 24 | (var1[var2 + 1] & 0xFF) << 16 | (var1[var2 + 2] & 0xFF) << 8 | var1[var2 + 3] & 0xFF;
   }

   private void method22436(long var1) throws IOException {
      while (var1 > 0L) {
         long var5 = this.input.skip(var1);
         if (var5 < 0L) {
            throw new EOFException();
         }

         var1 -= var5;
      }
   }

   private static boolean checkSignature(byte[] var0) {
      for (int var3 = 0; var3 < SIGNATURE.length; var3++) {
         if (var0[var3] != SIGNATURE[var3]) {
            return false;
         }
      }

      return true;
   }
}
