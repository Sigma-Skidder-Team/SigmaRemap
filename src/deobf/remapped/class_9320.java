package remapped;

public class class_9320 implements Runnable {
   private static String[] field_47597;
   private final int field_47596;
   private final Runnable field_47598;

   public class_9320(int var1, Runnable var2) {
      this.field_47596 = var1;
      this.field_47598 = var2;
   }

   public int method_43022() {
      return this.field_47596;
   }

   @Override
   public void run() {
      this.field_47598.run();
   }
}
