package mapped;

public final class RunnableWithPriority implements Runnable {
   private final int field2350;
   private final Runnable field2351;

   public RunnableWithPriority(int var1, Runnable var2) {
      this.field2350 = var1;
      this.field2351 = var2;
   }

   @Override
   public void run() {
      this.field2351.run();
   }

   public int method1889() {
      return this.field2350;
   }
}
