package mapped;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public final class Class1734 implements Class1735, Class1733, Cloneable {
   private static final byte[] field9420 = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
   public static final int field9421 = 65533;
   public Class9174 field9422;
   public long field9423;

   public long method7582() {
      return this.field9423;
   }

   @Override
   public Class1734 method7559() {
      return this;
   }

   @Override
   public Class1733 method7560(Class2003 var1) throws IOException {
      return null;
   }

   @Override
   public Class1733 method7561(byte[] var1) throws IOException {
      return null;
   }

   @Override
   public Class1733 method7562(byte[] var1, int var2, int var3) throws IOException {
      return null;
   }

   @Override
   public OutputStream method7581() {
      return new Class1757(this);
   }

   public Class1734 method7580() {
      return this;
   }

   @Override
   public Class1733 method7579() {
      return this;
   }

   @Override
   public boolean method7583() {
      return this.field9423 == 0L;
   }

   @Override
   public void method7584(long var1) throws EOFException {
      if (this.field9423 < var1) {
         throw new EOFException();
      }
   }

   @Override
   public boolean method7585(long var1) {
      return this.field9423 >= var1;
   }

   @Override
   public InputStream method7586() {
      return new Class1778(this);
   }

   public Class1734 method7587(OutputStream var1) throws IOException {
      return this.method7588(var1, 0L, this.field9423);
   }

   public Class1734 method7588(OutputStream var1, long var2, long var4) throws IOException {
      if (var1 == null) {
         throw new IllegalArgumentException("out == null");
      } else {
         Class4676.method14644(this.field9423, var2, var4);
         if (var4 == 0L) {
            return this;
         } else {
            Class9174 var8;
            for (var8 = this.field9422; var2 >= (long)(var8.field42123 - var8.field42122); var8 = var8.field42126) {
               var2 -= (long)(var8.field42123 - var8.field42122);
            }

            while (var4 > 0L) {
               int var9 = (int)((long)var8.field42122 + var2);
               int var10 = (int)Math.min((long)(var8.field42123 - var9), var4);
               var1.write(var8.field42121, var9, var10);
               var4 -= (long)var10;
               var2 = 0L;
               var8 = var8.field42126;
            }

            return this;
         }
      }
   }

   public Class1734 method7589(Class1734 var1, long var2, long var4) {
      if (var1 == null) {
         throw new IllegalArgumentException("out == null");
      } else {
         Class4676.method14644(this.field9423, var2, var4);
         if (var4 == 0L) {
            return this;
         } else {
            var1.field9423 += var4;

            Class9174 var8;
            for (var8 = this.field9422; var2 >= (long)(var8.field42123 - var8.field42122); var8 = var8.field42126) {
               var2 -= (long)(var8.field42123 - var8.field42122);
            }

            while (var4 > 0L) {
               Class9174 var9 = new Class9174(var8);
               var9.field42122 = (int)((long)var9.field42122 + var2);
               var9.field42123 = Math.min(var9.field42122 + (int)var4, var9.field42123);
               if (var1.field9422 != null) {
                  var1.field9422.field42127.method34281(var9);
               } else {
                  var1.field9422 = var9.field42126 = var9.field42127 = var9;
               }

               var4 -= (long)(var9.field42123 - var9.field42122);
               var2 = 0L;
               var8 = var8.field42126;
            }

            return this;
         }
      }
   }

   public Class1734 method7590(OutputStream var1) throws IOException {
      return this.method7591(var1, this.field9423);
   }

   public Class1734 method7591(OutputStream var1, long var2) throws IOException {
      if (var1 != null) {
         Class4676.method14644(this.field9423, 0L, var2);
         Class9174 var6 = this.field9422;

         while (var2 > 0L) {
            int var7 = (int)Math.min(var2, (long)(var6.field42123 - var6.field42122));
            var1.write(var6.field42121, var6.field42122, var7);
            var6.field42122 += var7;
            this.field9423 -= (long)var7;
            var2 -= (long)var7;
            if (var6.field42122 == var6.field42123) {
               Class9174 var8 = var6;
               this.field9422 = var6 = var6.method34280();
               Class5996.method18608(var8);
            }
         }

         return this;
      } else {
         throw new IllegalArgumentException("out == null");
      }
   }

   public Class1734 method7592(InputStream var1) throws IOException {
      this.method7594(var1, Long.MAX_VALUE, true);
      return this;
   }

   public Class1734 method7593(InputStream var1, long var2) throws IOException {
      if (var2 >= 0L) {
         this.method7594(var1, var2, false);
         return this;
      } else {
         throw new IllegalArgumentException("byteCount < 0: " + var2);
      }
   }

   private void method7594(InputStream var1, long var2, boolean var4) throws IOException {
      if (var1 == null) {
         throw new IllegalArgumentException("in == null");
      } else {
         while (var2 > 0L || var4) {
            Class9174 var7 = this.method7632(1);
            int var8 = (int)Math.min(var2, (long)(8192 - var7.field42123));
            int var9 = var1.read(var7.field42121, var7.field42123, var8);
            if (var9 == -1) {
               if (!var4) {
                  throw new EOFException();
               }

               return;
            }

            var7.field42123 += var9;
            this.field9423 += (long)var9;
            var2 -= (long)var9;
         }
      }
   }

   public long method7595() {
      long var3 = this.field9423;
      if (var3 != 0L) {
         Class9174 var5 = this.field9422.field42127;
         if (var5.field42123 < 8192 && var5.field42125) {
            var3 -= (long)(var5.field42123 - var5.field42122);
         }

         return var3;
      } else {
         return 0L;
      }
   }

   @Override
   public byte method7596() {
      if (this.field9423 != 0L) {
         Class9174 var3 = this.field9422;
         int var4 = var3.field42122;
         int var5 = var3.field42123;
         byte[] var6 = var3.field42121;
         byte var7 = var6[var4++];
         this.field9423--;
         if (var4 != var5) {
            var3.field42122 = var4;
         } else {
            this.field9422 = var3.method34280();
            Class5996.method18608(var3);
         }

         return var7;
      } else {
         throw new IllegalStateException("size == 0");
      }
   }

   public byte method7597(long var1) {
      Class4676.method14644(this.field9423, var1, 1L);
      Class9174 var5 = this.field9422;

      while (true) {
         int var6 = var5.field42123 - var5.field42122;
         if (var1 < (long)var6) {
            return var5.field42121[var5.field42122 + (int)var1];
         }

         var1 -= (long)var6;
         var5 = var5.field42126;
      }
   }

   @Override
   public short method7598() {
      if (this.field9423 >= 2L) {
         Class9174 var3 = this.field9422;
         int var4 = var3.field42122;
         int var5 = var3.field42123;
         if (var5 - var4 >= 2) {
            byte[] var10 = var3.field42121;
            int var7 = (var10[var4++] & 255) << 8 | var10[var4++] & 255;
            this.field9423 -= 2L;
            if (var4 != var5) {
               var3.field42122 = var4;
            } else {
               this.field9422 = var3.method34280();
               Class5996.method18608(var3);
            }

            return (short)var7;
         } else {
            int var6 = (this.method7596() & 255) << 8 | this.method7596() & 255;
            return (short)var6;
         }
      } else {
         throw new IllegalStateException("size < 2: " + this.field9423);
      }
   }

   @Override
   public int method7599() {
      if (this.field9423 >= 4L) {
         Class9174 var3 = this.field9422;
         int var4 = var3.field42122;
         int var5 = var3.field42123;
         if (var5 - var4 >= 4) {
            byte[] var6 = var3.field42121;
            int var7 = (var6[var4++] & 255) << 24 | (var6[var4++] & 255) << 16 | (var6[var4++] & 255) << 8 | var6[var4++] & 255;
            this.field9423 -= 4L;
            if (var4 != var5) {
               var3.field42122 = var4;
            } else {
               this.field9422 = var3.method34280();
               Class5996.method18608(var3);
            }

            return var7;
         } else {
            return (this.method7596() & 0xFF) << 24 | (this.method7596() & 0xFF) << 16 | (this.method7596() & 0xFF) << 8 | this.method7596() & 0xFF;
         }
      } else {
         throw new IllegalStateException("size < 4: " + this.field9423);
      }
   }

   @Override
   public long method7600() {
      if (this.field9423 >= 8L) {
         Class9174 var3 = this.field9422;
         int var4 = var3.field42122;
         int var5 = var3.field42123;
         if (var5 - var4 >= 8) {
            byte[] var6 = var3.field42121;
            long var7 = ((long)var6[var4++] & 255L) << 56
               | ((long)var6[var4++] & 255L) << 48
               | ((long)var6[var4++] & 255L) << 40
               | ((long)var6[var4++] & 255L) << 32
               | ((long)var6[var4++] & 255L) << 24
               | ((long)var6[var4++] & 255L) << 16
               | ((long)var6[var4++] & 255L) << 8
               | (long)var6[var4++] & 255L;
            this.field9423 -= 8L;
            if (var4 != var5) {
               var3.field42122 = var4;
            } else {
               this.field9422 = var3.method34280();
               Class5996.method18608(var3);
            }

            return var7;
         } else {
            return ((long)this.method7599() & 4294967295L) << 32 | (long)this.method7599() & 4294967295L;
         }
      } else {
         throw new IllegalStateException("size < 8: " + this.field9423);
      }
   }

   @Override
   public short method7601() {
      return Class4676.method14645(this.method7598());
   }

   @Override
   public int method7602() {
      return Class4676.method14646(this.method7599());
   }

   @Override
   public long method7603() {
      return Class4676.method14647(this.method7600());
   }

   @Override
   public long method7604() {
      if (this.field9423 == 0L) {
         throw new IllegalStateException("size == 0");
      } else {
         long var3 = 0L;
         int var5 = 0;
         boolean var6 = false;
         boolean var7 = false;
         long var8 = -922337203685477580L;
         long var10 = -7L;

         while (true) {
            Class9174 var12 = this.field9422;
            byte[] var13 = var12.field42121;
            int var14 = var12.field42122;
            int var15 = var12.field42123;

            while (true) {
               label95: {
                  if (var14 < var15) {
                     byte var16 = var13[var14];
                     if (var16 >= 48 && var16 <= 57) {
                        int var17 = 48 - var16;
                        if (var3 < var8 || var3 == var8 && (long)var17 < var10) {
                           Class1734 var18 = new Class1734().method7577(var3).method7570(var16);
                           if (!var6) {
                              var18.method7596();
                           }

                           throw new NumberFormatException("Number too large: " + var18.method7612());
                        }

                        var3 *= 10L;
                        var3 += (long)var17;
                        break label95;
                     }

                     if (var16 == 45 && var5 == 0) {
                        var6 = true;
                        var10--;
                        break label95;
                     }

                     if (var5 == 0) {
                        throw new NumberFormatException("Expected leading [0-9] or '-' character but was 0x" + Integer.toHexString(var16));
                     }

                     var7 = true;
                  }

                  if (var14 != var15) {
                     var12.field42122 = var14;
                  } else {
                     this.field9422 = var12.method34280();
                     Class5996.method18608(var12);
                  }

                  if (!var7 && this.field9422 != null) {
                     break;
                  }

                  this.field9423 -= (long)var5;
                  return !var6 ? -var3 : var3;
               }

               var14++;
               var5++;
            }
         }
      }
   }

   @Override
   public long method7605() {
      if (this.field9423 == 0L) {
         throw new IllegalStateException("size == 0");
      } else {
         long var3 = 0L;
         int var5 = 0;
         boolean var6 = false;

         do {
            Class9174 var7 = this.field9422;
            byte[] var8 = var7.field42121;
            int var9 = var7.field42122;

            int var10;
            for (var10 = var7.field42123; var9 < var10; var5++) {
               byte var11 = var8[var9];
               int var12;
               if (var11 >= 48 && var11 <= 57) {
                  var12 = var11 - 48;
               } else if (var11 >= 97 && var11 <= 102) {
                  var12 = var11 - 97 + 10;
               } else {
                  if (var11 < 65 || var11 > 70) {
                     if (var5 == 0) {
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + Integer.toHexString(var11));
                     }

                     var6 = true;
                     break;
                  }

                  var12 = var11 - 65 + 10;
               }

               if ((var3 & -1152921504606846976L) != 0L) {
                  Class1734 var13 = new Class1734().method7578(var3).method7570(var11);
                  throw new NumberFormatException("Number too large: " + var13.method7612());
               }

               var3 <<= 4;
               var3 |= (long)var12;
               var9++;
            }

            if (var9 != var10) {
               var7.field42122 = var9;
            } else {
               this.field9422 = var7.method34280();
               Class5996.method18608(var7);
            }
         } while (!var6 && this.field9422 != null);

         this.field9423 -= (long)var5;
         return var3;
      }
   }

   @Override
   public Class2003 method7606() {
      return new Class2003(this.method7621());
   }

   @Override
   public Class2003 method7607(long var1) throws EOFException {
      return new Class2003(this.method7622(var1));
   }

   @Override
   public int method7608(Class43 var1) {
      Class9174 var4 = this.field9422;
      if (var4 == null) {
         return var1.indexOf(Class2003.field13051);
      } else {
         Class2003[] var5 = var1.field94;
         int var6 = 0;

         for (int var7 = var5.length; var6 < var7; var6++) {
            Class2003 var8 = var5[var6];
            if (this.field9423 >= (long)var8.method8458() && this.method7643(var4, var4.field42122, var8, 0, var8.method8458())) {
               try {
                  this.method7627((long)var8.method8458());
                  return var6;
               } catch (EOFException var10) {
                  throw new AssertionError(var10);
               }
            }
         }

         return -1;
      }
   }

   public int method7609(Class43 var1) {
      Class9174 var4 = this.field9422;
      Class2003[] var5 = var1.field94;
      int var6 = 0;

      for (int var7 = var5.length; var6 < var7; var6++) {
         Class2003 var8 = var5[var6];
         int var9 = (int)Math.min(this.field9423, (long)var8.method8458());
         if (var9 == 0 || this.method7643(var4, var4.field42122, var8, 0, var9)) {
            return var6;
         }
      }

      return -1;
   }

   @Override
   public void method7610(Class1734 var1, long var2) throws EOFException {
      if (this.field9423 >= var2) {
         var1.method7540(this, var2);
      } else {
         var1.method7540(this, this.field9423);
         throw new EOFException();
      }
   }

   @Override
   public long method7611(Class1716 var1) throws IOException {
      long var4 = this.field9423;
      if (var4 > 0L) {
         var1.method7540(this, var4);
      }

      return var4;
   }

   @Override
   public String method7612() {
      try {
         return this.method7615(this.field9423, Class4676.field22245);
      } catch (EOFException var4) {
         throw new AssertionError(var4);
      }
   }

   @Override
   public String method7613(long var1) throws EOFException {
      return this.method7615(var1, Class4676.field22245);
   }

   @Override
   public String method7614(Charset var1) {
      try {
         return this.method7615(this.field9423, var1);
      } catch (EOFException var5) {
         throw new AssertionError(var5);
      }
   }

   @Override
   public String method7615(long var1, Charset var3) throws EOFException {
      Class4676.method14644(this.field9423, 0L, var1);
      if (var3 != null) {
         if (var1 <= 2147483647L) {
            if (var1 != 0L) {
               Class9174 var6 = this.field9422;
               if ((long)var6.field42122 + var1 <= (long)var6.field42123) {
                  String var7 = new String(var6.field42121, var6.field42122, (int)var1, var3);
                  var6.field42122 = (int)((long)var6.field42122 + var1);
                  this.field9423 -= var1;
                  if (var6.field42122 == var6.field42123) {
                     this.field9422 = var6.method34280();
                     Class5996.method18608(var6);
                  }

                  return var7;
               } else {
                  return new String(this.method7622(var1), var3);
               }
            } else {
               return "";
            }
         } else {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + var1);
         }
      } else {
         throw new IllegalArgumentException("charset == null");
      }
   }

   @Nullable
   @Override
   public String method7616() throws EOFException {
      long var3 = this.method7634((byte)10);
      if (var3 != -1L) {
         return this.method7619(var3);
      } else {
         return this.field9423 == 0L ? null : this.method7613(this.field9423);
      }
   }

   @Override
   public String method7617() throws EOFException {
      return this.method7618(Long.MAX_VALUE);
   }

   @Override
   public String method7618(long var1) throws EOFException {
      if (var1 >= 0L) {
         long var5 = var1 != Long.MAX_VALUE ? var1 + 1L : Long.MAX_VALUE;
         long var7 = this.method7636((byte)10, 0L, var5);
         if (var7 == -1L) {
            if (var5 < this.method7582() && this.method7597(var5 - 1L) == 13 && this.method7597(var5) == 10) {
               return this.method7619(var5);
            } else {
               Class1734 var9 = new Class1734();
               this.method7589(var9, 0L, Math.min(32L, this.method7582()));
               throw new EOFException("\\n not found: limit=" + Math.min(this.method7582(), var1) + " content=" + var9.method7606().method8449() + '…');
            }
         } else {
            return this.method7619(var7);
         }
      } else {
         throw new IllegalArgumentException("limit < 0: " + var1);
      }
   }

   public String method7619(long var1) throws EOFException {
      if (var1 > 0L && this.method7597(var1 - 1L) == 13) {
         String var6 = this.method7613(var1 - 1L);
         this.method7627(2L);
         return var6;
      } else {
         String var5 = this.method7613(var1);
         this.method7627(1L);
         return var5;
      }
   }

   @Override
   public int method7620() throws EOFException {
      if (this.field9423 == 0) throw new EOFException();

      byte b0 = this.method7597(0);
      int codePoint;
      int byteCount;
      int min;

      if ((b0 & 0x80) == 0) {
         codePoint = b0 & 0x7f;
         byteCount = 1;
         min = 0x0;

      } else if ((b0 & 0xe0) == 0xc0) {
         codePoint = b0 & 0x1f;
         byteCount = 2;
         min = 0x80;

      } else if ((b0 & 0xf0) == 0xe0) {
         codePoint = b0 & 0x0f;
         byteCount = 3;
         min = 0x800;

      } else if ((b0 & 0xf8) == 0xf0) {
         codePoint = b0 & 0x07;
         byteCount = 4;
         min = 0x10000;

      } else {
         this.method7627(1);
         return '\ufffd';
      }

      if (this.field9423 < byteCount) {
         throw new EOFException("size < " + byteCount + ": " + this.field9423
                 + " (to read code point prefixed 0x" + Integer.toHexString(b0) + ")");
      }

      for (int i = 1; i < byteCount; i++) {
         byte b = this.method7597(i);
         if ((b & 0xc0) == 0x80) {
            codePoint <<= 6;
            codePoint |= b & 0x3f;
         } else {
            this.method7627(i);
            return '\ufffd';
         }
      }

      this.method7627(byteCount);

      if (codePoint > 0x10ffff) {
         return '\ufffd';
      }

      if (codePoint >= 0xd800 && codePoint <= 0xdfff) {
         return '\ufffd';
      }

      if (codePoint < min) {
         return '\ufffd';
      }

      return codePoint;
   }

   @Override
   public byte[] method7621() {
      try {
         return this.method7622(this.field9423);
      } catch (EOFException var4) {
         throw new AssertionError(var4);
      }
   }

   @Override
   public byte[] method7622(long var1) throws EOFException {
      Class4676.method14644(this.field9423, 0L, var1);
      if (var1 <= 2147483647L) {
         byte[] var5 = new byte[(int)var1];
         this.method7624(var5);
         return var5;
      } else {
         throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + var1);
      }
   }

   @Override
   public int method7623(byte[] var1) {
      return this.method7625(var1, 0, var1.length);
   }

   @Override
   public void method7624(byte[] var1) throws EOFException {
      int var4 = 0;

      while (var4 < var1.length) {
         int var5 = this.method7625(var1, var4, var1.length - var4);
         if (var5 == -1) {
            throw new EOFException();
         }

         var4 += var5;
      }
   }

   @Override
   public int method7625(byte[] var1, int var2, int var3) {
      Class4676.method14644((long)var1.length, (long)var2, (long)var3);
      Class9174 var6 = this.field9422;
      if (var6 != null) {
         int var7 = Math.min(var3, var6.field42123 - var6.field42122);
         System.arraycopy(var6.field42121, var6.field42122, var1, var2, var7);
         var6.field42122 += var7;
         this.field9423 -= (long)var7;
         if (var6.field42122 == var6.field42123) {
            this.field9422 = var6.method34280();
            Class5996.method18608(var6);
         }

         return var7;
      } else {
         return -1;
      }
   }

   public void method7626() {
      try {
         this.method7627(this.field9423);
      } catch (EOFException var4) {
         throw new AssertionError(var4);
      }
   }

   @Override
   public void method7627(long var1) throws EOFException {
      while (var1 > 0L) {
         if (this.field9422 == null) {
            throw new EOFException();
         }

         int var5 = (int)Math.min(var1, (long)(this.field9422.field42123 - this.field9422.field42122));
         this.field9423 -= (long)var5;
         var1 -= (long)var5;
         this.field9422.field42122 += var5;
         if (this.field9422.field42122 == this.field9422.field42123) {
            Class9174 var6 = this.field9422;
            this.field9422 = var6.method34280();
            Class5996.method18608(var6);
         }
      }
   }

   public Class1734 method7562(Class2003 var1) {
      if (var1 != null) {
         var1.method8463(this);
         return this;
      } else {
         throw new IllegalArgumentException("byteString == null");
      }
   }

   public Class1734 method7566(String var1) {
      return this.method7628(var1, 0, var1.length());
   }

   public Class1734 method7628(String var1, int var2, int var3) {
      if (var1 == null) {
         throw new IllegalArgumentException("string == null");
      } else if (var2 < 0) {
         throw new IllegalArgumentException("beginIndex < 0: " + var2);
      } else if (var3 < var2) {
         throw new IllegalArgumentException("endIndex < beginIndex: " + var3 + " < " + var2);
      } else if (var3 > var1.length()) {
         throw new IllegalArgumentException("endIndex > string.length: " + var3 + " > " + var1.length());
      } else {
         int var6 = var2;

         while (var6 < var3) {
            char var7 = var1.charAt(var6);
            if (var7 >= 128) {
               if (var7 >= 2048) {
                  if (var7 >= '\ud800' && var7 <= '\udfff') {
                     char var14 = var6 + 1 >= var3 ? 0 : var1.charAt(var6 + 1);
                     if (var7 <= '\udbff' && var14 >= '\udc00' && var14 <= '\udfff') {
                        int var15 = 65536 + ((var7 & -55297) << 10 | var14 & -56321);
                        this.method7570(var15 >> 18 | 240);
                        this.method7570(var15 >> 12 & 63 | 128);
                        this.method7570(var15 >> 6 & 63 | 128);
                        this.method7570(var15 & 63 | 128);
                        var6 += 2;
                     } else {
                        this.method7570(63);
                        var6++;
                     }
                  } else {
                     this.method7570(var7 >> '\f' | 224);
                     this.method7570(var7 >> 6 & 63 | 128);
                     this.method7570(var7 & '?' | 128);
                     var6++;
                  }
               } else {
                  this.method7570(var7 >> 6 | 192);
                  this.method7570(var7 & '?' | 128);
                  var6++;
               }
            } else {
               Class9174 var8 = this.method7632(1);
               byte[] var9 = var8.field42121;
               int var10 = var8.field42123 - var6;
               int var11 = Math.min(var3, 8192 - var10);
               var9[var10 + var6++] = (byte)var7;

               while (true) {
                  if (var6 < var11) {
                     var7 = var1.charAt(var6);
                     if (var7 < 128) {
                        var9[var10 + var6++] = (byte)var7;
                        continue;
                     }
                  }

                  int var12 = var6 + var10 - var8.field42123;
                  var8.field42123 += var12;
                  this.field9423 += (long)var12;
                  break;
               }
            }
         }

         return this;
      }
   }

   public Class1734 method7567(int var1) {
      if (var1 >= 128) {
         if (var1 >= 2048) {
            if (var1 >= 65536) {
               if (var1 > 1114111) {
                  throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(var1));
               }

               this.method7570(var1 >> 18 | 240);
               this.method7570(var1 >> 12 & 63 | 128);
               this.method7570(var1 >> 6 & 63 | 128);
               this.method7570(var1 & 63 | 128);
            } else if (var1 >= 55296 && var1 <= 57343) {
               this.method7570(63);
            } else {
               this.method7570(var1 >> 12 | 224);
               this.method7570(var1 >> 6 & 63 | 128);
               this.method7570(var1 & 63 | 128);
            }
         } else {
            this.method7570(var1 >> 6 | 192);
            this.method7570(var1 & 63 | 128);
         }
      } else {
         this.method7570(var1);
      }

      return this;
   }

   @Override
   public Class1733 method7568(String var1, Charset var2) throws IOException {
      return null;
   }

   @Override
   public Class1733 method7569(String var1, int var2, int var3, Charset var4) throws IOException {
      return null;
   }

   public Class1734 method7569(String var1, Charset var2) {
      return this.method7629(var1, 0, var1.length(), var2);
   }

   public Class1734 method7629(String var1, int var2, int var3, Charset var4) {
      if (var1 != null) {
         if (var2 >= 0) {
            if (var3 >= var2) {
               if (var3 <= var1.length()) {
                  if (var4 != null) {
                     if (!var4.equals(Class4676.field22245)) {
                        byte[] var7 = var1.substring(var2, var3).getBytes(var4);
                        return this.method7631(var7, 0, var7.length);
                     } else {
                        return this.method7628(var1, var2, var3);
                     }
                  } else {
                     throw new IllegalArgumentException("charset == null");
                  }
               } else {
                  throw new IllegalArgumentException("endIndex > string.length: " + var3 + " > " + var1.length());
               }
            } else {
               throw new IllegalArgumentException("endIndex < beginIndex: " + var3 + " < " + var2);
            }
         } else {
            throw new IllegalAccessError("beginIndex < 0: " + var2);
         }
      } else {
         throw new IllegalArgumentException("string == null");
      }
   }

   public Class1734 method7630(byte[] var1) {
      if (var1 != null) {
         return this.method7631(var1, 0, var1.length);
      } else {
         throw new IllegalArgumentException("source == null");
      }
   }

   public Class1734 method7631(byte[] var1, int var2, int var3) {
      if (var1 == null) {
         throw new IllegalArgumentException("source == null");
      } else {
         Class4676.method14644((long)var1.length, (long)var2, (long)var3);
         int var6 = var2 + var3;

         while (var2 < var6) {
            Class9174 var7 = this.method7632(1);
            int var8 = Math.min(var6 - var2, 8192 - var7.field42123);
            System.arraycopy(var1, var2, var7.field42121, var7.field42123, var8);
            var2 += var8;
            var7.field42123 += var8;
         }

         this.field9423 += (long)var3;
         return this;
      }
   }

   @Override
   public long method7563(Class1737 var1) throws IOException {
      if (var1 == null) {
         throw new IllegalArgumentException("source == null");
      } else {
         long var4 = 0L;

         long var6;
         while ((var6 = var1.method7633(this, 8192L)) != -1L) {
            var4 += var6;
         }

         return var4;
      }
   }

   @Override
   public Class1733 method7564(Class1737 var1, long var2) throws IOException {
      while (var2 > 0L) {
         long var6 = var1.method7633(this, var2);
         if (var6 == -1L) {
            throw new EOFException();
         }

         var2 -= var6;
      }

      return this;
   }

   @Override
   public Class1733 method7565(String var1) throws IOException {
      return null;
   }

   @Override
   public Class1733 method7566(String var1, int var2, int var3) throws IOException {
      return null;
   }

   public Class1734 method7570(int var1) {
      Class9174 var4 = this.method7632(1);
      var4.field42121[var4.field42123++] = (byte)var1;
      this.field9423++;
      return this;
   }

   public Class1734 method7571(int var1) {
      Class9174 var4 = this.method7632(2);
      byte[] var5 = var4.field42121;
      int var6 = var4.field42123;
      var5[var6++] = (byte)(var1 >>> 8 & 0xFF);
      var5[var6++] = (byte)(var1 & 0xFF);
      var4.field42123 = var6;
      this.field9423 += 2L;
      return this;
   }

   public Class1734 method7572(int var1) {
      return this.method7571(Class4676.method14645((short)var1));
   }

   public Class1734 method7573(int var1) {
      Class9174 var4 = this.method7632(4);
      byte[] var5 = var4.field42121;
      int var6 = var4.field42123;
      var5[var6++] = (byte)(var1 >>> 24 & 0xFF);
      var5[var6++] = (byte)(var1 >>> 16 & 0xFF);
      var5[var6++] = (byte)(var1 >>> 8 & 0xFF);
      var5[var6++] = (byte)(var1 & 0xFF);
      var4.field42123 = var6;
      this.field9423 += 4L;
      return this;
   }

   public Class1734 method7574(int var1) {
      return this.method7573(Class4676.method14646(var1));
   }

   public Class1734 method7575(long var1) {
      Class9174 var5 = this.method7632(8);
      byte[] var6 = var5.field42121;
      int var7 = var5.field42123;
      var6[var7++] = (byte)((int)(var1 >>> 56 & 255L));
      var6[var7++] = (byte)((int)(var1 >>> 48 & 255L));
      var6[var7++] = (byte)((int)(var1 >>> 40 & 255L));
      var6[var7++] = (byte)((int)(var1 >>> 32 & 255L));
      var6[var7++] = (byte)((int)(var1 >>> 24 & 255L));
      var6[var7++] = (byte)((int)(var1 >>> 16 & 255L));
      var6[var7++] = (byte)((int)(var1 >>> 8 & 255L));
      var6[var7++] = (byte)((int)(var1 & 255L));
      var5.field42123 = var7;
      this.field9423 += 8L;
      return this;
   }

   public Class1734 method7576(long var1) {
      return this.method7575(Class4676.method14647(var1));
   }

   public Class1734 method7577(long var1) {
      if (var1 == 0L) {
         return this.method7570(48);
      } else {
         boolean var5 = false;
         if (var1 < 0L) {
            var1 = -var1;
            if (var1 < 0L) {
               return this.method7566("-9223372036854775808");
            }

            var5 = true;
         }

         int var6 = var1 >= 100000000L
            ? (
               var1 >= 1000000000000L
                  ? (
                     var1 >= 1000000000000000L
                        ? (var1 >= 100000000000000000L ? (var1 >= 1000000000000000000L ? 19 : 18) : (var1 >= 10000000000000000L ? 17 : 16))
                        : (var1 >= 10000000000000L ? (var1 >= 100000000000000L ? 15 : 14) : 13)
                  )
                  : (var1 >= 10000000000L ? (var1 >= 100000000000L ? 12 : 11) : (var1 >= 1000000000L ? 10 : 9))
            )
            : (
               var1 >= 10000L
                  ? (var1 >= 1000000L ? (var1 >= 10000000L ? 8 : 7) : (var1 >= 100000L ? 6 : 5))
                  : (var1 >= 100L ? (var1 >= 1000L ? 4 : 3) : (var1 >= 10L ? 2 : 1))
            );
         if (var5) {
            var6++;
         }

         Class9174 var7 = this.method7632(var6);
         byte[] var8 = var7.field42121;

         int var9;
         for (var9 = var7.field42123 + var6; var1 != 0L; var1 /= 10L) {
            int var10 = (int)(var1 % 10L);
            var9--;
            var8[var9] = field9420[var10];
         }

         if (var5) {
            var9--;
            var8[var9] = 45;
         }

         var7.field42123 += var6;
         this.field9423 += (long)var6;
         return this;
      }
   }

   public Class1734 method7578(long var1) {
      if (var1 == 0L) {
         return this.method7570(48);
      } else {
         int var5 = Long.numberOfTrailingZeros(Long.highestOneBit(var1)) / 4 + 1;
         Class9174 var6 = this.method7632(var5);
         byte[] var7 = var6.field42121;
         int var8 = var6.field42123 + var5 - 1;

         for (int var9 = var6.field42123; var8 >= var9; var8--) {
            var7[var8] = field9420[(int)(var1 & 15L)];
            var1 >>>= 4;
         }

         var6.field42123 += var5;
         this.field9423 += (long)var5;
         return this;
      }
   }

   public Class9174 method7632(int var1) {
      if (var1 < 1 || var1 > 8192) {
         throw new IllegalArgumentException();
      } else if (this.field9422 == null) {
         this.field9422 = Class5996.method18607();
         return this.field9422.field42126 = this.field9422.field42127 = this.field9422;
      } else {
         Class9174 var4 = this.field9422.field42127;
         if (var4.field42123 + var1 > 8192 || !var4.field42125) {
            var4 = var4.method34281(Class5996.method18607());
         }

         return var4;
      }
   }

   @Override
   public void method7540(Class1734 var1, long var2) {
      if (var1 != null) {
         if (var1 != this) {
            Class4676.method14644(var1.field9423, 0L, var2);

            while (var2 > 0L) {
               if (var2 < (long)(var1.field9422.field42123 - var1.field9422.field42122)) {
                  Class9174 var6 = this.field9422 == null ? null : this.field9422.field42127;
                  if (var6 != null && var6.field42125 && var2 + (long)var6.field42123 - (long)(!var6.field42124 ? var6.field42122 : 0) <= 8192L) {
                     var1.field9422.method34284(var6, (int)var2);
                     var1.field9423 -= var2;
                     this.field9423 += var2;
                     return;
                  }

                  var1.field9422 = var1.field9422.method34282((int)var2);
               }

               Class9174 var10 = var1.field9422;
               long var7 = (long)(var10.field42123 - var10.field42122);
               var1.field9422 = var10.method34280();
               if (this.field9422 != null) {
                  Class9174 var9 = this.field9422.field42127;
                  var9 = var9.method34281(var10);
                  var9.method34283();
               } else {
                  this.field9422 = var10;
                  this.field9422.field42126 = this.field9422.field42127 = this.field9422;
               }

               var1.field9423 -= var7;
               this.field9423 += var7;
               var2 -= var7;
            }
         } else {
            throw new IllegalArgumentException("source == this");
         }
      } else {
         throw new IllegalArgumentException("source == null");
      }
   }

   @Override
   public long method7633(Class1734 var1, long var2) {
      if (var1 != null) {
         if (var2 >= 0L) {
            if (this.field9423 != 0L) {
               if (var2 > this.field9423) {
                  var2 = this.field9423;
               }

               var1.method7540(this, var2);
               return var2;
            } else {
               return -1L;
            }
         } else {
            throw new IllegalArgumentException("byteCount < 0: " + var2);
         }
      } else {
         throw new IllegalArgumentException("sink == null");
      }
   }

   @Override
   public long method7634(byte var1) {
      return this.method7636(var1, 0L, Long.MAX_VALUE);
   }

   @Override
   public long method7635(byte var1, long var2) {
      return this.method7636(var1, var2, Long.MAX_VALUE);
   }

   @Override
   public long method7636(byte var1, long var2, long var4) {
      if (var2 >= 0L && var4 >= var2) {
         if (var4 > this.field9423) {
            var4 = this.field9423;
         }

         if (var2 != var4) {
            Class9174 var8 = this.field9422;
            if (var8 == null) {
               return -1L;
            } else {
               long var9;
               if (this.field9423 - var2 >= var2) {
                  var9 = 0L;

                  long var11;
                  while ((var11 = var9 + (long)(var8.field42123 - var8.field42122)) < var2) {
                     var8 = var8.field42126;
                     var9 = var11;
                  }
               } else {
                  for (var9 = this.field9423; var9 > var2; var9 -= (long)(var8.field42123 - var8.field42122)) {
                     var8 = var8.field42127;
                  }
               }

               while (var9 < var4) {
                  byte[] var13 = var8.field42121;
                  int var14 = (int)Math.min((long)var8.field42123, (long)var8.field42122 + var4 - var9);

                  for (int var15 = (int)((long)var8.field42122 + var2 - var9); var15 < var14; var15++) {
                     if (var13[var15] == var1) {
                        return (long)(var15 - var8.field42122) + var9;
                     }
                  }

                  var9 += (long)(var8.field42123 - var8.field42122);
                  var2 = var9;
                  var8 = var8.field42126;
               }

               return -1L;
            }
         } else {
            return -1L;
         }
      } else {
         throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", this.field9423, var2, var4));
      }
   }

   @Override
   public long method7637(Class2003 var1) throws IOException {
      return this.method7638(var1, 0L);
   }

   @Override
   public long method7638(Class2003 var1, long var2) throws IOException {
      if (var1.method8458() == 0) {
         throw new IllegalArgumentException("bytes is empty");
      } else if (var2 >= 0L) {
         Class9174 var6 = this.field9422;
         if (var6 == null) {
            return -1L;
         } else {
            long var7;
            if (this.field9423 - var2 >= var2) {
               var7 = 0L;

               long var13;
               while ((var13 = var7 + (long)(var6.field42123 - var6.field42122)) < var2) {
                  var6 = var6.field42126;
                  var7 = var13;
               }
            } else {
               for (var7 = this.field9423; var7 > var2; var7 -= (long)(var6.field42123 - var6.field42122)) {
                  var6 = var6.field42127;
               }
            }

            byte var9 = var1.method8457(0);
            int var10 = var1.method8458();

            for (long var11 = this.field9423 - (long)var10 + 1L; var7 < var11; var6 = var6.field42126) {
               byte[] var15 = var6.field42121;
               int var16 = (int)Math.min((long)var6.field42123, (long)var6.field42122 + var11 - var7);

               for (int var17 = (int)((long)var6.field42122 + var2 - var7); var17 < var16; var17++) {
                  if (var15[var17] == var9 && this.method7643(var6, var17 + 1, var1, 1, var10)) {
                     return (long)(var17 - var6.field42122) + var7;
                  }
               }

               var7 += (long)(var6.field42123 - var6.field42122);
               var2 = var7;
            }

            return -1L;
         }
      } else {
         throw new IllegalArgumentException("fromIndex < 0");
      }
   }

   @Override
   public long method7639(Class2003 var1) {
      return this.method7640(var1, 0L);
   }

   @Override
   public long method7640(Class2003 var1, long var2) {
      if (var2 >= 0L) {
         Class9174 var6 = this.field9422;
         if (var6 == null) {
            return -1L;
         } else {
            long var7;
            if (this.field9423 - var2 >= var2) {
               var7 = 0L;

               long var10;
               while ((var10 = var7 + (long)(var6.field42123 - var6.field42122)) < var2) {
                  var6 = var6.field42126;
                  var7 = var10;
               }
            } else {
               for (var7 = this.field9423; var7 > var2; var7 -= (long)(var6.field42123 - var6.field42122)) {
                  var6 = var6.field42127;
               }
            }

            if (var1.method8458() != 2) {
               for (byte[] var20 = var1.method8460(); var7 < this.field9423; var6 = var6.field42126) {
                  byte[] var21 = var6.field42121;
                  int var22 = (int)((long)var6.field42122 + var2 - var7);

                  for (int var23 = var6.field42123; var22 < var23; var22++) {
                     byte var24 = var21[var22];

                     for (int var19 : var20) {
                        if (var24 == var19) {
                           return (long)(var22 - var6.field42122) + var7;
                        }
                     }
                  }

                  var7 += (long)(var6.field42123 - var6.field42122);
                  var2 = var7;
               }
            } else {
               byte var9 = var1.method8457(0);

               for (int var12 = var1.method8457(1); var7 < this.field9423; var6 = var6.field42126) {
                  byte[] var13 = var6.field42121;
                  int var14 = (int)((long)var6.field42122 + var2 - var7);

                  for (int var15 = var6.field42123; var14 < var15; var14++) {
                     byte var16 = var13[var14];
                     if (var16 == var9 || var16 == var12) {
                        return (long)(var14 - var6.field42122) + var7;
                     }
                  }

                  var7 += (long)(var6.field42123 - var6.field42122);
                  var2 = var7;
               }
            }

            return -1L;
         }
      } else {
         throw new IllegalArgumentException("fromIndex < 0");
      }
   }

   @Override
   public boolean method7641(long var1, Class2003 var3) {
      return this.method7642(var1, var3, 0, var3.method8458());
   }

   @Override
   public boolean method7642(long var1, Class2003 var3, int var4, int var5) {
      if (var1 >= 0L && var4 >= 0 && var5 >= 0 && this.field9423 - var1 >= (long)var5 && var3.method8458() - var4 >= var5) {
         for (int var8 = 0; var8 < var5; var8++) {
            if (this.method7597(var1 + (long)var8) != var3.method8457(var4 + var8)) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean method7643(Class9174 var1, int var2, Class2003 var3, int var4, int var5) {
      int var8 = var1.field42123;
      byte[] var9 = var1.field42121;

      for (int var10 = var4; var10 < var5; var10++) {
         if (var2 == var8) {
            var1 = var1.field42126;
            var9 = var1.field42121;
            var2 = var1.field42122;
            var8 = var1.field42123;
         }

         if (var9[var2] != var3.method8457(var10)) {
            return false;
         }

         var2++;
      }

      return true;
   }

   @Override
   public void flush() {
   }

   @Override
   public void close() {
   }

   @Override
   public Class4916 method7541() {
      return Class4916.field22810;
   }

   public List<Integer> method7644() {
      if (this.field9422 == null) {
         return Collections.<Integer>emptyList();
      } else {
         ArrayList var3 = new ArrayList();
         var3.add(this.field9422.field42123 - this.field9422.field42122);

         for (Class9174 var4 = this.field9422.field42126; var4 != this.field9422; var4 = var4.field42126) {
            var3.add(var4.field42123 - var4.field42122);
         }

         return var3;
      }
   }

   public Class2003 method7645() {
      return this.method7649("MD5");
   }

   public Class2003 method7646() {
      return this.method7649("SHA-1");
   }

   public Class2003 method7647() {
      return this.method7649("SHA-256");
   }

   public Class2003 method7648() {
      return this.method7649("SHA-512");
   }

   private Class2003 method7649(String var1) {
      try {
         MessageDigest var4 = MessageDigest.getInstance(var1);
         if (this.field9422 != null) {
            var4.update(this.field9422.field42121, this.field9422.field42122, this.field9422.field42123 - this.field9422.field42122);

            for (Class9174 var5 = this.field9422.field42126; var5 != this.field9422; var5 = var5.field42126) {
               var4.update(var5.field42121, var5.field42122, var5.field42123 - var5.field42122);
            }
         }

         return Class2003.method8430(var4.digest());
      } catch (NoSuchAlgorithmException var6) {
         throw new AssertionError();
      }
   }

   public Class2003 method7650(Class2003 var1) {
      return this.method7653("HmacSHA1", var1);
   }

   public Class2003 method7651(Class2003 var1) {
      return this.method7653("HmacSHA256", var1);
   }

   public Class2003 method7652(Class2003 var1) {
      return this.method7653("HmacSHA512", var1);
   }

   private Class2003 method7653(String var1, Class2003 var2) {
      try {
         Mac var5 = Mac.getInstance(var1);
         var5.init(new SecretKeySpec(var2.method8459(), var1));
         if (this.field9422 != null) {
            var5.update(this.field9422.field42121, this.field9422.field42122, this.field9422.field42123 - this.field9422.field42122);

            for (Class9174 var6 = this.field9422.field42126; var6 != this.field9422; var6 = var6.field42126) {
               var5.update(var6.field42121, var6.field42122, var6.field42123 - var6.field42122);
            }
         }

         return Class2003.method8430(var5.doFinal());
      } catch (NoSuchAlgorithmException var7) {
         throw new AssertionError();
      } catch (InvalidKeyException var8) {
         throw new IllegalArgumentException(var8);
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof Class1734)) {
         return false;
      } else {
         Class1734 var4 = (Class1734)var1;
         if (this.field9423 != var4.field9423) {
            return false;
         } else if (this.field9423 == 0L) {
            return true;
         } else {
            Class9174 var5 = this.field9422;
            Class9174 var6 = var4.field9422;
            int var7 = var5.field42122;
            int var8 = var6.field42122;
            long var9 = 0L;

            while (var9 < this.field9423) {
               long var11 = (long)Math.min(var5.field42123 - var7, var6.field42123 - var8);

               for (int var13 = 0; (long)var13 < var11; var13++) {
                  if (var5.field42121[var7++] != var6.field42121[var8++]) {
                     return false;
                  }
               }

               if (var7 == var5.field42123) {
                  var5 = var5.field42126;
                  var7 = var5.field42122;
               }

               if (var8 == var6.field42123) {
                  var6 = var6.field42126;
                  var8 = var6.field42122;
               }

               var9 += var11;
            }

            return true;
         }
      }
   }

   @Override
   public int hashCode() {
      Class9174 var3 = this.field9422;
      if (var3 == null) {
         return 0;
      } else {
         int var4 = 1;

         do {
            int var5 = var3.field42122;

            for (int var6 = var3.field42123; var5 < var6; var5++) {
               var4 = 31 * var4 + var3.field42121[var5];
            }

            var3 = var3.field42126;
         } while (var3 != this.field9422);

         return var4;
      }
   }

   @Override
   public String toString() {
      return this.method7654().toString();
   }

   public Class1734 clone() {
      Class1734 var3 = new Class1734();
      if (this.field9423 == 0L) {
         return var3;
      } else {
         var3.field9422 = new Class9174(this.field9422);
         var3.field9422.field42126 = var3.field9422.field42127 = var3.field9422;

         for (Class9174 var4 = this.field9422.field42126; var4 != this.field9422; var4 = var4.field42126) {
            var3.field9422.field42127.method34281(new Class9174(var4));
         }

         var3.field9423 = this.field9423;
         return var3;
      }
   }

   public Class2003 method7654() {
      if (this.field9423 <= 2147483647L) {
         return this.method7655((int)this.field9423);
      } else {
         throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.field9423);
      }
   }

   public Class2003 method7655(int var1) {
      return (Class2003)(var1 != 0 ? new Class2004(this, var1) : Class2003.field13051);
   }
}
