package remapped;

public class MineMenCriticalsModule extends Module {
   private int field_28365;

   public MineMenCriticalsModule() {
      super(Category.COMBAT, "Minemen", "Criticals for Anti Gaming Chair");
   }

   @Override
   public void onEnable() {
      this.field_28365 = 0;
   }

   @EventListen
   @class_315
   private void method_25379(class_1393 var1) {
      if (var1.method_6449()) {
         SecondModule var4 = (SecondModule) SigmaMainClass.getInstance().getModuleManager().getModuleByClass(AntiKnockbackModule.class);
         if (!var4.method_42015() || !var4.getStringValueByName("Type").equalsIgnoreCase("Minemen")) {
            if (!client.thePlayer.onGround) {
               this.field_28365 = 0;
            } else {
               if (this.field_28365 > 0) {
                  if (this.field_28365 % 2 != 0) {
                     var1.method_6455(var1.method_6454() - 1.0E-14);
                  }

                  var1.method_6451(false);
               }

               this.field_28365++;
               var1.method_6444(true);
            }

            if (client.playerController.method_42156() && client.thePlayer.onGround) {
               this.field_28365 = 0;
               var1.method_6455(client.thePlayer.method_37309());
               var1.method_6451(true);
            }
         }
      }
   }
}
