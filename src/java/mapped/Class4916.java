package mapped;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class Class4916 {
   public static final Class4916 field22810 = new Class4917();
   private boolean field22811;
   private long field22812;
   private long field22813;

   public Class4916 method15209(long var1, TimeUnit var3) {
      if (var1 >= 0L) {
         if (var3 != null) {
            this.field22813 = var3.toNanos(var1);
            return this;
         } else {
            throw new IllegalArgumentException("unit == null");
         }
      } else {
         throw new IllegalArgumentException("timeout < 0: " + var1);
      }
   }

   public long method15210() {
      return this.field22813;
   }

   public boolean method15211() {
      return this.field22811;
   }

   public long method15212() {
      if (this.field22811) {
         return this.field22812;
      } else {
         throw new IllegalStateException("No deadline");
      }
   }

   public Class4916 method15213(long var1) {
      this.field22811 = true;
      this.field22812 = var1;
      return this;
   }

   public final Class4916 method15214(long var1, TimeUnit var3) {
      if (var1 > 0L) {
         if (var3 != null) {
            return this.method15213(System.nanoTime() + var3.toNanos(var1));
         } else {
            throw new IllegalArgumentException("unit == null");
         }
      } else {
         throw new IllegalArgumentException("duration <= 0: " + var1);
      }
   }

   public Class4916 method15215() {
      this.field22813 = 0L;
      return this;
   }

   public Class4916 method15216() {
      this.field22811 = false;
      return this;
   }

   public void method15217() throws IOException {
      if (!Thread.interrupted()) {
         if (this.field22811 && this.field22812 - System.nanoTime() <= 0L) {
            throw new InterruptedIOException("deadline reached");
         }
      } else {
         throw new InterruptedIOException("thread interrupted");
      }
   }

   public final void method15218(Object var1) throws InterruptedIOException {
      try {
         boolean var4 = this.method15211();
         long var5 = this.method15210();
         if (!var4 && var5 == 0L) {
            var1.wait();
         } else {
            long var7 = System.nanoTime();
            long var11;
            if (var4 && var5 != 0L) {
               long var9 = this.method15212() - var7;
               var11 = Math.min(var5, var9);
            } else if (var4) {
               var11 = this.method15212() - var7;
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
