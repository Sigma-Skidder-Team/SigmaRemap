package remapped;

public class class_1213 extends class_3620 {
   public class_1213() {
      super(class_5664.field_28716, "LongJump", "Makes you jump far away", new class_583(), new class_8857(), new class_4452(), new class_4211());
      this.addSetting(new BooleanSetting("Auto Disable", "Disable Longjump when landing", true));
      this.addSetting(new BooleanSetting("BorderJump", "Jumps when you are close to a border", true));
      this.addSetting(new BooleanSetting("Auto Jump", "Automatically jumps when you can", true));
   }

   public double method_5380(int var1) {
      double[] var4 = new double[]{0.345, 0.2699, 0.183, 0.103, 0.024, -0.008, -0.04, -0.072, -0.104, -0.13, -0.019, -0.097};
      double[] var5 = new double[]{0.345, 0.2699, 0.183, 0.103, 0.024, -0.008, -0.04, -0.072, -0.14, -0.17, -0.019, -0.13};
      var1--;
      if (var1 < 0 || var1 >= var4.length) {
         return mcInstance.field_9632.method_37098().field_7333;
      } else {
         return class_314.method_1434() && !mcInstance.field_9632.field_41744 ? var4[var1] : var5[var1];
      }
   }

   public double method_5381(int var1) {
      double[] var4 = new double[]{
         0.423,
         0.35,
         0.28,
         0.217,
         0.15,
         0.025,
         -0.00625,
         -0.038,
         -0.0693,
         -0.102,
         -0.13,
         -0.018,
         -0.1,
         -0.117,
         -0.14532,
         -0.1334,
         -0.1581,
         -0.183141,
         -0.170695,
         -0.195653,
         -0.221,
         -0.209,
         -0.233,
         -0.25767,
         -0.314917,
         -0.371019,
         -0.426
      };
      var1--;
      return var1 >= 0 && var1 < var4.length ? var4[var1] : mcInstance.field_9632.method_37098().field_7333;
   }
}
