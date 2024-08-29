package mapped;

import java.util.concurrent.locks.LockSupport;

public class Class319 extends Class318<Runnable> {
   private Thread field1381 = this.method1643();
   private volatile boolean field1382;

   public Class319() {
      super("Sound executor");
   }

   private Thread method1643() {
      Thread var3 = new Thread(this::run);
      var3.setDaemon(true);
      var3.setName("Sound engine");
      var3.start();
      return var3;
   }

   @Override
   public Runnable wrapTask(Runnable var1) {
      return var1;
   }

   @Override
   public boolean canRun(Runnable var1) {
      return !this.field1382;
   }

   @Override
   public Thread getExecutionThread() {
      return this.field1381;
   }

   private void run() {
      while (!this.field1382) {
         this.driveUntil(() -> this.field1382);
      }
   }

   @Override
   public void method1640() {
      LockSupport.park("waiting for tasks");
   }

   public void method1644() {
      this.field1382 = true;
      this.field1381.interrupt();

      try {
         this.field1381.join();
      } catch (InterruptedException var4) {
         Thread.currentThread().interrupt();
      }

      this.dropTasks();
      this.field1382 = false;
      this.field1381 = this.method1643();
   }
}
