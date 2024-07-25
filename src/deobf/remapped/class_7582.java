package remapped;

import com.google.common.collect.Queues;
import java.util.Queue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.LockSupport;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class class_7582<R extends Runnable> implements class_8816<R>, Executor {
   private final String field_38634;
   private static final Logger field_38633 = LogManager.getLogger();
   private final Queue<R> field_38636 = Queues.newConcurrentLinkedQueue();
   private int field_38635;

   public class_7582(String var1) {
      this.field_38634 = var1;
   }

   public abstract R method_34462(Runnable var1);

   public abstract boolean method_34463(R var1);

   public boolean method_34466() {
      return Thread.currentThread() == this.method_34460();
   }

   public abstract Thread method_34460();

   public boolean method_34464() {
      return !this.method_34466();
   }

   public int method_34451() {
      return this.field_38636.size();
   }

   @Override
   public String method_40492() {
      return this.field_38634;
   }

   public <V> CompletableFuture<V> method_34452(Supplier<V> var1) {
      return !this.method_34464() ? CompletableFuture.<V>completedFuture((V)var1.get()) : CompletableFuture.<V>supplyAsync(var1, this);
   }

   private CompletableFuture<Void> method_34458(Runnable var1) {
      return CompletableFuture.<Void>supplyAsync(() -> {
         var1.run();
         return null;
      }, this);
   }

   public CompletableFuture<Void> method_34455(Runnable var1) {
      if (!this.method_34464()) {
         var1.run();
         return CompletableFuture.<Void>completedFuture((Void)null);
      } else {
         return this.method_34458(var1);
      }
   }

   public void method_34465(Runnable var1) {
      if (this.method_34466()) {
         var1.run();
      } else {
         this.method_34458(var1).join();
      }
   }

   public void method_34457(R var1) {
      this.field_38636.add((R)var1);
      LockSupport.unpark(this.method_34460());
   }

   @Override
   public void execute(Runnable var1) {
      if (!this.method_34464()) {
         var1.run();
      } else {
         this.method_34457(this.method_34462(var1));
      }
   }

   public void method_34459() {
      this.field_38636.clear();
   }

   public void method_34454() {
      while (this.method_34453()) {
      }
   }

   public boolean method_34453() {
      Runnable var3 = this.field_38636.peek();
      if (var3 != null) {
         if (this.field_38635 == 0 && !this.method_34463((R)var3)) {
            return false;
         } else {
            this.run(this.field_38636.remove());
            return true;
         }
      } else {
         return false;
      }
   }

   public void method_34461(BooleanSupplier var1) {
      this.field_38635++;

      try {
         while (!var1.getAsBoolean()) {
            if (!this.method_34453()) {
               this.method_34450();
            }
         }
      } finally {
         this.field_38635--;
      }
   }

   public void method_34450() {
      Thread.yield();
      LockSupport.parkNanos("waiting for tasks", 100000L);
   }

   public void run(R var1) {
      try {
         var1.run();
      } catch (Exception var6) {
         field_38633.fatal("Error executing task on {}", this.method_40492(), var6);
         if (var6.getCause() instanceof OutOfMemoryError) {
            OutOfMemoryError var5 = (OutOfMemoryError)var6.getCause();
            throw var5;
         }
      }
   }
}
