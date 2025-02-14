package mapped;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

public final class Class1755 implements Class1733 {
   public final Class1734 field9493 = new Class1734();
   public final Sink field9494;
   public boolean field9495;

   public Class1755(Sink var1) {
      if (var1 != null) {
         this.field9494 = var1;
      } else {
         throw new NullPointerException("sink == null");
      }
   }

   @Override
   public Class1734 method7559() {
      return this.field9493;
   }

   @Override
   public void method7540(Class1734 var1, long var2) throws IOException {
      if (!this.field9495) {
         this.field9493.method7540(var1, var2);
         this.method7580();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public Class1733 method7560(Class2003 var1) throws IOException {
      if (!this.field9495) {
         this.field9493.method7562(var1);
         return this.method7580();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public Class1733 method7565(String var1) throws IOException {
      if (!this.field9495) {
         this.field9493.method7566(var1);
         return this.method7580();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public Class1733 method7566(String var1, int var2, int var3) throws IOException {
      if (!this.field9495) {
         this.field9493.method7628(var1, var2, var3);
         return this.method7580();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public Class1733 method7567(int var1) throws IOException {
      if (!this.field9495) {
         this.field9493.method7567(var1);
         return this.method7580();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public Class1733 method7568(String var1, Charset var2) throws IOException {
      if (!this.field9495) {
         this.field9493.method7569(var1, var2);
         return this.method7580();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public Class1733 method7569(String var1, int var2, int var3, Charset var4) throws IOException {
      if (!this.field9495) {
         this.field9493.method7629(var1, var2, var3, var4);
         return this.method7580();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public Class1733 method7561(byte[] var1) throws IOException {
      if (!this.field9495) {
         this.field9493.method7630(var1);
         return this.method7580();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public Class1733 method7562(byte[] var1, int var2, int var3) throws IOException {
      if (!this.field9495) {
         this.field9493.method7631(var1, var2, var3);
         return this.method7580();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public long method7563(Class1737 var1) throws IOException {
      if (var1 == null) {
         throw new IllegalArgumentException("source == null");
      } else {
         long var4 = 0L;

         long var6;
         while ((var6 = var1.method7633(this.field9493, 8192L)) != -1L) {
            var4 += var6;
            this.method7580();
         }

         return var4;
      }
   }

   @Override
   public Class1733 method7564(Class1737 var1, long var2) throws IOException {
      while (var2 > 0L) {
         long var6 = var1.method7633(this.field9493, var2);
         if (var6 == -1L) {
            throw new EOFException();
         }

         var2 -= var6;
         this.method7580();
      }

      return this;
   }

   @Override
   public Class1733 method7570(int var1) throws IOException {
      if (!this.field9495) {
         this.field9493.method7570(var1);
         return this.method7580();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public Class1733 method7571(int var1) throws IOException {
      if (!this.field9495) {
         this.field9493.method7571(var1);
         return this.method7580();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public Class1733 method7572(int var1) throws IOException {
      if (!this.field9495) {
         this.field9493.method7572(var1);
         return this.method7580();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public Class1733 method7573(int var1) throws IOException {
      if (!this.field9495) {
         this.field9493.method7573(var1);
         return this.method7580();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public Class1733 method7574(int var1) throws IOException {
      if (!this.field9495) {
         this.field9493.method7574(var1);
         return this.method7580();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public Class1733 method7575(long var1) throws IOException {
      if (!this.field9495) {
         this.field9493.method7575(var1);
         return this.method7580();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public Class1733 method7576(long var1) throws IOException {
      if (!this.field9495) {
         this.field9493.method7576(var1);
         return this.method7580();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public Class1733 method7577(long var1) throws IOException {
      if (!this.field9495) {
         this.field9493.method7577(var1);
         return this.method7580();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public Class1733 method7578(long var1) throws IOException {
      if (!this.field9495) {
         this.field9493.method7578(var1);
         return this.method7580();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public Class1733 method7580() throws IOException {
      if (!this.field9495) {
         long var3 = this.field9493.method7595();
         if (var3 > 0L) {
            this.field9494.method7540(this.field9493, var3);
         }

         return this;
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public Class1733 method7579() throws IOException {
      if (!this.field9495) {
         long var3 = this.field9493.method7582();
         if (var3 > 0L) {
            this.field9494.method7540(this.field9493, var3);
         }

         return this;
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public OutputStream method7581() {
      return new Class1766(this);
   }

   @Override
   public void flush() throws IOException {
      if (!this.field9495) {
         if (this.field9493.field9423 > 0L) {
            this.field9494.method7540(this.field9493, this.field9493.field9423);
         }

         this.field9494.flush();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public void close() throws IOException {
      if (!this.field9495) {
         Throwable var3 = null;

         try {
            if (this.field9493.field9423 > 0L) {
               this.field9494.method7540(this.field9493, this.field9493.field9423);
            }
         } catch (Throwable var5) {
            var3 = var5;
         }

         try {
            this.field9494.close();
         } catch (Throwable var6) {
            if (var3 == null) {
               var3 = var6;
            }
         }

         this.field9495 = true;
         if (var3 != null) {
            Class4676.method14648(var3);
         }
      }
   }

   @Override
   public Class4916 method7541() {
      return this.field9494.method7541();
   }

   @Override
   public String toString() {
      return "buffer(" + this.field9494 + ")";
   }
}
