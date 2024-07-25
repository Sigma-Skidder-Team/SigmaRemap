package remapped;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

public final class class_6628 implements class_3947 {
   public final class_7059 field_34204 = new class_7059();
   public final class_4131 field_34207;
   public boolean field_34205;

   public class_6628(class_4131 var1) {
      if (var1 != null) {
         this.field_34207 = var1;
      } else {
         throw new NullPointerException("sink == null");
      }
   }

   @Override
   public class_7059 method_18234() {
      return this.field_34204;
   }

   @Override
   public void method_19191(class_7059 var1, long var2) throws IOException {
      if (!this.field_34205) {
         this.field_34204.method_19191(var1, var2);
         this.method_18243();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public class_3947 method_18247(class_9091 var1) throws IOException {
      if (!this.field_34205) {
         this.field_34204.method_32487(var1);
         return this.method_18243();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public class_3947 method_18250(String var1) throws IOException {
      if (!this.field_34205) {
         this.field_34204.method_32491(var1);
         return this.method_18243();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public class_3947 method_18251(String var1, int var2, int var3) throws IOException {
      if (!this.field_34205) {
         this.field_34204.method_32492(var1, var2, var3);
         return this.method_18243();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public class_3947 method_18244(int var1) throws IOException {
      if (!this.field_34205) {
         this.field_34204.method_32483(var1);
         return this.method_18243();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public class_3947 method_18255(String var1, Charset var2) throws IOException {
      if (!this.field_34205) {
         this.field_34204.method_32497(var1, var2);
         return this.method_18243();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public class_3947 method_18254(String var1, int var2, int var3, Charset var4) throws IOException {
      if (!this.field_34205) {
         this.field_34204.method_32496(var1, var2, var3, var4);
         return this.method_18243();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public class_3947 method_18248(byte[] var1) throws IOException {
      if (!this.field_34205) {
         this.field_34204.method_32488(var1);
         return this.method_18243();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public class_3947 method_18249(byte[] var1, int var2, int var3) throws IOException {
      if (!this.field_34205) {
         this.field_34204.method_32489(var1, var2, var3);
         return this.method_18243();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public long method_18237(class_5322 var1) throws IOException {
      if (var1 == null) {
         throw new IllegalArgumentException("source == null");
      } else {
         long var4 = 0L;

         long var6;
         while ((var6 = var1.method_24273(this.field_34204, 8192L)) != -1L) {
            var4 += var6;
            this.method_18243();
         }

         return var4;
      }
   }

   @Override
   public class_3947 method_18246(class_5322 var1, long var2) throws IOException {
      while (var2 > 0L) {
         long var6 = var1.method_24273(this.field_34204, var2);
         if (var6 == -1L) {
            throw new EOFException();
         }

         var2 -= var6;
         this.method_18243();
      }

      return this;
   }

   @Override
   public class_3947 method_18253(int var1) throws IOException {
      if (!this.field_34205) {
         this.field_34204.method_32494(var1);
         return this.method_18243();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public class_3947 method_18252(int var1) throws IOException {
      if (!this.field_34205) {
         this.field_34204.method_32493(var1);
         return this.method_18243();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public class_3947 method_18240(int var1) throws IOException {
      if (!this.field_34205) {
         this.field_34204.method_32474(var1);
         return this.method_18243();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public class_3947 method_18235(int var1) throws IOException {
      if (!this.field_34205) {
         this.field_34204.method_32456(var1);
         return this.method_18243();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public class_3947 method_18241(int var1) throws IOException {
      if (!this.field_34205) {
         this.field_34204.method_32475(var1);
         return this.method_18243();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public class_3947 method_18236(long var1) throws IOException {
      if (!this.field_34205) {
         this.field_34204.method_32457(var1);
         return this.method_18243();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public class_3947 method_18242(long var1) throws IOException {
      if (!this.field_34205) {
         this.field_34204.method_32480(var1);
         return this.method_18243();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public class_3947 method_18238(long var1) throws IOException {
      if (!this.field_34205) {
         this.field_34204.method_32461(var1);
         return this.method_18243();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public class_3947 method_18239(long var1) throws IOException {
      if (!this.field_34205) {
         this.field_34204.method_32462(var1);
         return this.method_18243();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public class_3947 method_18243() throws IOException {
      if (!this.field_34205) {
         long var3 = this.field_34204.method_32467();
         if (var3 > 0L) {
            this.field_34207.method_19191(this.field_34204, var3);
         }

         return this;
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public class_3947 method_18233() throws IOException {
      if (!this.field_34205) {
         long var3 = this.field_34204.method_32468();
         if (var3 > 0L) {
            this.field_34207.method_19191(this.field_34204, var3);
         }

         return this;
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public OutputStream method_18245() {
      return new class_7193(this);
   }

   @Override
   public void flush() throws IOException {
      if (!this.field_34205) {
         if (this.field_34204.field_36433 > 0L) {
            this.field_34207.method_19191(this.field_34204, this.field_34204.field_36433);
         }

         this.field_34207.flush();
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public void close() throws IOException {
      if (!this.field_34205) {
         Throwable var3 = null;

         try {
            if (this.field_34204.field_36433 > 0L) {
               this.field_34207.method_19191(this.field_34204, this.field_34204.field_36433);
            }
         } catch (Throwable var5) {
            var3 = var5;
         }

         try {
            this.field_34207.close();
         } catch (Throwable var6) {
            if (var3 == null) {
               var3 = var6;
            }
         }

         this.field_34205 = true;
         if (var3 != null) {
            class_189.method_826(var3);
         }
      }
   }

   @Override
   public class_245 method_19192() {
      return this.field_34207.method_19192();
   }

   @Override
   public String toString() {
      return "buffer(" + this.field_34207 + ")";
   }
}
