package remapped;

public class class_5647 extends Module {
   private int field_28624;

   public class_5647() {
      super(class_5664.field_28716, "ViperMC", "ViperMC speed");
   }

   @Override
   public void method_42006() {
      this.field_28624 = 1;
   }

   @Override
   public void method_42020() {
      class_8865.method_40776(0.28F);
      field_46692.field_9616.field_32603 = 1.0F;
   }

   @class_9148
   public void method_25561(class_7767 var1) {
      if (this.method_42015()) {
         this.field_28624++;
         float var4 = 0.28F + (float)class_8865.method_40770() * 0.05F;
         if (this.field_28624 >= 4) {
            this.field_28624 = 0;
            var4 = 1.15F + (float)class_8865.method_40770() * 0.04F;
         }

         if (field_46692.field_9577.field_45434.field_30024) {
            var4 /= 1.3F;
         }

         class_8865.method_40777(var1, (double)var4);
      }
   }
}
