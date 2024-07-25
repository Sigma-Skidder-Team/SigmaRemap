package remapped;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class class_245 {
   public static final class_245 field_857 = new class_4216();
   private boolean field_858;
   private long field_861;
   private long field_859;

   public class_245 method_1070(long var1, TimeUnit var3) {
      if (var1 >= 0L) {
         if (var3 != null) {
            this.field_859 = var3.toNanos(var1);
            return this;
         } else {
            throw new IllegalArgumentException("unit == null");
         }
      } else {
         throw new IllegalArgumentException("timeout < 0: " + var1);
      }
   }

   public long method_1078() {
      return this.field_859;
   }

   public boolean method_1079() {
      return this.field_858;
   }

   public long method_1073() {
      if (this.field_858) {
         return this.field_861;
      } else {
         throw new IllegalStateException("No deadline");
      }
   }

   public class_245 method_1074(long var1) {
      this.field_858 = true;
      this.field_861 = var1;
      return this;
   }

   public final class_245 method_1071(long var1, TimeUnit var3) {
      if (var1 > 0L) {
         if (var3 != null) {
            return this.method_1074(System.nanoTime() + var3.toNanos(var1));
         } else {
            throw new IllegalArgumentException("unit == null");
         }
      } else {
         throw new IllegalArgumentException("duration <= 0: " + var1);
      }
   }

   public class_245 method_1075() {
      this.field_859 = 0L;
      return this;
   }

   public class_245 method_1077() {
      this.field_858 = false;
      return this;
   }

   public void method_1072() throws IOException {
      if (!Thread.interrupted()) {
         if (this.field_858 && this.field_861 - System.nanoTime() <= 0L) {
            throw new InterruptedIOException("deadline reached");
         }
      } else {
         throw new InterruptedIOException("thread interrupted");
      }
   }

   public final void method_1076(Object var1) throws InterruptedIOException {
      try {
         boolean var4 = this.method_1079();
         long var5 = this.method_1078();
         if (!var4 && var5 == 0L) {
            var1.wait();
         } else {
            long var7 = System.nanoTime();
            long var11;
            if (var4 && var5 != 0L) {
               long var9 = this.method_1073() - var7;
               var11 = Math.min(var5, var9);
            } else if (var4) {
               var11 = this.method_1073() - var7;
            } else {
               var11 = var5;
            }

            long var16 = 0L;
            if (var11 > 0L) {
               long var13 = var11 / 1000000L;
               var1.wait(var13, (int)(var11 - var13 * 1000000L));
               var16 = System.nanoTime() - var7;
            }

            if (var16 >= var11) {
               throw new InterruptedIOException("timeout");
            }
         }
      } catch (InterruptedException var15) {
         throw new InterruptedIOException("interrupted");
      }
   }
}
