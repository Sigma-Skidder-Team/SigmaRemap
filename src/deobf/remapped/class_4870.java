package remapped;

public class class_4870 implements Runnable {
   private static String[] field_24235;

   public class_4870(class_9035 var1, int var2, int var3, int var4, int var5, double[] var6, boolean var7) {
      this.field_24238 = var1;
      this.field_24242 = var2;
      this.field_24240 = var3;
      this.field_24236 = var4;
      this.field_24239 = var5;
      this.field_24237 = var6;
      this.field_24241 = var7;
   }

   @Override
   public void run() {
      if (this.field_24242 != 0) {
         if (this.field_24240 != 1) {
            for (int var3 = this.field_24236; var3 < class_9035.method_41470(this.field_24238); var3 += this.field_24239) {
               class_9035.method_41463(this.field_24238).method_14991(this.field_24237, var3 * class_9035.method_41431(this.field_24238), this.field_24241);
            }
         } else {
            for (int var4 = this.field_24236; var4 < class_9035.method_41470(this.field_24238); var4 += this.field_24239) {
               class_9035.method_41463(this.field_24238).method_15045(this.field_24237, var4 * class_9035.method_41431(this.field_24238));
            }
         }
      } else if (this.field_24240 != -1) {
         for (int var5 = this.field_24236; var5 < class_9035.method_41470(this.field_24238); var5 += this.field_24239) {
            class_9035.method_41463(this.field_24238).method_15035(this.field_24237, var5 * class_9035.method_41431(this.field_24238), this.field_24241);
         }
      } else {
         for (int var6 = this.field_24236; var6 < class_9035.method_41470(this.field_24238); var6 += this.field_24239) {
            class_9035.method_41463(this.field_24238).method_15029(this.field_24237, var6 * class_9035.method_41431(this.field_24238));
         }
      }
   }
}
