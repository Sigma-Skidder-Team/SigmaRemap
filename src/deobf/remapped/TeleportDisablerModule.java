package remapped;

public class TeleportDisablerModule extends Module {
   private int field_33210;

   public TeleportDisablerModule() {
      super(Category.EXPLOIT, "TP", "Disabler working on some anticheats.");
      this.addSetting(new FloatSetting<Float>("Delay", "Tp delay.", 20.0F, Float.class, 5.0F, 40.0F, 1.0F));
      this.addSetting(new ModeSetting("Mode", "Mode", 0, "Basic1", "Basic2", "MinInfinity", "MaxInfinity", "MinValue", "MaxValue"));
      this.addSetting(new BooleanSetting("OnGround", "Send on ground packets.", false));
      this.addSetting(new BooleanSetting("More Packets", "Send more packets.", false));
      this.addSetting(new BooleanSetting("Ping spoof", "Spoof your ping.", false));
   }

   @Override
   public void method_42006() {
      this.field_33210 = 0;
   }

   @EventListen
   public void method_29713(class_1393 var1) {
      if (this.method_42015() && mcInstance.field_9632 != null && var1.method_6449() && mcInstance.method_8530() != null) {
         this.field_33210++;
         double var4 = -4.503599627370497E15;
         String var6 = this.getStringValueByName("Mode");
         switch (var6) {
            case "Basic1":
               var4 = mcInstance.field_9632.method_37309() - 20.0;
               break;
            case "Basic2":
               var4 = mcInstance.field_9632.method_37309() - 1000.0 + Math.random() * 1000.0;
               break;
            case "MinInfinity":
               var4 = Double.NEGATIVE_INFINITY;
               break;
            case "MaxInfinity":
               var4 = Double.POSITIVE_INFINITY;
               break;
            case "MinValue":
               var4 = Double.MIN_VALUE;
               break;
            case "MaxValue":
               var4 = Double.MAX_VALUE;
         }

         if ((float)this.field_33210 >= this.getFloatValueByName("Delay")) {
            this.field_33210 = 0;
            boolean var8 = this.method_42007("OnGround");
            if (this.method_42007("More Packets")) {
               mcInstance.method_8614().method_4813(new class_9515(mcInstance.field_9632.method_37302(), var4, mcInstance.field_9632.method_37302(), var8));
            } else {
               var1.method_6455(var4);
               var1.method_6451(var8);
            }
         }
      }
   }
}
