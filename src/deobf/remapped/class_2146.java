package remapped;

public class class_2146 implements Runnable {
   private static String[] field_10740;

   public class_2146(AutoFarmModule var1, int var2, float[] var3) {
      this.field_10743 = var1;
      this.field_10741 = var2;
      this.field_10742 = var3;
   }

   @Override
   public void run() {
      AutoFarmModule.method_21408().method_8614().method_4813(new class_7371(this.field_10741));
      AutoFarmModule.method_21404()
         .method_8614()
         .method_4813(new class_8585(Hand.MAIN_HAND, class_7494.method_34079(this.field_10742[0], this.field_10742[1], 4.5F)));
      AutoFarmModule.method_21419().method_8614().method_4813(new class_3195(Hand.MAIN_HAND));
      AutoFarmModule.method_21412().method_8614().method_4813(new class_7371(AutoFarmModule.method_21417().field_9632.field_3853.field_36404));
   }
}
