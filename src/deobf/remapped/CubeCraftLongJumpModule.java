package remapped;

public class CubeCraftLongJumpModule extends Module {
   private int field_45277;
   private double field_45278;

   public CubeCraftLongJumpModule() {
      super(Category.MOVEMENT, "Cubecraft", "Longjump for Cubecraft.");
      this.addSetting(new FloatSetting<Float>("Boost", "Longjump boost", 3.0F, Float.class, 1.0F, 5.0F, 0.01F));
   }

   @Override
   public void method_42020() {
      class_8865.method_40776(class_8865.method_40775() * 0.8);
      mcInstance.field_9616.field_32603 = 1.0F;
   }

   @Override
   public void method_42006() {
      this.field_45277 = -1;
      mcInstance.field_9616.field_32603 = 0.3F;
   }

   @class_9148
   public void method_40742(class_5596 var1) {
      if (this.method_42015() && mcInstance.field_9632 != null) {
         if (!class_314.method_1413(mcInstance.field_9632, 0.001F)) {
            this.field_45277++;
            this.field_45278 -= 0.005;
            if (this.field_45278 < 0.26 || this.field_45277 > 6) {
               this.field_45278 = 0.26;
            }

            class_8865.method_40776(this.field_45278);
            if (this.field_45277 > 5) {
               this.method_42017().method_41999();
            }
         } else {
            if (this.field_45277 > 0) {
               class_8865.method_40776(0.0);
               this.method_42017().method_41999();
               this.field_45277 = 0;
            }

            double var4 = mcInstance.field_9632.method_37302();
            double var6 = mcInstance.field_9632.method_37309();
            double var8 = mcInstance.field_9632.method_37156();
            int var10 = 49 + class_8865.method_40769() * 17;

            for (int var11 = 0; var11 < var10; var11++) {
               mcInstance.method_8614().method_4813(new class_9515(var4, var6 + 0.06248, var8, false));
               mcInstance.method_8614().method_4813(new class_9515(var4, var6, var8, false));
            }

            mcInstance.method_8614().method_4813(new class_9515(var4, var6, var8, true));
            class_314.method_1408(class_8865.method_40786());
            this.field_45277 = 0;
            this.field_45278 = (double)(this.method_42002("Boost") / 2.0F);
            class_8865.method_40776(this.field_45278);
         }
      }
   }
}
