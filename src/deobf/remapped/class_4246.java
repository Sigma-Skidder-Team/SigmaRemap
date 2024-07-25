package remapped;

public class class_4246 extends Module {
   private int field_20590;
   private double field_20589;

   public class_4246() {
      super(Category.COMBAT, "Gomme", "AntiKB for GommeHD");
      this.addSetting(new FloatSetting<Float>("Delay", "Boost delay", 0.5F, Float.class, 0.0F, 1.0F, 0.01F));
      this.addSetting(new FloatSetting<Float>("Boost", "Boost strengh", 0.1F, Float.class, 0.05F, 0.25F, 0.01F));
   }

   @EventListen
   private void method_19787(class_717 var1) {
      this.field_20590 = 0;
   }

   @EventListen
   private void method_19788(class_7767 var1) {
      double var4 = this.field_20589 * (double)(1.0F - this.getFloatValueByName("Delay")) - this.field_20589 / 2.0;
      if (mcInstance.field_9632.field_41726 && this.field_20590 <= 0) {
      }

      if (this.field_20590 == 1 && var1.method_35236() < var4) {
         this.field_20590++;
         var1.method_35232(var1.method_35234() * 0.5);
         var1.method_35229(var1.method_35231() * 0.5);
      } else if (this.field_20590 == 2) {
         this.field_20590++;
         class_8865.method_40777(var1, (double)this.getFloatValueByName("Boost"));
      }
   }

   @EventListen
   private void method_19786(class_139 var1) {
      if (var1.method_557() instanceof class_4548) {
         class_4548 var4 = (class_4548)var1.method_557();
         if (var4.method_21093() == mcInstance.field_9632.method_37145()) {
            this.field_20590 = 1;
            this.field_20589 = (double)var4.method_21095() / 8000.0;
         }
      }
   }
}
