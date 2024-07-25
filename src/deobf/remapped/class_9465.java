package remapped;

public final class class_9465 implements Runnable {
   private static String[] field_48283;
   private final int field_48281;
   private final Runnable field_48282;

   public class_9465(int var1, Runnable var2) {
      this.field_48281 = var1;
      this.field_48282 = var2;
   }

   @Override
   public void run() {
      this.field_48282.run();
   }

   public int method_43740() {
      return this.field_48281;
   }
}
