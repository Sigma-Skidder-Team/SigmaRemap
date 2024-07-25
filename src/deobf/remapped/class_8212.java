package remapped;

import jaco.mp3.resources.BitstreamException;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

public final class class_8212 implements class_162 {
   public static byte field_42014 = 0;
   public static byte field_42010 = 1;
   private static final int field_42002 = 433;
   private final int[] field_42001 = new int[433];
   private int field_42011;
   private byte[] field_42003 = new byte[1732];
   private int field_42008;
   private int field_42000;
   private int field_42009;
   private int field_42004 = 0;
   private boolean field_42017;
   private final int[] field_42006 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071};
   private final PushbackInputStream field_42018;
   private final class_1915 field_42007 = new class_1915();
   private final byte[] field_42013 = new byte[4];
   private class_4546[] field_42012 = new class_4546[1];
   private byte[] field_42005 = null;
   private boolean field_42015 = true;

   public class_8212(InputStream var1) {
      if (var1 != null) {
         BufferedInputStream var3 = new BufferedInputStream(var1);
         this.method_37606(var3);
         this.field_42015 = true;
         this.field_42018 = new PushbackInputStream(var3, 1732);
         this.method_37604();
      } else {
         throw new NullPointerException("in");
      }
   }

   public int method_37612() {
      return this.field_42004;
   }

   private void method_37606(InputStream var1) {
      int var4 = -1;

      try {
         var1.mark(10);
         var4 = this.method_37596(var1);
         this.field_42004 = var4;
      } catch (IOException var16) {
      } finally {
         try {
            var1.reset();
         } catch (IOException var14) {
         }
      }

      try {
         if (var4 > 0) {
            this.field_42005 = new byte[var4];
            var1.read(this.field_42005, 0, this.field_42005.length);
         }
      } catch (IOException var15) {
      }
   }

   private int method_37596(InputStream var1) throws IOException {
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

   public InputStream method_37615() {
      return this.field_42005 != null ? new ByteArrayInputStream(this.field_42005) : null;
   }

   public void method_37601() throws BitstreamException {
      try {
         this.field_42018.close();
      } catch (IOException var4) {
         throw this.method_37608(258, var4);
      }
   }

   public class_1915 method_37592() throws BitstreamException {
      class_1915 var3 = null;

      try {
         var3 = this.method_37599();
         if (this.field_42015) {
            var3.method_8689(this.field_42003);
            this.field_42015 = false;
         }
      } catch (class_3731 var7) {
         if (var7.method_17285() == 261) {
            try {
               this.method_37604();
               var3 = this.method_37599();
            } catch (class_3731 var6) {
               if (var6.method_17285() != 260) {
                  throw this.method_37608(var6.method_17285(), var6);
               }
            }
         } else if (var7.method_17285() != 260) {
            throw this.method_37608(var7.method_17285(), var7);
         }
      }

      return var3;
   }

   private class_1915 method_37599() throws BitstreamException {
      if (this.field_42011 == -1) {
         this.method_37605();
      }

      return this.field_42007;
   }

   private void method_37605() throws BitstreamException {
      this.field_42007.method_8691(this, this.field_42012);
   }

   public void method_37597() throws BitstreamException {
      if (this.field_42008 == -1 && this.field_42000 == -1 && this.field_42011 > 0) {
         try {
            this.field_42018.unread(this.field_42003, 0, this.field_42011);
         } catch (IOException var4) {
            throw this.method_37607(258);
         }
      }
   }

   public void method_37604() {
      this.field_42011 = -1;
      this.field_42008 = -1;
      this.field_42000 = -1;
   }

   public boolean method_37600(int var1) throws BitstreamException {
      int var4 = this.method_37598(this.field_42013, 0, 4);
      int var5 = this.field_42013[0] << 24 & 0xFF000000
         | this.field_42013[1] << 16 & 0xFF0000
         | this.field_42013[2] << 8 & 0xFF00
         | this.field_42013[3] << 0 & 0xFF;

      try {
         this.field_42018.unread(this.field_42013, 0, var4);
      } catch (IOException var7) {
      }

      boolean var6 = false;
      switch (var4) {
         case 0:
            var6 = true;
            break;
         case 4:
            var6 = this.method_37594(var5, var1, this.field_42009);
      }

      return var6;
   }

   public int method_37614(int var1) {
      return this.method_37602(var1);
   }

   public int method_37595(int var1) {
      return this.method_37602(var1);
   }

   public class_3731 method_37607(int var1) {
      return new class_3731(var1, null);
   }

   public class_3731 method_37608(int var1, Throwable var2) {
      return new class_3731(var1, var2);
   }

   public int method_37593(byte var1) throws BitstreamException {
      int var4 = this.method_37598(this.field_42013, 0, 3);
      if (var4 == 3) {
         int var5 = this.field_42013[0] << 16 & 0xFF0000 | this.field_42013[1] << 8 & 0xFF00 | this.field_42013[2] << 0 & 0xFF;

         boolean var6;
         do {
            var5 <<= 8;
            if (this.method_37598(this.field_42013, 3, 1) != 1) {
               throw this.method_37608(260, null);
            }

            var5 |= this.field_42013[3] & 255;
            var6 = this.method_37594(var5, var1, this.field_42009);
         } while (!var6);

         return var5;
      } else {
         throw this.method_37608(260, null);
      }
   }

   public boolean method_37594(int var1, int var2, int var3) {
      boolean var6 = false;
      if (var2 != field_42014) {
         var6 = (var1 & -521216) == var3 && (var1 & 192) == 192 == this.field_42017;
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

   public int method_37611(int var1) throws BitstreamException {
      int var4 = 0;
      var4 = this.method_37609(this.field_42003, 0, var1);
      this.field_42011 = var1;
      this.field_42008 = -1;
      this.field_42000 = -1;
      return var4;
   }

   public void method_37613() throws BitstreamException {
      int var3 = 0;
      byte[] var4 = this.field_42003;
      int var5 = this.field_42011;

      for (byte var6 = 0; var6 < var5; var6 += 4) {
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

         this.field_42001[var3++] = var8 << 24 & 0xFF000000 | var9 << 16 & 0xFF0000 | var10 << 8 & 0xFF00 | var11 & 255;
      }

      this.field_42008 = 0;
      this.field_42000 = 0;
   }

   public int method_37602(int var1) {
      int var4 = 0;
      int var5 = this.field_42000 + var1;
      if (this.field_42008 < 0) {
         this.field_42008 = 0;
      }

      if (var5 > 32) {
         int var6 = this.field_42001[this.field_42008] & 65535;
         this.field_42008++;
         int var7 = this.field_42001[this.field_42008] & -65536;
         var4 = var6 << 16 & -65536 | var7 >>> 16 & 65535;
         var4 >>>= 48 - var5;
         var4 &= this.field_42006[var1];
         this.field_42000 = var5 - 32;
         return var4;
      } else {
         var4 = this.field_42001[this.field_42008] >>> 32 - var5 & this.field_42006[var1];
         if ((this.field_42000 += var1) == 32) {
            this.field_42000 = 0;
            this.field_42008++;
         }

         return var4;
      }
   }

   public void method_37610(int var1) {
      this.field_42009 = var1 & -193;
      this.field_42017 = (var1 & 192) == 192;
   }

   private int method_37609(byte[] var1, int var2, int var3) throws BitstreamException {
      int var6 = 0;

      try {
         while (var3 > 0) {
            int var7 = this.field_42018.read(var1, var2, var3);
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
         throw this.method_37608(258, var8);
      }
   }

   private int method_37598(byte[] var1, int var2, int var3) throws BitstreamException {
      int var6 = 0;

      try {
         while (var3 > 0) {
            int var7 = this.field_42018.read(var1, var2, var3);
            if (var7 == -1) {
               break;
            }

            var6 += var7;
            var2 += var7;
            var3 -= var7;
         }

         return var6;
      } catch (IOException var8) {
         throw this.method_37608(258, var8);
      }
   }
}
