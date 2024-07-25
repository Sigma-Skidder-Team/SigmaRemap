package remapped;

public class class_2778 extends Module {
   private double field_13568;

   public class_2778() {
      super(class_5664.field_28714, "Hover", "Hover criticals");
   }

   @Override
   public void method_42006() {
      this.field_13568 = 1.0E-11;
   }

   @class_9148
   public void method_12646(class_139 var1) {
      if (this.method_42015()) {
         class_6310 var4 = var1.method_557();
         if (var4 instanceof class_509) {
            this.field_13568 = 1.0E-11;
         }
      }
   }

   @class_9148
   @class_315
   private void method_12647(class_1393 var1) {
      if (this.method_42015() && var1.method_6449()) {
         boolean var4 = mcInstance.field_9587 != null && mcInstance.field_9587.method_33990() == class_1430.field_7717;
         boolean var5 = mcInstance.field_9647.method_42156() || mcInstance.field_9577.field_45530.method_27060() && var4;
         if (SigmaMainClass.method_3328().method_3310().method_25293() > 0 && !var5) {
            this.field_13568 -= 1.0E-14;
            if (this.field_13568 < 0.0 || class_4181.field_20352 == 0) {
               this.field_13568 = 1.0E-11;
            }

            var1.method_6444(true);
            var1.method_6455(var1.method_6454() + this.field_13568);
            var1.method_6451(false);
         } else {
            this.field_13568 = 1.0E-11;
         }
      }
   }
}
