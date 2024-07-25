package remapped;

public class class_7318 extends Module {
   private double field_37414;
   private float field_37407;
   private float field_37408;
   private boolean field_37413;
   private float field_37410;
   private float field_37409 = 1.0F;
   public int field_37411 = 0;

   public class_7318() {
      super(class_5664.field_28716, "TestSpeed", "Legit Sprint jumping.");
      this.addSetting(new BooleanSetting("Sprint", "Sprints when walking", true));
      this.addSetting(new BooleanSetting("AutoJump", "Automatically jumps for you.", true));
   }

   @class_9148
   public void method_33363(class_1393 var1) {
      if (this.method_42015() && mcInstance.field_9632 != null && !SigmaMainClass.method_3328().method_3298().method_847(class_2368.class).method_42015()) {
         if (mcInstance.field_9632.field_41726 && var1.method_6449()) {
            var1.method_6455(var1.method_6454() + 1.0E-14);
         }
      }
   }

   @class_9148
   public void method_33366(class_7767 var1) {
      if (this.method_42015()) {
         if (mcInstance.field_9632.field_41726
            && mcInstance.field_9632.field_41774
            && (mcInstance.field_9632.field_29673 != 0.0F || mcInstance.field_9632.field_29676 != 0.0F)
            && this.method_42007("AutoJump")) {
            mcInstance.field_9632.method_26595();
            var1.method_35232(mcInstance.field_9632.method_37098().field_7336);
            var1.method_35235(mcInstance.field_9632.method_37098().field_7333);
            var1.method_35229(mcInstance.field_9632.method_37098().field_7334);
         }

         double var4 = var1.method_35233().field_7333;
         var1.method_35233().field_7333 = 0.0;
         double var6 = var1.method_35233().method_6217();
         var1.method_35233().field_7333 = var4;
         this.field_37410 = class_8865.method_40780(var1, var6, class_8865.method_40787()[0], this.field_37410, 45.0F);
         if (this.field_37407 != 0.0F || this.field_37408 != 0.0F) {
            this.field_37407 = (float)((double)this.field_37407 * 0.85);
            this.field_37408 = (float)((double)this.field_37408 * 0.85);
            this.field_37409 = Math.min(1.0F, this.field_37409 + 0.1F);
         }

         if (mcInstance.field_9632.field_41726 && !this.field_37413) {
            this.field_37407 = 0.0F;
            this.field_37408 = 0.0F;
            this.field_37409 = Math.min(1.0F, this.field_37409 + 0.33F);
         }

         this.field_37413 = false;
         this.field_37411++;
      }
   }

   @class_9148
   @class_7664
   public void method_33364(class_2911 var1) {
      if (this.method_42015() && !class_7033.method_32081() && !SigmaMainClass.method_3328().method_3298().method_847(class_2368.class).method_42015()) {
         if (!mcInstance.field_9577.field_45450.method_27060() || !SigmaMainClass.method_3328().method_3298().method_847(class_3709.class).method_42015()) {
            this.field_37410 = class_8865.method_40787()[0];
            this.field_37411 = 0;
            var1.method_13315(var1.method_13317().method_6217() * 1.05F);
         }
      }
   }

   @class_9148
   private void method_33365(class_139 var1) {
      if (this.method_42015()) {
         if (mcInstance.field_9632 != null && var1.method_557() instanceof class_4548) {
            class_4548 var4 = (class_4548)var1.method_557();
            if (var4.method_21093() != mcInstance.field_9632.method_37145()) {
            }
         }
      }
   }
}
