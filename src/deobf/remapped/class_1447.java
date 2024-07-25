package remapped;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public class class_1447 {
   public static class_2683 field_7783 = new class_2683(1, true, null);
   public static class_2683 field_7784 = new class_2683(1, false, null);
   public static class_2683 field_7785 = new class_2683(2, true, null);
   public static class_2683 field_7793 = new class_2683(3, false, null);
   public static class_2683 field_7809 = new class_2683(4, true, null);
   public static class_2683 field_7804 = new class_2683(4, true, null);
   public static class_2683 field_7789 = new class_2683(4, true, null);
   private static final byte[] field_7796 = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
   private static final int field_7786 = 1229472850;
   private static final int field_7779 = 1347179589;
   private static final int field_7787 = 1951551059;
   private static final int field_7795 = 1229209940;
   private static final int field_7790 = 1229278788;
   private static final byte field_7799 = 0;
   private static final byte field_7792 = 2;
   private static final byte field_7788 = 3;
   private static final byte field_7798 = 4;
   private static final byte field_7810 = 6;
   private final InputStream field_7805;
   private final CRC32 field_7794;
   private final byte[] field_7781;
   private int field_7782;
   private int field_7801;
   private int field_7806;
   private int field_7780;
   private int field_7791;
   private int field_7807;
   private int field_7797;
   private int field_7803;
   private byte[] field_7808;
   private byte[] field_7800;
   private byte[] field_7778;

   public class_1447(InputStream var1) throws IOException {
      this.field_7805 = var1;
      this.field_7794 = new CRC32();
      this.field_7781 = new byte[4096];
      this.method_6652(this.field_7781, 0, field_7796.length);
      if (!method_6657(this.field_7781)) {
         throw new IOException("Not a valid PNG file");
      } else {
         this.method_6641(1229472850);
         this.method_6665();
         this.method_6646();

         while (true) {
            this.method_6640();
            switch (this.field_7801) {
               case 1229209940:
                  if (this.field_7797 == 3 && this.field_7808 == null) {
                     throw new IOException("Missing PLTE chunk");
                  }

                  return;
               case 1347179589:
                  this.method_6634();
                  break;
               case 1951551059:
                  this.method_6630();
            }

            this.method_6646();
         }
      }
   }

   public int method_6663() {
      return this.field_7791;
   }

   public int method_6648() {
      return this.field_7780;
   }

   public boolean method_6653() {
      return this.field_7797 == 6 || this.field_7800 != null || this.field_7778 != null;
   }

   public boolean method_6644() {
      return this.field_7797 == 6 || this.field_7797 == 2 || this.field_7797 == 3;
   }

   public class_2683 method_6651(class_2683 var1) {
      switch (this.field_7797) {
         case 0:
            if (var1 != field_7784 && var1 != field_7783) {
               return field_7784;
            }

            return var1;
         case 1:
         case 5:
         default:
            throw new UnsupportedOperationException("Not yet implemented");
         case 2:
            if (var1 != field_7789 && var1 != field_7809 && var1 != field_7804 && var1 != field_7793) {
               return field_7793;
            }

            return var1;
         case 3:
            if (var1 != field_7789 && var1 != field_7809 && var1 != field_7804) {
               return field_7809;
            }

            return var1;
         case 4:
            return field_7785;
         case 6:
            return var1 != field_7789 && var1 != field_7809 && var1 != field_7804 && var1 != field_7793 ? field_7809 : var1;
      }
   }

   public void method_6660(ByteBuffer var1, int var2, class_2683 var3) throws IOException {
      int var6 = var1.position();
      int var7 = (this.field_7780 * this.field_7807 + 7) / 8 * this.field_7803;
      byte[] var8 = new byte[var7 + 1];
      byte[] var9 = new byte[var7 + 1];
      byte[] var10 = this.field_7807 < 8 ? new byte[this.field_7780 + 1] : null;
      Inflater var11 = new Inflater();

      try {
         for (int var12 = 0; var12 < this.field_7791; var12++) {
            this.method_6637(var11, var8, 0, var8.length);
            this.method_6662(var8, var9);
            ((Buffer)var1).position(var6 + var12 * var2);
            switch (this.field_7797) {
               case 0:
                  if (var3 != field_7784 && var3 != field_7783) {
                     throw new UnsupportedOperationException("Unsupported format for this image");
                  }

                  this.method_6632(var1, var8);
                  break;
               case 1:
               case 5:
               default:
                  throw new UnsupportedOperationException("Not yet implemented");
               case 2:
                  if (var3 == field_7789) {
                     this.method_6639(var1, var8);
                  } else if (var3 == field_7809) {
                     this.method_6659(var1, var8);
                  } else if (var3 == field_7804) {
                     this.method_6635(var1, var8);
                  } else {
                     if (var3 != field_7793) {
                        throw new UnsupportedOperationException("Unsupported format for this image");
                     }

                     this.method_6632(var1, var8);
                  }
                  break;
               case 3:
                  switch (this.field_7807) {
                     case 1:
                        this.method_6642(var8, var10);
                        break;
                     case 2:
                        this.method_6631(var8, var10);
                        break;
                     case 3:
                     case 5:
                     case 6:
                     case 7:
                     default:
                        throw new UnsupportedOperationException("Unsupported bitdepth for this image");
                     case 4:
                        this.method_6654(var8, var10);
                        break;
                     case 8:
                        var10 = var8;
                  }

                  if (var3 == field_7789) {
                     this.method_6658(var1, var10);
                  } else if (var3 == field_7809) {
                     this.method_6629(var1, var10);
                  } else {
                     if (var3 != field_7804) {
                        throw new UnsupportedOperationException("Unsupported format for this image");
                     }

                     this.method_6664(var1, var10);
                  }
                  break;
               case 4:
                  if (var3 != field_7785) {
                     throw new UnsupportedOperationException("Unsupported format for this image");
                  }

                  this.method_6632(var1, var8);
                  break;
               case 6:
                  if (var3 == field_7789) {
                     this.method_6661(var1, var8);
                  } else if (var3 == field_7809) {
                     this.method_6632(var1, var8);
                  } else if (var3 == field_7804) {
                     this.method_6656(var1, var8);
                  } else {
                     if (var3 != field_7793) {
                        throw new UnsupportedOperationException("Unsupported format for this image");
                     }

                     this.method_6649(var1, var8);
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

   private void method_6632(ByteBuffer var1, byte[] var2) {
      var1.put(var2, 1, var2.length - 1);
   }

   private void method_6639(ByteBuffer var1, byte[] var2) {
      if (this.field_7778 == null) {
         byte var5 = 1;

         for (int var6 = var2.length; var5 < var6; var5 += 3) {
            var1.put((byte)-1).put(var2[var5 + 2]).put(var2[var5 + 1]).put(var2[var5]);
         }
      } else {
         byte var14 = this.field_7778[1];
         byte var15 = this.field_7778[3];
         byte var7 = this.field_7778[5];
         byte var8 = 1;

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

   private void method_6659(ByteBuffer var1, byte[] var2) {
      if (this.field_7778 == null) {
         byte var5 = 1;

         for (int var6 = var2.length; var5 < var6; var5 += 3) {
            var1.put(var2[var5]).put(var2[var5 + 1]).put(var2[var5 + 2]).put((byte)-1);
         }
      } else {
         byte var14 = this.field_7778[1];
         byte var15 = this.field_7778[3];
         byte var7 = this.field_7778[5];
         byte var8 = 1;

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

   private void method_6635(ByteBuffer var1, byte[] var2) {
      if (this.field_7778 == null) {
         byte var5 = 1;

         for (int var6 = var2.length; var5 < var6; var5 += 3) {
            var1.put(var2[var5 + 2]).put(var2[var5 + 1]).put(var2[var5]).put((byte)-1);
         }
      } else {
         byte var14 = this.field_7778[1];
         byte var15 = this.field_7778[3];
         byte var7 = this.field_7778[5];
         byte var8 = 1;

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

   private void method_6661(ByteBuffer var1, byte[] var2) {
      byte var5 = 1;

      for (int var6 = var2.length; var5 < var6; var5 += 4) {
         var1.put(var2[var5 + 3]).put(var2[var5 + 2]).put(var2[var5 + 1]).put(var2[var5]);
      }
   }

   private void method_6656(ByteBuffer var1, byte[] var2) {
      byte var5 = 1;

      for (int var6 = var2.length; var5 < var6; var5 += 4) {
         var1.put(var2[var5 + 2]).put(var2[var5 + 1]).put(var2[var5 + 0]).put(var2[var5 + 3]);
      }
   }

   private void method_6649(ByteBuffer var1, byte[] var2) {
      byte var5 = 1;

      for (int var6 = var2.length; var5 < var6; var5 += 4) {
         var1.put(var2[var5]).put(var2[var5 + 1]).put(var2[var5 + 2]);
      }
   }

   private void method_6658(ByteBuffer var1, byte[] var2) {
      if (this.field_7800 == null) {
         int var5 = 1;

         for (int var6 = var2.length; var5 < var6; var5++) {
            int var7 = var2[var5] & 255;
            byte var8 = this.field_7808[var7 * 3 + 0];
            byte var9 = this.field_7808[var7 * 3 + 1];
            byte var10 = this.field_7808[var7 * 3 + 2];
            byte var11 = -1;
            var1.put(var11).put(var10).put(var9).put(var8);
         }
      } else {
         int var12 = 1;

         for (int var13 = var2.length; var12 < var13; var12++) {
            int var14 = var2[var12] & 255;
            byte var15 = this.field_7808[var14 * 3 + 0];
            byte var16 = this.field_7808[var14 * 3 + 1];
            byte var17 = this.field_7808[var14 * 3 + 2];
            byte var18 = this.field_7800[var14];
            var1.put(var18).put(var17).put(var16).put(var15);
         }
      }
   }

   private void method_6629(ByteBuffer var1, byte[] var2) {
      if (this.field_7800 == null) {
         int var5 = 1;

         for (int var6 = var2.length; var5 < var6; var5++) {
            int var7 = var2[var5] & 255;
            byte var8 = this.field_7808[var7 * 3 + 0];
            byte var9 = this.field_7808[var7 * 3 + 1];
            byte var10 = this.field_7808[var7 * 3 + 2];
            byte var11 = -1;
            var1.put(var8).put(var9).put(var10).put(var11);
         }
      } else {
         int var12 = 1;

         for (int var13 = var2.length; var12 < var13; var12++) {
            int var14 = var2[var12] & 255;
            byte var15 = this.field_7808[var14 * 3 + 0];
            byte var16 = this.field_7808[var14 * 3 + 1];
            byte var17 = this.field_7808[var14 * 3 + 2];
            byte var18 = this.field_7800[var14];
            var1.put(var15).put(var16).put(var17).put(var18);
         }
      }
   }

   private void method_6664(ByteBuffer var1, byte[] var2) {
      if (this.field_7800 == null) {
         int var5 = 1;

         for (int var6 = var2.length; var5 < var6; var5++) {
            int var7 = var2[var5] & 255;
            byte var8 = this.field_7808[var7 * 3 + 0];
            byte var9 = this.field_7808[var7 * 3 + 1];
            byte var10 = this.field_7808[var7 * 3 + 2];
            byte var11 = -1;
            var1.put(var10).put(var9).put(var8).put(var11);
         }
      } else {
         int var12 = 1;

         for (int var13 = var2.length; var12 < var13; var12++) {
            int var14 = var2[var12] & 255;
            byte var15 = this.field_7808[var14 * 3 + 0];
            byte var16 = this.field_7808[var14 * 3 + 1];
            byte var17 = this.field_7808[var14 * 3 + 2];
            byte var18 = this.field_7800[var14];
            var1.put(var17).put(var16).put(var15).put(var18);
         }
      }
   }

   private void method_6654(byte[] var1, byte[] var2) {
      byte var5 = 1;

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

   private void method_6631(byte[] var1, byte[] var2) {
      byte var5 = 1;

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

   private void method_6642(byte[] var1, byte[] var2) {
      byte var5 = 1;

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

   private void method_6662(byte[] var1, byte[] var2) throws IOException {
      switch (var1[0]) {
         case 0:
            break;
         case 1:
            this.method_6647(var1);
            break;
         case 2:
            this.method_6628(var1, var2);
            break;
         case 3:
            this.method_6636(var1, var2);
            break;
         case 4:
            this.method_6650(var1, var2);
            break;
         default:
            throw new IOException("invalide filter type in scanline: " + var1[0]);
      }
   }

   private void method_6647(byte[] var1) {
      int var4 = this.field_7803;
      int var5 = var4 + 1;

      for (int var6 = var1.length; var5 < var6; var5++) {
         var1[var5] += var1[var5 - var4];
      }
   }

   private void method_6628(byte[] var1, byte[] var2) {
      int var5 = this.field_7803;
      int var6 = 1;

      for (int var7 = var1.length; var6 < var7; var6++) {
         var1[var6] += var2[var6];
      }
   }

   private void method_6636(byte[] var1, byte[] var2) {
      int var5 = this.field_7803;

      int var6;
      for (var6 = 1; var6 <= var5; var6++) {
         var1[var6] += (byte)((var2[var6] & 255) >>> 1);
      }

      for (int var7 = var1.length; var6 < var7; var6++) {
         var1[var6] += (byte)((var2[var6] & 255) + (var1[var6 - var5] & 255) >>> 1);
      }
   }

   private void method_6650(byte[] var1, byte[] var2) {
      int var5 = this.field_7803;

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

   private void method_6665() throws IOException {
      this.method_6627(13);
      this.method_6633(this.field_7781, 0, 13);
      this.field_7780 = this.method_6645(this.field_7781, 0);
      this.field_7791 = this.method_6645(this.field_7781, 4);
      this.field_7807 = this.field_7781[8] & 255;
      this.field_7797 = this.field_7781[9] & 255;
      label59:
      switch (this.field_7797) {
         case 0:
            if (this.field_7807 != 8) {
               throw new IOException("Unsupported bit depth: " + this.field_7807);
            }

            this.field_7803 = 1;
            break;
         case 1:
         case 5:
         default:
            throw new IOException("unsupported color format: " + this.field_7797);
         case 2:
            if (this.field_7807 != 8) {
               throw new IOException("Unsupported bit depth: " + this.field_7807);
            }

            this.field_7803 = 3;
            break;
         case 3:
            switch (this.field_7807) {
               case 1:
               case 2:
               case 4:
               case 8:
                  this.field_7803 = 1;
                  break label59;
               case 3:
               case 5:
               case 6:
               case 7:
               default:
                  throw new IOException("Unsupported bit depth: " + this.field_7807);
            }
         case 4:
            if (this.field_7807 != 8) {
               throw new IOException("Unsupported bit depth: " + this.field_7807);
            }

            this.field_7803 = 2;
            break;
         case 6:
            if (this.field_7807 != 8) {
               throw new IOException("Unsupported bit depth: " + this.field_7807);
            }

            this.field_7803 = 4;
      }

      if (this.field_7781[10] != 0) {
         throw new IOException("unsupported compression method");
      } else if (this.field_7781[11] != 0) {
         throw new IOException("unsupported filtering method");
      } else if (this.field_7781[12] != 0) {
         throw new IOException("unsupported interlace method");
      }
   }

   private void method_6634() throws IOException {
      int var3 = this.field_7782 / 3;
      if (var3 >= 1 && var3 <= 256 && this.field_7782 % 3 == 0) {
         this.field_7808 = new byte[var3 * 3];
         this.method_6633(this.field_7808, 0, this.field_7808.length);
      } else {
         throw new IOException("PLTE chunk has wrong length");
      }
   }

   private void method_6630() throws IOException {
      switch (this.field_7797) {
         case 0:
            this.method_6627(2);
            this.field_7778 = new byte[2];
            this.method_6633(this.field_7778, 0, 2);
         case 1:
         default:
            break;
         case 2:
            this.method_6627(6);
            this.field_7778 = new byte[6];
            this.method_6633(this.field_7778, 0, 6);
            break;
         case 3:
            if (this.field_7808 == null) {
               throw new IOException("tRNS chunk without PLTE chunk");
            }

            this.field_7800 = new byte[this.field_7808.length / 3];
            Arrays.fill(this.field_7800, (byte)-1);
            this.method_6633(this.field_7800, 0, this.field_7800.length);
      }
   }

   private void method_6646() throws IOException {
      if (this.field_7806 <= 0) {
         this.method_6652(this.field_7781, 0, 4);
         int var3 = this.method_6645(this.field_7781, 0);
         int var4 = (int)this.field_7794.getValue();
         if (var4 != var3) {
            throw new IOException("Invalid CRC");
         }
      } else {
         this.method_6638((long)(this.field_7806 + 4));
      }

      this.field_7806 = 0;
      this.field_7782 = 0;
      this.field_7801 = 0;
   }

   private void method_6640() throws IOException {
      this.method_6652(this.field_7781, 0, 8);
      this.field_7782 = this.method_6645(this.field_7781, 0);
      this.field_7801 = this.method_6645(this.field_7781, 4);
      this.field_7806 = this.field_7782;
      this.field_7794.reset();
      this.field_7794.update(this.field_7781, 4, 4);
   }

   private void method_6641(int var1) throws IOException {
      this.method_6640();
      if (this.field_7801 != var1) {
         throw new IOException("Expected chunk: " + Integer.toHexString(var1));
      }
   }

   private void method_6627(int var1) throws IOException {
      if (this.field_7782 != var1) {
         throw new IOException("Chunk has wrong size");
      }
   }

   private int method_6633(byte[] var1, int var2, int var3) throws IOException {
      if (var3 > this.field_7806) {
         var3 = this.field_7806;
      }

      this.method_6652(var1, var2, var3);
      this.field_7794.update(var1, var2, var3);
      this.field_7806 -= var3;
      return var3;
   }

   private void method_6643(Inflater var1) throws IOException {
      while (this.field_7806 == 0) {
         this.method_6646();
         this.method_6641(1229209940);
      }

      int var4 = this.method_6633(this.field_7781, 0, this.field_7781.length);
      var1.setInput(this.field_7781, 0, var4);
   }

   private void method_6637(Inflater var1, byte[] var2, int var3, int var4) throws IOException {
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

               this.method_6643(var1);
            } else {
               var3 += var7;
               var4 -= var7;
            }
         } while (var4 > 0);
      } catch (DataFormatException var8) {
         throw (IOException)new IOException("inflate error").initCause(var8);
      }
   }

   private void method_6652(byte[] var1, int var2, int var3) throws IOException {
      while (true) {
         int var6 = this.field_7805.read(var1, var2, var3);
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

   private int method_6645(byte[] var1, int var2) {
      return var1[var2] << 24 | (var1[var2 + 1] & 0xFF) << 16 | (var1[var2 + 2] & 0xFF) << 8 | var1[var2 + 3] & 0xFF;
   }

   private void method_6638(long var1) throws IOException {
      while (var1 > 0L) {
         long var5 = this.field_7805.skip(var1);
         if (var5 < 0L) {
            throw new EOFException();
         }

         var1 -= var5;
      }
   }

   private static boolean method_6657(byte[] var0) {
      for (int var3 = 0; var3 < field_7796.length; var3++) {
         if (var0[var3] != field_7796[var3]) {
            return false;
         }
      }

      return true;
   }
}
