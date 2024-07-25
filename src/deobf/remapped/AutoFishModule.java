package remapped;

public class AutoFishModule extends Module {
   public AutoFishModule() {
      super(Category.WORLD, "AutoFish", "Automatically catches fish for you");
   }

   @EventListen
   public void method_5738(PacketEvent var1) {
      if (this.method_42015()) {
         if (var1.method_557() instanceof class_3740 || var1.method_557() instanceof class_8283) {
            if (client.thePlayer.method_26446() != null) {
               if (client.thePlayer.method_26446().method_27960() instanceof class_8411) {
                  if (!(var1.method_557() instanceof class_3740)) {
                     if (var1.method_557() instanceof class_8283 && !((class_8283)var1.method_557()).field_42460.equals("entity.bobber.splash")) {
                        return;
                     }
                  } else if (!((class_3740)var1.method_557()).method_17341().equals(SoundEvents.field_2403)) {
                     return;
                  }

                  client.method_8614().sendPacket(new class_1022(Hand.MAIN_HAND));
                  client.method_8614().sendPacket(new class_1022(Hand.MAIN_HAND));
                  SigmaMainClass.getInstance().getNotificationManager().pushNotification(new Notification("AutoFish", "We catched something!", NotificationIcons.doneicon));
               }
            }
         }
      }
   }
}
