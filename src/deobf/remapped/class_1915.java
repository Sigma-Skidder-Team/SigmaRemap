package remapped;

import jaco.mp3.resources.BitstreamException;

public final class class_1915 {
   public static final int[][] field_9779 = new int[][]{{22050, 24000, 16000, 1}, {44100, 48000, 32000, 1}, {11025, 12000, 8000, 1}};
   public static final int field_9776 = 0;
   public static final int field_9743 = 2;
   public static final int field_9768 = 1;
   public static final int field_9763 = 0;
   public static final int field_9747 = 1;
   public static final int field_9758 = 2;
   public static final int field_9745 = 3;
   public static final int field_9759 = 0;
   public static final int field_9749 = 1;
   public static final int field_9744 = 2;
   private int field_9772;
   private int field_9753;
   private int field_9762;
   private int field_9778;
   private int field_9761;
   private int field_9764;
   private int field_9756;
   private int field_9770;
   private int field_9755;
   private int field_9773;
   private boolean field_9766;
   private boolean field_9774;
   private double[] field_9754 = new double[]{-1.0, 384.0, 1152.0, 1152.0};
   private boolean field_9748;
   private int field_9746;
   private int field_9767;
   private int field_9750;
   private byte[] field_9769;
   private byte field_9771 = class_8212.field_42014;
   private class_4546 field_9751;
   public short field_9760;
   public int field_9742;
   public int field_9775;
   private int field_9752 = -1;
   public static final int[][][] field_9777 = new int[][][]{
      {
            {0, 32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000, 0},
            {0, 8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 0},
            {0, 8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 0}
      },
      {
            {0, 32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000, 0},
            {0, 32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000, 0},
            {0, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 0}
      },
      {
            {0, 32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000, 0},
            {0, 8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 0},
            {0, 8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 0}
      }
   };
   public static final String[][][] field_9757 = new String[][][]{
      {
            {
                  "free format",
                  "32 kbit/s",
                  "48 kbit/s",
                  "56 kbit/s",
                  "64 kbit/s",
                  "80 kbit/s",
                  "96 kbit/s",
                  "112 kbit/s",
                  "128 kbit/s",
                  "144 kbit/s",
                  "160 kbit/s",
                  "176 kbit/s",
                  "192 kbit/s",
                  "224 kbit/s",
                  "256 kbit/s",
                  "forbidden"
            },
            {
                  "free format",
                  "8 kbit/s",
                  "16 kbit/s",
                  "24 kbit/s",
                  "32 kbit/s",
                  "40 kbit/s",
                  "48 kbit/s",
                  "56 kbit/s",
                  "64 kbit/s",
                  "80 kbit/s",
                  "96 kbit/s",
                  "112 kbit/s",
                  "128 kbit/s",
                  "144 kbit/s",
                  "160 kbit/s",
                  "forbidden"
            },
            {
                  "free format",
                  "8 kbit/s",
                  "16 kbit/s",
                  "24 kbit/s",
                  "32 kbit/s",
                  "40 kbit/s",
                  "48 kbit/s",
                  "56 kbit/s",
                  "64 kbit/s",
                  "80 kbit/s",
                  "96 kbit/s",
                  "112 kbit/s",
                  "128 kbit/s",
                  "144 kbit/s",
                  "160 kbit/s",
                  "forbidden"
            }
      },
      {
            {
                  "free format",
                  "32 kbit/s",
                  "64 kbit/s",
                  "96 kbit/s",
                  "128 kbit/s",
                  "160 kbit/s",
                  "192 kbit/s",
                  "224 kbit/s",
                  "256 kbit/s",
                  "288 kbit/s",
                  "320 kbit/s",
                  "352 kbit/s",
                  "384 kbit/s",
                  "416 kbit/s",
                  "448 kbit/s",
                  "forbidden"
            },
            {
                  "free format",
                  "32 kbit/s",
                  "48 kbit/s",
                  "56 kbit/s",
                  "64 kbit/s",
                  "80 kbit/s",
                  "96 kbit/s",
                  "112 kbit/s",
                  "128 kbit/s",
                  "160 kbit/s",
                  "192 kbit/s",
                  "224 kbit/s",
                  "256 kbit/s",
                  "320 kbit/s",
                  "384 kbit/s",
                  "forbidden"
            },
            {
                  "free format",
                  "32 kbit/s",
                  "40 kbit/s",
                  "48 kbit/s",
                  "56 kbit/s",
                  "64 kbit/s",
                  "80 kbit/s",
                  "96 kbit/s",
                  "112 kbit/s",
                  "128 kbit/s",
                  "160 kbit/s",
                  "192 kbit/s",
                  "224 kbit/s",
                  "256 kbit/s",
                  "320 kbit/s",
                  "forbidden"
            }
      },
      {
            {
                  "free format",
                  "32 kbit/s",
                  "48 kbit/s",
                  "56 kbit/s",
                  "64 kbit/s",
                  "80 kbit/s",
                  "96 kbit/s",
                  "112 kbit/s",
                  "128 kbit/s",
                  "144 kbit/s",
                  "160 kbit/s",
                  "176 kbit/s",
                  "192 kbit/s",
                  "224 kbit/s",
                  "256 kbit/s",
                  "forbidden"
            },
            {
                  "free format",
                  "8 kbit/s",
                  "16 kbit/s",
                  "24 kbit/s",
                  "32 kbit/s",
                  "40 kbit/s",
                  "48 kbit/s",
                  "56 kbit/s",
                  "64 kbit/s",
                  "80 kbit/s",
                  "96 kbit/s",
                  "112 kbit/s",
                  "128 kbit/s",
                  "144 kbit/s",
                  "160 kbit/s",
                  "forbidden"
            },
            {
                  "free format",
                  "8 kbit/s",
                  "16 kbit/s",
                  "24 kbit/s",
                  "32 kbit/s",
                  "40 kbit/s",
                  "48 kbit/s",
                  "56 kbit/s",
                  "64 kbit/s",
                  "80 kbit/s",
                  "96 kbit/s",
                  "112 kbit/s",
                  "128 kbit/s",
                  "144 kbit/s",
                  "160 kbit/s",
                  "forbidden"
            }
      }
   };

   @Override
   public String toString() {
      StringBuffer var3 = new StringBuffer(200);
      var3.append("Layer ");
      var3.append(this.method_8708());
      var3.append(" frame ");
      var3.append(this.method_8714());
      var3.append(' ');
      var3.append(this.method_8705());
      if (!this.method_8693()) {
         var3.append(" no");
      }

      var3.append(" checksums");
      var3.append(' ');
      var3.append(this.method_8686());
      var3.append(',');
      var3.append(' ');
      var3.append(this.method_8699());
      return var3.toString();
   }

   public void method_8691(class_8212 var1, class_4546[] var2) throws BitstreamException {
      boolean var5 = false;

      int var6;
      do {
         var6 = var1.method_37593(this.field_9771);
         this.field_9752 = var6;
         if (this.field_9771 == class_8212.field_42014) {
            this.field_9764 = var6 >>> 19 & 1;
            if ((var6 >>> 20 & 1) == 0) {
               if (this.field_9764 != 0) {
                  throw var1.method_37607(256);
               }

               this.field_9764 = 2;
            }

            if ((this.field_9770 = var6 >>> 10 & 3) == 3) {
               throw var1.method_37607(256);
            }
         }

         this.field_9772 = 4 - (var6 >>> 17) & 3;
         this.field_9753 = var6 >>> 16 & 1;
         this.field_9762 = var6 >>> 12 & 15;
         this.field_9778 = var6 >>> 9 & 1;
         this.field_9756 = var6 >>> 6 & 3;
         this.field_9761 = var6 >>> 4 & 3;
         if (this.field_9756 != 1) {
            this.field_9773 = 0;
         } else {
            this.field_9773 = (this.field_9761 << 2) + 4;
         }

         if ((var6 >>> 3 & 1) == 1) {
            this.field_9766 = true;
         }

         if ((var6 >>> 2 & 1) == 1) {
            this.field_9774 = true;
         }

         if (this.field_9772 != 1) {
            int var7 = this.field_9762;
            if (this.field_9756 != 3) {
               if (var7 != 4) {
                  var7 -= 4;
               } else {
                  var7 = 1;
               }
            }

            if (var7 != 1 && var7 != 2) {
               if (this.field_9770 != 1 && (var7 < 3 || var7 > 5)) {
                  this.field_9755 = 30;
               } else {
                  this.field_9755 = 27;
               }
            } else if (this.field_9770 != 2) {
               this.field_9755 = 8;
            } else {
               this.field_9755 = 12;
            }
         } else {
            this.field_9755 = 32;
         }

         if (this.field_9773 > this.field_9755) {
            this.field_9773 = this.field_9755;
         }

         this.method_8710();
         int var8 = var1.method_37611(this.field_9742);
         if (this.field_9742 >= 0 && var8 != this.field_9742) {
            throw var1.method_37607(261);
         }

         if (!var1.method_37600(this.field_9771)) {
            var1.method_37597();
         } else {
            if (this.field_9771 == class_8212.field_42014) {
               this.field_9771 = class_8212.field_42010;
               var1.method_37610(var6 & -521024);
            }

            var5 = true;
         }
      } while (!var5);

      var1.method_37613();
      if (this.field_9753 != 0) {
         var2[0] = null;
      } else {
         this.field_9760 = (short)var1.method_37602(16);
         if (this.field_9751 == null) {
            this.field_9751 = new class_4546();
         }

         this.field_9751.method_21089(var6, 16);
         var2[0] = this.field_9751;
      }

      if (this.field_9770 != 0) {
      }
   }

   public void method_8689(byte[] var1) throws BitstreamException {
      String var4 = "Xing";
      byte[] var5 = new byte[4];
      byte var6 = 0;
      if (this.field_9764 == 1) {
         if (this.field_9756 == 3) {
            var6 = 17;
         } else {
            var6 = 32;
         }
      } else if (this.field_9756 == 3) {
         var6 = 9;
      } else {
         var6 = 17;
      }

      try {
         System.arraycopy(var1, var6, var5, 0, 4);
         if (var4.equals(new String(var5))) {
            this.field_9748 = true;
            this.field_9746 = -1;
            this.field_9750 = -1;
            this.field_9767 = -1;
            this.field_9769 = new byte[100];
            int var7 = 4;
            byte[] var8 = new byte[4];
            System.arraycopy(var1, var6 + var7, var8, 0, var8.length);
            var7 += var8.length;
            if ((var8[3] & 1) != 0) {
               System.arraycopy(var1, var6 + var7, var5, 0, var5.length);
               this.field_9746 = var5[0] << 24 & 0xFF000000 | var5[1] << 16 & 0xFF0000 | var5[2] << 8 & 0xFF00 | var5[3] & 255;
               var7 += 4;
            }

            if ((var8[3] & 2) != 0) {
               System.arraycopy(var1, var6 + var7, var5, 0, var5.length);
               this.field_9750 = var5[0] << 24 & 0xFF000000 | var5[1] << 16 & 0xFF0000 | var5[2] << 8 & 0xFF00 | var5[3] & 255;
               var7 += 4;
            }

            if ((var8[3] & 4) != 0) {
               System.arraycopy(var1, var6 + var7, this.field_9769, 0, this.field_9769.length);
               var7 += this.field_9769.length;
            }

            if ((var8[3] & 8) != 0) {
               System.arraycopy(var1, var6 + var7, var5, 0, var5.length);
               this.field_9767 = var5[0] << 24 & 0xFF000000 | var5[1] << 16 & 0xFF0000 | var5[2] << 8 & 0xFF00 | var5[3] & 255;
               var7 += 4;
            }
         }
      } catch (ArrayIndexOutOfBoundsException var10) {
         throw new class_3731("XingVBRHeader Corrupted", var10);
      }

      String var15 = "VBRI";
      var6 = 32;

      try {
         System.arraycopy(var1, var6, var5, 0, 4);
         if (var15.equals(new String(var5))) {
            this.field_9748 = true;
            this.field_9746 = -1;
            this.field_9750 = -1;
            this.field_9767 = -1;
            this.field_9769 = new byte[100];
            int var16 = 10;
            System.arraycopy(var1, var6 + var16, var5, 0, var5.length);
            this.field_9750 = var5[0] << 24 & 0xFF000000 | var5[1] << 16 & 0xFF0000 | var5[2] << 8 & 0xFF00 | var5[3] & 255;
            var16 += 4;
            System.arraycopy(var1, var6 + var16, var5, 0, var5.length);
            this.field_9746 = var5[0] << 24 & 0xFF000000 | var5[1] << 16 & 0xFF0000 | var5[2] << 8 & 0xFF00 | var5[3] & 255;
            var16 += 4;
         }
      } catch (ArrayIndexOutOfBoundsException var9) {
         throw new class_3731("VBRIVBRHeader Corrupted", var9);
      }
   }

   public int method_8683() {
      return this.field_9764;
   }

   public int method_8696() {
      return this.field_9772;
   }

   public int method_8688() {
      return this.field_9762;
   }

   public int method_8698() {
      return this.field_9770;
   }

   public int method_8707() {
      return field_9779[this.field_9764][this.field_9770];
   }

   public int method_8685() {
      return this.field_9756;
   }

   public boolean method_8693() {
      return this.field_9753 == 0;
   }

   public boolean method_8709() {
      return this.field_9766;
   }

   public boolean method_8697() {
      return this.field_9774;
   }

   public boolean method_8713() {
      return this.field_9748;
   }

   public int method_8711() {
      return this.field_9767;
   }

   public byte[] method_8687() {
      return this.field_9769;
   }

   public boolean method_8684() {
      return this.field_9760 == this.field_9751.method_21088();
   }

   public boolean method_8715() {
      return this.field_9778 != 0;
   }

   public int method_8701() {
      return this.field_9775;
   }

   public int method_8706() {
      return this.field_9761;
   }

   public int method_8710() {
      if (this.field_9772 != 1) {
         this.field_9742 = 144 * field_9777[this.field_9764][this.field_9772 - 1][this.field_9762] / field_9779[this.field_9764][this.field_9770];
         if (this.field_9764 == 0 || this.field_9764 == 2) {
            this.field_9742 >>= 1;
         }

         if (this.field_9778 != 0) {
            this.field_9742++;
         }

         if (this.field_9772 != 3) {
            this.field_9775 = 0;
         } else if (this.field_9764 != 1) {
            this.field_9775 = this.field_9742 - (this.field_9756 != 3 ? 17 : 9) - (this.field_9753 == 0 ? 2 : 0) - 4;
         } else {
            this.field_9775 = this.field_9742 - (this.field_9756 != 3 ? 32 : 17) - (this.field_9753 == 0 ? 2 : 0) - 4;
         }
      } else {
         this.field_9742 = 12 * field_9777[this.field_9764][0][this.field_9762] / field_9779[this.field_9764][this.field_9770];
         if (this.field_9778 != 0) {
            this.field_9742++;
         }

         this.field_9742 <<= 2;
         this.field_9775 = 0;
      }

      this.field_9742 -= 4;
      return this.field_9742;
   }

   public int method_8694(int var1) {
      if (!this.field_9748) {
         return this.field_9742 + 4 - this.field_9778 != 0 ? var1 / (this.field_9742 + 4 - this.field_9778) : 0;
      } else {
         return this.field_9746;
      }
   }

   public int method_8682(int var1) {
      if (!this.field_9748) {
         return this.field_9742 + 5 - this.field_9778 != 0 ? var1 / (this.field_9742 + 5 - this.field_9778) : 0;
      } else {
         return this.field_9746;
      }
   }

   public float method_8695() {
      if (!this.field_9748) {
         float[][] var3 = new float[][]{{8.707483F, 8.0F, 12.0F}, {26.12245F, 24.0F, 36.0F}, {26.12245F, 24.0F, 36.0F}};
         return var3[this.field_9772 - 1][this.field_9770];
      } else {
         double var4 = this.field_9754[this.method_8696()] / (double)this.method_8707();
         if (this.field_9764 == 0 || this.field_9764 == 2) {
            var4 /= 2.0;
         }

         return (float)(var4 * 1000.0);
      }
   }

   public float method_8702(int var1) {
      return (float)this.method_8694(var1) * this.method_8695();
   }

   public int method_8704() {
      return this.field_9752;
   }

   public String method_8708() {
      switch (this.field_9772) {
         case 1:
            return "I";
         case 2:
            return "II";
         case 3:
            return "III";
         default:
            return null;
      }
   }

   public String method_8699() {
      return !this.field_9748 ? field_9757[this.field_9764][this.field_9772 - 1][this.field_9762] : Integer.toString(this.method_8700() / 1000) + " kb/s";
   }

   public int method_8700() {
      return !this.field_9748
         ? field_9777[this.field_9764][this.field_9772 - 1][this.field_9762]
         : (int)((float)(this.field_9750 * 8) / (this.method_8695() * (float)this.field_9746)) * 1000;
   }

   public int method_8692() {
      return field_9777[this.field_9764][this.field_9772 - 1][this.field_9762];
   }

   public String method_8686() {
      switch (this.field_9770) {
         case 0:
            if (this.field_9764 == 1) {
               return "44.1 kHz";
            } else {
               if (this.field_9764 == 0) {
                  return "22.05 kHz";
               }

               return "11.025 kHz";
            }
         case 1:
            if (this.field_9764 == 1) {
               return "48 kHz";
            } else {
               if (this.field_9764 == 0) {
                  return "24 kHz";
               }

               return "12 kHz";
            }
         case 2:
            if (this.field_9764 == 1) {
               return "32 kHz";
            } else {
               if (this.field_9764 == 0) {
                  return "16 kHz";
               }

               return "8 kHz";
            }
         default:
            return null;
      }
   }

   public String method_8714() {
      switch (this.field_9756) {
         case 0:
            return "Stereo";
         case 1:
            return "Joint stereo";
         case 2:
            return "Dual channel";
         case 3:
            return "Single channel";
         default:
            return null;
      }
   }

   public String method_8705() {
      switch (this.field_9764) {
         case 0:
            return "MPEG-2 LSF";
         case 1:
            return "MPEG-1";
         case 2:
            return "MPEG-2.5 LSF";
         default:
            return null;
      }
   }

   public int method_8703() {
      return this.field_9755;
   }

   public int method_8690() {
      return this.field_9773;
   }
}
