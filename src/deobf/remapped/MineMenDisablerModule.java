package remapped;

public class MineMenDisablerModule extends Module {
   private boolean field_39769 = false;
   private boolean field_39768;

   public MineMenDisablerModule() {
      super(Category.COMBAT, "Minemen", "Minemen Club bypass");
   }

   @Override
   public void onEnable() {
      this.field_39769 = false;
      this.field_39768 = true;
   }

   @EventListen
   public void method_35496(class_1393 var1) {
      if (var1.method_6449()) {
         if (class_314.method_1413(mc.field_9632, 1.0E-5F)) {
            this.field_39769 = true;
            var1.method_6455(var1.method_6454() - 5.0E-7);
            var1.method_6451(false);
         } else {
            if (this.field_39769 && mc.field_9632.method_37098().field_7333 < 0.0) {
               this.field_39769 = false;
               var1.method_6451(true);
            }
         }
      }
   }

   @EventListen
   public void method_35498(class_7767 var1) {
      if (this.field_39768) {
         if (!mc.field_9632.field_41726) {
            if (mc.field_9632.field_41706 > 1.0F) {
               this.field_39768 = false;
            }
         } else {
            var1.method_35235(class_8865.method_40786());
            this.field_39768 = false;
         }
      }

      class_314.method_1408(var1.method_35236());
   }

   @EventListen
   private void method_35497(PacketEvent var1) {
      if (mc.field_9632 != null && var1.method_557() instanceof class_4548) {
         class_4548 var5 = (class_4548)var1.method_557();
         if (var5.method_21093() == mc.field_9632.method_37145() && var5.field_22168 < 0 && mc.field_9632.field_41726) {
            var1.method_29715(true);
         }
      } else if (var1.method_557() instanceof class_509) {
         class_509 var4 = (class_509)var1.method_557();
         this.field_39768 = true;
      }
   }
}
