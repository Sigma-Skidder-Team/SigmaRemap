package mapped;

import it.unimi.dsi.fastutil.ints.Int2BooleanFunction;
import net.minecraft.util.SharedConstants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

public class DelegatedTaskExecutor<T> implements Class321<T>, AutoCloseable, Runnable {
   private static final Logger field1384 = LogManager.getLogger();
   private final AtomicInteger field1385 = new AtomicInteger(0);
   public final Class7383<? super T, ? extends Runnable> field1386;
   private final Executor field1387;
   private final String field1388;

   public static DelegatedTaskExecutor<Runnable> method1650(Executor var0, String var1) {
      return new DelegatedTaskExecutor<Runnable>(new Class7382<Runnable>(new ConcurrentLinkedQueue<Runnable>()), var0, var1);
   }

   public DelegatedTaskExecutor(Class7383<? super T, ? extends Runnable> var1, Executor var2, String var3) {
      this.field1387 = var2;
      this.field1386 = var1;
      this.field1388 = var3;
   }

   private boolean method1651() {
      int var3;
      do {
         var3 = this.field1385.get();
         if ((var3 & 3) != 0) {
            return false;
         }
      } while (!this.field1385.compareAndSet(var3, var3 | 2));

      return true;
   }

   private void method1652() {
      int var3;
      do {
         var3 = this.field1385.get();
      } while (!this.field1385.compareAndSet(var3, var3 & -3));
   }

   private boolean method1653() {
      return (this.field1385.get() & 1) == 0 && !this.field1386.method23500();
   }

   @Override
   public void close() {
      int var3;
      do {
         var3 = this.field1385.get();
      } while (!this.field1385.compareAndSet(var3, var3 | 1));
   }

   private boolean method1654() {
      return (this.field1385.get() & 2) != 0;
   }

   private boolean method1655() {
      if (this.method1654()) {
         Runnable var3 = this.field1386.method23498();
         if (var3 != null) {
            Thread var4;
            String var5;
            if (!SharedConstants.developmentMode) {
               var4 = null;
               var5 = null;
            } else {
               var4 = Thread.currentThread();
               var5 = var4.getName();
               var4.setName(this.field1388);
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
         this.method1657(var0 -> var0 == 0);
      } finally {
         this.method1652();
         this.method1656();
      }
   }

   @Override
   public void enqueue(T var1) {
      this.field1386.method23499((T)var1);
      this.method1656();
   }

   private void method1656() {
      if (this.method1653() && this.method1651()) {
         try {
            this.field1387.execute(this);
         } catch (RejectedExecutionException var6) {
            try {
               this.field1387.execute(this);
            } catch (RejectedExecutionException var5) {
               field1384.error("Cound not schedule mailbox", var5);
            }
         }
      }
   }

   private int method1657(Int2BooleanFunction var1) {
      int var4 = 0;

      while (var1.get(var4) && this.method1655()) {
         var4++;
      }

      return var4;
   }

   @Override
   public String toString() {
      return this.field1388 + " " + this.field1385.get() + " " + this.field1386.method23500();
   }

   @Override
   public String getName() {
      return this.field1388;
   }
}
