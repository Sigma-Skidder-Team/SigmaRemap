package remapped;

public class class_113 implements Runnable {
   private static String[] field_279;

   public class_113(AutoFarmModule var1, float[] var2) {
      this.field_281 = var1;
      this.field_280 = var2;
   }

   @Override
   public void run() {
      AutoFarmModule.method_21403()
         .method_8614()
         .method_4813(new class_8585(class_2584.field_12791, class_7494.method_34079(this.field_280[0], this.field_280[1], 4.5F)));
      AutoFarmModule.method_21409().method_8614().method_4813(new class_3195(class_2584.field_12791));
   }
}
