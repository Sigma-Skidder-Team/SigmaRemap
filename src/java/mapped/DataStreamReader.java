package mapped;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.Arrays;

public class DataStreamReader {
   public static final int field39792 = 255;
   public static final int field39793 = 65535;
   public static final String field39794 = "UTF-8";
   public static final String field39795 = "UTF-16";
   private static final int field39796 = 65279;
   private final InputStream field39797;
   private final RandomAccessFile field39798;
   private int field39799;
   private long field39800;

   public DataStreamReader(InputStream var1) {
      this.field39797 = var1;
      this.field39798 = null;
      this.field39799 = -1;
      this.field39800 = 0L;
   }

   public DataStreamReader(RandomAccessFile var1) {
      this.field39798 = var1;
      this.field39797 = null;
      this.field39799 = -1;
   }

   public int readInt() throws IOException {
      int var3 = 0;
      if (this.field39799 < 0) {
         if (this.field39797 == null) {
            if (this.field39798 != null) {
               var3 = this.field39798.read();
            }
         } else {
            var3 = this.field39797.read();
         }
      } else {
         var3 = this.field39799;
         this.field39799 = -1;
      }

      if (var3 != -1) {
         if (this.field39797 != null) {
            this.field39800++;
         }

         return var3;
      } else {
         throw new EOFException();
      }
   }

   public void method31862(byte[] var1, int var2, int var3) throws IOException {
      int var6 = 0;
      int var7 = 0;
      if (this.field39799 >= 0 && var3 > 0) {
         var1[var2] = (byte)this.field39799;
         this.field39799 = -1;
         var6++;
      }

      while (var6 < var3) {
         if (this.field39797 == null) {
            if (this.field39798 != null) {
               var7 = this.field39798.read(var1, var2 + var6, var3 - var6);
            }
         } else {
            var7 = this.field39797.read(var1, var2 + var6, var3 - var6);
         }

         if (var7 < 0) {
            throw new EOFException();
         }

         var6 += var7;
      }

      this.field39800 += (long)var6;
   }

   public long readBits(int var1) throws IOException {
      if (var1 >= 1 && var1 <= 8) {
         byte[] var4 = new byte[var1];
         this.method31862(var4, 0, var1);
         long var5 = 0L;

         for (int var7 = 0; var7 < var1; var7++) {
            var5 = var5 << 8 | (long)(var4[var7] & 255);
         }

         return var5;
      } else {
         throw new IndexOutOfBoundsException("invalid number of bytes to read: " + var1);
      }
   }

   public void readBytes(byte[] var1) throws IOException {
      this.method31862(var1, 0, var1.length);
   }

   public String readString(int var1) throws IOException {
      int var4 = -1;
      int var5 = 0;

      char[] var6;
      for (var6 = new char[var1]; var5 < var1; var5++) {
         var4 = this.readInt();
         var6[var5] = (char)var4;
      }

      return new String(var6, 0, var5);
   }

   public String method31866(int var1, String var2) throws IOException {
      return new String(this.method31868(var1, 0), Charset.forName(var2));
   }

   public String method31867(int var1) throws IOException {
      byte[] var4 = new byte[2];
      this.method31862(var4, 0, 2);
      if (var4[0] != 0 && var4[1] != 0) {
         int var5 = var4[0] << 8 | var4[1];
         byte[] var6 = this.method31868(var1 - 2, 0);
         byte[] var7 = new byte[var6.length + var4.length];
         System.arraycopy(var4, 0, var7, 0, var4.length);
         System.arraycopy(var6, 0, var7, var4.length, var6.length);
         return new String(var7, Charset.forName(var5 != 65279 ? "UTF-8" : "UTF-16"));
      } else {
         return new String();
      }
   }

   public byte[] method31868(int var1, int var2) throws IOException {
      byte[] var5 = new byte[var1];
      int var6 = 0;
      int var7 = 0;

      while (var6 < var1 && var7 != -1) {
         var7 = this.readInt();
         if (var7 != -1) {
            var5[var6++] = (byte)var7;
         }
      }

      return Arrays.copyOf(var5, var6);
   }

   public double method31869(int var1, int var2) throws IOException {
      int var5 = var1 + var2;
      if (var5 % 8 == 0) {
         long var6 = this.readBits(var5 / 8);
         double var8 = Math.pow(2.0, (double)var2);
         return (double)var6 / var8;
      } else {
         throw new IllegalArgumentException("number of bits is not a multiple of 8: " + (var1 + var2));
      }
   }

   public void skipBytes(long var1) throws IOException {
      long var5 = 0L;
      if (this.field39799 >= 0 && var1 > 0L) {
         this.field39799 = -1;
         var5++;
      }

      while (var5 < var1) {
         if (this.field39797 == null) {
            if (this.field39798 != null) {
               var5 += (long)this.field39798.skipBytes((int)(var1 - var5));
            }
         } else {
            var5 += this.field39797.skip(var1 - var5);
         }
      }

      this.field39800 += var5;
   }

   public long getPosition() throws IOException {
      long var3 = -1L;
      if (this.field39797 == null) {
         if (this.field39798 != null) {
            var3 = this.field39798.getFilePointer();
         }
      } else {
         var3 = this.field39800;
      }

      return var3;
   }

   public long method31872() {
      if (this.field39797 != null) {
         try {
            return (long)this.field39797.available();
         } catch (IOException var4) {
            var4.printStackTrace();
         }
      }

      return 0L;
   }

   public void method31873(long var1) throws IOException {
      if (this.field39798 == null) {
         throw new IOException("could not seek: no random access");
      } else {
         this.field39798.seek(var1);
      }
   }

   public boolean method31874() {
      return this.field39798 != null;
   }

   public boolean method31875() throws IOException {
      boolean var4;
      if (this.field39798 == null) {
         if (this.field39799 < 0) {
            int var3 = this.field39797.read();
            var4 = var3 != -1;
            if (var4) {
               this.field39799 = var3;
            }
         } else {
            var4 = true;
         }
      } else {
         var4 = this.field39798.getFilePointer() < this.field39798.length() - 1L;
      }

      return var4;
   }

   public void method31876() throws IOException {
      this.field39799 = -1;
      if (this.field39797 == null) {
         if (this.field39798 != null) {
            this.field39798.close();
         }
      } else {
         this.field39797.close();
      }
   }

   public void method31877() {
      try {
         if (this.field39797 != null) {
            this.field39797.reset();
         }
      } catch (IOException var4) {
         var4.printStackTrace();
      }

      this.field39800 = 0L;
      this.field39799 = -1;
   }
}
