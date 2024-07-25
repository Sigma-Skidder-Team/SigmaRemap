package remapped;

public final class class_8133 implements Runnable {
   private static String[] field_41662;

   public class_8133(long var1, long var3, class_1702 var5, double var6) {
      this.field_41661 = var1;
      this.field_41665 = var3;
      this.field_41664 = var5;
      this.field_41663 = var6;
   }

   @Override
   public void run() {
      for (long var3 = this.field_41661; var3 < this.field_41665; var3++) {
         this.field_41664.method_36114(var3, this.field_41664.method_36107(var3) * this.field_41663);
      }
   }
}
