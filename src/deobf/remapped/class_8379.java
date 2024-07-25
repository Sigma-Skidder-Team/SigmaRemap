package remapped;

import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class class_8379 implements Runnable {
   private static final Logger field_42881 = LogManager.getLogger();
   private static final AtomicInteger field_42879 = new AtomicInteger(0);
   public volatile boolean field_42882;
   public final String field_42880;
   public Thread field_42878;

   public class_8379(String var1) {
      this.field_42880 = var1;
   }

   public synchronized boolean method_38624() {
      if (!this.field_42882) {
         this.field_42882 = true;
         this.field_42878 = new Thread(this, this.field_42880 + " #" + field_42879.incrementAndGet());
         this.field_42878.setUncaughtExceptionHandler(new class_5416(field_42881));
         this.field_42878.start();
         field_42881.info("Thread {} started", this.field_42880);
         return true;
      } else {
         return true;
      }
   }

   public synchronized void method_38623() {
      this.field_42882 = false;
      if (null != this.field_42878) {
         int var3 = 0;

         while (this.field_42878.isAlive()) {
            try {
               this.field_42878.join(1000L);
               if (++var3 >= 5) {
                  field_42881.warn("Waited {} seconds attempting force stop!", var3);
               } else if (this.field_42878.isAlive()) {
                  field_42881.warn("Thread {} ({}) failed to exit after {} second(s)", this, this.field_42878.getState(), var3, new Exception("Stack:"));
                  this.field_42878.interrupt();
               }
            } catch (InterruptedException var5) {
            }
         }

         field_42881.info("Thread {} stopped", this.field_42880);
         this.field_42878 = null;
      }
   }

   public boolean method_38621() {
      return this.field_42882;
   }
}
