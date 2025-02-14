package mapped;

public abstract class Class1555 implements Runnable {
   public final String field8438;

   public Class1555(String var1, Object... var2) {
      this.field8438 = Class9474.method36559(var1, var2);
   }

   @Override
   public final void run() {
      String var3 = Thread.currentThread().getName();
      Thread.currentThread().setName(this.field8438);

      try {
         this.method6472();
      } finally {
         Thread.currentThread().setName(var3);
      }
   }

   public abstract void method6472();
}
