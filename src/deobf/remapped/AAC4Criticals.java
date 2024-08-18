package remapped;

public class AAC4Criticals extends Module {
   private static int field_18992;

   public AAC4Criticals() {
      super(Category.COMBAT, "AAC 4", "Criticals for aac 4.*");
      this.addSetting(new BooleanSetting("KillAura", "Criticals only if KillAura is enabled", false));
   }

   @Override
   public void onEnable() {
      field_18992 = 0;
   }

   @EventListen
   @class_7664
   private void method_18089(class_8544 var1) {
      if (this.isEnabled() && !(var1.method_39326() < 0.625)) {
         field_18992 = 0;
      }
   }

   @EventListen
   private void method_18090(class_2911 var1) {
      if (field_18992 == 2) {
         var1.method_29715(true);
      }
   }

   @EventListen
   @class_315
   private void method_18092(class_1393 var1) {
      if (!this.isEnabled() || SigmaMainClass.getInstance().getModuleManager().getModuleByClass(SpeedModule.class).isEnabled()) {
         field_18992 = 0;
      } else if (var1.method_6449()) {
         if (client.playerController.method_42156()) {
            field_18992 = 0;
         }

         boolean var4 = !this.getBooleanValueByName("KillAura") || KillauraModule.field_12558 != null || KillauraModule.field_12556 != null;
         if (client.thePlayer.onGround && client.thePlayer.collidedVertically && var4) {
            field_18992++;
            client.thePlayer.lastReportedPosY = 0.0;
            if (field_18992 != 2) {
               if (field_18992 >= 3) {
                  double var5 = 0.001;
                  var1.method_6455(var1.method_6454() + var5);
                  var1.method_6451(false);
               }
            } else {
               var1.method_6455(var1.method_6454() + 0.00101);
               var1.method_6451(false);
            }
         } else {
            field_18992 = 0;
         }
      }
   }

   public static boolean method_18091() {
      return field_18992 == 2;
   }
}
