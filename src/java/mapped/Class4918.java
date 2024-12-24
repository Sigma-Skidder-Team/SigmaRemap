package mapped;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

public class Class4918 extends Class4916 {
   private static final int field22814 = 65536;
   private static final long field22815 = TimeUnit.SECONDS.toMillis(60L);
   private static final long field22816 = TimeUnit.MILLISECONDS.toNanos(field22815);
   public static Class4918 field22817;
   private boolean field22818;
   private Class4918 field22819;
   private long field22820;

   public final void method15219() {
      if (!this.field22818) {
         long var3 = this.method15210();
         boolean var5 = this.method15211();
         if (var3 != 0L || var5) {
            this.field22818 = true;
            method15220(this, var3, var5);
         }
      } else {
         throw new IllegalStateException("Unbalanced enter/exit");
      }
   }

   private static synchronized void method15220(Class4918 var0, long var1, boolean var3) {
      if (field22817 == null) {
         field22817 = new Class4918();
         new Class388().start();
      }

      long var6 = System.nanoTime();
      if (var1 != 0L && var3) {
         var0.field22820 = var6 + Math.min(var1, var0.method15212() - var6);
      } else if (var1 == 0L) {
         if (!var3) {
            throw new AssertionError();
         }

         var0.field22820 = var0.method15212();
      } else {
         var0.field22820 = var6 + var1;
      }

      long var8 = var0.method15223(var6);
      Class4918 var10 = field22817;

      while (var10.field22819 != null && var8 >= var10.field22819.method15223(var6)) {
         var10 = var10.field22819;
      }

      var0.field22819 = var10.field22819;
      var10.field22819 = var0;
      if (var10 == field22817) {
         Class4918.class.notify();
      }
   }

   public final boolean method15221() {
      if (this.field22818) {
         this.field22818 = false;
         return method15222(this);
      } else {
         return false;
      }
   }

   private static synchronized boolean method15222(Class4918 var0) {
      for (Class4918 var3 = field22817; var3 != null; var3 = var3.field22819) {
         if (var3.field22819 == var0) {
            var3.field22819 = var0.field22819;
            var0.field22819 = null;
            return false;
         }
      }

      return true;
   }

   private long method15223(long var1) {
      return this.field22820 - var1;
   }

   public void method15224() {
   }

   public final Sink method15225(Sink var1) {
      return new Class1717(this, var1);
   }

   public final Class1737 method15226(Class1737 var1) {
      return new Class1748(this, var1);
   }

   public final void method15227(boolean var1) throws IOException {
      boolean var4 = this.method15221();
      if (var4 && var1) {
         throw this.method15229(null);
      }
   }

   public final IOException method15228(IOException var1) throws IOException {
      return this.method15221() ? this.method15229(var1) : var1;
   }

   public IOException method15229(IOException var1) {
      InterruptedIOException var4 = new InterruptedIOException("timeout");
      if (var1 != null) {
         var4.initCause(var1);
      }

      return var4;
   }

   @Nullable
   public static Class4918 method15230() throws InterruptedException {
      Class4918 var2 = field22817.field22819;
      if (var2 != null) {
         long var7 = var2.method15223(System.nanoTime());
         if (var7 <= 0L) {
            field22817.field22819 = var2.field22819;
            var2.field22819 = null;
            return var2;
         } else {
            long var5 = var7 / 1000000L;
            var7 -= var5 * 1000000L;
            Class4918.class.wait(var5, (int)var7);
            return null;
         }
      } else {
         long var3 = System.nanoTime();
         Class4918.class.wait(field22815);
         return field22817.field22819 == null && System.nanoTime() - var3 >= field22816 ? field22817 : null;
      }
   }
}
