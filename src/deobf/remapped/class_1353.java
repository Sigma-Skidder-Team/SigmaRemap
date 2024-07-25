package remapped;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

public class class_1353 extends class_245 {
   private static final int field_7377 = 65536;
   private static final long field_7378 = TimeUnit.SECONDS.toMillis(60L);
   private static final long field_7384 = TimeUnit.MILLISECONDS.toNanos(field_7378);
   public static class_1353 field_7380;
   private boolean field_7381;
   private class_1353 field_7383;
   private long field_7379;

   public final void method_6243() {
      if (!this.field_7381) {
         long var3 = this.method_1078();
         boolean var5 = this.method_1079();
         if (var3 != 0L || var5) {
            this.field_7381 = true;
            method_6241(this, var3, var5);
         }
      } else {
         throw new IllegalStateException("Unbalanced enter/exit");
      }
   }

   private static synchronized void method_6241(class_1353 var0, long var1, boolean var3) {
      if (field_7380 == null) {
         field_7380 = new class_1353();
         new class_9217().start();
      }

      long var6 = System.nanoTime();
      if (var1 != 0L && var3) {
         var0.field_7379 = var6 + Math.min(var1, var0.method_1073() - var6);
      } else if (var1 == 0L) {
         if (!var3) {
            throw new AssertionError();
         }

         var0.field_7379 = var0.method_1073();
      } else {
         var0.field_7379 = var6 + var1;
      }

      long var8 = var0.method_6245(var6);
      class_1353 var10 = field_7380;

      while (var10.field_7383 != null && var8 >= var10.field_7383.method_6245(var6)) {
         var10 = var10.field_7383;
      }

      var0.field_7383 = var10.field_7383;
      var10.field_7383 = var0;
      if (var10 == field_7380) {
         class_1353.class.notify();
      }
   }

   public final boolean method_6249() {
      if (this.field_7381) {
         this.field_7381 = false;
         return method_6248(this);
      } else {
         return false;
      }
   }

   private static synchronized boolean method_6248(class_1353 var0) {
      for (class_1353 var3 = field_7380; var3 != null; var3 = var3.field_7383) {
         if (var3.field_7383 == var0) {
            var3.field_7383 = var0.field_7383;
            var0.field_7383 = null;
            return false;
         }
      }

      return true;
   }

   private long method_6245(long var1) {
      return this.field_7379 - var1;
   }

   public void method_6242() {
   }

   public final class_4131 method_6252(class_4131 var1) {
      return new class_2883(this, var1);
   }

   public final class_5322 method_6247(class_5322 var1) {
      return new class_3417(this, var1);
   }

   public final void method_6251(boolean var1) throws IOException {
      boolean var4 = this.method_6249();
      if (var4 && var1) {
         throw this.method_6246(null);
      }
   }

   public final IOException method_6250(IOException var1) throws IOException {
      return this.method_6249() ? this.method_6246(var1) : var1;
   }

   public IOException method_6246(IOException var1) {
      InterruptedIOException var4 = new InterruptedIOException("timeout");
      if (var1 != null) {
         var4.initCause(var1);
      }

      return var4;
   }

   @Nullable
   public static class_1353 method_6244() throws InterruptedException {
      class_1353 var2 = field_7380.field_7383;
      if (var2 != null) {
         long var7 = var2.method_6245(System.nanoTime());
         if (var7 <= 0L) {
            field_7380.field_7383 = var2.field_7383;
            var2.field_7383 = null;
            return var2;
         } else {
            long var5 = var7 / 1000000L;
            var7 -= var5 * 1000000L;
            class_1353.class.wait(var5, (int)var7);
            return null;
         }
      } else {
         long var3 = System.nanoTime();
         class_1353.class.wait(field_7378);
         return field_7380.field_7383 == null && System.nanoTime() - var3 >= field_7384 ? field_7380 : null;
      }
   }
}
