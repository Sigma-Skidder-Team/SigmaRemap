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
   public static Class7768 field30762 = new Class7768(1, true);
   public static Class7768 field30763 = new Class7768(1, false);
   public static Class7768 field30764 = new Class7768(2, true);
   public static Class7768 field30765 = new Class7768(3, false);
   public static Class7768 field30766 = new Class7768(4, true);
   public static Class7768 field30767 = new Class7768(4, true);
   public static Class7768 field30768 = new Class7768(4, true);
   private static final byte[] field30769 = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
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
   private final InputStream field30780;
   private final CRC32 field30781;
   private final byte[] field30782;
   private int field30783;
   private int field30784;
   private int field30785;
   private int field30786;
   private int field30787;
   private int field30788;
   private int field30789;
   private int field30790;
   private byte[] field30791;
   private byte[] field30792;
   private byte[] field30793;

   public PNGDecoder(InputStream var1) throws IOException {
      this.field30780 = var1;
      this.field30781 = new CRC32();
      this.field30782 = new byte[4096];
      this.method22434(this.field30782, 0, field30769.length);
      if (!method22437(this.field30782)) {
         throw new IOException("Not a valid PNG file");
      } else {
         this.method22429(1229472850);
         this.method22424();
         this.method22427();

         while (true) {
            this.method22428();
            switch (this.field30784) {
               case 1229209940:
                  if (this.field30789 == 3 && this.field30791 == null) {
                     throw new IOException("Missing PLTE chunk");
                  }

                  return;
               case 1347179589:
                  this.method22425();
                  break;
               case 1951551059:
                  this.method22426();
            }

            this.method22427();
         }
      }
   }

   public int method22400() {
      return this.field30787;
   }

   public int method22401() {
      return this.field30786;
   }

   public boolean method22402() {
      return this.field30789 == 6 || this.field30792 != null || this.field30793 != null;
   }

   public boolean method22403() {
      return this.field30789 == 6 || this.field30789 == 2 || this.field30789 == 3;
   }

   public Class7768 method22404(Class7768 var1) {
      switch (this.field30789) {
         case 0:
            if (var1 != field30763 && var1 != field30762) {
               return field30763;
            }

            return var1;
         case 1:
         case 5:
         default:
            throw new UnsupportedOperationException("Not yet implemented");
         case 2:
            if (var1 != field30768 && var1 != field30766 && var1 != field30767 && var1 != field30765) {
               return field30765;
            }

            return var1;
         case 3:
            if (var1 != field30768 && var1 != field30766 && var1 != field30767) {
               return field30766;
            }

            return var1;
         case 4:
            return field30764;
         case 6:
            return var1 != field30768 && var1 != field30766 && var1 != field30767 && var1 != field30765 ? field30766 : var1;
      }
   }

   public void method22405(ByteBuffer var1, int var2, Class7768 var3) throws IOException {
      int var6 = var1.position();
      int var7 = (this.field30786 * this.field30788 + 7) / 8 * this.field30790;
      byte[] var8 = new byte[var7 + 1];
      byte[] var9 = new byte[var7 + 1];
      byte[] var10 = this.field30788 < 8 ? new byte[this.field30786 + 1] : null;
      Inflater var11 = new Inflater();

      try {
         for (int var12 = 0; var12 < this.field30787; var12++) {
            this.method22433(var11, var8, 0, var8.length);
            this.method22419(var8, var9);
            ((Buffer)var1).position(var6 + var12 * var2);
            switch (this.field30789) {
               case 0:
                  if (var3 != field30763 && var3 != field30762) {
                     throw new UnsupportedOperationException("Unsupported format for this image");
                  }

                  this.method22406(var1, var8);
                  break;
               case 1:
               case 5:
               default:
                  throw new UnsupportedOperationException("Not yet implemented");
               case 2:
                  if (var3 == field30768) {
                     this.method22407(var1, var8);
                  } else if (var3 == field30766) {
                     this.method22408(var1, var8);
                  } else if (var3 == field30767) {
                     this.method22409(var1, var8);
                  } else {
                     if (var3 != field30765) {
                        throw new UnsupportedOperationException("Unsupported format for this image");
                     }

                     this.method22406(var1, var8);
                  }
                  break;
               case 3:
                  switch (this.field30788) {
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

                  if (var3 == field30768) {
                     this.method22413(var1, var10);
                  } else if (var3 == field30766) {
                     this.method22414(var1, var10);
                  } else {
                     if (var3 != field30767) {
                        throw new UnsupportedOperationException("Unsupported format for this image");
                     }

                     this.method22415(var1, var10);
                  }
                  break;
               case 4:
                  if (var3 != field30764) {
                     throw new UnsupportedOperationException("Unsupported format for this image");
                  }

                  this.method22406(var1, var8);
                  break;
               case 6:
                  if (var3 == field30768) {
                     this.method22410(var1, var8);
                  } else if (var3 == field30766) {
                     this.method22406(var1, var8);
                  } else if (var3 == field30767) {
                     this.method22411(var1, var8);
                  } else {
                     if (var3 != field30765) {
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
      if (this.field30793 == null) {
         int var5 = 1;

         for (int var6 = var2.length; var5 < var6; var5 += 3) {
            var1.put((byte)-1).put(var2[var5 + 2]).put(var2[var5 + 1]).put(var2[var5]);
         }
      } else {
         byte var14 = this.field30793[1];
         byte var15 = this.field30793[3];
         byte var7 = this.field30793[5];
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
      if (this.field30793 == null) {
         int var5 = 1;

         for (int var6 = var2.length; var5 < var6; var5 += 3) {
            var1.put(var2[var5]).put(var2[var5 + 1]).put(var2[var5 + 2]).put((byte)-1);
         }
      } else {
         byte var14 = this.field30793[1];
         byte var15 = this.field30793[3];
         byte var7 = this.field30793[5];
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
      if (this.field30793 == null) {
         int var5 = 1;

         for (int var6 = var2.length; var5 < var6; var5 += 3) {
            var1.put(var2[var5 + 2]).put(var2[var5 + 1]).put(var2[var5]).put((byte)-1);
         }
      } else {
         byte var14 = this.field30793[1];
         byte var15 = this.field30793[3];
         byte var7 = this.field30793[5];
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
      if (this.field30792 == null) {
         int var5 = 1;

         for (int var6 = var2.length; var5 < var6; var5++) {
            int var7 = var2[var5] & 255;
            byte var8 = this.field30791[var7 * 3 + 0];
            byte var9 = this.field30791[var7 * 3 + 1];
            byte var10 = this.field30791[var7 * 3 + 2];
            byte var11 = -1;
            var1.put(var11).put(var10).put(var9).put(var8);
         }
      } else {
         int var12 = 1;

         for (int var13 = var2.length; var12 < var13; var12++) {
            int var14 = var2[var12] & 255;
            byte var15 = this.field30791[var14 * 3 + 0];
            byte var16 = this.field30791[var14 * 3 + 1];
            byte var17 = this.field30791[var14 * 3 + 2];
            byte var18 = this.field30792[var14];
            var1.put(var18).put(var17).put(var16).put(var15);
         }
      }
   }

   private void method22414(ByteBuffer var1, byte[] var2) {
      if (this.field30792 == null) {
         int var5 = 1;

         for (int var6 = var2.length; var5 < var6; var5++) {
            int var7 = var2[var5] & 255;
            byte var8 = this.field30791[var7 * 3 + 0];
            byte var9 = this.field30791[var7 * 3 + 1];
            byte var10 = this.field30791[var7 * 3 + 2];
            byte var11 = -1;
            var1.put(var8).put(var9).put(var10).put(var11);
         }
      } else {
         int var12 = 1;

         for (int var13 = var2.length; var12 < var13; var12++) {
            int var14 = var2[var12] & 255;
            byte var15 = this.field30791[var14 * 3 + 0];
            byte var16 = this.field30791[var14 * 3 + 1];
            byte var17 = this.field30791[var14 * 3 + 2];
            byte var18 = this.field30792[var14];
            var1.put(var15).put(var16).put(var17).put(var18);
         }
      }
   }

   private void method22415(ByteBuffer var1, byte[] var2) {
      if (this.field30792 == null) {
         int var5 = 1;

         for (int var6 = var2.length; var5 < var6; var5++) {
            int var7 = var2[var5] & 255;
            byte var8 = this.field30791[var7 * 3 + 0];
            byte var9 = this.field30791[var7 * 3 + 1];
            byte var10 = this.field30791[var7 * 3 + 2];
            byte var11 = -1;
            var1.put(var10).put(var9).put(var8).put(var11);
         }
      } else {
         int var12 = 1;

         for (int var13 = var2.length; var12 < var13; var12++) {
            int var14 = var2[var12] & 255;
            byte var15 = this.field30791[var14 * 3 + 0];
            byte var16 = this.field30791[var14 * 3 + 1];
            byte var17 = this.field30791[var14 * 3 + 2];
            byte var18 = this.field30792[var14];
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
      int var4 = this.field30790;
      int var5 = var4 + 1;

      for (int var6 = var1.length; var5 < var6; var5++) {
         var1[var5] += var1[var5 - var4];
      }
   }

   private void method22421(byte[] var1, byte[] var2) {
      int var5 = this.field30790;
      int var6 = 1;

      for (int var7 = var1.length; var6 < var7; var6++) {
         var1[var6] += var2[var6];
      }
   }

   private void method22422(byte[] var1, byte[] var2) {
      int var5 = this.field30790;

      int var6;
      for (var6 = 1; var6 <= var5; var6++) {
         var1[var6] += (byte)((var2[var6] & 255) >>> 1);
      }

      for (int var7 = var1.length; var6 < var7; var6++) {
         var1[var6] += (byte)((var2[var6] & 255) + (var1[var6 - var5] & 255) >>> 1);
      }
   }

   private void method22423(byte[] var1, byte[] var2) {
      int var5 = this.field30790;

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

   private void method22424() throws IOException {
      this.method22430(13);
      this.method22431(this.field30782, 0, 13);
      this.field30786 = this.method22435(this.field30782, 0);
      this.field30787 = this.method22435(this.field30782, 4);
      this.field30788 = this.field30782[8] & 255;
      this.field30789 = this.field30782[9] & 255;
      label59:
      switch (this.field30789) {
         case 0:
            if (this.field30788 != 8) {
               throw new IOException("Unsupported bit depth: " + this.field30788);
            }

            this.field30790 = 1;
            break;
         case 1:
         case 5:
         default:
            throw new IOException("unsupported color format: " + this.field30789);
         case 2:
            if (this.field30788 != 8) {
               throw new IOException("Unsupported bit depth: " + this.field30788);
            }

            this.field30790 = 3;
            break;
         case 3:
            switch (this.field30788) {
               case 1:
               case 2:
               case 4:
               case 8:
                  this.field30790 = 1;
                  break label59;
               case 3:
               case 5:
               case 6:
               case 7:
               default:
                  throw new IOException("Unsupported bit depth: " + this.field30788);
            }
         case 4:
            if (this.field30788 != 8) {
               throw new IOException("Unsupported bit depth: " + this.field30788);
            }

            this.field30790 = 2;
            break;
         case 6:
            if (this.field30788 != 8) {
               throw new IOException("Unsupported bit depth: " + this.field30788);
            }

            this.field30790 = 4;
      }

      if (this.field30782[10] != 0) {
         throw new IOException("unsupported compression method");
      } else if (this.field30782[11] != 0) {
         throw new IOException("unsupported filtering method");
      } else if (this.field30782[12] != 0) {
         throw new IOException("unsupported interlace method");
      }
   }

   private void method22425() throws IOException {
      int var3 = this.field30783 / 3;
      if (var3 >= 1 && var3 <= 256 && this.field30783 % 3 == 0) {
         this.field30791 = new byte[var3 * 3];
         this.method22431(this.field30791, 0, this.field30791.length);
      } else {
         throw new IOException("PLTE chunk has wrong length");
      }
   }

   private void method22426() throws IOException {
      switch (this.field30789) {
         case 0:
            this.method22430(2);
            this.field30793 = new byte[2];
            this.method22431(this.field30793, 0, 2);
         case 1:
         default:
            break;
         case 2:
            this.method22430(6);
            this.field30793 = new byte[6];
            this.method22431(this.field30793, 0, 6);
            break;
         case 3:
            if (this.field30791 == null) {
               throw new IOException("tRNS chunk without PLTE chunk");
            }

            this.field30792 = new byte[this.field30791.length / 3];
            Arrays.fill(this.field30792, (byte)-1);
            this.method22431(this.field30792, 0, this.field30792.length);
      }
   }

   private void method22427() throws IOException {
      if (this.field30785 <= 0) {
         this.method22434(this.field30782, 0, 4);
         int var3 = this.method22435(this.field30782, 0);
         int var4 = (int)this.field30781.getValue();
         if (var4 != var3) {
            throw new IOException("Invalid CRC");
         }
      } else {
         this.method22436((long)(this.field30785 + 4));
      }

      this.field30785 = 0;
      this.field30783 = 0;
      this.field30784 = 0;
   }

   private void method22428() throws IOException {
      this.method22434(this.field30782, 0, 8);
      this.field30783 = this.method22435(this.field30782, 0);
      this.field30784 = this.method22435(this.field30782, 4);
      this.field30785 = this.field30783;
      this.field30781.reset();
      this.field30781.update(this.field30782, 4, 4);
   }

   private void method22429(int var1) throws IOException {
      this.method22428();
      if (this.field30784 != var1) {
         throw new IOException("Expected chunk: " + Integer.toHexString(var1));
      }
   }

   private void method22430(int var1) throws IOException {
      if (this.field30783 != var1) {
         throw new IOException("Chunk has wrong size");
      }
   }

   private int method22431(byte[] var1, int var2, int var3) throws IOException {
      if (var3 > this.field30785) {
         var3 = this.field30785;
      }

      this.method22434(var1, var2, var3);
      this.field30781.update(var1, var2, var3);
      this.field30785 -= var3;
      return var3;
   }

   private void method22432(Inflater var1) throws IOException {
      while (this.field30785 == 0) {
         this.method22427();
         this.method22429(1229209940);
      }

      int var4 = this.method22431(this.field30782, 0, this.field30782.length);
      var1.setInput(this.field30782, 0, var4);
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

   private void method22434(byte[] var1, int var2, int var3) throws IOException {
      while (true) {
         int var6 = this.field30780.read(var1, var2, var3);
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

   private int method22435(byte[] var1, int var2) {
      return var1[var2] << 24 | (var1[var2 + 1] & 0xFF) << 16 | (var1[var2 + 2] & 0xFF) << 8 | var1[var2 + 3] & 0xFF;
   }

   private void method22436(long var1) throws IOException {
      while (var1 > 0L) {
         long var5 = this.field30780.skip(var1);
         if (var5 < 0L) {
            throw new EOFException();
         }

         var1 -= var5;
      }
   }

   private static boolean method22437(byte[] var0) {
      for (int var3 = 0; var3 < field30769.length; var3++) {
         if (var0[var3] != field30769[var3]) {
            return false;
         }
      }

      return true;
   }
}
