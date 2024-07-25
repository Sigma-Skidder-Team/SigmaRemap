package remapped;

import java.util.logging.Level;

public final class class_4126 implements Runnable {
   public class_4126(Runnable var1) {
      this.field_20091 = var1;
   }

   @Override
   public void run() {
      try {
         this.field_20091.run();
      } catch (Throwable var13) {
         class_8482.method_39079().log(Level.SEVERE, "Task threw exception", var13);
         throw var13;
      } finally {
         synchronized (class_8482.class) {
            class_8482.method_39083();
            if (class_8482.method_39077() == 0) {
               class_8482.method_39075().shutdown();
               class_8482.method_39078(null);
               class_8482.method_39082(null);
            }
         }
      }
   }
}
