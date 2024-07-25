package remapped;

import it.unimi.dsi.fastutil.ints.Int2BooleanFunction;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_2696<T> implements class_8816<T>, AutoCloseable, Runnable {
   private static final Logger field_13213 = LogManager.getLogger();
   private final AtomicInteger field_13210 = new AtomicInteger(0);
   public final class_2096<? super T, ? extends Runnable> field_13212;
   private final Executor field_13211;
   private final String field_13209;

   public static class_2696<Runnable> method_12148(Executor var0, String var1) {
      return new class_2696<Runnable>(new class_1875<Runnable>(new ConcurrentLinkedQueue<Runnable>()), var0, var1);
   }

   public class_2696(class_2096<? super T, ? extends Runnable> var1, Executor var2, String var3) {
      this.field_13211 = var2;
      this.field_13212 = var1;
      this.field_13209 = var3;
   }

   private boolean method_12150() {
      int var3;
      do {
         var3 = this.field_13210.get();
      } while (!this.field_13210.compareAndSet(var3, var3 | 2));

      return true;
   }

   private void method_12143() {
      int var3;
      do {
         var3 = this.field_13210.get();
      } while (!this.field_13210.compareAndSet(var3, var3 & -3));
   }

   private boolean method_12149() {
      return (this.field_13210.get() & 1) == 0 ? !this.field_13212.method_9797() : false;
   }

   @Override
   public void close() {
      int var3;
      do {
         var3 = this.field_13210.get();
      } while (!this.field_13210.compareAndSet(var3, var3 | 1));
   }

   private boolean method_12147() {
      return (this.field_13210.get() & 2) != 0;
   }

   private boolean method_12145() {
      if (this.method_12147()) {
         Runnable var3 = this.field_13212.method_9798();
         if (var3 != null) {
            Thread var4;
            String var5;
            if (!class_7665.field_38958) {
               var4 = null;
               var5 = null;
            } else {
               var4 = Thread.currentThread();
               var5 = var4.getName();
               var4.setName(this.field_13209);
            }

            var3.run();
            if (var4 != null) {
               var4.setName(var5);
            }

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public void run() {
      try {
         this.method_12151(var0 -> var0 == 0);
      } finally {
         this.method_12143();
         this.method_12144();
      }
   }

   @Override
   public void method_40495(T var1) {
      this.field_13212.method_9796((T)var1);
      this.method_12144();
   }

   private void method_12144() {
      if (this.method_12149() && this.method_12150()) {
         try {
            this.field_13211.execute(this);
         } catch (RejectedExecutionException var6) {
            try {
               this.field_13211.execute(this);
            } catch (RejectedExecutionException var5) {
               field_13213.error("Cound not schedule mailbox", var5);
            }
         }
      }
   }

   private int method_12151(Int2BooleanFunction var1) {
      int var4 = 0;

      while (var1.get(var4) && this.method_12145()) {
         var4++;
      }

      return var4;
   }

   @Override
   public String toString() {
      return this.field_13209 + " " + this.field_13210.get() + " " + this.field_13212.method_9797();
   }

   @Override
   public String method_40492() {
      return this.field_13209;
   }
}
