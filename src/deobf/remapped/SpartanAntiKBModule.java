package remapped;

public class SpartanAntiKBModule extends Module {
   private int field_49568;

   public SpartanAntiKBModule() {
      super(Category.COMBAT, "Spartan", "AntiKB for spartan antichet");
      this.addSetting(new FloatSetting<Float>("Ticks", "Ticks delay", 1.0F, Float.class, 1.0F, 6.0F, 1.0F));
   }

   @EventListen
   private void method_45041(class_5596 var1) {
      if (this.method_42015()) {
         if (this.field_49568 < 10) {
            this.field_49568++;
            if (this.field_49568 == (int)this.getFloatValueByName("Ticks")) {
               class_8865.method_40776(0.0);
            }
         }
      }
   }

   @EventListen
   private void method_45040(class_139 var1) {
      if (this.method_42015()) {
         if (mc.field_9632 != null && var1.method_557() instanceof class_4548) {
            class_4548 var4 = (class_4548)var1.method_557();
            if (var4.method_21093() == mc.field_9632.method_37145()) {
               this.field_49568 = 0;
            }
         }
      }
   }
}
