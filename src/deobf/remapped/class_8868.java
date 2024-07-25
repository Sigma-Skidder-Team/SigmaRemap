package remapped;

public class class_8868 implements Runnable {
   private static String[] field_45340;

   public class_8868(class_9035 var1, int var2, int var3, double[][] var4, boolean var5) {
      this.field_45336 = var1;
      this.field_45335 = var2;
      this.field_45339 = var3;
      this.field_45338 = var4;
      this.field_45337 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_45335; var3 < this.field_45339; var3++) {
         class_9035.method_41463(this.field_45336).method_14991(this.field_45338[var3], 0, this.field_45337);
      }
   }
}
