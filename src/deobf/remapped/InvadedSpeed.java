package remapped;

public class InvadedSpeed extends Module {
   private int field_30487;

   public InvadedSpeed() {
      super(Category.MOVEMENT, "Invaded", "Speed for Invadedlands");
      this.addSetting(new FloatSetting<Float>("Speed", "Speed value", 3.0F, Float.class, 0.5F, 9.5F, 0.1F));
   }

   @Override
   public void onEnable() {
   }

   @Override
   public void onDisable() {
      class_8865.method_40776(0.28F);
      mc.field_9616.field_32603 = 1.0F;
   }

   @EventListen
   public void method_27293(class_7767 var1) {
      if (this.method_42015()) {
         this.field_30487++;
         if (this.field_30487 != 1) {
            if (this.field_30487 != 2) {
               if (this.field_30487 >= 3) {
                  this.field_30487 = 0;
                  mc.field_9616.field_32603 = 0.25F;
                  class_8865.method_40777(var1, (double)this.getFloatValueByName("Speed"));
               }
            } else {
               mc.field_9616.field_32603 = 2.0F;
               class_8865.method_40777(var1, class_8865.method_40775() + 0.05);
            }
         } else {
            mc.field_9616.field_32603 = 2.0F;
            class_8865.method_40777(var1, class_8865.method_40775() + 0.05);
         }
      }
   }
}