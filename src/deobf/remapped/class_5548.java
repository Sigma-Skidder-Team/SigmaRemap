package remapped;

public abstract class class_5548 implements Runnable {
   public final String field_28259;

   public class_5548(String var1, Object... var2) {
      this.field_28259 = class_8515.method_39218(var1, var2);
   }

   @Override
   public final void run() {
      String var3 = Thread.currentThread().getName();
      Thread.currentThread().setName(this.field_28259);

      try {
         this.method_25227();
      } finally {
         Thread.currentThread().setName(var3);
      }
   }

   public abstract void method_25227();
}
