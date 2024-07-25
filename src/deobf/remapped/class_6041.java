package remapped;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.Arrays;

public class class_6041 {
   public static final int field_30837 = 255;
   public static final int field_30840 = 65535;
   public static final String field_30839 = "UTF-8";
   public static final String field_30841 = "UTF-16";
   private static final int field_30836 = 65279;
   private final InputStream field_30844;
   private final RandomAccessFile field_30835;
   private int field_30842;
   private long field_30843;

   public class_6041(InputStream var1) {
      this.field_30844 = var1;
      this.field_30835 = null;
      this.field_30842 = -1;
      this.field_30843 = 0L;
   }

   public class_6041(RandomAccessFile var1) {
      this.field_30835 = var1;
      this.field_30844 = null;
      this.field_30842 = -1;
   }

   public int method_27531() throws IOException {
      int var3 = 0;
      if (this.field_30842 < 0) {
         if (this.field_30844 == null) {
            if (this.field_30835 != null) {
               var3 = this.field_30835.read();
            }
         } else {
            var3 = this.field_30844.read();
         }
      } else {
         var3 = this.field_30842;
         this.field_30842 = -1;
      }

      if (var3 != -1) {
         if (this.field_30844 != null) {
            this.field_30843++;
         }

         return var3;
      } else {
         throw new EOFException();
      }
   }

   public void method_27532(byte[] var1, int var2, int var3) throws IOException {
      int var6 = 0;
      int var7 = 0;
      if (this.field_30842 >= 0 && var3 > 0) {
         var1[var2] = (byte)this.field_30842;
         this.field_30842 = -1;
         var6++;
      }

      while (var6 < var3) {
         if (this.field_30844 == null) {
            if (this.field_30835 != null) {
               var7 = this.field_30835.read(var1, var2 + var6, var3 - var6);
            }
         } else {
            var7 = this.field_30844.read(var1, var2 + var6, var3 - var6);
         }

         if (var7 < 0) {
            throw new EOFException();
         }

         var6 += var7;
      }

      this.field_30843 += (long)var6;
   }

   public long method_27524(int var1) throws IOException {
      if (var1 >= 1 && var1 <= 8) {
         byte[] var4 = new byte[var1];
         this.method_27532(var4, 0, var1);
         long var5 = 0L;

         for (int var7 = 0; var7 < var1; var7++) {
            var5 = var5 << 8 | (long)(var4[var7] & 255);
         }

         return var5;
      } else {
         throw new IndexOutOfBoundsException("invalid number of bytes to read: " + var1);
      }
   }

   public void method_27525(byte[] var1) throws IOException {
      this.method_27532(var1, 0, var1.length);
   }

   public String method_27533(int var1) throws IOException {
      int var4 = -1;
      int var5 = 0;

      char[] var6;
      for (var6 = new char[var1]; var5 < var1; var5++) {
         var4 = this.method_27531();
         var6[var5] = (char)var4;
      }

      return new String(var6, 0, var5);
   }

   public String method_27539(int var1, String var2) throws IOException {
      return new String(this.method_27537(var1, 0), Charset.forName(var2));
   }

   public String method_27538(int var1) throws IOException {
      byte[] var4 = new byte[2];
      this.method_27532(var4, 0, 2);
      if (var4[0] != 0 && var4[1] != 0) {
         int var5 = var4[0] << 8 | var4[1];
         byte[] var6 = this.method_27537(var1 - 2, 0);
         byte[] var7 = new byte[var6.length + var4.length];
         System.arraycopy(var4, 0, var7, 0, var4.length);
         System.arraycopy(var6, 0, var7, var4.length, var6.length);
         return new String(var7, Charset.forName(var5 != 65279 ? "UTF-8" : "UTF-16"));
      } else {
         return new String();
      }
   }

   public byte[] method_27537(int var1, int var2) throws IOException {
      byte[] var5 = new byte[var1];
      int var6 = 0;
      int var7 = 0;

      while (var6 < var1 && var7 != -1) {
         var7 = this.method_27531();
         if (var7 != -1) {
            var5[var6++] = (byte)var7;
         }
      }

      return Arrays.copyOf(var5, var6);
   }

   public double method_27530(int var1, int var2) throws IOException {
      int var5 = var1 + var2;
      if (var5 % 8 == 0) {
         long var6 = this.method_27524(var5 / 8);
         double var8 = Math.pow(2.0, (double)var2);
         return (double)var6 / var8;
      } else {
         throw new IllegalArgumentException("number of bits is not a multiple of 8: " + (var1 + var2));
      }
   }

   public void method_27527(long var1) throws IOException {
      long var5 = 0L;
      if (this.field_30842 >= 0 && var1 > 0L) {
         this.field_30842 = -1;
         var5++;
      }

      while (var5 < var1) {
         if (this.field_30844 == null) {
            if (this.field_30835 != null) {
               var5 += (long)this.field_30835.skipBytes((int)(var1 - var5));
            }
         } else {
            var5 += this.field_30844.skip(var1 - var5);
         }
      }

      this.field_30843 += var5;
   }

   public long method_27526() throws IOException {
      long var3 = -1L;
      if (this.field_30844 == null) {
         if (this.field_30835 != null) {
            var3 = this.field_30835.getFilePointer();
         }
      } else {
         var3 = this.field_30843;
      }

      return var3;
   }

   public long method_27528() {
      if (this.field_30844 != null) {
         try {
            return (long)this.field_30844.available();
         } catch (IOException var4) {
            var4.printStackTrace();
         }
      }

      return 0L;
   }

   public void method_27536(long var1) throws IOException {
      if (this.field_30835 == null) {
         throw new IOException("could not seek: no random access");
      } else {
         this.field_30835.seek(var1);
      }
   }

   public boolean method_27523() {
      return this.field_30835 != null;
   }

   public boolean method_27535() throws IOException {
      boolean var4;
      if (this.field_30835 == null) {
         if (this.field_30842 < 0) {
            int var3 = this.field_30844.read();
            var4 = var3 != -1;
            if (var4) {
               this.field_30842 = var3;
            }
         } else {
            var4 = true;
         }
      } else {
         var4 = this.field_30835.getFilePointer() < this.field_30835.length() - 1L;
      }

      return var4;
   }

   public void method_27534() throws IOException {
      this.field_30842 = -1;
      if (this.field_30844 == null) {
         if (this.field_30835 != null) {
            this.field_30835.close();
         }
      } else {
         this.field_30844.close();
      }
   }

   public void method_27540() {
      try {
         if (this.field_30844 != null) {
            this.field_30844.reset();
         }
      } catch (IOException var4) {
         var4.printStackTrace();
      }

      this.field_30843 = 0L;
      this.field_30842 = -1;
   }
}
