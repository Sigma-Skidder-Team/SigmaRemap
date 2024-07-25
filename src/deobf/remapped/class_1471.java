package remapped;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class class_1471 implements Runnable, class_9786 {
   private final Object field_7899;
   private final Runnable field_7894;
   private final long field_7898;
   private final long field_7897;
   private ScheduledFuture<?> field_7893;
   private volatile Thread field_7896;

   private class_1471(class_8692 var1, Object var2, Runnable var3, long var4, long var6) {
      this.field_7892 = var1;
      this.field_7899 = var2;
      this.field_7894 = var3;
      this.field_7898 = var4;
      this.field_7897 = var6;
   }

   public void method_6801() {
      if (this.field_7897 != 0L) {
         this.field_7893 = class_8692.method_39917(this.field_7892).scheduleAtFixedRate(this, this.field_7898, this.field_7897, TimeUnit.MILLISECONDS);
      } else {
         this.field_7893 = class_8692.method_39917(this.field_7892).schedule(this, this.field_7898, TimeUnit.MILLISECONDS);
      }
   }

   @Override
   public Object method_45178() {
      return this.field_7899;
   }

   @Override
   public class_1560 method_45179() {
      if (this.field_7893 != null) {
         if (!this.field_7893.isCancelled()) {
            return !this.field_7893.isDone() ? class_1560.field_8222 : class_1560.field_8220;
         } else {
            return class_1560.field_8219;
         }
      } else {
         return class_1560.field_8222;
      }
   }

   @Override
   public void method_45180() {
      if (this.field_7893 != null) {
         this.field_7893.cancel(false);
         Thread var3 = this.field_7896;
         if (var3 != null) {
            var3.interrupt();
         }

         this.method_6800();
      }
   }

   @Override
   public void run() {
      class_8692.method_39918(this.field_7892).execute(() -> {
         this.field_7896 = Thread.currentThread();

         try {
            this.field_7894.run();
         } catch (Exception var7) {
            class_6609.method_30399().error("Exception in task {} by plugin {}", this.field_7894, this.field_7899, var7);
         } finally {
            this.field_7896 = null;
         }
      });
   }

   private void method_6800() {
      class_8692.method_39919(this.field_7892).remove(this.field_7899, this);
   }
}
