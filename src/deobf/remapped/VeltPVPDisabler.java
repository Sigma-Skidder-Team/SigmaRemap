package remapped;

public class VeltPVPDisabler extends Module {
   private int field_9020;

   public VeltPVPDisabler() {
      super(Category.EXPLOIT, "VeltPvP", "Disabler for VeltPvP.");
   }

   @Override
   public void onEnable() {
      this.field_9020 = 0;
   }

   @EventListen
   public void method_7848(class_1393 var1) {
      if (this.method_42015() && mc.field_9632 != null && var1.method_6449()) {
         this.field_9020++;
         double var4 = -0.1;
         if (this.field_9020 >= 20) {
            this.field_9020 = 0;
            var1.method_6455(var4);
            var1.method_6451(false);
         }
      }
   }

   @EventListen
   public void method_7847(class_139 var1) {
      if (!this.method_42015()) {
         ;
      }
   }
}
