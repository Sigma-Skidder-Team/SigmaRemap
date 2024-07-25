package remapped;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

public final class class_7085 implements class_8067 {
   public final class_7059 field_36576 = new class_7059();
   public final class_5322 field_36574;
   public boolean field_36573;

   public class_7085(class_5322 var1) {
      if (var1 != null) {
         this.field_36574 = var1;
      } else {
         throw new NullPointerException("source == null");
      }
   }

   @Override
   public class_7059 method_18234() {
      return this.field_36576;
   }

   @Override
   public long method_24273(class_7059 var1, long var2) throws IOException {
      if (var1 != null) {
         if (var2 >= 0L) {
            if (!this.field_36573) {
               if (this.field_36576.field_36433 == 0L) {
                  long var6 = this.field_36574.method_24273(this.field_36576, 8192L);
                  if (var6 == -1L) {
                     return -1L;
                  }
               }

               long var8 = Math.min(var2, this.field_36576.field_36433);
               return this.field_36576.method_24273(var1, var8);
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
   public boolean method_36605() throws IOException {
      if (this.field_36573) {
         throw new IllegalStateException("closed");
      } else {
         return this.field_36576.method_36605() && this.field_36574.method_24273(this.field_36576, 8192L) == -1L;
      }
   }

   @Override
   public void method_36608(long var1) throws IOException {
      if (!this.method_36591(var1)) {
         throw new EOFException();
      }
   }

   @Override
   public boolean method_36591(long var1) throws IOException {
      if (var1 < 0L) {
         throw new IllegalArgumentException("byteCount < 0: " + var1);
      } else if (this.field_36573) {
         throw new IllegalStateException("closed");
      } else {
         while (this.field_36576.field_36433 < var1) {
            if (this.field_36574.method_24273(this.field_36576, 8192L) == -1L) {
               return false;
            }
         }

         return true;
      }
   }

   @Override
   public byte method_36602() throws IOException {
      this.method_36608(1L);
      return this.field_36576.method_36602();
   }

   @Override
   public class_9091 method_36586() throws IOException {
      this.field_36576.method_18237(this.field_36574);
      return this.field_36576.method_36586();
   }

   @Override
   public class_9091 method_36587(long var1) throws IOException {
      this.method_36608(var1);
      return this.field_36576.method_36587(var1);
   }

   @Override
   public int method_36606(class_5780 var1) throws IOException {
      if (!this.field_36573) {
         do {
            int var4 = this.field_36576.method_32464(var1);
            if (var4 == -1) {
               return -1;
            }

            int var5 = var1.field_29196[var4].method_41902();
            if ((long)var5 <= this.field_36576.field_36433) {
               this.field_36576.method_36583((long)var5);
               return var4;
            }
         } while (this.field_36574.method_24273(this.field_36576, 8192L) != -1L);

         return -1;
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public byte[] method_36599() throws IOException {
      this.field_36576.method_18237(this.field_36574);
      return this.field_36576.method_36599();
   }

   @Override
   public byte[] method_36600(long var1) throws IOException {
      this.method_36608(var1);
      return this.field_36576.method_36600(var1);
   }

   @Override
   public int method_36577(byte[] var1) throws IOException {
      return this.method_36578(var1, 0, var1.length);
   }

   @Override
   public void method_36576(byte[] var1) throws IOException {
      try {
         this.method_36608((long)var1.length);
      } catch (EOFException var7) {
         int var5 = 0;

         while (this.field_36576.field_36433 > 0L) {
            int var6 = this.field_36576.method_36578(var1, var5, (int)this.field_36576.field_36433);
            if (var6 == -1) {
               throw new AssertionError();
            }

            var5 += var6;
         }

         throw var7;
      }

      this.field_36576.method_36576(var1);
   }

   @Override
   public int method_36578(byte[] var1, int var2, int var3) throws IOException {
      class_189.method_830((long)var1.length, (long)var2, (long)var3);
      if (this.field_36576.field_36433 == 0L) {
         long var7 = this.field_36574.method_24273(this.field_36576, 8192L);
         if (var7 == -1L) {
            return -1;
         }
      }

      int var6 = (int)Math.min((long)var3, this.field_36576.field_36433);
      return this.field_36576.method_36578(var1, var2, var6);
   }

   @Override
   public void method_36575(class_7059 var1, long var2) throws IOException {
      try {
         this.method_36608(var2);
      } catch (EOFException var7) {
         var1.method_18237(this.field_36576);
         throw var7;
      }

      this.field_36576.method_36575(var1, var2);
   }

   @Override
   public long method_36573(class_4131 var1) throws IOException {
      if (var1 != null) {
         long var4 = 0L;

         while (this.field_36574.method_24273(this.field_36576, 8192L) != -1L) {
            long var6 = this.field_36576.method_32467();
            if (var6 > 0L) {
               var4 += var6;
               var1.method_19191(this.field_36576, var6);
            }
         }

         if (this.field_36576.method_32468() > 0L) {
            var4 += this.field_36576.method_32468();
            var1.method_19191(this.field_36576, this.field_36576.method_32468());
         }

         return var4;
      } else {
         throw new IllegalArgumentException("sink == null");
      }
   }

   @Override
   public String method_36592() throws IOException {
      this.field_36576.method_18237(this.field_36574);
      return this.field_36576.method_36592();
   }

   @Override
   public String method_36593(long var1) throws IOException {
      this.method_36608(var1);
      return this.field_36576.method_36593(var1);
   }

   @Override
   public String method_36598(Charset var1) throws IOException {
      if (var1 != null) {
         this.field_36576.method_18237(this.field_36574);
         return this.field_36576.method_36598(var1);
      } else {
         throw new IllegalArgumentException("charset == null");
      }
   }

   @Override
   public String method_36597(long var1, Charset var3) throws IOException {
      this.method_36608(var1);
      if (var3 != null) {
         return this.field_36576.method_36597(var1, var3);
      } else {
         throw new IllegalArgumentException("charset == null");
      }
   }

   @Nullable
   @Override
   public String method_36595() throws IOException {
      long var3 = this.method_36609((byte)10);
      if (var3 != -1L) {
         return this.field_36576.method_32481(var3);
      } else {
         return this.field_36576.field_36433 == 0L ? null : this.method_36593(this.field_36576.field_36433);
      }
   }

   @Override
   public String method_36584() throws IOException {
      return this.method_36585(Long.MAX_VALUE);
   }

   @Override
   public String method_36585(long var1) throws IOException {
      if (var1 >= 0L) {
         long var5 = var1 != Long.MAX_VALUE ? var1 + 1L : Long.MAX_VALUE;
         long var7 = this.method_36611((byte)10, 0L, var5);
         if (var7 == -1L) {
            if (var5 < Long.MAX_VALUE
               && this.method_36591(var5)
               && this.field_36576.method_32485(var5 - 1L) == 13
               && this.method_36591(var5 + 1L)
               && this.field_36576.method_32485(var5) == 10) {
               return this.field_36576.method_32481(var5);
            } else {
               class_7059 var9 = new class_7059();
               this.field_36576.method_32472(var9, 0L, Math.min(32L, this.field_36576.method_32468()));
               throw new EOFException(
                  "\\n not found: limit=" + Math.min(this.field_36576.method_32468(), var1) + " content=" + var9.method_36586().method_41900() + '…'
               );
            }
         } else {
            return this.field_36576.method_32481(var7);
         }
      } else {
         throw new IllegalArgumentException("limit < 0: " + var1);
      }
   }

   @Override
   public int method_36601() throws IOException {
      this.method_36608(1L);
      byte var3 = this.field_36576.method_32485(0L);
      if ((var3 & 224) != 192) {
         if ((var3 & 240) != 224) {
            if ((var3 & 248) == 240) {
               this.method_36608(4L);
            }
         } else {
            this.method_36608(3L);
         }
      } else {
         this.method_36608(2L);
      }

      return this.field_36576.method_36601();
   }

   @Override
   public short method_36588() throws IOException {
      this.method_36608(2L);
      return this.field_36576.method_36588();
   }

   @Override
   public short method_36582() throws IOException {
      this.method_36608(2L);
      return this.field_36576.method_36582();
   }

   @Override
   public int method_36603() throws IOException {
      this.method_36608(4L);
      return this.field_36576.method_36603();
   }

   @Override
   public int method_36604() throws IOException {
      this.method_36608(4L);
      return this.field_36576.method_36604();
   }

   @Override
   public long method_36594() throws IOException {
      this.method_36608(8L);
      return this.field_36576.method_36594();
   }

   @Override
   public long method_36596() throws IOException {
      this.method_36608(8L);
      return this.field_36576.method_36596();
   }

   @Override
   public long method_36579() throws IOException {
      this.method_36608(1L);

      for (int var3 = 0; this.method_36591((long)(var3 + 1)); var3++) {
         byte var4 = this.field_36576.method_32485((long)var3);
         if ((var4 < 48 || var4 > 57) && (var3 != 0 || var4 != 45)) {
            if (var3 == 0) {
               throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", var4));
            }
            break;
         }
      }

      return this.field_36576.method_36579();
   }

   @Override
   public long method_36607() throws IOException {
      this.method_36608(1L);

      for (int var3 = 0; this.method_36591((long)(var3 + 1)); var3++) {
         byte var4 = this.field_36576.method_32485((long)var3);
         if ((var4 < 48 || var4 > 57) && (var4 < 97 || var4 > 102) && (var4 < 65 || var4 > 70)) {
            if (var3 == 0) {
               throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", var4));
            }
            break;
         }
      }

      return this.field_36576.method_36607();
   }

   @Override
   public void method_36583(long var1) throws IOException {
      if (!this.field_36573) {
         while (var1 > 0L) {
            if (this.field_36576.field_36433 == 0L && this.field_36574.method_24273(this.field_36576, 8192L) == -1L) {
               throw new EOFException();
            }

            long var5 = Math.min(var1, this.field_36576.method_32468());
            this.field_36576.method_36583(var5);
            var1 -= var5;
         }
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public long method_36609(byte var1) throws IOException {
      return this.method_36611(var1, 0L, Long.MAX_VALUE);
   }

   @Override
   public long method_36610(byte var1, long var2) throws IOException {
      return this.method_36611(var1, var2, Long.MAX_VALUE);
   }

   @Override
   public long method_36611(byte var1, long var2, long var4) throws IOException {
      if (this.field_36573) {
         throw new IllegalStateException("closed");
      } else if (var2 >= 0L && var4 >= var2) {
         while (var2 < var4) {
            long var8 = this.field_36576.method_36611(var1, var2, var4);
            if (var8 != -1L) {
               return var8;
            }

            long var10 = this.field_36576.field_36433;
            if (var10 >= var4 || this.field_36574.method_24273(this.field_36576, 8192L) == -1L) {
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
   public long method_36612(class_9091 var1) throws IOException {
      return this.method_36613(var1, 0L);
   }

   @Override
   public long method_36613(class_9091 var1, long var2) throws IOException {
      if (!this.field_36573) {
         while (true) {
            long var6 = this.field_36576.method_36613(var1, var2);
            if (var6 != -1L) {
               return var6;
            }

            long var8 = this.field_36576.field_36433;
            if (this.field_36574.method_24273(this.field_36576, 8192L) == -1L) {
               return -1L;
            }

            var2 = Math.max(var2, var8 - (long)var1.method_41902() + 1L);
         }
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public long method_36580(class_9091 var1) throws IOException {
      return this.method_36581(var1, 0L);
   }

   @Override
   public long method_36581(class_9091 var1, long var2) throws IOException {
      if (!this.field_36573) {
         while (true) {
            long var6 = this.field_36576.method_36581(var1, var2);
            if (var6 != -1L) {
               return var6;
            }

            long var8 = this.field_36576.field_36433;
            if (this.field_36574.method_24273(this.field_36576, 8192L) == -1L) {
               return -1L;
            }

            var2 = Math.max(var2, var8);
         }
      } else {
         throw new IllegalStateException("closed");
      }
   }

   @Override
   public boolean method_36589(long var1, class_9091 var3) throws IOException {
      return this.method_36590(var1, var3, 0, var3.method_41902());
   }

   @Override
   public boolean method_36590(long var1, class_9091 var3, int var4, int var5) throws IOException {
      if (this.field_36573) {
         throw new IllegalStateException("closed");
      } else if (var1 >= 0L && var4 >= 0 && var5 >= 0 && var3.method_41902() - var4 >= var5) {
         for (int var8 = 0; var8 < var5; var8++) {
            long var9 = var1 + (long)var8;
            if (!this.method_36591(var9 + 1L)) {
               return false;
            }

            if (this.field_36576.method_32485(var9) != var3.method_41879(var4 + var8)) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public InputStream method_36574() {
      return new class_1185(this);
   }

   @Override
   public void close() throws IOException {
      if (!this.field_36573) {
         this.field_36573 = true;
         this.field_36574.close();
         this.field_36576.method_32455();
      }
   }

   @Override
   public class_245 method_19192() {
      return this.field_36574.method_19192();
   }

   @Override
   public String toString() {
      return "buffer(" + this.field_36574 + ")";
   }
}
