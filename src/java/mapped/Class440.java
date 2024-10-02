package mapped;

import net.minecraft.util.DefaultWithNameUncaughtExceptionHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class Class440 implements Runnable {
   private static final Logger field1980 = LogManager.getLogger();
   private static final AtomicInteger field1981 = new AtomicInteger(0);
   public volatile boolean field1982;
   public final String field1983;
   public Thread field1984;

   public Class440(String var1) {
      this.field1983 = var1;
   }

   public synchronized boolean method1867() {
      if (!this.field1982) {
         this.field1982 = true;
         this.field1984 = new Thread(this, this.field1983 + " #" + field1981.incrementAndGet());
         this.field1984.setUncaughtExceptionHandler(new DefaultWithNameUncaughtExceptionHandler(field1980));
         this.field1984.start();
         field1980.info("Thread {} started", this.field1983);
         return true;
      } else {
         return true;
      }
   }

   public synchronized void method1868() {
      this.field1982 = false;
      if (null != this.field1984) {
         int var3 = 0;

         while (this.field1984.isAlive()) {
            try {
               this.field1984.join(1000L);
               if (++var3 >= 5) {
                  field1980.warn("Waited {} seconds attempting force stop!", var3);
               } else if (this.field1984.isAlive()) {
                  field1980.warn("Thread {} ({}) failed to exit after {} second(s)", this, this.field1984.getState(), var3, new Exception("Stack:"));
                  this.field1984.interrupt();
               }
            } catch (InterruptedException var5) {
            }
         }

         field1980.info("Thread {} stopped", this.field1983);
         this.field1984 = null;
      }
   }

   public boolean method1869() {
      return this.field1982;
   }
}
