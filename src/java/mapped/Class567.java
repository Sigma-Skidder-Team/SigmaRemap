package mapped;

public class Class567 implements Runnable {
   private static String[] field2756;
   private final int field2757;
   private final Runnable field2758;

   public Class567(int var1, Runnable var2) {
      this.field2757 = var1;
      this.field2758 = var2;
   }

   public int method1895() {
      return this.field2757;
   }

   @Override
   public void run() {
      this.field2758.run();
   }
}
