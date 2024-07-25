package remapped;

public class class_6490 implements Runnable {
   private static String[] field_33064;

   public class_6490(AutoFarmModule var1, class_1331 var2) {
      this.field_33065 = var1;
      this.field_33063 = var2;
   }

   @Override
   public void run() {
      AutoFarmModule.method_21406().method_8614().method_4813(new class_1586(class_7500.field_38263, this.field_33063, Direction.field_817));
      AutoFarmModule.method_21416().method_8614().method_4813(new class_1586(class_7500.field_38258, this.field_33063, Direction.field_817));
      AutoFarmModule.method_21405().method_8614().method_4813(new class_3195(class_2584.field_12791));
   }
}
