package remapped;

public final class class_3868 implements Runnable {
   private static String[] field_18847;

   public class_3868(long var1, long var3, class_9245 var5, long var6, class_9245 var8, long var9) {
      this.field_18850 = var1;
      this.field_18851 = var3;
      this.field_18846 = var5;
      this.field_18852 = var6;
      this.field_18848 = var8;
      this.field_18849 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field_18850; var3 < this.field_18851; var3++) {
         this.field_18846.method_42612(this.field_18852 + var3, this.field_18848.method_42617(this.field_18849 + var3));
      }
   }
}
