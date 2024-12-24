package mapped;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

public final class Class1736 implements Class1735 {
   public final Class1734 field9424 = new Class1734();
   public final Class1737 field9425;
   public boolean field9426;

   public Class1736(Class1737 var1) {
      if (var1 != null) {
         this.field9425 = var1;
      } else {
         throw new NullPointerException("source == null");
      }
   }

   @Override
   public Class1734 method7559() {
      return this.field9424;
   }

   @Override
   public long method7633(Class1734 var1, long var2) throws IOException {
      if (var1 != null) {
         if (var2 >= 0L) {
            if (!this.field9426) {
               if (this.field9424.field9423 == 0L) {
                  long var6 = this.field9425.method7633(this.field9424, 8192L);
                  if (var6 == -1L) {
                     return -1L;
                  }
               }

               long var8 = Math.min(var2, this.field9424.field9423);
               return this.field9424.method7633(var1, var8);
            } else {
               throw new IllegalStateException("closed");
            }
         } else {
            throw new IllegalArgumentException("byteCount < 0: " + var2);
         }
      } else {
         throw new IllegalArgumentException("sink == null");
      }
   }

   @Override
   public boolean method7583() throws IOException {
      if (this.field9426) {
         throw new IllegalStateException("closed");
      } else {
         return this.field9424.method7583() && this.field9425.method7633(this.field9424, 8192L) == -1L;
      }
   }

   @Override
   public void method7584(long var1) throws IOException {
      if (!this.method7585(var1)) {
         throw new EOFException();
      }
   }

   @Override
   public boolean method7585(long var1) throws IOException {
      if (var1 < 0L) {
         throw new IllegalArgumentException("byteCount < 0: " + var1);
      } else if (this.field9426) {
         throw new IllegalStateException("closed");
      } else {
         while (this.field9424.field9423 < var1) {
            if (this.field9425.method7633(this.field9424, 8192L) == -1L) {
               return false;
            }
         }

         return true;
      }
   }

   @Override
   public byte method7596() throws IOException {
      this.method7584(1L);
      return this.field9424.method7596();
   }

   @Override
   public Class2003 method7606() throws IOException {
      this.field9424.method7563(this.field9425);
      return this.field9424.method7606();
   }

   @Override
   public Class2003 method7607(long var1) throws IOException {
      this.method7584(var1);
      return this.field9424.method7607(var1);
   }

   @Override
   public int method7608(Class43 var1) throws IOException {
      if (!this.field9426) {
         do {
            int var4 = this.field9424.method7609(var1);
            if (var4 == -1) {
               return -1;
            }

            int var5 = var1.field94[var4].method8458();
            if ((long)var5 <= this.field9424.field9423) {
               this.field9424.method7627((long)var5);
               return var4;
            }
         } while (this.field9425.method7633(this.field9424, 8192L) != -1L);

         return -1;
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public byte[] method7621() throws IOException {
      this.field9424.method7563(this.field9425);
      return this.field9424.method7621();
   }

   @Override
   public byte[] method7622(long var1) throws IOException {
      this.method7584(var1);
      return this.field9424.method7622(var1);
   }

   @Override
   public int method7623(byte[] var1) throws IOException {
      return this.method7625(var1, 0, var1.length);
   }

   @Override
   public void method7624(byte[] var1) throws IOException {
      try {
         this.method7584((long)var1.length);
      } catch (EOFException var7) {
         int var5 = 0;

         while (this.field9424.field9423 > 0L) {
            int var6 = this.field9424.method7625(var1, var5, (int)this.field9424.field9423);
            if (var6 == -1) {
               throw new AssertionError();
            }

            var5 += var6;
         }

         throw var7;
      }

      this.field9424.method7624(var1);
   }

   @Override
   public int method7625(byte[] var1, int var2, int var3) throws IOException {
      Class4676.method14644((long)var1.length, (long)var2, (long)var3);
      if (this.field9424.field9423 == 0L) {
         long var7 = this.field9425.method7633(this.field9424, 8192L);
         if (var7 == -1L) {
            return -1;
         }
      }

      int var6 = (int)Math.min((long)var3, this.field9424.field9423);
      return this.field9424.method7625(var1, var2, var6);
   }

   @Override
   public void method7610(Class1734 var1, long var2) throws IOException {
      try {
         this.method7584(var2);
      } catch (EOFException var7) {
         var1.method7563(this.field9424);
         throw var7;
      }

      this.field9424.method7610(var1, var2);
   }

   @Override
   public long method7611(Sink var1) throws IOException {
      if (var1 != null) {
         long var4 = 0L;

         while (this.field9425.method7633(this.field9424, 8192L) != -1L) {
            long var6 = this.field9424.method7595();
            if (var6 > 0L) {
               var4 += var6;
               var1.method7540(this.field9424, var6);
            }
         }

         if (this.field9424.method7582() > 0L) {
            var4 += this.field9424.method7582();
            var1.method7540(this.field9424, this.field9424.method7582());
         }

         return var4;
      } else {
         throw new IllegalArgumentException("sink == null");
      }
   }

   @Override
   public String method7612() throws IOException {
      this.field9424.method7563(this.field9425);
      return this.field9424.method7612();
   }

   @Override
   public String method7613(long var1) throws IOException {
      this.method7584(var1);
      return this.field9424.method7613(var1);
   }

   @Override
   public String method7614(Charset var1) throws IOException {
      if (var1 != null) {
         this.field9424.method7563(this.field9425);
         return this.field9424.method7614(var1);
      } else {
         throw new IllegalArgumentException("charset == null");
      }
   }

   @Override
   public String method7615(long var1, Charset var3) throws IOException {
      this.method7584(var1);
      if (var3 != null) {
         return this.field9424.method7615(var1, var3);
      } else {
         throw new IllegalArgumentException("charset == null");
      }
   }

   @Nullable
   @Override
   public String method7616() throws IOException {
      long var3 = this.method7634((byte)10);
      if (var3 != -1L) {
         return this.field9424.method7619(var3);
      } else {
         return this.field9424.field9423 == 0L ? null : this.method7613(this.field9424.field9423);
      }
   }

   @Override
   public String method7617() throws IOException {
      return this.method7618(Long.MAX_VALUE);
   }

   @Override
   public String method7618(long var1) throws IOException {
      if (var1 >= 0L) {
         long var5 = var1 != Long.MAX_VALUE ? var1 + 1L : Long.MAX_VALUE;
         long var7 = this.method7636((byte)10, 0L, var5);
         if (var7 == -1L) {
            if (var5 < Long.MAX_VALUE
               && this.method7585(var5)
               && this.field9424.method7597(var5 - 1L) == 13
               && this.method7585(var5 + 1L)
               && this.field9424.method7597(var5) == 10) {
               return this.field9424.method7619(var5);
            } else {
               Class1734 var9 = new Class1734();
               this.field9424.method7589(var9, 0L, Math.min(32L, this.field9424.method7582()));
               throw new EOFException(
                  "\\n not found: limit=" + Math.min(this.field9424.method7582(), var1) + " content=" + var9.method7606().method8449() + '…'
               );
            }
         } else {
            return this.field9424.method7619(var7);
         }
      } else {
         throw new IllegalArgumentException("limit < 0: " + var1);
      }
   }

   @Override
   public int method7620() throws IOException {
      this.method7584(1L);
      byte var3 = this.field9424.method7597(0L);
      if ((var3 & 224) != 192) {
         if ((var3 & 240) != 224) {
            if ((var3 & 248) == 240) {
               this.method7584(4L);
            }
         } else {
            this.method7584(3L);
         }
      } else {
         this.method7584(2L);
      }

      return this.field9424.method7620();
   }

   @Override
   public short method7598() throws IOException {
      this.method7584(2L);
      return this.field9424.method7598();
   }

   @Override
   public short method7601() throws IOException {
      this.method7584(2L);
      return this.field9424.method7601();
   }

   @Override
   public int method7599() throws IOException {
      this.method7584(4L);
      return this.field9424.method7599();
   }

   @Override
   public int method7602() throws IOException {
      this.method7584(4L);
      return this.field9424.method7602();
   }

   @Override
   public long method7600() throws IOException {
      this.method7584(8L);
      return this.field9424.method7600();
   }

   @Override
   public long method7603() throws IOException {
      this.method7584(8L);
      return this.field9424.method7603();
   }

   @Override
   public long method7604() throws IOException {
      this.method7584(1L);

      for (int var3 = 0; this.method7585((long)(var3 + 1)); var3++) {
         byte var4 = this.field9424.method7597((long)var3);
         if ((var4 < 48 || var4 > 57) && (var3 != 0 || var4 != 45)) {
            if (var3 == 0) {
               throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", var4));
            }
            break;
         }
      }

      return this.field9424.method7604();
   }

   @Override
   public long method7605() throws IOException {
      this.method7584(1L);

      for (int var3 = 0; this.method7585((long)(var3 + 1)); var3++) {
         byte var4 = this.field9424.method7597((long)var3);
         if ((var4 < 48 || var4 > 57) && (var4 < 97 || var4 > 102) && (var4 < 65 || var4 > 70)) {
            if (var3 == 0) {
               throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", var4));
            }
            break;
         }
      }

      return this.field9424.method7605();
   }

   @Override
   public void method7627(long var1) throws IOException {
      if (!this.field9426) {
         while (var1 > 0L) {
            if (this.field9424.field9423 == 0L && this.field9425.method7633(this.field9424, 8192L) == -1L) {
               throw new EOFException();
            }

            long var5 = Math.min(var1, this.field9424.method7582());
            this.field9424.method7627(var5);
            var1 -= var5;
         }
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public long method7634(byte var1) throws IOException {
      return this.method7636(var1, 0L, Long.MAX_VALUE);
   }

   @Override
   public long method7635(byte var1, long var2) throws IOException {
      return this.method7636(var1, var2, Long.MAX_VALUE);
   }

   @Override
   public long method7636(byte var1, long var2, long var4) throws IOException {
      if (this.field9426) {
         throw new IllegalStateException("closed");
      } else if (var2 >= 0L && var4 >= var2) {
         while (var2 < var4) {
            long var8 = this.field9424.method7636(var1, var2, var4);
            if (var8 != -1L) {
               return var8;
            }

            long var10 = this.field9424.field9423;
            if (var10 >= var4 || this.field9425.method7633(this.field9424, 8192L) == -1L) {
               return -1L;
            }

            var2 = Math.max(var2, var10);
         }

         return -1L;
      } else {
         throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", var2, var4));
      }
   }

   @Override
   public long method7637(Class2003 var1) throws IOException {
      return this.method7638(var1, 0L);
   }

   @Override
   public long method7638(Class2003 var1, long var2) throws IOException {
      if (!this.field9426) {
         while (true) {
            long var6 = this.field9424.method7638(var1, var2);
            if (var6 != -1L) {
               return var6;
            }

            long var8 = this.field9424.field9423;
            if (this.field9425.method7633(this.field9424, 8192L) == -1L) {
               return -1L;
            }

            var2 = Math.max(var2, var8 - (long)var1.method8458() + 1L);
         }
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public long method7639(Class2003 var1) throws IOException {
      return this.method7640(var1, 0L);
   }

   @Override
   public long method7640(Class2003 var1, long var2) throws IOException {
      if (!this.field9426) {
         while (true) {
            long var6 = this.field9424.method7640(var1, var2);
            if (var6 != -1L) {
               return var6;
            }

            long var8 = this.field9424.field9423;
            if (this.field9425.method7633(this.field9424, 8192L) == -1L) {
               return -1L;
            }

            var2 = Math.max(var2, var8);
         }
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public boolean method7641(long var1, Class2003 var3) throws IOException {
      return this.method7642(var1, var3, 0, var3.method8458());
   }

   @Override
   public boolean method7642(long var1, Class2003 var3, int var4, int var5) throws IOException {
      if (this.field9426) {
         throw new IllegalStateException("closed");
      } else if (var1 >= 0L && var4 >= 0 && var5 >= 0 && var3.method8458() - var4 >= var5) {
         for (int var8 = 0; var8 < var5; var8++) {
            long var9 = var1 + (long)var8;
            if (!this.method7585(var9 + 1L)) {
               return false;
            }

            if (this.field9424.method7597(var9) != var3.method8457(var4 + var8)) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public InputStream method7586() {
      return new Class1773(this);
   }

   @Override
   public void close() throws IOException {
      if (!this.field9426) {
         this.field9426 = true;
         this.field9425.close();
         this.field9424.method7626();
      }
   }

   @Override
   public Class4916 method7541() {
      return this.field9425.method7541();
   }

   @Override
   public String toString() {
      return "buffer(" + this.field9425 + ")";
   }
}
