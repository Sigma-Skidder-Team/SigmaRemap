package remapped;

public class class_2146 implements Runnable {
   private static String[] field_10740;

   public class_2146(class_4624 var1, int var2, float[] var3) {
      this.field_10743 = var1;
      this.field_10741 = var2;
      this.field_10742 = var3;
   }

   @Override
   public void run() {
      class_4624.method_21408().method_8614().method_4813(new class_7371(this.field_10741));
      class_4624.method_21404()
         .method_8614()
         .method_4813(new class_8585(class_2584.field_12791, class_7494.method_34079(this.field_10742[0], this.field_10742[1], 4.5F)));
      class_4624.method_21419().method_8614().method_4813(new class_3195(class_2584.field_12791));
      class_4624.method_21412().method_8614().method_4813(new class_7371(class_4624.method_21417().field_9632.field_3853.field_36404));
   }
}
