package remapped;

import java.nio.ByteBuffer;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class class_2788 extends Thread {
   private BlockingQueue<class_5913> field_13689;

   public class_2788(class_2264 var1) {
      this.field_13690 = var1;
      this.field_13689 = new LinkedBlockingQueue<class_5913>();
      this.setName("WebSocketWorker-" + this.getId());
      this.setUncaughtExceptionHandler(new class_6243(this, var1));
   }

   public void method_12671(class_5913 var1) throws InterruptedException {
      this.field_13689.put(var1);
   }

   @Override
   public void run() {
      class_5913 var3 = null;

      try {
         while (true) {
            var3 = this.field_13689.take();
            ByteBuffer var4 = var3.field_30013.poll();
            if (!field_13692 && var4 == null) {
               throw new AssertionError();
            }

            this.method_12672(var3, var4);
            var3 = null;
         }
      } catch (InterruptedException var5) {
         Thread.currentThread().interrupt();
      } catch (RuntimeException var6) {
         class_2264.method_10445(this.field_13690, var3, var6);
      }
   }

   private void method_12672(class_5913 var1, ByteBuffer var2) throws InterruptedException {
      try {
         var1.method_27039(var2);
      } catch (Exception var9) {
         var9.printStackTrace();
      } finally {
         class_2264.method_10444(this.field_13690, var2);
      }
   }
}
