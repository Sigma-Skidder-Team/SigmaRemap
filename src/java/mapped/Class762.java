package mapped;

import com.mentalfrostbyte.jello.viaversion.task.TaskScheduler;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Class762 implements Runnable, Class763 {
   private final Object field3959;
   private final Runnable field3960;
   private final long field3961;
   private final long field3962;
   private ScheduledFuture<?> field3963;
   private volatile Thread field3964;
   public final TaskScheduler field3965;

   public Class762(TaskScheduler var1, Object var2, Runnable var3, long var4, long var6) {
      this.field3965 = var1;
      this.field3959 = var2;
      this.field3960 = var3;
      this.field3961 = var4;
      this.field3962 = var6;
   }

   public void method1898() {
      if (this.field3962 != 0L) {
         this.field3963 = TaskScheduler.method23048(this.field3965).scheduleAtFixedRate(this, this.field3961, this.field3962, TimeUnit.MILLISECONDS);
      } else {
         this.field3963 = TaskScheduler.method23048(this.field3965).schedule(this, this.field3961, TimeUnit.MILLISECONDS);
      }
   }

   @Override
   public Object method1899() {
      return this.field3959;
   }

   @Override
   public Class1898 method1900() {
      if (this.field3963 != null) {
         if (!this.field3963.isCancelled()) {
            return !this.field3963.isDone() ? Class1898.field11143 : Class1898.field11145;
         } else {
            return Class1898.field11144;
         }
      } else {
         return Class1898.field11143;
      }
   }

   @Override
   public void cancel() {
      if (this.field3963 != null) {
         this.field3963.cancel(false);
         Thread var3 = this.field3964;
         if (var3 != null) {
            var3.interrupt();
         }

         this.method1902();
      }
   }

   @Override
   public void run() {
      TaskScheduler.method23049(this.field3965).execute(() -> {
         this.field3964 = Thread.currentThread();

         try {
            this.field3960.run();
         } catch (Exception var7) {
            Class8988.method33192().error("Exception in task {} by plugin {}", this.field3960, this.field3959, var7);
         } finally {
            this.field3964 = null;
         }
      });
   }

   private void method1902() {
      TaskScheduler.method23047(this.field3965).remove(this.field3959, this);
   }
}
