package mapped;



import java.io.*;

public final class Class2443 implements Class2442 {
   public static byte field16505 = 0;
   public static byte field16506 = 1;
   private static final int field16507 = 433;
   private final int[] field16508 = new int[433];
   private int field16509;
   private byte[] field16510 = new byte[1732];
   private int field16511;
   private int field16512;
   private int field16513;
   private int field16514 = 0;
   private boolean field16515;
   private final int[] field16516 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071};
   private final PushbackInputStream field16517;
   private final Class7413 field16518 = new Class7413();
   private final byte[] field16519 = new byte[4];
   private Class8428[] field16520 = new Class8428[1];
   private byte[] field16521 = null;
   private boolean field16522 = true;

   public Class2443(InputStream var1) {
      if (var1 != null) {
         BufferedInputStream var3 = new BufferedInputStream(var1);
         this.method10433(var3);
         this.field16522 = true;
         this.field16517 = new PushbackInputStream(var3, 1732);
         this.method10441();
      } else {
         throw new NullPointerException("in");
      }
   }

   public int method10432() {
      return this.field16514;
   }

   private void method10433(InputStream var1) {
      int var4 = -1;

      try {
         var1.mark(10);
         var4 = this.method10434(var1);
         this.field16514 = var4;
      } catch (IOException var16) {
      } finally {
         try {
            var1.reset();
         } catch (IOException var14) {
         }
      }

      try {
         if (var4 > 0) {
            this.field16521 = new byte[var4];
            var1.read(this.field16521, 0, this.field16521.length);
         }
      } catch (IOException var15) {
      }
   }

   private int method10434(InputStream var1) throws IOException {
      byte[] var4 = new byte[4];
      int var5 = -10;
      var1.read(var4, 0, 3);
      if (var4[0] == 73 && var4[1] == 68 && var4[2] == 51) {
         var1.read(var4, 0, 3);
         byte var6 = var4[0];
         byte var7 = var4[1];
         var1.read(var4, 0, 4);
         var5 = (var4[0] << 21) + (var4[1] << 14) + (var4[2] << 7) + var4[3];
      }

      return var5 + 10;
   }

   public InputStream method10435() {
      return this.field16521 != null ? new ByteArrayInputStream(this.field16521) : null;
   }

   public void method10436() throws Class2444 {
      try {
         this.field16517.close();
      } catch (IOException var4) {
         throw this.method10446(258, var4);
      }
   }

   public Class7413 method10437() throws Class2444 {
      Class7413 var3 = null;

      try {
         var3 = this.method10438();
         if (this.field16522) {
            var3.method23660(this.field16510);
            this.field16522 = false;
         }
      } catch (Class2444 var7) {
         if (var7.method10455() == 261) {
            try {
               this.method10441();
               var3 = this.method10438();
            } catch (Class2444 var6) {
               if (var6.method10455() != 260) {
                  throw this.method10446(var6.method10455(), var6);
               }
            }
         } else if (var7.method10455() != 260) {
            throw this.method10446(var7.method10455(), var7);
         }
      }

      return var3;
   }

   private Class7413 method10438() throws Class2444 {
      if (this.field16509 == -1) {
         this.method10439();
      }

      return this.field16518;
   }

   private void method10439() throws Class2444 {
      this.field16518.method23659(this, this.field16520);
   }

   public void method10440() throws Class2444 {
      if (this.field16511 == -1 && this.field16512 == -1 && this.field16509 > 0) {
         try {
            this.field16517.unread(this.field16510, 0, this.field16509);
         } catch (IOException var4) {
            throw this.method10445(258);
         }
      }
   }

   public void method10441() {
      this.field16509 = -1;
      this.field16511 = -1;
      this.field16512 = -1;
   }

   public boolean method10442(int var1) throws Class2444 {
      int var4 = this.method10454(this.field16519, 0, 4);
      int var5 = this.field16519[0] << 24 & 0xFF000000
         | this.field16519[1] << 16 & 0xFF0000
         | this.field16519[2] << 8 & 0xFF00
         | this.field16519[3] << 0 & 0xFF;

      try {
         this.field16517.unread(this.field16519, 0, var4);
      } catch (IOException var7) {
      }

      boolean var6 = false;
      switch (var4) {
         case 0:
            var6 = true;
            break;
         case 4:
            var6 = this.method10448(var5, var1, this.field16513);
      }

      return var6;
   }

   public int method10443(int var1) {
      return this.method10451(var1);
   }

   public int method10444(int var1) {
      return this.method10451(var1);
   }

   public Class2444 method10445(int var1) {
      return new Class2444(var1, null);
   }

   public Class2444 method10446(int var1, Throwable var2) {
      return new Class2444(var1, var2);
   }

   public int method10447(byte var1) throws Class2444 {
      int var4 = this.method10454(this.field16519, 0, 3);
      if (var4 == 3) {
         int var5 = this.field16519[0] << 16 & 0xFF0000 | this.field16519[1] << 8 & 0xFF00 | this.field16519[2] << 0 & 0xFF;

         boolean var6;
         do {
            var5 <<= 8;
            if (this.method10454(this.field16519, 3, 1) != 1) {
               throw this.method10446(260, null);
            }

            var5 |= this.field16519[3] & 255;
            var6 = this.method10448(var5, var1, this.field16513);
         } while (!var6);

         return var5;
      } else {
         throw this.method10446(260, null);
      }
   }

   public boolean method10448(int var1, int var2, int var3) {
      boolean var6 = false;
      if (var2 != field16505) {
         var6 = (var1 & -521216) == var3 && (var1 & 192) == 192 == this.field16515;
      } else {
         var6 = (var1 & -2097152) == -2097152;
      }

      if (var6) {
         var6 = (var1 >>> 10 & 3) != 3;
      }

      if (var6) {
         var6 = (var1 >>> 17 & 3) != 0;
      }

      if (var6) {
         var6 = (var1 >>> 19 & 3) != 1;
      }

      return var6;
   }

   public int method10449(int var1) throws Class2444 {
      int var4 = 0;
      var4 = this.method10453(this.field16510, 0, var1);
      this.field16509 = var1;
      this.field16511 = -1;
      this.field16512 = -1;
      return var4;
   }

   public void method10450() throws Class2444 {
      int var3 = 0;
      byte[] var4 = this.field16510;
      int var5 = this.field16509;

      for (int var6 = 0; var6 < var5; var6 += 4) {
         boolean var7 = false;
         byte var8 = 0;
         byte var9 = 0;
         byte var10 = 0;
         byte var11 = 0;
         var8 = var4[var6];
         if (var6 + 1 < var5) {
            var9 = var4[var6 + 1];
         }

         if (var6 + 2 < var5) {
            var10 = var4[var6 + 2];
         }

         if (var6 + 3 < var5) {
            var11 = var4[var6 + 3];
         }

         this.field16508[var3++] = var8 << 24 & 0xFF000000 | var9 << 16 & 0xFF0000 | var10 << 8 & 0xFF00 | var11 & 255;
      }

      this.field16511 = 0;
      this.field16512 = 0;
   }

   public int method10451(int var1) {
      int var4 = 0;
      int var5 = this.field16512 + var1;
      if (this.field16511 < 0) {
         this.field16511 = 0;
      }

      if (var5 > 32) {
         int var6 = this.field16508[this.field16511] & 65535;
         this.field16511++;
         int var7 = this.field16508[this.field16511] & -65536;
         var4 = var6 << 16 & -65536 | var7 >>> 16 & 65535;
         var4 >>>= 48 - var5;
         var4 &= this.field16516[var1];
         this.field16512 = var5 - 32;
         return var4;
      } else {
         var4 = this.field16508[this.field16511] >>> 32 - var5 & this.field16516[var1];
         if ((this.field16512 += var1) == 32) {
            this.field16512 = 0;
            this.field16511++;
         }

         return var4;
      }
   }

   public void method10452(int var1) {
      this.field16513 = var1 & -193;
      this.field16515 = (var1 & 192) == 192;
   }

   private int method10453(byte[] var1, int var2, int var3) throws Class2444 {
      int var6 = 0;

      try {
         while (var3 > 0) {
            int var7 = this.field16517.read(var1, var2, var3);
            if (var7 == -1) {
               while (var3-- > 0) {
                  var1[var2++] = 0;
               }
               break;
            }

            var6 += var7;
            var2 += var7;
            var3 -= var7;
         }

         return var6;
      } catch (IOException var8) {
         throw this.method10446(258, var8);
      }
   }

   private int method10454(byte[] var1, int var2, int var3) throws Class2444 {
      int var6 = 0;

      try {
         while (var3 > 0) {
            int var7 = this.field16517.read(var1, var2, var3);
            if (var7 == -1) {
               break;
            }

            var6 += var7;
            var2 += var7;
            var3 -= var7;
         }

         return var6;
      } catch (IOException var8) {
         throw this.method10446(258, var8);
      }
   }
}
