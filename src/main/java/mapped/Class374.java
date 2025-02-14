package mapped;

public final class Class374 extends Thread {
   private static String[] field1627;
   public final DedicatedServer field1628;

   public Class374(String var1, DedicatedServer var2) {
      super(var1);
      this.field1628 = var2;
   }

   @Override
   public void run() {
      this.field1628.initiateShutdown(true);
   }
}
