package remapped;

public class SpartanClickTP extends Module {
   private int field_12052;
   private BlockPos field_12051;

   public SpartanClickTP() {
      super(Category.MOVEMENT, "Spartan", "ClickTP for spartan anticheat");
   }

   @Override
   public void onEnable() {
      this.field_12052 = -1;
      this.field_12051 = null;
   }

   @Override
   public void onDisable() {
      class_314.method_1408(-0.08);
      double var3 = class_8865.method_40775();
      class_8865.method_40776(var3);
      client.theTimer.timerSpeed = 1.0F;
   }

   @EventListen
   private void method_11040(class_8706 var1) {
      if (this.method_42015() && (client.thePlayer.method_37252() || !this.method_42017().getBooleanValueByName("Sneak"))) {
         if (var1.method_40004() == class_3237.field_16101) {
            class_9529 var4 = class_7494.method_34079(
               client.thePlayer.rotationYaw, client.thePlayer.rotationPitch, this.method_42017().getFloatValueByName("Maximum range")
            );
            BlockPos var5 = null;
            if (var4 != null) {
               var5 = var4.method_43955();
            }

            if (var5 == null) {
               return;
            }

            this.field_12051 = var5;
            client.method_8614()
               .method_4813(
                  new class_9515(
                     (double)this.field_12051.method_12173() + 0.5,
                     (double)(this.field_12051.method_12165() + 1),
                     (double)this.field_12051.method_12185() + 0.5,
                     true
                  )
               );
            this.field_12052 = 0;
         }
      }
   }

   @EventListen
   public void method_11042(PacketEvent var1) {
      if (this.method_42015()) {
         if (var1.method_557() instanceof class_509) {
            class_509 var4 = (class_509)var1.method_557();
            if (var4.field_3139 == (double)this.field_12051.method_12173() + 0.5
               && var4.field_3144 == (double)(this.field_12051.method_12165() + 1)
               && var4.field_3141 == (double)this.field_12051.method_12185() + 0.5) {
               SigmaMainClass.getInstance().getNotificationManager().pushNotification(new Notification("ClickTP", "Successfully teleported"));
               if (!this.method_42017().getBooleanValueByName("Auto Disable")) {
                  this.field_12052 = -1;
                  this.field_12051 = null;
                  class_314.method_1408(-0.08);
                  double var5 = class_8865.method_40775();
                  class_8865.method_40776(var5);
                  client.theTimer.timerSpeed = 1.0F;
               } else {
                  this.method_42017().method_41999();
               }
            }
         }
      }
   }

   @EventListen
   private void method_11041(class_7767 var1) {
      if (this.method_42015()) {
         if (this.field_12052 > -1 && this.field_12051 != null) {
            var1.method_35235(0.01);
            this.field_12052++;
            if (this.field_12052 >= 20) {
               client.theTimer.timerSpeed = 1.4F;
            } else {
               client.theTimer.timerSpeed = 2.0F;
            }

            client.method_8614()
               .method_4813(
                  new class_9515(client.thePlayer.method_37302(), client.thePlayer.method_37309(), client.thePlayer.method_37156(), true)
               );
            client.method_8614()
               .method_4813(
                  new class_9515(
                     (double)this.field_12051.method_12173() + 0.5,
                     (double)(this.field_12051.method_12165() + 1),
                     (double)this.field_12051.method_12185() + 0.5,
                     true
                  )
               );
         }
      }
   }
}
