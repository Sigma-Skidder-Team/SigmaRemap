package mapped;

import java.nio.ByteBuffer;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Class359 extends Thread {
   private BlockingQueue<Class346> field1591;
   public static final boolean field1592 = !Class340.class.desiredAssertionStatus();
   public final Class340 field1593;

   public Class359(Class340 var1) {
      this.field1593 = var1;
      this.field1591 = new LinkedBlockingQueue<Class346>();
      this.setName("WebSocketWorker-" + this.getId());
      this.setUncaughtExceptionHandler(new Class6032(this, var1));
   }

   public void method1823(Class346 var1) throws InterruptedException {
      this.field1591.put(var1);
   }

   @Override
   public void run() {
      Class346 var3 = null;

      try {
         while (true) {
            var3 = this.field1591.take();
            ByteBuffer var4 = var3.field1522.poll();
            if (!field1592 && var4 == null) {
               throw new AssertionError();
            }

            this.method1824(var3, var4);
            var3 = null;
         }
      } catch (InterruptedException var5) {
         Thread.currentThread().interrupt();
      } catch (RuntimeException var6) {
         Class340.method1713(this.field1593, var3, var6);
      }
   }

   private void method1824(Class346 var1, ByteBuffer var2) throws InterruptedException {
      try {
         var1.method1787(var2);
      } catch (Exception var9) {
         var9.printStackTrace();
      } finally {
         Class340.method1714(this.field1593, var2);
      }
   }
}
