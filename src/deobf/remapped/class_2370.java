package remapped;

import java.util.concurrent.locks.LockSupport;

public class class_2370 extends class_7582<Runnable> {
   private Thread field_11868 = this.method_10848();
   private volatile boolean field_11869;

   public class_2370() {
      super("Sound executor");
   }

   private Thread method_10848() {
      Thread var3 = new Thread(this::run);
      var3.setDaemon(true);
      var3.setName("Sound engine");
      var3.start();
      return var3;
   }

   @Override
   public Runnable method_34462(Runnable var1) {
      return var1;
   }

   @Override
   public boolean method_34463(Runnable var1) {
      return !this.field_11869;
   }

   @Override
   public Thread method_34460() {
      return this.field_11868;
   }

   private void run() {
      while (!this.field_11869) {
         this.method_34461(() -> this.field_11869);
      }
   }

   @Override
   public void method_34450() {
      LockSupport.park("waiting for tasks");
   }

   public void method_10847() {
      this.field_11869 = true;
      this.field_11868.interrupt();

      try {
         this.field_11868.join();
      } catch (InterruptedException var4) {
         Thread.currentThread().interrupt();
      }

      this.method_34459();
      this.field_11869 = false;
      this.field_11868 = this.method_10848();
   }
}
